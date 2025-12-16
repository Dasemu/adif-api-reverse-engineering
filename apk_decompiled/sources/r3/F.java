package r3;

import java.security.MessageDigest;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class F extends C0579k {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f8258e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f8259f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(byte[][] segments, int[] directory) {
        super(C0579k.f8285d.f8286a);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f8258e = segments;
        this.f8259f = directory;
    }

    @Override // r3.C0579k
    public final String a() {
        throw null;
    }

    @Override // r3.C0579k
    public final C0579k c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.f8258e;
        int length = bArr.length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int[] iArr = this.f8259f;
            int i5 = iArr[length + i];
            int i6 = iArr[i];
            messageDigest.update(bArr[i], i5, i6 - i4);
            i++;
            i4 = i6;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new C0579k(digest);
    }

    @Override // r3.C0579k
    public final int d() {
        return this.f8259f[this.f8258e.length - 1];
    }

    @Override // r3.C0579k
    public final String e() {
        return t().e();
    }

    @Override // r3.C0579k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0579k) {
            C0579k c0579k = (C0579k) obj;
            if (c0579k.d() == d() && l(0, c0579k, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // r3.C0579k
    public final int f(int i, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return t().f(i, other);
    }

    @Override // r3.C0579k
    public final byte[] h() {
        return s();
    }

    @Override // r3.C0579k
    public final int hashCode() {
        int i = this.f8287b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f8258e;
        int length = bArr.length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.f8259f;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            byte[] bArr2 = bArr[i4];
            int i9 = (i8 - i6) + i7;
            while (i7 < i9) {
                i5 = (i5 * 31) + bArr2[i7];
                i7++;
            }
            i4++;
            i6 = i8;
        }
        this.f8287b = i5;
        return i5;
    }

    @Override // r3.C0579k
    public final byte i(int i) {
        byte[][] bArr = this.f8258e;
        int length = bArr.length - 1;
        int[] iArr = this.f8259f;
        m3.d.j(iArr[length], i, 1L);
        int a2 = s3.d.a(this, i);
        return bArr[a2][(i - (a2 == 0 ? 0 : iArr[a2 - 1])) + iArr[bArr.length + a2]];
    }

    @Override // r3.C0579k
    public final int j(byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return t().j(other);
    }

    @Override // r3.C0579k
    public final boolean l(int i, C0579k other, int i4) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i >= 0 && i <= d() - i4) {
            int i5 = i4 + i;
            int a2 = s3.d.a(this, i);
            int i6 = 0;
            while (i < i5) {
                int[] iArr = this.f8259f;
                int i7 = a2 == 0 ? 0 : iArr[a2 - 1];
                int i8 = iArr[a2] - i7;
                byte[][] bArr = this.f8258e;
                int i9 = iArr[bArr.length + a2];
                int min = Math.min(i5, i8 + i7) - i;
                if (other.m(i6, bArr[a2], (i - i7) + i9, min)) {
                    i6 += min;
                    i += min;
                    a2++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // r3.C0579k
    public final boolean m(int i, byte[] other, int i4, int i5) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > d() - i5 || i4 < 0 || i4 > other.length - i5) {
            return false;
        }
        int i6 = i5 + i;
        int a2 = s3.d.a(this, i);
        while (i < i6) {
            int[] iArr = this.f8259f;
            int i7 = a2 == 0 ? 0 : iArr[a2 - 1];
            int i8 = iArr[a2] - i7;
            byte[][] bArr = this.f8258e;
            int i9 = iArr[bArr.length + a2];
            int min = Math.min(i6, i8 + i7) - i;
            if (!m3.d.c(bArr[a2], other, (i - i7) + i9, i4, min)) {
                return false;
            }
            i4 += min;
            i += min;
            a2++;
        }
        return true;
    }

    @Override // r3.C0579k
    public final C0579k n(int i, int i4) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i4 == -1234567890) {
            i4 = d();
        }
        if (i < 0) {
            throw new IllegalArgumentException(C.w.i(i, "beginIndex=", " < 0").toString());
        }
        if (i4 > d()) {
            StringBuilder t2 = C.w.t(i4, "endIndex=", " > length(");
            t2.append(d());
            t2.append(')');
            throw new IllegalArgumentException(t2.toString().toString());
        }
        int i5 = i4 - i;
        if (i5 < 0) {
            throw new IllegalArgumentException(C.w.k("endIndex=", i4, i, " < beginIndex=").toString());
        }
        if (i == 0 && i4 == d()) {
            return this;
        }
        if (i == i4) {
            return C0579k.f8285d;
        }
        int a2 = s3.d.a(this, i);
        int a4 = s3.d.a(this, i4 - 1);
        byte[][] bArr = this.f8258e;
        byte[][] bArr2 = (byte[][]) ArraysKt.copyOfRange(bArr, a2, a4 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f8259f;
        if (a2 <= a4) {
            int i6 = a2;
            int i7 = 0;
            while (true) {
                iArr[i7] = Math.min(iArr2[i6] - i, i5);
                int i8 = i7 + 1;
                iArr[i7 + bArr2.length] = iArr2[bArr.length + i6];
                if (i6 == a4) {
                    break;
                }
                i6++;
                i7 = i8;
            }
        }
        int i9 = a2 != 0 ? iArr2[a2 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i9) + iArr[length];
        return new F(bArr2, iArr);
    }

    @Override // r3.C0579k
    public final C0579k p() {
        return t().p();
    }

    @Override // r3.C0579k
    public final void r(C0576h buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int a2 = s3.d.a(this, 0);
        int i4 = 0;
        while (i4 < i) {
            int[] iArr = this.f8259f;
            int i5 = a2 == 0 ? 0 : iArr[a2 - 1];
            int i6 = iArr[a2] - i5;
            byte[][] bArr = this.f8258e;
            int i7 = iArr[bArr.length + a2];
            int min = Math.min(i, i6 + i5) - i4;
            int i8 = (i4 - i5) + i7;
            D d4 = new D(bArr[a2], i8, i8 + min, true);
            D d5 = buffer.f8283a;
            if (d5 == null) {
                d4.f8254g = d4;
                d4.f8253f = d4;
                buffer.f8283a = d4;
            } else {
                Intrinsics.checkNotNull(d5);
                D d6 = d5.f8254g;
                Intrinsics.checkNotNull(d6);
                d6.b(d4);
            }
            i4 += min;
            a2++;
        }
        buffer.f8284b += i;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f8258e;
        int length = bArr2.length;
        int i = 0;
        int i4 = 0;
        int i5 = 0;
        while (i < length) {
            int[] iArr = this.f8259f;
            int i6 = iArr[length + i];
            int i7 = iArr[i];
            int i8 = i7 - i4;
            ArraysKt.copyInto(bArr2[i], bArr, i5, i6, i6 + i8);
            i5 += i8;
            i++;
            i4 = i7;
        }
        return bArr;
    }

    public final C0579k t() {
        return new C0579k(s());
    }

    @Override // r3.C0579k
    public final String toString() {
        return t().toString();
    }
}
