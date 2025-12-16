#!/usr/bin/env python3
"""
Script to test different ADIF API endpoints with signed requests.
"""

from __future__ import annotations

import json
import sys
from pathlib import Path
from typing import Any, Dict

import requests
from requests import Response

# Make adif_auth importable when running this script directly
sys.path.insert(0, str(Path(__file__).parent.parent))

from adif_auth import AdifAuthenticator  # noqa: E402

ACCESS_KEY: str = "and20210615"
SECRET_KEY: str = "Jthjtr946RTt"

BASE_CIRCULATION = "https://circulacion.api.adif.es"
BASE_STATIONS = "https://estaciones.api.adif.es"

auth = AdifAuthenticator(access_key=ACCESS_KEY, secret_key=SECRET_KEY)


def _headers_for(
    url: str, payload: Dict[str, Any], use_stations_key: bool = False
) -> Dict[str, str]:
    """Build authentication headers for a given request body and URL."""
    headers = auth.get_auth_headers("POST", url, payload)
    headers["User-key"] = (
        auth.USER_KEY_STATIONS if use_stations_key else auth.USER_KEY_CIRCULATION
    )
    return headers


def test_endpoint(
    name: str, url: str, payload: Dict[str, Any], use_stations_key: bool = False
) -> None:
    """Test an endpoint and show a compact preview of the response."""
    print(f"\n{'='*60}")
    print(f"TEST: {name}")
    print(f"{'='*60}")

    headers = _headers_for(url, payload, use_stations_key=use_stations_key)

    try:
        response: Response = requests.post(
            url, headers=headers, json=payload, timeout=10
        )
        print(f"\nStatus: {response.status_code}")

        if response.status_code == 200:
            print("✅ SUCCESS")
            result = response.json()
            print("\nResponse Preview:")
            print(json.dumps(result, indent=2, ensure_ascii=False)[:1000] + "...")
        elif response.status_code == 204:
            print("⚠️ NO CONTENT")
        else:
            print("❌ ERROR")
            print(f"Response: {response.text[:500]}")

    except Exception as exc:  # pragma: no cover - simple console diagnostic
        print(f"❌ EXCEPTION: {exc}")


def main() -> None:
    print("=" * 60)
    print("ADIF API ENDPOINT TESTS")
    print("=" * 60)

    test_endpoint(
        "Departures - Simple Format",
        f"{BASE_CIRCULATION}/portroyalmanager/secure/circulationpaths/departures/traffictype/",
        {
            "commercialService": "BOTH",
            "commercialStopType": "BOTH",
            "page": {"pageNumber": 0},
            "stationCode": "10200",
            "trafficType": "ALL",
        },
    )

    test_endpoint(
        "Departures - State YES",
        f"{BASE_CIRCULATION}/portroyalmanager/secure/circulationpaths/departures/traffictype/",
        {
            "commercialService": "YES",
            "commercialStopType": "YES",
            "page": {"pageNumber": 0},
            "stationCode": "10200",
            "trafficType": "CERCANIAS",
        },
    )

    test_endpoint(
        "Route Details",
        f"{BASE_CIRCULATION}/portroyalmanager/secure/circulationpathdetails/onepaths/",
        {
            "commercialNumber": "03194",
            "destinationStationCode": "71801",
            "launchingDate": 1713984000000,  # Example timestamp
            "originStationCode": "10200",
        },
    )

    test_endpoint(
        "Between Stations",
        f"{BASE_CIRCULATION}/portroyalmanager/secure/circulationpaths/betweenstations/traffictype/",
        {
            "commercialService": "BOTH",
            "commercialStopType": "BOTH",
            "destinationStationCode": "71801",
            "originStationCode": "10200",
            "page": {"pageNumber": 0},
            "trafficType": "ALL",
        },
    )

    test_endpoint(
        "Station Details",
        f"{BASE_STATIONS}/portroyalmanager/secure/stations/onestation/",
        {"stationCode": "10200"},
        use_stations_key=True,
    )

    test_endpoint(
        "Station Observations",
        f"{BASE_STATIONS}/portroyalmanager/secure/stationsobservations/",
        {"stationCodes": ["10200", "71801"]},
        use_stations_key=True,
    )

    test_endpoint(
        "Train Composition",
        f"{BASE_CIRCULATION}/portroyalmanager/secure/circulationpaths/compositions/path/",
        {
            "commercialNumber": "03194",
            "destinationStationCode": "71801",
            "launchingDate": 1713984000000,
            "originStationCode": "10200",
        },
    )

    print("\n" + "=" * 60)
    print("SUMMARY")
    print("=" * 60)
    print(
        """
Tests completed. Review results above.

NOTES:
- Some endpoints may require valid codes/numbers
- Station codes are numeric (e.g.: 10200 for Madrid Atocha)
- Commercial numbers vary by train type
- Some data may not be available in real-time

COMMON STATION CODES:
- 10200: Madrid Puerta de Atocha
- 10302: Madrid Chamartin
- 71801: Barcelona Sants
- 50000: Valencia Nord
- 11401: Sevilla Santa Justa

TRAFFIC TYPES:
- CERCANIAS: Commuter trains
- MEDIA_DISTANCIA: Medium distance
- LARGA_DISTANCIA: Long distance
- ALL: All types

STATES:
- YES: Only commercial services/stops
- NOT: Without commercial services/stops
- BOTH: Both types
"""
    )


if __name__ == "__main__":
    main()
