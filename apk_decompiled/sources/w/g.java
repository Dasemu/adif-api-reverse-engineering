package w;

import java.util.ArrayList;
import u.C0626c;
import x.C0653b;

/* loaded from: classes.dex */
public final class g extends i {
    public int A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0653b f8761B0;

    /* renamed from: C0, reason: collision with root package name */
    public androidx.constraintlayout.widget.f f8762C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f8763D0;
    public int E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f8764F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f8765G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f8766H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f8767I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f8768J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f8769K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f8770L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f8771M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f8772N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f8773O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f8774P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f8775Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f8776R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f8777S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f8778T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f8779U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f8780V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f8781W0;

    /* renamed from: X0, reason: collision with root package name */
    public d[] f8782X0;
    public d[] Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f8783Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f8784a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f8785b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f8786s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f8787t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f8788u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f8789v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f8790w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f8791x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f8792y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f8793z0;

    @Override // w.i
    public final void S() {
        for (int i = 0; i < this.f8801r0; i++) {
            d dVar = this.f8800q0[i];
            if (dVar != null) {
                dVar.f8668F = true;
            }
        }
    }

    public final int T(d dVar, int i) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f8715p0;
            if (iArr[1] == 3) {
                int i4 = dVar.f8718s;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i5 = (int) (dVar.f8725z * i);
                        if (i5 != dVar.k()) {
                            dVar.f8699g = true;
                            V(iArr[0], dVar.q(), 1, i5, dVar);
                        }
                        return i5;
                    }
                    dVar2 = dVar;
                    if (i4 == 1) {
                        return dVar2.k();
                    }
                    if (i4 == 3) {
                        return (int) ((dVar2.q() * dVar2.f8684W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.k();
        }
        return 0;
    }

    public final int U(d dVar, int i) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f8715p0;
            if (iArr[0] == 3) {
                int i4 = dVar.f8717r;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i5 = (int) (dVar.f8722w * i);
                        if (i5 != dVar.q()) {
                            dVar.f8699g = true;
                            V(1, i5, iArr[1], dVar.k(), dVar);
                        }
                        return i5;
                    }
                    dVar2 = dVar;
                    if (i4 == 1) {
                        return dVar2.q();
                    }
                    if (i4 == 3) {
                        return (int) ((dVar2.k() * dVar2.f8684W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i4, int i5, int i6, d dVar) {
        androidx.constraintlayout.widget.f fVar;
        d dVar2;
        while (true) {
            fVar = this.f8762C0;
            if (fVar != null || (dVar2 = this.f8681T) == null) {
                break;
            } else {
                this.f8762C0 = ((e) dVar2).f8740u0;
            }
        }
        C0653b c0653b = this.f8761B0;
        c0653b.f8811a = i;
        c0653b.f8812b = i5;
        c0653b.f8813c = i4;
        c0653b.f8814d = i6;
        fVar.b(dVar, c0653b);
        dVar.O(c0653b.f8815e);
        dVar.L(c0653b.f8816f);
        dVar.f8667E = c0653b.h;
        dVar.I(c0653b.f8817g);
    }

    @Override // w.d
    public final void b(C0626c c0626c, boolean z3) {
        d dVar;
        float f2;
        int i;
        super.b(c0626c, z3);
        d dVar2 = this.f8681T;
        boolean z4 = dVar2 != null && ((e) dVar2).f8741v0;
        int i4 = this.f8778T0;
        ArrayList arrayList = this.f8781W0;
        if (i4 != 0) {
            if (i4 == 1) {
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    ((f) arrayList.get(i5)).b(i5, z4, i5 == size + (-1));
                    i5++;
                }
            } else if (i4 != 2) {
                if (i4 == 3) {
                    int size2 = arrayList.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        ((f) arrayList.get(i6)).b(i6, z4, i6 == size2 + (-1));
                        i6++;
                    }
                }
            } else if (this.f8783Z0 != null && this.Y0 != null && this.f8782X0 != null) {
                for (int i7 = 0; i7 < this.f8785b1; i7++) {
                    this.f8784a1[i7].D();
                }
                int[] iArr = this.f8783Z0;
                int i8 = iArr[0];
                int i9 = iArr[1];
                float f4 = this.f8768J0;
                d dVar3 = null;
                int i10 = 0;
                while (i10 < i8) {
                    if (z4) {
                        i = (i8 - i10) - 1;
                        f2 = 1.0f - this.f8768J0;
                    } else {
                        f2 = f4;
                        i = i10;
                    }
                    d dVar4 = this.Y0[i];
                    if (dVar4 != null && dVar4.f8700g0 != 8) {
                        c cVar = dVar4.f8671I;
                        if (i10 == 0) {
                            dVar4.f(cVar, this.f8671I, this.f8790w0);
                            dVar4.f8702i0 = this.f8763D0;
                            dVar4.f8694d0 = f2;
                        }
                        if (i10 == i8 - 1) {
                            dVar4.f(dVar4.f8672K, this.f8672K, this.f8791x0);
                        }
                        if (i10 > 0 && dVar3 != null) {
                            int i11 = this.f8774P0;
                            c cVar2 = dVar3.f8672K;
                            dVar4.f(cVar, cVar2, i11);
                            dVar3.f(cVar2, cVar, 0);
                        }
                        dVar3 = dVar4;
                    }
                    i10++;
                    f4 = f2;
                }
                for (int i12 = 0; i12 < i9; i12++) {
                    d dVar5 = this.f8782X0[i12];
                    if (dVar5 != null && dVar5.f8700g0 != 8) {
                        c cVar3 = dVar5.J;
                        if (i12 == 0) {
                            dVar5.f(cVar3, this.J, this.f8786s0);
                            dVar5.f8704j0 = this.E0;
                            dVar5.f8696e0 = this.f8769K0;
                        }
                        if (i12 == i9 - 1) {
                            dVar5.f(dVar5.f8673L, this.f8673L, this.f8787t0);
                        }
                        if (i12 > 0 && dVar3 != null) {
                            int i13 = this.f8775Q0;
                            c cVar4 = dVar3.f8673L;
                            dVar5.f(cVar3, cVar4, i13);
                            dVar3.f(cVar4, cVar3, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i14 = 0; i14 < i8; i14++) {
                    for (int i15 = 0; i15 < i9; i15++) {
                        int i16 = (i15 * i8) + i14;
                        if (this.f8780V0 == 1) {
                            i16 = (i14 * i9) + i15;
                        }
                        d[] dVarArr = this.f8784a1;
                        if (i16 < dVarArr.length && (dVar = dVarArr[i16]) != null && dVar.f8700g0 != 8) {
                            d dVar6 = this.Y0[i14];
                            d dVar7 = this.f8782X0[i15];
                            if (dVar != dVar6) {
                                dVar.f(dVar.f8671I, dVar6.f8671I, 0);
                                dVar.f(dVar.f8672K, dVar6.f8672K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.J, dVar7.J, 0);
                                dVar.f(dVar.f8673L, dVar7.f8673L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z4, true);
        }
        this.f8792y0 = false;
    }
}
