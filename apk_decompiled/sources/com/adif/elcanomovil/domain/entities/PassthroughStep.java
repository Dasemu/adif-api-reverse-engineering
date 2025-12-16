package com.adif.elcanomovil.domain.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0002\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/PassthroughStep;", "", "isCommercial", "", "stationCode", "", "arrivalPassthroughStepSides", "Lcom/adif/elcanomovil/domain/entities/PassthroughStepSides;", "departurePassthroughStepSides", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/adif/elcanomovil/domain/entities/PassthroughStepSides;Lcom/adif/elcanomovil/domain/entities/PassthroughStepSides;)V", "getArrivalPassthroughStepSides", "()Lcom/adif/elcanomovil/domain/entities/PassthroughStepSides;", "getDeparturePassthroughStepSides", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStationCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/adif/elcanomovil/domain/entities/PassthroughStepSides;Lcom/adif/elcanomovil/domain/entities/PassthroughStepSides;)Lcom/adif/elcanomovil/domain/entities/PassthroughStep;", "equals", "other", "hashCode", "toString", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PassthroughStep {
    private final PassthroughStepSides arrivalPassthroughStepSides;
    private final PassthroughStepSides departurePassthroughStepSides;
    private final Boolean isCommercial;
    private final Integer stationCode;

    public PassthroughStep(Boolean bool, Integer num, PassthroughStepSides arrivalPassthroughStepSides, PassthroughStepSides departurePassthroughStepSides) {
        Intrinsics.checkNotNullParameter(arrivalPassthroughStepSides, "arrivalPassthroughStepSides");
        Intrinsics.checkNotNullParameter(departurePassthroughStepSides, "departurePassthroughStepSides");
        this.isCommercial = bool;
        this.stationCode = num;
        this.arrivalPassthroughStepSides = arrivalPassthroughStepSides;
        this.departurePassthroughStepSides = departurePassthroughStepSides;
    }

    public static /* synthetic */ PassthroughStep copy$default(PassthroughStep passthroughStep, Boolean bool, Integer num, PassthroughStepSides passthroughStepSides, PassthroughStepSides passthroughStepSides2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = passthroughStep.isCommercial;
        }
        if ((i & 2) != 0) {
            num = passthroughStep.stationCode;
        }
        if ((i & 4) != 0) {
            passthroughStepSides = passthroughStep.arrivalPassthroughStepSides;
        }
        if ((i & 8) != 0) {
            passthroughStepSides2 = passthroughStep.departurePassthroughStepSides;
        }
        return passthroughStep.copy(bool, num, passthroughStepSides, passthroughStepSides2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsCommercial() {
        return this.isCommercial;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component3, reason: from getter */
    public final PassthroughStepSides getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    /* renamed from: component4, reason: from getter */
    public final PassthroughStepSides getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final PassthroughStep copy(Boolean isCommercial, Integer stationCode, PassthroughStepSides arrivalPassthroughStepSides, PassthroughStepSides departurePassthroughStepSides) {
        Intrinsics.checkNotNullParameter(arrivalPassthroughStepSides, "arrivalPassthroughStepSides");
        Intrinsics.checkNotNullParameter(departurePassthroughStepSides, "departurePassthroughStepSides");
        return new PassthroughStep(isCommercial, stationCode, arrivalPassthroughStepSides, departurePassthroughStepSides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassthroughStep)) {
            return false;
        }
        PassthroughStep passthroughStep = (PassthroughStep) other;
        return Intrinsics.areEqual(this.isCommercial, passthroughStep.isCommercial) && Intrinsics.areEqual(this.stationCode, passthroughStep.stationCode) && Intrinsics.areEqual(this.arrivalPassthroughStepSides, passthroughStep.arrivalPassthroughStepSides) && Intrinsics.areEqual(this.departurePassthroughStepSides, passthroughStep.departurePassthroughStepSides);
    }

    public final PassthroughStepSides getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    public final PassthroughStepSides getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final Integer getStationCode() {
        return this.stationCode;
    }

    public int hashCode() {
        Boolean bool = this.isCommercial;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.stationCode;
        return this.departurePassthroughStepSides.hashCode() + ((this.arrivalPassthroughStepSides.hashCode() + ((hashCode + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    public final Boolean isCommercial() {
        return this.isCommercial;
    }

    public String toString() {
        return "PassthroughStep(isCommercial=" + this.isCommercial + ", stationCode=" + this.stationCode + ", arrivalPassthroughStepSides=" + this.arrivalPassthroughStepSides + ", departurePassthroughStepSides=" + this.departurePassthroughStepSides + ')';
    }
}
