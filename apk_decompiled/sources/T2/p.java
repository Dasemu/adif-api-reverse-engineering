package T2;

/* loaded from: classes3.dex */
public final class p implements Q2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f1706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q2.l f1707c;

    public /* synthetic */ p(Class cls, Q2.l lVar, int i) {
        this.f1705a = i;
        this.f1706b = cls;
        this.f1707c = lVar;
    }

    @Override // Q2.m
    public final Q2.l a(Q2.d dVar, X2.a aVar) {
        switch (this.f1705a) {
            case 0:
                if (aVar.getRawType() == this.f1706b) {
                    return this.f1707c;
                }
                return null;
            default:
                Class<?> rawType = aVar.getRawType();
                if (this.f1706b.isAssignableFrom(rawType)) {
                    return new b(this, rawType);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f1705a) {
            case 0:
                return "Factory[type=" + this.f1706b.getName() + ",adapter=" + this.f1707c + "]";
            default:
                return "Factory[typeHierarchy=" + this.f1706b.getName() + ",adapter=" + this.f1707c + "]";
        }
    }
}
