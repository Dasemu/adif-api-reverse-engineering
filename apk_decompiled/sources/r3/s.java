package r3;

import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s implements I {

    /* renamed from: a, reason: collision with root package name */
    public final C f8307a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f8308b;

    /* renamed from: c, reason: collision with root package name */
    public int f8309c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8310d;

    public s(C source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f8307a = source;
        this.f8308b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8310d) {
            return;
        }
        this.f8308b.end();
        this.f8310d = true;
        this.f8307a.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[SYNTHETIC] */
    @Override // r3.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(r3.C0576h r12, long r13) {
        /*
            r11 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
        L5:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 < 0) goto Lb7
            boolean r4 = r11.f8310d
            if (r4 != 0) goto Laf
            r3.C r4 = r11.f8307a
            java.util.zip.Inflater r5 = r11.f8308b
            if (r3 != 0) goto L1a
        L18:
            r9 = r1
            goto L83
        L1a:
            r3 = 1
            r3.D r3 = r12.g0(r3)     // Catch: java.util.zip.DataFormatException -> La8
            int r6 = r3.f8250c     // Catch: java.util.zip.DataFormatException -> La8
            int r6 = 8192 - r6
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> La8
            long r6 = java.lang.Math.min(r13, r6)     // Catch: java.util.zip.DataFormatException -> La8
            int r6 = (int) r6     // Catch: java.util.zip.DataFormatException -> La8
            boolean r7 = r5.needsInput()     // Catch: java.util.zip.DataFormatException -> La8
            if (r7 != 0) goto L30
            goto L4a
        L30:
            boolean r7 = r4.d()     // Catch: java.util.zip.DataFormatException -> La8
            if (r7 == 0) goto L37
            goto L4a
        L37:
            r3.h r7 = r4.f8246b     // Catch: java.util.zip.DataFormatException -> La8
            r3.D r7 = r7.f8283a     // Catch: java.util.zip.DataFormatException -> La8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.util.zip.DataFormatException -> La8
            int r8 = r7.f8250c     // Catch: java.util.zip.DataFormatException -> La8
            int r9 = r7.f8249b     // Catch: java.util.zip.DataFormatException -> La8
            int r8 = r8 - r9
            r11.f8309c = r8     // Catch: java.util.zip.DataFormatException -> La8
            byte[] r7 = r7.f8248a     // Catch: java.util.zip.DataFormatException -> La8
            r5.setInput(r7, r9, r8)     // Catch: java.util.zip.DataFormatException -> La8
        L4a:
            byte[] r7 = r3.f8248a     // Catch: java.util.zip.DataFormatException -> La8
            int r8 = r3.f8250c     // Catch: java.util.zip.DataFormatException -> La8
            int r6 = r5.inflate(r7, r8, r6)     // Catch: java.util.zip.DataFormatException -> La8
            int r7 = r11.f8309c     // Catch: java.util.zip.DataFormatException -> La8
            if (r7 != 0) goto L57
            goto L65
        L57:
            int r8 = r5.getRemaining()     // Catch: java.util.zip.DataFormatException -> La8
            int r7 = r7 - r8
            int r8 = r11.f8309c     // Catch: java.util.zip.DataFormatException -> La8
            int r8 = r8 - r7
            r11.f8309c = r8     // Catch: java.util.zip.DataFormatException -> La8
            long r7 = (long) r7     // Catch: java.util.zip.DataFormatException -> La8
            r4.l(r7)     // Catch: java.util.zip.DataFormatException -> La8
        L65:
            if (r6 <= 0) goto L73
            int r7 = r3.f8250c     // Catch: java.util.zip.DataFormatException -> La8
            int r7 = r7 + r6
            r3.f8250c = r7     // Catch: java.util.zip.DataFormatException -> La8
            long r7 = r12.f8284b     // Catch: java.util.zip.DataFormatException -> La8
            long r9 = (long) r6     // Catch: java.util.zip.DataFormatException -> La8
            long r7 = r7 + r9
            r12.f8284b = r7     // Catch: java.util.zip.DataFormatException -> La8
            goto L83
        L73:
            int r6 = r3.f8249b     // Catch: java.util.zip.DataFormatException -> La8
            int r7 = r3.f8250c     // Catch: java.util.zip.DataFormatException -> La8
            if (r6 != r7) goto L18
            r3.D r6 = r3.a()     // Catch: java.util.zip.DataFormatException -> La8
            r12.f8283a = r6     // Catch: java.util.zip.DataFormatException -> La8
            r3.E.a(r3)     // Catch: java.util.zip.DataFormatException -> La8
            goto L18
        L83:
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 <= 0) goto L88
            return r9
        L88:
            boolean r1 = r5.finished()
            if (r1 != 0) goto La5
            boolean r1 = r5.needsDictionary()
            if (r1 == 0) goto L95
            goto La5
        L95:
            boolean r1 = r4.d()
            if (r1 != 0) goto L9d
            goto L5
        L9d:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r12 = "source exhausted prematurely"
            r11.<init>(r12)
            throw r11
        La5:
            r11 = -1
            return r11
        La8:
            r11 = move-exception
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            throw r12
        Laf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "closed"
            r11.<init>(r12)
            throw r11
        Lb7:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r11 = C.w.l(r11, r13)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.s.read(r3.h, long):long");
    }

    @Override // r3.I
    public final K timeout() {
        return this.f8307a.f8245a.timeout();
    }
}
