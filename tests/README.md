# Tests - ADIF API

Test scripts to validate the functionality of the ADIF API.

## Active Tests

### test_endpoints_detailed.py
Exhaustive test of all endpoints with complete debug information.

**Features**:
- Shows status codes, headers and JSON response
- Tests multiple payload variations
- Identifies 400, 401 errors and their causes
- Useful for debugging new endpoints

**Usage**:
```bash
python3 tests/test_endpoints_detailed.py
```

**Expected output**:
- Detailed information for each request
- Error analysis with server messages
- Differentiation between payload vs permission errors

---

### test_onepaths_with_real_trains.py
Functional test that gets real trains and tests the `onepaths` endpoint.

**Features**:
- Queries `departures` to get running trains
- Extracts `commercialNumber`, `launchingDate`, station codes
- Tests `onepaths` with real data
- Validates that the endpoint works correctly

**Usage**:
```bash
python3 tests/test_onepaths_with_real_trains.py
```

**Requirements**:
- Run during the day (when trains are running)
- If run at night/early morning may not find trains

**Expected output**:
```
======================================================================
STEP 1: Getting real trains from Madrid Atocha
======================================================================
Got 25 trains

======================================================================
STEP 2: Testing onePaths with real trains
======================================================================
SUCCESS! onePaths works with real data
```

---

## Archived Tests

The `archived/` folder contains old tests that were useful during development but are no longer necessary:

- `test_all_endpoints.py` - Simple version without debug
- `test_complete_bodies.py` - Complete payload tests
- `test_corrected_api.py` / `test_corrected_api_v2.py` - Previous versions
- `test_real_auth.py` - Basic authentication tests
- `test_simple.py` - Minimalist test
- `test_with_auth_headers.py` - Header validation
- `test_without_auth.py` - Test without authentication
- `debug_auth.py` - HMAC algorithm debug

These tests are kept in case they're useful as reference, but the active tests are more complete.

---

## Test Structure

### Basic Template

```python
from adif_auth import AdifAuthenticator
import requests
import uuid

ACCESS_KEY = "and20210615"
SECRET_KEY = "Jthjtr946RTt"

def test_endpoint():
    auth = AdifAuthenticator(access_key=ACCESS_KEY, secret_key=SECRET_KEY)

    url = "https://circulacion.api.adif.es/portroyalmanager/secure/..."
    payload = {
        # Your payload here
    }

    user_id = str(uuid.uuid4())
    headers = auth.get_auth_headers("POST", url, payload, user_id=user_id)
    headers["User-key"] = auth.USER_KEY_CIRCULATION

    response = requests.post(url, json=payload, headers=headers, timeout=10)

    assert response.status_code == 200
    print(f"Test passed: {response.json()}")

if __name__ == "__main__":
    test_endpoint()
```

### Status Code Analysis

```python
if response.status_code == 200:
    print("SUCCESS - Endpoint functional")
    data = response.json()

elif response.status_code == 204:
    print("NO CONTENT - Correct authentication but no data")

elif response.status_code == 400:
    print("BAD REQUEST - Incorrect payload")
    print(f"Error: {response.json()}")

elif response.status_code == 401:
    print("UNAUTHORIZED - No permissions")
    print(f"Error: {response.json()}")
```

---

## Expected Results

### Functional Endpoints (200)
- `/departures/traffictype/`
- `/arrivals/traffictype/`
- `/onepaths/` (with real commercialNumber)
- `/stationsobservations/`
- `/betweenstations/traffictype/`
- `/onestation/`
- `/allstations/reducedinfo/{token}/`

### Endpoints returning 204 (Success without data)
- `/severalpaths/`
- `/compositions/path/`

---

## Tips for Creating New Tests

1. **Use `test_endpoints_detailed.py` as base** - Has good error handling
2. **Validate timestamps** - Use milliseconds, not seconds
3. **Test with real data** - Like `test_onepaths_with_real_trains.py` does
4. **Differentiate errors**:
   - 400 = Incorrect payload -> Check fields
   - 401 = No permissions -> Keys don't have access
   - 204 = No data -> Authentication OK, but empty response

