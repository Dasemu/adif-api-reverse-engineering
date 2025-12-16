# ADIF Authentication Algorithm - Complete Reverse Engineering

> **Status:** ✅ Algorithm fully decoded and keys extracted from `libapi-keys.so`

## Executive Summary

The ADIF authentication system is similar to **AWS Signature Version 4**:
- Uses **HMAC-SHA256** to sign requests
- Requires two secret keys: `accessKey` and `secretKey`
- Keys live inside the native library `libapi-keys.so` (obfuscated)
- Generates dynamic headers for every request

---

## Algorithm Source File

**Location:** `com/adif/elcanomovil/serviceNetworking/interceptors/auth/ElcanoAuth.java`

**Key lines:**
- 47-53: Authorization header calculation
- 129-172: Canonical Request preparation
- 174-183: String to Sign preparation
- 78-84: Signature calculation
- 109-111: Signature key derivation

---

## Algorithm Walkthrough

### 1. Input Parameters

```java
// From ElcanoClientAuth.Builder
String elcanoAccessKey;      // Access key (from libapi-keys.so)
String elcanoSecretKey;      // Secret key (from libapi-keys.so)
String host;                 // e.g. "circulacion.api.adif.es"
String path;                 // e.g. "/portroyalmanager/secure/circulationpaths/departures/traffictype/"
String params;               // Query string (can be "")
String httpMethodName;       // "GET" or "POST"
String payload;              // JSON body (no spaces or line breaks)
String contentType;          // "application/json;charset=utf-8"
String xElcanoClient;        // "AndroidElcanoApp"
String xElcanoUserId;        // Persistent user UUID
Date requestDate;            // Current date/time
```

### 2. Date Formats

```java
// ElcanoAuth.java:195-199
public static String getTimeStamp(Date date) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    return simpleDateFormat.format(date);
}
// Example: "20251204T204637Z"

// ElcanoAuth.java:55-59
public static String getDate(Date date) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    return simpleDateFormat.format(date);
}
// Example: "20251204"
```

### 3. Prepare the Payload

```java
// ElcanoAuth.java:86-91
public String formatPayload(String str) {
    if (str == null) {
        str = "";
    }
    return str.replace("\r", "").replace("\n", "").replace(" ", "");
}
```

**Example:**
```
Input:  {"page": {"pageNumber": 0}}
Output: {"page":{"pageNumber":0}}
```

### 4. Canonical Request

**File:** `ElcanoAuth.java:129-172`

**Structure:**
```
<HTTPMethod>\n
<Path>\n
<QueryString>\n
content-type:<ContentType>\n
x-elcano-host:<Host>\n
x-elcano-client:<Client>\n
x-elcano-date:<Timestamp>\n
x-elcano-userid:<UserId>\n
content-type;x-elcano-host;x-elcano-client;x-elcano-date;x-elcano-userid\n
<SHA256HashOfPayload>
```

**Real example:**
```
POST
/portroyalmanager/secure/circulationpaths/departures/traffictype/

content-type:application/json;charset=utf-8
x-elcano-host:circulacion.api.adif.es
x-elcano-client:AndroidElcanoApp
x-elcano-date:20251204T204637Z
x-elcano-userid:a1b2c3d4-e5f6-7890-abcd-ef1234567890
content-type;x-elcano-host;x-elcano-client;x-elcano-date;x-elcano-userid
<sha256_hash_of_payload_hex>
```

**Important note:** Header order is specific (not fully alphabetical) — `content-type`, `x-elcano-host`, `x-elcano-client`, `x-elcano-date`, `x-elcano-userid`.

### 5. String to Sign

**File:** `ElcanoAuth.java:174-183`

**Structure:**
```
HMAC-SHA256\n
<Timestamp>\n
<DateSimple>/<Client>/<UserId>/elcano_request\n
<SHA256HashOfCanonicalRequest>
```

**Example:**
```
HMAC-SHA256
20251204T204637Z
20251204/AndroidElcanoApp/a1b2c3d4-e5f6-7890-abcd-ef1234567890/elcano_request
<sha256_hash_of_canonical_request_hex>
```

### 6. Signature Key

**File:** `ElcanoAuth.java:109-111`

```java
public byte[] getSignatureKey(String secretKey, String date, String client) {
    return hmacSha256(
        hmacSha256(
            hmacSha256(secretKey.getBytes(StandardCharsets.UTF_8), date),
            client
        ),
        "elcano_request"
    );
}
```

**Pseudocode:**
```python
kDate = HMAC_SHA256(secretKey, date)                  # "20251204"
kClient = HMAC_SHA256(kDate, client)                  # "AndroidElcanoApp"
kSigning = HMAC_SHA256(kClient, "elcano_request")
```

### 7. Signature (Final HMAC)

**File:** `ElcanoAuth.java:78-84`

```java
public String calculateSignature(String stringToSign) {
    return bytesToHex(
        hmacSha256(
            getSignatureKey(secretKey, dateSimple, client),
            stringToSign
        )
    );
}
```

**Pseudocode:**
```python
signatureKey = getSignatureKey(secretKey, "20251204", "AndroidElcanoApp")
signature = HMAC_SHA256(signatureKey, string_to_sign)
signatureHex = signature.hex()
```

### 8. Authorization Header

**File:** `ElcanoAuth.java:61-63`

**Format:**
```
HMAC-SHA256 Credential=<accessKey>/<date>/<client>/<userId>/elcano_request,SignedHeaders=<signedHeaders>,Signature=<signature>
```

**Example:**
```
HMAC-SHA256 Credential=ACCESS_KEY_HERE/20251204/AndroidElcanoApp/a1b2c3d4-e5f6-7890-abcd-ef1234567890/elcano_request,SignedHeaders=content-type;x-elcano-host;x-elcano-client;x-elcano-date;x-elcano-userid,Signature=a1b2c3d4e5f6789...
```

### 9. Final Request Headers

**File:** `ElcanoAuth.java:97-107`

```http
Content-Type: application/json;charset=utf-8
X-Elcano-Host: circulacion.api.adif.es
X-Elcano-Client: AndroidElcanoApp
X-Elcano-Date: 20251204T204637Z
X-Elcano-UserId: a1b2c3d4-e5f6-7890-abcd-ef1234567890
Authorization: HMAC-SHA256 Credential=...
```

**Note:** These replace the `X-CanalMovil-*` headers we originally expected.

---

## Helper Functions

### HMAC-SHA256

**File:** `ElcanoAuth.java:117-127`

```java
public byte[] hmacSha256(byte[] key, String data) {
    Mac mac = Mac.getInstance("HmacSHA256");
    mac.init(new SecretKeySpec(key, "HmacSHA256"));
    return mac.doFinal(data.getBytes(StandardCharsets.UTF_8));
}
```

### SHA-256 Hash (Hex)

**File:** `ElcanoAuth.java:185-193`

```java
public String toHex(String str) {
    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
    return String.format("%064x", new BigInteger(1, messageDigest.digest()));
}
```

### Bytes to Hex

**File:** `ElcanoAuth.java:65-76`

```java
public String bytesToHex(byte[] bytes) {
    char[] hexArray = "0123456789ABCDEF".toCharArray();
    char[] hexChars = new char[bytes.length * 2];
    for (int i = 0; i < bytes.length; i++) {
        int v = bytes[i] & 0xFF;
        hexChars[i * 2] = hexArray[v >>> 4];
        hexChars[i * 2 + 1] = hexArray[v & 0x0F];
    }
    return new String(hexChars).toLowerCase();
}
```

---

## Secret Keys

### Location

**File:** `com/adif/commonKeys/GetKeysHelper.java`

```java
public final class GetKeysHelper {
    static {
        System.loadLibrary("api-keys");  // Loads libapi-keys.so
    }

    private final native String getAccessKeyPro();
    private final native String getSecretKeyPro();

    public final String a() {
        return getAccessKeyPro();
    }

    public final String b() {
        return getSecretKeyPro();
    }
}
```

**Native library:**
- `lib/x86_64/libapi-keys.so` (446 KB)
- `lib/arm64-v8a/libapi-keys.so` (503 KB)
- `lib/x86/libapi-keys.so` (416 KB)
- `lib/armeabi-v7a/libapi-keys.so` (366 KB)

**JNI functions:**
```cpp
Java_com_adif_commonKeys_GetKeysHelper_getAccessKeyPro
Java_com_adif_commonKeys_GetKeysHelper_getSecretKeyPro
```

### Extracting the Keys

**Option 1: Ghidra / IDA Pro**
```bash
# Open libapi-keys.so in Ghidra
# Find the JNI functions
# Inspect the assembly to locate the strings
```

**Option 2: Frida (runtime)**
```javascript
Java.perform(function() {
    var GetKeysHelper = Java.use('com.adif.commonKeys.GetKeysHelper');

    console.log('[+] Access Key: ' + GetKeysHelper.f4297a.a());
    console.log('[+] Secret Key: ' + GetKeysHelper.f4297a.b());
});
```

**Option 3: strings + manual analysis**
```bash
strings libapi-keys.so | grep -E "^[A-Za-z0-9+/=]{32,}$"
```

---

## Python Implementation

```python
import hashlib
import hmac
from datetime import datetime
import json

class AdifAuthenticator:
    def __init__(self, access_key, secret_key):
        self.access_key = access_key
        self.secret_key = secret_key

    def get_timestamp(self, date=None):
        if date is None:
            date = datetime.utcnow()
        return date.strftime('%Y%m%dT%H%M%SZ')

    def get_date(self, date=None):
        if date is None:
            date = datetime.utcnow()
        return date.strftime('%Y%m%d')

    def format_payload(self, payload):
        if payload is None:
            return ""
        if isinstance(payload, dict):
            payload = json.dumps(payload, separators=(',', ':'))
        return payload.replace('\r', '').replace('\n', '').replace(' ', '')

    def sha256_hash(self, text):
        return hashlib.sha256(text.encode('utf-8')).hexdigest()

    def hmac_sha256(self, key, data):
        if isinstance(key, str):
            key = key.encode('utf-8')
        return hmac.new(key, data.encode('utf-8'), hashlib.sha256).digest()

    def get_signature_key(self, date_simple, client):
        k_date = self.hmac_sha256(self.secret_key, date_simple)
        k_client = self.hmac_sha256(k_date, client)
        k_signing = self.hmac_sha256(k_client, "elcano_request")
        return k_signing

    def prepare_canonical_request(self, method, path, params, payload,
                                  content_type, host, client, timestamp, user_id):
        # Format payload
        formatted_payload = self.format_payload(payload)
        payload_hash = self.sha256_hash(formatted_payload)

        # Canonical headers (specific order, lowercase)
        canonical_headers = (
            f"content-type:{content_type}\n"
            f"x-elcano-host:{host}\n"
            f"x-elcano-client:{client}\n"
            f"x-elcano-date:{timestamp}\n"
            f"x-elcano-userid:{user_id}\n"
        )

        signed_headers = "content-type;x-elcano-host;x-elcano-client;x-elcano-date;x-elcano-userid"

        canonical_request = (
            f"{method}\n"
            f"{path}\n"
            f"{params}\n"
            f"{canonical_headers}"
            f"{signed_headers}\n"
            f"{payload_hash}"
        )

        return canonical_request, signed_headers

    def prepare_string_to_sign(self, timestamp, date_simple, client, user_id, canonical_request):
        canonical_hash = self.sha256_hash(canonical_request)

        string_to_sign = (
            f"HMAC-SHA256\n"
            f"{timestamp}\n"
            f"{date_simple}/{client}/{user_id}/elcano_request\n"
            f"{canonical_hash}"
        )

        return string_to_sign

    def calculate_signature(self, string_to_sign, date_simple, client):
        signing_key = self.get_signature_key(date_simple, client)
        signature = hmac.new(signing_key, string_to_sign.encode('utf-8'), hashlib.sha256).hexdigest()
        return signature

    def build_authorization_header(self, signature, date_simple, client, user_id, signed_headers):
        return (
            f"HMAC-SHA256 "
            f"Credential={self.access_key}/{date_simple}/{client}/{user_id}/elcano_request,"
            f"SignedHeaders={signed_headers},"
            f"Signature={signature}"
        )

    def get_auth_headers(self, method, url, payload=None, user_id=None):
        # Parse URL
        from urllib.parse import urlparse
        parsed = urlparse(url)
        host = parsed.netloc
        path = parsed.path
        params = parsed.query or ""

        # Defaults
        if user_id is None:
            import uuid
            user_id = str(uuid.uuid4())

        client = "AndroidElcanoApp"
        content_type = "application/json;charset=utf-8"

        # Timestamps
        now = datetime.utcnow()
        timestamp = self.get_timestamp(now)
        date_simple = self.get_date(now)

        # 1. Canonical Request
        canonical_request, signed_headers = self.prepare_canonical_request(
            method, path, params, payload, content_type, host, client, timestamp, user_id
        )

        # 2. String to Sign
        string_to_sign = self.prepare_string_to_sign(
            timestamp, date_simple, client, user_id, canonical_request
        )

        # 3. Signature
        signature = self.calculate_signature(string_to_sign, date_simple, client)

        # 4. Authorization Header
        authorization = self.build_authorization_header(
            signature, date_simple, client, user_id, signed_headers
        )

        # Return all headers
        return {
            "Content-Type": content_type,
            "X-Elcano-Host": host,
            "X-Elcano-Client": client,
            "X-Elcano-Date": timestamp,
            "X-Elcano-UserId": user_id,
            "Authorization": authorization
        }

# USAGE:
# auth = AdifAuthenticator(access_key="ACCESS_KEY_HERE", secret_key="SECRET_KEY_HERE")
# headers = auth.get_auth_headers("POST", "https://circulacion.api.adif.es/path", payload={...})
```

---

## Next Steps

The algorithm and keys are already implemented in `adif_auth.py`. Use the Python client or the scripts in `/tests` to validate live requests.

---

## References

- **ElcanoAuth.java:** `serviceNetworking/interceptors/auth/ElcanoAuth.java`
- **ElcanoClientAuth.java:** `serviceNetworking/interceptors/auth/ElcanoClientAuth.java`
- **GetKeysHelper.java:** `commonKeys/GetKeysHelper.java`
- **libapi-keys.so:** `lib/*/libapi-keys.so`

---

**Last update:** 2025-12-05  
**Status:** Algorithm and keys complete ✅
