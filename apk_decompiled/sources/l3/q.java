package l3;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class q implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final C f7428z;

    /* renamed from: a, reason: collision with root package name */
    public final i f7429a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7430b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7431c;

    /* renamed from: d, reason: collision with root package name */
    public int f7432d;

    /* renamed from: e, reason: collision with root package name */
    public int f7433e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7434f;

    /* renamed from: g, reason: collision with root package name */
    public final h3.e f7435g;
    public final h3.c h;
    public final h3.c i;

    /* renamed from: j, reason: collision with root package name */
    public final h3.c f7436j;

    /* renamed from: k, reason: collision with root package name */
    public final B f7437k;

    /* renamed from: l, reason: collision with root package name */
    public long f7438l;

    /* renamed from: m, reason: collision with root package name */
    public long f7439m;

    /* renamed from: n, reason: collision with root package name */
    public long f7440n;

    /* renamed from: o, reason: collision with root package name */
    public long f7441o;
    public final C p;

    /* renamed from: q, reason: collision with root package name */
    public C f7442q;

    /* renamed from: r, reason: collision with root package name */
    public long f7443r;

    /* renamed from: s, reason: collision with root package name */
    public long f7444s;

    /* renamed from: t, reason: collision with root package name */
    public long f7445t;

    /* renamed from: u, reason: collision with root package name */
    public long f7446u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f7447v;

    /* renamed from: w, reason: collision with root package name */
    public final z f7448w;

    /* renamed from: x, reason: collision with root package name */
    public final l f7449x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f7450y;

    static {
        C c4 = new C();
        c4.c(7, 65535);
        c4.c(5, 16384);
        f7428z = c4;
    }

    public q(I0.g builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f7429a = (i) builder.f758f;
        this.f7430b = new LinkedHashMap();
        String str = (String) builder.f755c;
        r3.C c4 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            str = null;
        }
        this.f7431c = str;
        this.f7433e = 3;
        h3.e eVar = (h3.e) builder.f753a;
        this.f7435g = eVar;
        this.h = eVar.e();
        this.i = eVar.e();
        this.f7436j = eVar.e();
        this.f7437k = B.f7369a;
        C c5 = new C();
        c5.c(7, 16777216);
        this.p = c5;
        this.f7442q = f7428z;
        this.f7446u = r0.a();
        Socket socket = (Socket) builder.f754b;
        if (socket == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            socket = null;
        }
        this.f7447v = socket;
        r3.B b4 = (r3.B) builder.f757e;
        if (b4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            b4 = null;
        }
        this.f7448w = new z(b4);
        r3.C c6 = (r3.C) builder.f756d;
        if (c6 != null) {
            c4 = c6;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("source");
        }
        this.f7449x = new l(this, new u(c4));
        this.f7450y = new LinkedHashSet();
    }

    public final void O(EnumC0439b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f7448w) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.f7434f) {
                    return;
                }
                this.f7434f = true;
                int i = this.f7432d;
                intRef.element = i;
                Unit unit = Unit.INSTANCE;
                this.f7448w.x(i, statusCode, f3.c.f6469a);
            }
        }
    }

    public final synchronized void Y(long j4) {
        long j5 = this.f7443r + j4;
        this.f7443r = j5;
        long j6 = j5 - this.f7444s;
        if (j6 >= this.p.a() / 2) {
            b0(0, j6);
            this.f7444s += j6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f7448w.f7494c);
        r6 = r2;
        r8.f7445t += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(int r9, boolean r10, r3.C0576h r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            l3.z r8 = r8.f7448w
            r8.e(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6f
            monitor-enter(r8)
        L12:
            long r4 = r8.f7445t     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            long r6 = r8.f7446u     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.LinkedHashMap r2 = r8.f7430b     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            goto L12
        L2f:
            r9 = move-exception
            goto L6d
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            l3.z r4 = r8.f7448w     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.f7494c     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.f7445t     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.f7445t = r4     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            l3.z r4 = r8.f7448w
            if (r10 == 0) goto L5b
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5b
            r5 = 1
            goto L5c
        L5b:
            r5 = r3
        L5c:
            r4.e(r5, r9, r11, r2)
            goto Ld
        L60:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6d:
            monitor-exit(r8)
            throw r9
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.q.Z(int, boolean, r3.h, long):void");
    }

    public final void a0(int i, EnumC0439b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.h.c(new o(this.f7431c + '[' + i + "] writeSynReset", this, i, errorCode, 1), 0L);
    }

    public final void b0(int i, long j4) {
        this.h.c(new p(this.f7431c + '[' + i + "] windowUpdate", this, i, j4), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d(EnumC0439b.NO_ERROR, EnumC0439b.CANCEL, null);
    }

    public final void d(EnumC0439b connectionCode, EnumC0439b streamCode, IOException iOException) {
        int i;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = f3.c.f6469a;
        try {
            O(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f7430b.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.f7430b.values().toArray(new y[0]);
                    this.f7430b.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        y[] yVarArr = (y[]) objArr;
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                try {
                    yVar.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f7448w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f7447v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f7436j.e();
    }

    public final void e(IOException iOException) {
        EnumC0439b enumC0439b = EnumC0439b.PROTOCOL_ERROR;
        d(enumC0439b, enumC0439b, iOException);
    }

    public final void flush() {
        this.f7448w.flush();
    }

    public final synchronized y s(int i) {
        return (y) this.f7430b.get(Integer.valueOf(i));
    }

    public final synchronized y x(int i) {
        y yVar;
        yVar = (y) this.f7430b.remove(Integer.valueOf(i));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return yVar;
    }
}
