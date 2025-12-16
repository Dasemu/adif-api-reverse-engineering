package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119j extends Q {
    public static final Logger h = Logger.getLogger(C0119j.class.getName());
    public static final boolean i = s0.f2968f;

    /* renamed from: c, reason: collision with root package name */
    public J f2930c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2931d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2932e;

    /* renamed from: f, reason: collision with root package name */
    public int f2933f;

    /* renamed from: g, reason: collision with root package name */
    public final Y.n f2934g;

    public C0119j(Y.n nVar, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i4, 20);
        this.f2931d = new byte[max];
        this.f2932e = max;
        this.f2934g = nVar;
    }

    public static int A(long j4) {
        int i4;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i4 = 6;
        } else {
            i4 = 2;
        }
        if (((-2097152) & j4) != 0) {
            i4 += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? i4 + 1 : i4;
    }

    public static int r(int i4, C0116g c0116g) {
        return s(c0116g) + y(i4);
    }

    public static int s(C0116g c0116g) {
        int size = c0116g.size();
        return z(size) + size;
    }

    public static int t(int i4) {
        return y(i4) + 4;
    }

    public static int u(int i4) {
        return y(i4) + 8;
    }

    public static int v(int i4, AbstractC0108a abstractC0108a, InterfaceC0111b0 interfaceC0111b0) {
        return abstractC0108a.b(interfaceC0111b0) + (y(i4) * 2);
    }

    public static int w(int i4) {
        if (i4 >= 0) {
            return z(i4);
        }
        return 10;
    }

    public static int x(String str) {
        int length;
        try {
            length = v0.b(str);
        } catch (u0 unused) {
            length = str.getBytes(AbstractC0133y.f2975a).length;
        }
        return z(length) + length;
    }

    public static int y(int i4) {
        return z(i4 << 3);
    }

    public static int z(int i4) {
        if ((i4 & (-128)) == 0) {
            return 1;
        }
        if ((i4 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i4) == 0) {
            return 3;
        }
        return (i4 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void B() {
        this.f2934g.write(this.f2931d, 0, this.f2933f);
        this.f2933f = 0;
    }

    public final void C(int i4) {
        if (this.f2932e - this.f2933f < i4) {
            B();
        }
    }

    public final void D(byte b4) {
        if (this.f2933f == this.f2932e) {
            B();
        }
        int i4 = this.f2933f;
        this.f2933f = i4 + 1;
        this.f2931d[i4] = b4;
    }

    public final void E(byte[] bArr, int i4, int i5) {
        int i6 = this.f2933f;
        int i7 = this.f2932e;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f2931d;
        if (i8 >= i5) {
            System.arraycopy(bArr, i4, bArr2, i6, i5);
            this.f2933f += i5;
            return;
        }
        System.arraycopy(bArr, i4, bArr2, i6, i8);
        int i9 = i4 + i8;
        int i10 = i5 - i8;
        this.f2933f = i7;
        B();
        if (i10 > i7) {
            this.f2934g.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f2933f = i10;
        }
    }

    public final void F(int i4, boolean z3) {
        C(11);
        o(i4, 0);
        byte b4 = z3 ? (byte) 1 : (byte) 0;
        int i5 = this.f2933f;
        this.f2933f = i5 + 1;
        this.f2931d[i5] = b4;
    }

    public final void G(int i4, C0116g c0116g) {
        R(i4, 2);
        H(c0116g);
    }

    public final void H(C0116g c0116g) {
        T(c0116g.size());
        l(c0116g.b(), c0116g.size(), c0116g.f2912b);
    }

    public final void I(int i4, int i5) {
        C(14);
        o(i4, 5);
        m(i5);
    }

    public final void J(int i4) {
        C(4);
        m(i4);
    }

    public final void K(int i4, long j4) {
        C(18);
        o(i4, 1);
        n(j4);
    }

    public final void L(long j4) {
        C(8);
        n(j4);
    }

    public final void M(int i4, int i5) {
        C(20);
        o(i4, 0);
        if (i5 >= 0) {
            p(i5);
        } else {
            q(i5);
        }
    }

    public final void N(int i4) {
        if (i4 >= 0) {
            T(i4);
        } else {
            V(i4);
        }
    }

    public final void O(int i4, AbstractC0108a abstractC0108a, InterfaceC0111b0 interfaceC0111b0) {
        R(i4, 2);
        T(abstractC0108a.b(interfaceC0111b0));
        interfaceC0111b0.a(abstractC0108a, this.f2930c);
    }

    public final void P(int i4, String str) {
        R(i4, 2);
        Q(str);
    }

    public final void Q(String str) {
        try {
            int length = str.length() * 3;
            int z3 = z(length);
            int i4 = z3 + length;
            int i5 = this.f2932e;
            if (i4 > i5) {
                byte[] bArr = new byte[length];
                int f2 = v0.f2974a.f(str, bArr, 0, length);
                T(f2);
                E(bArr, 0, f2);
                return;
            }
            if (i4 > i5 - this.f2933f) {
                B();
            }
            int z4 = z(str.length());
            int i6 = this.f2933f;
            byte[] bArr2 = this.f2931d;
            try {
                if (z4 == z3) {
                    int i7 = i6 + z4;
                    this.f2933f = i7;
                    int f4 = v0.f2974a.f(str, bArr2, i7, i5 - i7);
                    this.f2933f = i6;
                    p((f4 - i6) - z4);
                    this.f2933f = f4;
                } else {
                    int b4 = v0.b(str);
                    p(b4);
                    this.f2933f = v0.f2974a.f(str, bArr2, this.f2933f, b4);
                }
            } catch (u0 e4) {
                this.f2933f = i6;
                throw e4;
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new C0118i(e5);
            }
        } catch (u0 e6) {
            h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
            byte[] bytes = str.getBytes(AbstractC0133y.f2975a);
            try {
                T(bytes.length);
                l(0, bytes.length, bytes);
            } catch (C0118i e7) {
                throw e7;
            } catch (IndexOutOfBoundsException e8) {
                throw new C0118i(e8);
            }
        }
    }

    public final void R(int i4, int i5) {
        T((i4 << 3) | i5);
    }

    public final void S(int i4, int i5) {
        C(20);
        o(i4, 0);
        p(i5);
    }

    public final void T(int i4) {
        C(5);
        p(i4);
    }

    public final void U(int i4, long j4) {
        C(20);
        o(i4, 0);
        q(j4);
    }

    public final void V(long j4) {
        C(10);
        q(j4);
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public final void l(int i4, int i5, byte[] bArr) {
        E(bArr, i4, i5);
    }

    public final void m(int i4) {
        int i5 = this.f2933f;
        int i6 = i5 + 1;
        this.f2933f = i6;
        byte b4 = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f2931d;
        bArr[i5] = b4;
        int i7 = i5 + 2;
        this.f2933f = i7;
        bArr[i6] = (byte) ((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i8 = i5 + 3;
        this.f2933f = i8;
        bArr[i7] = (byte) ((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f2933f = i5 + 4;
        bArr[i8] = (byte) ((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void n(long j4) {
        int i4 = this.f2933f;
        int i5 = i4 + 1;
        this.f2933f = i5;
        byte[] bArr = this.f2931d;
        bArr[i4] = (byte) (j4 & 255);
        int i6 = i4 + 2;
        this.f2933f = i6;
        bArr[i5] = (byte) ((j4 >> 8) & 255);
        int i7 = i4 + 3;
        this.f2933f = i7;
        bArr[i6] = (byte) ((j4 >> 16) & 255);
        int i8 = i4 + 4;
        this.f2933f = i8;
        bArr[i7] = (byte) (255 & (j4 >> 24));
        int i9 = i4 + 5;
        this.f2933f = i9;
        bArr[i8] = (byte) (((int) (j4 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i10 = i4 + 6;
        this.f2933f = i10;
        bArr[i9] = (byte) (((int) (j4 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i11 = i4 + 7;
        this.f2933f = i11;
        bArr[i10] = (byte) (((int) (j4 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f2933f = i4 + 8;
        bArr[i11] = (byte) (((int) (j4 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void o(int i4, int i5) {
        p((i4 << 3) | i5);
    }

    public final void p(int i4) {
        boolean z3 = i;
        byte[] bArr = this.f2931d;
        if (z3) {
            while ((i4 & (-128)) != 0) {
                int i5 = this.f2933f;
                this.f2933f = i5 + 1;
                s0.j(bArr, i5, (byte) ((i4 & WorkQueueKt.MASK) | 128));
                i4 >>>= 7;
            }
            int i6 = this.f2933f;
            this.f2933f = i6 + 1;
            s0.j(bArr, i6, (byte) i4);
            return;
        }
        while ((i4 & (-128)) != 0) {
            int i7 = this.f2933f;
            this.f2933f = i7 + 1;
            bArr[i7] = (byte) ((i4 & WorkQueueKt.MASK) | 128);
            i4 >>>= 7;
        }
        int i8 = this.f2933f;
        this.f2933f = i8 + 1;
        bArr[i8] = (byte) i4;
    }

    public final void q(long j4) {
        boolean z3 = i;
        byte[] bArr = this.f2931d;
        if (z3) {
            while ((j4 & (-128)) != 0) {
                int i4 = this.f2933f;
                this.f2933f = i4 + 1;
                s0.j(bArr, i4, (byte) ((((int) j4) & WorkQueueKt.MASK) | 128));
                j4 >>>= 7;
            }
            int i5 = this.f2933f;
            this.f2933f = i5 + 1;
            s0.j(bArr, i5, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            int i6 = this.f2933f;
            this.f2933f = i6 + 1;
            bArr[i6] = (byte) ((((int) j4) & WorkQueueKt.MASK) | 128);
            j4 >>>= 7;
        }
        int i7 = this.f2933f;
        this.f2933f = i7 + 1;
        bArr[i7] = (byte) j4;
    }
}
