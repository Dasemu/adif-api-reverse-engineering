package X1;

import C.w;
import u.AbstractC0629f;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2010a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2011b;

    public a(int i, long j4) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f2010a = i;
        this.f2011b = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i = aVar.f2010a;
        int i4 = this.f2010a;
        if (i4 != 0) {
            return (i4 == i) && this.f2011b == aVar.f2011b;
        }
        throw null;
    }

    public final int hashCode() {
        int b4 = (AbstractC0629f.b(this.f2010a) ^ 1000003) * 1000003;
        long j4 = this.f2011b;
        return ((int) (j4 ^ (j4 >>> 32))) ^ b4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f2010a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return w.q(sb, this.f2011b, "}");
    }
}
