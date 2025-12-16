package b;

import o0.AbstractC0544v;

/* loaded from: classes.dex */
public final class C extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4103a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(AbstractC0544v abstractC0544v) {
        super(false);
        this.f4104b = abstractC0544v;
    }

    @Override // b.r
    public final void handleOnBackPressed() {
        switch (this.f4103a) {
            case 0:
                ((com.adif.elcanomovil.uiTrain.main.e) this.f4104b).invoke(this);
                return;
            default:
                ((AbstractC0544v) this.f4104b).q();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(com.adif.elcanomovil.uiTrain.main.e eVar) {
        super(true);
        this.f4104b = eVar;
    }
}
