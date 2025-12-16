package x;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import u.AbstractC0629f;

/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: k, reason: collision with root package name */
    public e f8836k;

    /* renamed from: l, reason: collision with root package name */
    public C0652a f8837l;

    @Override // x.InterfaceC0655d
    public final void a(InterfaceC0655d interfaceC0655d) {
        float f2;
        float f4;
        float f5;
        int i;
        if (AbstractC0629f.b(this.f8851j) == 3) {
            w.d dVar = this.f8845b;
            l(dVar.J, dVar.f8673L, 1);
            return;
        }
        f fVar = this.f8848e;
        if (fVar.f8823c && !fVar.f8828j && this.f8847d == 3) {
            w.d dVar2 = this.f8845b;
            int i4 = dVar2.f8718s;
            if (i4 == 2) {
                w.d dVar3 = dVar2.f8681T;
                if (dVar3 != null) {
                    if (dVar3.f8695e.f8848e.f8828j) {
                        fVar.d((int) ((r5.f8827g * dVar2.f8725z) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                f fVar2 = dVar2.f8693d.f8848e;
                if (fVar2.f8828j) {
                    int i5 = dVar2.f8685X;
                    if (i5 == -1) {
                        f2 = fVar2.f8827g;
                        f4 = dVar2.f8684W;
                    } else if (i5 == 0) {
                        f5 = fVar2.f8827g * dVar2.f8684W;
                        i = (int) (f5 + 0.5f);
                        fVar.d(i);
                    } else if (i5 != 1) {
                        i = 0;
                        fVar.d(i);
                    } else {
                        f2 = fVar2.f8827g;
                        f4 = dVar2.f8684W;
                    }
                    f5 = f2 / f4;
                    i = (int) (f5 + 0.5f);
                    fVar.d(i);
                }
            }
        }
        e eVar = this.h;
        if (eVar.f8823c) {
            e eVar2 = this.i;
            if (eVar2.f8823c) {
                if (eVar.f8828j && eVar2.f8828j && fVar.f8828j) {
                    return;
                }
                if (!fVar.f8828j && this.f8847d == 3) {
                    w.d dVar4 = this.f8845b;
                    if (dVar4.f8717r == 0 && !dVar4.y()) {
                        e eVar3 = (e) eVar.f8830l.get(0);
                        e eVar4 = (e) eVar2.f8830l.get(0);
                        int i6 = eVar3.f8827g + eVar.f8826f;
                        int i7 = eVar4.f8827g + eVar2.f8826f;
                        eVar.d(i6);
                        eVar2.d(i7);
                        fVar.d(i7 - i6);
                        return;
                    }
                }
                if (!fVar.f8828j && this.f8847d == 3 && this.f8844a == 1 && eVar.f8830l.size() > 0 && eVar2.f8830l.size() > 0) {
                    e eVar5 = (e) eVar.f8830l.get(0);
                    int i8 = (((e) eVar2.f8830l.get(0)).f8827g + eVar2.f8826f) - (eVar5.f8827g + eVar.f8826f);
                    int i9 = fVar.f8831m;
                    if (i8 < i9) {
                        fVar.d(i8);
                    } else {
                        fVar.d(i9);
                    }
                }
                if (fVar.f8828j && eVar.f8830l.size() > 0 && eVar2.f8830l.size() > 0) {
                    e eVar6 = (e) eVar.f8830l.get(0);
                    e eVar7 = (e) eVar2.f8830l.get(0);
                    int i10 = eVar6.f8827g;
                    int i11 = eVar.f8826f + i10;
                    int i12 = eVar7.f8827g;
                    int i13 = eVar2.f8826f + i12;
                    float f6 = this.f8845b.f8696e0;
                    if (eVar6 == eVar7) {
                        f6 = 0.5f;
                    } else {
                        i10 = i11;
                        i12 = i13;
                    }
                    eVar.d((int) ((((i12 - i10) - fVar.f8827g) * f6) + i10 + 0.5f));
                    eVar2.d(eVar.f8827g + fVar.f8827g);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v114, types: [x.f, x.a] */
    @Override // x.n
    public final void d() {
        w.d dVar;
        w.d dVar2;
        w.d dVar3;
        w.d dVar4;
        w.d dVar5 = this.f8845b;
        boolean z3 = dVar5.f8687a;
        f fVar = this.f8848e;
        if (z3) {
            fVar.d(dVar5.k());
        }
        boolean z4 = fVar.f8828j;
        e eVar = this.i;
        e eVar2 = this.h;
        if (!z4) {
            w.d dVar6 = this.f8845b;
            this.f8847d = dVar6.f8715p0[1];
            if (dVar6.f8667E) {
                this.f8837l = new f(this);
            }
            int i = this.f8847d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f8845b.f8681T) != null && dVar4.f8715p0[1] == 1) {
                    int k4 = (dVar4.k() - this.f8845b.J.e()) - this.f8845b.f8673L.e();
                    n.b(eVar2, dVar4.f8695e.h, this.f8845b.J.e());
                    n.b(eVar, dVar4.f8695e.i, -this.f8845b.f8673L.e());
                    fVar.d(k4);
                    return;
                }
                if (i == 1) {
                    fVar.d(this.f8845b.k());
                }
            }
        } else if (this.f8847d == 4 && (dVar2 = (dVar = this.f8845b).f8681T) != null && dVar2.f8715p0[1] == 1) {
            n.b(eVar2, dVar2.f8695e.h, dVar.J.e());
            n.b(eVar, dVar2.f8695e.i, -this.f8845b.f8673L.e());
            return;
        }
        boolean z5 = fVar.f8828j;
        e eVar3 = this.f8836k;
        if (z5) {
            w.d dVar7 = this.f8845b;
            if (dVar7.f8687a) {
                w.c[] cVarArr = dVar7.f8678Q;
                w.c cVar = cVarArr[2];
                w.c cVar2 = cVar.f8661f;
                if (cVar2 != null && cVarArr[3].f8661f != null) {
                    if (dVar7.y()) {
                        eVar2.f8826f = this.f8845b.f8678Q[2].e();
                        eVar.f8826f = -this.f8845b.f8678Q[3].e();
                    } else {
                        e h = n.h(this.f8845b.f8678Q[2]);
                        if (h != null) {
                            n.b(eVar2, h, this.f8845b.f8678Q[2].e());
                        }
                        e h4 = n.h(this.f8845b.f8678Q[3]);
                        if (h4 != null) {
                            n.b(eVar, h4, -this.f8845b.f8678Q[3].e());
                        }
                        eVar2.f8822b = true;
                        eVar.f8822b = true;
                    }
                    w.d dVar8 = this.f8845b;
                    if (dVar8.f8667E) {
                        n.b(eVar3, eVar2, dVar8.f8688a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    e h5 = n.h(cVar);
                    if (h5 != null) {
                        n.b(eVar2, h5, this.f8845b.f8678Q[2].e());
                        n.b(eVar, eVar2, fVar.f8827g);
                        w.d dVar9 = this.f8845b;
                        if (dVar9.f8667E) {
                            n.b(eVar3, eVar2, dVar9.f8688a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                w.c cVar3 = cVarArr[3];
                if (cVar3.f8661f != null) {
                    e h6 = n.h(cVar3);
                    if (h6 != null) {
                        n.b(eVar, h6, -this.f8845b.f8678Q[3].e());
                        n.b(eVar2, eVar, -fVar.f8827g);
                    }
                    w.d dVar10 = this.f8845b;
                    if (dVar10.f8667E) {
                        n.b(eVar3, eVar2, dVar10.f8688a0);
                        return;
                    }
                    return;
                }
                w.c cVar4 = cVarArr[4];
                if (cVar4.f8661f != null) {
                    e h7 = n.h(cVar4);
                    if (h7 != null) {
                        n.b(eVar3, h7, 0);
                        n.b(eVar2, eVar3, -this.f8845b.f8688a0);
                        n.b(eVar, eVar2, fVar.f8827g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof w.i) || dVar7.f8681T == null || dVar7.i(7).f8661f != null) {
                    return;
                }
                w.d dVar11 = this.f8845b;
                n.b(eVar2, dVar11.f8681T.f8695e.h, dVar11.s());
                n.b(eVar, eVar2, fVar.f8827g);
                w.d dVar12 = this.f8845b;
                if (dVar12.f8667E) {
                    n.b(eVar3, eVar2, dVar12.f8688a0);
                    return;
                }
                return;
            }
        }
        if (z5 || this.f8847d != 3) {
            fVar.b(this);
        } else {
            w.d dVar13 = this.f8845b;
            int i4 = dVar13.f8718s;
            if (i4 == 2) {
                w.d dVar14 = dVar13.f8681T;
                if (dVar14 != null) {
                    f fVar2 = dVar14.f8695e.f8848e;
                    fVar.f8830l.add(fVar2);
                    fVar2.f8829k.add(fVar);
                    fVar.f8822b = true;
                    fVar.f8829k.add(eVar2);
                    fVar.f8829k.add(eVar);
                }
            } else if (i4 == 3 && !dVar13.y()) {
                w.d dVar15 = this.f8845b;
                if (dVar15.f8717r != 3) {
                    f fVar3 = dVar15.f8693d.f8848e;
                    fVar.f8830l.add(fVar3);
                    fVar3.f8829k.add(fVar);
                    fVar.f8822b = true;
                    fVar.f8829k.add(eVar2);
                    fVar.f8829k.add(eVar);
                }
            }
        }
        w.d dVar16 = this.f8845b;
        w.c[] cVarArr2 = dVar16.f8678Q;
        w.c cVar5 = cVarArr2[2];
        w.c cVar6 = cVar5.f8661f;
        if (cVar6 != null && cVarArr2[3].f8661f != null) {
            if (dVar16.y()) {
                eVar2.f8826f = this.f8845b.f8678Q[2].e();
                eVar.f8826f = -this.f8845b.f8678Q[3].e();
            } else {
                e h8 = n.h(this.f8845b.f8678Q[2]);
                e h9 = n.h(this.f8845b.f8678Q[3]);
                if (h8 != null) {
                    h8.b(this);
                }
                if (h9 != null) {
                    h9.b(this);
                }
                this.f8851j = 4;
            }
            if (this.f8845b.f8667E) {
                c(eVar3, eVar2, 1, this.f8837l);
            }
        } else if (cVar6 != null) {
            e h10 = n.h(cVar5);
            if (h10 != null) {
                n.b(eVar2, h10, this.f8845b.f8678Q[2].e());
                c(eVar, eVar2, 1, fVar);
                if (this.f8845b.f8667E) {
                    c(eVar3, eVar2, 1, this.f8837l);
                }
                if (this.f8847d == 3) {
                    w.d dVar17 = this.f8845b;
                    if (dVar17.f8684W > BitmapDescriptorFactory.HUE_RED) {
                        j jVar = dVar17.f8693d;
                        if (jVar.f8847d == 3) {
                            jVar.f8848e.f8829k.add(fVar);
                            fVar.f8830l.add(this.f8845b.f8693d.f8848e);
                            fVar.f8821a = this;
                        }
                    }
                }
            }
        } else {
            w.c cVar7 = cVarArr2[3];
            if (cVar7.f8661f != null) {
                e h11 = n.h(cVar7);
                if (h11 != null) {
                    n.b(eVar, h11, -this.f8845b.f8678Q[3].e());
                    c(eVar2, eVar, -1, fVar);
                    if (this.f8845b.f8667E) {
                        c(eVar3, eVar2, 1, this.f8837l);
                    }
                }
            } else {
                w.c cVar8 = cVarArr2[4];
                if (cVar8.f8661f != null) {
                    e h12 = n.h(cVar8);
                    if (h12 != null) {
                        n.b(eVar3, h12, 0);
                        c(eVar2, eVar3, -1, this.f8837l);
                        c(eVar, eVar2, 1, fVar);
                    }
                } else if (!(dVar16 instanceof w.i) && (dVar3 = dVar16.f8681T) != null) {
                    n.b(eVar2, dVar3.f8695e.h, dVar16.s());
                    c(eVar, eVar2, 1, fVar);
                    if (this.f8845b.f8667E) {
                        c(eVar3, eVar2, 1, this.f8837l);
                    }
                    if (this.f8847d == 3) {
                        w.d dVar18 = this.f8845b;
                        if (dVar18.f8684W > BitmapDescriptorFactory.HUE_RED) {
                            j jVar2 = dVar18.f8693d;
                            if (jVar2.f8847d == 3) {
                                jVar2.f8848e.f8829k.add(fVar);
                                fVar.f8830l.add(this.f8845b.f8693d.f8848e);
                                fVar.f8821a = this;
                            }
                        }
                    }
                }
            }
        }
        if (fVar.f8830l.size() == 0) {
            fVar.f8823c = true;
        }
    }

    @Override // x.n
    public final void e() {
        e eVar = this.h;
        if (eVar.f8828j) {
            this.f8845b.Z = eVar.f8827g;
        }
    }

    @Override // x.n
    public final void f() {
        this.f8846c = null;
        this.h.c();
        this.i.c();
        this.f8836k.c();
        this.f8848e.c();
        this.f8850g = false;
    }

    @Override // x.n
    public final boolean k() {
        return this.f8847d != 3 || this.f8845b.f8718s == 0;
    }

    public final void m() {
        this.f8850g = false;
        e eVar = this.h;
        eVar.c();
        eVar.f8828j = false;
        e eVar2 = this.i;
        eVar2.c();
        eVar2.f8828j = false;
        e eVar3 = this.f8836k;
        eVar3.c();
        eVar3.f8828j = false;
        this.f8848e.f8828j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f8845b.f8701h0;
    }
}
