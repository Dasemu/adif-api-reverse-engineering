package com.adif.elcanomovil.commonNavGraph;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class g implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f4436a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4437b;

    public g(String observation) {
        Intrinsics.checkNotNullParameter(observation, "observation");
        this.f4436a = observation;
        this.f4437b = R.id.to_trainObservationBottomSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.areEqual(this.f4436a, ((g) obj).f4436a);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4437b;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("observation", this.f4436a);
        return bundle;
    }

    public final int hashCode() {
        return this.f4436a.hashCode();
    }

    public final String toString() {
        return com.google.android.gms.measurement.internal.a.n(new StringBuilder("ToTrainObservationBottomSheet(observation="), this.f4436a, ')');
    }
}
