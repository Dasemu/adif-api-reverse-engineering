package T2;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b extends Q2.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a f1663d = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1664a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1665b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1666c;

    public b(Q2.d dVar, Q2.l lVar, Class cls) {
        this.f1665b = new o(dVar, lVar, cls);
        this.f1666c = cls;
    }

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        switch (this.f1664a) {
            case 0:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                aVar.d();
                while (aVar.b0()) {
                    arrayList.add(((Q2.l) ((o) this.f1665b).f1703c).a(aVar));
                }
                aVar.O();
                int size = arrayList.size();
                Class cls = (Class) this.f1666c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object newInstance = Array.newInstance((Class<?>) cls, size);
                for (int i = 0; i < size; i++) {
                    Array.set(newInstance, i, arrayList.get(i));
                }
                return newInstance;
            case 1:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                Collection collection = (Collection) ((S2.p) this.f1666c).j();
                aVar.d();
                while (aVar.b0()) {
                    collection.add(((Q2.l) ((o) this.f1665b).f1703c).a(aVar));
                }
                aVar.O();
                return collection;
            default:
                Object a2 = ((p) this.f1665b).f1707c.a(aVar);
                if (a2 != null) {
                    Class cls2 = (Class) this.f1666c;
                    if (!cls2.isInstance(a2)) {
                        throw new RuntimeException("Expected a " + cls2.getName() + " but was " + a2.getClass().getName() + "; at path " + aVar.a0(true));
                    }
                }
                return a2;
        }
    }

    @Override // Q2.l
    public final void b(Y2.b bVar, Object obj) {
        switch (this.f1664a) {
            case 0:
                if (obj == null) {
                    bVar.b0();
                    return;
                }
                bVar.e();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ((o) this.f1665b).b(bVar, Array.get(obj, i));
                }
                bVar.O();
                return;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    bVar.b0();
                    return;
                }
                bVar.e();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((o) this.f1665b).b(bVar, it.next());
                }
                bVar.O();
                return;
            default:
                ((p) this.f1665b).f1707c.b(bVar, obj);
                return;
        }
    }

    public b(Q2.d dVar, Type type, Q2.l lVar, S2.p pVar) {
        this.f1665b = new o(dVar, lVar, type);
        this.f1666c = pVar;
    }

    public b(p pVar, Class cls) {
        this.f1665b = pVar;
        this.f1666c = cls;
    }
}
