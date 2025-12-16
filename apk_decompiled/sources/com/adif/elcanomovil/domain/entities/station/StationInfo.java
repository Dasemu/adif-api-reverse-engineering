package com.adif.elcanomovil.domain.entities.station;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J«\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00066"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/station/StationInfo;", "", "stationCode", "", "stationType", "longName", "shortName", "akaList", "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "lines", "commercialZoneType", "commuterNetwork", "accessible", "Lcom/adif/elcanomovil/domain/entities/station/Accessible;", "description", FirebaseAnalytics.Param.LOCATION, "Lcom/adif/elcanomovil/domain/entities/station/Location;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/station/Accessible;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/station/Location;)V", "getAccessible", "()Lcom/adif/elcanomovil/domain/entities/station/Accessible;", "getAkaList", "()Ljava/util/List;", "getCommercialZoneType", "()Ljava/lang/String;", "getCommuterNetwork", "getDescription", "getLines", "getLocation", "()Lcom/adif/elcanomovil/domain/entities/station/Location;", "getLongName", "getShortName", "getStationCode", "getStationType", "getTrafficType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationInfo {
    private final Accessible accessible;
    private final List<String> akaList;
    private final String commercialZoneType;
    private final String commuterNetwork;
    private final String description;
    private final List<String> lines;
    private final Location location;
    private final String longName;
    private final String shortName;
    private final String stationCode;
    private final String stationType;
    private final List<String> trafficType;

    public StationInfo(String str, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3, String str5, String str6, Accessible accessible, String str7, Location location) {
        this.stationCode = str;
        this.stationType = str2;
        this.longName = str3;
        this.shortName = str4;
        this.akaList = list;
        this.trafficType = list2;
        this.lines = list3;
        this.commercialZoneType = str5;
        this.commuterNetwork = str6;
        this.accessible = accessible;
        this.description = str7;
        this.location = location;
    }

    public static /* synthetic */ StationInfo copy$default(StationInfo stationInfo, String str, String str2, String str3, String str4, List list, List list2, List list3, String str5, String str6, Accessible accessible, String str7, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stationInfo.stationCode;
        }
        if ((i & 2) != 0) {
            str2 = stationInfo.stationType;
        }
        if ((i & 4) != 0) {
            str3 = stationInfo.longName;
        }
        if ((i & 8) != 0) {
            str4 = stationInfo.shortName;
        }
        if ((i & 16) != 0) {
            list = stationInfo.akaList;
        }
        if ((i & 32) != 0) {
            list2 = stationInfo.trafficType;
        }
        if ((i & 64) != 0) {
            list3 = stationInfo.lines;
        }
        if ((i & 128) != 0) {
            str5 = stationInfo.commercialZoneType;
        }
        if ((i & 256) != 0) {
            str6 = stationInfo.commuterNetwork;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            accessible = stationInfo.accessible;
        }
        if ((i & 1024) != 0) {
            str7 = stationInfo.description;
        }
        if ((i & 2048) != 0) {
            location = stationInfo.location;
        }
        String str8 = str7;
        Location location2 = location;
        String str9 = str6;
        Accessible accessible2 = accessible;
        List list4 = list3;
        String str10 = str5;
        List list5 = list;
        List list6 = list2;
        return stationInfo.copy(str, str2, str3, str4, list5, list6, list4, str10, str9, accessible2, str8, location2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component10, reason: from getter */
    public final Accessible getAccessible() {
        return this.accessible;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component12, reason: from getter */
    public final Location getLocation() {
        return this.location;
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

    public final List<String> component5() {
        return this.akaList;
    }

    public final List<String> component6() {
        return this.trafficType;
    }

    public final List<String> component7() {
        return this.lines;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCommercialZoneType() {
        return this.commercialZoneType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCommuterNetwork() {
        return this.commuterNetwork;
    }

    public final StationInfo copy(String stationCode, String stationType, String longName, String shortName, List<String> akaList, List<String> trafficType, List<String> lines, String commercialZoneType, String commuterNetwork, Accessible accessible, String description, Location location) {
        return new StationInfo(stationCode, stationType, longName, shortName, akaList, trafficType, lines, commercialZoneType, commuterNetwork, accessible, description, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationInfo)) {
            return false;
        }
        StationInfo stationInfo = (StationInfo) other;
        return Intrinsics.areEqual(this.stationCode, stationInfo.stationCode) && Intrinsics.areEqual(this.stationType, stationInfo.stationType) && Intrinsics.areEqual(this.longName, stationInfo.longName) && Intrinsics.areEqual(this.shortName, stationInfo.shortName) && Intrinsics.areEqual(this.akaList, stationInfo.akaList) && Intrinsics.areEqual(this.trafficType, stationInfo.trafficType) && Intrinsics.areEqual(this.lines, stationInfo.lines) && Intrinsics.areEqual(this.commercialZoneType, stationInfo.commercialZoneType) && Intrinsics.areEqual(this.commuterNetwork, stationInfo.commuterNetwork) && Intrinsics.areEqual(this.accessible, stationInfo.accessible) && Intrinsics.areEqual(this.description, stationInfo.description) && Intrinsics.areEqual(this.location, stationInfo.location);
    }

    public final Accessible getAccessible() {
        return this.accessible;
    }

    public final List<String> getAkaList() {
        return this.akaList;
    }

    public final String getCommercialZoneType() {
        return this.commercialZoneType;
    }

    public final String getCommuterNetwork() {
        return this.commuterNetwork;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getLines() {
        return this.lines;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final String getLongName() {
        return this.longName;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final String getStationType() {
        return this.stationType;
    }

    public final List<String> getTrafficType() {
        return this.trafficType;
    }

    public int hashCode() {
        String str = this.stationCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stationType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.longName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shortName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.akaList;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.trafficType;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.lines;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str5 = this.commercialZoneType;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.commuterNetwork;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Accessible accessible = this.accessible;
        int hashCode10 = (hashCode9 + (accessible == null ? 0 : accessible.hashCode())) * 31;
        String str7 = this.description;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Location location = this.location;
        return hashCode11 + (location != null ? location.hashCode() : 0);
    }

    public String toString() {
        return "StationInfo(stationCode=" + this.stationCode + ", stationType=" + this.stationType + ", longName=" + this.longName + ", shortName=" + this.shortName + ", akaList=" + this.akaList + ", trafficType=" + this.trafficType + ", lines=" + this.lines + ", commercialZoneType=" + this.commercialZoneType + ", commuterNetwork=" + this.commuterNetwork + ", accessible=" + this.accessible + ", description=" + this.description + ", location=" + this.location + ')';
    }
}
