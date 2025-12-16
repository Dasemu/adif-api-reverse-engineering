package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.uiDepartures.entities.ObservationAlert;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/ObservationInfo;", "", "observation", "", "observationWarning", "Lcom/adif/elcanomovil/uiDepartures/entities/ObservationAlert;", "(Ljava/lang/Boolean;Lcom/adif/elcanomovil/uiDepartures/entities/ObservationAlert;)V", "getObservation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getObservationWarning", "()Lcom/adif/elcanomovil/uiDepartures/entities/ObservationAlert;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lcom/adif/elcanomovil/uiDepartures/entities/ObservationAlert;)Lcom/adif/elcanomovil/uiDepartures/main/oneway/ObservationInfo;", "equals", "other", "hashCode", "", "toString", "", "Companion", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ObservationInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: default, reason: not valid java name */
    private static final ObservationInfo f0default = new ObservationInfo(null, ObservationAlert.NOTHING);
    private final Boolean observation;
    private final ObservationAlert observationWarning;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/ObservationInfo$Companion;", "", "()V", "default", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/ObservationInfo;", "getDefault", "()Lcom/adif/elcanomovil/uiDepartures/main/oneway/ObservationInfo;", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ObservationInfo getDefault() {
            return ObservationInfo.f0default;
        }

        private Companion() {
        }
    }

    public ObservationInfo(Boolean bool, ObservationAlert observationWarning) {
        Intrinsics.checkNotNullParameter(observationWarning, "observationWarning");
        this.observation = bool;
        this.observationWarning = observationWarning;
    }

    public static /* synthetic */ ObservationInfo copy$default(ObservationInfo observationInfo, Boolean bool, ObservationAlert observationAlert, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = observationInfo.observation;
        }
        if ((i & 2) != 0) {
            observationAlert = observationInfo.observationWarning;
        }
        return observationInfo.copy(bool, observationAlert);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getObservation() {
        return this.observation;
    }

    /* renamed from: component2, reason: from getter */
    public final ObservationAlert getObservationWarning() {
        return this.observationWarning;
    }

    public final ObservationInfo copy(Boolean observation, ObservationAlert observationWarning) {
        Intrinsics.checkNotNullParameter(observationWarning, "observationWarning");
        return new ObservationInfo(observation, observationWarning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObservationInfo)) {
            return false;
        }
        ObservationInfo observationInfo = (ObservationInfo) other;
        return Intrinsics.areEqual(this.observation, observationInfo.observation) && this.observationWarning == observationInfo.observationWarning;
    }

    public final Boolean getObservation() {
        return this.observation;
    }

    public final ObservationAlert getObservationWarning() {
        return this.observationWarning;
    }

    public int hashCode() {
        Boolean bool = this.observation;
        return this.observationWarning.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
    }

    public String toString() {
        return "ObservationInfo(observation=" + this.observation + ", observationWarning=" + this.observationWarning + ')';
    }
}
