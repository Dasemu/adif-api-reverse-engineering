package com.adif.elcanomovil.main;

import android.os.Bundle;
import com.adif.elcanomovil.commonNavGraph.R;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class j implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f4552a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4553b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4554c;

    public j(String resultName, String str) {
        Intrinsics.checkNotNullParameter(resultName, "resultName");
        this.f4552a = resultName;
        this.f4553b = str;
        this.f4554c = R.id.to_selectTrainFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f4552a, jVar.f4552a) && Intrinsics.areEqual(this.f4553b, jVar.f4553b);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4554c;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("result_name", this.f4552a);
        bundle.putString("commercial_number", this.f4553b);
        return bundle;
    }

    public final int hashCode() {
        int hashCode = this.f4552a.hashCode() * 31;
        String str = this.f4553b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToSelectTrainFragment(resultName=");
        sb.append(this.f4552a);
        sb.append(", commercialNumber=");
        return com.google.android.gms.measurement.internal.a.n(sb, this.f4553b, ')');
    }
}
