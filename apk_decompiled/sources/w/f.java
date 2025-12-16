package w;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f8746a;

    /* renamed from: d, reason: collision with root package name */
    public c f8749d;

    /* renamed from: e, reason: collision with root package name */
    public c f8750e;

    /* renamed from: f, reason: collision with root package name */
    public c f8751f;

    /* renamed from: g, reason: collision with root package name */
    public c f8752g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f8753j;

    /* renamed from: k, reason: collision with root package name */
    public int f8754k;

    /* renamed from: q, reason: collision with root package name */
    public int f8759q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f8760r;

    /* renamed from: b, reason: collision with root package name */
    public d f8747b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f8748c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f8755l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f8756m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f8757n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f8758o = 0;
    public int p = 0;

    public f(g gVar, int i, c cVar, c cVar2, c cVar3, c cVar4, int i4) {
        this.f8760r = gVar;
        this.f8746a = i;
        this.f8749d = cVar;
        this.f8750e = cVar2;
        this.f8751f = cVar3;
        this.f8752g = cVar4;
        this.h = gVar.f8790w0;
        this.i = gVar.f8786s0;
        this.f8753j = gVar.f8791x0;
        this.f8754k = gVar.f8787t0;
        this.f8759q = i4;
    }

    public final void a(d dVar) {
        int i = this.f8746a;
        g gVar = this.f8760r;
        if (i == 0) {
            int U3 = gVar.U(dVar, this.f8759q);
            if (dVar.f8715p0[0] == 3) {
                this.p++;
                U3 = 0;
            }
            this.f8755l = U3 + (dVar.f8700g0 != 8 ? gVar.f8774P0 : 0) + this.f8755l;
            int T3 = gVar.T(dVar, this.f8759q);
            if (this.f8747b == null || this.f8748c < T3) {
                this.f8747b = dVar;
                this.f8748c = T3;
                this.f8756m = T3;
            }
        } else {
            int U4 = gVar.U(dVar, this.f8759q);
            int T4 = gVar.T(dVar, this.f8759q);
            if (dVar.f8715p0[1] == 3) {
                this.p++;
                T4 = 0;
            }
            this.f8756m = T4 + (dVar.f8700g0 != 8 ? gVar.f8775Q0 : 0) + this.f8756m;
            if (this.f8747b == null || this.f8748c < U4) {
                this.f8747b = dVar;
                this.f8748c = U4;
                this.f8755l = U4;
            }
        }
        this.f8758o++;
    }

    public final void b(int i, boolean z3, boolean z4) {
        g gVar;
        int i4;
        int i5;
        d dVar;
        boolean z5;
        char c4;
        float f2;
        float f4;
        int i6;
        float f5;
        float f6;
        int i7;
        int i8 = this.f8758o;
        int i9 = 0;
        while (true) {
            gVar = this.f8760r;
            if (i9 >= i8 || (i7 = this.f8757n + i9) >= gVar.f8785b1) {
                break;
            }
            d dVar2 = gVar.f8784a1[i7];
            if (dVar2 != null) {
                dVar2.D();
            }
            i9++;
        }
        if (i8 == 0 || this.f8747b == null) {
            return;
        }
        boolean z6 = z4 && i == 0;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = this.f8757n + (z3 ? (i8 - 1) - i12 : i12);
            if (i13 >= gVar.f8785b1) {
                break;
            }
            d dVar3 = gVar.f8784a1[i13];
            if (dVar3 != null && dVar3.f8700g0 == 0) {
                if (i10 == -1) {
                    i10 = i12;
                }
                i11 = i12;
            }
        }
        if (this.f8746a != 0) {
            boolean z7 = z6;
            d dVar4 = this.f8747b;
            dVar4.f8702i0 = gVar.f8763D0;
            int i14 = this.h;
            if (i > 0) {
                i14 += gVar.f8774P0;
            }
            c cVar = dVar4.f8671I;
            c cVar2 = dVar4.f8672K;
            if (z3) {
                cVar2.a(this.f8751f, i14);
                if (z4) {
                    cVar.a(this.f8749d, this.f8753j);
                }
                if (i > 0) {
                    this.f8751f.f8659d.f8671I.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f8749d, i14);
                if (z4) {
                    cVar2.a(this.f8751f, this.f8753j);
                }
                if (i > 0) {
                    this.f8749d.f8659d.f8672K.a(cVar, 0);
                }
            }
            d dVar5 = null;
            for (int i15 = 0; i15 < i8; i15++) {
                int i16 = this.f8757n + i15;
                if (i16 >= gVar.f8785b1) {
                    return;
                }
                d dVar6 = gVar.f8784a1[i16];
                if (dVar6 != null) {
                    c cVar3 = dVar6.J;
                    if (i15 == 0) {
                        dVar6.f(cVar3, this.f8750e, this.i);
                        int i17 = gVar.E0;
                        float f7 = gVar.f8769K0;
                        if (this.f8757n == 0) {
                            i5 = gVar.f8765G0;
                            i4 = -1;
                            if (i5 != -1) {
                                f7 = gVar.f8771M0;
                                i17 = i5;
                                dVar6.f8704j0 = i17;
                                dVar6.f8696e0 = f7;
                            }
                        } else {
                            i4 = -1;
                        }
                        if (z4 && (i5 = gVar.f8767I0) != i4) {
                            f7 = gVar.f8773O0;
                            i17 = i5;
                        }
                        dVar6.f8704j0 = i17;
                        dVar6.f8696e0 = f7;
                    }
                    if (i15 == i8 - 1) {
                        dVar6.f(dVar6.f8673L, this.f8752g, this.f8754k);
                    }
                    if (dVar5 != null) {
                        int i18 = gVar.f8775Q0;
                        c cVar4 = dVar5.f8673L;
                        cVar3.a(cVar4, i18);
                        if (i15 == i10) {
                            int i19 = this.i;
                            if (cVar3.h()) {
                                cVar3.h = i19;
                            }
                        }
                        cVar4.a(cVar3, 0);
                        if (i15 == i11 + 1) {
                            int i20 = this.f8754k;
                            if (cVar4.h()) {
                                cVar4.h = i20;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        c cVar5 = dVar6.f8672K;
                        c cVar6 = dVar6.f8671I;
                        if (z3) {
                            int i21 = gVar.f8776R0;
                            if (i21 == 0) {
                                cVar5.a(cVar2, 0);
                            } else if (i21 == 1) {
                                cVar6.a(cVar, 0);
                            } else if (i21 == 2) {
                                cVar6.a(cVar, 0);
                                cVar5.a(cVar2, 0);
                            }
                        } else {
                            int i22 = gVar.f8776R0;
                            if (i22 == 0) {
                                cVar6.a(cVar, 0);
                            } else if (i22 == 1) {
                                cVar5.a(cVar2, 0);
                            } else if (i22 == 2) {
                                if (z7) {
                                    cVar6.a(this.f8749d, this.h);
                                    cVar5.a(this.f8751f, this.f8753j);
                                } else {
                                    cVar6.a(cVar, 0);
                                    cVar5.a(cVar2, 0);
                                }
                            }
                            dVar5 = dVar6;
                        }
                    }
                    dVar5 = dVar6;
                }
            }
            return;
        }
        d dVar7 = this.f8747b;
        dVar7.f8704j0 = gVar.E0;
        int i23 = this.i;
        if (i > 0) {
            i23 += gVar.f8775Q0;
        }
        c cVar7 = this.f8750e;
        c cVar8 = dVar7.J;
        cVar8.a(cVar7, i23);
        c cVar9 = dVar7.f8673L;
        if (z4) {
            cVar9.a(this.f8752g, this.f8754k);
        }
        if (i > 0) {
            this.f8750e.f8659d.f8673L.a(cVar8, 0);
        }
        if (gVar.f8777S0 == 3 && !dVar7.f8667E) {
            for (int i24 = 0; i24 < i8; i24++) {
                int i25 = this.f8757n + (z3 ? (i8 - 1) - i24 : i24);
                if (i25 >= gVar.f8785b1) {
                    break;
                }
                dVar = gVar.f8784a1[i25];
                if (dVar.f8667E) {
                    break;
                }
            }
        }
        dVar = dVar7;
        int i26 = 0;
        d dVar8 = null;
        while (i26 < i8) {
            int i27 = z3 ? (i8 - 1) - i26 : i26;
            int i28 = this.f8757n + i27;
            if (i28 >= gVar.f8785b1) {
                return;
            }
            d dVar9 = gVar.f8784a1[i28];
            if (dVar9 == null) {
                z5 = z6;
                c4 = 3;
            } else {
                c cVar10 = dVar9.f8671I;
                if (i26 == 0) {
                    dVar9.f(cVar10, this.f8749d, this.h);
                }
                if (i27 == 0) {
                    int i29 = gVar.f8763D0;
                    if (z3) {
                        f2 = 1.0f;
                        f4 = 1.0f - gVar.f8768J0;
                    } else {
                        f2 = 1.0f;
                        f4 = gVar.f8768J0;
                    }
                    if (this.f8757n == 0) {
                        i6 = gVar.f8764F0;
                        z5 = z6;
                        if (i6 != -1) {
                            if (z3) {
                                f6 = gVar.f8770L0;
                                f4 = f2 - f6;
                                dVar9.f8702i0 = i6;
                                dVar9.f8694d0 = f4;
                            } else {
                                f5 = gVar.f8770L0;
                                f4 = f5;
                                dVar9.f8702i0 = i6;
                                dVar9.f8694d0 = f4;
                            }
                        }
                    } else {
                        z5 = z6;
                    }
                    if (!z4 || (i6 = gVar.f8766H0) == -1) {
                        i6 = i29;
                        dVar9.f8702i0 = i6;
                        dVar9.f8694d0 = f4;
                    } else if (z3) {
                        f6 = gVar.f8772N0;
                        f4 = f2 - f6;
                        dVar9.f8702i0 = i6;
                        dVar9.f8694d0 = f4;
                    } else {
                        f5 = gVar.f8772N0;
                        f4 = f5;
                        dVar9.f8702i0 = i6;
                        dVar9.f8694d0 = f4;
                    }
                } else {
                    z5 = z6;
                }
                if (i26 == i8 - 1) {
                    dVar9.f(dVar9.f8672K, this.f8751f, this.f8753j);
                }
                if (dVar8 != null) {
                    int i30 = gVar.f8774P0;
                    c cVar11 = dVar8.f8672K;
                    cVar10.a(cVar11, i30);
                    if (i26 == i10) {
                        int i31 = this.h;
                        if (cVar10.h()) {
                            cVar10.h = i31;
                        }
                    }
                    cVar11.a(cVar10, 0);
                    if (i26 == i11 + 1) {
                        int i32 = this.f8753j;
                        if (cVar11.h()) {
                            cVar11.h = i32;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    int i33 = gVar.f8777S0;
                    c4 = 3;
                    if (i33 == 3 && dVar.f8667E && dVar9 != dVar && dVar9.f8667E) {
                        dVar9.f8674M.a(dVar.f8674M, 0);
                    } else {
                        c cVar12 = dVar9.J;
                        if (i33 != 0) {
                            c cVar13 = dVar9.f8673L;
                            if (i33 == 1) {
                                cVar13.a(cVar9, 0);
                            } else if (z5) {
                                cVar12.a(this.f8750e, this.i);
                                cVar13.a(this.f8752g, this.f8754k);
                            } else {
                                cVar12.a(cVar8, 0);
                                cVar13.a(cVar9, 0);
                            }
                        } else {
                            cVar12.a(cVar8, 0);
                        }
                    }
                } else {
                    c4 = 3;
                }
                dVar8 = dVar9;
            }
            i26++;
            z6 = z5;
        }
    }

    public final int c() {
        return this.f8746a == 1 ? this.f8756m - this.f8760r.f8775Q0 : this.f8756m;
    }

    public final int d() {
        return this.f8746a == 0 ? this.f8755l - this.f8760r.f8774P0 : this.f8755l;
    }

    public final void e(int i) {
        g gVar;
        int i4;
        int i5 = this.p;
        if (i5 == 0) {
            return;
        }
        int i6 = this.f8758o;
        int i7 = i / i5;
        int i8 = 0;
        while (true) {
            gVar = this.f8760r;
            if (i8 >= i6 || (i4 = this.f8757n + i8) >= gVar.f8785b1) {
                break;
            }
            d dVar = gVar.f8784a1[i4];
            if (this.f8746a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f8715p0;
                    if (iArr[0] == 3 && dVar.f8717r == 0) {
                        gVar.V(1, i7, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f8715p0;
                if (iArr2[1] == 3 && dVar.f8718s == 0) {
                    int i9 = iArr2[0];
                    int i10 = i7;
                    gVar.V(i9, dVar.q(), 1, i10, dVar);
                    i7 = i10;
                }
            }
            i8++;
        }
        this.f8755l = 0;
        this.f8756m = 0;
        this.f8747b = null;
        this.f8748c = 0;
        int i11 = this.f8758o;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f8757n + i12;
            if (i13 >= gVar.f8785b1) {
                return;
            }
            d dVar2 = gVar.f8784a1[i13];
            if (this.f8746a == 0) {
                int q4 = dVar2.q();
                int i14 = gVar.f8774P0;
                if (dVar2.f8700g0 == 8) {
                    i14 = 0;
                }
                this.f8755l = q4 + i14 + this.f8755l;
                int T3 = gVar.T(dVar2, this.f8759q);
                if (this.f8747b == null || this.f8748c < T3) {
                    this.f8747b = dVar2;
                    this.f8748c = T3;
                    this.f8756m = T3;
                }
            } else {
                int U3 = gVar.U(dVar2, this.f8759q);
                int T4 = gVar.T(dVar2, this.f8759q);
                int i15 = gVar.f8775Q0;
                if (dVar2.f8700g0 == 8) {
                    i15 = 0;
                }
                this.f8756m = T4 + i15 + this.f8756m;
                if (this.f8747b == null || this.f8748c < U3) {
                    this.f8747b = dVar2;
                    this.f8748c = U3;
                    this.f8755l = U3;
                }
            }
        }
    }

    public final void f(int i, c cVar, c cVar2, c cVar3, c cVar4, int i4, int i5, int i6, int i7, int i8) {
        this.f8746a = i;
        this.f8749d = cVar;
        this.f8750e = cVar2;
        this.f8751f = cVar3;
        this.f8752g = cVar4;
        this.h = i4;
        this.i = i5;
        this.f8753j = i6;
        this.f8754k = i7;
        this.f8759q = i8;
    }
}
