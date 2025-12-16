# ADIF Elcano API - Complete Documentation

Complete documentation of the ADIF API (El Cano Movil) obtained through reverse engineering of the mobile application.

**All 9/9 endpoints functional** | HMAC-SHA256 authentication | 1587 station codes

---

## Base URLs

```
BASE_URL_STATIONS     = https://estaciones.api.adif.es
BASE_URL_CIRCULATION  = https://circulacion.api.adif.es
BASE_URL_ELCANOWEB    = https://elcanoweb.adif.es/api/
BASE_URL_AVISA        = https://avisa.adif.es/avisa-ws/api/
```

## Authentication Keys

### HMAC Keys (extracted from libapi-keys.so)
```python
ACCESS_KEY = "and20210615"
SECRET_KEY = "Jthjtr946RTt"
```

### User-keys (different for each service)
```
Circulations: f4ce9fbfa9d721e39b8984805901b5df
Stations:     0d021447a2fd2ac64553674d5a0c1a6f
```

### Other Auth Tokens
```
Avisa Login:        Basic YXZpc3RhX2NsaWVudF9hbmRyb2lkOjh5WzZKNyFmSjwhXypmYXE1NyNnOSohNElwa2MjWC1BTg==
Subscriptions:      Basic ZGVpbW9zOmRlaW1vc3R0
Registration Token: Bearer b9034774-c6e4-4663-a1a8-74bf7102651b
```

---

## Endpoints (9/9 Working)

### Station Endpoints

#### Get All Stations
```
GET /portroyalmanager/secure/stations/allstations/reducedinfo/{token}/
Base: https://estaciones.api.adif.es
User-key: stations
Token: Initial value is "0"
```

#### Get Station Details
```
POST /portroyalmanager/secure/stations/onestation/
Base: https://estaciones.api.adif.es
User-key: stations

Body:
{
  "stationCode": "10200",
  "token": "0",
  "detailedInfo": {
    "extendedStationInfo": true,
    "stationActivities": true,
    "stationBanner": true,
    "stationCommercialServices": true,
    "stationInfo": true,
    "stationServices": true,
    "stationTransportServices": true
  }
}
```

#### Station Observations
```
POST /portroyalmanager/secure/stationsobservations/
Base: https://estaciones.api.adif.es
User-key: stations

Body:
{
  "stationCodes": ["60000", "71801"]
}
```

---

### Circulation Endpoints

#### Departures
```
POST /portroyalmanager/secure/circulationpaths/departures/traffictype/
Base: https://circulacion.api.adif.es
User-key: circulations

Body:
{
  "commercialService": "BOTH",
  "commercialStopType": "BOTH",
  "page": {"pageNumber": 0},
  "stationCode": "10200",
  "trafficType": "ALL"
}
```

#### Arrivals
```
POST /portroyalmanager/secure/circulationpaths/arrivals/traffictype/
Base: https://circulacion.api.adif.es
User-key: circulations

Body: Same format as departures
```

#### Between Stations
```
POST /portroyalmanager/secure/circulationpaths/betweenstations/traffictype/
Base: https://circulacion.api.adif.es
User-key: circulations

Body:
{
  "commercialService": "BOTH",
  "commercialStopType": "BOTH",
  "originStationCode": "10200",
  "destinationStationCode": "71801",
  "page": {"pageNumber": 0},
  "trafficType": "ALL"
}

IMPORTANT: Send only origin/destination; do NOT add `stationCode` or explicit `null` fields.
```

#### One Train Route (OnePaths)
```
POST /portroyalmanager/secure/circulationpathdetails/onepaths/
Base: https://circulacion.api.adif.es
User-key: circulations

Body:
{
  "allControlPoints": true,
  "commercialNumber": "04138",
  "destinationStationCode": "60000",
  "launchingDate": 1733356800000,
  "originStationCode": "71801"
}

Notes:
- `commercialNumber` must be real (grab from departures/arrivals)
- `launchingDate` must be milliseconds
- Omit unused fields instead of sending `null`
```

#### Multiple Routes (SeveralPaths)
```
POST /portroyalmanager/secure/circulationpathdetails/severalpaths/
Base: https://circulacion.api.adif.es
User-key: circulations

Body: Same format as onepaths (omit unused fields)

Returns 204 when there is no data for the requested trains.
```

#### Train Composition
```
POST /portroyalmanager/secure/circulationpaths/compositions/path/
Base: https://circulacion.api.adif.es
User-key: circulations

Body:
{
  "commercialNumber": "03194",
  "destinationStationCode": "71801",
  "launchingDate": 1764889200000,
  "originStationCode": "10200"
}

IMPORTANT: Do NOT include `allControlPoints: true` (requires elevated permissions, returns 401)
```

---

## Response Structures

### Departures/Arrivals Response

```json
{
  "commercialPaths": [
    {
      "commercialPathInfo": {
        "timestamp": 1764927847100,
        "commercialPathKey": {
          "commercialCirculationKey": {
            "commercialNumber": "90399",
            "launchingDate": 1764889200000
          },
          "originStationCode": "10620",
          "destinationStationCode": "60004"
        },
        "trafficType": "CERCANIAS",
        "opeProComPro": {
          "operator": "RF",
          "product": "C",
          "commercialProduct": " "
        }
      },
      "passthroughStep": {
        "stopType": "NO_STOP",
        "stationCode": "10200",
        "departurePassthroughStepSides": {
          "plannedTime": 1764927902000,
          "forecastedOrAuditedDelay": 2175,
          "timeType": "FORECASTED",
          "plannedPlatform": "2",
          "circulationState": "RUNNING"
        }
      }
    }
  ]
}
```

**Important fields**:
- `commercialNumber`: Train commercial number
- `launchingDate`: Date in milliseconds
- `plannedTime`: Planned time in milliseconds
- `forecastedOrAuditedDelay`: Delay in seconds
- `circulationState`: RUNNING, PENDING_TO_CIRCULATE, etc.

### OnePaths Response (Complete Route)

```json
{
  "commercialPaths": [
    {
      "commercialPathInfo": { /* Same as departures */ },
      "passthroughSteps": [  // Array with ALL stops
        {
          "stopType": "COMMERCIAL",
          "stationCode": "10620",
          "departurePassthroughStepSides": {
            "plannedTime": 1764918000000,
            "forecastedOrAuditedDelay": 430,
            "plannedPlatform": "1",
            "circulationState": "RUNNING"
          }
        }
        // ... more stops
      ]
    }
  ]
}
```

**Key difference**:
- `departures/arrivals` -> `passthroughStep` (singular)
- `onepaths` -> `passthroughSteps` (plural, array)

---

## Status Codes

| Code | Meaning | Cause |
|------|---------|-------|
| 200 | Success | Request successful with data |
| 204 | No Content | Authentication OK, no data available |
| 400 | Bad Request | Incorrect payload |
| 401 | Unauthorized | No permissions or wrong auth |

**Note**: 204 is NOT an error. It means authentication and payload are correct.

---

## Data Types

### TrafficType
- `CERCANIAS` - Commuter trains
- `AVLDMD` - High Speed, Long and Medium Distance
- `OTHERS` - Other
- `TRAVELERS` - Passengers
- `GOODS` - Freight
- `ALL` - All types

### State (commercialService, commercialStopType)
- `YES`
- `NOT`
- `BOTH`

---

## Common Issues and Solutions

### Issue 1: NULL Fields Cause Errors

**Problem**: Including `null` fields in JSON causes 401 errors.

```json
// WRONG - causes 401
{"stationCode": null, "trafficType": "ALL"}

// CORRECT - omit the field entirely
{"trafficType": "ALL"}
```

### Issue 2: Header Order for HMAC

The canonical headers order is NOT alphabetical:

```
1. content-type
2. x-elcano-host    <- host before client!
3. x-elcano-client
4. x-elcano-date
5. x-elcano-userid
```

### Issue 3: Timestamps

`launchingDate` must be in milliseconds:

```python
# Correct
timestamp = int(datetime.now().timestamp() * 1000)

# Wrong (missing 3 zeros)
timestamp = int(datetime.now().timestamp())
```

### Issue 4: allControlPoints Requires Permissions

`/compositions/path/` with `allControlPoints: true` returns 401. Don't include it.

---

## Station Codes

**Total**: 1587 stations
**File**: `station_codes.txt`
**Source**: `apk_extracted/assets/stations_all.json`

### Top Stations
```
10200    Madrid Puerta de Atocha          AVLDMD
10302    Madrid Chamartin-Clara Campoamor AVLDMD
71801    Barcelona Sants                  AVLDMD,CERCANIAS
60000    Valencia Nord                    AVLDMD
11401    Sevilla Santa Justa              AVLDMD
50003    Alicante Terminal                AVLDMD,CERCANIAS
54007    Cordoba Central                  AVLDMD
79600    Zaragoza Portillo                AVLDMD,CERCANIAS
```

---

## Implementation Notes

### Tools Used
- **Ghidra**: Key extraction from `libapi-keys.so`
- **JADX**: APK decompilation
- **Python 3**: Client implementation

### Key Source Files
- `apk_extracted/lib/x86_64/libapi-keys.so` - Authentication keys
- `apk_extracted/assets/stations_all.json` - Station database
- `apk_decompiled/sources/com/adif/elcanomovil/serviceNetworking/interceptors/auth/ElcanoAuth.java` - HMAC algorithm

### Main Analyzed Classes
- `TrafficCirculationPathRequest` - Request model
- `OneOrSeveralPathsRequest` - Path requests
- `ElcanoAuth` - HMAC-SHA256 implementation
- `ServicePaths` - URL and key definitions
