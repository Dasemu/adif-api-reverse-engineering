# ADIF API - Reverse Engineering

Complete Python client to access the ADIF API (El Cano Móvil) through reverse engineering.

**All 9/9 endpoints functional** · HMAC-SHA256 authentication implemented · 1587 station codes extracted

---

## Quick Start

```bash
# Install dependencies
pip install requests

# Run demo
python3 adif_client.py
```

### Basic Usage

```python
from adif_client import AdifClient

# Initialize client
client = AdifClient(
    access_key="and20210615",
    secret_key="Jthjtr946RTt"
)

# Get departures from Madrid Atocha
trains = client.get_departures("10200", "AVLDMD")

for train in trains:
    info = train['commercialPathInfo']
    print(f"Train {info['commercialPathKey']['commercialCirculationKey']['commercialNumber']}")

# Get complete train route
route = client.get_train_route(
    commercial_number="03194",
    launching_date=1764889200000,
    origin_station_code="10200",
    destination_station_code="71801"
)
```

---

## Available Endpoints (9/9 working)

| Endpoint | Status | Description |
|----------|--------|-------------|
| `/departures/traffictype/` | 200 | Departures from a station |
| `/arrivals/traffictype/` | 200 | Arrivals to a station |
| `/stationsobservations/` | 200 | Station observations |
| `/onepaths/` | 200 | Complete route of a train |
| `/betweenstations/traffictype/` | 200 | Trains between two stations |
| `/onestation/` | 200 | Station details |
| `/allstations/reducedinfo/{token}/` | 200 | Complete station list (GET) |
| `/severalpaths/` | 204 | Details of multiple circulations (returns 204 when no data) |
| `/compositions/path/` | 204* | Train compositions |

*`compositions` works without `allControlPoints`; including it requires elevated permissions (401).

**Important notes**
- Omit optional fields instead of sending `null` (the server rejects explicit nulls).
- `betweenstations`: Use `originStationCode` and `destinationStationCode` only.
- `onestation`: Requires `token: "0"` and a `detailedInfo` object.
- `allstations`: GET with the token in the path (initially `"0"`).

---

## Project Structure

```
adif-api-reverse-engineering/
├── README.md                    # This file
├── LICENSE
│
├── Core scripts
│   ├── adif_auth.py              # HMAC-SHA256 implementation
│   ├── adif_client.py            # Complete API client
│   └── query_api.py              # Interactive CLI
│
├── Data
│   ├── station_codes.txt           # 1587 station codes
│   └── extracted_keys.txt          # Extracted keys
│
├── Tests (/tests)
│   ├── test_endpoints.py               # Smoke test of main endpoints
│   ├── test_endpoints_detailed.py      # Exhaustive test with debug
│   ├── test_onepaths_with_real_trains.py # End-to-end with live trains
│   └── test_api_authenticated.py       # Minimal signed calls
│
├── Documentation (/docs)
│   ├── API_DOCUMENTATION.md        # API documentation
│   ├── AUTHENTICATION_ALGORITHM.md # HMAC algorithm
│   └── API_REQUEST_BODIES.md       # Request body references
│
└── APK Analysis
    ├── apk_decompiled/            # Decompiled code (JADX)
    └── apk_extracted/             # Extracted APK
        ├── assets/stations_all.json  # Station source
        └── lib/x86_64/libapi-keys.so # Library with keys
```

---

## Authentication

### Extracted Keys

```python
ACCESS_KEY = "and20210615"
SECRET_KEY = "Jthjtr946RTt"
USER_KEY_CIRCULATION = "f4ce9fbfa9d721e39b8984805901b5df"
USER_KEY_STATIONS = "0d021447a2fd2ac64553674d5a0c1a6f"
```

**Source**: `apk_extracted/lib/x86_64/libapi-keys.so` (extracted with Ghidra)

### HMAC-SHA256 Algorithm

Implementation based on AWS Signature v4.

**CRITICAL**: Header order is not alphabetical:

```python
canonical_headers = (
    f"content-type:application/json;charset=utf-8\n"
    f"x-elcano-host:{host}\n"          # host before client
    f"x-elcano-client:AndroidElcanoApp\n"
    f"x-elcano-date:{timestamp}\n"
    f"x-elcano-userid:{user_id}\n"
)
```

See `adif_auth.py` for complete implementation.

---

## Station Codes

**Total**: 1587 stations
**File**: `station_codes.txt`
**Format**: `code TAB name TAB traffic_types`

### Top 10 Stations

```
10200    Madrid Puerta de Atocha          AVLDMD
10302    Madrid Chamartin-Clara Campoamor AVLDMD
71801    Barcelona Sants                  AVLDMD,CERCANIAS
60000    Valencia Nord                    AVLDMD
11401    Sevilla Santa Justa              AVLDMD
50003    Alicante Terminal                AVLDMD,CERCANIAS
54007    Cordoba Central                  AVLDMD
79600    Zaragoza Portillo                AVLDMD,CERCANIAS
03216    Valencia J.Sorolla               AVLDMD
04040    Zaragoza Delicias                AVLDMD,CERCANIAS
```

---

## Use Cases

### 1. Delay Monitor

```python
import time
from adif_client import AdifClient

client = AdifClient(ACCESS_KEY, SECRET_KEY)

while True:
    trains = client.get_departures("10200", "ALL")
    for train in trains:
        passthrough = train.get('passthroughStep', {})
        dep_sides = passthrough.get('departurePassthroughStepSides', {})
        delay = dep_sides.get('forecastedOrAuditedDelay', 0)

        if delay > 300:  # More than 5 minutes
            print(f"Warning: {delay//60} min delay")

    time.sleep(30)
```

### 2. Query Complete Routes

```python
trains_with_routes = client.get_all_departures_with_routes(
    station_code="10200",
    traffic_type="AVLDMD",
    max_trains=5
)

for train in trains_with_routes:
    print(f"Train {train['commercial_number']}")
    print(f"   Stops: {len(train['route'])}")
```

### 3. Interactive CLI

```bash
python3 query_api.py
```

---

## Tools Used

- **Ghidra** - Key extraction from `libapi-keys.so`
- **JADX** - APK decompilation
- **Python 3** - Client implementation
- **Frida** (optional) - Dynamic analysis

---

## Documentation

- **[API_DOCUMENTATION.md](docs/API_DOCUMENTATION.md)** - Complete API documentation
- **[AUTHENTICATION_ALGORITHM.md](docs/AUTHENTICATION_ALGORITHM.md)** - Detailed HMAC algorithm
- **[GHIDRA_GUIDE.md](docs/GHIDRA_GUIDE.md)** - Step-by-step Ghidra tutorial

---

## Known Limitations

- `allControlPoints: true` in `/compositions/path/` requires elevated permissions (returns 401). Leave it out to get 204/200 responses.
- 204 responses simply mean “no data right now” with valid auth.

---

## License

MIT License - See [LICENSE](LICENSE)

**Disclaimer**: Project for educational and research purposes. Use responsibly.
