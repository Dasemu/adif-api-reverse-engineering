package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173x extends T {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f3270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0174y f3271b;

    public C0173x(DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y, T t2) {
        this.f3271b = dialogInterfaceOnCancelListenerC0174y;
        this.f3270a = t2;
    }

    @Override // androidx.fragment.app.T
    public final View b(int i) {
        T t2 = this.f3270a;
        return t2.c() ? t2.b(i) : this.f3271b.onFindViewById(i);
    }

    @Override // androidx.fragment.app.T
    public final boolean c() {
        return this.f3270a.c() || this.f3271b.onHasView();
    }
}
