package com.adif.elcanomovil.serviceNetworking.stations.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u007f\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018¨\u0006/"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/model/RequestedStationInfoDTO;", "", "stationCode", "", "stationInfo", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationInfoDTO;", "extendedStationInfo", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/ExtendedStationInfoDTO;", "stationServices", "", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationServicesDTO;", "stationTransportServices", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationTransportServicesDTO;", "stationCommercialServices", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationCommercialServicesDTO;", "stationActivities", "banner", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/BannerDTO;", "(Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationInfoDTO;Lcom/adif/elcanomovil/serviceNetworking/stations/model/ExtendedStationInfoDTO;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/adif/elcanomovil/serviceNetworking/stations/model/BannerDTO;)V", "getBanner", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/BannerDTO;", "getExtendedStationInfo", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/ExtendedStationInfoDTO;", "getStationActivities", "()Ljava/util/List;", "getStationCode", "()Ljava/lang/String;", "getStationCommercialServices", "getStationInfo", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationInfoDTO;", "getStationServices", "getStationTransportServices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RequestedStationInfoDTO {
    private final BannerDTO banner;
    private final ExtendedStationInfoDTO extendedStationInfo;
    private final List<StationCommercialServicesDTO> stationActivities;
    private final String stationCode;
    private final List<StationCommercialServicesDTO> stationCommercialServices;
    private final StationInfoDTO stationInfo;
    private final List<StationServicesDTO> stationServices;
    private final List<StationTransportServicesDTO> stationTransportServices;

    public RequestedStationInfoDTO(String stationCode, StationInfoDTO stationInfoDTO, ExtendedStationInfoDTO extendedStationInfoDTO, List<StationServicesDTO> list, List<StationTransportServicesDTO> list2, List<StationCommercialServicesDTO> list3, List<StationCommercialServicesDTO> list4, BannerDTO bannerDTO) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        this.stationCode = stationCode;
        this.stationInfo = stationInfoDTO;
        this.extendedStationInfo = extendedStationInfoDTO;
        this.stationServices = list;
        this.stationTransportServices = list2;
        this.stationCommercialServices = list3;
        this.stationActivities = list4;
        this.banner = bannerDTO;
    }

    public static /* synthetic */ RequestedStationInfoDTO copy$default(RequestedStationInfoDTO requestedStationInfoDTO, String str, StationInfoDTO stationInfoDTO, ExtendedStationInfoDTO extendedStationInfoDTO, List list, List list2, List list3, List list4, BannerDTO bannerDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestedStationInfoDTO.stationCode;
        }
        if ((i & 2) != 0) {
            stationInfoDTO = requestedStationInfoDTO.stationInfo;
        }
        if ((i & 4) != 0) {
            extendedStationInfoDTO = requestedStationInfoDTO.extendedStationInfo;
        }
        if ((i & 8) != 0) {
            list = requestedStationInfoDTO.stationServices;
        }
        if ((i & 16) != 0) {
            list2 = requestedStationInfoDTO.stationTransportServices;
        }
        if ((i & 32) != 0) {
            list3 = requestedStationInfoDTO.stationCommercialServices;
        }
        if ((i & 64) != 0) {
            list4 = requestedStationInfoDTO.stationActivities;
        }
        if ((i & 128) != 0) {
            bannerDTO = requestedStationInfoDTO.banner;
        }
        List list5 = list4;
        BannerDTO bannerDTO2 = bannerDTO;
        List list6 = list2;
        List list7 = list3;
        return requestedStationInfoDTO.copy(str, stationInfoDTO, extendedStationInfoDTO, list, list6, list7, list5, bannerDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final StationInfoDTO getStationInfo() {
        return this.stationInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final ExtendedStationInfoDTO getExtendedStationInfo() {
        return this.extendedStationInfo;
    }

    public final List<StationServicesDTO> component4() {
        return this.stationServices;
    }

    public final List<StationTransportServicesDTO> component5() {
        return this.stationTransportServices;
    }

    public final List<StationCommercialServicesDTO> component6() {
        return this.stationCommercialServices;
    }

    public final List<StationCommercialServicesDTO> component7() {
        return this.stationActivities;
    }

    /* renamed from: component8, reason: from getter */
    public final BannerDTO getBanner() {
        return this.banner;
    }

    public final RequestedStationInfoDTO copy(String stationCode, StationInfoDTO stationInfo, ExtendedStationInfoDTO extendedStationInfo, List<StationServicesDTO> stationServices, List<StationTransportServicesDTO> stationTransportServices, List<StationCommercialServicesDTO> stationCommercialServices, List<StationCommercialServicesDTO> stationActivities, BannerDTO banner) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        return new RequestedStationInfoDTO(stationCode, stationInfo, extendedStationInfo, stationServices, stationTransportServices, stationCommercialServices, stationActivities, banner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestedStationInfoDTO)) {
            return false;
        }
        RequestedStationInfoDTO requestedStationInfoDTO = (RequestedStationInfoDTO) other;
        return Intrinsics.areEqual(this.stationCode, requestedStationInfoDTO.stationCode) && Intrinsics.areEqual(this.stationInfo, requestedStationInfoDTO.stationInfo) && Intrinsics.areEqual(this.extendedStationInfo, requestedStationInfoDTO.extendedStationInfo) && Intrinsics.areEqual(this.stationServices, requestedStationInfoDTO.stationServices) && Intrinsics.areEqual(this.stationTransportServices, requestedStationInfoDTO.stationTransportServices) && Intrinsics.areEqual(this.stationCommercialServices, requestedStationInfoDTO.stationCommercialServices) && Intrinsics.areEqual(this.stationActivities, requestedStationInfoDTO.stationActivities) && Intrinsics.areEqual(this.banner, requestedStationInfoDTO.banner);
    }

    public final BannerDTO getBanner() {
        return this.banner;
    }

    public final ExtendedStationInfoDTO getExtendedStationInfo() {
        return this.extendedStationInfo;
    }

    public final List<StationCommercialServicesDTO> getStationActivities() {
        return this.stationActivities;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final List<StationCommercialServicesDTO> getStationCommercialServices() {
        return this.stationCommercialServices;
    }

    public final StationInfoDTO getStationInfo() {
        return this.stationInfo;
    }

    public final List<StationServicesDTO> getStationServices() {
        return this.stationServices;
    }

    public final List<StationTransportServicesDTO> getStationTransportServices() {
        return this.stationTransportServices;
    }

    public int hashCode() {
        int hashCode = this.stationCode.hashCode() * 31;
        StationInfoDTO stationInfoDTO = this.stationInfo;
        int hashCode2 = (hashCode + (stationInfoDTO == null ? 0 : stationInfoDTO.hashCode())) * 31;
        ExtendedStationInfoDTO extendedStationInfoDTO = this.extendedStationInfo;
        int hashCode3 = (hashCode2 + (extendedStationInfoDTO == null ? 0 : extendedStationInfoDTO.hashCode())) * 31;
        List<StationServicesDTO> list = this.stationServices;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<StationTransportServicesDTO> list2 = this.stationTransportServices;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StationCommercialServicesDTO> list3 = this.stationCommercialServices;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<StationCommercialServicesDTO> list4 = this.stationActivities;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        BannerDTO bannerDTO = this.banner;
        return hashCode7 + (bannerDTO != null ? bannerDTO.hashCode() : 0);
    }

    public String toString() {
        return "RequestedStationInfoDTO(stationCode=" + this.stationCode + ", stationInfo=" + this.stationInfo + ", extendedStationInfo=" + this.extendedStationInfo + ", stationServices=" + this.stationServices + ", stationTransportServices=" + this.stationTransportServices + ", stationCommercialServices=" + this.stationCommercialServices + ", stationActivities=" + this.stationActivities + ", banner=" + this.banner + ')';
    }
}
