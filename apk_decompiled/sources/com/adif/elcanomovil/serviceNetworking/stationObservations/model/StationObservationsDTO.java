package com.adif.elcanomovil.serviceNetworking.stationObservations.model;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/StationObservationsDTO;", "", "stationCode", "", "observations", "", "Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/ObservationDTO;", "(Ljava/lang/String;Ljava/util/List;)V", "getObservations", "()Ljava/util/List;", "getStationCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationObservationsDTO {
    private final List<ObservationDTO> observations;
    private final String stationCode;

    public StationObservationsDTO(String stationCode, List<ObservationDTO> observations) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(observations, "observations");
        this.stationCode = stationCode;
        this.observations = observations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StationObservationsDTO copy$default(StationObservationsDTO stationObservationsDTO, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stationObservationsDTO.stationCode;
        }
        if ((i & 2) != 0) {
            list = stationObservationsDTO.observations;
        }
        return stationObservationsDTO.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    public final List<ObservationDTO> component2() {
        return this.observations;
    }

    public final StationObservationsDTO copy(String stationCode, List<ObservationDTO> observations) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(observations, "observations");
        return new StationObservationsDTO(stationCode, observations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationObservationsDTO)) {
            return false;
        }
        StationObservationsDTO stationObservationsDTO = (StationObservationsDTO) other;
        return Intrinsics.areEqual(this.stationCode, stationObservationsDTO.stationCode) && Intrinsics.areEqual(this.observations, stationObservationsDTO.observations);
    }

    public final List<ObservationDTO> getObservations() {
        return this.observations;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public int hashCode() {
        return this.observations.hashCode() + (this.stationCode.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StationObservationsDTO(stationCode=");
        sb.append(this.stationCode);
        sb.append(", observations=");
        return a.o(sb, this.observations, ')');
    }
}
