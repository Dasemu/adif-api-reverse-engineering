package com.adif.elcanomovil.domain.entities.circulation;

import C.w;
import com.adif.elcanomovil.domain.extensions.LongKt;
import com.google.android.gms.measurement.internal.a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStep;", "", "announceable", "", "stationCode", "", "isCommercial", "arrivalPassthroughStepSides", "Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStepSide;", "departurePassthroughStepSides", "(ZLjava/lang/String;ZLcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStepSide;Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStepSide;)V", "getAnnounceable", "()Z", "getArrivalPassthroughStepSides", "()Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStepSide;", "getDeparturePassthroughStepSides", "getStationCode", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "plannedDate", "Ljava/util/Date;", "isDeparture", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PassthroughDetailsStep {
    private final boolean announceable;
    private final PassthroughDetailsStepSide arrivalPassthroughStepSides;
    private final PassthroughDetailsStepSide departurePassthroughStepSides;
    private final boolean isCommercial;
    private final String stationCode;

    public PassthroughDetailsStep(boolean z3, String stationCode, boolean z4, PassthroughDetailsStepSide passthroughDetailsStepSide, PassthroughDetailsStepSide passthroughDetailsStepSide2) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        this.announceable = z3;
        this.stationCode = stationCode;
        this.isCommercial = z4;
        this.arrivalPassthroughStepSides = passthroughDetailsStepSide;
        this.departurePassthroughStepSides = passthroughDetailsStepSide2;
    }

    public static /* synthetic */ PassthroughDetailsStep copy$default(PassthroughDetailsStep passthroughDetailsStep, boolean z3, String str, boolean z4, PassthroughDetailsStepSide passthroughDetailsStepSide, PassthroughDetailsStepSide passthroughDetailsStepSide2, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = passthroughDetailsStep.announceable;
        }
        if ((i & 2) != 0) {
            str = passthroughDetailsStep.stationCode;
        }
        if ((i & 4) != 0) {
            z4 = passthroughDetailsStep.isCommercial;
        }
        if ((i & 8) != 0) {
            passthroughDetailsStepSide = passthroughDetailsStep.arrivalPassthroughStepSides;
        }
        if ((i & 16) != 0) {
            passthroughDetailsStepSide2 = passthroughDetailsStep.departurePassthroughStepSides;
        }
        PassthroughDetailsStepSide passthroughDetailsStepSide3 = passthroughDetailsStepSide2;
        boolean z5 = z4;
        return passthroughDetailsStep.copy(z3, str, z5, passthroughDetailsStepSide, passthroughDetailsStepSide3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAnnounceable() {
        return this.announceable;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCommercial() {
        return this.isCommercial;
    }

    /* renamed from: component4, reason: from getter */
    public final PassthroughDetailsStepSide getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    /* renamed from: component5, reason: from getter */
    public final PassthroughDetailsStepSide getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final PassthroughDetailsStep copy(boolean announceable, String stationCode, boolean isCommercial, PassthroughDetailsStepSide arrivalPassthroughStepSides, PassthroughDetailsStepSide departurePassthroughStepSides) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        return new PassthroughDetailsStep(announceable, stationCode, isCommercial, arrivalPassthroughStepSides, departurePassthroughStepSides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassthroughDetailsStep)) {
            return false;
        }
        PassthroughDetailsStep passthroughDetailsStep = (PassthroughDetailsStep) other;
        return this.announceable == passthroughDetailsStep.announceable && Intrinsics.areEqual(this.stationCode, passthroughDetailsStep.stationCode) && this.isCommercial == passthroughDetailsStep.isCommercial && Intrinsics.areEqual(this.arrivalPassthroughStepSides, passthroughDetailsStep.arrivalPassthroughStepSides) && Intrinsics.areEqual(this.departurePassthroughStepSides, passthroughDetailsStep.departurePassthroughStepSides);
    }

    public final boolean getAnnounceable() {
        return this.announceable;
    }

    public final PassthroughDetailsStepSide getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    public final PassthroughDetailsStepSide getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public int hashCode() {
        int c4 = w.c(a.d(this.stationCode, Boolean.hashCode(this.announceable) * 31, 31), 31, this.isCommercial);
        PassthroughDetailsStepSide passthroughDetailsStepSide = this.arrivalPassthroughStepSides;
        int hashCode = (c4 + (passthroughDetailsStepSide == null ? 0 : passthroughDetailsStepSide.hashCode())) * 31;
        PassthroughDetailsStepSide passthroughDetailsStepSide2 = this.departurePassthroughStepSides;
        return hashCode + (passthroughDetailsStepSide2 != null ? passthroughDetailsStepSide2.hashCode() : 0);
    }

    public final boolean isCommercial() {
        return this.isCommercial;
    }

    public final Date plannedDate(boolean isDeparture) {
        Date delayedDate;
        PassthroughDetailsStepSide passthroughDetailsStepSide = isDeparture ? this.departurePassthroughStepSides : this.arrivalPassthroughStepSides;
        return (passthroughDetailsStepSide == null || (delayedDate = LongKt.getDelayedDate(passthroughDetailsStepSide.getPlannedTime(), passthroughDetailsStepSide.getForecastedOrAuditedDelay())) == null) ? new Date() : delayedDate;
    }

    public String toString() {
        return "PassthroughDetailsStep(announceable=" + this.announceable + ", stationCode=" + this.stationCode + ", isCommercial=" + this.isCommercial + ", arrivalPassthroughStepSides=" + this.arrivalPassthroughStepSides + ", departurePassthroughStepSides=" + this.departurePassthroughStepSides + ')';
    }
}
