package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127s implements P {

    /* renamed from: b, reason: collision with root package name */
    public static final C0127s f2961b = new C0127s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2962a;

    public /* synthetic */ C0127s(int i) {
        this.f2962a = i;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final C0109a0 a(Class cls) {
        switch (this.f2962a) {
            case 0:
                if (!AbstractC0130v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C0109a0) AbstractC0130v.e(cls.asSubclass(AbstractC0130v.class)).d(3);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final boolean b(Class cls) {
        switch (this.f2962a) {
            case 0:
                return AbstractC0130v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
