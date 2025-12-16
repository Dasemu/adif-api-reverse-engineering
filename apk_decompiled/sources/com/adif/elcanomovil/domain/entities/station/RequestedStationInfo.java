package com.adif.elcanomovil.domain.entities.station;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;


@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u007f\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018¨\u0006/"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/station/RequestedStationInfo;", "", "stationCode", "", "stationInfo", "Lcom/adif/elcanomovil/domain/entities/station/StationInfo;", "extendedStationInfo", "Lcom/adif/elcanomovil/domain/entities/station/ExtendedStationInfo;", "stationServices", "", "Lcom/adif/elcanomovil/domain/entities/station/StationServices;", "stationTransportServices", "Lcom/adif/elcanomovil/domain/entities/station/StationTransportServices;", "stationCommercialServices", "Lcom/adif/elcanomovil/domain/entities/station/StationCommercialServices;", "stationActivities", "banner", "Lcom/adif/elcanomovil/domain/entities/station/Banner;", "(Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/station/StationInfo;Lcom/adif/elcanomovil/domain/entities/station/ExtendedStationInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/adif/elcanomovil/domain/entities/station/Banner;)V", "getBanner", "()Lcom/adif/elcanomovil/domain/entities/station/Banner;", "getExtendedStationInfo", "()Lcom/adif/elcanomovil/domain/entities/station/ExtendedStationInfo;", "getStationActivities", "()Ljava/util/List;", "getStationCode", "()Ljava/lang/String;", "getStationCommercialServices", "getStationInfo", "()Lcom/adif/elcanomovil/domain/entities/station/StationInfo;", "getStationServices", "getStationTransportServices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RequestedStationInfo {
    private final Banner banner;StationService
    private final ExtendedStationInfo extendedStationInfo;
    private final List<StationCommercialServices> stationActivities;
    private final String stationCode;
    private final List<StationCommercialServices> stationCommercialServices;
    private final StationInfo stationInfo;
    private final List<StationServices> stationServices;
    private final List<StationTransportServices> stationTransportServices;

    public RequestedStationInfo(String stationCode, StationInfo stationInfo, ExtendedStationInfo extendedStationInfo, List<StationServices> list, List<StationTransportServices> list2, List<StationCommercialServices> list3, List<StationCommercialServices> list4, Banner banner) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        this.stationCode = stationCode;
        this.stationInfo = stationInfo;
        this.extendedStationInfo = extendedStationInfo;
        this.stationServices = list;
        this.stationTransportServices = list2;
        this.stationCommercialServices = list3;
        this.stationActivities = list4;
        this.banner = banner;
    }

    public static /* synthetic */ RequestedStationInfo copy$default(RequestedStationInfo requestedStationInfo, String str, StationInfo stationInfo, ExtendedStationInfo extendedStationInfo, List list, List list2, List list3, List list4, Banner banner, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestedStationInfo.stationCode;
        }
        if ((i & 2) != 0) {
            stationInfo = requestedStationInfo.stationInfo;
        }
        if ((i & 4) != 0) {
            extendedStationInfo = requestedStationInfo.extendedStationInfo;
        }
        if ((i & 8) != 0) {
            list = requestedStationInfo.stationServices;
        }
        if ((i & 16) != 0) {
            list2 = requestedStationInfo.stationTransportServices;
        }
        if ((i & 32) != 0) {
            list3 = requestedStationInfo.stationCommercialServices;
        }
        if ((i & 64) != 0) {
            list4 = requestedStationInfo.stationActivities;
        }
        if ((i & 128) != 0) {
            banner = requestedStationInfo.banner;
        }
        List list5 = list4;
        Banner banner2 = banner;
        List list6 = list2;
        List list7 = list3;
        return requestedStationInfo.copy(str, stationInfo, extendedStationInfo, list, list6, list7, list5, banner2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final StationInfo getStationInfo() {
        return this.stationInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final ExtendedStationInfo getExtendedStationInfo() {
        return this.extendedStationInfo;
    }

    public final List<StationServices> component4() {
        return this.stationServices;
    }

    public final List<StationTransportServices> component5() {
        return this.stationTransportServices;
    }

    public final List<StationCommercialServices> component6() {
        return this.stationCommercialServices;
    }

    public final List<StationCommercialServices> component7() {
        return this.stationActivities;
    }

    /* renamed from: component8, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    public final RequestedStationInfo copy(String stationCode, StationInfo stationInfo, ExtendedStationInfo extendedStationInfo, List<StationServices> stationServices, List<StationTransportServices> stationTransportServices, List<StationCommercialServices> stationCommercialServices, List<StationCommercialServices> stationActivities, Banner banner) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        return new RequestedStationInfo(stationCode, stationInfo, extendedStationInfo, stationServices, stationTransportServices, stationCommercialServices, stationActivities, banner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestedStationInfo)) {
            return false;
        }
        RequestedStationInfo requestedStationInfo = (RequestedStationInfo) other;
        return Intrinsics.areEqual(this.stationCode, requestedStationInfo.stationCode) && Intrinsics.areEqual(this.stationInfo, requestedStationInfo.stationInfo) && Intrinsics.areEqual(this.extendedStationInfo, requestedStationInfo.extendedStationInfo) && Intrinsics.areEqual(this.stationServices, requestedStationInfo.stationServices) && Intrinsics.areEqual(this.stationTransportServices, requestedStationInfo.stationTransportServices) && Intrinsics.areEqual(this.stationCommercialServices, requestedStationInfo.stationCommercialServices) && Intrinsics.areEqual(this.stationActivities, requestedStationInfo.stationActivities) && Intrinsics.areEqual(this.banner, requestedStationInfo.banner);
    }

    public final Banner getBanner() {
        return this.banner;
    }

    public final ExtendedStationInfo getExtendedStationInfo() {
        return this.extendedStationInfo;
    }

    public final List<StationCommercialServices> getStationActivities() {
        return this.stationActivities;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final List<StationCommercialServices> getStationCommercialServices() {
        return this.stationCommercialServices;
    }

    public final StationInfo getStationInfo() {
        return this.stationInfo;
    }

    public final List<StationServices> getStationServices() {
        return this.stationServices;
    }

    public final List<StationTransportServices> getStationTransportServices() {
        return this.stationTransportServices;
    }

    public int hashCode() {
        int hashCode = this.stationCode.hashCode() * 31;
        StationInfo stationInfo = this.stationInfo;
        int hashCode2 = (hashCode + (stationInfo == null ? 0 : stationInfo.hashCode())) * 31;
        ExtendedStationInfo extendedStationInfo = this.extendedStationInfo;
        int hashCode3 = (hashCode2 + (extendedStationInfo == null ? 0 : extendedStationInfo.hashCode())) * 31;
        List<StationServices> list = this.stationServices;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<StationTransportServices> list2 = this.stationTransportServices;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StationCommercialServices> list3 = this.stationCommercialServices;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<StationCommercialServices> list4 = this.stationActivities;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Banner banner = this.banner;
        return hashCode7 + (banner != null ? banner.hashCode() : 0);
    }

    public String toString() {
        return "RequestedStationInfo(stationCode=" + this.stationCode + ", stationInfo=" + this.stationInfo + ", extendedStationInfo=" + this.extendedStationInfo + ", stationServices=" + this.stationServices + ", stationTransportServices=" + this.stationTransportServices + ", stationCommercialServices=" + this.stationCommercialServices + ", stationActivities=" + this.stationActivities + ", banner=" + this.banner + ')';
    }
}
