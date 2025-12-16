package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class W implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f3078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f3079b;

    public W(X x3, t0 t0Var) {
        this.f3079b = x3;
        this.f3078a = t0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        t0 t0Var = this.f3078a;
        t0Var.k();
        O0.m((ViewGroup) t0Var.f3240c.mView.getParent(), this.f3079b.f3080a).l();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
