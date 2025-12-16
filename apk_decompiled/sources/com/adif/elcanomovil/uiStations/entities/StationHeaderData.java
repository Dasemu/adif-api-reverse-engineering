package com.adif.elcanomovil.uiStations.entities;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/uiStations/entities/StationHeaderData;", "", "stationCode", "", "stationName", "stationLongName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStationCode", "()Ljava/lang/String;", "getStationLongName", "getStationName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StationHeaderData {
    private final String stationCode;
    private final String stationLongName;
    private final String stationName;

    public StationHeaderData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ StationHeaderData copy$default(StationHeaderData stationHeaderData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stationHeaderData.stationCode;
        }
        if ((i & 2) != 0) {
            str2 = stationHeaderData.stationName;
        }
        if ((i & 4) != 0) {
            str3 = stationHeaderData.stationLongName;
        }
        return stationHeaderData.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStationName() {
        return this.stationName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStationLongName() {
        return this.stationLongName;
    }

    public final StationHeaderData copy(String stationCode, String stationName, String stationLongName) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(stationName, "stationName");
        Intrinsics.checkNotNullParameter(stationLongName, "stationLongName");
        return new StationHeaderData(stationCode, stationName, stationLongName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationHeaderData)) {
            return false;
        }
        StationHeaderData stationHeaderData = (StationHeaderData) other;
        return Intrinsics.areEqual(this.stationCode, stationHeaderData.stationCode) && Intrinsics.areEqual(this.stationName, stationHeaderData.stationName) && Intrinsics.areEqual(this.stationLongName, stationHeaderData.stationLongName);
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final String getStationLongName() {
        return this.stationLongName;
    }

    public final String getStationName() {
        return this.stationName;
    }

    public int hashCode() {
        return this.stationLongName.hashCode() + a.d(this.stationName, this.stationCode.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StationHeaderData(stationCode=");
        sb.append(this.stationCode);
        sb.append(", stationName=");
        sb.append(this.stationName);
        sb.append(", stationLongName=");
        return a.n(sb, this.stationLongName, ')');
    }

    public StationHeaderData(String stationCode, String stationName, String stationLongName) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(stationName, "stationName");
        Intrinsics.checkNotNullParameter(stationLongName, "stationLongName");
        this.stationCode = stationCode;
        this.stationName = stationName;
        this.stationLongName = stationLongName;
    }

    public /* synthetic */ StationHeaderData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
