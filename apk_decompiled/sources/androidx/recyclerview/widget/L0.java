package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class L0 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3562a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212d0 f3563b;

    public L0(C0212d0 c0212d0) {
        this.f3563b = c0212d0;
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f3562a) {
            this.f3562a = false;
            this.f3563b.h();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        if (i == 0 && i4 == 0) {
            return;
        }
        this.f3562a = true;
    }
}
