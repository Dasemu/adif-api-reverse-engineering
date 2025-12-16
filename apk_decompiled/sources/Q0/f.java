package Q0;

/* loaded from: classes.dex */
public final class f extends s.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F.i f1363a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, F.i iVar) {
        super(i);
        this.f1363a = iVar;
    }

    @Override // s.i
    public final void entryRemoved(boolean z3, Object obj, Object obj2, Object obj3) {
        e eVar = (e) obj2;
        ((i) this.f1363a.f490b).e((b) obj, eVar.f1360a, eVar.f1361b, eVar.f1362c);
    }

    @Override // s.i
    public final int sizeOf(Object obj, Object obj2) {
        return ((e) obj2).f1362c;
    }
}
