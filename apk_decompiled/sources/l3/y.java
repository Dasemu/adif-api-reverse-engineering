package l3;

import e3.C0334u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f7479a;

    /* renamed from: b, reason: collision with root package name */
    public final q f7480b;

    /* renamed from: c, reason: collision with root package name */
    public long f7481c;

    /* renamed from: d, reason: collision with root package name */
    public long f7482d;

    /* renamed from: e, reason: collision with root package name */
    public long f7483e;

    /* renamed from: f, reason: collision with root package name */
    public long f7484f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f7485g;
    public boolean h;
    public final w i;

    /* renamed from: j, reason: collision with root package name */
    public final v f7486j;

    /* renamed from: k, reason: collision with root package name */
    public final x f7487k;

    /* renamed from: l, reason: collision with root package name */
    public final x f7488l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC0439b f7489m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f7490n;

    public y(int i, q connection, boolean z3, boolean z4, C0334u c0334u) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f7479a = i;
        this.f7480b = connection;
        this.f7484f = connection.f7442q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f7485g = arrayDeque;
        this.i = new w(this, connection.p.a(), z4);
        this.f7486j = new v(this, z3);
        this.f7487k = new x(this);
        this.f7488l = new x(this);
        if (c0334u == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c0334u);
        }
    }

    public final void a() {
        boolean z3;
        boolean h;
        byte[] bArr = f3.c.f6469a;
        synchronized (this) {
            try {
                w wVar = this.i;
                if (!wVar.f7473b && wVar.f7476e) {
                    v vVar = this.f7486j;
                    if (vVar.f7468a || vVar.f7470c) {
                        z3 = true;
                        h = h();
                        Unit unit = Unit.INSTANCE;
                    }
                }
                z3 = false;
                h = h();
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            c(EnumC0439b.CANCEL, null);
        } else {
            if (h) {
                return;
            }
            this.f7480b.x(this.f7479a);
        }
    }

    public final void b() {
        v vVar = this.f7486j;
        if (vVar.f7470c) {
            throw new IOException("stream closed");
        }
        if (vVar.f7468a) {
            throw new IOException("stream finished");
        }
        if (this.f7489m != null) {
            IOException iOException = this.f7490n;
            if (iOException != null) {
                throw iOException;
            }
            EnumC0439b enumC0439b = this.f7489m;
            Intrinsics.checkNotNull(enumC0439b);
            throw new D(enumC0439b);
        }
    }

    public final void c(EnumC0439b statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            q qVar = this.f7480b;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            qVar.f7448w.Z(this.f7479a, statusCode);
        }
    }

    public final boolean d(EnumC0439b enumC0439b, IOException iOException) {
        byte[] bArr = f3.c.f6469a;
        synchronized (this) {
            if (this.f7489m != null) {
                return false;
            }
            this.f7489m = enumC0439b;
            this.f7490n = iOException;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.i.f7473b && this.f7486j.f7468a) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
            this.f7480b.x(this.f7479a);
            return true;
        }
    }

    public final void e(EnumC0439b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f7480b.a0(this.f7479a, errorCode);
        }
    }

    public final v f() {
        synchronized (this) {
            try {
                if (!this.h && !g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f7486j;
    }

    public final boolean g() {
        boolean z3 = (this.f7479a & 1) == 1;
        this.f7480b.getClass();
        return true == z3;
    }

    public final synchronized boolean h() {
        if (this.f7489m != null) {
            return false;
        }
        w wVar = this.i;
        if (wVar.f7473b || wVar.f7476e) {
            v vVar = this.f7486j;
            if (vVar.f7468a || vVar.f7470c) {
                if (this.h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(e3.C0334u r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r0 = f3.c.f6469a
            monitor-enter(r2)
            boolean r0 = r2.h     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 == 0) goto L18
            if (r4 != 0) goto L10
            goto L18
        L10:
            l3.w r3 = r2.i     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r3 = move-exception
            goto L3e
        L18:
            r2.h = r1     // Catch: java.lang.Throwable -> L16
            java.util.ArrayDeque r0 = r2.f7485g     // Catch: java.lang.Throwable -> L16
            r0.add(r3)     // Catch: java.lang.Throwable -> L16
        L1f:
            if (r4 == 0) goto L25
            l3.w r3 = r2.i     // Catch: java.lang.Throwable -> L16
            r3.f7473b = r1     // Catch: java.lang.Throwable -> L16
        L25:
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)     // Catch: java.lang.Throwable -> L16
            r2.notifyAll()     // Catch: java.lang.Throwable -> L16
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            if (r3 != 0) goto L3d
            l3.q r3 = r2.f7480b
            int r2 = r2.f7479a
            r3.x(r2)
        L3d:
            return
        L3e:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.y.i(e3.u, boolean):void");
    }

    public final synchronized void j(EnumC0439b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f7489m == null) {
            this.f7489m = errorCode;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void k() {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
