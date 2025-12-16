package com.adif.elcanomovil.domain.entities.circulation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010$\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006%"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathStepSideInfo;", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialCirculation;", "commercialPathInfo", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;", "passthroughStep", "Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStep;", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStep;)V", "getCommercialPathInfo", "()Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;", "getPassthroughStep", "()Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStep;", "component1", "component2", "copy", "ctcPlatform", "", "isDeparture", "", "equals", "other", "", "hasWarningPlatform", "hashCode", "", "observation", "operatorPlatform", "passthroughStepSide", "Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStepSides;", "plannedPlatform", "platform", "platformMuted", "preassignedPlatform", "resultantPlatform", "sitraPlatform", "stationCode", "technicalNumber", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialPathStepSideInfo implements CommercialCirculation {
    private final CommercialPathInfo commercialPathInfo;
    private final PassthroughStep passthroughStep;

    public CommercialPathStepSideInfo(CommercialPathInfo commercialPathInfo, PassthroughStep passthroughStep) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughStep, "passthroughStep");
        this.commercialPathInfo = commercialPathInfo;
        this.passthroughStep = passthroughStep;
    }

    public static /* synthetic */ CommercialPathStepSideInfo copy$default(CommercialPathStepSideInfo commercialPathStepSideInfo, CommercialPathInfo commercialPathInfo, PassthroughStep passthroughStep, int i, Object obj) {
        if ((i & 1) != 0) {
            commercialPathInfo = commercialPathStepSideInfo.commercialPathInfo;
        }
        if ((i & 2) != 0) {
            passthroughStep = commercialPathStepSideInfo.passthroughStep;
        }
        return commercialPathStepSideInfo.copy(commercialPathInfo, passthroughStep);
    }

    /* renamed from: component1, reason: from getter */
    public final CommercialPathInfo getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final PassthroughStep getPassthroughStep() {
        return this.passthroughStep;
    }

    public final CommercialPathStepSideInfo copy(CommercialPathInfo commercialPathInfo, PassthroughStep passthroughStep) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughStep, "passthroughStep");
        return new CommercialPathStepSideInfo(commercialPathInfo, passthroughStep);
    }

    public final String ctcPlatform(boolean isDeparture) {
        String ctcPlatform;
        PassthroughStepSides passthroughStepSide = passthroughStepSide(isDeparture);
        return (passthroughStepSide == null || (ctcPlatform = passthroughStepSide.getCtcPlatform()) == null) ? "" : ctcPlatform;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommercialPathStepSideInfo)) {
            return false;
        }
        CommercialPathStepSideInfo commercialPathStepSideInfo = (CommercialPathStepSideInfo) other;
        return Intrinsics.areEqual(this.commercialPathInfo, commercialPathStepSideInfo.commercialPathInfo) && Intrinsics.areEqual(this.passthroughStep, commercialPathStepSideInfo.passthroughStep);
    }

    public final CommercialPathInfo getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    public final PassthroughStep getPassthroughStep() {
        return this.passthroughStep;
    }

    public final boolean hasWarningPlatform(boolean isDeparture) {
        PassthroughStepSides passthroughStepSide = passthroughStepSide(isDeparture);
        return passthroughStepSide != null && passthroughStepSide.isPlatformWarning();
    }

    public int hashCode() {
        return this.passthroughStep.hashCode() + (this.commercialPathInfo.hashCode() * 31);
    }

    public final String observation(boolean isDeparture) {
        PassthroughStepSides passthroughStepSide = passthroughStepSide(isDeparture);
        if (passthroughStepSide != null) {
            return passthroughStepSide.getObservation();
        }
        return null;
    }

    public final String operatorPlatform(boolean isDeparture) {
        String operatorPlatform;
        PassthroughStepSides passthroughStepSide = passthroughStepSide(isDeparture);
        return (passthroughStepSide == null || (operatorPlatform = passthroughStepSide.getOperatorPlatform()) == null) ? "" : operatorPlatform;
    }

    public final PassthroughStepSides passthroughStepSide(boolean isDeparture) {
        return isDeparture ? this.passthroughStep.getDeparturePassthroughStepSides() : this.passthroughStep.getArrivalPassthroughStepSides();
    }

    public final String plannedPlatform(boolean isDeparture) {
        String plannedPlatform;
        PassthroughStepSides passthroughStepSide = passthroughStepSide(isDeparture);
        return (passthroughStepSide == null || (plannedPlatform = passthroughStepSide.getPlannedPlatform()) == null) ? "" : plannedPlatform;
    }

    public final String platform(boolean isDeparture) {
        String platform;
        PassthroughStepSides passthroughStepSide = passthroughStepSide(isDeparture);
        return (passthroughStepSide == null || (platform = passthroughStepSide.getPlatform()) == null) ? "" : platform;
    }

    public final boolean platformMuted(boolean isDeparture) {
        PassthroughStepSides passthroughStepSide = passthroughStepSide(isDeparture);
        if (passthroughStepSide != null) {
            return passthroughStepSide.isMuted();
        }
        return false;
    }

    public final String preassignedPlatform(boolean isDeparture) {
        if (isDeparture) {
            PassthroughStepSides departurePassthroughStepSides = this.passthroughStep.getDeparturePassthroughStepSides();
            if (departurePassthroughStepSides != null) {
                return departurePassthroughStepSides.getPreassignedPlatform();
            }
            return null;
        }
        PassthroughStepSides arrivalPassthroughStepSides = this.passthroughStep.getArrivalPassthroughStepSides();
        if (arrivalPassthroughStepSides != null) {
            return arrivalPassthroughStepSides.getPreassignedPlatform();
        }
        return null;
    }

    public final String resultantPlatform(boolean isDeparture) {
        String resultantPlatform;
        PassthroughStepSides passthroughStepSide = passthroughStepSide(isDeparture);
        return (passthroughStepSide == null || (resultantPlatform = passthroughStepSide.getResultantPlatform()) == null) ? "" : resultantPlatform;
    }

    public final String sitraPlatform(boolean isDeparture) {
        String sitraPlatform;
        PassthroughStepSides passthroughStepSide = passthroughStepSide(isDeparture);
        return (passthroughStepSide == null || (sitraPlatform = passthroughStepSide.getSitraPlatform()) == null) ? "" : sitraPlatform;
    }

    public final String stationCode(boolean isDeparture) {
        if (isDeparture) {
            String commercialDestinationStationCode = this.commercialPathInfo.getCommercialDestinationStationCode();
            return commercialDestinationStationCode == null ? this.commercialPathInfo.getComercialPathKey().getDestinationStationCode() : commercialDestinationStationCode;
        }
        String commercialOriginStationCode = this.commercialPathInfo.getCommercialOriginStationCode();
        return commercialOriginStationCode == null ? this.commercialPathInfo.getComercialPathKey().getOriginStationCode() : commercialOriginStationCode;
    }

    public final String technicalNumber(boolean isDeparture) {
        PassthroughStepSides passthroughStepSide = passthroughStepSide(isDeparture);
        if (passthroughStepSide != null) {
            return passthroughStepSide.getTechnicalNumber();
        }
        return null;
    }

    public String toString() {
        return "CommercialPathStepSideInfo(commercialPathInfo=" + this.commercialPathInfo + ", passthroughStep=" + this.passthroughStep + ')';
    }
}
