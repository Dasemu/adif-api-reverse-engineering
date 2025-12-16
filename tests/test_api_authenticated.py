#!/usr/bin/env python3
"""
Tests for ADIF endpoints using HMAC-SHA256 authentication.
"""

from __future__ import annotations

import json
import sys
from pathlib import Path
from typing import Any, Dict

import requests
from requests import Response

# Add project root to sys.path to import adif_auth
sys.path.insert(0, str(Path(__file__).parent.parent))

from adif_auth import AdifAuthenticator  # noqa: E402

# Keys extracted with Frida
ACCESS_KEY = "and20210615"
SECRET_KEY = "Jthjtr946RTt"
USER_ID = "0c8c32dce47f8512"

auth = AdifAuthenticator(ACCESS_KEY, SECRET_KEY)


def build_headers(url: str, payload: Dict[str, Any]) -> Dict[str, str]:
    """Create authenticated headers including the correct User-key for the host."""
    headers = auth.get_auth_headers("POST", url, payload, user_id=USER_ID)
    headers["User-key"] = auth.get_user_key_for_url(url)
    return headers


def test_departures() -> None:
    """Test departures endpoint."""
    print("\n" + "=" * 70)
    print("TEST: Departures from Madrid Atocha (Commuter)")
    print("=" * 70)

    url = "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpaths/departures/traffictype/"

    payload: Dict[str, Any] = {
        "stationCode": "10200",
        "commercialService": "BOTH",
        "commercialStopType": "BOTH",
        "page": {"pageNumber": 0},
        "trafficType": "CERCANIAS",
    }

    headers = build_headers(url, payload)

    print(f"\nURL: {url}")
    print(f"Payload: {json.dumps(payload)}")
    print("\nHeaders:")
    for key, value in headers.items():
        preview = f"{value[:50]}..." if key == "Authorization" else value
        print(f"  {key}: {preview}")

    try:
        response: Response = requests.post(
            url, headers=headers, json=payload, timeout=10
        )
        print(f"\nStatus Code: {response.status_code}")

        if response.status_code == 200:
            print("✅ SUCCESS!")
            data = response.json()
            print("\nResponse (preview):")
            print(json.dumps(data, indent=2, ensure_ascii=False)[:1000])
        else:
            print("❌ ERROR")
            print(f"Response: {response.text[:500]}")

    except Exception as exc:  # pragma: no cover - interactive script
        print(f"❌ EXCEPTION: {exc}")


def test_station_details() -> None:
    """Test station details endpoint."""
    print("\n" + "=" * 70)
    print("TEST: Station details Madrid Atocha")
    print("=" * 70)

    url = "https://estaciones.api.adif.es/portroyalmanager/secure/stations/onestation/"

    payload: Dict[str, Any] = {"stationCode": "10200"}
    headers = build_headers(url, payload)

    print(f"\nURL: {url}")
    print(f"Payload: {json.dumps(payload)}")

    try:
        response: Response = requests.post(
            url, headers=headers, json=payload, timeout=10
        )
        print(f"\nStatus Code: {response.status_code}")

        if response.status_code == 200:
            print("✅ SUCCESS!")
            data = response.json()
            print("\nResponse (preview):")
            print(json.dumps(data, indent=2, ensure_ascii=False)[:1000])
        else:
            print("❌ ERROR")
            print(f"Response: {response.text[:500]}")

    except Exception as exc:  # pragma: no cover
        print(f"❌ EXCEPTION: {exc}")


def test_arrivals() -> None:
    """Test arrivals endpoint."""
    print("\n" + "=" * 70)
    print("TEST: Arrivals to Madrid Atocha (All traffic types)")
    print("=" * 70)

    url = "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpaths/arrivals/traffictype/"

    payload: Dict[str, Any] = {
        "stationCode": "10200",
        "commercialService": "BOTH",
        "commercialStopType": "BOTH",
        "page": {"pageNumber": 0},
        "trafficType": "ALL",
    }

    headers = build_headers(url, payload)

    print(f"\nURL: {url}")

    try:
        response: Response = requests.post(
            url, headers=headers, json=payload, timeout=10
        )
        print(f"\nStatus Code: {response.status_code}")

        if response.status_code == 200:
            print("✅ SUCCESS!")
            data = response.json()
            print("\nResponse (preview):")
            print(json.dumps(data, indent=2, ensure_ascii=False)[:800])
        else:
            print("❌ ERROR")
            print(f"Response: {response.text[:500]}")

    except Exception as exc:  # pragma: no cover
        print(f"❌ EXCEPTION: {exc}")


if __name__ == "__main__":
    print("\n" + "=" * 70)
    print("ADIF API TESTS WITH HMAC-SHA256 AUTHENTICATION")
    print("=" * 70)
    print("\nUsing keys:")
    print(f"  ACCESS_KEY: {ACCESS_KEY}")
    print(f"  SECRET_KEY: {SECRET_KEY}")
    print(f"  USER_ID: {USER_ID}")

    test_departures()
    test_station_details()
    test_arrivals()

    print("\n" + "=" * 70)
    print("TESTS COMPLETED")
    print("=" * 70)
