package T2;

import C.w;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import u.AbstractC0629f;

/* loaded from: classes3.dex */
public final class i extends Q2.l {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1679b = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final Q2.d f1680a;

    public i(Q2.d dVar) {
        this.f1680a = dVar;
    }

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int o02 = aVar.o0();
        int b4 = AbstractC0629f.b(o02);
        if (b4 == 0) {
            aVar.d();
            arrayList = new ArrayList();
        } else if (b4 != 2) {
            arrayList = null;
        } else {
            aVar.e();
            arrayList = new S2.o(true);
        }
        if (arrayList == null) {
            return c(aVar, o02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.b0()) {
                String i02 = arrayList instanceof Map ? aVar.i0() : null;
                int o03 = aVar.o0();
                int b5 = AbstractC0629f.b(o03);
                if (b5 == 0) {
                    aVar.d();
                    arrayList2 = new ArrayList();
                } else if (b5 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.e();
                    arrayList2 = new S2.o(true);
                }
                boolean z3 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(aVar, o03);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(i02, arrayList2);
                }
                if (z3) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.O();
                } else {
                    aVar.Y();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // Q2.l
    public final void b(Y2.b bVar, Object obj) {
        if (obj == null) {
            bVar.b0();
            return;
        }
        Class<?> cls = obj.getClass();
        Q2.d dVar = this.f1680a;
        dVar.getClass();
        Q2.l d4 = dVar.d(X2.a.get((Class) cls));
        if (!(d4 instanceof i)) {
            d4.b(bVar, obj);
        } else {
            bVar.s();
            bVar.Y();
        }
    }

    public final Serializable c(Y2.a aVar, int i) {
        int b4 = AbstractC0629f.b(i);
        if (b4 == 5) {
            return aVar.m0();
        }
        if (b4 == 6) {
            return Double.valueOf(aVar.f0());
        }
        if (b4 == 7) {
            return Boolean.valueOf(aVar.e0());
        }
        if (b4 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(w.C(i)));
        }
        aVar.k0();
        return null;
    }
}
