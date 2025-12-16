package T2;

import C.w;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f extends Q2.l {

    /* renamed from: a, reason: collision with root package name */
    public final o f1671a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1672b;

    /* renamed from: c, reason: collision with root package name */
    public final S2.p f1673c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f1674d;

    public f(c cVar, Q2.d dVar, Type type, Q2.l lVar, Type type2, Q2.l lVar2, S2.p pVar) {
        this.f1674d = cVar;
        this.f1671a = new o(dVar, lVar, type);
        this.f1672b = new o(dVar, lVar2, type2);
        this.f1673c = pVar;
    }

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        int o02 = aVar.o0();
        if (o02 == 9) {
            aVar.k0();
            return null;
        }
        Map map = (Map) this.f1673c.j();
        o oVar = this.f1672b;
        o oVar2 = this.f1671a;
        Q2.l lVar = (Q2.l) oVar.f1703c;
        Q2.l lVar2 = (Q2.l) oVar2.f1703c;
        if (o02 == 1) {
            aVar.d();
            while (aVar.b0()) {
                aVar.d();
                Object a2 = lVar2.a(aVar);
                if (map.put(a2, lVar.a(aVar)) != null) {
                    throw new RuntimeException("duplicate key: " + a2);
                }
                aVar.O();
            }
            aVar.O();
            return map;
        }
        aVar.e();
        while (aVar.b0()) {
            E2.e.f383b.getClass();
            int i = aVar.h;
            if (i == 0) {
                i = aVar.x();
            }
            if (i == 13) {
                aVar.h = 9;
            } else if (i == 12) {
                aVar.h = 8;
            } else {
                if (i != 14) {
                    throw new IllegalStateException("Expected a name but was " + w.C(aVar.o0()) + aVar.d0());
                }
                aVar.h = 10;
            }
            Object a4 = lVar2.a(aVar);
            if (map.put(a4, lVar.a(aVar)) != null) {
                throw new RuntimeException("duplicate key: " + a4);
            }
        }
        aVar.Y();
        return map;
    }

    @Override // Q2.l
    public final void b(Y2.b bVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            bVar.b0();
            return;
        }
        this.f1674d.getClass();
        o oVar = this.f1672b;
        bVar.s();
        for (Map.Entry entry : map.entrySet()) {
            bVar.Z(String.valueOf(entry.getKey()));
            oVar.b(bVar, entry.getValue());
        }
        bVar.Y();
    }
}
