package S2;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class s extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f1628b;

    public s(Method method) {
        this.f1628b = method;
    }

    @Override // S2.u
    public final Object a(Class cls) {
        String m4 = F.i.m(cls);
        if (m4 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m4));
        }
        return this.f1628b.invoke(null, cls, Object.class);
    }
}
