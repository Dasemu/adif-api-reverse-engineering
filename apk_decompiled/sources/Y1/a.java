package Y1;

import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class a implements Provider {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2135c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f2136a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f2137b;

    /* JADX WARN: Type inference failed for: r0v1, types: [Y1.a, javax.inject.Provider, java.lang.Object] */
    public static Provider a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f2137b = f2135c;
        obj.f2136a = bVar;
        return obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.f2137b;
        Object obj3 = f2135c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f2137b;
                if (obj == obj3) {
                    obj = this.f2136a.get();
                    Object obj4 = this.f2137b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f2137b = obj;
                    this.f2136a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
