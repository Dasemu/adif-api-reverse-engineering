package com.adif.elcanomovil.uiMoreAdif.main;

import android.os.Bundle;
import com.adif.elcanomovil.commonNavGraph.R;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes2.dex */
public final class b implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f5171a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5172b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5173c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5174d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5175e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5176f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5177g;
    public final String h;
    public final int i = R.id.to_trainSituationFragment;

    public b(String str, String str2, String str3, long j4, String str4, String str5, String str6, String str7) {
        this.f5171a = str;
        this.f5172b = str2;
        this.f5173c = str3;
        this.f5174d = j4;
        this.f5175e = str4;
        this.f5176f = str5;
        this.f5177g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f5171a, bVar.f5171a) && Intrinsics.areEqual(this.f5172b, bVar.f5172b) && Intrinsics.areEqual(this.f5173c, bVar.f5173c) && this.f5174d == bVar.f5174d && Intrinsics.areEqual(this.f5175e, bVar.f5175e) && Intrinsics.areEqual(this.f5176f, bVar.f5176f) && Intrinsics.areEqual(this.f5177g, bVar.f5177g) && Intrinsics.areEqual(this.h, bVar.h);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.i;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, this.f5171a);
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, this.f5172b);
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, this.f5173c);
        bundle.putLong(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, this.f5174d);
        bundle.putString("observation", this.f5175e);
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, this.f5176f);
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, this.f5177g);
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM, this.h);
        return bundle;
    }

    public final int hashCode() {
        String str = this.f5171a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5172b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5173c;
        int b4 = com.google.android.gms.measurement.internal.a.b(this.f5174d, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f5175e;
        int hashCode3 = (b4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5176f;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5177g;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        return hashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToTrainSituationFragment(commercialNumber=");
        sb.append(this.f5171a);
        sb.append(", originStationCode=");
        sb.append(this.f5172b);
        sb.append(", destinationStationCode=");
        sb.append(this.f5173c);
        sb.append(", launchingDate=");
        sb.append(this.f5174d);
        sb.append(", observation=");
        sb.append(this.f5175e);
        sb.append(", operator=");
        sb.append(this.f5176f);
        sb.append(", commercialProduct=");
        sb.append(this.f5177g);
        sb.append(", fragmentFrom=");
        return com.google.android.gms.measurement.internal.a.n(sb, this.h, ')');
    }
}
