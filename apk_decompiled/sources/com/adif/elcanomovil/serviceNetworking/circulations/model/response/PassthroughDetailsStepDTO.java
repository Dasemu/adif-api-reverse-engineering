package com.adif.elcanomovil.serviceNetworking.circulations.model.response;

import C.w;
import com.adif.elcanomovil.serviceNetworking.circulations.PassthroughStepDTO;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO;", "", "announceable", "", "stationCode", "", "stopType", "arrivalPassthroughStepSides", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO$PassthroughDetailsStepSideDTO;", "departurePassthroughStepSides", "(ZLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO$PassthroughDetailsStepSideDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO$PassthroughDetailsStepSideDTO;)V", "getAnnounceable", "()Z", "getArrivalPassthroughStepSides", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO$PassthroughDetailsStepSideDTO;", "getDeparturePassthroughStepSides", "getStationCode", "()Ljava/lang/String;", "getStopType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "PassthroughDetailsStepSideDTO", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PassthroughDetailsStepDTO {
    private final boolean announceable;
    private final PassthroughDetailsStepSideDTO arrivalPassthroughStepSides;
    private final PassthroughDetailsStepSideDTO departurePassthroughStepSides;
    private final String stationCode;
    private final String stopType;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u000eHÆ\u0003J¯\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010;\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\tHÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006?"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO$PassthroughDetailsStepSideDTO;", "", "announceState", "", "circulationState", "supressed", "", "ctcPlatform", "forecastedOrAuditedDelay", "", "observation", "operatorPlatform", "plannedPlatform", "plannedTime", "", "resultantPlatform", "preassignedPlatform", "showDelay", "sitraPlatform", "timeType", "technicalCirculationKey", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TechnicalCirculationKeyDTO;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TechnicalCirculationKeyDTO;)V", "getAnnounceState", "()Ljava/lang/String;", "getCirculationState", "getCtcPlatform", "getForecastedOrAuditedDelay", "()I", "getObservation", "getOperatorPlatform", "getPlannedPlatform", "getPlannedTime", "()J", "getPreassignedPlatform", "getResultantPlatform", "getShowDelay", "()Z", "getSitraPlatform", "getSupressed", "getTechnicalCirculationKey", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TechnicalCirculationKeyDTO;", "getTimeType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class PassthroughDetailsStepSideDTO {
        private final String announceState;
        private final String circulationState;
        private final String ctcPlatform;
        private final int forecastedOrAuditedDelay;
        private final String observation;
        private final String operatorPlatform;
        private final String plannedPlatform;
        private final long plannedTime;
        private final String preassignedPlatform;
        private final String resultantPlatform;
        private final boolean showDelay;
        private final String sitraPlatform;
        private final boolean supressed;
        private final PassthroughStepDTO.TechnicalCirculationKeyDTO technicalCirculationKey;
        private final String timeType;

        public PassthroughDetailsStepSideDTO(String announceState, String circulationState, boolean z3, String str, int i, String str2, String str3, String str4, long j4, String str5, String str6, boolean z4, String str7, String timeType, PassthroughStepDTO.TechnicalCirculationKeyDTO technicalCirculationKeyDTO) {
            Intrinsics.checkNotNullParameter(announceState, "announceState");
            Intrinsics.checkNotNullParameter(circulationState, "circulationState");
            Intrinsics.checkNotNullParameter(timeType, "timeType");
            this.announceState = announceState;
            this.circulationState = circulationState;
            this.supressed = z3;
            this.ctcPlatform = str;
            this.forecastedOrAuditedDelay = i;
            this.observation = str2;
            this.operatorPlatform = str3;
            this.plannedPlatform = str4;
            this.plannedTime = j4;
            this.resultantPlatform = str5;
            this.preassignedPlatform = str6;
            this.showDelay = z4;
            this.sitraPlatform = str7;
            this.timeType = timeType;
            this.technicalCirculationKey = technicalCirculationKeyDTO;
        }

        /* renamed from: component1, reason: from getter */
        public final String getAnnounceState() {
            return this.announceState;
        }

        /* renamed from: component10, reason: from getter */
        public final String getResultantPlatform() {
            return this.resultantPlatform;
        }

        /* renamed from: component11, reason: from getter */
        public final String getPreassignedPlatform() {
            return this.preassignedPlatform;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getShowDelay() {
            return this.showDelay;
        }

        /* renamed from: component13, reason: from getter */
        public final String getSitraPlatform() {
            return this.sitraPlatform;
        }

        /* renamed from: component14, reason: from getter */
        public final String getTimeType() {
            return this.timeType;
        }

        /* renamed from: component15, reason: from getter */
        public final PassthroughStepDTO.TechnicalCirculationKeyDTO getTechnicalCirculationKey() {
            return this.technicalCirculationKey;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCirculationState() {
            return this.circulationState;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSupressed() {
            return this.supressed;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCtcPlatform() {
            return this.ctcPlatform;
        }

        /* renamed from: component5, reason: from getter */
        public final int getForecastedOrAuditedDelay() {
            return this.forecastedOrAuditedDelay;
        }

        /* renamed from: component6, reason: from getter */
        public final String getObservation() {
            return this.observation;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOperatorPlatform() {
            return this.operatorPlatform;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPlannedPlatform() {
            return this.plannedPlatform;
        }

        /* renamed from: component9, reason: from getter */
        public final long getPlannedTime() {
            return this.plannedTime;
        }

        public final PassthroughDetailsStepSideDTO copy(String announceState, String circulationState, boolean supressed, String ctcPlatform, int forecastedOrAuditedDelay, String observation, String operatorPlatform, String plannedPlatform, long plannedTime, String resultantPlatform, String preassignedPlatform, boolean showDelay, String sitraPlatform, String timeType, PassthroughStepDTO.TechnicalCirculationKeyDTO technicalCirculationKey) {
            Intrinsics.checkNotNullParameter(announceState, "announceState");
            Intrinsics.checkNotNullParameter(circulationState, "circulationState");
            Intrinsics.checkNotNullParameter(timeType, "timeType");
            return new PassthroughDetailsStepSideDTO(announceState, circulationState, supressed, ctcPlatform, forecastedOrAuditedDelay, observation, operatorPlatform, plannedPlatform, plannedTime, resultantPlatform, preassignedPlatform, showDelay, sitraPlatform, timeType, technicalCirculationKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassthroughDetailsStepSideDTO)) {
                return false;
            }
            PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO = (PassthroughDetailsStepSideDTO) other;
            return Intrinsics.areEqual(this.announceState, passthroughDetailsStepSideDTO.announceState) && Intrinsics.areEqual(this.circulationState, passthroughDetailsStepSideDTO.circulationState) && this.supressed == passthroughDetailsStepSideDTO.supressed && Intrinsics.areEqual(this.ctcPlatform, passthroughDetailsStepSideDTO.ctcPlatform) && this.forecastedOrAuditedDelay == passthroughDetailsStepSideDTO.forecastedOrAuditedDelay && Intrinsics.areEqual(this.observation, passthroughDetailsStepSideDTO.observation) && Intrinsics.areEqual(this.operatorPlatform, passthroughDetailsStepSideDTO.operatorPlatform) && Intrinsics.areEqual(this.plannedPlatform, passthroughDetailsStepSideDTO.plannedPlatform) && this.plannedTime == passthroughDetailsStepSideDTO.plannedTime && Intrinsics.areEqual(this.resultantPlatform, passthroughDetailsStepSideDTO.resultantPlatform) && Intrinsics.areEqual(this.preassignedPlatform, passthroughDetailsStepSideDTO.preassignedPlatform) && this.showDelay == passthroughDetailsStepSideDTO.showDelay && Intrinsics.areEqual(this.sitraPlatform, passthroughDetailsStepSideDTO.sitraPlatform) && Intrinsics.areEqual(this.timeType, passthroughDetailsStepSideDTO.timeType) && Intrinsics.areEqual(this.technicalCirculationKey, passthroughDetailsStepSideDTO.technicalCirculationKey);
        }

        public final String getAnnounceState() {
            return this.announceState;
        }

        public final String getCirculationState() {
            return this.circulationState;
        }

        public final String getCtcPlatform() {
            return this.ctcPlatform;
        }

        public final int getForecastedOrAuditedDelay() {
            return this.forecastedOrAuditedDelay;
        }

        public final String getObservation() {
            return this.observation;
        }

        public final String getOperatorPlatform() {
            return this.operatorPlatform;
        }

        public final String getPlannedPlatform() {
            return this.plannedPlatform;
        }

        public final long getPlannedTime() {
            return this.plannedTime;
        }

        public final String getPreassignedPlatform() {
            return this.preassignedPlatform;
        }

        public final String getResultantPlatform() {
            return this.resultantPlatform;
        }

        public final boolean getShowDelay() {
            return this.showDelay;
        }

        public final String getSitraPlatform() {
            return this.sitraPlatform;
        }

        public final boolean getSupressed() {
            return this.supressed;
        }

        public final PassthroughStepDTO.TechnicalCirculationKeyDTO getTechnicalCirculationKey() {
            return this.technicalCirculationKey;
        }

        public final String getTimeType() {
            return this.timeType;
        }

        public int hashCode() {
            int c4 = w.c(a.d(this.circulationState, this.announceState.hashCode() * 31, 31), 31, this.supressed);
            String str = this.ctcPlatform;
            int x3 = w.x(this.forecastedOrAuditedDelay, (c4 + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.observation;
            int hashCode = (x3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.operatorPlatform;
            int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.plannedPlatform;
            int b4 = a.b(this.plannedTime, (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
            String str5 = this.resultantPlatform;
            int hashCode3 = (b4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.preassignedPlatform;
            int c5 = w.c((hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.showDelay);
            String str7 = this.sitraPlatform;
            int d4 = a.d(this.timeType, (c5 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
            PassthroughStepDTO.TechnicalCirculationKeyDTO technicalCirculationKeyDTO = this.technicalCirculationKey;
            return d4 + (technicalCirculationKeyDTO != null ? technicalCirculationKeyDTO.hashCode() : 0);
        }

        public String toString() {
            return "PassthroughDetailsStepSideDTO(announceState=" + this.announceState + ", circulationState=" + this.circulationState + ", supressed=" + this.supressed + ", ctcPlatform=" + this.ctcPlatform + ", forecastedOrAuditedDelay=" + this.forecastedOrAuditedDelay + ", observation=" + this.observation + ", operatorPlatform=" + this.operatorPlatform + ", plannedPlatform=" + this.plannedPlatform + ", plannedTime=" + this.plannedTime + ", resultantPlatform=" + this.resultantPlatform + ", preassignedPlatform=" + this.preassignedPlatform + ", showDelay=" + this.showDelay + ", sitraPlatform=" + this.sitraPlatform + ", timeType=" + this.timeType + ", technicalCirculationKey=" + this.technicalCirculationKey + ')';
        }
    }

    public PassthroughDetailsStepDTO(boolean z3, String stationCode, String stopType, PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO, PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO2) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(stopType, "stopType");
        this.announceable = z3;
        this.stationCode = stationCode;
        this.stopType = stopType;
        this.arrivalPassthroughStepSides = passthroughDetailsStepSideDTO;
        this.departurePassthroughStepSides = passthroughDetailsStepSideDTO2;
    }

    public static /* synthetic */ PassthroughDetailsStepDTO copy$default(PassthroughDetailsStepDTO passthroughDetailsStepDTO, boolean z3, String str, String str2, PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO, PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO2, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = passthroughDetailsStepDTO.announceable;
        }
        if ((i & 2) != 0) {
            str = passthroughDetailsStepDTO.stationCode;
        }
        if ((i & 4) != 0) {
            str2 = passthroughDetailsStepDTO.stopType;
        }
        if ((i & 8) != 0) {
            passthroughDetailsStepSideDTO = passthroughDetailsStepDTO.arrivalPassthroughStepSides;
        }
        if ((i & 16) != 0) {
            passthroughDetailsStepSideDTO2 = passthroughDetailsStepDTO.departurePassthroughStepSides;
        }
        PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO3 = passthroughDetailsStepSideDTO2;
        String str3 = str2;
        return passthroughDetailsStepDTO.copy(z3, str, str3, passthroughDetailsStepSideDTO, passthroughDetailsStepSideDTO3);
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
    public final String getStopType() {
        return this.stopType;
    }

    /* renamed from: component4, reason: from getter */
    public final PassthroughDetailsStepSideDTO getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    /* renamed from: component5, reason: from getter */
    public final PassthroughDetailsStepSideDTO getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final PassthroughDetailsStepDTO copy(boolean announceable, String stationCode, String stopType, PassthroughDetailsStepSideDTO arrivalPassthroughStepSides, PassthroughDetailsStepSideDTO departurePassthroughStepSides) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(stopType, "stopType");
        return new PassthroughDetailsStepDTO(announceable, stationCode, stopType, arrivalPassthroughStepSides, departurePassthroughStepSides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassthroughDetailsStepDTO)) {
            return false;
        }
        PassthroughDetailsStepDTO passthroughDetailsStepDTO = (PassthroughDetailsStepDTO) other;
        return this.announceable == passthroughDetailsStepDTO.announceable && Intrinsics.areEqual(this.stationCode, passthroughDetailsStepDTO.stationCode) && Intrinsics.areEqual(this.stopType, passthroughDetailsStepDTO.stopType) && Intrinsics.areEqual(this.arrivalPassthroughStepSides, passthroughDetailsStepDTO.arrivalPassthroughStepSides) && Intrinsics.areEqual(this.departurePassthroughStepSides, passthroughDetailsStepDTO.departurePassthroughStepSides);
    }

    public final boolean getAnnounceable() {
        return this.announceable;
    }

    public final PassthroughDetailsStepSideDTO getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    public final PassthroughDetailsStepSideDTO getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final String getStopType() {
        return this.stopType;
    }

    public int hashCode() {
        int d4 = a.d(this.stopType, a.d(this.stationCode, Boolean.hashCode(this.announceable) * 31, 31), 31);
        PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO = this.arrivalPassthroughStepSides;
        int hashCode = (d4 + (passthroughDetailsStepSideDTO == null ? 0 : passthroughDetailsStepSideDTO.hashCode())) * 31;
        PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO2 = this.departurePassthroughStepSides;
        return hashCode + (passthroughDetailsStepSideDTO2 != null ? passthroughDetailsStepSideDTO2.hashCode() : 0);
    }

    public String toString() {
        return "PassthroughDetailsStepDTO(announceable=" + this.announceable + ", stationCode=" + this.stationCode + ", stopType=" + this.stopType + ", arrivalPassthroughStepSides=" + this.arrivalPassthroughStepSides + ", departurePassthroughStepSides=" + this.departurePassthroughStepSides + ')';
    }
}
