package r3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class A implements I {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0578j f8236a;

    /* renamed from: b, reason: collision with root package name */
    public final C0576h f8237b;

    /* renamed from: c, reason: collision with root package name */
    public D f8238c;

    /* renamed from: d, reason: collision with root package name */
    public int f8239d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8240e;

    /* renamed from: f, reason: collision with root package name */
    public long f8241f;

    public A(InterfaceC0578j upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f8236a = upstream;
        C0576h a2 = upstream.a();
        this.f8237b = a2;
        D d4 = a2.f8283a;
        this.f8238c = d4;
        this.f8239d = d4 != null ? d4.f8249b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8240e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r5.f8249b) goto L15;
     */
    @Override // r3.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(r3.C0576h r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6e
            boolean r3 = r8.f8240e
            if (r3 != 0) goto L66
            r3.D r3 = r8.f8238c
            r3.h r4 = r8.f8237b
            if (r3 == 0) goto L2b
            r3.D r5 = r4.f8283a
            if (r3 != r5) goto L23
            int r3 = r8.f8239d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r5 = r5.f8249b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            r8.<init>(r9)
            throw r8
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f8241f
            r2 = 1
            long r0 = r0 + r2
            r3.j r2 = r8.f8236a
            boolean r0 = r2.n(r0)
            if (r0 != 0) goto L3e
            r8 = -1
            return r8
        L3e:
            r3.D r0 = r8.f8238c
            if (r0 != 0) goto L4f
            r3.D r0 = r4.f8283a
            if (r0 == 0) goto L4f
            r8.f8238c = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.f8249b
            r8.f8239d = r0
        L4f:
            long r0 = r4.f8284b
            long r2 = r8.f8241f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            r3.h r2 = r8.f8237b
            long r4 = r8.f8241f
            r3 = r9
            r2.s(r3, r4, r6)
            long r9 = r8.f8241f
            long r9 = r9 + r6
            r8.f8241f = r9
            return r6
        L66:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            r8.<init>(r9)
            throw r8
        L6e:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = C.w.l(r8, r10)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.A.read(r3.h, long):long");
    }

    @Override // r3.I
    public final K timeout() {
        return this.f8236a.timeout();
    }
}
