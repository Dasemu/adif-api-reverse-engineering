package x;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654c extends n {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f8819k;

    /* renamed from: l, reason: collision with root package name */
    public int f8820l;

    public C0654c(w.d dVar, int i) {
        super(dVar);
        w.d dVar2;
        this.f8819k = new ArrayList();
        this.f8849f = i;
        w.d dVar3 = this.f8845b;
        w.d m4 = dVar3.m(i);
        while (true) {
            w.d dVar4 = m4;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            } else {
                m4 = dVar3.m(this.f8849f);
            }
        }
        this.f8845b = dVar2;
        int i4 = this.f8849f;
        n nVar = i4 == 0 ? dVar2.f8693d : i4 == 1 ? dVar2.f8695e : null;
        ArrayList arrayList = this.f8819k;
        arrayList.add(nVar);
        w.d l4 = dVar2.l(this.f8849f);
        while (l4 != null) {
            int i5 = this.f8849f;
            arrayList.add(i5 == 0 ? l4.f8693d : i5 == 1 ? l4.f8695e : null);
            l4 = l4.l(this.f8849f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n nVar2 = (n) it.next();
            int i6 = this.f8849f;
            if (i6 == 0) {
                nVar2.f8845b.f8689b = this;
            } else if (i6 == 1) {
                nVar2.f8845b.f8691c = this;
            }
        }
        if (this.f8849f == 0 && ((w.e) this.f8845b.f8681T).f8741v0 && arrayList.size() > 1) {
            this.f8845b = ((n) arrayList.get(arrayList.size() - 1)).f8845b;
        }
        this.f8820l = this.f8849f == 0 ? this.f8845b.f8702i0 : this.f8845b.f8704j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0395, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // x.InterfaceC0655d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(x.InterfaceC0655d r28) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C0654c.a(x.d):void");
    }

    @Override // x.n
    public final void d() {
        ArrayList arrayList = this.f8819k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        w.d dVar = ((n) arrayList.get(0)).f8845b;
        w.d dVar2 = ((n) arrayList.get(size - 1)).f8845b;
        int i = this.f8849f;
        e eVar = this.i;
        e eVar2 = this.h;
        if (i == 0) {
            w.c cVar = dVar.f8671I;
            w.c cVar2 = dVar2.f8672K;
            e i4 = n.i(cVar, 0);
            int e4 = cVar.e();
            w.d m4 = m();
            if (m4 != null) {
                e4 = m4.f8671I.e();
            }
            if (i4 != null) {
                n.b(eVar2, i4, e4);
            }
            e i5 = n.i(cVar2, 0);
            int e5 = cVar2.e();
            w.d n4 = n();
            if (n4 != null) {
                e5 = n4.f8672K.e();
            }
            if (i5 != null) {
                n.b(eVar, i5, -e5);
            }
        } else {
            w.c cVar3 = dVar.J;
            w.c cVar4 = dVar2.f8673L;
            e i6 = n.i(cVar3, 1);
            int e6 = cVar3.e();
            w.d m5 = m();
            if (m5 != null) {
                e6 = m5.J.e();
            }
            if (i6 != null) {
                n.b(eVar2, i6, e6);
            }
            e i7 = n.i(cVar4, 1);
            int e7 = cVar4.e();
            w.d n5 = n();
            if (n5 != null) {
                e7 = n5.f8673L.e();
            }
            if (i7 != null) {
                n.b(eVar, i7, -e7);
            }
        }
        eVar2.f8821a = this;
        eVar.f8821a = this;
    }

    @Override // x.n
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8819k;
            if (i >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // x.n
    public final void f() {
        this.f8846c = null;
        Iterator it = this.f8819k.iterator();
        while (it.hasNext()) {
            ((n) it.next()).f();
        }
    }

    @Override // x.n
    public final long j() {
        ArrayList arrayList = this.f8819k;
        int size = arrayList.size();
        long j4 = 0;
        for (int i = 0; i < size; i++) {
            j4 = r4.i.f8826f + ((n) arrayList.get(i)).j() + j4 + r4.h.f8826f;
        }
        return j4;
    }

    @Override // x.n
    public final boolean k() {
        ArrayList arrayList = this.f8819k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((n) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final w.d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8819k;
            if (i >= arrayList.size()) {
                return null;
            }
            w.d dVar = ((n) arrayList.get(i)).f8845b;
            if (dVar.f8700g0 != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final w.d n() {
        ArrayList arrayList = this.f8819k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w.d dVar = ((n) arrayList.get(size)).f8845b;
            if (dVar.f8700g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f8849f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f8819k.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            sb.append("<");
            sb.append(nVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
