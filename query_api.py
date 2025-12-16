#!/usr/bin/env python3
"""
Script to query the ADIF API with real-time authentication.
Signatures are generated fresh for every request.
"""

from __future__ import annotations

import json
import sys
from typing import Any, Dict, List, Optional, Sequence, Tuple

import requests
from requests import Response

from adif_auth import AdifAuthenticator

# Keys extracted with Ghidra
ACCESS_KEY: str = "and20210615"
SECRET_KEY: str = "Jthjtr946RTt"

# Create authenticator once for all calls
auth = AdifAuthenticator(access_key=ACCESS_KEY, secret_key=SECRET_KEY)


def print_separator(char: str = "=", length: int = 70) -> None:
    """Print a simple separator line."""
    print(char * length)


def print_response(
    response: Response, show_full: bool = False, max_lines: int = 800
) -> None:
    """
    Pretty-print an API response, limiting output volume for large payloads.
    """
    print(f"\nStatus Code: {response.status_code}")
    print("Response Headers:")
    for key, value in response.headers.items():
        if key.lower().startswith("x-elcano"):
            print(f"  {key}: {value}")

    print("\nResponse Body:")
    try:
        data = response.json()
        json_str = json.dumps(data, indent=2, ensure_ascii=False)
        if show_full:
            print(json_str)
            return

        lines = json_str.split("\n")
        if len(lines) > max_lines:
            print("\n".join(lines[:max_lines]))
            print(f"\n... ({len(lines) - max_lines} more lines)")
            print(f"\nTotal elements: {data.get('totalElements', 'N/A')}")
        else:
            print(json_str)
    except ValueError:
        print(response.text[:1500])


def _run_signed_post(
    name: str, url: str, payload: Dict[str, Any], user_key: str
) -> bool:
    """
    Sign and execute a POST request, showing basic request/response details.
    """
    print_separator()
    print(name)
    print_separator()

    headers = auth.get_auth_headers("POST", url, payload)
    headers["User-key"] = user_key

    print(f"\nURL: {url}")
    print(f"Payload: {json.dumps(payload, indent=2)}")

    response = requests.post(url, json=payload, headers=headers, timeout=15)
    print_response(response)
    return response.status_code == 200


def query_departures(station_code: str = "10200", traffic_type: str = "ALL") -> bool:
    """Query departures from a station."""
    url = "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpaths/departures/traffictype/"
    payload: Dict[str, Any] = {
        "commercialService": "BOTH",
        "commercialStopType": "BOTH",
        "page": {"pageNumber": 0},
        "stationCode": station_code,
        "trafficType": traffic_type,
    }
    return _run_signed_post(
        f"DEPARTURES from station {station_code}",
        url,
        payload,
        auth.USER_KEY_CIRCULATION,
    )


def query_arrivals(station_code: str = "10200", traffic_type: str = "ALL") -> bool:
    """Query arrivals to a station."""
    url = "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpaths/arrivals/traffictype/"
    payload: Dict[str, Any] = {
        "commercialService": "BOTH",
        "commercialStopType": "BOTH",
        "page": {"pageNumber": 0},
        "stationCode": station_code,
        "trafficType": traffic_type,
    }
    return _run_signed_post(
        f"ARRIVALS to station {station_code}", url, payload, auth.USER_KEY_CIRCULATION
    )


def query_observations(station_codes: Optional[Sequence[str]] = None) -> bool:
    """Query station observations for a list of station codes."""
    codes: List[str] = list(station_codes) if station_codes else ["10200", "71801"]
    url = "https://estaciones.api.adif.es/portroyalmanager/secure/stationsobservations/"
    payload: Dict[str, Any] = {"stationCodes": codes}
    return _run_signed_post(
        f"OBSERVATIONS for stations {', '.join(codes)}",
        url,
        payload,
        auth.USER_KEY_STATIONS,
    )


def interactive_menu() -> None:
    """Interactive menu for quick API queries."""
    print("\n" + "=" * 70)
    print("    ADIF API QUERIES - Real-Time Authentication")
    print("=" * 70)
    print("\nAvailable functional endpoints:")
    print("  1. Departures from Madrid Atocha (10200)")
    print("  2. Arrivals to Madrid Atocha (10200)")
    print("  3. Departures from Barcelona Sants (71801)")
    print("  4. Arrivals to Barcelona Sants (71801)")
    print("  5. Observations for multiple stations")
    print("  6. Custom query (departures)")
    print("  7. Custom query (arrivals)")
    print("  0. Exit")
    print()

    while True:
        try:
            choice = input("Choose an option (0-7): ").strip()

            if choice == "0":
                print("\nSee you next time!")
                break
            if choice == "1":
                query_departures("10200", "ALL")
            elif choice == "2":
                query_arrivals("10200", "ALL")
            elif choice == "3":
                query_departures("71801", "ALL")
            elif choice == "4":
                query_arrivals("71801", "ALL")
            elif choice == "5":
                query_observations(["10200", "71801", "60000"])
            elif choice == "6":
                station = input("Station code: ").strip()
                traffic = (
                    input("Traffic type (ALL/CERCANIAS/AVLDMD/TRAVELERS/GOODS): ")
                    .strip()
                    .upper()
                )
                query_departures(station, traffic or "ALL")
            elif choice == "7":
                station = input("Station code: ").strip()
                traffic = (
                    input("Traffic type (ALL/CERCANIAS/AVLDMD/TRAVELERS/GOODS): ")
                    .strip()
                    .upper()
                )
                query_arrivals(station, traffic or "ALL")
            else:
                print("❌ Invalid option")

            input("\nPress ENTER to continue...")
            print("\n")

        except KeyboardInterrupt:
            print("\n\nSee you next time!")
            break
        except Exception as e:  # Broad for interactive script safety
            print(f"\n❌ Error: {e}")
            input("\nPress ENTER to continue...")


def quick_demo() -> None:
    """Quick demo of the three functional endpoints."""
    print("\n" + "=" * 70)
    print("    QUICK DEMO - Functional Endpoints")
    print("=" * 70)

    results: List[Tuple[str, bool]] = []

    print("\n1️⃣  Testing DEPARTURES from Madrid Atocha...")
    results.append(("Departures", query_departures("10200", "CERCANIAS")))

    print("\n\n2️⃣  Testing ARRIVALS to Barcelona Sants...")
    results.append(("Arrivals", query_arrivals("71801", "ALL")))

    print("\n\n3️⃣  Testing STATION OBSERVATIONS...")
    results.append(("Observations", query_observations(["10200", "71801"])))

    print("\n" + "=" * 70)
    print("RESUMEN")
    print("=" * 70)
    for name, success in results:
        status = "✅ OK" if success else "❌ FAIL"
        print(f"{status} - {name}")

    success_count = sum(1 for _, success in results if success)
    print(f"\nTotal: {success_count}/{len(results)} endpoints working")
    print("=" * 70)


if __name__ == "__main__":
    if len(sys.argv) > 1:
        command = sys.argv[1].lower()

        if command == "demo":
            quick_demo()
        elif command == "departures":
            station = sys.argv[2] if len(sys.argv) > 2 else "10200"
            traffic = sys.argv[3] if len(sys.argv) > 3 else "ALL"
            query_departures(station, traffic)
        elif command == "arrivals":
            station = sys.argv[2] if len(sys.argv) > 2 else "10200"
            traffic = sys.argv[3] if len(sys.argv) > 3 else "ALL"
            query_arrivals(station, traffic)
        elif command == "observations":
            stations = (
                sys.argv[2].split(",") if len(sys.argv) > 2 else ["10200", "71801"]
            )
            query_observations(stations)
        else:
            print("Usage:")
            print("  python3 query_api.py demo")
            print("  python3 query_api.py departures [station_code] [traffic_type]")
            print("  python3 query_api.py arrivals [station_code] [traffic_type]")
            print("  python3 query_api.py observations [station1,station2,...]")
            print("\nOr run with no arguments for the interactive menu")
    else:
        interactive_menu()
