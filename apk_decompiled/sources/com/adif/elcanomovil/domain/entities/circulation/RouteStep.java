package com.adif.elcanomovil.domain.entities.circulation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/RouteStep;", "", "arrivalPassthroughStepSides", "Lcom/adif/elcanomovil/domain/entities/circulation/RouteStepSide;", "departurePassthroughStepSides", "(Lcom/adif/elcanomovil/domain/entities/circulation/RouteStepSide;Lcom/adif/elcanomovil/domain/entities/circulation/RouteStepSide;)V", "getArrivalPassthroughStepSides", "()Lcom/adif/elcanomovil/domain/entities/circulation/RouteStepSide;", "getDeparturePassthroughStepSides", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RouteStep {
    private final RouteStepSide arrivalPassthroughStepSides;
    private final RouteStepSide departurePassthroughStepSides;

    public RouteStep(RouteStepSide arrivalPassthroughStepSides, RouteStepSide departurePassthroughStepSides) {
        Intrinsics.checkNotNullParameter(arrivalPassthroughStepSides, "arrivalPassthroughStepSides");
        Intrinsics.checkNotNullParameter(departurePassthroughStepSides, "departurePassthroughStepSides");
        this.arrivalPassthroughStepSides = arrivalPassthroughStepSides;
        this.departurePassthroughStepSides = departurePassthroughStepSides;
    }

    public static /* synthetic */ RouteStep copy$default(RouteStep routeStep, RouteStepSide routeStepSide, RouteStepSide routeStepSide2, int i, Object obj) {
        if ((i & 1) != 0) {
            routeStepSide = routeStep.arrivalPassthroughStepSides;
        }
        if ((i & 2) != 0) {
            routeStepSide2 = routeStep.departurePassthroughStepSides;
        }
        return routeStep.copy(routeStepSide, routeStepSide2);
    }

    /* renamed from: component1, reason: from getter */
    public final RouteStepSide getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    /* renamed from: component2, reason: from getter */
    public final RouteStepSide getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final RouteStep copy(RouteStepSide arrivalPassthroughStepSides, RouteStepSide departurePassthroughStepSides) {
        Intrinsics.checkNotNullParameter(arrivalPassthroughStepSides, "arrivalPassthroughStepSides");
        Intrinsics.checkNotNullParameter(departurePassthroughStepSides, "departurePassthroughStepSides");
        return new RouteStep(arrivalPassthroughStepSides, departurePassthroughStepSides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteStep)) {
            return false;
        }
        RouteStep routeStep = (RouteStep) other;
        return Intrinsics.areEqual(this.arrivalPassthroughStepSides, routeStep.arrivalPassthroughStepSides) && Intrinsics.areEqual(this.departurePassthroughStepSides, routeStep.departurePassthroughStepSides);
    }

    public final RouteStepSide getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    public final RouteStepSide getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public int hashCode() {
        return this.departurePassthroughStepSides.hashCode() + (this.arrivalPassthroughStepSides.hashCode() * 31);
    }

    public String toString() {
        return "RouteStep(arrivalPassthroughStepSides=" + this.arrivalPassthroughStepSides + ", departurePassthroughStepSides=" + this.departurePassthroughStepSides + ')';
    }
}
