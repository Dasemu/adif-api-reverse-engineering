package com.adif.elcanomovil.main;

import android.os.Bundle;
import com.adif.elcanomovil.commonNavGraph.R;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class h implements F {

    /* renamed from: a, reason: collision with root package name */
    public final int f4541a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4542b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4543c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4544d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4545e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4546f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4547g;
    public final boolean h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4548j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4549k = R.id.to_newSubscriptionHomeFragment;

    public h(int i, int i4, String str, String str2, String str3, String str4, String str5, boolean z3, String str6, String str7) {
        this.f4541a = i;
        this.f4542b = i4;
        this.f4543c = str;
        this.f4544d = str2;
        this.f4545e = str3;
        this.f4546f = str4;
        this.f4547g = str5;
        this.h = z3;
        this.i = str6;
        this.f4548j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4541a == hVar.f4541a && this.f4542b == hVar.f4542b && Intrinsics.areEqual(this.f4543c, hVar.f4543c) && Intrinsics.areEqual(this.f4544d, hVar.f4544d) && Intrinsics.areEqual(this.f4545e, hVar.f4545e) && Intrinsics.areEqual(this.f4546f, hVar.f4546f) && Intrinsics.areEqual(this.f4547g, hVar.f4547g) && this.h == hVar.h && Intrinsics.areEqual(this.i, hVar.i) && Intrinsics.areEqual(this.f4548j, hVar.f4548j);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4549k;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("arg_type_screen", this.f4541a);
        bundle.putInt(NavArguments.ARG_TYPE_SUBSCRIPTION, this.f4542b);
        bundle.putString(NavArguments.ARG_DATA_SUBSCRIPTION, this.f4543c);
        bundle.putString(NavArguments.ARG_TRAIN_CODE_SUBSCRIPTION, this.f4544d);
        bundle.putString(NavArguments.ARG_TRAIN_DATE_SUBSCRIPTION, this.f4545e);
        bundle.putString(NavArguments.ARG_STATION_CODE_SUBSCRIPTION, this.f4546f);
        bundle.putString(NavArguments.ARG_STATION_TO_CODE_SUBSCRIPTION, this.f4547g);
        bundle.putBoolean(NavArguments.ARG_IS_CERCANIAS_SUBSCRIPTION, this.h);
        bundle.putString("arg_operator_train", this.i);
        bundle.putString("arg_commercial_product_train", this.f4548j);
        return bundle;
    }

    public final int hashCode() {
        int x3 = C.w.x(this.f4542b, Integer.hashCode(this.f4541a) * 31, 31);
        String str = this.f4543c;
        int hashCode = (x3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4544d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4545e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f4546f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f4547g;
        int c4 = C.w.c((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.h);
        String str6 = this.i;
        int hashCode5 = (c4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f4548j;
        return hashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToNewSubscriptionHomeFragment(argTypeScreen=");
        sb.append(this.f4541a);
        sb.append(", argTypeSubscription=");
        sb.append(this.f4542b);
        sb.append(", argDataSubscription=");
        sb.append(this.f4543c);
        sb.append(", argTrainCodeSubscription=");
        sb.append(this.f4544d);
        sb.append(", argTrainDateSubscription=");
        sb.append(this.f4545e);
        sb.append(", argStationCodeSubscription=");
        sb.append(this.f4546f);
        sb.append(", argStationToCodeSubscription=");
        sb.append(this.f4547g);
        sb.append(", argIsCercaniasSubscription=");
        sb.append(this.h);
        sb.append(", argOperatorTrain=");
        sb.append(this.i);
        sb.append(", argCommercialProductTrain=");
        return com.google.android.gms.measurement.internal.a.n(sb, this.f4548j, ')');
    }
}
