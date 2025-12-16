package T2;

import a.AbstractC0106b;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class k extends Q2.l {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1691a;

    public k(LinkedHashMap linkedHashMap) {
        this.f1691a = linkedHashMap;
    }

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        if (aVar.o0() == 9) {
            aVar.k0();
            return null;
        }
        Object c4 = c();
        try {
            aVar.e();
            while (aVar.b0()) {
                j jVar = (j) this.f1691a.get(aVar.i0());
                if (jVar != null && jVar.f1685e) {
                    e(c4, aVar, jVar);
                }
                aVar.u0();
            }
            aVar.Y();
            return d(c4);
        } catch (IllegalAccessException e4) {
            AbstractC0106b abstractC0106b = V2.c.f1878a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e4);
        } catch (IllegalStateException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // Q2.l
    public final void b(Y2.b bVar, Object obj) {
        if (obj == null) {
            bVar.b0();
            return;
        }
        bVar.s();
        try {
            Iterator it = this.f1691a.values().iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(bVar, obj);
            }
            bVar.Y();
        } catch (IllegalAccessException e4) {
            AbstractC0106b abstractC0106b = V2.c.f1878a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e4);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, Y2.a aVar, j jVar);
}
