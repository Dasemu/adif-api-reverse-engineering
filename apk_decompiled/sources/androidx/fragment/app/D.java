package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class D extends T {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f2987a;

    public D(K k4) {
        this.f2987a = k4;
    }

    @Override // androidx.fragment.app.T
    public final View b(int i) {
        K k4 = this.f2987a;
        View view = k4.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + k4 + " does not have a view");
    }

    @Override // androidx.fragment.app.T
    public final boolean c() {
        return this.f2987a.mView != null;
    }
}
