#!/usr/bin/env python3
"""
Detailed endpoint testing with full error messages and typed helpers.
"""

from __future__ import annotations

import json
import sys
import uuid
from datetime import datetime, timedelta
from pathlib import Path
from typing import Any, Dict, Sequence

import requests
from requests import Response

# Add project root to sys.path to import adif_auth
sys.path.insert(0, str(Path(__file__).parent.parent))

from adif_auth import AdifAuthenticator  # noqa: E402

ACCESS_KEY = "and20210615"
SECRET_KEY = "Jthjtr946RTt"


def test_endpoint_detailed(
    name: str, url: str, payload: Dict[str, Any], use_stations_key: bool = False
) -> bool:
    """
    Test an endpoint and display detailed information about request and response.

    Returns:
        True when the endpoint responds with 200, False otherwise.
    """
    auth = AdifAuthenticator(access_key=ACCESS_KEY, secret_key=SECRET_KEY)
    user_id = str(uuid.uuid4())

    headers = auth.get_auth_headers("POST", url, payload, user_id=user_id)
    headers["User-key"] = (
        auth.USER_KEY_STATIONS if use_stations_key else auth.USER_KEY_CIRCULATION
    )

    print(f"\n{'='*70}")
    print(f"Testing: {name}")
    print(f"{'='*70}")
    print(f"URL: {url}")
    print(f"Payload: {json.dumps(payload, indent=2)}")

    try:
        response: Response = requests.post(
            url, json=payload, headers=headers, timeout=10
        )
        print(f"\nStatus Code: {response.status_code}")
        print(f"Headers: {dict(response.headers)}")

        try:
            response_json = response.json()
            print(
                f"Response Body: {json.dumps(response_json, indent=2, ensure_ascii=False)[:1000]}"
            )
        except ValueError:
            print(f"Response Body (text): {response.text[:500]}")

        if response.status_code == 200:
            print("✅ SUCCESS")
            return True

        print(f"❌ FAILED - Status {response.status_code}")
        return False

    except Exception as exc:  # pragma: no cover - console-only diagnostics
        print(f"❌ ERROR: {exc}")
        return False


def run_onepaths_variations(today_start: int) -> None:
    """Exercise the onepaths endpoint with a variety of payloads."""
    print("\n\n" + "=" * 70)
    print("TESTING ONEPATHS WITH DIFFERENT VARIATIONS")
    print("=" * 70)

    variations: Sequence[Dict[str, Any]] = [
        {
            "allControlPoints": True,
            "commercialNumber": "03194",
            "destinationStationCode": "71801",
            "launchingDate": today_start,
            "originStationCode": "10200",
        },
        {
            "allControlPoints": True,
            "commercialNumber": None,
            "destinationStationCode": "71801",
            "launchingDate": today_start,
            "originStationCode": "10200",
        },
        {
            "allControlPoints": True,
            "destinationStationCode": "71801",
            "launchingDate": today_start,
            "originStationCode": "10200",
        },
        {
            "allControlPoints": True,
            "launchingDate": today_start,
            "originStationCode": "10200",
        },
        {"commercialNumber": "03194", "launchingDate": today_start},
    ]

    for index, payload in enumerate(variations, start=1):
        test_endpoint_detailed(
            f"OnePaths Variation {index}",
            "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpathdetails/onepaths/",
            payload,
        )


def main() -> None:
    now = datetime.now()
    today_start = int(datetime(now.year, now.month, now.day).timestamp() * 1000)
    tomorrow_start = int(
        (datetime(now.year, now.month, now.day) + timedelta(days=1)).timestamp() * 1000
    )

    print("Testing with dates:")
    print(f"Today (start): {today_start} = {datetime.fromtimestamp(today_start/1000)}")
    print(
        f"Tomorrow (start): {tomorrow_start} = {datetime.fromtimestamp(tomorrow_start/1000)}"
    )

    test_endpoint_detailed(
        "BetweenStations",
        "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpaths/betweenstations/traffictype/",
        {
            "commercialService": "BOTH",
            "commercialStopType": "BOTH",
            "originStationCode": "10200",
            "destinationStationCode": "71801",
            "page": {"pageNumber": 0},
            "trafficType": "ALL",
        },
    )

    run_onepaths_variations(today_start)

    test_endpoint_detailed(
        "OneStation",
        "https://estaciones.api.adif.es/portroyalmanager/secure/stations/onestation/",
        {
            "stationCode": "10200",
            "detailedInfo": {
                "extendedStationInfo": True,
                "stationActivities": True,
                "stationBanner": True,
                "stationCommercialServices": True,
                "stationInfo": True,
                "stationServices": True,
                "stationTransportServices": True,
            },
        },
        use_stations_key=True,
    )

    test_endpoint_detailed(
        "OneStation - Simple",
        "https://estaciones.api.adif.es/portroyalmanager/secure/stations/onestation/",
        {"stationCode": "10200"},
        use_stations_key=True,
    )

    print("\n" + "=" * 70)
    print("TEST COMPLETED")
    print("=" * 70)


if __name__ == "__main__":
    main()
