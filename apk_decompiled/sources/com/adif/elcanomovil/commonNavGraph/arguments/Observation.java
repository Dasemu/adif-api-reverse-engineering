package com.adif.elcanomovil.commonNavGraph.arguments;

import com.google.android.gms.measurement.internal.a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/Observation;", "Ljava/io/Serializable;", "stationName", "", "message", "isWarning", "Lcom/adif/elcanomovil/commonNavGraph/arguments/ObservationType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/ObservationType;)V", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/ObservationType;", "getMessage", "()Ljava/lang/String;", "getStationName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Observation implements Serializable {
    private final ObservationType isWarning;
    private final String message;
    private final String stationName;

    public Observation(String stationName, String message, ObservationType isWarning) {
        Intrinsics.checkNotNullParameter(stationName, "stationName");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(isWarning, "isWarning");
        this.stationName = stationName;
        this.message = message;
        this.isWarning = isWarning;
    }

    public static /* synthetic */ Observation copy$default(Observation observation, String str, String str2, ObservationType observationType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = observation.stationName;
        }
        if ((i & 2) != 0) {
            str2 = observation.message;
        }
        if ((i & 4) != 0) {
            observationType = observation.isWarning;
        }
        return observation.copy(str, str2, observationType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationName() {
        return this.stationName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final ObservationType getIsWarning() {
        return this.isWarning;
    }

    public final Observation copy(String stationName, String message, ObservationType isWarning) {
        Intrinsics.checkNotNullParameter(stationName, "stationName");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(isWarning, "isWarning");
        return new Observation(stationName, message, isWarning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Observation)) {
            return false;
        }
        Observation observation = (Observation) other;
        return Intrinsics.areEqual(this.stationName, observation.stationName) && Intrinsics.areEqual(this.message, observation.message) && this.isWarning == observation.isWarning;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStationName() {
        return this.stationName;
    }

    public int hashCode() {
        return this.isWarning.hashCode() + a.d(this.message, this.stationName.hashCode() * 31, 31);
    }

    public final ObservationType isWarning() {
        return this.isWarning;
    }

    public String toString() {
        return "Observation(stationName=" + this.stationName + ", message=" + this.message + ", isWarning=" + this.isWarning + ')';
    }
}
