package Z2;

import java.lang.reflect.Method;

/* renamed from: Z2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0096d extends L {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Method f2251k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2252l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Class f2253m;

    public C0096d(Method method, Object obj, Class cls) {
        this.f2251k = method;
        this.f2252l = obj;
        this.f2253m = cls;
    }

    @Override // Z2.L
    public final Object e() {
        return this.f2251k.invoke(this.f2252l, this.f2253m);
    }

    public final String toString() {
        return this.f2253m.getName();
    }
}
