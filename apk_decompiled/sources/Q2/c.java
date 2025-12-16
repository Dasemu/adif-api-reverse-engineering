package Q2;

/* loaded from: classes3.dex */
public final class c extends l {

    /* renamed from: a, reason: collision with root package name */
    public l f1378a;

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        l lVar = this.f1378a;
        if (lVar != null) {
            return lVar.a(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // Q2.l
    public final void b(Y2.b bVar, Object obj) {
        l lVar = this.f1378a;
        if (lVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        lVar.b(bVar, obj);
    }
}
