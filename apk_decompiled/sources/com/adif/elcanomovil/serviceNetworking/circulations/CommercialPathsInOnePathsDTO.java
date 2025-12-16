package com.adif.elcanomovil.serviceNetworking.circulations;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathsInOnePathsDTO;", "", "commercialPathInfo", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO;", "passthroughSteps", "", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO;Ljava/util/List;)V", "getCommercialPathInfo", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO;", "getPassthroughSteps", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialPathsInOnePathsDTO {
    private final com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialPathInfoDTO commercialPathInfo;
    private final List<PassthroughStepDTO> passthroughSteps;

    public CommercialPathsInOnePathsDTO(com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialPathInfoDTO commercialPathInfo, List<PassthroughStepDTO> passthroughSteps) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughSteps, "passthroughSteps");
        this.commercialPathInfo = commercialPathInfo;
        this.passthroughSteps = passthroughSteps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommercialPathsInOnePathsDTO copy$default(CommercialPathsInOnePathsDTO commercialPathsInOnePathsDTO, com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialPathInfoDTO commercialPathInfoDTO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            commercialPathInfoDTO = commercialPathsInOnePathsDTO.commercialPathInfo;
        }
        if ((i & 2) != 0) {
            list = commercialPathsInOnePathsDTO.passthroughSteps;
        }
        return commercialPathsInOnePathsDTO.copy(commercialPathInfoDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialPathInfoDTO getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    public final List<PassthroughStepDTO> component2() {
        return this.passthroughSteps;
    }

    public final CommercialPathsInOnePathsDTO copy(com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialPathInfoDTO commercialPathInfo, List<PassthroughStepDTO> passthroughSteps) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughSteps, "passthroughSteps");
        return new CommercialPathsInOnePathsDTO(commercialPathInfo, passthroughSteps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommercialPathsInOnePathsDTO)) {
            return false;
        }
        CommercialPathsInOnePathsDTO commercialPathsInOnePathsDTO = (CommercialPathsInOnePathsDTO) other;
        return Intrinsics.areEqual(this.commercialPathInfo, commercialPathsInOnePathsDTO.commercialPathInfo) && Intrinsics.areEqual(this.passthroughSteps, commercialPathsInOnePathsDTO.passthroughSteps);
    }

    public final com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialPathInfoDTO getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    public final List<PassthroughStepDTO> getPassthroughSteps() {
        return this.passthroughSteps;
    }

    public int hashCode() {
        return this.passthroughSteps.hashCode() + (this.commercialPathInfo.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommercialPathsInOnePathsDTO(commercialPathInfo=");
        sb.append(this.commercialPathInfo);
        sb.append(", passthroughSteps=");
        return a.o(sb, this.passthroughSteps, ')');
    }
}
