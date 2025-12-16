package r3;

import a.AbstractC0105a;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: r3.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0576h implements InterfaceC0578j, InterfaceC0577i, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public D f8283a;

    /* renamed from: b, reason: collision with root package name */
    public long f8284b;

    @Override // r3.InterfaceC0578j
    public final long A(C0579k targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return Z(targetBytes, 0L);
    }

    @Override // r3.InterfaceC0578j
    public final int C(x options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int c4 = s3.a.c(this, options, false);
        if (c4 == -1) {
            return -1;
        }
        l(options.f8317a[c4].d());
        return c4;
    }

    @Override // r3.InterfaceC0577i
    public final long D(I source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read == -1) {
                return j4;
            }
            j4 += read;
        }
    }

    @Override // r3.InterfaceC0577i
    public final InterfaceC0577i E(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        i0(source, 0, source.length);
        return this;
    }

    @Override // r3.InterfaceC0577i
    public final /* bridge */ /* synthetic */ InterfaceC0577i F(C0579k c0579k) {
        h0(c0579k);
        return this;
    }

    @Override // r3.InterfaceC0578j
    public final boolean H(C0579k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int d4 = bytes.d();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (d4 >= 0 && this.f8284b >= d4 && bytes.d() >= d4) {
            for (int i = 0; i < d4; i++) {
                if (O(i) == bytes.i(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // r3.InterfaceC0577i
    public final /* bridge */ /* synthetic */ InterfaceC0577i L(int i, int i4, byte[] bArr) {
        i0(bArr, i, i4);
        return this;
    }

    @Override // r3.InterfaceC0578j
    public final C M() {
        return AbstractC0105a.d(new A(this));
    }

    public final byte O(long j4) {
        m3.d.j(this.f8284b, j4, 1L);
        D d4 = this.f8283a;
        if (d4 == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        long j5 = this.f8284b;
        if (j5 - j4 < j4) {
            while (j5 > j4) {
                d4 = d4.f8254g;
                Intrinsics.checkNotNull(d4);
                j5 -= d4.f8250c - d4.f8249b;
            }
            Intrinsics.checkNotNull(d4);
            return d4.f8248a[(int) ((d4.f8249b + j4) - j5)];
        }
        long j6 = 0;
        while (true) {
            long j7 = (d4.f8250c - d4.f8249b) + j6;
            if (j7 > j4) {
                Intrinsics.checkNotNull(d4);
                return d4.f8248a[(int) ((d4.f8249b + j4) - j6)];
            }
            d4 = d4.f8253f;
            Intrinsics.checkNotNull(d4);
            j6 = j7;
        }
    }

    @Override // r3.InterfaceC0578j
    public final void P(long j4) {
        if (this.f8284b < j4) {
            throw new EOFException();
        }
    }

    @Override // r3.InterfaceC0577i
    public final /* bridge */ /* synthetic */ InterfaceC0577i Q(String str) {
        o0(str);
        return this;
    }

    @Override // r3.InterfaceC0577i
    public final /* bridge */ /* synthetic */ InterfaceC0577i R(long j4) {
        k0(j4);
        return this;
    }

    @Override // r3.InterfaceC0578j
    public final long U(InterfaceC0577i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j4 = this.f8284b;
        if (j4 > 0) {
            sink.z(this, j4);
        }
        return j4;
    }

    @Override // r3.InterfaceC0578j
    public final String W(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return d0(this.f8284b, charset);
    }

    @Override // r3.InterfaceC0578j
    public final InputStream X() {
        return new C0575g(this, 0);
    }

    public final long Y(C0579k bytes, long j4) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.f8286a.length <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j5 = 0;
        if (j4 < 0) {
            throw new IllegalArgumentException(C.w.l("fromIndex < 0: ", j4).toString());
        }
        D d4 = this.f8283a;
        if (d4 == null) {
            return -1L;
        }
        long j6 = this.f8284b;
        long j7 = j6 - j4;
        byte[] bArr = bytes.f8286a;
        if (j7 < j4) {
            while (j6 > j4) {
                d4 = d4.f8254g;
                Intrinsics.checkNotNull(d4);
                j6 -= d4.f8250c - d4.f8249b;
            }
            byte b4 = bArr[0];
            int length = bArr.length;
            long j8 = (this.f8284b - length) + 1;
            while (j6 < j8) {
                byte[] bArr2 = d4.f8248a;
                int min = (int) Math.min(d4.f8250c, (d4.f8249b + j8) - j6);
                for (int i = (int) ((d4.f8249b + j4) - j6); i < min; i++) {
                    if (bArr2[i] == b4 && s3.a.a(d4, i + 1, bArr, length)) {
                        return (i - d4.f8249b) + j6;
                    }
                }
                j6 += d4.f8250c - d4.f8249b;
                d4 = d4.f8253f;
                Intrinsics.checkNotNull(d4);
                j4 = j6;
            }
            return -1L;
        }
        while (true) {
            long j9 = (d4.f8250c - d4.f8249b) + j5;
            if (j9 > j4) {
                break;
            }
            d4 = d4.f8253f;
            Intrinsics.checkNotNull(d4);
            j5 = j9;
        }
        byte b5 = bArr[0];
        int length2 = bArr.length;
        long j10 = (this.f8284b - length2) + 1;
        while (j5 < j10) {
            byte[] bArr3 = d4.f8248a;
            int min2 = (int) Math.min(d4.f8250c, (d4.f8249b + j10) - j5);
            for (int i4 = (int) ((d4.f8249b + j4) - j5); i4 < min2; i4++) {
                if (bArr3[i4] == b5 && s3.a.a(d4, i4 + 1, bArr, length2)) {
                    return (i4 - d4.f8249b) + j5;
                }
            }
            j5 += d4.f8250c - d4.f8249b;
            d4 = d4.f8253f;
            Intrinsics.checkNotNull(d4);
            j4 = j5;
        }
        return -1L;
    }

    public final long Z(C0579k targetBytes, long j4) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j5 = 0;
        if (j4 < 0) {
            throw new IllegalArgumentException(C.w.l("fromIndex < 0: ", j4).toString());
        }
        D d4 = this.f8283a;
        if (d4 == null) {
            return -1L;
        }
        long j6 = this.f8284b;
        if (j6 - j4 < j4) {
            while (j6 > j4) {
                d4 = d4.f8254g;
                Intrinsics.checkNotNull(d4);
                j6 -= d4.f8250c - d4.f8249b;
            }
            byte[] bArr = targetBytes.f8286a;
            if (bArr.length == 2) {
                byte b4 = bArr[0];
                byte b5 = bArr[1];
                while (j6 < this.f8284b) {
                    byte[] bArr2 = d4.f8248a;
                    int i = d4.f8250c;
                    for (int i4 = (int) ((d4.f8249b + j4) - j6); i4 < i; i4++) {
                        byte b6 = bArr2[i4];
                        if (b6 == b4 || b6 == b5) {
                            return (i4 - d4.f8249b) + j6;
                        }
                    }
                    j6 += d4.f8250c - d4.f8249b;
                    d4 = d4.f8253f;
                    Intrinsics.checkNotNull(d4);
                    j4 = j6;
                }
                return -1L;
            }
            while (j6 < this.f8284b) {
                byte[] bArr3 = d4.f8248a;
                int i5 = d4.f8250c;
                for (int i6 = (int) ((d4.f8249b + j4) - j6); i6 < i5; i6++) {
                    byte b7 = bArr3[i6];
                    for (byte b8 : bArr) {
                        if (b7 == b8) {
                            return (i6 - d4.f8249b) + j6;
                        }
                    }
                }
                j6 += d4.f8250c - d4.f8249b;
                d4 = d4.f8253f;
                Intrinsics.checkNotNull(d4);
                j4 = j6;
            }
            return -1L;
        }
        while (true) {
            long j7 = (d4.f8250c - d4.f8249b) + j5;
            if (j7 > j4) {
                break;
            }
            d4 = d4.f8253f;
            Intrinsics.checkNotNull(d4);
            j5 = j7;
        }
        byte[] bArr4 = targetBytes.f8286a;
        if (bArr4.length == 2) {
            byte b9 = bArr4[0];
            byte b10 = bArr4[1];
            while (j5 < this.f8284b) {
                byte[] bArr5 = d4.f8248a;
                int i7 = d4.f8250c;
                for (int i8 = (int) ((d4.f8249b + j4) - j5); i8 < i7; i8++) {
                    byte b11 = bArr5[i8];
                    if (b11 == b9 || b11 == b10) {
                        return (i8 - d4.f8249b) + j5;
                    }
                }
                j5 += d4.f8250c - d4.f8249b;
                d4 = d4.f8253f;
                Intrinsics.checkNotNull(d4);
                j4 = j5;
            }
            return -1L;
        }
        while (j5 < this.f8284b) {
            byte[] bArr6 = d4.f8248a;
            int i9 = d4.f8250c;
            for (int i10 = (int) ((d4.f8249b + j4) - j5); i10 < i9; i10++) {
                byte b12 = bArr6[i10];
                for (byte b13 : bArr4) {
                    if (b12 == b13) {
                        return (i10 - d4.f8249b) + j5;
                    }
                }
            }
            j5 += d4.f8250c - d4.f8249b;
            d4 = d4.f8253f;
            Intrinsics.checkNotNull(d4);
            j4 = j5;
        }
        return -1L;
    }

    @Override // r3.InterfaceC0578j
    public final C0576h a() {
        return this;
    }

    public final int a0(byte[] sink, int i, int i4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m3.d.j(sink.length, i, i4);
        D d4 = this.f8283a;
        if (d4 == null) {
            return -1;
        }
        int min = Math.min(i4, d4.f8250c - d4.f8249b);
        int i5 = d4.f8249b;
        ArraysKt.copyInto(d4.f8248a, sink, i, i5, i5 + min);
        int i6 = d4.f8249b + min;
        d4.f8249b = i6;
        this.f8284b -= min;
        if (i6 == d4.f8250c) {
            this.f8283a = d4.a();
            E.a(d4);
        }
        return min;
    }

    public final byte[] b0(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(C.w.l("byteCount: ", j4).toString());
        }
        if (this.f8284b < j4) {
            throw new EOFException();
        }
        int i = (int) j4;
        byte[] sink = new byte[i];
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i4 = 0;
        while (i4 < i) {
            int a02 = a0(sink, i4, i - i4);
            if (a02 == -1) {
                throw new EOFException();
            }
            i4 += a02;
        }
        return sink;
    }

    public final short c0() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r3.h] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.f8284b == 0) {
            return obj;
        }
        D d4 = this.f8283a;
        Intrinsics.checkNotNull(d4);
        D c4 = d4.c();
        obj.f8283a = c4;
        c4.f8254g = c4;
        c4.f8253f = c4;
        for (D d5 = d4.f8253f; d5 != d4; d5 = d5.f8253f) {
            D d6 = c4.f8254g;
            Intrinsics.checkNotNull(d6);
            Intrinsics.checkNotNull(d5);
            d6.b(d5.c());
        }
        obj.f8284b = this.f8284b;
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, r3.G
    public final void close() {
    }

    public final void d() {
        l(this.f8284b);
    }

    public final String d0(long j4, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(C.w.l("byteCount: ", j4).toString());
        }
        if (this.f8284b < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        D d4 = this.f8283a;
        Intrinsics.checkNotNull(d4);
        int i = d4.f8249b;
        if (i + j4 > d4.f8250c) {
            return new String(b0(j4), charset);
        }
        int i4 = (int) j4;
        String str = new String(d4.f8248a, i, i4, charset);
        int i5 = d4.f8249b + i4;
        d4.f8249b = i5;
        this.f8284b -= j4;
        if (i5 == d4.f8250c) {
            this.f8283a = d4.a();
            E.a(d4);
        }
        return str;
    }

    public final long e() {
        long j4 = this.f8284b;
        if (j4 == 0) {
            return 0L;
        }
        D d4 = this.f8283a;
        Intrinsics.checkNotNull(d4);
        D d5 = d4.f8254g;
        Intrinsics.checkNotNull(d5);
        return (d5.f8250c >= 8192 || !d5.f8252e) ? j4 : j4 - (r2 - d5.f8249b);
    }

    public final String e0() {
        return d0(this.f8284b, Charsets.UTF_8);
    }

    public final boolean equals(Object obj) {
        boolean z3 = true;
        if (this == obj) {
            return true;
        }
        boolean z4 = false;
        if (!(obj instanceof C0576h)) {
            return false;
        }
        long j4 = this.f8284b;
        C0576h c0576h = (C0576h) obj;
        if (j4 != c0576h.f8284b) {
            return false;
        }
        if (j4 == 0) {
            return true;
        }
        D d4 = this.f8283a;
        Intrinsics.checkNotNull(d4);
        D d5 = c0576h.f8283a;
        Intrinsics.checkNotNull(d5);
        int i = d4.f8249b;
        int i4 = d5.f8249b;
        long j5 = 0;
        while (j5 < this.f8284b) {
            long min = Math.min(d4.f8250c - i, d5.f8250c - i4);
            long j6 = 0;
            while (j6 < min) {
                int i5 = i + 1;
                boolean z5 = z3;
                byte b4 = d4.f8248a[i];
                int i6 = i4 + 1;
                boolean z6 = z4;
                if (b4 != d5.f8248a[i4]) {
                    return z6;
                }
                j6++;
                i4 = i6;
                i = i5;
                z3 = z5;
                z4 = z6;
            }
            boolean z7 = z3;
            boolean z8 = z4;
            if (i == d4.f8250c) {
                D d6 = d4.f8253f;
                Intrinsics.checkNotNull(d6);
                i = d6.f8249b;
                d4 = d6;
            }
            if (i4 == d5.f8250c) {
                d5 = d5.f8253f;
                Intrinsics.checkNotNull(d5);
                i4 = d5.f8249b;
            }
            j5 += min;
            z3 = z7;
            z4 = z8;
        }
        return z3;
    }

    @Override // r3.InterfaceC0577i
    public final /* bridge */ /* synthetic */ InterfaceC0577i f(String str, int i, int i4) {
        p0(str, i, i4);
        return this;
    }

    public final C0579k f0(int i) {
        if (i == 0) {
            return C0579k.f8285d;
        }
        m3.d.j(this.f8284b, 0L, i);
        D d4 = this.f8283a;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            Intrinsics.checkNotNull(d4);
            int i7 = d4.f8250c;
            int i8 = d4.f8249b;
            if (i7 == i8) {
                throw new AssertionError("s.limit == s.pos");
            }
            i5 += i7 - i8;
            i6++;
            d4 = d4.f8253f;
        }
        byte[][] bArr = new byte[i6];
        int[] iArr = new int[i6 * 2];
        D d5 = this.f8283a;
        int i9 = 0;
        while (i4 < i) {
            Intrinsics.checkNotNull(d5);
            bArr[i9] = d5.f8248a;
            i4 += d5.f8250c - d5.f8249b;
            iArr[i9] = Math.min(i4, i);
            iArr[i9 + i6] = d5.f8249b;
            d5.f8251d = true;
            i9++;
            d5 = d5.f8253f;
        }
        return new F(bArr, iArr);
    }

    @Override // r3.InterfaceC0577i, r3.G, java.io.Flushable
    public final void flush() {
    }

    @Override // r3.InterfaceC0578j
    public final C0579k g() {
        return h(this.f8284b);
    }

    public final D g0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        D d4 = this.f8283a;
        if (d4 == null) {
            D b4 = E.b();
            this.f8283a = b4;
            b4.f8254g = b4;
            b4.f8253f = b4;
            return b4;
        }
        Intrinsics.checkNotNull(d4);
        D d5 = d4.f8254g;
        Intrinsics.checkNotNull(d5);
        if (d5.f8250c + i <= 8192 && d5.f8252e) {
            return d5;
        }
        D b5 = E.b();
        d5.b(b5);
        return b5;
    }

    @Override // r3.InterfaceC0578j
    public final C0579k h(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(C.w.l("byteCount: ", j4).toString());
        }
        if (this.f8284b < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new C0579k(b0(j4));
        }
        C0579k f02 = f0((int) j4);
        l(j4);
        return f02;
    }

    public final void h0(C0579k byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.r(this, byteString.d());
    }

    public final int hashCode() {
        D d4 = this.f8283a;
        if (d4 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i4 = d4.f8250c;
            for (int i5 = d4.f8249b; i5 < i4; i5++) {
                i = (i * 31) + d4.f8248a[i5];
            }
            d4 = d4.f8253f;
            Intrinsics.checkNotNull(d4);
        } while (d4 != this.f8283a);
        return i;
    }

    public final void i0(byte[] source, int i, int i4) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = i4;
        m3.d.j(source.length, i, j4);
        int i5 = i4 + i;
        while (i < i5) {
            D g02 = g0(1);
            int min = Math.min(i5 - i, 8192 - g02.f8250c);
            int i6 = i + min;
            ArraysKt.copyInto(source, g02.f8248a, g02.f8250c, i, i6);
            g02.f8250c += min;
            i = i6;
        }
        this.f8284b += j4;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(int i) {
        D g02 = g0(1);
        int i4 = g02.f8250c;
        g02.f8250c = i4 + 1;
        g02.f8248a[i4] = (byte) i;
        this.f8284b++;
    }

    public final void k0(long j4) {
        boolean z3;
        byte[] bArr;
        if (j4 == 0) {
            j0(48);
            return;
        }
        int i = 1;
        if (j4 < 0) {
            j4 = -j4;
            if (j4 < 0) {
                o0("-9223372036854775808");
                return;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (j4 >= 100000000) {
            i = j4 < 1000000000000L ? j4 < 10000000000L ? j4 < 1000000000 ? 9 : 10 : j4 < 100000000000L ? 11 : 12 : j4 < 1000000000000000L ? j4 < 10000000000000L ? 13 : j4 < 100000000000000L ? 14 : 15 : j4 < 100000000000000000L ? j4 < 10000000000000000L ? 16 : 17 : j4 < 1000000000000000000L ? 18 : 19;
        } else if (j4 >= 10000) {
            i = j4 < 1000000 ? j4 < 100000 ? 5 : 6 : j4 < 10000000 ? 7 : 8;
        } else if (j4 >= 100) {
            i = j4 < 1000 ? 3 : 4;
        } else if (j4 >= 10) {
            i = 2;
        }
        if (z3) {
            i++;
        }
        D g02 = g0(i);
        int i4 = g02.f8250c + i;
        while (true) {
            bArr = g02.f8248a;
            if (j4 == 0) {
                break;
            }
            long j5 = 10;
            i4--;
            bArr[i4] = s3.a.f8472a[(int) (j4 % j5)];
            j4 /= j5;
        }
        if (z3) {
            bArr[i4 - 1] = 45;
        }
        g02.f8250c += i;
        this.f8284b += i;
    }

    @Override // r3.InterfaceC0578j
    public final void l(long j4) {
        while (j4 > 0) {
            D d4 = this.f8283a;
            if (d4 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j4, d4.f8250c - d4.f8249b);
            long j5 = min;
            this.f8284b -= j5;
            j4 -= j5;
            int i = d4.f8249b + min;
            d4.f8249b = i;
            if (i == d4.f8250c) {
                this.f8283a = d4.a();
                E.a(d4);
            }
        }
    }

    public final void l0(long j4) {
        if (j4 == 0) {
            j0(48);
            return;
        }
        long j5 = (j4 >>> 1) | j4;
        long j6 = j5 | (j5 >>> 2);
        long j7 = j6 | (j6 >>> 4);
        long j8 = j7 | (j7 >>> 8);
        long j9 = j8 | (j8 >>> 16);
        long j10 = j9 | (j9 >>> 32);
        long j11 = j10 - ((j10 >>> 1) & 6148914691236517205L);
        long j12 = ((j11 >>> 2) & 3689348814741910323L) + (j11 & 3689348814741910323L);
        long j13 = ((j12 >>> 4) + j12) & 1085102592571150095L;
        long j14 = j13 + (j13 >>> 8);
        long j15 = j14 + (j14 >>> 16);
        int i = (int) ((((j15 & 63) + ((j15 >>> 32) & 63)) + 3) / 4);
        D g02 = g0(i);
        int i4 = g02.f8250c;
        for (int i5 = (i4 + i) - 1; i5 >= i4; i5--) {
            g02.f8248a[i5] = s3.a.f8472a[(int) (15 & j4)];
            j4 >>>= 4;
        }
        g02.f8250c += i;
        this.f8284b += i;
    }

    @Override // r3.InterfaceC0577i
    public final /* bridge */ /* synthetic */ InterfaceC0577i m(int i) {
        n0(i);
        return this;
    }

    public final void m0(int i) {
        D g02 = g0(4);
        int i4 = g02.f8250c;
        byte b4 = (byte) ((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = g02.f8248a;
        bArr[i4] = b4;
        bArr[i4 + 1] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i4 + 2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i4 + 3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        g02.f8250c = i4 + 4;
        this.f8284b += 4;
    }

    @Override // r3.InterfaceC0578j
    public final boolean n(long j4) {
        return this.f8284b >= j4;
    }

    public final void n0(int i) {
        D g02 = g0(2);
        int i4 = g02.f8250c;
        byte b4 = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = g02.f8248a;
        bArr[i4] = b4;
        bArr[i4 + 1] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        g02.f8250c = i4 + 2;
        this.f8284b += 2;
    }

    public final void o0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        p0(string, 0, string.length());
    }

    public final void p0(String string, int i, int i4) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "beginIndex < 0: ").toString());
        }
        if (i4 < i) {
            throw new IllegalArgumentException(C.w.k("endIndex < beginIndex: ", i4, i, " < ").toString());
        }
        if (i4 > string.length()) {
            StringBuilder t2 = C.w.t(i4, "endIndex > string.length: ", " > ");
            t2.append(string.length());
            throw new IllegalArgumentException(t2.toString().toString());
        }
        while (i < i4) {
            char charAt2 = string.charAt(i);
            if (charAt2 < 128) {
                D g02 = g0(1);
                int i5 = g02.f8250c - i;
                int min = Math.min(i4, 8192 - i5);
                int i6 = i + 1;
                byte[] bArr = g02.f8248a;
                bArr[i + i5] = (byte) charAt2;
                while (true) {
                    i = i6;
                    if (i >= min || (charAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i6 = i + 1;
                    bArr[i + i5] = (byte) charAt;
                }
                int i7 = g02.f8250c;
                int i8 = (i5 + i) - i7;
                g02.f8250c = i7 + i8;
                this.f8284b += i8;
            } else {
                if (charAt2 < 2048) {
                    D g03 = g0(2);
                    int i9 = g03.f8250c;
                    byte[] bArr2 = g03.f8248a;
                    bArr2[i9] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((charAt2 & '?') | 128);
                    g03.f8250c = i9 + 2;
                    this.f8284b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    D g04 = g0(3);
                    int i10 = g04.f8250c;
                    byte[] bArr3 = g04.f8248a;
                    bArr3[i10] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                    g04.f8250c = i10 + 3;
                    this.f8284b += 3;
                } else {
                    int i11 = i + 1;
                    char charAt3 = i11 < i4 ? string.charAt(i11) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        j0(63);
                        i = i11;
                    } else {
                        int i12 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        D g05 = g0(4);
                        int i13 = g05.f8250c;
                        byte[] bArr4 = g05.f8248a;
                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                        g05.f8250c = i13 + 4;
                        this.f8284b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void q0(int i) {
        String str;
        int i4 = 0;
        if (i < 128) {
            j0(i);
            return;
        }
        if (i < 2048) {
            D g02 = g0(2);
            int i5 = g02.f8250c;
            byte[] bArr = g02.f8248a;
            bArr[i5] = (byte) ((i >> 6) | 192);
            bArr[1 + i5] = (byte) ((i & 63) | 128);
            g02.f8250c = i5 + 2;
            this.f8284b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            j0(63);
            return;
        }
        if (i < 65536) {
            D g03 = g0(3);
            int i6 = g03.f8250c;
            byte[] bArr2 = g03.f8248a;
            bArr2[i6] = (byte) ((i >> 12) | 224);
            bArr2[1 + i6] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i6] = (byte) ((i & 63) | 128);
            g03.f8250c = i6 + 3;
            this.f8284b += 3;
            return;
        }
        if (i <= 1114111) {
            D g04 = g0(4);
            int i7 = g04.f8250c;
            byte[] bArr3 = g04.f8248a;
            bArr3[i7] = (byte) ((i >> 18) | 240);
            bArr3[1 + i7] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i7] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i7] = (byte) ((i & 63) | 128);
            g04.f8250c = i7 + 4;
            this.f8284b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = s3.b.f8473a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i4 < 8 && cArr2[i4] == '0') {
                i4++;
            }
            str = StringsKt__StringsJVMKt.concatToString(cArr2, i4, 8);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // r3.InterfaceC0577i
    public final /* bridge */ /* synthetic */ InterfaceC0577i r(int i) {
        m0(i);
        return this;
    }

    @Override // r3.I
    public final long read(C0576h sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 >= 0) {
            long j5 = this.f8284b;
            if (j5 == 0) {
                return -1L;
            }
            if (j4 > j5) {
                j4 = j5;
            }
            sink.z(this, j4);
            return j4;
        }
        throw new IllegalArgumentException(C.w.l("byteCount < 0: ", j4).toString());
    }

    @Override // r3.InterfaceC0578j
    public final byte readByte() {
        if (this.f8284b == 0) {
            throw new EOFException();
        }
        D d4 = this.f8283a;
        Intrinsics.checkNotNull(d4);
        int i = d4.f8249b;
        int i4 = d4.f8250c;
        int i5 = i + 1;
        byte b4 = d4.f8248a[i];
        this.f8284b--;
        if (i5 != i4) {
            d4.f8249b = i5;
            return b4;
        }
        this.f8283a = d4.a();
        E.a(d4);
        return b4;
    }

    @Override // r3.InterfaceC0578j
    public final int readInt() {
        if (this.f8284b < 4) {
            throw new EOFException();
        }
        D d4 = this.f8283a;
        Intrinsics.checkNotNull(d4);
        int i = d4.f8249b;
        int i4 = d4.f8250c;
        if (i4 - i < 4) {
            return (readByte() & UByte.MAX_VALUE) | ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8);
        }
        byte[] bArr = d4.f8248a;
        int i5 = i + 3;
        int i6 = ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
        int i7 = i + 4;
        int i8 = i6 | (bArr[i5] & UByte.MAX_VALUE);
        this.f8284b -= 4;
        if (i7 != i4) {
            d4.f8249b = i7;
            return i8;
        }
        this.f8283a = d4.a();
        E.a(d4);
        return i8;
    }

    @Override // r3.InterfaceC0578j
    public final short readShort() {
        if (this.f8284b < 2) {
            throw new EOFException();
        }
        D d4 = this.f8283a;
        Intrinsics.checkNotNull(d4);
        int i = d4.f8249b;
        int i4 = d4.f8250c;
        if (i4 - i < 2) {
            return (short) ((readByte() & UByte.MAX_VALUE) | ((readByte() & UByte.MAX_VALUE) << 8));
        }
        int i5 = i + 1;
        byte[] bArr = d4.f8248a;
        int i6 = (bArr[i] & UByte.MAX_VALUE) << 8;
        int i7 = i + 2;
        int i8 = (bArr[i5] & UByte.MAX_VALUE) | i6;
        this.f8284b -= 2;
        if (i7 == i4) {
            this.f8283a = d4.a();
            E.a(d4);
        } else {
            d4.f8249b = i7;
        }
        return (short) i8;
    }

    public final void s(C0576h out, long j4, long j5) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j6 = j4;
        m3.d.j(this.f8284b, j6, j5);
        if (j5 == 0) {
            return;
        }
        out.f8284b += j5;
        D d4 = this.f8283a;
        while (true) {
            Intrinsics.checkNotNull(d4);
            long j7 = d4.f8250c - d4.f8249b;
            if (j6 < j7) {
                break;
            }
            j6 -= j7;
            d4 = d4.f8253f;
        }
        long j8 = j5;
        while (j8 > 0) {
            Intrinsics.checkNotNull(d4);
            D c4 = d4.c();
            int i = c4.f8249b + ((int) j6);
            c4.f8249b = i;
            c4.f8250c = Math.min(i + ((int) j8), c4.f8250c);
            D d5 = out.f8283a;
            if (d5 == null) {
                c4.f8254g = c4;
                c4.f8253f = c4;
                out.f8283a = c4;
            } else {
                Intrinsics.checkNotNull(d5);
                D d6 = d5.f8254g;
                Intrinsics.checkNotNull(d6);
                d6.b(c4);
            }
            j8 -= c4.f8250c - c4.f8249b;
            d4 = d4.f8253f;
            j6 = 0;
        }
    }

    @Override // r3.I
    public final K timeout() {
        return K.f8261d;
    }

    public final String toString() {
        long j4 = this.f8284b;
        if (j4 <= 2147483647L) {
            return f0((int) j4).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f8284b).toString());
    }

    @Override // r3.InterfaceC0578j
    public final long u(C0579k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return Y(bytes, 0L);
    }

    @Override // r3.InterfaceC0578j
    public final byte[] w() {
        return b0(this.f8284b);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            D g02 = g0(1);
            int min = Math.min(i, 8192 - g02.f8250c);
            source.get(g02.f8248a, g02.f8250c, min);
            i -= min;
            g02.f8250c += min;
        }
        this.f8284b += remaining;
        return remaining;
    }

    public final boolean x() {
        return this.f8284b == 0;
    }

    @Override // r3.InterfaceC0577i
    public final /* bridge */ /* synthetic */ InterfaceC0577i y(int i) {
        j0(i);
        return this;
    }

    @Override // r3.G
    public final void z(C0576h source, long j4) {
        D d4;
        D b4;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        m3.d.j(source.f8284b, 0L, j4);
        while (j4 > 0) {
            D d5 = source.f8283a;
            Intrinsics.checkNotNull(d5);
            int i = d5.f8250c;
            D d6 = source.f8283a;
            Intrinsics.checkNotNull(d6);
            long j5 = i - d6.f8249b;
            int i4 = 0;
            if (j4 < j5) {
                D d7 = this.f8283a;
                if (d7 != null) {
                    Intrinsics.checkNotNull(d7);
                    d4 = d7.f8254g;
                } else {
                    d4 = null;
                }
                if (d4 != null && d4.f8252e) {
                    if ((d4.f8250c + j4) - (d4.f8251d ? 0 : d4.f8249b) <= 8192) {
                        D d8 = source.f8283a;
                        Intrinsics.checkNotNull(d8);
                        d8.d(d4, (int) j4);
                        source.f8284b -= j4;
                        this.f8284b += j4;
                        return;
                    }
                }
                D d9 = source.f8283a;
                Intrinsics.checkNotNull(d9);
                int i5 = (int) j4;
                if (i5 <= 0) {
                    d9.getClass();
                } else if (i5 <= d9.f8250c - d9.f8249b) {
                    if (i5 >= 1024) {
                        b4 = d9.c();
                    } else {
                        b4 = E.b();
                        int i6 = d9.f8249b;
                        ArraysKt___ArraysJvmKt.copyInto$default(d9.f8248a, b4.f8248a, 0, i6, i6 + i5, 2, (Object) null);
                    }
                    b4.f8250c = b4.f8249b + i5;
                    d9.f8249b += i5;
                    D d10 = d9.f8254g;
                    Intrinsics.checkNotNull(d10);
                    d10.b(b4);
                    source.f8283a = b4;
                }
                throw new IllegalArgumentException("byteCount out of range");
            }
            D d11 = source.f8283a;
            Intrinsics.checkNotNull(d11);
            long j6 = d11.f8250c - d11.f8249b;
            source.f8283a = d11.a();
            D d12 = this.f8283a;
            if (d12 == null) {
                this.f8283a = d11;
                d11.f8254g = d11;
                d11.f8253f = d11;
            } else {
                Intrinsics.checkNotNull(d12);
                D d13 = d12.f8254g;
                Intrinsics.checkNotNull(d13);
                d13.b(d11);
                D d14 = d11.f8254g;
                if (d14 == d11) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.checkNotNull(d14);
                if (d14.f8252e) {
                    int i7 = d11.f8250c - d11.f8249b;
                    D d15 = d11.f8254g;
                    Intrinsics.checkNotNull(d15);
                    int i8 = 8192 - d15.f8250c;
                    D d16 = d11.f8254g;
                    Intrinsics.checkNotNull(d16);
                    if (!d16.f8251d) {
                        D d17 = d11.f8254g;
                        Intrinsics.checkNotNull(d17);
                        i4 = d17.f8249b;
                    }
                    if (i7 <= i8 + i4) {
                        D d18 = d11.f8254g;
                        Intrinsics.checkNotNull(d18);
                        d11.d(d18, i7);
                        d11.a();
                        E.a(d11);
                    }
                }
            }
            source.f8284b -= j6;
            this.f8284b += j6;
            j4 -= j6;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        D d4 = this.f8283a;
        if (d4 == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), d4.f8250c - d4.f8249b);
        sink.put(d4.f8248a, d4.f8249b, min);
        int i = d4.f8249b + min;
        d4.f8249b = i;
        this.f8284b -= min;
        if (i == d4.f8250c) {
            this.f8283a = d4.a();
            E.a(d4);
        }
        return min;
    }
}
