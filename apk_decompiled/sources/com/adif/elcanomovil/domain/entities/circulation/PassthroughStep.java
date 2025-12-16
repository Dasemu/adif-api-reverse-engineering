package com.adif.elcanomovil.domain.entities.circulation;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStep;", "", "isCommercial", "", "stationCode", "", "arrivalPassthroughStepSides", "Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStepSides;", "departurePassthroughStepSides", "(ZLjava/lang/String;Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStepSides;Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStepSides;)V", "getArrivalPassthroughStepSides", "()Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStepSides;", "getDeparturePassthroughStepSides", "()Z", "getStationCode", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PassthroughStep {
    private final PassthroughStepSides arrivalPassthroughStepSides;
    private final PassthroughStepSides departurePassthroughStepSides;
    private final boolean isCommercial;
    private final String stationCode;

    public PassthroughStep(boolean z3, String stationCode, PassthroughStepSides passthroughStepSides, PassthroughStepSides passthroughStepSides2) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        this.isCommercial = z3;
        this.stationCode = stationCode;
        this.arrivalPassthroughStepSides = passthroughStepSides;
        this.departurePassthroughStepSides = passthroughStepSides2;
    }

    public static /* synthetic */ PassthroughStep copy$default(PassthroughStep passthroughStep, boolean z3, String str, PassthroughStepSides passthroughStepSides, PassthroughStepSides passthroughStepSides2, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = passthroughStep.isCommercial;
        }
        if ((i & 2) != 0) {
            str = passthroughStep.stationCode;
        }
        if ((i & 4) != 0) {
            passthroughStepSides = passthroughStep.arrivalPassthroughStepSides;
        }
        if ((i & 8) != 0) {
            passthroughStepSides2 = passthroughStep.departurePassthroughStepSides;
        }
        return passthroughStep.copy(z3, str, passthroughStepSides, passthroughStepSides2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCommercial() {
        return this.isCommercial;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStationCode() {
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

    public final PassthroughStep copy(boolean isCommercial, String stationCode, PassthroughStepSides arrivalPassthroughStepSides, PassthroughStepSides departurePassthroughStepSides) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
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
        return this.isCommercial == passthroughStep.isCommercial && Intrinsics.areEqual(this.stationCode, passthroughStep.stationCode) && Intrinsics.areEqual(this.arrivalPassthroughStepSides, passthroughStep.arrivalPassthroughStepSides) && Intrinsics.areEqual(this.departurePassthroughStepSides, passthroughStep.departurePassthroughStepSides);
    }

    public final PassthroughStepSides getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    public final PassthroughStepSides getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public int hashCode() {
        int d4 = a.d(this.stationCode, Boolean.hashCode(this.isCommercial) * 31, 31);
        PassthroughStepSides passthroughStepSides = this.arrivalPassthroughStepSides;
        int hashCode = (d4 + (passthroughStepSides == null ? 0 : passthroughStepSides.hashCode())) * 31;
        PassthroughStepSides passthroughStepSides2 = this.departurePassthroughStepSides;
        return hashCode + (passthroughStepSides2 != null ? passthroughStepSides2.hashCode() : 0);
    }

    public final boolean isCommercial() {
        return this.isCommercial;
    }

    public String toString() {
        return "PassthroughStep(isCommercial=" + this.isCommercial + ", stationCode=" + this.stationCode + ", arrivalPassthroughStepSides=" + this.arrivalPassthroughStepSides + ", departurePassthroughStepSides=" + this.departurePassthroughStepSides + ')';
    }
}
