package w;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import r3.m;
import u.C0626c;
import x.C0653b;
import x.C0654c;
import x.n;

/* loaded from: classes.dex */
public final class e extends d {
    public int A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0644b[] f8726B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0644b[] f8727C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f8728D0;
    public boolean E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f8729F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f8730G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f8731H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f8732I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f8733J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f8734K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C0653b f8735L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f8736q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final R0.h f8737r0;

    /* renamed from: s0, reason: collision with root package name */
    public final m f8738s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f8739t0;

    /* renamed from: u0, reason: collision with root package name */
    public androidx.constraintlayout.widget.f f8740u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f8741v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C0626c f8742w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f8743x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f8744y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f8745z0;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, R0.h] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, x.b] */
    public e() {
        ?? obj = new Object();
        obj.f1413a = new ArrayList();
        obj.f1414b = new Object();
        obj.f1415c = this;
        this.f8737r0 = obj;
        m mVar = new m();
        mVar.f8293b = true;
        mVar.f8294c = true;
        mVar.f8297f = new ArrayList();
        new ArrayList();
        mVar.f8298g = null;
        mVar.h = new Object();
        mVar.i = new ArrayList();
        mVar.f8295d = this;
        mVar.f8296e = this;
        this.f8738s0 = mVar;
        this.f8740u0 = null;
        this.f8741v0 = false;
        this.f8742w0 = new C0626c();
        this.f8745z0 = 0;
        this.A0 = 0;
        this.f8726B0 = new C0644b[4];
        this.f8727C0 = new C0644b[4];
        this.f8728D0 = 257;
        this.E0 = false;
        this.f8729F0 = false;
        this.f8730G0 = null;
        this.f8731H0 = null;
        this.f8732I0 = null;
        this.f8733J0 = null;
        this.f8734K0 = new HashSet();
        this.f8735L0 = new Object();
    }

    public static void V(d dVar, androidx.constraintlayout.widget.f fVar, C0653b c0653b) {
        int i;
        int i4;
        if (fVar == null) {
            return;
        }
        if (dVar.f8700g0 == 8 || (dVar instanceof h) || (dVar instanceof C0643a)) {
            c0653b.f8815e = 0;
            c0653b.f8816f = 0;
            return;
        }
        int[] iArr = dVar.f8715p0;
        c0653b.f8811a = iArr[0];
        c0653b.f8812b = iArr[1];
        c0653b.f8813c = dVar.q();
        c0653b.f8814d = dVar.k();
        c0653b.i = false;
        c0653b.f8818j = 0;
        boolean z3 = c0653b.f8811a == 3;
        boolean z4 = c0653b.f8812b == 3;
        boolean z5 = z3 && dVar.f8684W > BitmapDescriptorFactory.HUE_RED;
        boolean z6 = z4 && dVar.f8684W > BitmapDescriptorFactory.HUE_RED;
        if (z3 && dVar.t(0) && dVar.f8717r == 0 && !z5) {
            c0653b.f8811a = 2;
            if (z4 && dVar.f8718s == 0) {
                c0653b.f8811a = 1;
            }
            z3 = false;
        }
        if (z4 && dVar.t(1) && dVar.f8718s == 0 && !z6) {
            c0653b.f8812b = 2;
            if (z3 && dVar.f8717r == 0) {
                c0653b.f8812b = 1;
            }
            z4 = false;
        }
        if (dVar.A()) {
            c0653b.f8811a = 1;
            z3 = false;
        }
        if (dVar.B()) {
            c0653b.f8812b = 1;
            z4 = false;
        }
        int[] iArr2 = dVar.f8719t;
        if (z5) {
            if (iArr2[0] == 4) {
                c0653b.f8811a = 1;
            } else if (!z4) {
                if (c0653b.f8812b == 1) {
                    i4 = c0653b.f8814d;
                } else {
                    c0653b.f8811a = 2;
                    fVar.b(dVar, c0653b);
                    i4 = c0653b.f8816f;
                }
                c0653b.f8811a = 1;
                c0653b.f8813c = (int) (dVar.f8684W * i4);
            }
        }
        if (z6) {
            if (iArr2[1] == 4) {
                c0653b.f8812b = 1;
            } else if (!z3) {
                if (c0653b.f8811a == 1) {
                    i = c0653b.f8813c;
                } else {
                    c0653b.f8812b = 2;
                    fVar.b(dVar, c0653b);
                    i = c0653b.f8815e;
                }
                c0653b.f8812b = 1;
                if (dVar.f8685X == -1) {
                    c0653b.f8814d = (int) (i / dVar.f8684W);
                } else {
                    c0653b.f8814d = (int) (dVar.f8684W * i);
                }
            }
        }
        fVar.b(dVar, c0653b);
        dVar.O(c0653b.f8815e);
        dVar.L(c0653b.f8816f);
        dVar.f8667E = c0653b.h;
        dVar.I(c0653b.f8817g);
        c0653b.f8818j = 0;
    }

    @Override // w.d
    public final void C() {
        this.f8742w0.t();
        this.f8743x0 = 0;
        this.f8744y0 = 0;
        this.f8736q0.clear();
        super.C();
    }

    @Override // w.d
    public final void F(R0.h hVar) {
        super.F(hVar);
        int size = this.f8736q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f8736q0.get(i)).F(hVar);
        }
    }

    @Override // w.d
    public final void P(boolean z3, boolean z4) {
        super.P(z3, z4);
        int size = this.f8736q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f8736q0.get(i)).P(z3, z4);
        }
    }

    public final void R(d dVar, int i) {
        if (i == 0) {
            int i4 = this.f8745z0 + 1;
            C0644b[] c0644bArr = this.f8727C0;
            if (i4 >= c0644bArr.length) {
                this.f8727C0 = (C0644b[]) Arrays.copyOf(c0644bArr, c0644bArr.length * 2);
            }
            C0644b[] c0644bArr2 = this.f8727C0;
            int i5 = this.f8745z0;
            c0644bArr2[i5] = new C0644b(dVar, 0, this.f8741v0);
            this.f8745z0 = i5 + 1;
            return;
        }
        if (i == 1) {
            int i6 = this.A0 + 1;
            C0644b[] c0644bArr3 = this.f8726B0;
            if (i6 >= c0644bArr3.length) {
                this.f8726B0 = (C0644b[]) Arrays.copyOf(c0644bArr3, c0644bArr3.length * 2);
            }
            C0644b[] c0644bArr4 = this.f8726B0;
            int i7 = this.A0;
            c0644bArr4[i7] = new C0644b(dVar, 1, this.f8741v0);
            this.A0 = i7 + 1;
        }
    }

    public final void S(C0626c c0626c) {
        e eVar;
        C0626c c0626c2;
        boolean W3 = W(64);
        b(c0626c, W3);
        int size = this.f8736q0.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f8736q0.get(i);
            boolean[] zArr = dVar.f8680S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C0643a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i4 = 0; i4 < size; i4++) {
                d dVar2 = (d) this.f8736q0.get(i4);
                if (dVar2 instanceof C0643a) {
                    C0643a c0643a = (C0643a) dVar2;
                    for (int i5 = 0; i5 < c0643a.f8801r0; i5++) {
                        d dVar3 = c0643a.f8800q0[i5];
                        if (c0643a.f8639t0 || dVar3.c()) {
                            int i6 = c0643a.f8638s0;
                            if (i6 == 0 || i6 == 1) {
                                dVar3.f8680S[0] = true;
                            } else if (i6 == 2 || i6 == 3) {
                                dVar3.f8680S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f8734K0;
        hashSet.clear();
        for (int i7 = 0; i7 < size; i7++) {
            d dVar4 = (d) this.f8736q0.get(i7);
            dVar4.getClass();
            boolean z4 = dVar4 instanceof g;
            if (z4 || (dVar4 instanceof h)) {
                if (z4) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(c0626c, W3);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i8 = 0; i8 < gVar.f8801r0; i8++) {
                    if (hashSet.contains(gVar.f8800q0[i8])) {
                        gVar.b(c0626c, W3);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(c0626c, W3);
                }
                hashSet.clear();
            }
        }
        if (C0626c.p) {
            HashSet hashSet2 = new HashSet();
            for (int i9 = 0; i9 < size; i9++) {
                d dVar5 = (d) this.f8736q0.get(i9);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            c0626c2 = c0626c;
            eVar.a(this, c0626c2, hashSet2, this.f8715p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(eVar, c0626c2, dVar6);
                dVar6.b(c0626c2, W3);
            }
        } else {
            eVar = this;
            c0626c2 = c0626c;
            for (int i10 = 0; i10 < size; i10++) {
                d dVar7 = (d) eVar.f8736q0.get(i10);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f8715p0;
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    if (i11 == 2) {
                        dVar7.M(1);
                    }
                    if (i12 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(c0626c2, W3);
                    if (i11 == 2) {
                        dVar7.M(i11);
                    }
                    if (i12 == 2) {
                        dVar7.N(i12);
                    }
                } else {
                    j.b(eVar, c0626c2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(c0626c2, W3);
                    }
                }
            }
        }
        if (eVar.f8745z0 > 0) {
            j.a(eVar, c0626c2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(eVar, c0626c2, null, 1);
        }
    }

    public final boolean T(int i, boolean z3) {
        boolean z4;
        m mVar = this.f8738s0;
        e eVar = (e) mVar.f8295d;
        boolean z5 = false;
        int j4 = eVar.j(0);
        int j5 = eVar.j(1);
        int r4 = eVar.r();
        int s4 = eVar.s();
        ArrayList arrayList = (ArrayList) mVar.f8297f;
        if (z3 && (j4 == 2 || j5 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n nVar = (n) it.next();
                if (nVar.f8849f == i && !nVar.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && j4 == 2) {
                    eVar.M(1);
                    eVar.O(mVar.d(eVar, 0));
                    eVar.f8693d.f8848e.d(eVar.q());
                }
            } else if (z3 && j5 == 2) {
                eVar.N(1);
                eVar.L(mVar.d(eVar, 1));
                eVar.f8695e.f8848e.d(eVar.k());
            }
        }
        int[] iArr = eVar.f8715p0;
        if (i == 0) {
            int i4 = iArr[0];
            if (i4 == 1 || i4 == 4) {
                int q4 = eVar.q() + r4;
                eVar.f8693d.i.d(q4);
                eVar.f8693d.f8848e.d(q4 - r4);
                z4 = true;
            }
            z4 = false;
        } else {
            int i5 = iArr[1];
            if (i5 == 1 || i5 == 4) {
                int k4 = eVar.k() + s4;
                eVar.f8695e.i.d(k4);
                eVar.f8695e.f8848e.d(k4 - s4);
                z4 = true;
            }
            z4 = false;
        }
        mVar.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            n nVar2 = (n) it2.next();
            if (nVar2.f8849f == i && (nVar2.f8845b != eVar || nVar2.f8850g)) {
                nVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z5 = true;
                break;
            }
            n nVar3 = (n) it3.next();
            if (nVar3.f8849f == i && (z4 || nVar3.f8845b != eVar)) {
                if (!nVar3.h.f8828j) {
                    break;
                }
                if (!nVar3.i.f8828j) {
                    break;
                }
                if (!(nVar3 instanceof C0654c) && !nVar3.f8848e.f8828j) {
                    break;
                }
            }
        }
        eVar.M(j4);
        eVar.N(j5);
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x084f A[LOOP:14: B:281:0x084d->B:282:0x084f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x064d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0668  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r6v140, types: [java.lang.Object, x.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.U():void");
    }

    public final boolean W(int i) {
        return (this.f8728D0 & i) == i;
    }

    @Override // w.d
    public final void n(StringBuilder sb) {
        sb.append(this.f8703j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f8682U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f8683V);
        sb.append("\n");
        Iterator it = this.f8736q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
