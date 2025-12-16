package S2;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class q extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f1624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1625c;

    public q(Method method, Object obj) {
        this.f1624b = method;
        this.f1625c = obj;
    }

    @Override // S2.u
    public final Object a(Class cls) {
        String m4 = F.i.m(cls);
        if (m4 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m4));
        }
        return this.f1624b.invoke(this.f1625c, cls);
    }
}
