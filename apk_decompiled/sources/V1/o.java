package V1;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f1863a;

    public o(long j4) {
        this.f1863a = j4;
    }

    public static o a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new o(Long.parseLong(jsonReader.nextString())) : new o(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            if (this.f1863a == ((o) obj).f1863a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f1863a;
        return ((int) ((j4 >>> 32) ^ j4)) ^ 1000003;
    }

    public final String toString() {
        return C.w.q(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f1863a, "}");
    }
}
