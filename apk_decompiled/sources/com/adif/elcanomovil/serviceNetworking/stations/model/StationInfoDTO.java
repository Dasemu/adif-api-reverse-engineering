package com.adif.elcanomovil.serviceNetworking.stations.model;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0011HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009b\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00066"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationInfoDTO;", "", "stationCode", "", "stationType", "longName", "shortName", "akaList", "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "lines", "commercialZoneType", "commuterNetwork", "accessible", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/AccessibleDTO;", "description", FirebaseAnalytics.Param.LOCATION, "Lcom/adif/elcanomovil/serviceNetworking/stations/model/LocationDTO;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/stations/model/AccessibleDTO;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/stations/model/LocationDTO;)V", "getAccessible", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/AccessibleDTO;", "getAkaList", "()Ljava/util/List;", "getCommercialZoneType", "()Ljava/lang/String;", "getCommuterNetwork", "getDescription", "getLines", "getLocation", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/LocationDTO;", "getLongName", "getShortName", "getStationCode", "getStationType", "getTrafficType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationInfoDTO {
    private final AccessibleDTO accessible;
    private final List<String> akaList;
    private final String commercialZoneType;
    private final String commuterNetwork;
    private final String description;
    private final List<String> lines;
    private final LocationDTO location;
    private final String longName;
    private final String shortName;
    private final String stationCode;
    private final String stationType;
    private final List<String> trafficType;

    public StationInfoDTO(String stationCode, String stationType, String longName, String shortName, List<String> akaList, List<String> trafficType, List<String> lines, String str, String str2, AccessibleDTO accessibleDTO, String str3, LocationDTO location) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(stationType, "stationType");
        Intrinsics.checkNotNullParameter(longName, "longName");
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        Intrinsics.checkNotNullParameter(akaList, "akaList");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(location, "location");
        this.stationCode = stationCode;
        this.stationType = stationType;
        this.longName = longName;
        this.shortName = shortName;
        this.akaList = akaList;
        this.trafficType = trafficType;
        this.lines = lines;
        this.commercialZoneType = str;
        this.commuterNetwork = str2;
        this.accessible = accessibleDTO;
        this.description = str3;
        this.location = location;
    }

    public static /* synthetic */ StationInfoDTO copy$default(StationInfoDTO stationInfoDTO, String str, String str2, String str3, String str4, List list, List list2, List list3, String str5, String str6, AccessibleDTO accessibleDTO, String str7, LocationDTO locationDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stationInfoDTO.stationCode;
        }
        if ((i & 2) != 0) {
            str2 = stationInfoDTO.stationType;
        }
        if ((i & 4) != 0) {
            str3 = stationInfoDTO.longName;
        }
        if ((i & 8) != 0) {
            str4 = stationInfoDTO.shortName;
        }
        if ((i & 16) != 0) {
            list = stationInfoDTO.akaList;
        }
        if ((i & 32) != 0) {
            list2 = stationInfoDTO.trafficType;
        }
        if ((i & 64) != 0) {
            list3 = stationInfoDTO.lines;
        }
        if ((i & 128) != 0) {
            str5 = stationInfoDTO.commercialZoneType;
        }
        if ((i & 256) != 0) {
            str6 = stationInfoDTO.commuterNetwork;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            accessibleDTO = stationInfoDTO.accessible;
        }
        if ((i & 1024) != 0) {
            str7 = stationInfoDTO.description;
        }
        if ((i & 2048) != 0) {
            locationDTO = stationInfoDTO.location;
        }
        String str8 = str7;
        LocationDTO locationDTO2 = locationDTO;
        String str9 = str6;
        AccessibleDTO accessibleDTO2 = accessibleDTO;
        List list4 = list3;
        String str10 = str5;
        List list5 = list;
        List list6 = list2;
        return stationInfoDTO.copy(str, str2, str3, str4, list5, list6, list4, str10, str9, accessibleDTO2, str8, locationDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component10, reason: from getter */
    public final AccessibleDTO getAccessible() {
        return this.accessible;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component12, reason: from getter */
    public final LocationDTO getLocation() {
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

    public final StationInfoDTO copy(String stationCode, String stationType, String longName, String shortName, List<String> akaList, List<String> trafficType, List<String> lines, String commercialZoneType, String commuterNetwork, AccessibleDTO accessible, String description, LocationDTO location) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(stationType, "stationType");
        Intrinsics.checkNotNullParameter(longName, "longName");
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        Intrinsics.checkNotNullParameter(akaList, "akaList");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(location, "location");
        return new StationInfoDTO(stationCode, stationType, longName, shortName, akaList, trafficType, lines, commercialZoneType, commuterNetwork, accessible, description, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationInfoDTO)) {
            return false;
        }
        StationInfoDTO stationInfoDTO = (StationInfoDTO) other;
        return Intrinsics.areEqual(this.stationCode, stationInfoDTO.stationCode) && Intrinsics.areEqual(this.stationType, stationInfoDTO.stationType) && Intrinsics.areEqual(this.longName, stationInfoDTO.longName) && Intrinsics.areEqual(this.shortName, stationInfoDTO.shortName) && Intrinsics.areEqual(this.akaList, stationInfoDTO.akaList) && Intrinsics.areEqual(this.trafficType, stationInfoDTO.trafficType) && Intrinsics.areEqual(this.lines, stationInfoDTO.lines) && Intrinsics.areEqual(this.commercialZoneType, stationInfoDTO.commercialZoneType) && Intrinsics.areEqual(this.commuterNetwork, stationInfoDTO.commuterNetwork) && Intrinsics.areEqual(this.accessible, stationInfoDTO.accessible) && Intrinsics.areEqual(this.description, stationInfoDTO.description) && Intrinsics.areEqual(this.location, stationInfoDTO.location);
    }

    public final AccessibleDTO getAccessible() {
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

    public final LocationDTO getLocation() {
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
        int hashCode = (this.lines.hashCode() + ((this.trafficType.hashCode() + ((this.akaList.hashCode() + a.d(this.shortName, a.d(this.longName, a.d(this.stationType, this.stationCode.hashCode() * 31, 31), 31), 31)) * 31)) * 31)) * 31;
        String str = this.commercialZoneType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.commuterNetwork;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AccessibleDTO accessibleDTO = this.accessible;
        int hashCode4 = (hashCode3 + (accessibleDTO == null ? 0 : accessibleDTO.hashCode())) * 31;
        String str3 = this.description;
        return this.location.hashCode() + ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "StationInfoDTO(stationCode=" + this.stationCode + ", stationType=" + this.stationType + ", longName=" + this.longName + ", shortName=" + this.shortName + ", akaList=" + this.akaList + ", trafficType=" + this.trafficType + ", lines=" + this.lines + ", commercialZoneType=" + this.commercialZoneType + ", commuterNetwork=" + this.commuterNetwork + ", accessible=" + this.accessible + ", description=" + this.description + ", location=" + this.location + ')';
    }
}
