package com.adif.elcanomovil.serviceNetworking.circulations.model.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathStepSideInfoDTO;", "", "commercialPathInfo", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO;", "passthroughStep", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO;)V", "getCommercialPathInfo", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO;", "getPassthroughStep", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialPathStepSideInfoDTO {
    private final CommercialPathInfoDTO commercialPathInfo;
    private final PassthroughStepDTO passthroughStep;

    public CommercialPathStepSideInfoDTO(CommercialPathInfoDTO commercialPathInfo, PassthroughStepDTO passthroughStep) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughStep, "passthroughStep");
        this.commercialPathInfo = commercialPathInfo;
        this.passthroughStep = passthroughStep;
    }

    public static /* synthetic */ CommercialPathStepSideInfoDTO copy$default(CommercialPathStepSideInfoDTO commercialPathStepSideInfoDTO, CommercialPathInfoDTO commercialPathInfoDTO, PassthroughStepDTO passthroughStepDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            commercialPathInfoDTO = commercialPathStepSideInfoDTO.commercialPathInfo;
        }
        if ((i & 2) != 0) {
            passthroughStepDTO = commercialPathStepSideInfoDTO.passthroughStep;
        }
        return commercialPathStepSideInfoDTO.copy(commercialPathInfoDTO, passthroughStepDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final CommercialPathInfoDTO getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final PassthroughStepDTO getPassthroughStep() {
        return this.passthroughStep;
    }

    public final CommercialPathStepSideInfoDTO copy(CommercialPathInfoDTO commercialPathInfo, PassthroughStepDTO passthroughStep) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughStep, "passthroughStep");
        return new CommercialPathStepSideInfoDTO(commercialPathInfo, passthroughStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommercialPathStepSideInfoDTO)) {
            return false;
        }
        CommercialPathStepSideInfoDTO commercialPathStepSideInfoDTO = (CommercialPathStepSideInfoDTO) other;
        return Intrinsics.areEqual(this.commercialPathInfo, commercialPathStepSideInfoDTO.commercialPathInfo) && Intrinsics.areEqual(this.passthroughStep, commercialPathStepSideInfoDTO.passthroughStep);
    }

    public final CommercialPathInfoDTO getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    public final PassthroughStepDTO getPassthroughStep() {
        return this.passthroughStep;
    }

    public int hashCode() {
        return this.passthroughStep.hashCode() + (this.commercialPathInfo.hashCode() * 31);
    }

    public String toString() {
        return "CommercialPathStepSideInfoDTO(commercialPathInfo=" + this.commercialPathInfo + ", passthroughStep=" + this.passthroughStep + ')';
    }
}
