package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117h {

    /* renamed from: a, reason: collision with root package name */
    public int f2916a;

    /* renamed from: b, reason: collision with root package name */
    public Z2.y f2917b;

    /* renamed from: c, reason: collision with root package name */
    public final FileInputStream f2918c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2919d;

    /* renamed from: e, reason: collision with root package name */
    public int f2920e;

    /* renamed from: f, reason: collision with root package name */
    public int f2921f;

    /* renamed from: g, reason: collision with root package name */
    public int f2922g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2923j = Integer.MAX_VALUE;

    public C0117h(FileInputStream fileInputStream) {
        Charset charset = AbstractC0133y.f2975a;
        this.f2918c = fileInputStream;
        this.f2919d = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        this.f2920e = 0;
        this.f2922g = 0;
        this.i = 0;
    }

    public final int A() {
        return s();
    }

    public final long B() {
        return t();
    }

    public final void C() {
        int i = this.f2920e + this.f2921f;
        this.f2920e = i;
        int i4 = this.i + i;
        int i5 = this.f2923j;
        if (i4 <= i5) {
            this.f2921f = 0;
            return;
        }
        int i6 = i4 - i5;
        this.f2921f = i6;
        this.f2920e = i - i6;
    }

    public final void D(int i) {
        if (G(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.f2922g) {
            throw A.f();
        }
        throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean E(int i) {
        int z3;
        int i4 = i & 7;
        int i5 = 0;
        if (i4 == 0) {
            int i6 = this.f2920e - this.f2922g;
            byte[] bArr = this.f2919d;
            if (i6 >= 10) {
                while (i5 < 10) {
                    int i7 = this.f2922g;
                    this.f2922g = i7 + 1;
                    if (bArr[i7] < 0) {
                        i5++;
                    }
                }
                throw A.c();
            }
            while (i5 < 10) {
                if (this.f2922g == this.f2920e) {
                    D(1);
                }
                int i8 = this.f2922g;
                this.f2922g = i8 + 1;
                if (bArr[i8] < 0) {
                    i5++;
                }
            }
            throw A.c();
            return true;
        }
        if (i4 == 1) {
            F(8);
            return true;
        }
        if (i4 == 2) {
            F(s());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw A.b();
            }
            F(4);
            return true;
        }
        do {
            z3 = z();
            if (z3 == 0) {
                break;
            }
        } while (E(z3));
        a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final void F(int i) {
        int i4 = this.f2920e;
        int i5 = this.f2922g;
        int i6 = i4 - i5;
        if (i <= i6 && i >= 0) {
            this.f2922g = i5 + i;
            return;
        }
        FileInputStream fileInputStream = this.f2918c;
        if (i < 0) {
            throw A.d();
        }
        int i7 = this.i;
        int i8 = i7 + i5;
        int i9 = i8 + i;
        int i10 = this.f2923j;
        if (i9 > i10) {
            F((i10 - i7) - i5);
            throw A.f();
        }
        this.i = i8;
        this.f2920e = 0;
        this.f2922g = 0;
        while (i6 < i) {
            long j4 = i - i6;
            try {
                long skip = fileInputStream.skip(j4);
                if (skip < 0 || skip > j4) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                }
                if (skip == 0) {
                    break;
                } else {
                    i6 += (int) skip;
                }
            } finally {
                this.i += i6;
                C();
            }
        }
        if (i6 >= i) {
            return;
        }
        int i11 = this.f2920e;
        int i12 = i11 - this.f2922g;
        this.f2922g = i11;
        D(1);
        while (true) {
            int i13 = i - i12;
            int i14 = this.f2920e;
            if (i13 <= i14) {
                this.f2922g = i13;
                return;
            } else {
                i12 += i14;
                this.f2922g = i14;
                D(1);
            }
        }
    }

    public final boolean G(int i) {
        int i4 = this.f2922g;
        int i5 = i4 + i;
        int i6 = this.f2920e;
        if (i5 <= i6) {
            throw new IllegalStateException(C.w.i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i7 = this.i;
        if (i <= (Integer.MAX_VALUE - i7) - i4 && i7 + i4 + i <= this.f2923j) {
            byte[] bArr = this.f2919d;
            if (i4 > 0) {
                if (i6 > i4) {
                    System.arraycopy(bArr, i4, bArr, 0, i6 - i4);
                }
                this.i += i4;
                this.f2920e -= i4;
                this.f2922g = 0;
            }
            int i8 = this.f2920e;
            int min = Math.min(bArr.length - i8, (Integer.MAX_VALUE - this.i) - i8);
            FileInputStream fileInputStream = this.f2918c;
            int read = fileInputStream.read(bArr, i8, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read > 0) {
                this.f2920e += read;
                C();
                if (this.f2920e >= i) {
                    return true;
                }
                return G(i);
            }
        }
        return false;
    }

    public final void a(int i) {
        if (this.h != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.i + this.f2922g;
    }

    public final boolean c() {
        return this.f2922g == this.f2920e && !G(1);
    }

    public final void d(int i) {
        this.f2923j = i;
        C();
    }

    public final int e(int i) {
        if (i < 0) {
            throw A.d();
        }
        int i4 = this.i + this.f2922g + i;
        int i5 = this.f2923j;
        if (i4 > i5) {
            throw A.f();
        }
        this.f2923j = i4;
        C();
        return i5;
    }

    public final boolean f() {
        return t() != 0;
    }

    public final double g() {
        return Double.longBitsToDouble(r());
    }

    public final int h() {
        return s();
    }

    public final int i() {
        return q();
    }

    public final long j() {
        return r();
    }

    public final float k() {
        return Float.intBitsToFloat(q());
    }

    public final int l() {
        return s();
    }

    public final long m() {
        return t();
    }

    public final byte[] n(int i) {
        byte[] o4 = o(i);
        if (o4 != null) {
            return o4;
        }
        int i4 = this.f2922g;
        int i5 = this.f2920e;
        int i6 = i5 - i4;
        this.i += i5;
        this.f2922g = 0;
        this.f2920e = 0;
        ArrayList p = p(i - i6);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f2919d, i4, bArr, 0, i6);
        Iterator it = p.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
            i6 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] o(int i) {
        if (i == 0) {
            return AbstractC0133y.f2976b;
        }
        if (i < 0) {
            throw A.d();
        }
        int i4 = this.i;
        int i5 = this.f2922g;
        int i6 = i4 + i5 + i;
        if (i6 - Integer.MAX_VALUE > 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i7 = this.f2923j;
        if (i6 > i7) {
            F((i7 - i4) - i5);
            throw A.f();
        }
        int i8 = this.f2920e - i5;
        int i9 = i - i8;
        FileInputStream fileInputStream = this.f2918c;
        if (i9 >= 4096 && i9 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f2919d, this.f2922g, bArr, 0, i8);
        this.i += this.f2920e;
        this.f2922g = 0;
        this.f2920e = 0;
        while (i8 < i) {
            int read = fileInputStream.read(bArr, i8, i - i8);
            if (read == -1) {
                throw A.f();
            }
            this.i += read;
            i8 += read;
        }
        return bArr;
    }

    public final ArrayList p(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, ConstantsKt.DEFAULT_BLOCK_SIZE);
            byte[] bArr = new byte[min];
            int i4 = 0;
            while (i4 < min) {
                int read = this.f2918c.read(bArr, i4, min - i4);
                if (read == -1) {
                    throw A.f();
                }
                this.i += read;
                i4 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int q() {
        int i = this.f2922g;
        if (this.f2920e - i < 4) {
            D(4);
            i = this.f2922g;
        }
        this.f2922g = i + 4;
        byte[] bArr = this.f2919d;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long r() {
        int i = this.f2922g;
        if (this.f2920e - i < 8) {
            D(8);
            i = this.f2922g;
        }
        this.f2922g = i + 8;
        byte[] bArr = this.f2919d;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int s() {
        int i;
        int i4 = this.f2922g;
        int i5 = this.f2920e;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f2919d;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f2922g = i6;
                return b4;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b4;
                if (i8 < 0) {
                    i = i8 ^ (-128);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        i = i10 ^ 16256;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            i = (-2080896) ^ i12;
                        } else {
                            i9 = i4 + 5;
                            byte b5 = bArr[i11];
                            int i13 = (i12 ^ (b5 << 28)) ^ 266354560;
                            if (b5 < 0) {
                                i11 = i4 + 6;
                                if (bArr[i9] < 0) {
                                    i9 = i4 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i4 + 8;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 9;
                                            if (bArr[i11] < 0) {
                                                int i14 = i4 + 10;
                                                if (bArr[i9] >= 0) {
                                                    i7 = i14;
                                                    i = i13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i13;
                            }
                            i = i13;
                        }
                        i7 = i11;
                    }
                    i7 = i9;
                }
                this.f2922g = i7;
                return i;
            }
        }
        return (int) u();
    }

    public final long t() {
        long j4;
        long j5;
        long j6;
        long j7;
        int i = this.f2922g;
        int i4 = this.f2920e;
        if (i4 != i) {
            int i5 = i + 1;
            byte[] bArr = this.f2919d;
            byte b4 = bArr[i];
            if (b4 >= 0) {
                this.f2922g = i5;
                return b4;
            }
            if (i4 - i5 >= 9) {
                int i6 = i + 2;
                int i7 = (bArr[i5] << 7) ^ b4;
                if (i7 < 0) {
                    j4 = i7 ^ (-128);
                } else {
                    int i8 = i + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        j4 = i9 ^ 16256;
                        i6 = i8;
                    } else {
                        int i10 = i + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            j7 = (-2080896) ^ i11;
                        } else {
                            long j8 = i11;
                            i6 = i + 5;
                            long j9 = j8 ^ (bArr[i10] << 28);
                            if (j9 >= 0) {
                                j6 = 266354560;
                            } else {
                                i10 = i + 6;
                                long j10 = j9 ^ (bArr[i6] << 35);
                                if (j10 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j9 = j10 ^ (bArr[i10] << 42);
                                    if (j9 >= 0) {
                                        j6 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j10 = j9 ^ (bArr[i6] << 49);
                                        if (j10 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            long j11 = (j10 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j11 < 0) {
                                                int i12 = i + 10;
                                                if (bArr[i6] >= 0) {
                                                    i6 = i12;
                                                }
                                            }
                                            j4 = j11;
                                        }
                                    }
                                }
                                j7 = j5 ^ j10;
                            }
                            j4 = j6 ^ j9;
                        }
                        i6 = i10;
                        j4 = j7;
                    }
                }
                this.f2922g = i6;
                return j4;
            }
        }
        return u();
    }

    public final long u() {
        long j4 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f2922g == this.f2920e) {
                D(1);
            }
            int i4 = this.f2922g;
            this.f2922g = i4 + 1;
            j4 |= (r3 & ByteCompanionObject.MAX_VALUE) << i;
            if ((this.f2919d[i4] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j4;
            }
        }
        throw A.c();
    }

    public final int v() {
        return q();
    }

    public final long w() {
        return r();
    }

    public final int x() {
        int s4 = s();
        return (-(s4 & 1)) ^ (s4 >>> 1);
    }

    public final long y() {
        long t2 = t();
        return (-(t2 & 1)) ^ (t2 >>> 1);
    }

    public final int z() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int s4 = s();
        this.h = s4;
        if ((s4 >>> 3) != 0) {
            return s4;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }
}
