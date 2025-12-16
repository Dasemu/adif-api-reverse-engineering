package com.adif.elcanomovil.commonNavGraph;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class d implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f4418a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f4419b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4420c;

    public d(String key, String[] values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f4418a = key;
        this.f4419b = values;
        this.f4420c = R.id.to_selectableBottomSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f4418a, dVar.f4418a) && Intrinsics.areEqual(this.f4419b, dVar.f4419b);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4420c;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.f4418a);
        bundle.putStringArray("values", this.f4419b);
        return bundle;
    }

    public final int hashCode() {
        return (this.f4418a.hashCode() * 31) + Arrays.hashCode(this.f4419b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToSelectableBottomSheet(key=");
        sb.append(this.f4418a);
        sb.append(", values=");
        return com.google.android.gms.measurement.internal.a.n(sb, Arrays.toString(this.f4419b), ')');
    }
}
