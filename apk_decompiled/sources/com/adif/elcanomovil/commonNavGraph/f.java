package com.adif.elcanomovil.commonNavGraph;

import C.w;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class f implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f4424a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4425b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4426c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4427d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4428e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f4429f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4430g;
    public final String[] h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4431j;

    /* renamed from: k, reason: collision with root package name */
    public final String f4432k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4433l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4434m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4435n = R.id.to_stations_alertDialog;

    public f(String str, String str2, String str3, String str4, boolean z3, String[] strArr, String str5, String[] strArr2, String str6, String str7, String str8, String str9, String str10) {
        this.f4424a = str;
        this.f4425b = str2;
        this.f4426c = str3;
        this.f4427d = str4;
        this.f4428e = z3;
        this.f4429f = strArr;
        this.f4430g = str5;
        this.h = strArr2;
        this.i = str6;
        this.f4431j = str7;
        this.f4432k = str8;
        this.f4433l = str9;
        this.f4434m = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f4424a, fVar.f4424a) && Intrinsics.areEqual(this.f4425b, fVar.f4425b) && Intrinsics.areEqual(this.f4426c, fVar.f4426c) && Intrinsics.areEqual(this.f4427d, fVar.f4427d) && this.f4428e == fVar.f4428e && Intrinsics.areEqual(this.f4429f, fVar.f4429f) && Intrinsics.areEqual(this.f4430g, fVar.f4430g) && Intrinsics.areEqual(this.h, fVar.h) && Intrinsics.areEqual(this.i, fVar.i) && Intrinsics.areEqual(this.f4431j, fVar.f4431j) && Intrinsics.areEqual(this.f4432k, fVar.f4432k) && Intrinsics.areEqual(this.f4433l, fVar.f4433l) && Intrinsics.areEqual(this.f4434m, fVar.f4434m);
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4435n;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("logo", this.f4424a);
        bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f4425b);
        bundle.putString("phone", this.f4426c);
        bundle.putString("description", this.f4427d);
        bundle.putBoolean("accessible", this.f4428e);
        bundle.putStringArray("payment_way", this.f4429f);
        bundle.putString("offer", this.f4430g);
        bundle.putStringArray("correspondences", this.h);
        bundle.putString("web", this.i);
        bundle.putString(FirebaseAnalytics.Param.LOCATION, this.f4431j);
        bundle.putString("accessible_label", this.f4432k);
        bundle.putString("opening_hours", this.f4433l);
        bundle.putString("play_store", this.f4434m);
        return bundle;
    }

    public final int hashCode() {
        String str = this.f4424a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f4425b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4426c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f4427d;
        int c4 = w.c((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f4428e);
        String[] strArr = this.f4429f;
        int hashCode4 = (c4 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String str5 = this.f4430g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String[] strArr2 = this.h;
        int hashCode6 = (hashCode5 + (strArr2 == null ? 0 : Arrays.hashCode(strArr2))) * 31;
        String str6 = this.i;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f4431j;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f4432k;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f4433l;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f4434m;
        return hashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToStationsAlertDialog(logo=");
        sb.append(this.f4424a);
        sb.append(", name=");
        sb.append(this.f4425b);
        sb.append(", phone=");
        sb.append(this.f4426c);
        sb.append(", description=");
        sb.append(this.f4427d);
        sb.append(", accessible=");
        sb.append(this.f4428e);
        sb.append(", paymentWay=");
        sb.append(Arrays.toString(this.f4429f));
        sb.append(", offer=");
        sb.append(this.f4430g);
        sb.append(", correspondences=");
        sb.append(Arrays.toString(this.h));
        sb.append(", web=");
        sb.append(this.i);
        sb.append(", location=");
        sb.append(this.f4431j);
        sb.append(", accessibleLabel=");
        sb.append(this.f4432k);
        sb.append(", openingHours=");
        sb.append(this.f4433l);
        sb.append(", playStore=");
        return com.google.android.gms.measurement.internal.a.n(sb, this.f4434m, ')');
    }
}
