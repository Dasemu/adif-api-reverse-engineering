package e3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e3.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0326l {

    /* renamed from: e, reason: collision with root package name */
    public static final C0326l f6370e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0326l f6371f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6372a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6373b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f6374c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f6375d;

    static {
        C0324j c0324j = C0324j.f6362r;
        C0324j c0324j2 = C0324j.f6363s;
        C0324j c0324j3 = C0324j.f6364t;
        C0324j c0324j4 = C0324j.f6357l;
        C0324j c0324j5 = C0324j.f6359n;
        C0324j c0324j6 = C0324j.f6358m;
        C0324j c0324j7 = C0324j.f6360o;
        C0324j c0324j8 = C0324j.f6361q;
        C0324j c0324j9 = C0324j.p;
        C0324j[] c0324jArr = {c0324j, c0324j2, c0324j3, c0324j4, c0324j5, c0324j6, c0324j7, c0324j8, c0324j9};
        C0324j[] c0324jArr2 = {c0324j, c0324j2, c0324j3, c0324j4, c0324j5, c0324j6, c0324j7, c0324j8, c0324j9, C0324j.f6355j, C0324j.f6356k, C0324j.h, C0324j.i, C0324j.f6353f, C0324j.f6354g, C0324j.f6352e};
        C0325k c0325k = new C0325k();
        c0325k.b((C0324j[]) Arrays.copyOf(c0324jArr, 9));
        V v3 = V.TLS_1_3;
        V v4 = V.TLS_1_2;
        c0325k.d(v3, v4);
        if (!c0325k.f6366a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0325k.f6367b = true;
        c0325k.a();
        C0325k c0325k2 = new C0325k();
        c0325k2.b((C0324j[]) Arrays.copyOf(c0324jArr2, 16));
        c0325k2.d(v3, v4);
        if (!c0325k2.f6366a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0325k2.f6367b = true;
        f6370e = c0325k2.a();
        C0325k c0325k3 = new C0325k();
        c0325k3.b((C0324j[]) Arrays.copyOf(c0324jArr2, 16));
        c0325k3.d(v3, v4, V.TLS_1_1, V.TLS_1_0);
        if (!c0325k3.f6366a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0325k3.f6367b = true;
        c0325k3.a();
        f6371f = new C0326l(false, false, null, null);
    }

    public C0326l(boolean z3, boolean z4, String[] strArr, String[] strArr2) {
        this.f6372a = z3;
        this.f6373b = z4;
        this.f6374c = strArr;
        this.f6375d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f6374c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0324j.f6349b.c(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean b(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f6372a) {
            return false;
        }
        String[] strArr = this.f6375d;
        if (strArr != null && !f3.c.i(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f6374c;
        return strArr2 == null || f3.c.i(strArr2, socket.getEnabledCipherSuites(), C0324j.f6350c);
    }

    public final List c() {
        String[] strArr = this.f6375d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m3.d.p(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0326l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0326l c0326l = (C0326l) obj;
        boolean z3 = c0326l.f6372a;
        boolean z4 = this.f6372a;
        if (z4 != z3) {
            return false;
        }
        if (z4) {
            return Arrays.equals(this.f6374c, c0326l.f6374c) && Arrays.equals(this.f6375d, c0326l.f6375d) && this.f6373b == c0326l.f6373b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f6372a) {
            return 17;
        }
        String[] strArr = this.f6374c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f6375d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f6373b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f6372a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f6373b + ')';
    }
}
