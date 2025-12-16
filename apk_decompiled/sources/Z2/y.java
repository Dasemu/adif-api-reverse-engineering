package Z2;

import androidx.datastore.preferences.protobuf.A0;
import androidx.datastore.preferences.protobuf.AbstractC0113d;
import androidx.datastore.preferences.protobuf.AbstractC0120k;
import androidx.datastore.preferences.protobuf.AbstractC0131w;
import androidx.datastore.preferences.protobuf.AbstractC0133y;
import androidx.datastore.preferences.protobuf.C0116g;
import androidx.datastore.preferences.protobuf.C0117h;
import androidx.datastore.preferences.protobuf.C0122m;
import androidx.datastore.preferences.protobuf.InterfaceC0111b0;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.v0;
import androidx.recyclerview.widget.AbstractC0238q0;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public int f2311a;

    /* renamed from: b, reason: collision with root package name */
    public int f2312b;

    /* renamed from: c, reason: collision with root package name */
    public int f2313c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2314d;

    public static void U(int i) {
        if ((i & 3) != 0) {
            throw androidx.datastore.preferences.protobuf.A.e();
        }
    }

    public static void V(int i) {
        if ((i & 7) != 0) {
            throw androidx.datastore.preferences.protobuf.A.e();
        }
    }

    public Object A(InterfaceC0111b0 interfaceC0111b0, C0122m c0122m) {
        C0117h c0117h = (C0117h) this.f2314d;
        int A3 = c0117h.A();
        if (c0117h.f2916a >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e4 = c0117h.e(A3);
        Object i = interfaceC0111b0.i();
        c0117h.f2916a++;
        interfaceC0111b0.c(i, this, c0122m);
        interfaceC0111b0.d(i);
        c0117h.a(0);
        c0117h.f2916a--;
        c0117h.d(e4);
        return i;
    }

    public Object B(InterfaceC0111b0 interfaceC0111b0, C0122m c0122m) {
        S(2);
        return A(interfaceC0111b0, c0122m);
    }

    public int C() {
        S(5);
        return ((C0117h) this.f2314d).v();
    }

    public void D(List list) {
        int z3;
        boolean z4 = list instanceof AbstractC0131w;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 2) {
                U(c0117h.A());
                c0117h.v();
                throw null;
            }
            if (i != 5) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0117h.v();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 == 2) {
            int A3 = c0117h.A();
            U(A3);
            int b4 = c0117h.b() + A3;
            do {
                list.add(Integer.valueOf(c0117h.v()));
            } while (c0117h.b() < b4);
            return;
        }
        if (i4 != 5) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        do {
            list.add(Integer.valueOf(c0117h.v()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public long E() {
        S(1);
        return ((C0117h) this.f2314d).w();
    }

    public void F(List list) {
        int z3;
        boolean z4 = list instanceof androidx.datastore.preferences.protobuf.H;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 1) {
                c0117h.w();
                throw null;
            }
            if (i != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            V(c0117h.A());
            c0117h.w();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 != 1) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            int A3 = c0117h.A();
            V(A3);
            int b4 = c0117h.b() + A3;
            do {
                list.add(Long.valueOf(c0117h.w()));
            } while (c0117h.b() < b4);
            return;
        }
        do {
            list.add(Long.valueOf(c0117h.w()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public int G() {
        S(0);
        return ((C0117h) this.f2314d).x();
    }

    public void H(List list) {
        int z3;
        boolean z4 = list instanceof AbstractC0131w;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 0) {
                c0117h.x();
                throw null;
            }
            if (i != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0117h.A();
            c0117h.x();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            int b4 = c0117h.b() + c0117h.A();
            do {
                list.add(Integer.valueOf(c0117h.x()));
            } while (c0117h.b() < b4);
            R(b4);
            return;
        }
        do {
            list.add(Integer.valueOf(c0117h.x()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public long I() {
        S(0);
        return ((C0117h) this.f2314d).y();
    }

    public void J(List list) {
        int z3;
        boolean z4 = list instanceof androidx.datastore.preferences.protobuf.H;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 0) {
                c0117h.y();
                throw null;
            }
            if (i != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0117h.A();
            c0117h.y();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            int b4 = c0117h.b() + c0117h.A();
            do {
                list.add(Long.valueOf(c0117h.y()));
            } while (c0117h.b() < b4);
            R(b4);
            return;
        }
        do {
            list.add(Long.valueOf(c0117h.y()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public String K() {
        S(2);
        C0117h c0117h = (C0117h) this.f2314d;
        int s4 = c0117h.s();
        byte[] bArr = c0117h.f2919d;
        if (s4 > 0) {
            int i = c0117h.f2920e;
            int i4 = c0117h.f2922g;
            if (s4 <= i - i4) {
                String str = new String(bArr, i4, s4, AbstractC0133y.f2975a);
                c0117h.f2922g += s4;
                return str;
            }
        }
        if (s4 == 0) {
            return "";
        }
        if (s4 > c0117h.f2920e) {
            return new String(c0117h.n(s4), AbstractC0133y.f2975a);
        }
        c0117h.D(s4);
        String str2 = new String(bArr, c0117h.f2922g, s4, AbstractC0133y.f2975a);
        c0117h.f2922g += s4;
        return str2;
    }

    public void L(List list, boolean z3) {
        int z4;
        int z5;
        if ((this.f2311a & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        boolean z6 = list instanceof androidx.datastore.preferences.protobuf.D;
        C0117h c0117h = (C0117h) this.f2314d;
        if (!z6 || z3) {
            do {
                list.add(z3 ? M() : K());
                if (c0117h.c()) {
                    return;
                } else {
                    z4 = c0117h.z();
                }
            } while (z4 == this.f2311a);
            this.f2313c = z4;
            return;
        }
        androidx.datastore.preferences.protobuf.D d4 = (androidx.datastore.preferences.protobuf.D) list;
        do {
            d4.e(h());
            if (c0117h.c()) {
                return;
            } else {
                z5 = c0117h.z();
            }
        } while (z5 == this.f2311a);
        this.f2313c = z5;
    }

    public String M() {
        S(2);
        C0117h c0117h = (C0117h) this.f2314d;
        int s4 = c0117h.s();
        int i = c0117h.f2922g;
        int i4 = c0117h.f2920e;
        int i5 = i4 - i;
        byte[] bArr = c0117h.f2919d;
        if (s4 <= i5 && s4 > 0) {
            c0117h.f2922g = i + s4;
        } else {
            if (s4 == 0) {
                return "";
            }
            i = 0;
            if (s4 <= i4) {
                c0117h.D(s4);
                c0117h.f2922g = s4;
            } else {
                bArr = c0117h.n(s4);
            }
        }
        return v0.f2974a.e(i, s4, bArr);
    }

    public int N() {
        S(0);
        return ((C0117h) this.f2314d).A();
    }

    public void O(List list) {
        int z3;
        boolean z4 = list instanceof AbstractC0131w;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 0) {
                c0117h.A();
                throw null;
            }
            if (i != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0117h.A();
            c0117h.A();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            int b4 = c0117h.b() + c0117h.A();
            do {
                list.add(Integer.valueOf(c0117h.A()));
            } while (c0117h.b() < b4);
            R(b4);
            return;
        }
        do {
            list.add(Integer.valueOf(c0117h.A()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public long P() {
        S(0);
        return ((C0117h) this.f2314d).B();
    }

    public void Q(List list) {
        int z3;
        boolean z4 = list instanceof androidx.datastore.preferences.protobuf.H;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 0) {
                c0117h.B();
                throw null;
            }
            if (i != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0117h.A();
            c0117h.B();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            int b4 = c0117h.b() + c0117h.A();
            do {
                list.add(Long.valueOf(c0117h.B()));
            } while (c0117h.b() < b4);
            R(b4);
            return;
        }
        do {
            list.add(Long.valueOf(c0117h.B()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public void R(int i) {
        if (((C0117h) this.f2314d).b() != i) {
            throw androidx.datastore.preferences.protobuf.A.f();
        }
    }

    public void S(int i) {
        if ((this.f2311a & 7) != i) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
    }

    public boolean T() {
        int i;
        C0117h c0117h = (C0117h) this.f2314d;
        if (c0117h.c() || (i = this.f2311a) == this.f2312b) {
            return false;
        }
        return c0117h.E(i);
    }

    public void a(B b4) {
        b4.f2194c = null;
        b4.f2192a = null;
        b4.f2193b = null;
        b4.i = 1;
        int i = this.f2311a;
        if (i > 0) {
            int i4 = this.f2313c;
            if ((i4 & 1) == 0) {
                this.f2313c = i4 + 1;
                this.f2311a = i - 1;
                this.f2312b++;
            }
        }
        b4.f2192a = (B) this.f2314d;
        this.f2314d = b4;
        int i5 = this.f2313c;
        int i6 = i5 + 1;
        this.f2313c = i6;
        int i7 = this.f2311a;
        if (i7 > 0 && (i6 & 1) == 0) {
            this.f2313c = i5 + 2;
            this.f2311a = i7 - 1;
            this.f2312b++;
        }
        int i8 = 4;
        while (true) {
            int i9 = i8 - 1;
            if ((this.f2313c & i9) != i9) {
                return;
            }
            int i10 = this.f2312b;
            if (i10 == 0) {
                B b5 = (B) this.f2314d;
                B b6 = b5.f2192a;
                B b7 = b6.f2192a;
                b6.f2192a = b7.f2192a;
                this.f2314d = b6;
                b6.f2193b = b7;
                b6.f2194c = b5;
                b6.i = b5.i + 1;
                b7.f2192a = b6;
                b5.f2192a = b6;
            } else if (i10 == 1) {
                B b8 = (B) this.f2314d;
                B b9 = b8.f2192a;
                this.f2314d = b9;
                b9.f2194c = b8;
                b9.i = b8.i + 1;
                b8.f2192a = b9;
                this.f2312b = 0;
            } else if (i10 == 2) {
                this.f2312b = 0;
            }
            i8 *= 2;
        }
    }

    public void b(int i, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i5 = this.f2313c;
        int i6 = i5 * 2;
        int[] iArr = (int[]) this.f2314d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2314d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i6 >= iArr.length) {
            int[] iArr3 = new int[i5 * 4];
            this.f2314d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f2314d;
        iArr4[i6] = i;
        iArr4[i6 + 1] = i4;
        this.f2313c++;
    }

    public void c(RecyclerView recyclerView, boolean z3) {
        this.f2313c = 0;
        int[] iArr = (int[]) this.f2314d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0238q0 abstractC0238q0 = recyclerView.f3696n;
        if (recyclerView.f3694m == null || abstractC0238q0 == null || !abstractC0238q0.i) {
            return;
        }
        if (z3) {
            if (!recyclerView.f3680e.j()) {
                abstractC0238q0.i(recyclerView.f3694m.getItemCount(), this);
            }
        } else if (!recyclerView.Q()) {
            abstractC0238q0.h(this.f2311a, this.f2312b, recyclerView.f3686h0, this);
        }
        int i = this.f2313c;
        if (i > abstractC0238q0.f3890j) {
            abstractC0238q0.f3890j = i;
            abstractC0238q0.f3891k = z3;
            recyclerView.f3676c.m();
        }
    }

    public int d() {
        int i = this.f2313c;
        if (i != 0) {
            this.f2311a = i;
            this.f2313c = 0;
        } else {
            this.f2311a = ((C0117h) this.f2314d).z();
        }
        int i4 = this.f2311a;
        if (i4 == 0 || i4 == this.f2312b) {
            return Integer.MAX_VALUE;
        }
        return i4 >>> 3;
    }

    public int e() {
        return this.f2311a;
    }

    public boolean f() {
        S(0);
        return ((C0117h) this.f2314d).f();
    }

    public void g(List list) {
        int z3;
        boolean z4 = list instanceof AbstractC0113d;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 0) {
                c0117h.f();
                throw null;
            }
            if (i != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0117h.A();
            c0117h.f();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            int b4 = c0117h.b() + c0117h.A();
            do {
                list.add(Boolean.valueOf(c0117h.f()));
            } while (c0117h.b() < b4);
            R(b4);
            return;
        }
        do {
            list.add(Boolean.valueOf(c0117h.f()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public C0116g h() {
        S(2);
        C0117h c0117h = (C0117h) this.f2314d;
        int s4 = c0117h.s();
        int i = c0117h.f2920e;
        int i4 = c0117h.f2922g;
        int i5 = i - i4;
        byte[] bArr = c0117h.f2919d;
        if (s4 <= i5 && s4 > 0) {
            C0116g a2 = C0116g.a(i4, s4, bArr);
            c0117h.f2922g += s4;
            return a2;
        }
        if (s4 == 0) {
            return C0116g.f2909c;
        }
        byte[] o4 = c0117h.o(s4);
        if (o4 != null) {
            return C0116g.a(0, o4.length, o4);
        }
        int i6 = c0117h.f2922g;
        int i7 = c0117h.f2920e;
        int i8 = i7 - i6;
        c0117h.i += i7;
        c0117h.f2922g = 0;
        c0117h.f2920e = 0;
        ArrayList p = c0117h.p(s4 - i8);
        byte[] bArr2 = new byte[s4];
        System.arraycopy(bArr, i6, bArr2, 0, i8);
        Iterator it = p.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i8, bArr3.length);
            i8 += bArr3.length;
        }
        C0116g c0116g = C0116g.f2909c;
        return new C0116g(bArr2);
    }

    public void i(List list) {
        int z3;
        if ((this.f2311a & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        do {
            list.add(h());
            C0117h c0117h = (C0117h) this.f2314d;
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public double j() {
        S(1);
        return ((C0117h) this.f2314d).g();
    }

    public void k(List list) {
        int z3;
        boolean z4 = list instanceof AbstractC0120k;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 1) {
                c0117h.g();
                throw null;
            }
            if (i != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            V(c0117h.A());
            c0117h.g();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 != 1) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            int A3 = c0117h.A();
            V(A3);
            int b4 = c0117h.b() + A3;
            do {
                list.add(Double.valueOf(c0117h.g()));
            } while (c0117h.b() < b4);
            return;
        }
        do {
            list.add(Double.valueOf(c0117h.g()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public int l() {
        S(0);
        return ((C0117h) this.f2314d).h();
    }

    public void m(List list) {
        int z3;
        boolean z4 = list instanceof AbstractC0131w;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 0) {
                c0117h.h();
                throw null;
            }
            if (i != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0117h.A();
            c0117h.h();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            int b4 = c0117h.b() + c0117h.A();
            do {
                list.add(Integer.valueOf(c0117h.h()));
            } while (c0117h.b() < b4);
            R(b4);
            return;
        }
        do {
            list.add(Integer.valueOf(c0117h.h()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public Object n(A0 a02, Class cls, C0122m c0122m) {
        switch (a02.ordinal()) {
            case 0:
                return Double.valueOf(j());
            case 1:
                return Float.valueOf(s());
            case 2:
                return Long.valueOf(y());
            case 3:
                return Long.valueOf(P());
            case 4:
                return Integer.valueOf(w());
            case 5:
                return Long.valueOf(q());
            case 6:
                return Integer.valueOf(o());
            case 7:
                return Boolean.valueOf(f());
            case 8:
                return M();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                S(2);
                return A(Y.f2881c.a(cls), c0122m);
            case 11:
                return h();
            case 12:
                return Integer.valueOf(N());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Integer.valueOf(C());
            case 15:
                return Long.valueOf(E());
            case 16:
                return Integer.valueOf(G());
            case 17:
                return Long.valueOf(I());
        }
    }

    public int o() {
        S(5);
        return ((C0117h) this.f2314d).i();
    }

    public void p(List list) {
        int z3;
        boolean z4 = list instanceof AbstractC0131w;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 2) {
                U(c0117h.A());
                c0117h.i();
                throw null;
            }
            if (i != 5) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0117h.i();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 == 2) {
            int A3 = c0117h.A();
            U(A3);
            int b4 = c0117h.b() + A3;
            do {
                list.add(Integer.valueOf(c0117h.i()));
            } while (c0117h.b() < b4);
            return;
        }
        if (i4 != 5) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        do {
            list.add(Integer.valueOf(c0117h.i()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public long q() {
        S(1);
        return ((C0117h) this.f2314d).j();
    }

    public void r(List list) {
        int z3;
        boolean z4 = list instanceof androidx.datastore.preferences.protobuf.H;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 1) {
                c0117h.j();
                throw null;
            }
            if (i != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            V(c0117h.A());
            c0117h.j();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 != 1) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            int A3 = c0117h.A();
            V(A3);
            int b4 = c0117h.b() + A3;
            do {
                list.add(Long.valueOf(c0117h.j()));
            } while (c0117h.b() < b4);
            return;
        }
        do {
            list.add(Long.valueOf(c0117h.j()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public float s() {
        S(5);
        return ((C0117h) this.f2314d).k();
    }

    public void t(List list) {
        int z3;
        boolean z4 = list instanceof androidx.datastore.preferences.protobuf.r;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 2) {
                U(c0117h.A());
                c0117h.k();
                throw null;
            }
            if (i != 5) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0117h.k();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 == 2) {
            int A3 = c0117h.A();
            U(A3);
            int b4 = c0117h.b() + A3;
            do {
                list.add(Float.valueOf(c0117h.k()));
            } while (c0117h.b() < b4);
            return;
        }
        if (i4 != 5) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        do {
            list.add(Float.valueOf(c0117h.k()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public Object u(InterfaceC0111b0 interfaceC0111b0, C0122m c0122m) {
        int i = this.f2312b;
        this.f2312b = ((this.f2311a >>> 3) << 3) | 4;
        try {
            Object i4 = interfaceC0111b0.i();
            interfaceC0111b0.c(i4, this, c0122m);
            interfaceC0111b0.d(i4);
            if (this.f2311a == this.f2312b) {
                return i4;
            }
            throw androidx.datastore.preferences.protobuf.A.e();
        } finally {
            this.f2312b = i;
        }
    }

    public Object v(InterfaceC0111b0 interfaceC0111b0, C0122m c0122m) {
        S(3);
        return u(interfaceC0111b0, c0122m);
    }

    public int w() {
        S(0);
        return ((C0117h) this.f2314d).l();
    }

    public void x(List list) {
        int z3;
        boolean z4 = list instanceof AbstractC0131w;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 0) {
                c0117h.l();
                throw null;
            }
            if (i != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0117h.A();
            c0117h.l();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            int b4 = c0117h.b() + c0117h.A();
            do {
                list.add(Integer.valueOf(c0117h.l()));
            } while (c0117h.b() < b4);
            R(b4);
            return;
        }
        do {
            list.add(Integer.valueOf(c0117h.l()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }

    public long y() {
        S(0);
        return ((C0117h) this.f2314d).m();
    }

    public void z(List list) {
        int z3;
        boolean z4 = list instanceof androidx.datastore.preferences.protobuf.H;
        C0117h c0117h = (C0117h) this.f2314d;
        if (z4) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f2311a & 7;
            if (i == 0) {
                c0117h.m();
                throw null;
            }
            if (i != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0117h.A();
            c0117h.m();
            throw null;
        }
        int i4 = this.f2311a & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            int b4 = c0117h.b() + c0117h.A();
            do {
                list.add(Long.valueOf(c0117h.m()));
            } while (c0117h.b() < b4);
            R(b4);
            return;
        }
        do {
            list.add(Long.valueOf(c0117h.m()));
            if (c0117h.c()) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == this.f2311a);
        this.f2313c = z3;
    }
}
