package x;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f8833k = new int[2];

    public static void m(int[] iArr, int i, int i4, int i5, int i6, float f2, int i7) {
        int i8 = i4 - i;
        int i9 = i6 - i5;
        if (i7 != -1) {
            if (i7 == 0) {
                iArr[0] = (int) ((i9 * f2) + 0.5f);
                iArr[1] = i9;
                return;
            } else {
                if (i7 != 1) {
                    return;
                }
                iArr[0] = i8;
                iArr[1] = (int) ((i8 * f2) + 0.5f);
                return;
            }
        }
        int i10 = (int) ((i9 * f2) + 0.5f);
        int i11 = (int) ((i8 / f2) + 0.5f);
        if (i10 <= i8) {
            iArr[0] = i10;
            iArr[1] = i9;
        } else if (i11 <= i9) {
            iArr[0] = i8;
            iArr[1] = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r7 != 1) goto L125;
     */
    @Override // x.InterfaceC0655d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(x.InterfaceC0655d r24) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.j.a(x.d):void");
    }

    @Override // x.n
    public final void d() {
        w.d dVar;
        w.d dVar2;
        int i;
        w.d dVar3;
        w.d dVar4;
        int i4;
        w.d dVar5 = this.f8845b;
        boolean z3 = dVar5.f8687a;
        f fVar = this.f8848e;
        if (z3) {
            fVar.d(dVar5.q());
        }
        boolean z4 = fVar.f8828j;
        e eVar = this.i;
        e eVar2 = this.h;
        if (!z4) {
            w.d dVar6 = this.f8845b;
            int i5 = dVar6.f8715p0[0];
            this.f8847d = i5;
            if (i5 != 3) {
                if (i5 == 4 && (dVar4 = dVar6.f8681T) != null && ((i4 = dVar4.f8715p0[0]) == 1 || i4 == 4)) {
                    int q4 = (dVar4.q() - this.f8845b.f8671I.e()) - this.f8845b.f8672K.e();
                    n.b(eVar2, dVar4.f8693d.h, this.f8845b.f8671I.e());
                    n.b(eVar, dVar4.f8693d.i, -this.f8845b.f8672K.e());
                    fVar.d(q4);
                    return;
                }
                if (i5 == 1) {
                    fVar.d(dVar6.q());
                }
            }
        } else if (this.f8847d == 4 && (dVar2 = (dVar = this.f8845b).f8681T) != null && ((i = dVar2.f8715p0[0]) == 1 || i == 4)) {
            n.b(eVar2, dVar2.f8693d.h, dVar.f8671I.e());
            n.b(eVar, dVar2.f8693d.i, -this.f8845b.f8672K.e());
            return;
        }
        if (fVar.f8828j) {
            w.d dVar7 = this.f8845b;
            if (dVar7.f8687a) {
                w.c[] cVarArr = dVar7.f8678Q;
                w.c cVar = cVarArr[0];
                w.c cVar2 = cVar.f8661f;
                if (cVar2 != null && cVarArr[1].f8661f != null) {
                    if (dVar7.x()) {
                        eVar2.f8826f = this.f8845b.f8678Q[0].e();
                        eVar.f8826f = -this.f8845b.f8678Q[1].e();
                        return;
                    }
                    e h = n.h(this.f8845b.f8678Q[0]);
                    if (h != null) {
                        n.b(eVar2, h, this.f8845b.f8678Q[0].e());
                    }
                    e h4 = n.h(this.f8845b.f8678Q[1]);
                    if (h4 != null) {
                        n.b(eVar, h4, -this.f8845b.f8678Q[1].e());
                    }
                    eVar2.f8822b = true;
                    eVar.f8822b = true;
                    return;
                }
                if (cVar2 != null) {
                    e h5 = n.h(cVar);
                    if (h5 != null) {
                        n.b(eVar2, h5, this.f8845b.f8678Q[0].e());
                        n.b(eVar, eVar2, fVar.f8827g);
                        return;
                    }
                    return;
                }
                w.c cVar3 = cVarArr[1];
                if (cVar3.f8661f != null) {
                    e h6 = n.h(cVar3);
                    if (h6 != null) {
                        n.b(eVar, h6, -this.f8845b.f8678Q[1].e());
                        n.b(eVar2, eVar, -fVar.f8827g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof w.i) || dVar7.f8681T == null || dVar7.i(7).f8661f != null) {
                    return;
                }
                w.d dVar8 = this.f8845b;
                n.b(eVar2, dVar8.f8681T.f8693d.h, dVar8.r());
                n.b(eVar, eVar2, fVar.f8827g);
                return;
            }
        }
        if (this.f8847d == 3) {
            w.d dVar9 = this.f8845b;
            int i6 = dVar9.f8717r;
            if (i6 == 2) {
                w.d dVar10 = dVar9.f8681T;
                if (dVar10 != null) {
                    f fVar2 = dVar10.f8695e.f8848e;
                    fVar.f8830l.add(fVar2);
                    fVar2.f8829k.add(fVar);
                    fVar.f8822b = true;
                    fVar.f8829k.add(eVar2);
                    fVar.f8829k.add(eVar);
                }
            } else if (i6 == 3) {
                if (dVar9.f8718s == 3) {
                    eVar2.f8821a = this;
                    eVar.f8821a = this;
                    l lVar = dVar9.f8695e;
                    lVar.h.f8821a = this;
                    lVar.i.f8821a = this;
                    fVar.f8821a = this;
                    if (dVar9.y()) {
                        fVar.f8830l.add(this.f8845b.f8695e.f8848e);
                        this.f8845b.f8695e.f8848e.f8829k.add(fVar);
                        l lVar2 = this.f8845b.f8695e;
                        lVar2.f8848e.f8821a = this;
                        fVar.f8830l.add(lVar2.h);
                        fVar.f8830l.add(this.f8845b.f8695e.i);
                        this.f8845b.f8695e.h.f8829k.add(fVar);
                        this.f8845b.f8695e.i.f8829k.add(fVar);
                    } else if (this.f8845b.x()) {
                        this.f8845b.f8695e.f8848e.f8830l.add(fVar);
                        fVar.f8829k.add(this.f8845b.f8695e.f8848e);
                    } else {
                        this.f8845b.f8695e.f8848e.f8830l.add(fVar);
                    }
                } else {
                    f fVar3 = dVar9.f8695e.f8848e;
                    fVar.f8830l.add(fVar3);
                    fVar3.f8829k.add(fVar);
                    this.f8845b.f8695e.h.f8829k.add(fVar);
                    this.f8845b.f8695e.i.f8829k.add(fVar);
                    fVar.f8822b = true;
                    fVar.f8829k.add(eVar2);
                    fVar.f8829k.add(eVar);
                    eVar2.f8830l.add(fVar);
                    eVar.f8830l.add(fVar);
                }
            }
        }
        w.d dVar11 = this.f8845b;
        w.c[] cVarArr2 = dVar11.f8678Q;
        w.c cVar4 = cVarArr2[0];
        w.c cVar5 = cVar4.f8661f;
        if (cVar5 != null && cVarArr2[1].f8661f != null) {
            if (dVar11.x()) {
                eVar2.f8826f = this.f8845b.f8678Q[0].e();
                eVar.f8826f = -this.f8845b.f8678Q[1].e();
                return;
            }
            e h7 = n.h(this.f8845b.f8678Q[0]);
            e h8 = n.h(this.f8845b.f8678Q[1]);
            if (h7 != null) {
                h7.b(this);
            }
            if (h8 != null) {
                h8.b(this);
            }
            this.f8851j = 4;
            return;
        }
        if (cVar5 != null) {
            e h9 = n.h(cVar4);
            if (h9 != null) {
                n.b(eVar2, h9, this.f8845b.f8678Q[0].e());
                c(eVar, eVar2, 1, fVar);
                return;
            }
            return;
        }
        w.c cVar6 = cVarArr2[1];
        if (cVar6.f8661f != null) {
            e h10 = n.h(cVar6);
            if (h10 != null) {
                n.b(eVar, h10, -this.f8845b.f8678Q[1].e());
                c(eVar2, eVar, -1, fVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof w.i) || (dVar3 = dVar11.f8681T) == null) {
            return;
        }
        n.b(eVar2, dVar3.f8693d.h, dVar11.r());
        c(eVar, eVar2, 1, fVar);
    }

    @Override // x.n
    public final void e() {
        e eVar = this.h;
        if (eVar.f8828j) {
            this.f8845b.f8686Y = eVar.f8827g;
        }
    }

    @Override // x.n
    public final void f() {
        this.f8846c = null;
        this.h.c();
        this.i.c();
        this.f8848e.c();
        this.f8850g = false;
    }

    @Override // x.n
    public final boolean k() {
        return this.f8847d != 3 || this.f8845b.f8717r == 0;
    }

    public final void n() {
        this.f8850g = false;
        e eVar = this.h;
        eVar.c();
        eVar.f8828j = false;
        e eVar2 = this.i;
        eVar2.c();
        eVar2.f8828j = false;
        this.f8848e.f8828j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f8845b.f8701h0;
    }
}
