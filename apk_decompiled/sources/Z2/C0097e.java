package Z2;

import java.lang.reflect.Method;

/* renamed from: Z2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0097e extends L {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Method f2254k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f2255l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2256m;

    public C0097e(Method method, Class cls, int i) {
        this.f2254k = method;
        this.f2255l = cls;
        this.f2256m = i;
    }

    @Override // Z2.L
    public final Object e() {
        return this.f2254k.invoke(null, this.f2255l, Integer.valueOf(this.f2256m));
    }

    public final String toString() {
        return this.f2255l.getName();
    }
}
