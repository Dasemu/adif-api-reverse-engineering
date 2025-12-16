package com.adif.elcanomovil.commonNavGraph.arguments;

import com.google.android.gms.measurement.internal.a;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/StationObservationArg;", "Ljava/io/Serializable;", "observations", "", "Lcom/adif/elcanomovil/commonNavGraph/arguments/Observation;", "(Ljava/util/List;)V", "getObservations", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationObservationArg implements Serializable {
    private final List<Observation> observations;

    public StationObservationArg(List<Observation> observations) {
        Intrinsics.checkNotNullParameter(observations, "observations");
        this.observations = observations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StationObservationArg copy$default(StationObservationArg stationObservationArg, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = stationObservationArg.observations;
        }
        return stationObservationArg.copy(list);
    }

    public final List<Observation> component1() {
        return this.observations;
    }

    public final StationObservationArg copy(List<Observation> observations) {
        Intrinsics.checkNotNullParameter(observations, "observations");
        return new StationObservationArg(observations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StationObservationArg) && Intrinsics.areEqual(this.observations, ((StationObservationArg) other).observations);
    }

    public final List<Observation> getObservations() {
        return this.observations;
    }

    public int hashCode() {
        return this.observations.hashCode();
    }

    public String toString() {
        return a.o(new StringBuilder("StationObservationArg(observations="), this.observations, ')');
    }
}
