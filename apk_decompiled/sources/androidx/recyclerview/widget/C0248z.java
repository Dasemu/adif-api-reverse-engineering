package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248z extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f3943a;

    public C0248z(C c4) {
        this.f3943a = c4;
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C c4 = this.f3943a;
        int computeVerticalScrollRange = c4.f3483s.computeVerticalScrollRange();
        int i5 = c4.f3482r;
        int i6 = computeVerticalScrollRange - i5;
        int i7 = c4.f3468a;
        c4.f3484t = i6 > 0 && i5 >= i7;
        int computeHorizontalScrollRange = c4.f3483s.computeHorizontalScrollRange();
        int i8 = c4.f3481q;
        boolean z3 = computeHorizontalScrollRange - i8 > 0 && i8 >= i7;
        c4.f3485u = z3;
        boolean z4 = c4.f3484t;
        if (!z4 && !z3) {
            if (c4.f3486v != 0) {
                c4.f(0);
                return;
            }
            return;
        }
        if (z4) {
            float f2 = i5;
            c4.f3477l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c4.f3476k = Math.min(i5, (i5 * i5) / computeVerticalScrollRange);
        }
        if (c4.f3485u) {
            float f4 = computeHorizontalScrollOffset;
            float f5 = i8;
            c4.f3480o = (int) ((((f5 / 2.0f) + f4) * f5) / computeHorizontalScrollRange);
            c4.f3479n = Math.min(i8, (i8 * i8) / computeHorizontalScrollRange);
        }
        int i9 = c4.f3486v;
        if (i9 == 0 || i9 == 1) {
            c4.f(1);
        }
    }
}
