package r3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import x.C0652a;
import x.C0653b;
import x.C0654c;
import x.InterfaceC0655d;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8292a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8293b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8294c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8295d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8296e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f8297f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8298g;
    public Object h;
    public Object i;

    public /* synthetic */ m() {
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [x.k, java.lang.Object] */
    public void a(x.e eVar, int i, ArrayList arrayList, x.k kVar) {
        x.n nVar = eVar.f8824d;
        if (nVar.f8846c == null) {
            w.e eVar2 = (w.e) this.f8295d;
            if (nVar != eVar2.f8693d) {
                x.k kVar2 = kVar;
                if (nVar == eVar2.f8695e) {
                    return;
                }
                if (kVar == null) {
                    ?? obj = new Object();
                    obj.f8834a = null;
                    obj.f8835b = new ArrayList();
                    obj.f8834a = nVar;
                    arrayList.add(obj);
                    kVar2 = obj;
                }
                nVar.f8846c = kVar2;
                kVar2.f8835b.add(nVar);
                x.e eVar3 = nVar.h;
                Iterator it = eVar3.f8829k.iterator();
                while (it.hasNext()) {
                    InterfaceC0655d interfaceC0655d = (InterfaceC0655d) it.next();
                    if (interfaceC0655d instanceof x.e) {
                        a((x.e) interfaceC0655d, i, arrayList, kVar2);
                    }
                }
                x.e eVar4 = nVar.i;
                Iterator it2 = eVar4.f8829k.iterator();
                while (it2.hasNext()) {
                    InterfaceC0655d interfaceC0655d2 = (InterfaceC0655d) it2.next();
                    if (interfaceC0655d2 instanceof x.e) {
                        a((x.e) interfaceC0655d2, i, arrayList, kVar2);
                    }
                }
                if (i == 1 && (nVar instanceof x.l)) {
                    Iterator it3 = ((x.l) nVar).f8836k.f8829k.iterator();
                    while (it3.hasNext()) {
                        InterfaceC0655d interfaceC0655d3 = (InterfaceC0655d) it3.next();
                        if (interfaceC0655d3 instanceof x.e) {
                            a((x.e) interfaceC0655d3, i, arrayList, kVar2);
                        }
                    }
                }
                Iterator it4 = eVar3.f8830l.iterator();
                while (it4.hasNext()) {
                    a((x.e) it4.next(), i, arrayList, kVar2);
                }
                Iterator it5 = eVar4.f8830l.iterator();
                while (it5.hasNext()) {
                    a((x.e) it5.next(), i, arrayList, kVar2);
                }
                if (i == 1 && (nVar instanceof x.l)) {
                    Iterator it6 = ((x.l) nVar).f8836k.f8830l.iterator();
                    while (it6.hasNext()) {
                        a((x.e) it6.next(), i, arrayList, kVar2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(w.e r23) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.m.b(w.e):void");
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f8297f;
        arrayList.clear();
        w.e eVar = (w.e) this.f8296e;
        eVar.f8693d.f();
        eVar.f8695e.f();
        arrayList.add(eVar.f8693d);
        arrayList.add(eVar.f8695e);
        Iterator it = eVar.f8736q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            w.d dVar = (w.d) it.next();
            if (dVar instanceof w.h) {
                x.n nVar = new x.n(dVar);
                dVar.f8693d.f();
                dVar.f8695e.f();
                nVar.f8849f = ((w.h) dVar).f8798u0;
                arrayList.add(nVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f8689b == null) {
                        dVar.f8689b = new C0654c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f8689b);
                } else {
                    arrayList.add(dVar.f8693d);
                }
                if (dVar.y()) {
                    if (dVar.f8691c == null) {
                        dVar.f8691c = new C0654c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f8691c);
                } else {
                    arrayList.add(dVar.f8695e);
                }
                if (dVar instanceof w.i) {
                    arrayList.add(new x.n(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((x.n) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            x.n nVar2 = (x.n) it3.next();
            if (nVar2.f8845b != eVar) {
                nVar2.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.i;
        arrayList2.clear();
        w.e eVar2 = (w.e) this.f8295d;
        e(eVar2.f8693d, 0, arrayList2);
        e(eVar2.f8695e, 1, arrayList2);
        this.f8293b = false;
    }

    public int d(w.e eVar, int i) {
        ArrayList arrayList;
        int i4;
        long max;
        float f2;
        w.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.i;
        int size = arrayList2.size();
        long j4 = 0;
        int i5 = 0;
        long j5 = 0;
        while (i5 < size) {
            x.n nVar = ((x.k) arrayList2.get(i5)).f8834a;
            if (!(nVar instanceof C0654c) ? !(i != 0 ? (nVar instanceof x.l) : (nVar instanceof x.j)) : ((C0654c) nVar).f8849f != i) {
                x.e eVar3 = (i == 0 ? eVar2.f8693d : eVar2.f8695e).h;
                x.e eVar4 = (i == 0 ? eVar2.f8693d : eVar2.f8695e).i;
                boolean contains = nVar.h.f8830l.contains(eVar3);
                x.e eVar5 = nVar.i;
                boolean contains2 = eVar5.f8830l.contains(eVar4);
                long j6 = nVar.j();
                x.e eVar6 = nVar.h;
                if (contains && contains2) {
                    long b4 = x.k.b(eVar6, j4);
                    arrayList = arrayList2;
                    long a2 = x.k.a(eVar5, j4);
                    long j7 = b4 - j6;
                    int i6 = eVar5.f8826f;
                    i4 = i5;
                    if (j7 >= (-i6)) {
                        j7 += i6;
                    }
                    long j8 = eVar6.f8826f;
                    long j9 = ((-a2) - j6) - j8;
                    if (j9 >= j8) {
                        j9 -= j8;
                    }
                    w.d dVar = nVar.f8845b;
                    if (i == 0) {
                        f2 = dVar.f8694d0;
                    } else if (i == 1) {
                        f2 = dVar.f8696e0;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f4 = (float) (f2 > BitmapDescriptorFactory.HUE_RED ? (((float) j7) / (1.0f - f2)) + (((float) j9) / f2) : 0L);
                    max = (eVar6.f8826f + ((((f4 * f2) + 0.5f) + j6) + com.google.android.gms.measurement.internal.a.a(1.0f, f2, f4, 0.5f))) - eVar5.f8826f;
                } else {
                    arrayList = arrayList2;
                    i4 = i5;
                    max = contains ? Math.max(x.k.b(eVar6, eVar6.f8826f), eVar6.f8826f + j6) : contains2 ? Math.max(-x.k.a(eVar5, eVar5.f8826f), (-eVar5.f8826f) + j6) : (nVar.j() + eVar6.f8826f) - eVar5.f8826f;
                }
            } else {
                arrayList = arrayList2;
                max = j4;
                i4 = i5;
            }
            j5 = Math.max(j5, max);
            i5 = i4 + 1;
            arrayList2 = arrayList;
            eVar2 = eVar;
            j4 = 0;
        }
        return (int) j5;
    }

    public void e(x.n nVar, int i, ArrayList arrayList) {
        x.e eVar;
        Iterator it = nVar.h.f8829k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            eVar = nVar.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0655d interfaceC0655d = (InterfaceC0655d) it.next();
            if (interfaceC0655d instanceof x.e) {
                a((x.e) interfaceC0655d, i, arrayList, null);
            } else if (interfaceC0655d instanceof x.n) {
                a(((x.n) interfaceC0655d).h, i, arrayList, null);
            }
        }
        Iterator it2 = eVar.f8829k.iterator();
        while (it2.hasNext()) {
            InterfaceC0655d interfaceC0655d2 = (InterfaceC0655d) it2.next();
            if (interfaceC0655d2 instanceof x.e) {
                a((x.e) interfaceC0655d2, i, arrayList, null);
            } else if (interfaceC0655d2 instanceof x.n) {
                a(((x.n) interfaceC0655d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((x.l) nVar).f8836k.f8829k.iterator();
            while (it3.hasNext()) {
                InterfaceC0655d interfaceC0655d3 = (InterfaceC0655d) it3.next();
                if (interfaceC0655d3 instanceof x.e) {
                    a((x.e) interfaceC0655d3, i, arrayList, null);
                }
            }
        }
    }

    public void f(int i, int i4, int i5, int i6, w.d dVar) {
        C0653b c0653b = (C0653b) this.h;
        c0653b.f8811a = i;
        c0653b.f8812b = i5;
        c0653b.f8813c = i4;
        c0653b.f8814d = i6;
        ((androidx.constraintlayout.widget.f) this.f8298g).b(dVar, c0653b);
        dVar.O(c0653b.f8815e);
        dVar.L(c0653b.f8816f);
        dVar.f8667E = c0653b.h;
        dVar.I(c0653b.f8817g);
    }

    public void g() {
        m mVar;
        C0652a c0652a;
        Iterator it = ((w.e) this.f8295d).f8736q0.iterator();
        while (it.hasNext()) {
            w.d dVar = (w.d) it.next();
            if (!dVar.f8687a) {
                int[] iArr = dVar.f8715p0;
                boolean z3 = false;
                int i = iArr[0];
                int i4 = iArr[1];
                int i5 = dVar.f8717r;
                int i6 = dVar.f8718s;
                boolean z4 = i == 2 || (i == 3 && i5 == 1);
                if (i4 == 2 || (i4 == 3 && i6 == 1)) {
                    z3 = true;
                }
                x.f fVar = dVar.f8693d.f8848e;
                boolean z5 = fVar.f8828j;
                x.f fVar2 = dVar.f8695e.f8848e;
                boolean z6 = fVar2.f8828j;
                boolean z7 = z4;
                if (z5 && z6) {
                    mVar = this;
                    mVar.f(1, fVar.f8827g, 1, fVar2.f8827g, dVar);
                    dVar.f8687a = true;
                } else if (z5 && z3) {
                    mVar = this;
                    mVar.f(1, fVar.f8827g, 2, fVar2.f8827g, dVar);
                    if (i4 == 3) {
                        dVar.f8695e.f8848e.f8831m = dVar.k();
                    } else {
                        dVar.f8695e.f8848e.d(dVar.k());
                        dVar.f8687a = true;
                    }
                } else {
                    mVar = this;
                    if (z6 && z7) {
                        mVar.f(2, fVar.f8827g, 1, fVar2.f8827g, dVar);
                        if (i == 3) {
                            dVar.f8693d.f8848e.f8831m = dVar.q();
                        } else {
                            dVar.f8693d.f8848e.d(dVar.q());
                            dVar.f8687a = true;
                        }
                    }
                }
                if (dVar.f8687a && (c0652a = dVar.f8695e.f8837l) != null) {
                    c0652a.d(dVar.f8688a0);
                }
                this = mVar;
            }
        }
    }

    public String toString() {
        String joinToString$default;
        switch (this.f8292a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                if (this.f8293b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f8294c) {
                    arrayList.add("isDirectory");
                }
                Long l4 = (Long) this.f8296e;
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4);
                }
                Long l5 = (Long) this.f8297f;
                if (l5 != null) {
                    arrayList.add("createdAt=" + l5);
                }
                Long l6 = (Long) this.f8298g;
                if (l6 != null) {
                    arrayList.add("lastModifiedAt=" + l6);
                }
                Long l7 = (Long) this.h;
                if (l7 != null) {
                    arrayList.add("lastAccessedAt=" + l7);
                }
                Map map = (Map) this.i;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
                return joinToString$default;
            default:
                return super.toString();
        }
    }

    public m(boolean z3, boolean z4, z zVar, Long l4, Long l5, Long l6, Long l7, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f8293b = z3;
        this.f8294c = z4;
        this.f8295d = zVar;
        this.f8296e = l4;
        this.f8297f = l5;
        this.f8298g = l6;
        this.h = l7;
        this.i = MapsKt.toMap(extras);
    }

    public /* synthetic */ m(boolean z3, boolean z4, z zVar, Long l4, Long l5, Long l6, Long l7) {
        this(z3, z4, zVar, l4, l5, l6, l7, MapsKt.emptyMap());
    }
}
