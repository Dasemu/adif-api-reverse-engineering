package com.adif.elcanomovil.uiStations.entities;

import C.w;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0013J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J«\u0001\u00100\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00101\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u000eHÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u00066"}, d2 = {"Lcom/adif/elcanomovil/uiStations/entities/ServicesTabViewData;", "", "ecomile", "", "Lcom/adif/elcanomovil/uiStations/entities/Services;", "intermodality", "accessibility", "stationServices", "stationMarker", "Lcom/adif/elcanomovil/uiStations/entities/StationMarker;", "isFavourite", "", "isAvisaStation", "openingHours", "", FirebaseAnalytics.Param.LOCATION, "bannerURI", "bannerTitle", "bannerDescription", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/adif/elcanomovil/uiStations/entities/StationMarker;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessibility", "()Ljava/util/List;", "getBannerDescription", "()Ljava/lang/String;", "getBannerTitle", "getBannerURI", "getEcomile", "getIntermodality", "()Z", "setFavourite", "(Z)V", "getLocation", "getOpeningHours", "getStationMarker", "()Lcom/adif/elcanomovil/uiStations/entities/StationMarker;", "getStationServices", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ServicesTabViewData {
    private final List<Services> accessibility;
    private final String bannerDescription;
    private final String bannerTitle;
    private final String bannerURI;
    private final List<Services> ecomile;
    private final List<Services> intermodality;
    private final boolean isAvisaStation;
    private boolean isFavourite;
    private final String location;
    private final String openingHours;
    private final StationMarker stationMarker;
    private final List<Services> stationServices;

    public ServicesTabViewData(List<Services> list, List<Services> list2, List<Services> list3, List<Services> list4, StationMarker stationMarker, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(stationMarker, "stationMarker");
        this.ecomile = list;
        this.intermodality = list2;
        this.accessibility = list3;
        this.stationServices = list4;
        this.stationMarker = stationMarker;
        this.isFavourite = z3;
        this.isAvisaStation = z4;
        this.openingHours = str;
        this.location = str2;
        this.bannerURI = str3;
        this.bannerTitle = str4;
        this.bannerDescription = str5;
    }

    public static /* synthetic */ ServicesTabViewData copy$default(ServicesTabViewData servicesTabViewData, List list, List list2, List list3, List list4, StationMarker stationMarker, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = servicesTabViewData.ecomile;
        }
        if ((i & 2) != 0) {
            list2 = servicesTabViewData.intermodality;
        }
        if ((i & 4) != 0) {
            list3 = servicesTabViewData.accessibility;
        }
        if ((i & 8) != 0) {
            list4 = servicesTabViewData.stationServices;
        }
        if ((i & 16) != 0) {
            stationMarker = servicesTabViewData.stationMarker;
        }
        if ((i & 32) != 0) {
            z3 = servicesTabViewData.isFavourite;
        }
        if ((i & 64) != 0) {
            z4 = servicesTabViewData.isAvisaStation;
        }
        if ((i & 128) != 0) {
            str = servicesTabViewData.openingHours;
        }
        if ((i & 256) != 0) {
            str2 = servicesTabViewData.location;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            str3 = servicesTabViewData.bannerURI;
        }
        if ((i & 1024) != 0) {
            str4 = servicesTabViewData.bannerTitle;
        }
        if ((i & 2048) != 0) {
            str5 = servicesTabViewData.bannerDescription;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        boolean z5 = z4;
        String str10 = str;
        StationMarker stationMarker2 = stationMarker;
        boolean z6 = z3;
        return servicesTabViewData.copy(list, list2, list3, list4, stationMarker2, z6, z5, str10, str8, str9, str6, str7);
    }

    public final List<Services> component1() {
        return this.ecomile;
    }

    /* renamed from: component10, reason: from getter */
    public final String getBannerURI() {
        return this.bannerURI;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    /* renamed from: component12, reason: from getter */
    public final String getBannerDescription() {
        return this.bannerDescription;
    }

    public final List<Services> component2() {
        return this.intermodality;
    }

    public final List<Services> component3() {
        return this.accessibility;
    }

    public final List<Services> component4() {
        return this.stationServices;
    }

    /* renamed from: component5, reason: from getter */
    public final StationMarker getStationMarker() {
        return this.stationMarker;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsFavourite() {
        return this.isFavourite;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsAvisaStation() {
        return this.isAvisaStation;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOpeningHours() {
        return this.openingHours;
    }

    /* renamed from: component9, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final ServicesTabViewData copy(List<Services> ecomile, List<Services> intermodality, List<Services> accessibility, List<Services> stationServices, StationMarker stationMarker, boolean isFavourite, boolean isAvisaStation, String openingHours, String location, String bannerURI, String bannerTitle, String bannerDescription) {
        Intrinsics.checkNotNullParameter(stationMarker, "stationMarker");
        return new ServicesTabViewData(ecomile, intermodality, accessibility, stationServices, stationMarker, isFavourite, isAvisaStation, openingHours, location, bannerURI, bannerTitle, bannerDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicesTabViewData)) {
            return false;
        }
        ServicesTabViewData servicesTabViewData = (ServicesTabViewData) other;
        return Intrinsics.areEqual(this.ecomile, servicesTabViewData.ecomile) && Intrinsics.areEqual(this.intermodality, servicesTabViewData.intermodality) && Intrinsics.areEqual(this.accessibility, servicesTabViewData.accessibility) && Intrinsics.areEqual(this.stationServices, servicesTabViewData.stationServices) && Intrinsics.areEqual(this.stationMarker, servicesTabViewData.stationMarker) && this.isFavourite == servicesTabViewData.isFavourite && this.isAvisaStation == servicesTabViewData.isAvisaStation && Intrinsics.areEqual(this.openingHours, servicesTabViewData.openingHours) && Intrinsics.areEqual(this.location, servicesTabViewData.location) && Intrinsics.areEqual(this.bannerURI, servicesTabViewData.bannerURI) && Intrinsics.areEqual(this.bannerTitle, servicesTabViewData.bannerTitle) && Intrinsics.areEqual(this.bannerDescription, servicesTabViewData.bannerDescription);
    }

    public final List<Services> getAccessibility() {
        return this.accessibility;
    }

    public final String getBannerDescription() {
        return this.bannerDescription;
    }

    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    public final String getBannerURI() {
        return this.bannerURI;
    }

    public final List<Services> getEcomile() {
        return this.ecomile;
    }

    public final List<Services> getIntermodality() {
        return this.intermodality;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getOpeningHours() {
        return this.openingHours;
    }

    public final StationMarker getStationMarker() {
        return this.stationMarker;
    }

    public final List<Services> getStationServices() {
        return this.stationServices;
    }

    public int hashCode() {
        List<Services> list = this.ecomile;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Services> list2 = this.intermodality;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Services> list3 = this.accessibility;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Services> list4 = this.stationServices;
        int c4 = w.c(w.c((this.stationMarker.hashCode() + ((hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31)) * 31, 31, this.isFavourite), 31, this.isAvisaStation);
        String str = this.openingHours;
        int hashCode4 = (c4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.location;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bannerURI;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bannerTitle;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bannerDescription;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isAvisaStation() {
        return this.isAvisaStation;
    }

    public final boolean isFavourite() {
        return this.isFavourite;
    }

    public final void setFavourite(boolean z3) {
        this.isFavourite = z3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ServicesTabViewData(ecomile=");
        sb.append(this.ecomile);
        sb.append(", intermodality=");
        sb.append(this.intermodality);
        sb.append(", accessibility=");
        sb.append(this.accessibility);
        sb.append(", stationServices=");
        sb.append(this.stationServices);
        sb.append(", stationMarker=");
        sb.append(this.stationMarker);
        sb.append(", isFavourite=");
        sb.append(this.isFavourite);
        sb.append(", isAvisaStation=");
        sb.append(this.isAvisaStation);
        sb.append(", openingHours=");
        sb.append(this.openingHours);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", bannerURI=");
        sb.append(this.bannerURI);
        sb.append(", bannerTitle=");
        sb.append(this.bannerTitle);
        sb.append(", bannerDescription=");
        return a.n(sb, this.bannerDescription, ')');
    }
}
