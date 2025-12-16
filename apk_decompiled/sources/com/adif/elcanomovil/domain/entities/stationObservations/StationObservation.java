package com.adif.elcanomovil.domain.entities.stationObservations;

import C.w;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/stationObservations/StationObservation;", "", "avldmd", "", "cercanias", "observation", "", "stationCode", "typeOfWarning", "Lcom/adif/elcanomovil/domain/entities/stationObservations/StationObservationType;", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/stationObservations/StationObservationType;)V", "getAvldmd", "()Z", "getCercanias", "getObservation", "()Ljava/lang/String;", "getStationCode", "getTypeOfWarning", "()Lcom/adif/elcanomovil/domain/entities/stationObservations/StationObservationType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationObservation {
    private final boolean avldmd;
    private final boolean cercanias;
    private final String observation;
    private final String stationCode;
    private final StationObservationType typeOfWarning;

    public StationObservation(boolean z3, boolean z4, String observation, String stationCode, StationObservationType typeOfWarning) {
        Intrinsics.checkNotNullParameter(observation, "observation");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(typeOfWarning, "typeOfWarning");
        this.avldmd = z3;
        this.cercanias = z4;
        this.observation = observation;
        this.stationCode = stationCode;
        this.typeOfWarning = typeOfWarning;
    }

    public static /* synthetic */ StationObservation copy$default(StationObservation stationObservation, boolean z3, boolean z4, String str, String str2, StationObservationType stationObservationType, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = stationObservation.avldmd;
        }
        if ((i & 2) != 0) {
            z4 = stationObservation.cercanias;
        }
        if ((i & 4) != 0) {
            str = stationObservation.observation;
        }
        if ((i & 8) != 0) {
            str2 = stationObservation.stationCode;
        }
        if ((i & 16) != 0) {
            stationObservationType = stationObservation.typeOfWarning;
        }
        StationObservationType stationObservationType2 = stationObservationType;
        String str3 = str;
        return stationObservation.copy(z3, z4, str3, str2, stationObservationType2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAvldmd() {
        return this.avldmd;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCercanias() {
        return this.cercanias;
    }

    /* renamed from: component3, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component5, reason: from getter */
    public final StationObservationType getTypeOfWarning() {
        return this.typeOfWarning;
    }

    public final StationObservation copy(boolean avldmd, boolean cercanias, String observation, String stationCode, StationObservationType typeOfWarning) {
        Intrinsics.checkNotNullParameter(observation, "observation");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(typeOfWarning, "typeOfWarning");
        return new StationObservation(avldmd, cercanias, observation, stationCode, typeOfWarning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationObservation)) {
            return false;
        }
        StationObservation stationObservation = (StationObservation) other;
        return this.avldmd == stationObservation.avldmd && this.cercanias == stationObservation.cercanias && Intrinsics.areEqual(this.observation, stationObservation.observation) && Intrinsics.areEqual(this.stationCode, stationObservation.stationCode) && this.typeOfWarning == stationObservation.typeOfWarning;
    }

    public final boolean getAvldmd() {
        return this.avldmd;
    }

    public final boolean getCercanias() {
        return this.cercanias;
    }

    public final String getObservation() {
        return this.observation;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final StationObservationType getTypeOfWarning() {
        return this.typeOfWarning;
    }

    public int hashCode() {
        return this.typeOfWarning.hashCode() + a.d(this.stationCode, a.d(this.observation, w.c(Boolean.hashCode(this.avldmd) * 31, 31, this.cercanias), 31), 31);
    }

    public String toString() {
        return "StationObservation(avldmd=" + this.avldmd + ", cercanias=" + this.cercanias + ", observation=" + this.observation + ", stationCode=" + this.stationCode + ", typeOfWarning=" + this.typeOfWarning + ')';
    }
}
