package W1;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final T1.c f1944a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1945b;

    public m(T1.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f1944a = cVar;
        this.f1945b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f1944a.equals(mVar.f1944a)) {
            return Arrays.equals(this.f1945b, mVar.f1945b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1945b) ^ ((this.f1944a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f1944a + ", bytes=[...]}";
    }
}
