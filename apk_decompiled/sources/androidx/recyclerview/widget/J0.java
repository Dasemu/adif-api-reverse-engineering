package androidx.recyclerview.widget;

import O.C0056b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class J0 extends C0056b {

    /* renamed from: d, reason: collision with root package name */
    public final K0 f3556d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f3557e = new WeakHashMap();

    public J0(K0 k02) {
        this.f3556d = k02;
    }

    @Override // O.C0056b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0056b c0056b = (C0056b) this.f3557e.get(view);
        return c0056b != null ? c0056b.a(view, accessibilityEvent) : this.f1232a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // O.C0056b
    public final A.a b(View view) {
        C0056b c0056b = (C0056b) this.f3557e.get(view);
        return c0056b != null ? c0056b.b(view) : super.b(view);
    }

    @Override // O.C0056b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0056b c0056b = (C0056b) this.f3557e.get(view);
        if (c0056b != null) {
            c0056b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // O.C0056b
    public final void d(View view, P.k kVar) {
        K0 k02 = this.f3556d;
        boolean Q3 = k02.f3558d.Q();
        View.AccessibilityDelegate accessibilityDelegate = this.f1232a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f1341a;
        if (!Q3) {
            RecyclerView recyclerView = k02.f3558d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().a0(view, kVar);
                C0056b c0056b = (C0056b) this.f3557e.get(view);
                if (c0056b != null) {
                    c0056b.d(view, kVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // O.C0056b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0056b c0056b = (C0056b) this.f3557e.get(view);
        if (c0056b != null) {
            c0056b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // O.C0056b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0056b c0056b = (C0056b) this.f3557e.get(viewGroup);
        return c0056b != null ? c0056b.f(viewGroup, view, accessibilityEvent) : this.f1232a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // O.C0056b
    public final boolean g(View view, int i, Bundle bundle) {
        K0 k02 = this.f3556d;
        if (!k02.f3558d.Q()) {
            RecyclerView recyclerView = k02.f3558d;
            if (recyclerView.getLayoutManager() != null) {
                C0056b c0056b = (C0056b) this.f3557e.get(view);
                if (c0056b != null) {
                    if (c0056b.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                y0 y0Var = recyclerView.getLayoutManager().f3884b.f3676c;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // O.C0056b
    public final void h(View view, int i) {
        C0056b c0056b = (C0056b) this.f3557e.get(view);
        if (c0056b != null) {
            c0056b.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // O.C0056b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0056b c0056b = (C0056b) this.f3557e.get(view);
        if (c0056b != null) {
            c0056b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
