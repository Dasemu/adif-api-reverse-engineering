package com.adif.elcanomovil.serviceNetworking.stations.model;

import C.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/model/DetailedInfoDTO;", "", "extendedStationInfo", "", "stationActivities", "stationBanner", "stationCommercialServices", "stationInfo", "stationServices", "stationTransportServices", "(ZZZZZZZ)V", "getExtendedStationInfo", "()Z", "getStationActivities", "getStationBanner", "getStationCommercialServices", "getStationInfo", "getStationServices", "getStationTransportServices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DetailedInfoDTO {
    private final boolean extendedStationInfo;
    private final boolean stationActivities;
    private final boolean stationBanner;
    private final boolean stationCommercialServices;
    private final boolean stationInfo;
    private final boolean stationServices;
    private final boolean stationTransportServices;

    public DetailedInfoDTO() {
        this(false, false, false, false, false, false, false, WorkQueueKt.MASK, null);
    }

    public static /* synthetic */ DetailedInfoDTO copy$default(DetailedInfoDTO detailedInfoDTO, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = detailedInfoDTO.extendedStationInfo;
        }
        if ((i & 2) != 0) {
            z4 = detailedInfoDTO.stationActivities;
        }
        if ((i & 4) != 0) {
            z5 = detailedInfoDTO.stationBanner;
        }
        if ((i & 8) != 0) {
            z6 = detailedInfoDTO.stationCommercialServices;
        }
        if ((i & 16) != 0) {
            z7 = detailedInfoDTO.stationInfo;
        }
        if ((i & 32) != 0) {
            z8 = detailedInfoDTO.stationServices;
        }
        if ((i & 64) != 0) {
            z9 = detailedInfoDTO.stationTransportServices;
        }
        boolean z10 = z8;
        boolean z11 = z9;
        boolean z12 = z7;
        boolean z13 = z5;
        return detailedInfoDTO.copy(z3, z4, z13, z6, z12, z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getExtendedStationInfo() {
        return this.extendedStationInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getStationActivities() {
        return this.stationActivities;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getStationBanner() {
        return this.stationBanner;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getStationCommercialServices() {
        return this.stationCommercialServices;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getStationInfo() {
        return this.stationInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getStationServices() {
        return this.stationServices;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getStationTransportServices() {
        return this.stationTransportServices;
    }

    public final DetailedInfoDTO copy(boolean extendedStationInfo, boolean stationActivities, boolean stationBanner, boolean stationCommercialServices, boolean stationInfo, boolean stationServices, boolean stationTransportServices) {
        return new DetailedInfoDTO(extendedStationInfo, stationActivities, stationBanner, stationCommercialServices, stationInfo, stationServices, stationTransportServices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailedInfoDTO)) {
            return false;
        }
        DetailedInfoDTO detailedInfoDTO = (DetailedInfoDTO) other;
        return this.extendedStationInfo == detailedInfoDTO.extendedStationInfo && this.stationActivities == detailedInfoDTO.stationActivities && this.stationBanner == detailedInfoDTO.stationBanner && this.stationCommercialServices == detailedInfoDTO.stationCommercialServices && this.stationInfo == detailedInfoDTO.stationInfo && this.stationServices == detailedInfoDTO.stationServices && this.stationTransportServices == detailedInfoDTO.stationTransportServices;
    }

    public final boolean getExtendedStationInfo() {
        return this.extendedStationInfo;
    }

    public final boolean getStationActivities() {
        return this.stationActivities;
    }

    public final boolean getStationBanner() {
        return this.stationBanner;
    }

    public final boolean getStationCommercialServices() {
        return this.stationCommercialServices;
    }

    public final boolean getStationInfo() {
        return this.stationInfo;
    }

    public final boolean getStationServices() {
        return this.stationServices;
    }

    public final boolean getStationTransportServices() {
        return this.stationTransportServices;
    }

    public int hashCode() {
        return Boolean.hashCode(this.stationTransportServices) + w.c(w.c(w.c(w.c(w.c(Boolean.hashCode(this.extendedStationInfo) * 31, 31, this.stationActivities), 31, this.stationBanner), 31, this.stationCommercialServices), 31, this.stationInfo), 31, this.stationServices);
    }

    public String toString() {
        return "DetailedInfoDTO(extendedStationInfo=" + this.extendedStationInfo + ", stationActivities=" + this.stationActivities + ", stationBanner=" + this.stationBanner + ", stationCommercialServices=" + this.stationCommercialServices + ", stationInfo=" + this.stationInfo + ", stationServices=" + this.stationServices + ", stationTransportServices=" + this.stationTransportServices + ')';
    }

    public DetailedInfoDTO(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.extendedStationInfo = z3;
        this.stationActivities = z4;
        this.stationBanner = z5;
        this.stationCommercialServices = z6;
        this.stationInfo = z7;
        this.stationServices = z8;
        this.stationTransportServices = z9;
    }

    public /* synthetic */ DetailedInfoDTO(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z3, (i & 2) != 0 ? true : z4, (i & 4) != 0 ? true : z5, (i & 8) != 0 ? true : z6, (i & 16) != 0 ? true : z7, (i & 32) != 0 ? true : z8, (i & 64) != 0 ? true : z9);
    }
}
