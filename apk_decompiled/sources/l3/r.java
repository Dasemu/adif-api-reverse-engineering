package l3;

import a.AbstractC0105a;
import e3.C0334u;
import e3.F;
import e3.G;
import e3.I;
import e3.N;
import e3.O;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import r3.C0579k;

/* loaded from: classes3.dex */
public final class r implements j3.e {

    /* renamed from: g, reason: collision with root package name */
    public static final List f7451g = f3.c.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = f3.c.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final i3.l f7452a;

    /* renamed from: b, reason: collision with root package name */
    public final j3.g f7453b;

    /* renamed from: c, reason: collision with root package name */
    public final q f7454c;

    /* renamed from: d, reason: collision with root package name */
    public volatile y f7455d;

    /* renamed from: e, reason: collision with root package name */
    public final G f7456e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f7457f;

    public r(F client, i3.l connection, j3.g chain, q http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f7452a = connection;
        this.f7453b = chain;
        this.f7454c = http2Connection;
        List list = client.f6247r;
        G g4 = G.H2_PRIOR_KNOWLEDGE;
        this.f7456e = list.contains(g4) ? g4 : G.HTTP_2;
    }

    @Override // j3.e
    public final void a(I request) {
        int i;
        y yVar;
        boolean z3 = true;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f7455d != null) {
            return;
        }
        boolean z4 = request.f6270d != null;
        Intrinsics.checkNotNullParameter(request, "request");
        C0334u c0334u = request.f6269c;
        ArrayList requestHeaders = new ArrayList(c0334u.size() + 4);
        requestHeaders.add(new C0440c(C0440c.f7382f, request.f6268b));
        C0579k c0579k = C0440c.f7383g;
        e3.w url = request.f6267a;
        Intrinsics.checkNotNullParameter(url, "url");
        String b4 = url.b();
        String d4 = url.d();
        if (d4 != null) {
            b4 = b4 + '?' + d4;
        }
        requestHeaders.add(new C0440c(c0579k, b4));
        String b5 = request.b("Host");
        if (b5 != null) {
            requestHeaders.add(new C0440c(C0440c.i, b5));
        }
        requestHeaders.add(new C0440c(C0440c.h, url.f6413a));
        int size = c0334u.size();
        for (int i4 = 0; i4 < size; i4++) {
            String b6 = c0334u.b(i4);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = b6.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f7451g.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(c0334u.f(i4), "trailers"))) {
                requestHeaders.add(new C0440c(lowerCase, c0334u.f(i4)));
            }
        }
        q qVar = this.f7454c;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z5 = !z4;
        synchronized (qVar.f7448w) {
            synchronized (qVar) {
                try {
                    if (qVar.f7433e > 1073741823) {
                        qVar.O(EnumC0439b.REFUSED_STREAM);
                    }
                    if (qVar.f7434f) {
                        throw new IOException();
                    }
                    i = qVar.f7433e;
                    qVar.f7433e = i + 2;
                    yVar = new y(i, qVar, z5, false, null);
                    if (z4 && qVar.f7445t < qVar.f7446u && yVar.f7483e < yVar.f7484f) {
                        z3 = false;
                    }
                    if (yVar.h()) {
                        qVar.f7430b.put(Integer.valueOf(i), yVar);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            qVar.f7448w.O(z5, i, requestHeaders);
        }
        if (z3) {
            qVar.f7448w.flush();
        }
        this.f7455d = yVar;
        if (this.f7457f) {
            y yVar2 = this.f7455d;
            Intrinsics.checkNotNull(yVar2);
            yVar2.e(EnumC0439b.CANCEL);
            throw new IOException("Canceled");
        }
        y yVar3 = this.f7455d;
        Intrinsics.checkNotNull(yVar3);
        x xVar = yVar3.f7487k;
        long j4 = this.f7453b.f6954g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.g(j4);
        y yVar4 = this.f7455d;
        Intrinsics.checkNotNull(yVar4);
        yVar4.f7488l.g(this.f7453b.h);
    }

    @Override // j3.e
    public final r3.I b(O response) {
        Intrinsics.checkNotNullParameter(response, "response");
        y yVar = this.f7455d;
        Intrinsics.checkNotNull(yVar);
        return yVar.i;
    }

    @Override // j3.e
    public final void c() {
        y yVar = this.f7455d;
        Intrinsics.checkNotNull(yVar);
        yVar.f().close();
    }

    @Override // j3.e
    public final void cancel() {
        this.f7457f = true;
        y yVar = this.f7455d;
        if (yVar != null) {
            yVar.e(EnumC0439b.CANCEL);
        }
    }

    @Override // j3.e
    public final void d() {
        this.f7454c.flush();
    }

    @Override // j3.e
    public final r3.G e(I request, long j4) {
        Intrinsics.checkNotNullParameter(request, "request");
        y yVar = this.f7455d;
        Intrinsics.checkNotNull(yVar);
        return yVar.f();
    }

    @Override // j3.e
    public final long f(O response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (j3.f.a(response)) {
            return f3.c.j(response);
        }
        return 0L;
    }

    @Override // j3.e
    public final N g(boolean z3) {
        C0334u headerBlock;
        CharSequence trim;
        y yVar = this.f7455d;
        if (yVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (yVar) {
            yVar.f7487k.h();
            while (yVar.f7485g.isEmpty() && yVar.f7489m == null) {
                try {
                    yVar.k();
                } catch (Throwable th) {
                    yVar.f7487k.k();
                    throw th;
                }
            }
            yVar.f7487k.k();
            if (yVar.f7485g.isEmpty()) {
                IOException iOException = yVar.f7490n;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC0439b enumC0439b = yVar.f7489m;
                Intrinsics.checkNotNull(enumC0439b);
                throw new D(enumC0439b);
            }
            Object removeFirst = yVar.f7485g.removeFirst();
            Intrinsics.checkNotNullExpressionValue(removeFirst, "headersQueue.removeFirst()");
            headerBlock = (C0334u) removeFirst;
        }
        G protocol = this.f7456e;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = headerBlock.size();
        B0.G g4 = null;
        for (int i = 0; i < size; i++) {
            String name = headerBlock.b(i);
            String value = headerBlock.f(i);
            if (Intrinsics.areEqual(name, ":status")) {
                g4 = AbstractC0105a.L("HTTP/1.1 " + value);
            } else if (!h.contains(name)) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(name);
                trim = StringsKt__StringsKt.trim((CharSequence) value);
                arrayList.add(trim.toString());
            }
        }
        if (g4 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        N n4 = new N();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        n4.f6281b = protocol;
        n4.f6282c = g4.f102b;
        String message = (String) g4.f104d;
        Intrinsics.checkNotNullParameter(message, "message");
        n4.f6283d = message;
        n4.c(new C0334u((String[]) arrayList.toArray(new String[0])));
        if (z3 && n4.f6282c == 100) {
            return null;
        }
        return n4;
    }

    @Override // j3.e
    public final i3.l h() {
        return this.f7452a;
    }
}
