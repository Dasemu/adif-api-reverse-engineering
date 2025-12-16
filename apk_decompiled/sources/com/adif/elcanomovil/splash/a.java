package com.adif.elcanomovil.splash;

import android.os.Bundle;
import android.os.Parcelable;
import com.adif.elcanomovil.commonNavGraph.R;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class a implements F {

    /* renamed from: a, reason: collision with root package name */
    public final BottomNavInitialTab f4819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4820b = R.id.to_bottomNav;

    public a(BottomNavInitialTab bottomNavInitialTab) {
        this.f4819a = bottomNavInitialTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f4819a, ((a) obj).f4819a);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4820b;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(BottomNavInitialTab.class);
        Parcelable parcelable = this.f4819a;
        if (isAssignableFrom) {
            bundle.putParcelable("initialTab", parcelable);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(BottomNavInitialTab.class)) {
            bundle.putSerializable("initialTab", (Serializable) parcelable);
        }
        return bundle;
    }

    public final int hashCode() {
        BottomNavInitialTab bottomNavInitialTab = this.f4819a;
        if (bottomNavInitialTab == null) {
            return 0;
        }
        return bottomNavInitialTab.hashCode();
    }

    public final String toString() {
        return "ToBottomNav(initialTab=" + this.f4819a + ')';
    }
}
