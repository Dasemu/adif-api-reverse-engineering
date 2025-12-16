package S2;

/* loaded from: classes3.dex */
public final class k extends m {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1602f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(o oVar, int i) {
        super(oVar);
        this.f1602f = i;
    }

    @Override // S2.m, java.util.Iterator
    public Object next() {
        switch (this.f1602f) {
            case 1:
                return a().f1615f;
            default:
                return super.next();
        }
    }
}
