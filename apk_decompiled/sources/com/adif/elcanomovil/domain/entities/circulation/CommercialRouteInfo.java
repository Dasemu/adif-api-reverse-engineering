package com.adif.elcanomovil.domain.entities.circulation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u001d\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u001d\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b \u0010\fR\u0013\u0010!\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0013\u0010#\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010\fR\u0013\u0010'\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\f¨\u00062"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialCirculation;", "commercialPathInfo", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;", "passthroughStep", "Lcom/adif/elcanomovil/domain/entities/circulation/RouteStep;", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;Lcom/adif/elcanomovil/domain/entities/circulation/RouteStep;)V", "getCommercialPathInfo", "()Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;", "ctcPlatform", "", "getCtcPlatform", "()Ljava/lang/String;", "hasWarningPlatform", "", "getHasWarningPlatform", "()Z", "immediateDeparture", "getImmediateDeparture", "observation", "getObservation", "operatorPlatform", "getOperatorPlatform", "getPassthroughStep", "()Lcom/adif/elcanomovil/domain/entities/circulation/RouteStep;", "plannedPlatform", "getPlannedPlatform", "platform", "getPlatform", "platformMuted", "getPlatformMuted", "preassignedPlatform", "getPreassignedPlatform", "resultantPlatform", "getResultantPlatform", "sitraPlatform", "getSitraPlatform", "stationCode", "getStationCode", "technicalNumber", "getTechnicalNumber", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialRouteInfo implements CommercialCirculation {
    private final CommercialPathInfo commercialPathInfo;
    private final RouteStep passthroughStep;

    public CommercialRouteInfo(CommercialPathInfo commercialPathInfo, RouteStep passthroughStep) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughStep, "passthroughStep");
        this.commercialPathInfo = commercialPathInfo;
        this.passthroughStep = passthroughStep;
    }

    public static /* synthetic */ CommercialRouteInfo copy$default(CommercialRouteInfo commercialRouteInfo, CommercialPathInfo commercialPathInfo, RouteStep routeStep, int i, Object obj) {
        if ((i & 1) != 0) {
            commercialPathInfo = commercialRouteInfo.commercialPathInfo;
        }
        if ((i & 2) != 0) {
            routeStep = commercialRouteInfo.passthroughStep;
        }
        return commercialRouteInfo.copy(commercialPathInfo, routeStep);
    }

    /* renamed from: component1, reason: from getter */
    public final CommercialPathInfo getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final RouteStep getPassthroughStep() {
        return this.passthroughStep;
    }

    public final CommercialRouteInfo copy(CommercialPathInfo commercialPathInfo, RouteStep passthroughStep) {
        Intrinsics.checkNotNullParameter(commercialPathInfo, "commercialPathInfo");
        Intrinsics.checkNotNullParameter(passthroughStep, "passthroughStep");
        return new CommercialRouteInfo(commercialPathInfo, passthroughStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommercialRouteInfo)) {
            return false;
        }
        CommercialRouteInfo commercialRouteInfo = (CommercialRouteInfo) other;
        return Intrinsics.areEqual(this.commercialPathInfo, commercialRouteInfo.commercialPathInfo) && Intrinsics.areEqual(this.passthroughStep, commercialRouteInfo.passthroughStep);
    }

    public final CommercialPathInfo getCommercialPathInfo() {
        return this.commercialPathInfo;
    }

    public final String getCtcPlatform() {
        return this.passthroughStep.getDeparturePassthroughStepSides().getCtcPlatform();
    }

    public final boolean getHasWarningPlatform() {
        return this.passthroughStep.getDeparturePassthroughStepSides().isPlatformWarning();
    }

    public final boolean getImmediateDeparture() {
        return this.passthroughStep.getDeparturePassthroughStepSides().getImmediateDeparture();
    }

    public final String getObservation() {
        return this.passthroughStep.getDeparturePassthroughStepSides().getObservation();
    }

    public final String getOperatorPlatform() {
        return this.passthroughStep.getDeparturePassthroughStepSides().getOperatorPlatform();
    }

    public final RouteStep getPassthroughStep() {
        return this.passthroughStep;
    }

    public final String getPlannedPlatform() {
        return this.passthroughStep.getDeparturePassthroughStepSides().getPlannedPlatform();
    }

    public final String getPlatform() {
        return this.passthroughStep.getDeparturePassthroughStepSides().getPlatform();
    }

    public final boolean getPlatformMuted() {
        return this.passthroughStep.getDeparturePassthroughStepSides().isPlatformMuted();
    }

    public final String getPreassignedPlatform() {
        return this.passthroughStep.getDeparturePassthroughStepSides().getPreassignedPlatform();
    }

    public final String getResultantPlatform() {
        RouteStepSide departurePassthroughStepSides = this.passthroughStep.getDeparturePassthroughStepSides();
        if (departurePassthroughStepSides != null) {
            return departurePassthroughStepSides.getResultantPlatform();
        }
        return null;
    }

    public final String getSitraPlatform() {
        return this.passthroughStep.getDeparturePassthroughStepSides().getSitraPlatform();
    }

    public final String getStationCode() {
        String commercialDestinationStationCode = this.commercialPathInfo.getCommercialDestinationStationCode();
        return commercialDestinationStationCode == null ? this.commercialPathInfo.getComercialPathKey().getDestinationStationCode() : commercialDestinationStationCode;
    }

    public final String getTechnicalNumber() {
        RouteStepSide departurePassthroughStepSides = this.passthroughStep.getDeparturePassthroughStepSides();
        if (departurePassthroughStepSides != null) {
            return departurePassthroughStepSides.getTechnicalNumber();
        }
        return null;
    }

    public int hashCode() {
        return this.passthroughStep.hashCode() + (this.commercialPathInfo.hashCode() * 31);
    }

    public String toString() {
        return "CommercialRouteInfo(commercialPathInfo=" + this.commercialPathInfo + ", passthroughStep=" + this.passthroughStep + ')';
    }
}
