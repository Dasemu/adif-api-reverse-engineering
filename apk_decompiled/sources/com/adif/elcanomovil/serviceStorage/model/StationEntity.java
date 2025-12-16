package com.adif.elcanomovil.serviceStorage.model;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\u0083\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\rHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00063"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/StationEntity;", "", "stationCode", "", "stationType", "longName", "shortName", "longNameToFind", "shortNameToFind", "latitude", "", "longitude", NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "", "commercialZoneType", "commuterNetwork", "akaName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAkaName", "()Ljava/lang/String;", "getCommercialZoneType", "getCommuterNetwork", "getLatitude", "()D", "getLongName", "getLongNameToFind", "getLongitude", "getShortName", "getShortNameToFind", "getStationCode", "getStationType", "getTrafficType", "()I", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationEntity {
    private final String akaName;
    private final String commercialZoneType;
    private final String commuterNetwork;
    private final double latitude;
    private final String longName;
    private final String longNameToFind;
    private final double longitude;
    private final String shortName;
    private final String shortNameToFind;
    private final String stationCode;
    private final String stationType;
    private final int trafficType;

    public StationEntity(String stationCode, String stationType, String longName, String shortName, String longNameToFind, String shortNameToFind, double d4, double d5, int i, String str, String commuterNetwork, String akaName) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(stationType, "stationType");
        Intrinsics.checkNotNullParameter(longName, "longName");
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        Intrinsics.checkNotNullParameter(longNameToFind, "longNameToFind");
        Intrinsics.checkNotNullParameter(shortNameToFind, "shortNameToFind");
        Intrinsics.checkNotNullParameter(commuterNetwork, "commuterNetwork");
        Intrinsics.checkNotNullParameter(akaName, "akaName");
        this.stationCode = stationCode;
        this.stationType = stationType;
        this.longName = longName;
        this.shortName = shortName;
        this.longNameToFind = longNameToFind;
        this.shortNameToFind = shortNameToFind;
        this.latitude = d4;
        this.longitude = d5;
        this.trafficType = i;
        this.commercialZoneType = str;
        this.commuterNetwork = commuterNetwork;
        this.akaName = akaName;
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCommercialZoneType() {
        return this.commercialZoneType;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCommuterNetwork() {
        return this.commuterNetwork;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAkaName() {
        return this.akaName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStationType() {
        return this.stationType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLongName() {
        return this.longName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLongNameToFind() {
        return this.longNameToFind;
    }

    /* renamed from: component6, reason: from getter */
    public final String getShortNameToFind() {
        return this.shortNameToFind;
    }

    /* renamed from: component7, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component8, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component9, reason: from getter */
    public final int getTrafficType() {
        return this.trafficType;
    }

    public final StationEntity copy(String stationCode, String stationType, String longName, String shortName, String longNameToFind, String shortNameToFind, double latitude, double longitude, int trafficType, String commercialZoneType, String commuterNetwork, String akaName) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(stationType, "stationType");
        Intrinsics.checkNotNullParameter(longName, "longName");
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        Intrinsics.checkNotNullParameter(longNameToFind, "longNameToFind");
        Intrinsics.checkNotNullParameter(shortNameToFind, "shortNameToFind");
        Intrinsics.checkNotNullParameter(commuterNetwork, "commuterNetwork");
        Intrinsics.checkNotNullParameter(akaName, "akaName");
        return new StationEntity(stationCode, stationType, longName, shortName, longNameToFind, shortNameToFind, latitude, longitude, trafficType, commercialZoneType, commuterNetwork, akaName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationEntity)) {
            return false;
        }
        StationEntity stationEntity = (StationEntity) other;
        return Intrinsics.areEqual(this.stationCode, stationEntity.stationCode) && Intrinsics.areEqual(this.stationType, stationEntity.stationType) && Intrinsics.areEqual(this.longName, stationEntity.longName) && Intrinsics.areEqual(this.shortName, stationEntity.shortName) && Intrinsics.areEqual(this.longNameToFind, stationEntity.longNameToFind) && Intrinsics.areEqual(this.shortNameToFind, stationEntity.shortNameToFind) && Double.compare(this.latitude, stationEntity.latitude) == 0 && Double.compare(this.longitude, stationEntity.longitude) == 0 && this.trafficType == stationEntity.trafficType && Intrinsics.areEqual(this.commercialZoneType, stationEntity.commercialZoneType) && Intrinsics.areEqual(this.commuterNetwork, stationEntity.commuterNetwork) && Intrinsics.areEqual(this.akaName, stationEntity.akaName);
    }

    public final String getAkaName() {
        return this.akaName;
    }

    public final String getCommercialZoneType() {
        return this.commercialZoneType;
    }

    public final String getCommuterNetwork() {
        return this.commuterNetwork;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final String getLongName() {
        return this.longName;
    }

    public final String getLongNameToFind() {
        return this.longNameToFind;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getShortNameToFind() {
        return this.shortNameToFind;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final String getStationType() {
        return this.stationType;
    }

    public final int getTrafficType() {
        return this.trafficType;
    }

    public int hashCode() {
        int x3 = w.x(this.trafficType, (Double.hashCode(this.longitude) + ((Double.hashCode(this.latitude) + a.d(this.shortNameToFind, a.d(this.longNameToFind, a.d(this.shortName, a.d(this.longName, a.d(this.stationType, this.stationCode.hashCode() * 31, 31), 31), 31), 31), 31)) * 31)) * 31, 31);
        String str = this.commercialZoneType;
        return this.akaName.hashCode() + a.d(this.commuterNetwork, (x3 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StationEntity(stationCode=");
        sb.append(this.stationCode);
        sb.append(", stationType=");
        sb.append(this.stationType);
        sb.append(", longName=");
        sb.append(this.longName);
        sb.append(", shortName=");
        sb.append(this.shortName);
        sb.append(", longNameToFind=");
        sb.append(this.longNameToFind);
        sb.append(", shortNameToFind=");
        sb.append(this.shortNameToFind);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", trafficType=");
        sb.append(this.trafficType);
        sb.append(", commercialZoneType=");
        sb.append(this.commercialZoneType);
        sb.append(", commuterNetwork=");
        sb.append(this.commuterNetwork);
        sb.append(", akaName=");
        return a.n(sb, this.akaName, ')');
    }
}
