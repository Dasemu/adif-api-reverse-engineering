package com.adif.elcanomovil.commonNavGraph;

import android.os.Bundle;
import android.os.Parcelable;
import com.adif.elcanomovil.commonNavGraph.arguments.StationObservationArg;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class e implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f4421a;

    /* renamed from: b, reason: collision with root package name */
    public final StationObservationArg f4422b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4423c;

    public e(String key, StationObservationArg values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f4421a = key;
        this.f4422b = values;
        this.f4423c = R.id.to_stationObservationsBottomSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f4421a, eVar.f4421a) && Intrinsics.areEqual(this.f4422b, eVar.f4422b);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4423c;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.f4421a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(StationObservationArg.class);
        Serializable serializable = this.f4422b;
        if (isAssignableFrom) {
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("values", (Parcelable) serializable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(StationObservationArg.class)) {
            throw new UnsupportedOperationException(StationObservationArg.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("values", serializable);
        return bundle;
    }

    public final int hashCode() {
        return this.f4422b.hashCode() + (this.f4421a.hashCode() * 31);
    }

    public final String toString() {
        return "ToStationObservationsBottomSheet(key=" + this.f4421a + ", values=" + this.f4422b + ')';
    }
}
