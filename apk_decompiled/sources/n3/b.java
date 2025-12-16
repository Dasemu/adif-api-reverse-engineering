package n3;

import a.AbstractC0105a;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends AbstractC0105a {

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManager f7867c;

    /* renamed from: d, reason: collision with root package name */
    public final X509TrustManagerExtensions f7868d;

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f7867c = trustManager;
        this.f7868d = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f7867c == this.f7867c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f7867c);
    }

    @Override // a.AbstractC0105a
    public final List i(String hostname, List chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f7868d.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }
}
