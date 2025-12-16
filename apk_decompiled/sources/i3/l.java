package i3;

import C.w;
import a.AbstractC0105a;
import a.AbstractC0106b;
import androidx.fragment.app.C0163o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e3.C0315a;
import e3.C0322h;
import e3.C0326l;
import e3.C0329o;
import e3.C0332s;
import e3.C0333t;
import e3.F;
import e3.G;
import e3.H;
import e3.I;
import e3.InterfaceC0319e;
import e3.N;
import e3.O;
import e3.Q;
import e3.U;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__IndentKt;
import l3.EnumC0439b;
import l3.q;
import l3.r;
import l3.y;
import l3.z;
import r3.B;
import r3.C;

/* loaded from: classes3.dex */
public final class l extends l3.i {

    /* renamed from: b, reason: collision with root package name */
    public final U f6873b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f6874c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f6875d;

    /* renamed from: e, reason: collision with root package name */
    public C0332s f6876e;

    /* renamed from: f, reason: collision with root package name */
    public G f6877f;

    /* renamed from: g, reason: collision with root package name */
    public q f6878g;
    public C h;
    public B i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6879j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6880k;

    /* renamed from: l, reason: collision with root package name */
    public int f6881l;

    /* renamed from: m, reason: collision with root package name */
    public int f6882m;

    /* renamed from: n, reason: collision with root package name */
    public int f6883n;

    /* renamed from: o, reason: collision with root package name */
    public int f6884o;
    public final ArrayList p;

    /* renamed from: q, reason: collision with root package name */
    public long f6885q;

    public l(m connectionPool, U route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f6873b = route;
        this.f6884o = 1;
        this.p = new ArrayList();
        this.f6885q = LongCompanionObject.MAX_VALUE;
    }

    public static void d(F client, U failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f6312b.type() != Proxy.Type.DIRECT) {
            C0315a c0315a = failedRoute.f6311a;
            c0315a.f6327g.connectFailed(c0315a.h.h(), failedRoute.f6312b.address(), failure);
        }
        h3.d dVar = client.f6254y;
        synchronized (dVar) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            ((LinkedHashSet) dVar.f6791b).add(failedRoute);
        }
    }

    @Override // l3.i
    public final synchronized void a(q connection, l3.C settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f6884o = (settings.f7370a & 16) != 0 ? settings.f7371b[4] : Integer.MAX_VALUE;
    }

    @Override // l3.i
    public final void b(y stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(EnumC0439b.REFUSED_STREAM, null);
    }

    public final void c(int i, int i4, int i5, boolean z3, InterfaceC0319e call) {
        U u3;
        C0329o eventListener = C0329o.f6389d;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (this.f6877f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f6873b.f6311a.f6328j;
        b bVar = new b(list);
        C0315a c0315a = this.f6873b.f6311a;
        if (c0315a.f6323c == null) {
            if (!list.contains(C0326l.f6371f)) {
                throw new n(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f6873b.f6311a.h.f6416d;
            m3.n nVar = m3.n.f7829a;
            if (!m3.n.f7829a.h(str)) {
                throw new n(new UnknownServiceException(w.o("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c0315a.i.contains(G.H2_PRIOR_KNOWLEDGE)) {
            throw new n(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        n nVar2 = null;
        do {
            try {
                U u4 = this.f6873b;
                if (u4.f6311a.f6323c != null && u4.f6312b.type() == Proxy.Type.HTTP) {
                    f(i, i4, i5, call);
                    if (this.f6874c == null) {
                        u3 = this.f6873b;
                        if (u3.f6311a.f6323c == null && u3.f6312b.type() == Proxy.Type.HTTP && this.f6874c == null) {
                            throw new n(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f6885q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i4, call);
                }
                g(bVar, call);
                U u5 = this.f6873b;
                InetSocketAddress inetSocketAddress = u5.f6313c;
                Proxy proxy = u5.f6312b;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                u3 = this.f6873b;
                if (u3.f6311a.f6323c == null) {
                }
                this.f6885q = System.nanoTime();
                return;
            } catch (IOException e4) {
                Socket socket = this.f6875d;
                if (socket != null) {
                    f3.c.d(socket);
                }
                Socket socket2 = this.f6874c;
                if (socket2 != null) {
                    f3.c.d(socket2);
                }
                this.f6875d = null;
                this.f6874c = null;
                this.h = null;
                this.i = null;
                this.f6876e = null;
                this.f6877f = null;
                this.f6878g = null;
                this.f6884o = 1;
                U u6 = this.f6873b;
                InetSocketAddress inetSocketAddress2 = u6.f6313c;
                Proxy proxy2 = u6.f6312b;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(inetSocketAddress2, "inetSocketAddress");
                Intrinsics.checkNotNullParameter(proxy2, "proxy");
                Intrinsics.checkNotNullParameter(e4, "ioe");
                if (nVar2 == null) {
                    nVar2 = new n(e4);
                } else {
                    Intrinsics.checkNotNullParameter(e4, "e");
                    ExceptionsKt.addSuppressed(nVar2.f6890a, e4);
                    nVar2.f6891b = e4;
                }
                if (!z3) {
                    throw nVar2;
                }
                Intrinsics.checkNotNullParameter(e4, "e");
                bVar.f6830d = true;
                if (!bVar.f6829c) {
                    throw nVar2;
                }
                if (e4 instanceof ProtocolException) {
                    throw nVar2;
                }
                if (e4 instanceof InterruptedIOException) {
                    throw nVar2;
                }
                if ((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) {
                    throw nVar2;
                }
                if (e4 instanceof SSLPeerUnverifiedException) {
                    throw nVar2;
                }
            }
        } while (e4 instanceof SSLException);
        throw nVar2;
    }

    public final void e(int i, int i4, InterfaceC0319e call) {
        Socket createSocket;
        U u3 = this.f6873b;
        Proxy proxy = u3.f6312b;
        C0315a c0315a = u3.f6311a;
        Proxy.Type type = proxy.type();
        int i5 = type == null ? -1 : k.$EnumSwitchMapping$0[type.ordinal()];
        if (i5 == 1 || i5 == 2) {
            createSocket = c0315a.f6322b.createSocket();
            Intrinsics.checkNotNull(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f6874c = createSocket;
        InetSocketAddress inetSocketAddress = this.f6873b.f6313c;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        createSocket.setSoTimeout(i4);
        try {
            m3.n nVar = m3.n.f7829a;
            m3.n.f7829a.e(createSocket, this.f6873b.f6313c, i);
            try {
                this.h = AbstractC0105a.d(AbstractC0105a.S(createSocket));
                this.i = AbstractC0105a.c(AbstractC0105a.Q(createSocket));
            } catch (NullPointerException e4) {
                if (Intrinsics.areEqual(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e5) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f6873b.f6313c);
            connectException.initCause(e5);
            throw connectException;
        }
    }

    public final void f(int i, int i4, int i5, InterfaceC0319e interfaceC0319e) {
        H h = new H();
        U u3 = this.f6873b;
        e3.w url = u3.f6311a.h;
        Intrinsics.checkNotNullParameter(url, "url");
        h.f6262a = url;
        h.d("CONNECT", null);
        C0315a c0315a = u3.f6311a;
        h.c("Host", f3.c.v(c0315a.h, true));
        h.c("Proxy-Connection", "Keep-Alive");
        h.c("User-Agent", "okhttp/4.12.0");
        I request = h.a();
        C0333t c0333t = new C0333t();
        Intrinsics.checkNotNullParameter(request, "request");
        G protocol = G.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", "message");
        Q q4 = f3.c.f6471c;
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
        AbstractC0105a.g("Proxy-Authenticate");
        AbstractC0105a.h("OkHttp-Preemptive", "Proxy-Authenticate");
        c0333t.e("Proxy-Authenticate");
        c0333t.b("Proxy-Authenticate", "OkHttp-Preemptive");
        O response = new O(request, protocol, "Preemptive Authenticate", 407, null, c0333t.d(), q4, null, null, null, -1L, -1L, null);
        c0315a.f6326f.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        e(i, i4, interfaceC0319e);
        String str = "CONNECT " + f3.c.v(request.f6267a, true) + " HTTP/1.1";
        C c4 = this.h;
        Intrinsics.checkNotNull(c4);
        B b4 = this.i;
        Intrinsics.checkNotNull(b4);
        o oVar = new o(null, this, c4, b4);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c4.f8245a.timeout().g(i4);
        b4.f8242a.timeout().g(i5);
        oVar.l(request.f6269c, str);
        oVar.c();
        N g4 = oVar.g(false);
        Intrinsics.checkNotNull(g4);
        g4.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        g4.f6280a = request;
        O response2 = g4.a();
        Intrinsics.checkNotNullParameter(response2, "response");
        long j4 = f3.c.j(response2);
        if (j4 != -1) {
            k3.d k4 = oVar.k(j4);
            f3.c.t(k4, Integer.MAX_VALUE);
            k4.close();
        }
        int i6 = response2.f6294d;
        if (i6 == 200) {
            if (!c4.f8246b.x() || !b4.f8243b.x()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (i6 != 407) {
                throw new IOException(com.google.android.gms.measurement.internal.a.l(i6, "Unexpected response code for CONNECT: "));
            }
            c0315a.f6326f.getClass();
            Intrinsics.checkNotNullParameter(response2, "response");
            throw new IOException("Failed to authenticate with proxy");
        }
    }

    public final void g(b bVar, InterfaceC0319e call) {
        String trimMargin$default;
        int i = 2;
        C0315a c0315a = this.f6873b.f6311a;
        SSLSocketFactory sSLSocketFactory = c0315a.f6323c;
        G g4 = G.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c0315a.i;
            G g5 = G.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(g5)) {
                this.f6875d = this.f6874c;
                this.f6877f = g4;
                return;
            } else {
                this.f6875d = this.f6874c;
                this.f6877f = g5;
                l();
                return;
            }
        }
        Intrinsics.checkNotNullParameter(call, "call");
        C0315a c0315a2 = this.f6873b.f6311a;
        SSLSocketFactory sSLSocketFactory2 = c0315a2.f6323c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory2);
            Socket socket = this.f6874c;
            e3.w wVar = c0315a2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, wVar.f6416d, wVar.f6417e, true);
            Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                C0326l a2 = bVar.a(sSLSocket2);
                if (a2.f6373b) {
                    m3.n nVar = m3.n.f7829a;
                    m3.n.f7829a.d(sSLSocket2, c0315a2.h.f6416d, c0315a2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                C0332s o4 = m3.l.o(sslSocketSession);
                HostnameVerifier hostnameVerifier = c0315a2.f6324d;
                Intrinsics.checkNotNull(hostnameVerifier);
                if (hostnameVerifier.verify(c0315a2.h.f6416d, sslSocketSession)) {
                    C0322h c0322h = c0315a2.f6325e;
                    Intrinsics.checkNotNull(c0322h);
                    this.f6876e = new C0332s(o4.f6399a, o4.f6400b, o4.f6401c, new C0163o(c0322h, o4, c0315a2, i));
                    c0322h.a(c0315a2.h.f6416d, new J0.e(this, 10));
                    if (a2.f6373b) {
                        m3.n nVar2 = m3.n.f7829a;
                        str = m3.n.f7829a.f(sSLSocket2);
                    }
                    this.f6875d = sSLSocket2;
                    this.h = AbstractC0105a.d(AbstractC0105a.S(sSLSocket2));
                    this.i = AbstractC0105a.c(AbstractC0105a.Q(sSLSocket2));
                    if (str != null) {
                        g4 = AbstractC0106b.i(str);
                    }
                    this.f6877f = g4;
                    m3.n nVar3 = m3.n.f7829a;
                    m3.n.f7829a.a(sSLSocket2);
                    Intrinsics.checkNotNullParameter(call, "call");
                    if (this.f6877f == G.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a4 = o4.a();
                if (a4.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0315a2.h.f6416d + " not verified (no certificates)");
                }
                Object obj = a4.get(0);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c0315a2.h.f6416d);
                sb.append(" not verified:\n              |    certificate: ");
                C0322h c0322h2 = C0322h.f6346c;
                sb.append(m3.d.C(certificate));
                sb.append("\n              |    DN: ");
                sb.append(certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                Intrinsics.checkNotNullParameter(certificate, "certificate");
                sb.append(CollectionsKt.plus((Collection) q3.c.a(certificate, 7), (Iterable) q3.c.a(certificate, 2)));
                sb.append("\n              ");
                trimMargin$default = StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null);
                throw new SSLPeerUnverifiedException(trimMargin$default);
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    m3.n nVar4 = m3.n.f7829a;
                    m3.n.f7829a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    f3.c.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
    
        if (q3.c.c(r1, (java.security.cert.X509Certificate) r10) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(e3.C0315a r9, java.util.ArrayList r10) {
        /*
            r8 = this;
            r0 = 1
            java.lang.String r1 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            byte[] r1 = f3.c.f6469a
            java.util.ArrayList r1 = r8.p
            int r1 = r1.size()
            int r2 = r8.f6884o
            r3 = 0
            if (r1 >= r2) goto Ldc
            boolean r1 = r8.f6879j
            if (r1 == 0) goto L19
            goto Ldc
        L19:
            e3.U r1 = r8.f6873b
            e3.a r2 = r1.f6311a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L25
            goto Ldc
        L25:
            e3.w r2 = r9.h
            java.lang.String r4 = r2.f6416d
            e3.a r5 = r1.f6311a
            e3.w r6 = r5.h
            java.lang.String r6 = r6.f6416d
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
            if (r4 == 0) goto L36
            return r0
        L36:
            l3.q r4 = r8.f6878g
            if (r4 != 0) goto L3c
            goto Ldc
        L3c:
            if (r10 == 0) goto Ldc
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L46
            goto Ldc
        L46:
            java.util.Iterator r10 = r10.iterator()
        L4a:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto Ldc
            java.lang.Object r4 = r10.next()
            e3.U r4 = (e3.U) r4
            java.net.Proxy r6 = r4.f6312b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L4a
            java.net.Proxy r6 = r1.f6312b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L4a
            java.net.InetSocketAddress r4 = r4.f6313c
            java.net.InetSocketAddress r6 = r1.f6313c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
            if (r4 == 0) goto L4a
            q3.c r10 = q3.c.f8192a
            javax.net.ssl.HostnameVerifier r1 = r9.f6324d
            if (r1 == r10) goto L79
            goto Ldc
        L79:
            byte[] r10 = f3.c.f6469a
            e3.w r10 = r5.h
            int r1 = r10.f6417e
            int r4 = r2.f6417e
            if (r4 == r1) goto L84
            goto Ldc
        L84:
            java.lang.String r10 = r10.f6416d
            java.lang.String r1 = r2.f6416d
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r10)
            if (r10 == 0) goto L8f
            goto Lb8
        L8f:
            boolean r10 = r8.f6880k
            if (r10 != 0) goto Ldc
            e3.s r10 = r8.f6876e
            if (r10 == 0) goto Ldc
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            java.util.List r10 = r10.a()
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Ldc
            java.lang.Object r10 = r10.get(r3)
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r2)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = q3.c.c(r1, r10)
            if (r10 == 0) goto Ldc
        Lb8:
            e3.h r9 = r9.f6325e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldc
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldc
            e3.s r8 = r8.f6876e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldc
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldc
            java.util.List r8 = r8.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldc
            r9.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldc
            java.lang.String r10 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldc
            java.lang.String r10 = "peerCertificates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldc
            androidx.fragment.app.o r10 = new androidx.fragment.app.o     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldc
            r10.<init>(r9, r8, r1, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldc
            r9.a(r1, r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldc
            return r0
        Ldc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.l.h(e3.a, java.util.ArrayList):boolean");
    }

    public final boolean i(boolean z3) {
        long j4;
        byte[] bArr = f3.c.f6469a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f6874c;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f6875d;
        Intrinsics.checkNotNull(socket2);
        C source = this.h;
        Intrinsics.checkNotNull(source);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        q qVar = this.f6878g;
        if (qVar != null) {
            synchronized (qVar) {
                if (qVar.f7434f) {
                    return false;
                }
                if (qVar.f7440n < qVar.f7439m) {
                    if (nanoTime >= qVar.f7441o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j4 = nanoTime - this.f6885q;
        }
        if (j4 < 10000000000L || !z3) {
            return true;
        }
        Intrinsics.checkNotNullParameter(socket2, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !source.d();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final j3.e j(F client, j3.g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f6875d;
        Intrinsics.checkNotNull(socket);
        C c4 = this.h;
        Intrinsics.checkNotNull(c4);
        B b4 = this.i;
        Intrinsics.checkNotNull(b4);
        q qVar = this.f6878g;
        if (qVar != null) {
            return new r(client, this, chain, qVar);
        }
        int i = chain.f6954g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c4.f8245a.timeout().g(i);
        b4.f8242a.timeout().g(chain.h);
        return new o(client, this, c4, b4);
    }

    public final synchronized void k() {
        this.f6879j = true;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [I0.g, java.lang.Object] */
    public final void l() {
        Socket socket = this.f6875d;
        Intrinsics.checkNotNull(socket);
        C source = this.h;
        Intrinsics.checkNotNull(source);
        B sink = this.i;
        Intrinsics.checkNotNull(sink);
        socket.setSoTimeout(0);
        h3.e taskRunner = h3.e.i;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        ?? obj = new Object();
        obj.f753a = taskRunner;
        obj.f758f = l3.i.f7407a;
        String peerName = this.f6873b.f6311a.h.f6416d;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        obj.f754b = socket;
        String str = f3.c.f6475g + ' ' + peerName;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        obj.f755c = str;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        obj.f756d = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        obj.f757e = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        obj.f758f = this;
        q qVar = new q(obj);
        this.f6878g = qVar;
        l3.C c4 = q.f7428z;
        this.f6884o = (c4.f7370a & 16) != 0 ? c4.f7371b[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        z zVar = qVar.f7448w;
        synchronized (zVar) {
            try {
                if (zVar.f7495d) {
                    throw new IOException("closed");
                }
                Logger logger = z.f7491f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f3.c.h(">> CONNECTION " + l3.g.f7403a.e(), new Object[0]));
                }
                zVar.f7492a.F(l3.g.f7403a);
                zVar.f7492a.flush();
            } finally {
            }
        }
        z zVar2 = qVar.f7448w;
        l3.C settings = qVar.p;
        synchronized (zVar2) {
            try {
                Intrinsics.checkNotNullParameter(settings, "settings");
                if (zVar2.f7495d) {
                    throw new IOException("closed");
                }
                zVar2.s(0, Integer.bitCount(settings.f7370a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z3 = true;
                    if (((1 << i) & settings.f7370a) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        zVar2.f7492a.m(i != 4 ? i != 7 ? i : 4 : 3);
                        zVar2.f7492a.r(settings.f7371b[i]);
                    }
                    i++;
                }
                zVar2.f7492a.flush();
            } finally {
            }
        }
        if (qVar.p.a() != 65535) {
            qVar.f7448w.a0(0, r9 - 65535);
        }
        taskRunner.e().c(new h3.b(qVar.f7449x, 0, qVar.f7431c), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        U u3 = this.f6873b;
        sb.append(u3.f6311a.h.f6416d);
        sb.append(':');
        sb.append(u3.f6311a.h.f6417e);
        sb.append(", proxy=");
        sb.append(u3.f6312b);
        sb.append(" hostAddress=");
        sb.append(u3.f6313c);
        sb.append(" cipherSuite=");
        C0332s c0332s = this.f6876e;
        if (c0332s == null || (obj = c0332s.f6400b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f6877f);
        sb.append('}');
        return sb.toString();
    }
}
