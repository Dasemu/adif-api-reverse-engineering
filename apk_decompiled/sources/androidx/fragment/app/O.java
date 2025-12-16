package androidx.fragment.app;

import O.InterfaceC0070k;
import O.InterfaceC0076q;
import android.view.View;
import android.view.Window;
import d.AbstractC0300i;
import d.InterfaceC0301j;
import g.AbstractActivityC0364k;
import v0.C0639d;

/* loaded from: classes.dex */
public final class O extends V implements D.l, D.m, C.H, C.I, androidx.lifecycle.D0, b.D, InterfaceC0301j, v0.f, q0, InterfaceC0070k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0364k f3060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(AbstractActivityC0364k abstractActivityC0364k) {
        super(abstractActivityC0364k);
        this.f3060e = abstractActivityC0364k;
    }

    @Override // androidx.fragment.app.q0
    public final void a(AbstractC0158l0 abstractC0158l0, K k4) {
        this.f3060e.onAttachFragment(k4);
    }

    @Override // O.InterfaceC0070k
    public final void addMenuProvider(InterfaceC0076q interfaceC0076q) {
        this.f3060e.addMenuProvider(interfaceC0076q);
    }

    @Override // D.l
    public final void addOnConfigurationChangedListener(N.a aVar) {
        this.f3060e.addOnConfigurationChangedListener(aVar);
    }

    @Override // C.H
    public final void addOnMultiWindowModeChangedListener(N.a aVar) {
        this.f3060e.addOnMultiWindowModeChangedListener(aVar);
    }

    @Override // C.I
    public final void addOnPictureInPictureModeChangedListener(N.a aVar) {
        this.f3060e.addOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // D.m
    public final void addOnTrimMemoryListener(N.a aVar) {
        this.f3060e.addOnTrimMemoryListener(aVar);
    }

    @Override // androidx.fragment.app.T
    public final View b(int i) {
        return this.f3060e.findViewById(i);
    }

    @Override // androidx.fragment.app.T
    public final boolean c() {
        Window window = this.f3060e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // d.InterfaceC0301j
    public final AbstractC0300i getActivityResultRegistry() {
        return this.f3060e.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.J
    public final androidx.lifecycle.C getLifecycle() {
        return this.f3060e.mFragmentLifecycleRegistry;
    }

    @Override // b.D
    public final b.B getOnBackPressedDispatcher() {
        return this.f3060e.getOnBackPressedDispatcher();
    }

    @Override // v0.f
    public final C0639d getSavedStateRegistry() {
        return this.f3060e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.D0
    public final androidx.lifecycle.C0 getViewModelStore() {
        return this.f3060e.getViewModelStore();
    }

    @Override // O.InterfaceC0070k
    public final void removeMenuProvider(InterfaceC0076q interfaceC0076q) {
        this.f3060e.removeMenuProvider(interfaceC0076q);
    }

    @Override // D.l
    public final void removeOnConfigurationChangedListener(N.a aVar) {
        this.f3060e.removeOnConfigurationChangedListener(aVar);
    }

    @Override // C.H
    public final void removeOnMultiWindowModeChangedListener(N.a aVar) {
        this.f3060e.removeOnMultiWindowModeChangedListener(aVar);
    }

    @Override // C.I
    public final void removeOnPictureInPictureModeChangedListener(N.a aVar) {
        this.f3060e.removeOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // D.m
    public final void removeOnTrimMemoryListener(N.a aVar) {
        this.f3060e.removeOnTrimMemoryListener(aVar);
    }
}
