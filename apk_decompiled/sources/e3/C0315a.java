package e3;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0315a {

    /* renamed from: a, reason: collision with root package name */
    public final C0329o f6321a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f6322b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f6323c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f6324d;

    /* renamed from: e, reason: collision with root package name */
    public final C0322h f6325e;

    /* renamed from: f, reason: collision with root package name */
    public final C0329o f6326f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f6327g;
    public final w h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f6328j;

    public C0315a(String host, int i, C0329o dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0322h c0322h, C0329o proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        boolean equals;
        boolean equals2;
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f6321a = dns;
        this.f6322b = socketFactory;
        this.f6323c = sSLSocketFactory;
        this.f6324d = hostnameVerifier;
        this.f6325e = c0322h;
        this.f6326f = proxyAuthenticator;
        this.f6327g = proxySelector;
        C0335v c0335v = new C0335v();
        String scheme = sSLSocketFactory != null ? "https" : "http";
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        equals = StringsKt__StringsJVMKt.equals(scheme, "http", true);
        if (equals) {
            c0335v.f6405a = "http";
        } else {
            equals2 = StringsKt__StringsJVMKt.equals(scheme, "https", true);
            if (!equals2) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
            }
            c0335v.f6405a = "https";
        }
        Intrinsics.checkNotNullParameter(host, "host");
        String b4 = f3.a.b(C0329o.e(host, 0, 0, 7));
        if (b4 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(host));
        }
        c0335v.f6408d = b4;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "unexpected port: ").toString());
        }
        c0335v.f6409e = i;
        this.h = c0335v.a();
        this.i = f3.c.w(protocols);
        this.f6328j = f3.c.w(connectionSpecs);
    }

    public final boolean a(C0315a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f6321a, that.f6321a) && Intrinsics.areEqual(this.f6326f, that.f6326f) && Intrinsics.areEqual(this.i, that.i) && Intrinsics.areEqual(this.f6328j, that.f6328j) && Intrinsics.areEqual(this.f6327g, that.f6327g) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f6323c, that.f6323c) && Intrinsics.areEqual(this.f6324d, that.f6324d) && Intrinsics.areEqual(this.f6325e, that.f6325e) && this.h.f6417e == that.h.f6417e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0315a)) {
            return false;
        }
        C0315a c0315a = (C0315a) obj;
        return Intrinsics.areEqual(this.h, c0315a.h) && a(c0315a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f6325e) + ((Objects.hashCode(this.f6324d) + ((Objects.hashCode(this.f6323c) + ((this.f6327g.hashCode() + ((this.f6328j.hashCode() + ((this.i.hashCode() + ((this.f6326f.hashCode() + ((this.f6321a.hashCode() + com.google.android.gms.measurement.internal.a.d(this.h.i, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        w wVar = this.h;
        sb.append(wVar.f6416d);
        sb.append(':');
        sb.append(wVar.f6417e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f6327g);
        sb.append('}');
        return sb.toString();
    }
}
