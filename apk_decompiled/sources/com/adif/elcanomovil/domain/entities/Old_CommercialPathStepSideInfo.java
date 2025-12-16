package com.adif.elcanomovil.domain.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fJ\t\u0010\u0016\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/Old_CommercialPathStepSideInfo;", "", "commercialPathInfo", "Lcom/adif/elcanomovil/domain/entities/CommercialPathInfo;", "passthroughStep", "Lcom/adif/elcanomovil/domain/entities/PassthroughStep;", "(Lcom/adif/elcanomovil/domain/entities/CommercialPathInfo;Lcom/adif/elcanomovil/domain/entities/PassthroughStep;)V", "getCommercialPathInfo", "()Lcom/adif/elcanomovil/domain/entities/CommercialPathInfo;", "getPassthroughStep", "()Lcom/adif/elcanomovil/domain/entities/PassthroughStep;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "platform", "", "isDeparture", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Old_CommercialPathStepSideInfo {
    private final CommercialPathInfo commercialPathInfo;
    private final PassthroughStep passthroughStep;

    public Old_CommercialPathStepSideInfo(CommercialPathInfo commercialPathInfo, PassthroughStep passthroughStep) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughStep, "passthroughStep");
        this.commercialPathInfo = commercialPathInfo;
        this.passthroughStep = passthroughStep;
    }

    public static /* synthetic */ Old_CommercialPathStepSideInfo copy$default(Old_CommercialPathStepSideInfo old_CommercialPathStepSideInfo, CommercialPathInfo commercialPathInfo, PassthroughStep passthroughStep, int i, Object obj) {
        if ((i & 1) != 0) {
            commercialPathInfo = old_CommercialPathStepSideInfo.commercialPathInfo;
        }
        if ((i & 2) != 0) {
            passthroughStep = old_CommercialPathStepSideInfo.passthroughStep;
        }
        return old_CommercialPathStepSideInfo.copy(commercialPathInfo, passthroughStep);
    }

    /* renamed from: component1, reason: from getter */
    public final CommercialPathInfo getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final PassthroughStep getPassthroughStep() {
        return this.passthroughStep;
    }

    public final Old_CommercialPathStepSideInfo copy(CommercialPathInfo commercialPathInfo, PassthroughStep passthroughStep) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughStep, "passthroughStep");
        return new Old_CommercialPathStepSideInfo(commercialPathInfo, passthroughStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Old_CommercialPathStepSideInfo)) {
            return false;
        }
        Old_CommercialPathStepSideInfo old_CommercialPathStepSideInfo = (Old_CommercialPathStepSideInfo) other;
        return Intrinsics.areEqual(this.commercialPathInfo, old_CommercialPathStepSideInfo.commercialPathInfo) && Intrinsics.areEqual(this.passthroughStep, old_CommercialPathStepSideInfo.passthroughStep);
    }

    public final CommercialPathInfo getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    public final PassthroughStep getPassthroughStep() {
        return this.passthroughStep;
    }

    public int hashCode() {
        return this.passthroughStep.hashCode() + (this.commercialPathInfo.hashCode() * 31);
    }

    public final String platform(boolean isDeparture) {
        return (isDeparture ? this.passthroughStep.getDeparturePassthroughStepSides() : this.passthroughStep.getArrivalPassthroughStepSides()).getPlatform();
    }

    public String toString() {
        return "Old_CommercialPathStepSideInfo(commercialPathInfo=" + this.commercialPathInfo + ", passthroughStep=" + this.passthroughStep + ')';
    }
}
