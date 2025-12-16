#!/usr/bin/env python3
"""
ADIF API Authenticator - Replica of the Original System

This module is a faithful replica of the HMAC-SHA256 authentication algorithm
used by the ADIF API (El Cano Movil), obtained through reverse engineering
of the original source code in ElcanoAuth.java.

The algorithm follows the AWS Signature Version 4 pattern with ADIF-specific
characteristics:
- Cascading key derivation (date_key -> client_key -> signature_key)
- NON-alphabetical canonical headers order (critical for functionality)
- Timestamp in ISO 8601 format with UTC timezone

Original Source:
    apk_decompiled/sources/com/adif/elcanomovil/serviceNetworking/interceptors/auth/ElcanoAuth.java

Usage:
    auth = AdifAuthenticator(access_key="YOUR_KEY", secret_key="YOUR_KEY")
    headers = auth.get_auth_headers("POST", url, payload={...})
    response = requests.post(url, json=payload, headers=headers)
"""

from __future__ import annotations

import hashlib
import hmac
import json
import uuid
from datetime import datetime
from typing import Any, Dict, Optional, Tuple, Union
from urllib.parse import urlparse


class AdifAuthenticator:
    """
    Implements the ADIF HMAC-SHA256 authentication algorithm.
    The flow mirrors AWS Signature Version 4 with ADIF-specific header ordering.
    """

    # Static User-keys (different from HMAC keys)
    USER_KEY_CIRCULATION: str = "f4ce9fbfa9d721e39b8984805901b5df"
    USER_KEY_STATIONS: str = "0d021447a2fd2ac64553674d5a0c1a6f"

    def __init__(self, access_key: str, secret_key: str) -> None:
        """
        Initialize the authenticator with HMAC keys extracted from libapi-keys.so.
        """
        self.access_key: str = access_key
        self.secret_key: str = secret_key

    def get_timestamp(self, date: Optional[datetime] = None) -> str:
        """
        Generate a timestamp in compact ISO 8601 UTC format (yyyyMMddTHHmmssZ).
        """
        if date is None:
            date = datetime.utcnow()
        return date.strftime("%Y%m%dT%H%M%SZ")

    def get_date(self, date: Optional[datetime] = None) -> str:
        """
        Generate a compact date string (yyyyMMdd).
        """
        if date is None:
            date = datetime.utcnow()
        return date.strftime("%Y%m%d")

    def format_payload(self, payload: Optional[Union[Dict[str, Any], str]]) -> str:
        """
        Serialize the JSON payload removing spaces and line breaks, matching
        the behavior in `ElcanoAuth.java` (lines 86-91).
        """
        if payload is None:
            return ""

        if isinstance(payload, dict):
            payload = json.dumps(payload, separators=(",", ":"))

        cleaned_payload = payload.replace("\r", "").replace("\n", "").replace(" ", "")
        return cleaned_payload

    def sha256_hash(self, text: str) -> str:
        """
        Calculate a SHA-256 hex digest (64 chars) for the provided text.
        """
        return hashlib.sha256(text.encode("utf-8")).hexdigest()

    def hmac_sha256(self, key: Union[str, bytes], data: str) -> bytes:
        """
        Calculate an HMAC-SHA256 signature using the provided key and data.
        """
        encoded_key = key.encode("utf-8") if isinstance(key, str) else key
        return hmac.new(encoded_key, data.encode("utf-8"), hashlib.sha256).digest()

    def get_signature_key(self, date_simple: str, client: str) -> bytes:
        """
        Derive the signature key using the cascading HMAC steps defined in the APK.
        """
        k_date = self.hmac_sha256(self.secret_key, date_simple)
        k_client = self.hmac_sha256(k_date, client)
        k_signing = self.hmac_sha256(k_client, "elcano_request")
        return k_signing

    def prepare_canonical_request(
        self,
        method: str,
        path: str,
        params: str,
        payload: Optional[Union[Dict[str, Any], str]],
        content_type: str,
        host: str,
        client: str,
        timestamp: str,
        user_id: str,
    ) -> Tuple[str, str]:
        """
        Build the canonical request string that is hashed and signed.

        Returns:
            A tuple of (canonical_request, signed_headers).
        """
        formatted_payload = self.format_payload(payload)
        payload_hash = self.sha256_hash(formatted_payload)

        # Canonical headers (SPECIFIC ORDER, not alphabetical)
        canonical_headers = (
            f"content-type:{content_type}\n"
            f"x-elcano-host:{host}\n"  # Host must precede client
            f"x-elcano-client:{client}\n"
            f"x-elcano-date:{timestamp}\n"
            f"x-elcano-userid:{user_id}\n"
        )

        signed_headers = (
            "content-type;x-elcano-host;x-elcano-client;x-elcano-date;x-elcano-userid"
        )

        canonical_request = (
            f"{method}\n"
            f"{path}\n"
            f"{params}\n"
            f"{canonical_headers}"
            f"{signed_headers}\n"
            f"{payload_hash}"
        )

        return canonical_request, signed_headers

    def prepare_string_to_sign(
        self,
        timestamp: str,
        date_simple: str,
        client: str,
        user_id: str,
        canonical_request: str,
    ) -> str:
        """
        Build the string-to-sign payload that feeds the final HMAC.
        """
        canonical_hash = self.sha256_hash(canonical_request)
        string_to_sign = (
            f"HMAC-SHA256\n"
            f"{timestamp}\n"
            f"{date_simple}/{client}/{user_id}/elcano_request\n"
            f"{canonical_hash}"
        )
        return string_to_sign

    def calculate_signature(
        self, string_to_sign: str, date_simple: str, client: str
    ) -> str:
        """
        Compute the final hexadecimal signature for the request.
        """
        signing_key = self.get_signature_key(date_simple, client)
        signature_bytes = hmac.new(
            signing_key, string_to_sign.encode("utf-8"), hashlib.sha256
        ).digest()
        signature = signature_bytes.hex()
        return signature

    def build_authorization_header(
        self,
        signature: str,
        date_simple: str,
        client: str,
        user_id: str,
        signed_headers: str,
    ) -> str:
        """
        Format the Authorization header expected by the ADIF backend.
        """
        return (
            f"HMAC-SHA256 "
            f"Credential={self.access_key}/{date_simple}/{client}/{user_id}/elcano_request,"
            f"SignedHeaders={signed_headers},"
            f"Signature={signature}"
        )

    def get_auth_headers(
        self,
        method: str,
        url: str,
        payload: Optional[Union[Dict[str, Any], str]] = None,
        user_id: Optional[str] = None,
        date: Optional[datetime] = None,
    ) -> Dict[str, str]:
        """
        Generate all headers required to authenticate a single request.
        """
        parsed = urlparse(url)
        host = parsed.netloc
        path = parsed.path
        params = parsed.query or ""

        effective_user_id = user_id or str(uuid.uuid4())
        effective_date = date or datetime.utcnow()

        client = "AndroidElcanoApp"
        content_type = "application/json;charset=utf-8"

        timestamp = self.get_timestamp(effective_date)
        date_simple = self.get_date(effective_date)

        canonical_request, signed_headers = self.prepare_canonical_request(
            method,
            path,
            params,
            payload,
            content_type,
            host,
            client,
            timestamp,
            effective_user_id,
        )

        string_to_sign = self.prepare_string_to_sign(
            timestamp, date_simple, client, effective_user_id, canonical_request
        )

        signature = self.calculate_signature(string_to_sign, date_simple, client)

        authorization = self.build_authorization_header(
            signature, date_simple, client, effective_user_id, signed_headers
        )

        return {
            "Content-Type": content_type,
            "X-Elcano-Host": host,
            "X-Elcano-Client": client,
            "X-Elcano-Date": timestamp,
            "X-Elcano-UserId": effective_user_id,
            "Authorization": authorization,
        }

    def get_user_key_for_url(self, url: str) -> str:
        """
        Return the static User-key associated with the target host.
        """
        if "circulacion.api.adif.es" in url:
            return self.USER_KEY_CIRCULATION
        if "estaciones.api.adif.es" in url:
            return self.USER_KEY_STATIONS
        return self.USER_KEY_CIRCULATION  # Default


def example_usage() -> None:
    """
    Example usage of the authenticator.
    """
    print("=" * 70)
    print("ADIF API Authenticator - Usage Example")
    print("=" * 70)

    # STEP 1: Get keys from libapi-keys.so
    # (Use Ghidra or Frida to extract them)
    print("\nIMPORTANT: Replace with real keys extracted from libapi-keys.so")
    print("    See AUTHENTICATION_ALGORITHM.md for extraction instructions\n")

    ACCESS_KEY = "and20210615"  # Extracted with Ghidra
    SECRET_KEY = "Jthjtr946RTt"  # Extracted with Ghidra

    # STEP 2: Create authenticator
    auth = AdifAuthenticator(access_key=ACCESS_KEY, secret_key=SECRET_KEY)

    # STEP 3: Prepare request
    url = "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpaths/departures/traffictype/"
    payload = {
        "commercialService": "BOTH",
        "commercialStopType": "BOTH",
        "page": {"pageNumber": 0},
        "stationCode": "10200",  # Madrid Atocha
        "trafficType": "ALL",
    }

    # STEP 4: Generate authentication headers
    headers = auth.get_auth_headers("POST", url, payload=payload)

    # STEP 5: Add static User-key
    headers["User-key"] = auth.get_user_key_for_url(url)

    # STEP 6: Show result
    print("Generated headers:")
    print("-" * 70)
    for key, value in headers.items():
        print(f"{key}: {value}")

    print("\n" + "=" * 70)
    print("To make the request:")
    print("=" * 70)
    print(
        """
import requests

response = requests.post(
    url,
    json=payload,
    headers=headers
)

print(f"Status: {response.status_code}")
print(response.json())
    """
    )


if __name__ == "__main__":
    example_usage()
