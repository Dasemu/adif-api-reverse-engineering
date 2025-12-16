package com.adif.elcanomovil.uiStations.entities;

import C.w;
import com.adif.elcanomovil.domain.entities.station.Location;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÇ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00109\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006>"}, d2 = {"Lcom/adif/elcanomovil/uiStations/entities/Services;", "", "logo", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "phone", "description", "accessible", "", "paymentWay", "", "offerName", "offerDescription", "offerLogo", "correspondences", "web", FirebaseAnalytics.Param.LOCATION, "Lcom/adif/elcanomovil/domain/entities/station/Location;", "accessibleLabel", "openingHours", "androidLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/station/Location;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessible", "()Z", "getAccessibleLabel", "()Ljava/lang/String;", "getAndroidLink", "getCorrespondences", "()Ljava/util/List;", "getDescription", "getLocation", "()Lcom/adif/elcanomovil/domain/entities/station/Location;", "getLogo", "getName", "getOfferDescription", "getOfferLogo", "getOfferName", "getOpeningHours", "getPaymentWay", "getPhone", "getWeb", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Services {
    private final boolean accessible;
    private final String accessibleLabel;
    private final String androidLink;
    private final List<String> correspondences;
    private final String description;
    private final Location location;
    private final String logo;
    private final String name;
    private final String offerDescription;
    private final String offerLogo;
    private final String offerName;
    private final String openingHours;
    private final List<String> paymentWay;
    private final String phone;
    private final String web;

    public Services(String str, String str2, String str3, String str4, boolean z3, List<String> list, String str5, String str6, String str7, List<String> list2, String str8, Location location, String str9, String str10, String str11) {
        this.logo = str;
        this.name = str2;
        this.phone = str3;
        this.description = str4;
        this.accessible = z3;
        this.paymentWay = list;
        this.offerName = str5;
        this.offerDescription = str6;
        this.offerLogo = str7;
        this.correspondences = list2;
        this.web = str8;
        this.location = location;
        this.accessibleLabel = str9;
        this.openingHours = str10;
        this.androidLink = str11;
    }

    /* renamed from: component1, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    public final List<String> component10() {
        return this.correspondences;
    }

    /* renamed from: component11, reason: from getter */
    public final String getWeb() {
        return this.web;
    }

    /* renamed from: component12, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    /* renamed from: component13, reason: from getter */
    public final String getAccessibleLabel() {
        return this.accessibleLabel;
    }

    /* renamed from: component14, reason: from getter */
    public final String getOpeningHours() {
        return this.openingHours;
    }

    /* renamed from: component15, reason: from getter */
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
    public final String getOfferName() {
        return this.offerName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOfferDescription() {
        return this.offerDescription;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOfferLogo() {
        return this.offerLogo;
    }

    public final Services copy(String logo, String name, String phone, String description, boolean accessible, List<String> paymentWay, String offerName, String offerDescription, String offerLogo, List<String> correspondences, String web, Location location, String accessibleLabel, String openingHours, String androidLink) {
        return new Services(logo, name, phone, description, accessible, paymentWay, offerName, offerDescription, offerLogo, correspondences, web, location, accessibleLabel, openingHours, androidLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Services)) {
            return false;
        }
        Services services = (Services) other;
        return Intrinsics.areEqual(this.logo, services.logo) && Intrinsics.areEqual(this.name, services.name) && Intrinsics.areEqual(this.phone, services.phone) && Intrinsics.areEqual(this.description, services.description) && this.accessible == services.accessible && Intrinsics.areEqual(this.paymentWay, services.paymentWay) && Intrinsics.areEqual(this.offerName, services.offerName) && Intrinsics.areEqual(this.offerDescription, services.offerDescription) && Intrinsics.areEqual(this.offerLogo, services.offerLogo) && Intrinsics.areEqual(this.correspondences, services.correspondences) && Intrinsics.areEqual(this.web, services.web) && Intrinsics.areEqual(this.location, services.location) && Intrinsics.areEqual(this.accessibleLabel, services.accessibleLabel) && Intrinsics.areEqual(this.openingHours, services.openingHours) && Intrinsics.areEqual(this.androidLink, services.androidLink);
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

    public final Location getLocation() {
        return this.location;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOfferDescription() {
        return this.offerDescription;
    }

    public final String getOfferLogo() {
        return this.offerLogo;
    }

    public final String getOfferName() {
        return this.offerName;
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
        String str5 = this.offerName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.offerDescription;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offerLogo;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list2 = this.correspondences;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str8 = this.web;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Location location = this.location;
        int hashCode10 = (hashCode9 + (location == null ? 0 : location.hashCode())) * 31;
        String str9 = this.accessibleLabel;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.openingHours;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.androidLink;
        return hashCode12 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Services(logo=");
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
        sb.append(", offerName=");
        sb.append(this.offerName);
        sb.append(", offerDescription=");
        sb.append(this.offerDescription);
        sb.append(", offerLogo=");
        sb.append(this.offerLogo);
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
