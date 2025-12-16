package com.adif.elcanomovil.main;

import android.os.Bundle;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o0.AbstractC0544v;
import o0.E;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements o0.r, FunctionAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomNavFragment f4536a;

    public a(BottomNavFragment bottomNavFragment) {
        this.f4536a = bottomNavFragment;
    }

    @Override // o0.r
    public final void a(AbstractC0544v p02, E p12, Bundle bundle) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        this.f4536a.onDestinationChanged(p02, p12, bundle);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o0.r) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(3, this.f4536a, BottomNavFragment.class, "onDestinationChanged", "onDestinationChanged(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
