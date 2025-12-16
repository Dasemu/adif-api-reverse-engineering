package T2;

import C.w;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class n implements Q2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1697a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1698b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1699c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1700d;

    public n(F.i iVar, S2.h hVar, c cVar, List list) {
        this.f1698b = iVar;
        this.f1699c = hVar;
        this.f1700d = list;
    }

    @Override // Q2.m
    public final Q2.l a(Q2.d dVar, X2.a aVar) {
        switch (this.f1697a) {
            case 0:
                Class<Object> rawType = aVar.getRawType();
                if (!Object.class.isAssignableFrom(rawType)) {
                    return null;
                }
                S2.d.e((List) this.f1700d);
                return V2.c.f1878a.t(rawType) ? new m(rawType, b(dVar, aVar, rawType, true)) : new l(((F.i) this.f1698b).r(aVar), b(dVar, aVar, rawType, false));
            default:
                Class<Object> rawType2 = aVar.getRawType();
                if (rawType2 == ((Class) this.f1698b) || rawType2 == ((Class) this.f1699c)) {
                    return (Q2.l) this.f1700d;
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedHashMap b(Q2.d r27, X2.a r28, java.lang.Class r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.n.b(Q2.d, X2.a, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    public boolean c(Field field, boolean z3) {
        Class<?> type = field.getType();
        S2.h hVar = (S2.h) this.f1699c;
        hVar.getClass();
        if (S2.h.c(type)) {
            return false;
        }
        hVar.b(z3);
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || S2.h.c(field.getType())) {
            return false;
        }
        List list = z3 ? hVar.f1598a : hVar.f1599b;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw w.g(it);
        }
        return true;
    }

    public String toString() {
        switch (this.f1697a) {
            case 1:
                return "Factory[type=" + ((Class) this.f1699c).getName() + "+" + ((Class) this.f1698b).getName() + ",adapter=" + ((Q2.l) this.f1700d) + "]";
            default:
                return super.toString();
        }
    }

    public n(Class cls, Class cls2, Q2.l lVar) {
        this.f1698b = cls;
        this.f1699c = cls2;
        this.f1700d = lVar;
    }
}
