package Z2;

/* loaded from: classes3.dex */
public final class z extends S2.m {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(C c4, int i) {
        super(c4);
        this.f2315f = i;
    }

    @Override // S2.m, java.util.Iterator
    public Object next() {
        switch (this.f2315f) {
            case 1:
                return b().f2197f;
            default:
                return super.next();
        }
    }
}
