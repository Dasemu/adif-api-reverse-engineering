package com.adif.elcanomovil.serviceNetworking.stations.model;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/model/OneStationRequest;", "", "detailedInfo", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/DetailedInfoDTO;", "stationCode", "", "token", "(Lcom/adif/elcanomovil/serviceNetworking/stations/model/DetailedInfoDTO;Ljava/lang/String;Ljava/lang/String;)V", "getDetailedInfo", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/DetailedInfoDTO;", "getStationCode", "()Ljava/lang/String;", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OneStationRequest {
    private final DetailedInfoDTO detailedInfo;
    private final String stationCode;
    private final String token;

    public OneStationRequest(DetailedInfoDTO detailedInfo, String stationCode, String token) {
        Intrinsics.checkNotNullParameter(detailedInfo, "detailedInfo");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(token, "token");
        this.detailedInfo = detailedInfo;
        this.stationCode = stationCode;
        this.token = token;
    }

    public static /* synthetic */ OneStationRequest copy$default(OneStationRequest oneStationRequest, DetailedInfoDTO detailedInfoDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            detailedInfoDTO = oneStationRequest.detailedInfo;
        }
        if ((i & 2) != 0) {
            str = oneStationRequest.stationCode;
        }
        if ((i & 4) != 0) {
            str2 = oneStationRequest.token;
        }
        return oneStationRequest.copy(detailedInfoDTO, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final DetailedInfoDTO getDetailedInfo() {
        return this.detailedInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final OneStationRequest copy(DetailedInfoDTO detailedInfo, String stationCode, String token) {
        Intrinsics.checkNotNullParameter(detailedInfo, "detailedInfo");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(token, "token");
        return new OneStationRequest(detailedInfo, stationCode, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneStationRequest)) {
            return false;
        }
        OneStationRequest oneStationRequest = (OneStationRequest) other;
        return Intrinsics.areEqual(this.detailedInfo, oneStationRequest.detailedInfo) && Intrinsics.areEqual(this.stationCode, oneStationRequest.stationCode) && Intrinsics.areEqual(this.token, oneStationRequest.token);
    }

    public final DetailedInfoDTO getDetailedInfo() {
        return this.detailedInfo;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() + a.d(this.stationCode, this.detailedInfo.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OneStationRequest(detailedInfo=");
        sb.append(this.detailedInfo);
        sb.append(", stationCode=");
        sb.append(this.stationCode);
        sb.append(", token=");
        return a.n(sb, this.token, ')');
    }
}
