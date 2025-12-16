#!/usr/bin/env python3
"""
Complete ADIF API client.

Implements every functional endpoint with easy-to-use methods.
Includes error handling and basic data validation.
"""

from __future__ import annotations

import uuid
from datetime import datetime
from typing import Any, Dict, List

import requests
from requests import Response

from adif_auth import AdifAuthenticator


class AdifClient:
    """Client to interact with the ADIF API"""

    def __init__(self, access_key: str, secret_key: str) -> None:
        """
        Initialize the client with HMAC credentials.
        """
        self.auth: AdifAuthenticator = AdifAuthenticator(
            access_key=access_key, secret_key=secret_key
        )
        self.session: requests.Session = requests.Session()

    def _make_request(
        self, url: str, payload: Dict[str, Any], use_stations_key: bool = False
    ) -> Dict[str, Any]:
        """
        Execute a single authenticated POST request against the API.

        Args:
            url: Endpoint URL
            payload: Data to send
            use_stations_key: If True, use USER_KEY_STATIONS instead of USER_KEY_CIRCULATION

        Returns:
            Decoded JSON response body.

        Raises:
            PermissionError: When the API returns 401.
            ValueError: When the API returns 400 due to payload issues.
            Exception: For any other unexpected status code.
        """
        user_id = str(uuid.uuid4())
        headers = self.auth.get_auth_headers("POST", url, payload, user_id=user_id)

        if use_stations_key:
            headers["User-key"] = self.auth.USER_KEY_STATIONS
        else:
            headers["User-key"] = self.auth.USER_KEY_CIRCULATION

        response: Response = self.session.post(
            url, json=payload, headers=headers, timeout=30
        )

        if response.status_code == 200:
            return response.json()
        if response.status_code == 204:
            return {"message": "No content available", "commercialPaths": []}
        if response.status_code == 401:
            raise PermissionError(
                "Unauthorized - Keys do not have permissions for this endpoint"
            )
        if response.status_code == 400:
            raise ValueError(f"Bad Request - Invalid payload: {response.text}")
        raise Exception(f"Error {response.status_code}: {response.text}")

    def get_departures(
        self,
        station_code: str,
        traffic_type: str = "ALL",
        page_number: int = 0,
        commercial_service: str = "BOTH",
        commercial_stop_type: str = "BOTH",
    ) -> List[Dict[str, Any]]:
        """
        Gets departures from a station.

        Args:
            station_code: Station code (e.g.: "10200")
            traffic_type: Traffic type (ALL, CERCANIAS, AVLDMD, TRAVELERS, GOODS)
            page_number: Page number (default 0)
            commercial_service: BOTH, YES, NOT
            commercial_stop_type: BOTH, YES, NOT

        Returns:
            List of trains

        Example:
            >>> client = AdifClient(ACCESS_KEY, SECRET_KEY)
            >>> trains = client.get_departures("10200", "AVLDMD")
            >>> for train in trains:
            ...     print(f\"{train['commercialNumber']} - Destination: {train['destination']}\")
        """
        url = "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpaths/departures/traffictype/"
        payload = {
            "commercialService": commercial_service,
            "commercialStopType": commercial_stop_type,
            "page": {"pageNumber": page_number},
            "stationCode": station_code,
            "trafficType": traffic_type,
        }

        data = self._make_request(url, payload)
        return data.get("commercialPaths", [])

    def get_arrivals(
        self,
        station_code: str,
        traffic_type: str = "ALL",
        page_number: int = 0,
        commercial_service: str = "BOTH",
        commercial_stop_type: str = "BOTH",
    ) -> List[Dict[str, Any]]:
        """
        Gets arrivals to a station.

        Args:
            station_code: Station code (e.g.: "10200")
            traffic_type: Traffic type (ALL, CERCANIAS, AVLDMD, TRAVELERS, GOODS)
            page_number: Page number (default 0)
            commercial_service: BOTH, YES, NOT
            commercial_stop_type: BOTH, YES, NOT

        Returns:
            List of trains

        Example:
            >>> client = AdifClient(ACCESS_KEY, SECRET_KEY)
            >>> trains = client.get_arrivals("71801", "ALL")
        """
        url = "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpaths/arrivals/traffictype/"
        payload = {
            "commercialService": commercial_service,
            "commercialStopType": commercial_stop_type,
            "page": {"pageNumber": page_number},
            "stationCode": station_code,
            "trafficType": traffic_type,
        }

        data = self._make_request(url, payload)
        return data.get("commercialPaths", [])

    def get_train_route(
        self,
        commercial_number: str,
        launching_date: int,
        origin_station_code: str,
        destination_station_code: str,
        all_control_points: bool = True,
    ) -> List[Dict[str, Any]]:
        """
        Gets a train's full route (all stops).

        Args:
            commercial_number: Train commercial number (e.g.: "03194")
            launching_date: Departure date in milliseconds since epoch
            origin_station_code: Origin station code
            destination_station_code: Destination station code
            all_control_points: If True, include all control points

        Returns:
            List of train stops

        Example:
            >>> # First fetch a real train
            >>> trains = client.get_departures("10200", "AVLDMD")
            >>> train = trains[0]
            >>> info = train['commercialPathInfo']
            >>> key = info['commercialPathKey']
            >>>
            >>> # Fetch its complete route
            >>> route = client.get_train_route(
            ...     commercial_number=key['commercialCirculationKey']['commercialNumber'],
            ...     launching_date=key['commercialCirculationKey']['launchingDate'],
            ...     origin_station_code=key['originStationCode'],
            ...     destination_station_code=key['destinationStationCode']
            ... )
            >>> for stop in route:
            ...     print(f\"Stop: {stop['stationCode']}\")
        """
        url = "https://circulacion.api.adif.es/portroyalmanager/secure/circulationpathdetails/onepaths/"
        payload = {
            "allControlPoints": all_control_points,
            "commercialNumber": commercial_number,
            "destinationStationCode": destination_station_code,
            "launchingDate": launching_date,
            "originStationCode": origin_station_code,
        }

        data = self._make_request(url, payload)
        commercial_paths = data.get("commercialPaths", [])

        if commercial_paths:
            return commercial_paths[0].get("passthroughSteps", [])
        return []

    def get_station_observations(
        self, station_codes: List[str]
    ) -> List[Dict[str, Any]]:
        """
        Gets station observations.

        Args:
            station_codes: List of station codes

        Returns:
            List of observations

        Example:
            >>> client = AdifClient(ACCESS_KEY, SECRET_KEY)
            >>> obs = client.get_station_observations([\"10200\", \"71801\"])
        """
        url = "https://estaciones.api.adif.es/portroyalmanager/secure/stationsobservations/"
        payload = {"stationCodes": station_codes}

        data = self._make_request(url, payload, use_stations_key=True)
        return data.get("stationObservations", [])

    def get_all_departures_with_routes(
        self, station_code: str, traffic_type: str = "ALL", max_trains: int = 5
    ) -> List[Dict[str, Any]]:
        """
        Gets departures from a station AND their complete routes.

        Args:
            station_code: Station code
            traffic_type: Traffic type
            max_trains: Maximum number of trains to process

        Returns:
            List of trains with their routes

        Example:
            >>> client = AdifClient(ACCESS_KEY, SECRET_KEY)
            >>> trains_with_routes = client.get_all_departures_with_routes(\"10200\", \"AVLDMD\", max_trains=3)
            >>> for train in trains_with_routes:
            ...     print(f\"Train {train['commercial_number']}\")
            ...     for stop in train['route']:
            ...         print(f\"  - {stop['stationCode']}\")
        """
        departures = self.get_departures(station_code, traffic_type)
        result: List[Dict[str, Any]] = []

        for train in departures[:max_trains]:
            info = train["commercialPathInfo"]
            key = info["commercialPathKey"]
            commercial_key = key["commercialCirculationKey"]

            try:
                route = self.get_train_route(
                    commercial_number=commercial_key["commercialNumber"],
                    launching_date=commercial_key["launchingDate"],
                    origin_station_code=key["originStationCode"],
                    destination_station_code=key["destinationStationCode"],
                )

                result.append(
                    {
                        "commercial_number": commercial_key["commercialNumber"],
                        "traffic_type": info["trafficType"],
                        "origin_station": key["originStationCode"],
                        "destination_station": key["destinationStationCode"],
                        "launching_date": commercial_key["launchingDate"],
                        "train_info": train,
                        "route": route,
                    }
                )
            except Exception as e:
                print(
                    f"⚠️ Error getting route for train {commercial_key['commercialNumber']}: {e}"
                )
                continue

        return result


def demo() -> None:
    """Run a simple interactive demo against live endpoints."""
    print("=" * 70)
    print("ADIF CLIENT DEMO")
    print("=" * 70)

    ACCESS_KEY = "and20210615"
    SECRET_KEY = "Jthjtr946RTt"

    client = AdifClient(ACCESS_KEY, SECRET_KEY)

    # 1. Departures from Madrid Atocha
    print("\n1️⃣  DEPARTURES FROM MADRID ATOCHA (High Speed)")
    print("-" * 70)
    try:
        departures = client.get_departures("10200", "AVLDMD")
        print(f"✅ Found {len(departures)} trains")

        for i, train in enumerate(departures[:3]):
            info = train["commercialPathInfo"]
            key = info["commercialPathKey"]
            passthrough = train.get("passthroughStep", {})
            dep_sides = passthrough.get("departurePassthroughStepSides", {})

            planned_time = dep_sides.get("plannedTime", 0)
            if planned_time:
                time_str = datetime.fromtimestamp(planned_time / 1000).strftime("%H:%M")
            else:
                time_str = "N/A"

            print(
                f"\n   {i+1}. Train {key['commercialCirculationKey']['commercialNumber']}"
            )
            print(f"      Destination: {key['destinationStationCode']}")
            print(f"      Departure time: {time_str}")
            print(f"      Status: {dep_sides.get('circulationState', 'N/A')}")

    except Exception as e:
        print(f"❌ Error: {e}")

    # 2. Full route of a train
    print("\n\n2️⃣  FULL ROUTE OF A TRAIN")
    print("-" * 70)
    try:
        departures = client.get_departures("10200", "ALL")
        if departures:
            train = departures[0]
            info = train["commercialPathInfo"]
            key = info["commercialPathKey"]
            commercial_key = key["commercialCirculationKey"]

            print(f"Fetching route for train {commercial_key['commercialNumber']}...")

            route = client.get_train_route(
                commercial_number=commercial_key["commercialNumber"],
                launching_date=commercial_key["launchingDate"],
                origin_station_code=key["originStationCode"],
                destination_station_code=key["destinationStationCode"],
            )

            print(f"✅ Route with {len(route)} stops:\n")
            for i, stop in enumerate(route[:10]):  # First 10 stops
                stop_type = stop.get("stopType", "N/A")
                station_code = stop.get("stationCode", "N/A")

                # Departure/arrival info
                dep_sides = stop.get("departurePassthroughStepSides", {})
                arr_sides = stop.get("arrivalPassthroughStepSides", {})

                if dep_sides:
                    time_ms = dep_sides.get("plannedTime", 0)
                    if time_ms:
                        time_str = datetime.fromtimestamp(time_ms / 1000).strftime(
                            "%H:%M"
                        )
                        print(
                            f"   {i+1}. {station_code} - Departure: {time_str} ({stop_type})"
                        )
                elif arr_sides:
                    time_ms = arr_sides.get("plannedTime", 0)
                    if time_ms:
                        time_str = datetime.fromtimestamp(time_ms / 1000).strftime(
                            "%H:%M"
                        )
                        print(
                            f"   {i+1}. {station_code} - Arrival: {time_str} ({stop_type})"
                        )
                else:
                    print(f"   {i+1}. {station_code} ({stop_type})")

    except Exception as e:
        print(f"❌ Error: {e}")

    # 3. Station observations
    print("\n\n3️⃣  STATION OBSERVATIONS")
    print("-" * 70)
    try:
        observations = client.get_station_observations(["10200", "71801"])
        print(f"✅ Observations from {len(observations)} stations")

        for obs in observations:
            station_code = obs.get("stationCode", "N/A")
            observation_text = obs.get("observation", "No observations")
            print(f"\n   Station {station_code}:")
            print(f"   {observation_text}")

    except Exception as e:
        print(f"❌ Error: {e}")

    print("\n" + "=" * 70)
    print("DEMO COMPLETE")
    print("=" * 70)


if __name__ == "__main__":
    demo()
