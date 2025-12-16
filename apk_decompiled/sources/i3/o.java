package i3;

import a.AbstractC0105a;
import androidx.recyclerview.widget.C0221i;
import e3.C0315a;
import e3.C0329o;
import e3.C0334u;
import e3.F;
import e3.I;
import e3.InterfaceC0319e;
import e3.M;
import e3.N;
import e3.O;
import e3.w;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import r3.B;
import r3.C;
import r3.G;
import r3.J;
import r3.K;
import r3.q;

/* loaded from: classes3.dex */
public final class o implements j3.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6892a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6893b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6894c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6895d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6896e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6897f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f6898g;

    public o(C0315a address, h3.d routeDatabase, InterfaceC0319e call) {
        List proxies;
        C0329o eventListener = C0329o.f6389d;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f6893b = address;
        this.f6894c = routeDatabase;
        this.f6895d = call;
        this.f6896e = CollectionsKt.emptyList();
        this.f6897f = CollectionsKt.emptyList();
        this.f6898g = new ArrayList();
        Intrinsics.checkNotNullParameter(call, "call");
        w url = address.h;
        Intrinsics.checkNotNullParameter(url, "url");
        URI h = url.h();
        if (h.getHost() == null) {
            proxies = f3.c.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> proxiesOrNull = address.f6327g.select(h);
            List<Proxy> list = proxiesOrNull;
            if (list != null && !list.isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                proxies = f3.c.w(proxiesOrNull);
            } else {
                proxies = f3.c.k(Proxy.NO_PROXY);
            }
        }
        this.f6896e = proxies;
        this.f6892a = 0;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public static final void i(o oVar, q qVar) {
        oVar.getClass();
        K k4 = qVar.f8301e;
        J delegate = K.f8261d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        qVar.f8301e = delegate;
        k4.a();
        k4.b();
    }

    @Override // j3.e
    public void a(I request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = ((l) this.f6894c).f6873b.f6312b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.f6268b);
        sb.append(' ');
        w url = request.f6267a;
        if (url.f6420j || proxyType != Proxy.Type.HTTP) {
            Intrinsics.checkNotNullParameter(url, "url");
            String b4 = url.b();
            String d4 = url.d();
            if (d4 != null) {
                b4 = b4 + '?' + d4;
            }
            sb.append(b4);
        } else {
            sb.append(url);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        l(request.f6269c, sb2);
    }

    @Override // j3.e
    public r3.I b(O response) {
        boolean equals;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!j3.f.a(response)) {
            return k(0L);
        }
        equals = StringsKt__StringsJVMKt.equals("chunked", O.d(response, "Transfer-Encoding"), true);
        if (equals) {
            w wVar = response.f6291a.f6267a;
            if (this.f6892a == 4) {
                this.f6892a = 5;
                return new k3.c(this, wVar);
            }
            throw new IllegalStateException(("state: " + this.f6892a).toString());
        }
        long j4 = f3.c.j(response);
        if (j4 != -1) {
            return k(j4);
        }
        if (this.f6892a == 4) {
            this.f6892a = 5;
            ((l) this.f6894c).k();
            return new k3.a(this);
        }
        throw new IllegalStateException(("state: " + this.f6892a).toString());
    }

    @Override // j3.e
    public void c() {
        ((B) this.f6896e).flush();
    }

    @Override // j3.e
    public void cancel() {
        Socket socket = ((l) this.f6894c).f6874c;
        if (socket != null) {
            f3.c.d(socket);
        }
    }

    @Override // j3.e
    public void d() {
        ((B) this.f6896e).flush();
    }

    @Override // j3.e
    public G e(I request, long j4) {
        boolean equals;
        Intrinsics.checkNotNullParameter(request, "request");
        M m4 = request.f6270d;
        if (m4 != null && m4.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        equals = StringsKt__StringsJVMKt.equals("chunked", request.b("Transfer-Encoding"), true);
        if (equals) {
            if (this.f6892a == 1) {
                this.f6892a = 2;
                return new k3.b(this);
            }
            throw new IllegalStateException(("state: " + this.f6892a).toString());
        }
        if (j4 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f6892a == 1) {
            this.f6892a = 2;
            return new k3.e(this);
        }
        throw new IllegalStateException(("state: " + this.f6892a).toString());
    }

    @Override // j3.e
    public long f(O response) {
        boolean equals;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!j3.f.a(response)) {
            return 0L;
        }
        equals = StringsKt__StringsJVMKt.equals("chunked", O.d(response, "Transfer-Encoding"), true);
        if (equals) {
            return -1L;
        }
        return f3.c.j(response);
    }

    @Override // j3.e
    public N g(boolean z3) {
        C0221i c0221i = (C0221i) this.f6897f;
        int i = this.f6892a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f6892a).toString());
        }
        try {
            String a02 = ((C) c0221i.f3825c).a0(c0221i.f3824b);
            c0221i.f3824b -= a02.length();
            B0.G L3 = AbstractC0105a.L(a02);
            int i4 = L3.f102b;
            N n4 = new N();
            e3.G protocol = (e3.G) L3.f103c;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            n4.f6281b = protocol;
            n4.f6282c = i4;
            String message = (String) L3.f104d;
            Intrinsics.checkNotNullParameter(message, "message");
            n4.f6283d = message;
            n4.c(c0221i.f());
            if (z3 && i4 == 100) {
                return null;
            }
            if (i4 == 100) {
                this.f6892a = 3;
                return n4;
            }
            if (102 > i4 || i4 >= 200) {
                this.f6892a = 4;
                return n4;
            }
            this.f6892a = 3;
            return n4;
        } catch (EOFException e4) {
            throw new IOException(C.w.z("unexpected end of stream on ", ((l) this.f6894c).f6873b.f6311a.h.g()), e4);
        }
    }

    @Override // j3.e
    public l h() {
        return (l) this.f6894c;
    }

    public boolean j() {
        return this.f6892a < ((List) this.f6896e).size() || !((ArrayList) this.f6898g).isEmpty();
    }

    public k3.d k(long j4) {
        if (this.f6892a == 4) {
            this.f6892a = 5;
            return new k3.d(this, j4);
        }
        throw new IllegalStateException(("state: " + this.f6892a).toString());
    }

    public void l(C0334u headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f6892a != 0) {
            throw new IllegalStateException(("state: " + this.f6892a).toString());
        }
        B b4 = (B) this.f6896e;
        b4.Q(requestLine);
        b4.Q("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            b4.Q(headers.b(i));
            b4.Q(": ");
            b4.Q(headers.f(i));
            b4.Q("\r\n");
        }
        b4.Q("\r\n");
        this.f6892a = 1;
    }

    public o(F f2, l connection, C source, B sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f6893b = f2;
        this.f6894c = connection;
        this.f6895d = source;
        this.f6896e = sink;
        this.f6897f = new C0221i(source);
    }
}
