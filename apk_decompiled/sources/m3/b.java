package m3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements q3.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f7808a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f7809b;

    public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
        this.f7808a = trustManager;
        this.f7809b = findByIssuerAndSignatureMethod;
    }

    @Override // q3.d
    public final X509Certificate a(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        try {
            Object invoke = this.f7809b.invoke(this.f7808a, cert);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e4) {
            throw new AssertionError("unable to get issues and signature", e4);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f7808a, bVar.f7808a) && Intrinsics.areEqual(this.f7809b, bVar.f7809b);
    }

    public final int hashCode() {
        return this.f7809b.hashCode() + (this.f7808a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f7808a + ", findByIssuerAndSignatureMethod=" + this.f7809b + ')';
    }
}
