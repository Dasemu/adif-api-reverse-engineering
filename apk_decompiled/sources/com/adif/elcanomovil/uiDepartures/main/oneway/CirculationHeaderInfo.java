package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.TrainType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationHeaderInfo;", "", "isCercanias", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "isRodalies", "", "circulationType", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "(Lcom/adif/elcanomovil/domain/entities/TrainType;ZLcom/adif/elcanomovil/domain/entities/CirculationType;)V", "getCirculationType", "()Lcom/adif/elcanomovil/domain/entities/CirculationType;", "()Lcom/adif/elcanomovil/domain/entities/TrainType;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CirculationHeaderInfo {
    private final CirculationType circulationType;
    private final TrainType isCercanias;
    private final boolean isRodalies;

    public CirculationHeaderInfo(TrainType isCercanias, boolean z3, CirculationType circulationType) {
        Intrinsics.checkNotNullParameter(isCercanias, "isCercanias");
        Intrinsics.checkNotNullParameter(circulationType, "circulationType");
        this.isCercanias = isCercanias;
        this.isRodalies = z3;
        this.circulationType = circulationType;
    }

    public static /* synthetic */ CirculationHeaderInfo copy$default(CirculationHeaderInfo circulationHeaderInfo, TrainType trainType, boolean z3, CirculationType circulationType, int i, Object obj) {
        if ((i & 1) != 0) {
            trainType = circulationHeaderInfo.isCercanias;
        }
        if ((i & 2) != 0) {
            z3 = circulationHeaderInfo.isRodalies;
        }
        if ((i & 4) != 0) {
            circulationType = circulationHeaderInfo.circulationType;
        }
        return circulationHeaderInfo.copy(trainType, z3, circulationType);
    }

    /* renamed from: component1, reason: from getter */
    public final TrainType getIsCercanias() {
        return this.isCercanias;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRodalies() {
        return this.isRodalies;
    }

    /* renamed from: component3, reason: from getter */
    public final CirculationType getCirculationType() {
        return this.circulationType;
    }

    public final CirculationHeaderInfo copy(TrainType isCercanias, boolean isRodalies, CirculationType circulationType) {
        Intrinsics.checkNotNullParameter(isCercanias, "isCercanias");
        Intrinsics.checkNotNullParameter(circulationType, "circulationType");
        return new CirculationHeaderInfo(isCercanias, isRodalies, circulationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CirculationHeaderInfo)) {
            return false;
        }
        CirculationHeaderInfo circulationHeaderInfo = (CirculationHeaderInfo) other;
        return this.isCercanias == circulationHeaderInfo.isCercanias && this.isRodalies == circulationHeaderInfo.isRodalies && this.circulationType == circulationHeaderInfo.circulationType;
    }

    public final CirculationType getCirculationType() {
        return this.circulationType;
    }

    public int hashCode() {
        return this.circulationType.hashCode() + C.w.c(this.isCercanias.hashCode() * 31, 31, this.isRodalies);
    }

    public final TrainType isCercanias() {
        return this.isCercanias;
    }

    public final boolean isRodalies() {
        return this.isRodalies;
    }

    public String toString() {
        return "CirculationHeaderInfo(isCercanias=" + this.isCercanias + ", isRodalies=" + this.isRodalies + ", circulationType=" + this.circulationType + ')';
    }
}
