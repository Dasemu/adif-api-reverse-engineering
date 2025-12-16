package l3;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.I;
import r3.K;

/* loaded from: classes3.dex */
public final class w implements I {

    /* renamed from: a, reason: collision with root package name */
    public final long f7472a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7473b;

    /* renamed from: c, reason: collision with root package name */
    public final C0576h f7474c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C0576h f7475d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f7476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f7477f;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, r3.h] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, r3.h] */
    public w(y yVar, long j4, boolean z3) {
        this.f7477f = yVar;
        this.f7472a = j4;
        this.f7473b = z3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j4;
        y yVar = this.f7477f;
        synchronized (yVar) {
            this.f7476e = true;
            C0576h c0576h = this.f7475d;
            j4 = c0576h.f8284b;
            c0576h.d();
            Intrinsics.checkNotNull(yVar, "null cannot be cast to non-null type java.lang.Object");
            yVar.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        if (j4 > 0) {
            byte[] bArr = f3.c.f6469a;
            this.f7477f.f7480b.Y(j4);
        }
        this.f7477f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008a A[LOOP:0: B:3:0x000f->B:40:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[SYNTHETIC] */
    @Override // r3.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(r3.C0576h r16, long r17) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            java.lang.String r4 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto Lab
        Lf:
            l3.y r6 = r15.f7477f
            monitor-enter(r6)
            l3.x r7 = r6.f7487k     // Catch: java.lang.Throwable -> L96
            r7.h()     // Catch: java.lang.Throwable -> L96
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L32
            l3.b r7 = r6.f7489m     // Catch: java.lang.Throwable -> La0
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L32
            if (r7 == 0) goto L38
            boolean r7 = r15.f7473b     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto L38
            java.io.IOException r7 = r6.f7490n     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto L39
            l3.D r7 = new l3.D     // Catch: java.lang.Throwable -> L32
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L32
            l3.b r8 = r6.f7489m     // Catch: java.lang.Throwable -> L35
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L32
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch: java.lang.Throwable -> L32
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L32
            goto L39
        L32:
            r0 = move-exception
            goto La3
        L35:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L35
            throw r0     // Catch: java.lang.Throwable -> L32
        L38:
            r7 = 0
        L39:
            boolean r8 = r15.f7476e     // Catch: java.lang.Throwable -> L32
            if (r8 != 0) goto L98
            r3.h r8 = r15.f7475d     // Catch: java.lang.Throwable -> L32
            long r9 = r8.f8284b     // Catch: java.lang.Throwable -> L32
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r12 = -1
            r14 = 0
            if (r11 <= 0) goto L75
            long r9 = java.lang.Math.min(r2, r9)     // Catch: java.lang.Throwable -> L32
            long r8 = r8.read(r1, r9)     // Catch: java.lang.Throwable -> L32
            long r10 = r6.f7481c     // Catch: java.lang.Throwable -> L32
            long r10 = r10 + r8
            r6.f7481c = r10     // Catch: java.lang.Throwable -> L32
            long r4 = r6.f7482d     // Catch: java.lang.Throwable -> L32
            long r10 = r10 - r4
            if (r7 != 0) goto L80
            l3.q r4 = r6.f7480b     // Catch: java.lang.Throwable -> L32
            l3.C r4 = r4.p     // Catch: java.lang.Throwable -> L32
            int r4 = r4.a()     // Catch: java.lang.Throwable -> L32
            int r4 = r4 / 2
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L32
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 < 0) goto L80
            l3.q r4 = r6.f7480b     // Catch: java.lang.Throwable -> L32
            int r5 = r6.f7479a     // Catch: java.lang.Throwable -> L32
            r4.b0(r5, r10)     // Catch: java.lang.Throwable -> L32
            long r4 = r6.f7481c     // Catch: java.lang.Throwable -> L32
            r6.f7482d = r4     // Catch: java.lang.Throwable -> L32
            goto L80
        L75:
            boolean r4 = r15.f7473b     // Catch: java.lang.Throwable -> L32
            if (r4 != 0) goto L7f
            if (r7 != 0) goto L7f
            r6.k()     // Catch: java.lang.Throwable -> L32
            r14 = 1
        L7f:
            r8 = r12
        L80:
            l3.x r4 = r6.f7487k     // Catch: java.lang.Throwable -> L96
            r4.k()     // Catch: java.lang.Throwable -> L96
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L96
            monitor-exit(r6)
            if (r14 == 0) goto L8d
            r4 = 0
            goto Lf
        L8d:
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 == 0) goto L92
            return r8
        L92:
            if (r7 != 0) goto L95
            return r12
        L95:
            throw r7
        L96:
            r0 = move-exception
            goto La9
        L98:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "stream closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        La0:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> L32
        La3:
            l3.x r1 = r6.f7487k     // Catch: java.lang.Throwable -> L96
            r1.k()     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        La9:
            monitor-exit(r6)
            throw r0
        Lab:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = C.w.l(r0, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.w.read(r3.h, long):long");
    }

    @Override // r3.I
    public final K timeout() {
        return this.f7477f.f7487k;
    }
}
