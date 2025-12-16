package com.adif.elcanomovil.domain.entities.circulation;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialCirculation;", "commercialPathInfo", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;", "passthroughSteps", "", "Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStep;", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;Ljava/util/List;)V", "getCommercialPathInfo", "()Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;", "getPassthroughSteps", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hasWarningPlatform", "stepNumber", "", "hashCode", "platform", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialPathRouteSidesInfo implements CommercialCirculation {
    private final CommercialPathInfo commercialPathInfo;
    private final List<PassthroughDetailsStep> passthroughSteps;

    public CommercialPathRouteSidesInfo(CommercialPathInfo commercialPathInfo, List<PassthroughDetailsStep> passthroughSteps) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughSteps, "passthroughSteps");
        this.commercialPathInfo = commercialPathInfo;
        this.passthroughSteps = passthroughSteps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommercialPathRouteSidesInfo copy$default(CommercialPathRouteSidesInfo commercialPathRouteSidesInfo, CommercialPathInfo commercialPathInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            commercialPathInfo = commercialPathRouteSidesInfo.commercialPathInfo;
        }
        if ((i & 2) != 0) {
            list = commercialPathRouteSidesInfo.passthroughSteps;
        }
        return commercialPathRouteSidesInfo.copy(commercialPathInfo, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CommercialPathInfo getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    public final List<PassthroughDetailsStep> component2() {
        return this.passthroughSteps;
    }

    public final CommercialPathRouteSidesInfo copy(CommercialPathInfo commercialPathInfo, List<PassthroughDetailsStep> passthroughSteps) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughSteps, "passthroughSteps");
        return new CommercialPathRouteSidesInfo(commercialPathInfo, passthroughSteps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommercialPathRouteSidesInfo)) {
            return false;
        }
        CommercialPathRouteSidesInfo commercialPathRouteSidesInfo = (CommercialPathRouteSidesInfo) other;
        return Intrinsics.areEqual(this.commercialPathInfo, commercialPathRouteSidesInfo.commercialPathInfo) && Intrinsics.areEqual(this.passthroughSteps, commercialPathRouteSidesInfo.passthroughSteps);
    }

    public final CommercialPathInfo getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    public final List<PassthroughDetailsStep> getPassthroughSteps() {
        return this.passthroughSteps;
    }

    public final boolean hasWarningPlatform(int stepNumber) {
        if (stepNumber == 0) {
            PassthroughDetailsStepSide departurePassthroughStepSides = this.passthroughSteps.get(stepNumber).getDeparturePassthroughStepSides();
            return departurePassthroughStepSides != null && departurePassthroughStepSides.isPlatformWarning();
        }
        PassthroughDetailsStepSide arrivalPassthroughStepSides = this.passthroughSteps.get(stepNumber).getArrivalPassthroughStepSides();
        return arrivalPassthroughStepSides != null && arrivalPassthroughStepSides.isPlatformWarning();
    }

    public int hashCode() {
        return this.passthroughSteps.hashCode() + (this.commercialPathInfo.hashCode() * 31);
    }

    public final String platform(int stepNumber) {
        PassthroughDetailsStepSide departurePassthroughStepSides = stepNumber == 0 ? this.passthroughSteps.get(stepNumber).getDeparturePassthroughStepSides() : this.passthroughSteps.get(stepNumber).getArrivalPassthroughStepSides();
        return (departurePassthroughStepSides == null || !departurePassthroughStepSides.isAnnounceable() || departurePassthroughStepSides.isSuppressed() || departurePassthroughStepSides.getPlatformMuted()) ? "" : departurePassthroughStepSides.getPlatform();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommercialPathRouteSidesInfo(commercialPathInfo=");
        sb.append(this.commercialPathInfo);
        sb.append(", passthroughSteps=");
        return a.o(sb, this.passthroughSteps, ')');
    }
}
