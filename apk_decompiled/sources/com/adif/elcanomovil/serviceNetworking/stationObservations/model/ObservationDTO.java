package com.adif.elcanomovil.serviceNetworking.stationObservations.model;

import C.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/ObservationDTO;", "", "avldmd", "", "cercanias", "observation", "", "type", "Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/ObservationTypeDTO;", "(ZZLjava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/ObservationTypeDTO;)V", "getAvldmd", "()Z", "getCercanias", "getObservation", "()Ljava/lang/String;", "getType", "()Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/ObservationTypeDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ObservationDTO {
    private final boolean avldmd;
    private final boolean cercanias;
    private final String observation;
    private final ObservationTypeDTO type;

    public ObservationDTO(boolean z3, boolean z4, String str, ObservationTypeDTO type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.avldmd = z3;
        this.cercanias = z4;
        this.observation = str;
        this.type = type;
    }

    public static /* synthetic */ ObservationDTO copy$default(ObservationDTO observationDTO, boolean z3, boolean z4, String str, ObservationTypeDTO observationTypeDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = observationDTO.avldmd;
        }
        if ((i & 2) != 0) {
            z4 = observationDTO.cercanias;
        }
        if ((i & 4) != 0) {
            str = observationDTO.observation;
        }
        if ((i & 8) != 0) {
            observationTypeDTO = observationDTO.type;
        }
        return observationDTO.copy(z3, z4, str, observationTypeDTO);
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
    public final ObservationTypeDTO getType() {
        return this.type;
    }

    public final ObservationDTO copy(boolean avldmd, boolean cercanias, String observation, ObservationTypeDTO type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new ObservationDTO(avldmd, cercanias, observation, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObservationDTO)) {
            return false;
        }
        ObservationDTO observationDTO = (ObservationDTO) other;
        return this.avldmd == observationDTO.avldmd && this.cercanias == observationDTO.cercanias && Intrinsics.areEqual(this.observation, observationDTO.observation) && this.type == observationDTO.type;
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

    public final ObservationTypeDTO getType() {
        return this.type;
    }

    public int hashCode() {
        int c4 = w.c(Boolean.hashCode(this.avldmd) * 31, 31, this.cercanias);
        String str = this.observation;
        return this.type.hashCode() + ((c4 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "ObservationDTO(avldmd=" + this.avldmd + ", cercanias=" + this.cercanias + ", observation=" + this.observation + ", type=" + this.type + ')';
    }

    public /* synthetic */ ObservationDTO(boolean z3, boolean z4, String str, ObservationTypeDTO observationTypeDTO, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3, z4, (i & 4) != 0 ? "" : str, observationTypeDTO);
    }
}
