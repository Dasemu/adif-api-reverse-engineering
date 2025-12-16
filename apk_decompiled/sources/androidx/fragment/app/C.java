package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class C extends I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f2986a;

    public C(K k4) {
        this.f2986a = k4;
    }

    @Override // androidx.fragment.app.I
    public final void a() {
        K k4 = this.f2986a;
        k4.mSavedStateRegistryController.a();
        androidx.lifecycle.q0.f(k4);
        Bundle bundle = k4.mSavedFragmentState;
        k4.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
