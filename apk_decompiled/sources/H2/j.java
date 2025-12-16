package H2;

import android.view.View;

/* loaded from: classes3.dex */
public final class j implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f713b;

    public j(k kVar, View view) {
        this.f713b = kVar;
        this.f712a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        View view2 = this.f712a;
        if (view2.getVisibility() == 0) {
            this.f713b.c(view2);
        }
    }
}
