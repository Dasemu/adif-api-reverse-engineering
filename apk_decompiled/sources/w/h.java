package w;

import java.util.ArrayList;
import u.AbstractC0629f;
import u.C0625b;
import u.C0626c;
import u.C0630g;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f8794q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f8795r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f8796s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f8797t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f8798u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f8799v0;

    public h() {
        this.f8679R.clear();
        this.f8679R.add(this.f8797t0);
        int length = this.f8678Q.length;
        for (int i = 0; i < length; i++) {
            this.f8678Q[i] = this.f8797t0;
        }
    }

    @Override // w.d
    public final boolean A() {
        return this.f8799v0;
    }

    @Override // w.d
    public final boolean B() {
        return this.f8799v0;
    }

    @Override // w.d
    public final void Q(C0626c c0626c, boolean z3) {
        if (this.f8681T == null) {
            return;
        }
        c cVar = this.f8797t0;
        c0626c.getClass();
        int n4 = C0626c.n(cVar);
        if (this.f8798u0 == 1) {
            this.f8686Y = n4;
            this.Z = 0;
            L(this.f8681T.k());
            O(0);
            return;
        }
        this.f8686Y = 0;
        this.Z = n4;
        O(this.f8681T.q());
        L(0);
    }

    public final void R(int i) {
        this.f8797t0.l(i);
        this.f8799v0 = true;
    }

    public final void S(int i) {
        if (this.f8798u0 == i) {
            return;
        }
        this.f8798u0 = i;
        ArrayList arrayList = this.f8679R;
        arrayList.clear();
        if (this.f8798u0 == 1) {
            this.f8797t0 = this.f8671I;
        } else {
            this.f8797t0 = this.J;
        }
        arrayList.add(this.f8797t0);
        c[] cVarArr = this.f8678Q;
        int length = cVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            cVarArr[i4] = this.f8797t0;
        }
    }

    @Override // w.d
    public final void b(C0626c c0626c, boolean z3) {
        e eVar = (e) this.f8681T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i4 = eVar.i(4);
        d dVar = this.f8681T;
        boolean z4 = dVar != null && dVar.f8715p0[0] == 2;
        if (this.f8798u0 == 0) {
            i = eVar.i(3);
            i4 = eVar.i(5);
            d dVar2 = this.f8681T;
            z4 = dVar2 != null && dVar2.f8715p0[1] == 2;
        }
        if (this.f8799v0) {
            c cVar = this.f8797t0;
            if (cVar.f8658c) {
                C0630g k4 = c0626c.k(cVar);
                c0626c.d(k4, this.f8797t0.d());
                if (this.f8795r0 != -1) {
                    if (z4) {
                        c0626c.f(c0626c.k(i4), k4, 0, 5);
                    }
                } else if (this.f8796s0 != -1 && z4) {
                    C0630g k5 = c0626c.k(i4);
                    c0626c.f(k4, c0626c.k(i), 0, 5);
                    c0626c.f(k5, k4, 0, 5);
                }
                this.f8799v0 = false;
                return;
            }
        }
        if (this.f8795r0 != -1) {
            C0630g k6 = c0626c.k(this.f8797t0);
            c0626c.e(k6, c0626c.k(i), this.f8795r0, 8);
            if (z4) {
                c0626c.f(c0626c.k(i4), k6, 0, 5);
                return;
            }
            return;
        }
        if (this.f8796s0 != -1) {
            C0630g k7 = c0626c.k(this.f8797t0);
            C0630g k8 = c0626c.k(i4);
            c0626c.e(k7, k8, -this.f8796s0, 8);
            if (z4) {
                c0626c.f(k7, c0626c.k(i), 0, 5);
                c0626c.f(k8, k7, 0, 5);
                return;
            }
            return;
        }
        if (this.f8794q0 != -1.0f) {
            C0630g k9 = c0626c.k(this.f8797t0);
            C0630g k10 = c0626c.k(i4);
            float f2 = this.f8794q0;
            C0625b l4 = c0626c.l();
            l4.f8565d.g(k9, -1.0f);
            l4.f8565d.g(k10, f2);
            c0626c.c(l4);
        }
    }

    @Override // w.d
    public final boolean c() {
        return true;
    }

    @Override // w.d
    public final c i(int i) {
        int b4 = AbstractC0629f.b(i);
        if (b4 != 1) {
            if (b4 != 2) {
                if (b4 != 3) {
                    if (b4 != 4) {
                        return null;
                    }
                }
            }
            if (this.f8798u0 == 0) {
                return this.f8797t0;
            }
            return null;
        }
        if (this.f8798u0 == 1) {
            return this.f8797t0;
        }
        return null;
    }
}
