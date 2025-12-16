package com.adif.elcanomovil.serviceNetworking.stations.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/model/RequestedStationInfoListDTO;", "", "stationInfo", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationInfoDTO;", "(Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationInfoDTO;)V", "getStationInfo", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationInfoDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RequestedStationInfoListDTO {
    private final StationInfoDTO stationInfo;

    public RequestedStationInfoListDTO(StationInfoDTO stationInfo) {
        Intrinsics.checkNotNullParameter(stationInfo, "stationInfo");
        this.stationInfo = stationInfo;
    }

    public static /* synthetic */ RequestedStationInfoListDTO copy$default(RequestedStationInfoListDTO requestedStationInfoListDTO, StationInfoDTO stationInfoDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            stationInfoDTO = requestedStationInfoListDTO.stationInfo;
        }
        return requestedStationInfoListDTO.copy(stationInfoDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final StationInfoDTO getStationInfo() {
        return this.stationInfo;
    }

    public final RequestedStationInfoListDTO copy(StationInfoDTO stationInfo) {
        Intrinsics.checkNotNullParameter(stationInfo, "stationInfo");
        return new RequestedStationInfoListDTO(stationInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestedStationInfoListDTO) && Intrinsics.areEqual(this.stationInfo, ((RequestedStationInfoListDTO) other).stationInfo);
    }

    public final StationInfoDTO getStationInfo() {
        return this.stationInfo;
    }

    public int hashCode() {
        return this.stationInfo.hashCode();
    }

    public String toString() {
        return "RequestedStationInfoListDTO(stationInfo=" + this.stationInfo + ')';
    }
}
