package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class I implements P {

    /* renamed from: a, reason: collision with root package name */
    public P[] f2850a;

    @Override // androidx.datastore.preferences.protobuf.P
    public final C0109a0 a(Class cls) {
        for (P p : this.f2850a) {
            if (p.b(cls)) {
                return p.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final boolean b(Class cls) {
        for (P p : this.f2850a) {
            if (p.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
