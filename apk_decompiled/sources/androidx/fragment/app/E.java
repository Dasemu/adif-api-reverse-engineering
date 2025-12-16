package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class E implements androidx.lifecycle.H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f2994a;

    public E(K k4) {
        this.f2994a = k4;
    }

    @Override // androidx.lifecycle.H
    public final void onStateChanged(androidx.lifecycle.J j4, androidx.lifecycle.A a2) {
        View view;
        if (a2 != androidx.lifecycle.A.ON_STOP || (view = this.f2994a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
