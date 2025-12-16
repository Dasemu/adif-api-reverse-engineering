package com.adif.elcanomovil.domain.entities.station;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0016Jn\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u000bHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/station/Station;", "", "stationCode", "", "stationType", "longName", "shortName", "commercialZoneType", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "", "commuterNetwork", "distance", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/location/Location;ILjava/lang/String;Ljava/lang/Float;)V", "getCommercialZoneType", "()Ljava/lang/String;", "getCommuterNetwork", "setCommuterNetwork", "(Ljava/lang/String;)V", "getDistance", "()Ljava/lang/Float;", "setDistance", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "duration", "getDuration", "getLocation", "()Landroid/location/Location;", "getLongName", "getShortName", "getStationCode", "getStationType", "getTrafficType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/location/Location;ILjava/lang/String;Ljava/lang/Float;)Lcom/adif/elcanomovil/domain/entities/station/Station;", "equals", "", "other", "hashCode", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Station.kt\ncom/adif/elcanomovil/domain/entities/station/Station\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class Station {
    private final String commercialZoneType;
    private String commuterNetwork;
    private Float distance;
    private final android.location.Location location;
    private final String longName;
    private final String shortName;
    private final String stationCode;
    private final String stationType;
    private final int trafficType;

    public Station(String stationCode, String stationType, String longName, String shortName, String str, android.location.Location location, int i, String commuterNetwork, Float f2) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(stationType, "stationType");
        Intrinsics.checkNotNullParameter(longName, "longName");
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        Intrinsics.checkNotNullParameter(commuterNetwork, "commuterNetwork");
        this.stationCode = stationCode;
        this.stationType = stationType;
        this.longName = longName;
        this.shortName = shortName;
        this.commercialZoneType = str;
        this.location = location;
        this.trafficType = i;
        this.commuterNetwork = commuterNetwork;
        this.distance = f2;
    }

    public static /* synthetic */ Station copy$default(Station station, String str, String str2, String str3, String str4, String str5, android.location.Location location, int i, String str6, Float f2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = station.stationCode;
        }
        if ((i4 & 2) != 0) {
            str2 = station.stationType;
        }
        if ((i4 & 4) != 0) {
            str3 = station.longName;
        }
        if ((i4 & 8) != 0) {
            str4 = station.shortName;
        }
        if ((i4 & 16) != 0) {
            str5 = station.commercialZoneType;
        }
        if ((i4 & 32) != 0) {
            location = station.location;
        }
        if ((i4 & 64) != 0) {
            i = station.trafficType;
        }
        if ((i4 & 128) != 0) {
            str6 = station.commuterNetwork;
        }
        if ((i4 & 256) != 0) {
            f2 = station.distance;
        }
        String str7 = str6;
        Float f4 = f2;
        android.location.Location location2 = location;
        int i5 = i;
        String str8 = str5;
        String str9 = str3;
        return station.copy(str, str2, str9, str4, str8, location2, i5, str7, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
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
    public final String getCommercialZoneType() {
        return this.commercialZoneType;
    }

    /* renamed from: component6, reason: from getter */
    public final android.location.Location getLocation() {
        return this.location;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTrafficType() {
        return this.trafficType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCommuterNetwork() {
        return this.commuterNetwork;
    }

    /* renamed from: component9, reason: from getter */
    public final Float getDistance() {
        return this.distance;
    }

    public final Station copy(String stationCode, String stationType, String longName, String shortName, String commercialZoneType, android.location.Location location, int trafficType, String commuterNetwork, Float distance) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(stationType, "stationType");
        Intrinsics.checkNotNullParameter(longName, "longName");
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        Intrinsics.checkNotNullParameter(commuterNetwork, "commuterNetwork");
        return new Station(stationCode, stationType, longName, shortName, commercialZoneType, location, trafficType, commuterNetwork, distance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Station)) {
            return false;
        }
        Station station = (Station) other;
        return Intrinsics.areEqual(this.stationCode, station.stationCode) && Intrinsics.areEqual(this.stationType, station.stationType) && Intrinsics.areEqual(this.longName, station.longName) && Intrinsics.areEqual(this.shortName, station.shortName) && Intrinsics.areEqual(this.commercialZoneType, station.commercialZoneType) && Intrinsics.areEqual(this.location, station.location) && this.trafficType == station.trafficType && Intrinsics.areEqual(this.commuterNetwork, station.commuterNetwork) && Intrinsics.areEqual((Object) this.distance, (Object) station.distance);
    }

    public final String getCommercialZoneType() {
        return this.commercialZoneType;
    }

    public final String getCommuterNetwork() {
        return this.commuterNetwork;
    }

    public final Float getDistance() {
        return this.distance;
    }

    public final Float getDuration() {
        Float f2 = this.distance;
        if (f2 != null) {
            return Float.valueOf(f2.floatValue() / 1.4f);
        }
        return null;
    }

    public final android.location.Location getLocation() {
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

    public final int getTrafficType() {
        return this.trafficType;
    }

    public int hashCode() {
        int d4 = a.d(this.shortName, a.d(this.longName, a.d(this.stationType, this.stationCode.hashCode() * 31, 31), 31), 31);
        String str = this.commercialZoneType;
        int hashCode = (d4 + (str == null ? 0 : str.hashCode())) * 31;
        android.location.Location location = this.location;
        int d5 = a.d(this.commuterNetwork, w.x(this.trafficType, (hashCode + (location == null ? 0 : location.hashCode())) * 31, 31), 31);
        Float f2 = this.distance;
        return d5 + (f2 != null ? f2.hashCode() : 0);
    }

    public final void setCommuterNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.commuterNetwork = str;
    }

    public final void setDistance(Float f2) {
        this.distance = f2;
    }

    public String toString() {
        return "Station(stationCode=" + this.stationCode + ", stationType=" + this.stationType + ", longName=" + this.longName + ", shortName=" + this.shortName + ", commercialZoneType=" + this.commercialZoneType + ", location=" + this.location + ", trafficType=" + this.trafficType + ", commuterNetwork=" + this.commuterNetwork + ", distance=" + this.distance + ')';
    }

    public /* synthetic */ Station(String str, String str2, String str3, String str4, String str5, android.location.Location location, int i, String str6, Float f2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, location, i, str6, (i4 & 256) != 0 ? null : f2);
    }
}
