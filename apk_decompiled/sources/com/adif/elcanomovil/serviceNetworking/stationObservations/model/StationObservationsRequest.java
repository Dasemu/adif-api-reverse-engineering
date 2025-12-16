package com.adif.elcanomovil.serviceNetworking.stationObservations.model;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/StationObservationsRequest;", "", "stationCodes", "", "", "(Ljava/util/List;)V", "getStationCodes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationObservationsRequest {
    private final List<String> stationCodes;

    public StationObservationsRequest(List<String> stationCodes) {
        Intrinsics.checkNotNullParameter(stationCodes, "stationCodes");
        this.stationCodes = stationCodes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StationObservationsRequest copy$default(StationObservationsRequest stationObservationsRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = stationObservationsRequest.stationCodes;
        }
        return stationObservationsRequest.copy(list);
    }

    public final List<String> component1() {
        return this.stationCodes;
    }

    public final StationObservationsRequest copy(List<String> stationCodes) {
        Intrinsics.checkNotNullParameter(stationCodes, "stationCodes");
        return new StationObservationsRequest(stationCodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StationObservationsRequest) && Intrinsics.areEqual(this.stationCodes, ((StationObservationsRequest) other).stationCodes);
    }

    public final List<String> getStationCodes() {
        return this.stationCodes;
    }

    public int hashCode() {
        return this.stationCodes.hashCode();
    }

    public String toString() {
        return a.o(new StringBuilder("StationObservationsRequest(stationCodes="), this.stationCodes, ')');
    }
}
