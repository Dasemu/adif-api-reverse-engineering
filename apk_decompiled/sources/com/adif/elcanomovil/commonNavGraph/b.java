package com.adif.elcanomovil.commonNavGraph;

import android.os.Bundle;
import android.os.Parcelable;
import com.adif.elcanomovil.commonNavGraph.arguments.Filters;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class b implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f4413a;

    /* renamed from: b, reason: collision with root package name */
    public final Filters f4414b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4415c;

    public b(String key, Filters values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f4413a = key;
        this.f4414b = values;
        this.f4415c = R.id.to_filterListBottomSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f4413a, bVar.f4413a) && Intrinsics.areEqual(this.f4414b, bVar.f4414b);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4415c;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.f4413a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Filters.class);
        Serializable serializable = this.f4414b;
        if (isAssignableFrom) {
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("values", (Parcelable) serializable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(Filters.class)) {
            throw new UnsupportedOperationException(Filters.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("values", serializable);
        return bundle;
    }

    public final int hashCode() {
        return this.f4414b.hashCode() + (this.f4413a.hashCode() * 31);
    }

    public final String toString() {
        return "ToFilterListBottomSheet(key=" + this.f4413a + ", values=" + this.f4414b + ')';
    }
}
