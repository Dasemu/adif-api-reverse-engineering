package com.adif.elcanomovil.domain.entities;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/ComercialPathKey;", "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getCommercialNumber", "()Ljava/lang/String;", "getDestinationStationCode", "getLaunchingDate", "()J", "getOriginStationCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ComercialPathKey {
    private final String commercialNumber;
    private final String destinationStationCode;
    private final long launchingDate;
    private final String originStationCode;

    public ComercialPathKey(String commercialNumber, long j4, String originStationCode, String destinationStationCode) {
        Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
        Intrinsics.checkNotNullParameter(originStationCode, "originStationCode");
        Intrinsics.checkNotNullParameter(destinationStationCode, "destinationStationCode");
        this.commercialNumber = commercialNumber;
        this.launchingDate = j4;
        this.originStationCode = originStationCode;
        this.destinationStationCode = destinationStationCode;
    }

    public static /* synthetic */ ComercialPathKey copy$default(ComercialPathKey comercialPathKey, String str, long j4, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comercialPathKey.commercialNumber;
        }
        if ((i & 2) != 0) {
            j4 = comercialPathKey.launchingDate;
        }
        if ((i & 4) != 0) {
            str2 = comercialPathKey.originStationCode;
        }
        if ((i & 8) != 0) {
            str3 = comercialPathKey.destinationStationCode;
        }
        return comercialPathKey.copy(str, j4, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLaunchingDate() {
        return this.launchingDate;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOriginStationCode() {
        return this.originStationCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    public final ComercialPathKey copy(String commercialNumber, long launchingDate, String originStationCode, String destinationStationCode) {
        Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
        Intrinsics.checkNotNullParameter(originStationCode, "originStationCode");
        Intrinsics.checkNotNullParameter(destinationStationCode, "destinationStationCode");
        return new ComercialPathKey(commercialNumber, launchingDate, originStationCode, destinationStationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComercialPathKey)) {
            return false;
        }
        ComercialPathKey comercialPathKey = (ComercialPathKey) other;
        return Intrinsics.areEqual(this.commercialNumber, comercialPathKey.commercialNumber) && this.launchingDate == comercialPathKey.launchingDate && Intrinsics.areEqual(this.originStationCode, comercialPathKey.originStationCode) && Intrinsics.areEqual(this.destinationStationCode, comercialPathKey.destinationStationCode);
    }

    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    public final String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    public final long getLaunchingDate() {
        return this.launchingDate;
    }

    public final String getOriginStationCode() {
        return this.originStationCode;
    }

    public int hashCode() {
        return this.destinationStationCode.hashCode() + a.d(this.originStationCode, a.b(this.launchingDate, this.commercialNumber.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ComercialPathKey(commercialNumber=");
        sb.append(this.commercialNumber);
        sb.append(", launchingDate=");
        sb.append(this.launchingDate);
        sb.append(", originStationCode=");
        sb.append(this.originStationCode);
        sb.append(", destinationStationCode=");
        return a.n(sb, this.destinationStationCode, ')');
    }
}
