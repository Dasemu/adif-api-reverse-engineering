package S2;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class r extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f1626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1627c;

    public r(Method method, int i) {
        this.f1626b = method;
        this.f1627c = i;
    }

    @Override // S2.u
    public final Object a(Class cls) {
        String m4 = F.i.m(cls);
        if (m4 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m4));
        }
        return this.f1626b.invoke(null, cls, Integer.valueOf(this.f1627c));
    }
}
