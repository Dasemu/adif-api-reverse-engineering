package com.adif.elcanomovil.commonNavGraph;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class c implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f4416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4417b;

    public c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f4416a = key;
        this.f4417b = R.id.to_selectStationFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f4416a, ((c) obj).f4416a);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4417b;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.f4416a);
        return bundle;
    }

    public final int hashCode() {
        return this.f4416a.hashCode();
    }

    public final String toString() {
        return com.google.android.gms.measurement.internal.a.n(new StringBuilder("ToSelectStationFragment(key="), this.f4416a, ')');
    }
}
