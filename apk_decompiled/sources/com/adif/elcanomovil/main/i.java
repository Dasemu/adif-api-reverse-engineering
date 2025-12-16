package com.adif.elcanomovil.main;

import android.os.Bundle;
import com.adif.elcanomovil.commonNavGraph.R;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class i implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f4550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4551b;

    public i(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f4550a = key;
        this.f4551b = R.id.to_selectStationFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f4550a, ((i) obj).f4550a);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4551b;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.f4550a);
        return bundle;
    }

    public final int hashCode() {
        return this.f4550a.hashCode();
    }

    public final String toString() {
        return com.google.android.gms.measurement.internal.a.n(new StringBuilder("ToSelectStationFragment(key="), this.f4550a, ')');
    }
}
