package T2;

import C.w;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class l extends k {

    /* renamed from: b, reason: collision with root package name */
    public final S2.p f1692b;

    public l(S2.p pVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f1692b = pVar;
    }

    @Override // T2.k
    public final Object c() {
        return this.f1692b.j();
    }

    @Override // T2.k
    public final Object d(Object obj) {
        return obj;
    }

    @Override // T2.k
    public final void e(Object obj, Y2.a aVar, j jVar) {
        Object a2 = jVar.h.a(aVar);
        if (a2 == null && jVar.f1689k) {
            return;
        }
        Field field = jVar.f1682b;
        if (jVar.f1690l) {
            throw new RuntimeException(w.z("Cannot set value of 'static final' ", V2.c.d(field, false)));
        }
        field.set(obj, a2);
    }
}
