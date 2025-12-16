package r3;

import a.AbstractC0105a;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class C implements InterfaceC0578j {

    /* renamed from: a, reason: collision with root package name */
    public final I f8245a;

    /* renamed from: b, reason: collision with root package name */
    public final C0576h f8246b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8247c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, r3.h] */
    public C(I source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f8245a = source;
        this.f8246b = new Object();
    }

    @Override // r3.InterfaceC0578j
    public final long A(C0579k targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.f8247c) {
            throw new IllegalStateException("closed");
        }
        long j4 = 0;
        while (true) {
            C0576h c0576h = this.f8246b;
            long Z = c0576h.Z(targetBytes, j4);
            if (Z != -1) {
                return Z;
            }
            long j5 = c0576h.f8284b;
            if (this.f8245a.read(c0576h, 8192L) == -1) {
                return -1L;
            }
            j4 = Math.max(j4, j5);
        }
    }

    @Override // r3.InterfaceC0578j
    public final int C(x options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f8247c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C0576h c0576h = this.f8246b;
            int c4 = s3.a.c(c0576h, options, true);
            if (c4 != -2) {
                if (c4 != -1) {
                    c0576h.l(options.f8317a[c4].d());
                    return c4;
                }
            } else if (this.f8245a.read(c0576h, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // r3.InterfaceC0578j
    public final boolean H(C0579k bytes) {
        int i;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int d4 = bytes.d();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f8247c) {
            throw new IllegalStateException("closed");
        }
        if (d4 >= 0 && bytes.d() >= d4) {
            for (0; i < d4; i + 1) {
                long j4 = i;
                i = (n(1 + j4) && this.f8246b.O(j4) == bytes.i(i)) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // r3.InterfaceC0578j
    public final C M() {
        return AbstractC0105a.d(new A(this));
    }

    public final long O() {
        char c4;
        char c5;
        char c6;
        char c7;
        long j4;
        P(8L);
        C0576h c0576h = this.f8246b;
        if (c0576h.f8284b < 8) {
            throw new EOFException();
        }
        D d4 = c0576h.f8283a;
        Intrinsics.checkNotNull(d4);
        int i = d4.f8249b;
        int i4 = d4.f8250c;
        if (i4 - i < 8) {
            j4 = ((c0576h.readInt() & 4294967295L) << 32) | (4294967295L & c0576h.readInt());
            c6 = '(';
            c7 = '8';
            c4 = '\b';
            c5 = 24;
        } else {
            byte[] bArr = d4.f8248a;
            c4 = '\b';
            c5 = 24;
            c6 = '(';
            c7 = '8';
            int i5 = i + 7;
            long j5 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
            int i6 = i + 8;
            long j6 = j5 | (bArr[i5] & 255);
            c0576h.f8284b -= 8;
            if (i6 == i4) {
                c0576h.f8283a = d4.a();
                E.a(d4);
            } else {
                d4.f8249b = i6;
            }
            j4 = j6;
        }
        return ((j4 & 255) << c7) | (((-72057594037927936L) & j4) >>> c7) | ((71776119061217280L & j4) >>> c6) | ((280375465082880L & j4) >>> c5) | ((1095216660480L & j4) >>> c4) | ((4278190080L & j4) << c4) | ((16711680 & j4) << c5) | ((65280 & j4) << c6);
    }

    @Override // r3.InterfaceC0578j
    public final void P(long j4) {
        if (!n(j4)) {
            throw new EOFException();
        }
    }

    @Override // r3.InterfaceC0578j
    public final long U(InterfaceC0577i sink) {
        C0576h c0576h;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j4 = 0;
        while (true) {
            c0576h = this.f8246b;
            if (this.f8245a.read(c0576h, 8192L) == -1) {
                break;
            }
            long e4 = c0576h.e();
            if (e4 > 0) {
                j4 += e4;
                sink.z(c0576h, e4);
            }
        }
        long j5 = c0576h.f8284b;
        if (j5 <= 0) {
            return j4;
        }
        long j6 = j4 + j5;
        sink.z(c0576h, j5);
        return j6;
    }

    @Override // r3.InterfaceC0578j
    public final String W(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        I i = this.f8245a;
        C0576h c0576h = this.f8246b;
        c0576h.D(i);
        return c0576h.W(charset);
    }

    @Override // r3.InterfaceC0578j
    public final InputStream X() {
        return new C0575g(this, 1);
    }

    public final short Y() {
        P(2L);
        return this.f8246b.c0();
    }

    public final String Z(long j4) {
        P(j4);
        C0576h c0576h = this.f8246b;
        c0576h.getClass();
        return c0576h.d0(j4, Charsets.UTF_8);
    }

    @Override // r3.InterfaceC0578j
    public final C0576h a() {
        return this.f8246b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, r3.h] */
    public final String a0(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(C.w.l("limit < 0: ", j4).toString());
        }
        long j5 = j4 == LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        long e4 = e((byte) 10, 0L, j5);
        C0576h c0576h = this.f8246b;
        if (e4 != -1) {
            return s3.a.b(c0576h, e4);
        }
        if (j5 < LongCompanionObject.MAX_VALUE && n(j5) && c0576h.O(j5 - 1) == 13 && n(j5 + 1) && c0576h.O(j5) == 10) {
            return s3.a.b(c0576h, j5);
        }
        ?? obj = new Object();
        c0576h.s(obj, 0L, Math.min(32, c0576h.f8284b));
        throw new EOFException("\\n not found: limit=" + Math.min(c0576h.f8284b, j4) + " content=" + obj.h(obj.f8284b).e() + Typography.ellipsis);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f8247c) {
            return;
        }
        this.f8247c = true;
        this.f8245a.close();
        this.f8246b.d();
    }

    public final boolean d() {
        if (this.f8247c) {
            throw new IllegalStateException("closed");
        }
        C0576h c0576h = this.f8246b;
        return c0576h.x() && this.f8245a.read(c0576h, 8192L) == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(byte r21, long r22, long r24) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.C.e(byte, long, long):long");
    }

    @Override // r3.InterfaceC0578j
    public final C0579k g() {
        I i = this.f8245a;
        C0576h c0576h = this.f8246b;
        c0576h.D(i);
        return c0576h.h(c0576h.f8284b);
    }

    @Override // r3.InterfaceC0578j
    public final C0579k h(long j4) {
        P(j4);
        return this.f8246b.h(j4);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f8247c;
    }

    @Override // r3.InterfaceC0578j
    public final void l(long j4) {
        if (this.f8247c) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            C0576h c0576h = this.f8246b;
            if (c0576h.f8284b == 0 && this.f8245a.read(c0576h, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j4, c0576h.f8284b);
            c0576h.l(min);
            j4 -= min;
        }
    }

    @Override // r3.InterfaceC0578j
    public final boolean n(long j4) {
        C0576h c0576h;
        if (j4 < 0) {
            throw new IllegalArgumentException(C.w.l("byteCount < 0: ", j4).toString());
        }
        if (this.f8247c) {
            throw new IllegalStateException("closed");
        }
        do {
            c0576h = this.f8246b;
            if (c0576h.f8284b >= j4) {
                return true;
            }
        } while (this.f8245a.read(c0576h, 8192L) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C0576h c0576h = this.f8246b;
        if (c0576h.f8284b == 0 && this.f8245a.read(c0576h, 8192L) == -1) {
            return -1;
        }
        return c0576h.read(sink);
    }

    @Override // r3.InterfaceC0578j
    public final byte readByte() {
        P(1L);
        return this.f8246b.readByte();
    }

    @Override // r3.InterfaceC0578j
    public final int readInt() {
        P(4L);
        return this.f8246b.readInt();
    }

    @Override // r3.InterfaceC0578j
    public final short readShort() {
        P(2L);
        return this.f8246b.readShort();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0122, code lost:
    
        r14.f8284b -= r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0128, code lost:
    
        return r9;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, r3.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long s() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.C.s():long");
    }

    @Override // r3.I
    public final K timeout() {
        return this.f8245a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f8245a + ')';
    }

    @Override // r3.InterfaceC0578j
    public final long u(C0579k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f8247c) {
            throw new IllegalStateException("closed");
        }
        long j4 = 0;
        while (true) {
            C0576h c0576h = this.f8246b;
            long Y3 = c0576h.Y(bytes, j4);
            if (Y3 != -1) {
                return Y3;
            }
            long j5 = c0576h.f8284b;
            if (this.f8245a.read(c0576h, 8192L) == -1) {
                return -1L;
            }
            j4 = Math.max(j4, (j5 - bytes.f8286a.length) + 1);
        }
    }

    @Override // r3.InterfaceC0578j
    public final byte[] w() {
        I i = this.f8245a;
        C0576h c0576h = this.f8246b;
        c0576h.D(i);
        return c0576h.b0(c0576h.f8284b);
    }

    public final int x() {
        P(4L);
        int readInt = this.f8246b.readInt();
        return ((readInt & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // r3.I
    public final long read(C0576h sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 >= 0) {
            if (!this.f8247c) {
                C0576h c0576h = this.f8246b;
                if (c0576h.f8284b == 0 && this.f8245a.read(c0576h, 8192L) == -1) {
                    return -1L;
                }
                return c0576h.read(sink, Math.min(j4, c0576h.f8284b));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(C.w.l("byteCount < 0: ", j4).toString());
    }
}
