package com.adif.elcanomovil.domain.entities;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013J\t\u0010\u0017\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/CommercialPathStepListSideInfo;", "", "commercialPathInfo", "Lcom/adif/elcanomovil/domain/entities/CommercialPathInfo;", "passthroughStep", "", "Lcom/adif/elcanomovil/domain/entities/PassthroughStep;", "(Lcom/adif/elcanomovil/domain/entities/CommercialPathInfo;Ljava/util/List;)V", "getCommercialPathInfo", "()Lcom/adif/elcanomovil/domain/entities/CommercialPathInfo;", "getPassthroughStep", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "platform", "", "stepNumber", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialPathStepListSideInfo {
    private final CommercialPathInfo commercialPathInfo;
    private final List<PassthroughStep> passthroughStep;

    public CommercialPathStepListSideInfo(CommercialPathInfo commercialPathInfo, List<PassthroughStep> passthroughStep) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughStep, "passthroughStep");
        this.commercialPathInfo = commercialPathInfo;
        this.passthroughStep = passthroughStep;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommercialPathStepListSideInfo copy$default(CommercialPathStepListSideInfo commercialPathStepListSideInfo, CommercialPathInfo commercialPathInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            commercialPathInfo = commercialPathStepListSideInfo.commercialPathInfo;
        }
        if ((i & 2) != 0) {
            list = commercialPathStepListSideInfo.passthroughStep;
        }
        return commercialPathStepListSideInfo.copy(commercialPathInfo, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CommercialPathInfo getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    public final List<PassthroughStep> component2() {
        return this.passthroughStep;
    }

    public final CommercialPathStepListSideInfo copy(CommercialPathInfo commercialPathInfo, List<PassthroughStep> passthroughStep) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughStep, "passthroughStep");
        return new CommercialPathStepListSideInfo(commercialPathInfo, passthroughStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommercialPathStepListSideInfo)) {
            return false;
        }
        CommercialPathStepListSideInfo commercialPathStepListSideInfo = (CommercialPathStepListSideInfo) other;
        return Intrinsics.areEqual(this.commercialPathInfo, commercialPathStepListSideInfo.commercialPathInfo) && Intrinsics.areEqual(this.passthroughStep, commercialPathStepListSideInfo.passthroughStep);
    }

    public final CommercialPathInfo getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    public final List<PassthroughStep> getPassthroughStep() {
        return this.passthroughStep;
    }

    public int hashCode() {
        return this.passthroughStep.hashCode() + (this.commercialPathInfo.hashCode() * 31);
    }

    public final String platform(int stepNumber) {
        PassthroughStepSides departurePassthroughStepSides = stepNumber == 0 ? this.passthroughStep.get(stepNumber).getDeparturePassthroughStepSides() : this.passthroughStep.get(stepNumber).getArrivalPassthroughStepSides();
        return (departurePassthroughStepSides.getAnnounceState() != AnnounceState.NORMAL || departurePassthroughStepSides.isSuppressed()) ? "" : departurePassthroughStepSides.getPlatform();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommercialPathStepListSideInfo(commercialPathInfo=");
        sb.append(this.commercialPathInfo);
        sb.append(", passthroughStep=");
        return a.o(sb, this.passthroughStep, ')');
    }
}
