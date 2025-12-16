package com.adif.elcanomovil.serviceNetworking.circulations.model.request;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/OneOrSeveralPathsRequest;", "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_ALL_CONTROL_POINTS, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getAllControlPoints", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCommercialNumber", "()Ljava/lang/String;", "getDestinationStationCode", "getLaunchingDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOriginStationCode", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/OneOrSeveralPathsRequest;", "equals", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OneOrSeveralPathsRequest {
    private final Boolean allControlPoints;
    private final String commercialNumber;
    private final String destinationStationCode;
    private final Long launchingDate;
    private final String originStationCode;

    public OneOrSeveralPathsRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OneOrSeveralPathsRequest copy$default(OneOrSeveralPathsRequest oneOrSeveralPathsRequest, Boolean bool, String str, String str2, Long l4, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = oneOrSeveralPathsRequest.allControlPoints;
        }
        if ((i & 2) != 0) {
            str = oneOrSeveralPathsRequest.commercialNumber;
        }
        if ((i & 4) != 0) {
            str2 = oneOrSeveralPathsRequest.destinationStationCode;
        }
        if ((i & 8) != 0) {
            l4 = oneOrSeveralPathsRequest.launchingDate;
        }
        if ((i & 16) != 0) {
            str3 = oneOrSeveralPathsRequest.originStationCode;
        }
        String str4 = str3;
        String str5 = str2;
        return oneOrSeveralPathsRequest.copy(bool, str, str5, l4, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getAllControlPoints() {
        return this.allControlPoints;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getLaunchingDate() {
        return this.launchingDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOriginStationCode() {
        return this.originStationCode;
    }

    public final OneOrSeveralPathsRequest copy(Boolean allControlPoints, String commercialNumber, String destinationStationCode, Long launchingDate, String originStationCode) {
        return new OneOrSeveralPathsRequest(allControlPoints, commercialNumber, destinationStationCode, launchingDate, originStationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneOrSeveralPathsRequest)) {
            return false;
        }
        OneOrSeveralPathsRequest oneOrSeveralPathsRequest = (OneOrSeveralPathsRequest) other;
        return Intrinsics.areEqual(this.allControlPoints, oneOrSeveralPathsRequest.allControlPoints) && Intrinsics.areEqual(this.commercialNumber, oneOrSeveralPathsRequest.commercialNumber) && Intrinsics.areEqual(this.destinationStationCode, oneOrSeveralPathsRequest.destinationStationCode) && Intrinsics.areEqual(this.launchingDate, oneOrSeveralPathsRequest.launchingDate) && Intrinsics.areEqual(this.originStationCode, oneOrSeveralPathsRequest.originStationCode);
    }

    public final Boolean getAllControlPoints() {
        return this.allControlPoints;
    }

    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    public final String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    public final Long getLaunchingDate() {
        return this.launchingDate;
    }

    public final String getOriginStationCode() {
        return this.originStationCode;
    }

    public int hashCode() {
        Boolean bool = this.allControlPoints;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.commercialNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.destinationStationCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l4 = this.launchingDate;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.originStationCode;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OneOrSeveralPathsRequest(allControlPoints=");
        sb.append(this.allControlPoints);
        sb.append(", commercialNumber=");
        sb.append(this.commercialNumber);
        sb.append(", destinationStationCode=");
        sb.append(this.destinationStationCode);
        sb.append(", launchingDate=");
        sb.append(this.launchingDate);
        sb.append(", originStationCode=");
        return a.n(sb, this.originStationCode, ')');
    }

    public OneOrSeveralPathsRequest(Boolean bool, String str, String str2, Long l4, String str3) {
        this.allControlPoints = bool;
        this.commercialNumber = str;
        this.destinationStationCode = str2;
        this.launchingDate = l4;
        this.originStationCode = str3;
    }

    public /* synthetic */ OneOrSeveralPathsRequest(Boolean bool, String str, String str2, Long l4, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l4, (i & 16) != 0 ? null : str3);
    }
}
