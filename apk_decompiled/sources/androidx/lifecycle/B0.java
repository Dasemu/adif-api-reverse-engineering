package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import l0.C0435a;

/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final R0.h f3286a;

    public B0(D0 owner, y0 factory) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        C0 store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        l0.c defaultCreationExtras = owner instanceof InterfaceC0200v ? ((InterfaceC0200v) owner).getDefaultViewModelCreationExtras() : C0435a.f7312b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f3286a = new R0.h(store, factory, defaultCreationExtras);
    }
}
