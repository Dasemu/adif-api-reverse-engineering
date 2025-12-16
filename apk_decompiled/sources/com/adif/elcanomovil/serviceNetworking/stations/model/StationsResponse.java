package com.adif.elcanomovil.serviceNetworking.stations.model;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationsResponse;", "", "token", "", "requestedStationInfoList", "", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/RequestedStationInfoListDTO;", "(Ljava/lang/String;Ljava/util/List;)V", "getRequestedStationInfoList", "()Ljava/util/List;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationsResponse {
    private final List<RequestedStationInfoListDTO> requestedStationInfoList;
    private final String token;

    public StationsResponse(String token, List<RequestedStationInfoListDTO> requestedStationInfoList) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(requestedStationInfoList, "requestedStationInfoList");
        this.token = token;
        this.requestedStationInfoList = requestedStationInfoList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StationsResponse copy$default(StationsResponse stationsResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stationsResponse.token;
        }
        if ((i & 2) != 0) {
            list = stationsResponse.requestedStationInfoList;
        }
        return stationsResponse.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final List<RequestedStationInfoListDTO> component2() {
        return this.requestedStationInfoList;
    }

    public final StationsResponse copy(String token, List<RequestedStationInfoListDTO> requestedStationInfoList) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(requestedStationInfoList, "requestedStationInfoList");
        return new StationsResponse(token, requestedStationInfoList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationsResponse)) {
            return false;
        }
        StationsResponse stationsResponse = (StationsResponse) other;
        return Intrinsics.areEqual(this.token, stationsResponse.token) && Intrinsics.areEqual(this.requestedStationInfoList, stationsResponse.requestedStationInfoList);
    }

    public final List<RequestedStationInfoListDTO> getRequestedStationInfoList() {
        return this.requestedStationInfoList;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.requestedStationInfoList.hashCode() + (this.token.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StationsResponse(token=");
        sb.append(this.token);
        sb.append(", requestedStationInfoList=");
        return a.o(sb, this.requestedStationInfoList, ')');
    }
}
