package com.adif.elcanomovil.uiSubscriptions.home;

import C.w;
import android.os.Bundle;
import com.adif.elcanomovil.commonNavGraph.R;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes3.dex */
public final class g implements F {

    /* renamed from: a, reason: collision with root package name */
    public final int f5358a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5359b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5360c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5361d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5362e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5363f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5364g;
    public final boolean h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5365j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5366k = R.id.to_editSubscriptionFragment;

    public g(int i, int i4, String str, String str2, String str3, String str4, String str5, boolean z3, String str6, String str7) {
        this.f5358a = i;
        this.f5359b = i4;
        this.f5360c = str;
        this.f5361d = str2;
        this.f5362e = str3;
        this.f5363f = str4;
        this.f5364g = str5;
        this.h = z3;
        this.i = str6;
        this.f5365j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5358a == gVar.f5358a && this.f5359b == gVar.f5359b && Intrinsics.areEqual(this.f5360c, gVar.f5360c) && Intrinsics.areEqual(this.f5361d, gVar.f5361d) && Intrinsics.areEqual(this.f5362e, gVar.f5362e) && Intrinsics.areEqual(this.f5363f, gVar.f5363f) && Intrinsics.areEqual(this.f5364g, gVar.f5364g) && this.h == gVar.h && Intrinsics.areEqual(this.i, gVar.i) && Intrinsics.areEqual(this.f5365j, gVar.f5365j);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f5366k;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("arg_type_screen", this.f5358a);
        bundle.putInt(NavArguments.ARG_TYPE_SUBSCRIPTION, this.f5359b);
        bundle.putString(NavArguments.ARG_DATA_SUBSCRIPTION, this.f5360c);
        bundle.putString(NavArguments.ARG_TRAIN_CODE_SUBSCRIPTION, this.f5361d);
        bundle.putString(NavArguments.ARG_TRAIN_DATE_SUBSCRIPTION, this.f5362e);
        bundle.putString(NavArguments.ARG_STATION_CODE_SUBSCRIPTION, this.f5363f);
        bundle.putString(NavArguments.ARG_STATION_TO_CODE_SUBSCRIPTION, this.f5364g);
        bundle.putBoolean(NavArguments.ARG_IS_CERCANIAS_SUBSCRIPTION, this.h);
        bundle.putString("arg_operator_train", this.i);
        bundle.putString("arg_commercial_product_train", this.f5365j);
        return bundle;
    }

    public final int hashCode() {
        int x3 = w.x(this.f5359b, Integer.hashCode(this.f5358a) * 31, 31);
        String str = this.f5360c;
        int hashCode = (x3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5361d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5362e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5363f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5364g;
        int c4 = w.c((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.h);
        String str6 = this.i;
        int hashCode5 = (c4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5365j;
        return hashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToEditSubscriptionFragment(argTypeScreen=");
        sb.append(this.f5358a);
        sb.append(", argTypeSubscription=");
        sb.append(this.f5359b);
        sb.append(", argDataSubscription=");
        sb.append(this.f5360c);
        sb.append(", argTrainCodeSubscription=");
        sb.append(this.f5361d);
        sb.append(", argTrainDateSubscription=");
        sb.append(this.f5362e);
        sb.append(", argStationCodeSubscription=");
        sb.append(this.f5363f);
        sb.append(", argStationToCodeSubscription=");
        sb.append(this.f5364g);
        sb.append(", argIsCercaniasSubscription=");
        sb.append(this.h);
        sb.append(", argOperatorTrain=");
        sb.append(this.i);
        sb.append(", argCommercialProductTrain=");
        return com.google.android.gms.measurement.internal.a.n(sb, this.f5365j, ')');
    }
}
