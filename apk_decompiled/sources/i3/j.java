package i3;

import e3.C0329o;
import e3.C0330p;
import e3.F;
import e3.I;
import e3.InterfaceC0319e;
import e3.InterfaceC0320f;
import e3.O;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements InterfaceC0319e {

    /* renamed from: a, reason: collision with root package name */
    public final F f6860a;

    /* renamed from: b, reason: collision with root package name */
    public final I f6861b;

    /* renamed from: c, reason: collision with root package name */
    public final m f6862c;

    /* renamed from: d, reason: collision with root package name */
    public final i f6863d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f6864e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6865f;

    /* renamed from: g, reason: collision with root package name */
    public f f6866g;
    public l h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public e f6867j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6868k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6869l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6870m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f6871n;

    /* renamed from: o, reason: collision with root package name */
    public volatile e f6872o;
    public volatile l p;

    public j(F client, I originalRequest) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f6860a = client;
        this.f6861b = originalRequest;
        this.f6862c = (m) client.f6234b.f7b;
        client.f6237e.getClass();
        C0329o this_asFactory = C0329o.f6389d;
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(this, "it");
        i iVar = new i(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iVar.g(0);
        this.f6863d = iVar;
        this.f6864e = new AtomicBoolean();
        this.f6870m = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f6871n ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(jVar.f6861b.f6267a.g());
        return sb.toString();
    }

    public final void b(l connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = f3.c.f6469a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = connection;
        connection.p.add(new h(this, this.f6865f));
    }

    public final IOException c(IOException iOException) {
        IOException ioe;
        Socket j4;
        byte[] bArr = f3.c.f6469a;
        l connection = this.h;
        if (connection != null) {
            synchronized (connection) {
                j4 = j();
            }
            if (this.h == null) {
                if (j4 != null) {
                    f3.c.d(j4);
                }
                Intrinsics.checkNotNullParameter(this, "call");
                Intrinsics.checkNotNullParameter(connection, "connection");
            } else if (j4 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.i && this.f6863d.i()) {
            ioe = new InterruptedIOException("timeout");
            if (iOException != null) {
                ioe.initCause(iOException);
            }
        } else {
            ioe = iOException;
        }
        if (iOException == null) {
            Intrinsics.checkNotNullParameter(this, "call");
            return ioe;
        }
        Intrinsics.checkNotNull(ioe);
        Intrinsics.checkNotNullParameter(this, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        return ioe;
    }

    public final void cancel() {
        Socket socket;
        if (this.f6871n) {
            return;
        }
        this.f6871n = true;
        e eVar = this.f6872o;
        if (eVar != null) {
            eVar.f6844c.cancel();
        }
        l lVar = this.p;
        if (lVar != null && (socket = lVar.f6874c) != null) {
            f3.c.d(socket);
        }
        Intrinsics.checkNotNullParameter(this, "call");
    }

    public final Object clone() {
        return new j(this.f6860a, this.f6861b);
    }

    public final void d(InterfaceC0320f responseCallback) {
        g other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f6864e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        m3.n nVar = m3.n.f7829a;
        this.f6865f = m3.n.f7829a.g();
        Intrinsics.checkNotNullParameter(this, "call");
        C0330p c0330p = this.f6860a.f6233a;
        g call = new g(this, responseCallback);
        c0330p.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (c0330p) {
            c0330p.f6391b.add(call);
            String str = this.f6861b.f6267a.f6416d;
            Iterator it = c0330p.f6392c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = c0330p.f6391b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            other = null;
                            break;
                        } else {
                            other = (g) it2.next();
                            if (Intrinsics.areEqual(other.f6857c.f6861b.f6267a.f6416d, str)) {
                                break;
                            }
                        }
                    }
                } else {
                    other = (g) it.next();
                    if (Intrinsics.areEqual(other.f6857c.f6861b.f6267a.f6416d, str)) {
                        break;
                    }
                }
            }
            if (other != null) {
                Intrinsics.checkNotNullParameter(other, "other");
                call.f6856b = other.f6856b;
            }
            Unit unit = Unit.INSTANCE;
        }
        c0330p.c();
    }

    public final O e() {
        if (!this.f6864e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f6863d.h();
        m3.n nVar = m3.n.f7829a;
        this.f6865f = m3.n.f7829a.g();
        Intrinsics.checkNotNullParameter(this, "call");
        try {
            C0330p c0330p = this.f6860a.f6233a;
            synchronized (c0330p) {
                Intrinsics.checkNotNullParameter(this, "call");
                c0330p.f6393d.add(this);
            }
            return g();
        } finally {
            C0330p c0330p2 = this.f6860a.f6233a;
            c0330p2.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            c0330p2.a(c0330p2.f6393d, this);
        }
    }

    public final void f(boolean z3) {
        e eVar;
        synchronized (this) {
            if (!this.f6870m) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z3 && (eVar = this.f6872o) != null) {
            eVar.f6844c.cancel();
            eVar.f6842a.h(eVar, true, true, null);
        }
        this.f6867j = null;
    }

    public final O g() {
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f6860a.f6235c);
        arrayList.add(new j3.a(this.f6860a));
        arrayList.add(new j3.a(this.f6860a.f6240j));
        this.f6860a.getClass();
        arrayList.add(new Object());
        arrayList.add(a.f6826a);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f6860a.f6236d);
        arrayList.add(new Object());
        I i = this.f6861b;
        F f2 = this.f6860a;
        try {
            try {
                O b4 = new j3.g(this, arrayList, 0, null, i, f2.f6251v, f2.f6252w, f2.f6253x).b(this.f6861b);
                if (this.f6871n) {
                    f3.c.c(b4);
                    throw new IOException("Canceled");
                }
                i(null);
                return b4;
            } catch (IOException e4) {
                IOException i4 = i(e4);
                Intrinsics.checkNotNull(i4, "null cannot be cast to non-null type kotlin.Throwable");
                throw i4;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001c), top: B:48:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001c), top: B:48:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException h(i3.e r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            i3.e r0 = r2.f6872o
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 != 0) goto Le
            goto L60
        Le:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L1a
            boolean r1 = r2.f6868k     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L20
            goto L1a
        L18:
            r3 = move-exception
            goto L61
        L1a:
            if (r5 == 0) goto L41
            boolean r1 = r2.f6869l     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L41
        L20:
            if (r4 == 0) goto L24
            r2.f6868k = r0     // Catch: java.lang.Throwable -> L18
        L24:
            if (r5 == 0) goto L28
            r2.f6869l = r0     // Catch: java.lang.Throwable -> L18
        L28:
            boolean r4 = r2.f6868k     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L32
            boolean r5 = r2.f6869l     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L32
            r5 = r3
            goto L33
        L32:
            r5 = r0
        L33:
            if (r4 != 0) goto L3e
            boolean r4 = r2.f6869l     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            boolean r4 = r2.f6870m     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            r0 = r3
        L3e:
            r4 = r0
            r0 = r5
            goto L42
        L41:
            r4 = r0
        L42:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L59
            r5 = 0
            r2.f6872o = r5
            i3.l r5 = r2.h
            if (r5 == 0) goto L59
            monitor-enter(r5)
            int r0 = r5.f6882m     // Catch: java.lang.Throwable -> L56
            int r0 = r0 + r3
            r5.f6882m = r0     // Catch: java.lang.Throwable -> L56
            monitor-exit(r5)
            goto L59
        L56:
            r2 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L56
            throw r2
        L59:
            if (r4 == 0) goto L60
            java.io.IOException r2 = r2.c(r6)
            return r2
        L60:
            return r6
        L61:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.j.h(i3.e, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException i(IOException iOException) {
        boolean z3;
        synchronized (this) {
            try {
                z3 = false;
                if (this.f6870m) {
                    this.f6870m = false;
                    if (!this.f6868k && !this.f6869l) {
                        z3 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3 ? c(iOException) : iOException;
    }

    public final Socket j() {
        l connection = this.h;
        Intrinsics.checkNotNull(connection);
        byte[] bArr = f3.c.f6469a;
        ArrayList arrayList = connection.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.h = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        connection.f6885q = System.nanoTime();
        m mVar = this.f6862c;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr2 = f3.c.f6469a;
        boolean z3 = connection.f6879j;
        h3.c cVar = mVar.f6887b;
        if (!z3) {
            cVar.c(mVar.f6888c, 0L);
            return null;
        }
        connection.f6879j = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = mVar.f6889d;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = connection.f6875d;
        Intrinsics.checkNotNull(socket);
        return socket;
    }
}
