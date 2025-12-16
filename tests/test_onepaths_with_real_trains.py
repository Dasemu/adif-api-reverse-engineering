#!/usr/bin/env python3
"""
Fetch real trains from departures and then test onePaths with those numbers.
"""

from __future__ import annotations

import json
import sys
import uuid
from datetime import datetime
from pathlib import Path
from typing import Any, Dict, List, Sequence

import requests
from requests import Response

# Add project root to sys.path to import adif_auth
sys.path.insert(0, str(Path(__file__).parent.parent))

from adif_auth import AdifAuthenticator  # noqa: E402

ACCESS_KEY = "and20210615"
SECRET_KEY = "Jthjtr946RTt"

auth = AdifAuthenticator(access_key=ACCESS_KEY, secret_key=SECRET_KEY)

DEPARTURES_URL = "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpaths/departures/traffictype/"
ONEPATHS_URL = "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpathdetails/onepaths/"


def fetch_departures(station_code: str, traffic_type: str) -> List[Dict[str, Any]]:
    """Fetch current departures from a station."""
    payload = {
        "commercialService": "BOTH",
        "commercialStopType": "BOTH",
        "page": {"pageNumber": 0},
        "stationCode": station_code,
        "trafficType": traffic_type,
    }

    user_id = str(uuid.uuid4())
    headers = auth.get_auth_headers("POST", DEPARTURES_URL, payload, user_id=user_id)
    headers["User-key"] = auth.USER_KEY_CIRCULATION

    response: Response = requests.post(
        DEPARTURES_URL, json=payload, headers=headers, timeout=10
    )
    if response.status_code != 200:
        raise RuntimeError(
            f"Error getting departures: {response.status_code} - {response.text}"
        )

    data = response.json()
    return data.get("circulations", [])


def test_onepaths_with_trains(
    trains: Sequence[Dict[str, Any]], launching_date: int
) -> None:
    """Run onepaths queries against a subset of the provided trains."""
    for index, train in enumerate(trains[:3], start=1):
        commercial_number = train.get("commercialNumber")
        destination = train.get("destination", {})
        dest_code = destination.get("stationCode")
        origin = train.get("origin", {})
        origin_code = origin.get("stationCode")

        payload_onepaths: Dict[str, Any] = {
            "allControlPoints": True,
            "commercialNumber": commercial_number,
            "destinationStationCode": dest_code,
            "launchingDate": launching_date,
            "originStationCode": origin_code,
        }

        print(f"\n{'='*70}")
        print(f"Test {index}: Train {commercial_number}")
        print(f"{'='*70}")
        print(f"Payload: {json.dumps(payload_onepaths, indent=2)}")

        user_id = str(uuid.uuid4())
        headers = auth.get_auth_headers(
            "POST", ONEPATHS_URL, payload_onepaths, user_id=user_id
        )
        headers["User-key"] = auth.USER_KEY_CIRCULATION

        response: Response = requests.post(
            ONEPATHS_URL, json=payload_onepaths, headers=headers, timeout=10
        )
        print(f"\nStatus: {response.status_code}")

        if response.status_code == 200:
            print("✅ SUCCESS!")
            try:
                data = response.json()
                print(
                    f"Response: {json.dumps(data, indent=2, ensure_ascii=False)[:2000]}"
                )
            except ValueError:
                print(f"Response text: {response.text[:500]}")
        elif response.status_code == 204:
            print("⚠️ 204 No Content - Correct authentication but no data")
        else:
            print(f"❌ FAILED - Status {response.status_code}")
            try:
                print(f"Error: {response.json()}")
            except ValueError:
                print(f"Response text: {response.text}")


def main() -> None:
    print("=" * 70)
    print("STEP 1: Getting real trains from Madrid Atocha")
    print("=" * 70)

    trains = fetch_departures(station_code="10200", traffic_type="AVLDMD")
    print(f"✅ Retrieved {len(trains)} trains\n")

    print("First 5 trains:")
    for i, train in enumerate(trains[:5], start=1):
        commercial_number = train.get("commercialNumber")
        destination = train.get("destination", {})
        dest_name = destination.get("longName", "Unknown")
        origin = train.get("origin", {})
        origin_name = origin.get("longName", "Unknown")
        planned_time = train.get("plannedTime", "Unknown")

        print(f"\n{i}. Train {commercial_number}")
        print(f"   Origin: {origin_name}")
        print(f"   Destination: {dest_name}")
        print(f"   Departure time: {planned_time}")

    print("\n" + "=" * 70)
    print("STEP 2: Testing onePaths with real trains")
    print("=" * 70)

    now = datetime.now()
    launching_date = int(datetime(now.year, now.month, now.day).timestamp() * 1000)
    test_onepaths_with_trains(trains, launching_date)

    print("\n" + "=" * 70)
    print("TEST COMPLETE")
    print("=" * 70)


if __name__ == "__main__":
    try:
        main()
    except Exception as exc:  # pragma: no cover - console script
        print(f"❌ Error running test: {exc}")
