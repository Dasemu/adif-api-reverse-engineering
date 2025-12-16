package androidx.recyclerview.widget;

import O.C0056b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class K0 extends C0056b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f3558d;

    /* renamed from: e, reason: collision with root package name */
    public final J0 f3559e;

    public K0(RecyclerView recyclerView) {
        this.f3558d = recyclerView;
        J0 j02 = this.f3559e;
        if (j02 != null) {
            this.f3559e = j02;
        } else {
            this.f3559e = new J0(this);
        }
    }

    @Override // O.C0056b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f3558d.Q()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Y(accessibilityEvent);
        }
    }

    @Override // O.C0056b
    public final void d(View view, P.k kVar) {
        this.f1232a.onInitializeAccessibilityNodeInfo(view, kVar.f1341a);
        RecyclerView recyclerView = this.f3558d;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0238q0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3884b;
        layoutManager.Z(recyclerView2.f3676c, recyclerView2.f3686h0, kVar);
    }

    @Override // O.C0056b
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f3558d;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC0238q0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3884b;
        return layoutManager.m0(recyclerView2.f3676c, recyclerView2.f3686h0, i, bundle);
    }
}
