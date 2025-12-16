package com.adif.elcanomovil.uiStations.entities;

import C.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¯\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00066"}, d2 = {"Lcom/adif/elcanomovil/uiStations/entities/Activity;", "", "logo", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "phone", "description", "accessible", "", "paymentWay", "", "offer", "correspondences", "web", FirebaseAnalytics.Param.LOCATION, "accessibleLabel", "openingHours", "androidLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessible", "()Z", "getAccessibleLabel", "()Ljava/lang/String;", "getAndroidLink", "getCorrespondences", "()Ljava/util/List;", "getDescription", "getLocation", "getLogo", "getName", "getOffer", "getOpeningHours", "getPaymentWay", "getPhone", "getWeb", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Activity {
    private final boolean accessible;
    private final String accessibleLabel;
    private final String androidLink;
    private final List<String> correspondences;
    private final String description;
    private final String location;
    private final String logo;
    private final String name;
    private final String offer;
    private final String openingHours;
    private final List<String> paymentWay;
    private final String phone;
    private final String web;

    public Activity(String str, String str2, String str3, String str4, boolean z3, List<String> list, String str5, List<String> list2, String str6, String str7, String str8, String str9, String str10) {
        this.logo = str;
        this.name = str2;
        this.phone = str3;
        this.description = str4;
        this.accessible = z3;
        this.paymentWay = list;
        this.offer = str5;
        this.correspondences = list2;
        this.web = str6;
        this.location = str7;
        this.accessibleLabel = str8;
        this.openingHours = str9;
        this.androidLink = str10;
    }

    public static /* synthetic */ Activity copy$default(Activity activity, String str, String str2, String str3, String str4, boolean z3, List list, String str5, List list2, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activity.logo;
        }
        return activity.copy(str, (i & 2) != 0 ? activity.name : str2, (i & 4) != 0 ? activity.phone : str3, (i & 8) != 0 ? activity.description : str4, (i & 16) != 0 ? activity.accessible : z3, (i & 32) != 0 ? activity.paymentWay : list, (i & 64) != 0 ? activity.offer : str5, (i & 128) != 0 ? activity.correspondences : list2, (i & 256) != 0 ? activity.web : str6, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? activity.location : str7, (i & 1024) != 0 ? activity.accessibleLabel : str8, (i & 2048) != 0 ? activity.openingHours : str9, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? activity.androidLink : str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAccessibleLabel() {
        return this.accessibleLabel;
    }

    /* renamed from: component12, reason: from getter */
    public final String getOpeningHours() {
        return this.openingHours;
    }

    /* renamed from: component13, reason: from getter */
    public final String getAndroidLink() {
        return this.androidLink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAccessible() {
        return this.accessible;
    }

    public final List<String> component6() {
        return this.paymentWay;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOffer() {
        return this.offer;
    }

    public final List<String> component8() {
        return this.correspondences;
    }

    /* renamed from: component9, reason: from getter */
    public final String getWeb() {
        return this.web;
    }

    public final Activity copy(String logo, String name, String phone, String description, boolean accessible, List<String> paymentWay, String offer, List<String> correspondences, String web, String location, String accessibleLabel, String openingHours, String androidLink) {
        return new Activity(logo, name, phone, description, accessible, paymentWay, offer, correspondences, web, location, accessibleLabel, openingHours, androidLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) other;
        return Intrinsics.areEqual(this.logo, activity.logo) && Intrinsics.areEqual(this.name, activity.name) && Intrinsics.areEqual(this.phone, activity.phone) && Intrinsics.areEqual(this.description, activity.description) && this.accessible == activity.accessible && Intrinsics.areEqual(this.paymentWay, activity.paymentWay) && Intrinsics.areEqual(this.offer, activity.offer) && Intrinsics.areEqual(this.correspondences, activity.correspondences) && Intrinsics.areEqual(this.web, activity.web) && Intrinsics.areEqual(this.location, activity.location) && Intrinsics.areEqual(this.accessibleLabel, activity.accessibleLabel) && Intrinsics.areEqual(this.openingHours, activity.openingHours) && Intrinsics.areEqual(this.androidLink, activity.androidLink);
    }

    public final boolean getAccessible() {
        return this.accessible;
    }

    public final String getAccessibleLabel() {
        return this.accessibleLabel;
    }

    public final String getAndroidLink() {
        return this.androidLink;
    }

    public final List<String> getCorrespondences() {
        return this.correspondences;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOffer() {
        return this.offer;
    }

    public final String getOpeningHours() {
        return this.openingHours;
    }

    public final List<String> getPaymentWay() {
        return this.paymentWay;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getWeb() {
        return this.web;
    }

    public int hashCode() {
        String str = this.logo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int c4 = w.c((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.accessible);
        List<String> list = this.paymentWay;
        int hashCode4 = (c4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.offer;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list2 = this.correspondences;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.web;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.location;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.accessibleLabel;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.openingHours;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.androidLink;
        return hashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Activity(logo=");
        sb.append(this.logo);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", accessible=");
        sb.append(this.accessible);
        sb.append(", paymentWay=");
        sb.append(this.paymentWay);
        sb.append(", offer=");
        sb.append(this.offer);
        sb.append(", correspondences=");
        sb.append(this.correspondences);
        sb.append(", web=");
        sb.append(this.web);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", accessibleLabel=");
        sb.append(this.accessibleLabel);
        sb.append(", openingHours=");
        sb.append(this.openingHours);
        sb.append(", androidLink=");
        return a.n(sb, this.androidLink, ')');
    }
}
