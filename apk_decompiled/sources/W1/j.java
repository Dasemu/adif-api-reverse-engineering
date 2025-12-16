package W1;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f1933a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1934b;

    /* renamed from: c, reason: collision with root package name */
    public final T1.d f1935c;

    public j(String str, byte[] bArr, T1.d dVar) {
        this.f1933a = str;
        this.f1934b = bArr;
        this.f1935c = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, R0.h] */
    public static R0.h a() {
        ?? obj = new Object();
        obj.f1415c = T1.d.f1658a;
        return obj;
    }

    public final j b(T1.d dVar) {
        R0.h a2 = a();
        a2.o(this.f1933a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        a2.f1415c = dVar;
        a2.f1414b = this.f1934b;
        return a2.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f1933a.equals(jVar.f1933a) && Arrays.equals(this.f1934b, jVar.f1934b) && this.f1935c.equals(jVar.f1935c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1935c.hashCode() ^ ((((this.f1933a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1934b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.f1934b;
        return "TransportContext(" + this.f1933a + ", " + this.f1935c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
