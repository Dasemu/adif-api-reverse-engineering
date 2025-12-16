package w;

import C.w;
import u.AbstractC0629f;
import u.C0625b;
import u.C0626c;
import u.C0630g;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f8638s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f8639t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f8640u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f8641v0;

    @Override // w.d
    public final boolean A() {
        return this.f8641v0;
    }

    @Override // w.d
    public final boolean B() {
        return this.f8641v0;
    }

    public final boolean T() {
        int i;
        int i4;
        int i5;
        boolean z3 = true;
        int i6 = 0;
        while (true) {
            i = this.f8801r0;
            if (i6 >= i) {
                break;
            }
            d dVar = this.f8800q0[i6];
            if ((this.f8639t0 || dVar.c()) && ((((i4 = this.f8638s0) == 0 || i4 == 1) && !dVar.A()) || (((i5 = this.f8638s0) == 2 || i5 == 3) && !dVar.B()))) {
                z3 = false;
            }
            i6++;
        }
        if (!z3 || i <= 0) {
            return false;
        }
        int i7 = 0;
        boolean z4 = false;
        for (int i8 = 0; i8 < this.f8801r0; i8++) {
            d dVar2 = this.f8800q0[i8];
            if (this.f8639t0 || dVar2.c()) {
                if (!z4) {
                    int i9 = this.f8638s0;
                    if (i9 == 0) {
                        i7 = dVar2.i(2).d();
                    } else if (i9 == 1) {
                        i7 = dVar2.i(4).d();
                    } else if (i9 == 2) {
                        i7 = dVar2.i(3).d();
                    } else if (i9 == 3) {
                        i7 = dVar2.i(5).d();
                    }
                    z4 = true;
                }
                int i10 = this.f8638s0;
                if (i10 == 0) {
                    i7 = Math.min(i7, dVar2.i(2).d());
                } else if (i10 == 1) {
                    i7 = Math.max(i7, dVar2.i(4).d());
                } else if (i10 == 2) {
                    i7 = Math.min(i7, dVar2.i(3).d());
                } else if (i10 == 3) {
                    i7 = Math.max(i7, dVar2.i(5).d());
                }
            }
        }
        int i11 = i7 + this.f8640u0;
        int i12 = this.f8638s0;
        if (i12 == 0 || i12 == 1) {
            J(i11, i11);
        } else {
            K(i11, i11);
        }
        this.f8641v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f8638s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // w.d
    public final void b(C0626c c0626c, boolean z3) {
        boolean z4;
        int i;
        int i4;
        c[] cVarArr = this.f8678Q;
        c cVar = this.f8671I;
        cVarArr[0] = cVar;
        c cVar2 = this.J;
        int i5 = 2;
        cVarArr[2] = cVar2;
        c cVar3 = this.f8672K;
        cVarArr[1] = cVar3;
        c cVar4 = this.f8673L;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.i = c0626c.k(cVar5);
        }
        int i6 = this.f8638s0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i6];
        if (!this.f8641v0) {
            T();
        }
        if (this.f8641v0) {
            this.f8641v0 = false;
            int i7 = this.f8638s0;
            if (i7 == 0 || i7 == 1) {
                c0626c.d(cVar.i, this.f8686Y);
                c0626c.d(cVar3.i, this.f8686Y);
                return;
            } else {
                if (i7 == 2 || i7 == 3) {
                    c0626c.d(cVar2.i, this.Z);
                    c0626c.d(cVar4.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i8 = 0; i8 < this.f8801r0; i8++) {
            d dVar = this.f8800q0[i8];
            if ((this.f8639t0 || dVar.c()) && ((((i4 = this.f8638s0) == 0 || i4 == 1) && dVar.f8715p0[0] == 3 && dVar.f8671I.f8661f != null && dVar.f8672K.f8661f != null) || ((i4 == 2 || i4 == 3) && dVar.f8715p0[1] == 3 && dVar.J.f8661f != null && dVar.f8673L.f8661f != null))) {
                z4 = true;
                break;
            }
        }
        z4 = false;
        boolean z5 = cVar.g() || cVar3.g();
        boolean z6 = cVar2.g() || cVar4.g();
        int i9 = (z4 || !(((i = this.f8638s0) == 0 && z5) || ((i == 2 && z6) || ((i == 1 && z5) || (i == 3 && z6))))) ? 4 : 5;
        int i10 = 0;
        while (i10 < this.f8801r0) {
            d dVar2 = this.f8800q0[i10];
            if (this.f8639t0 || dVar2.c()) {
                C0630g k4 = c0626c.k(dVar2.f8678Q[this.f8638s0]);
                int i11 = this.f8638s0;
                c cVar7 = dVar2.f8678Q[i11];
                cVar7.i = k4;
                c cVar8 = cVar7.f8661f;
                int i12 = (cVar8 == null || cVar8.f8659d != this) ? 0 : cVar7.f8662g;
                if (i11 == 0 || i11 == i5) {
                    C0630g c0630g = cVar6.i;
                    int i13 = this.f8640u0 - i12;
                    C0625b l4 = c0626c.l();
                    C0630g m4 = c0626c.m();
                    m4.f8587d = 0;
                    l4.c(c0630g, k4, m4, i13);
                    c0626c.c(l4);
                } else {
                    C0630g c0630g2 = cVar6.i;
                    int i14 = this.f8640u0 + i12;
                    C0625b l5 = c0626c.l();
                    C0630g m5 = c0626c.m();
                    m5.f8587d = 0;
                    l5.b(c0630g2, k4, m5, i14);
                    c0626c.c(l5);
                }
                c0626c.e(cVar6.i, k4, this.f8640u0 + i12, i9);
            }
            i10++;
            i5 = 2;
        }
        int i15 = this.f8638s0;
        if (i15 == 0) {
            c0626c.e(cVar3.i, cVar.i, 0, 8);
            c0626c.e(cVar.i, this.f8681T.f8672K.i, 0, 4);
            c0626c.e(cVar.i, this.f8681T.f8671I.i, 0, 0);
            return;
        }
        if (i15 == 1) {
            c0626c.e(cVar.i, cVar3.i, 0, 8);
            c0626c.e(cVar.i, this.f8681T.f8671I.i, 0, 4);
            c0626c.e(cVar.i, this.f8681T.f8672K.i, 0, 0);
        } else if (i15 == 2) {
            c0626c.e(cVar4.i, cVar2.i, 0, 8);
            c0626c.e(cVar2.i, this.f8681T.f8673L.i, 0, 4);
            c0626c.e(cVar2.i, this.f8681T.J.i, 0, 0);
        } else if (i15 == 3) {
            c0626c.e(cVar2.i, cVar4.i, 0, 8);
            c0626c.e(cVar2.i, this.f8681T.J.i, 0, 4);
            c0626c.e(cVar2.i, this.f8681T.f8673L.i, 0, 0);
        }
    }

    @Override // w.d
    public final boolean c() {
        return true;
    }

    @Override // w.d
    public final String toString() {
        String r4 = w.r(new StringBuilder("[Barrier] "), this.f8701h0, " {");
        for (int i = 0; i < this.f8801r0; i++) {
            d dVar = this.f8800q0[i];
            if (i > 0) {
                r4 = w.n(r4, ", ");
            }
            StringBuilder a2 = AbstractC0629f.a(r4);
            a2.append(dVar.f8701h0);
            r4 = a2.toString();
        }
        return w.n(r4, "}");
    }
}
