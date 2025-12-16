package com.adif.elcanomovil.serviceNetworking.circulations.model.response;

import C.w;
import com.adif.elcanomovil.serviceNetworking.circulations.PassthroughStepDTO;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO;", "", "stopType", "", "announceable", "", "stationCode", "arrivalPassthroughStepSides", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;", "departurePassthroughStepSides", "(Ljava/lang/String;ZLjava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;)V", "getAnnounceable", "()Z", "getArrivalPassthroughStepSides", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;", "getDeparturePassthroughStepSides", "getStationCode", "()Ljava/lang/String;", "getStopType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "DeparturePassthroughStepSidesDTO", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PassthroughStepDTO {
    private final boolean announceable;
    private final DeparturePassthroughStepSidesDTO arrivalPassthroughStepSides;
    private final DeparturePassthroughStepSidesDTO departurePassthroughStepSides;
    private final String stationCode;
    private final String stopType;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J£\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0007HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006="}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;", "", "announceState", "", "circulationState", "ctcPlatform", "forecastedOrAuditedDelay", "", "observation", "operatorPlatform", "plannedPlatform", "preassignedPlatform", "plannedTime", "", "sitraPlatform", "timeType", "visualEffects", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/VisualEffectsDTO;", "technicalCirculationKey", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TechnicalCirculationKeyDTO;", "resultantPlatform", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/VisualEffectsDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TechnicalCirculationKeyDTO;Ljava/lang/String;)V", "getAnnounceState", "()Ljava/lang/String;", "getCirculationState", "getCtcPlatform", "getForecastedOrAuditedDelay", "()I", "getObservation", "getOperatorPlatform", "getPlannedPlatform", "getPlannedTime", "()J", "getPreassignedPlatform", "getResultantPlatform", "getSitraPlatform", "getTechnicalCirculationKey", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TechnicalCirculationKeyDTO;", "getTimeType", "getVisualEffects", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/VisualEffectsDTO;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class DeparturePassthroughStepSidesDTO {
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
        private final String sitraPlatform;
        private final PassthroughStepDTO.TechnicalCirculationKeyDTO technicalCirculationKey;
        private final String timeType;
        private final VisualEffectsDTO visualEffects;

        public DeparturePassthroughStepSidesDTO(String announceState, String circulationState, String str, int i, String str2, String str3, String str4, String str5, long j4, String str6, String timeType, VisualEffectsDTO visualEffects, PassthroughStepDTO.TechnicalCirculationKeyDTO technicalCirculationKeyDTO, String resultantPlatform) {
            Intrinsics.checkNotNullParameter(announceState, "announceState");
            Intrinsics.checkNotNullParameter(circulationState, "circulationState");
            Intrinsics.checkNotNullParameter(timeType, "timeType");
            Intrinsics.checkNotNullParameter(visualEffects, "visualEffects");
            Intrinsics.checkNotNullParameter(resultantPlatform, "resultantPlatform");
            this.announceState = announceState;
            this.circulationState = circulationState;
            this.ctcPlatform = str;
            this.forecastedOrAuditedDelay = i;
            this.observation = str2;
            this.operatorPlatform = str3;
            this.plannedPlatform = str4;
            this.preassignedPlatform = str5;
            this.plannedTime = j4;
            this.sitraPlatform = str6;
            this.timeType = timeType;
            this.visualEffects = visualEffects;
            this.technicalCirculationKey = technicalCirculationKeyDTO;
            this.resultantPlatform = resultantPlatform;
        }

        /* renamed from: component1, reason: from getter */
        public final String getAnnounceState() {
            return this.announceState;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSitraPlatform() {
            return this.sitraPlatform;
        }

        /* renamed from: component11, reason: from getter */
        public final String getTimeType() {
            return this.timeType;
        }

        /* renamed from: component12, reason: from getter */
        public final VisualEffectsDTO getVisualEffects() {
            return this.visualEffects;
        }

        /* renamed from: component13, reason: from getter */
        public final PassthroughStepDTO.TechnicalCirculationKeyDTO getTechnicalCirculationKey() {
            return this.technicalCirculationKey;
        }

        /* renamed from: component14, reason: from getter */
        public final String getResultantPlatform() {
            return this.resultantPlatform;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCirculationState() {
            return this.circulationState;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCtcPlatform() {
            return this.ctcPlatform;
        }

        /* renamed from: component4, reason: from getter */
        public final int getForecastedOrAuditedDelay() {
            return this.forecastedOrAuditedDelay;
        }

        /* renamed from: component5, reason: from getter */
        public final String getObservation() {
            return this.observation;
        }

        /* renamed from: component6, reason: from getter */
        public final String getOperatorPlatform() {
            return this.operatorPlatform;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPlannedPlatform() {
            return this.plannedPlatform;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPreassignedPlatform() {
            return this.preassignedPlatform;
        }

        /* renamed from: component9, reason: from getter */
        public final long getPlannedTime() {
            return this.plannedTime;
        }

        public final DeparturePassthroughStepSidesDTO copy(String announceState, String circulationState, String ctcPlatform, int forecastedOrAuditedDelay, String observation, String operatorPlatform, String plannedPlatform, String preassignedPlatform, long plannedTime, String sitraPlatform, String timeType, VisualEffectsDTO visualEffects, PassthroughStepDTO.TechnicalCirculationKeyDTO technicalCirculationKey, String resultantPlatform) {
            Intrinsics.checkNotNullParameter(announceState, "announceState");
            Intrinsics.checkNotNullParameter(circulationState, "circulationState");
            Intrinsics.checkNotNullParameter(timeType, "timeType");
            Intrinsics.checkNotNullParameter(visualEffects, "visualEffects");
            Intrinsics.checkNotNullParameter(resultantPlatform, "resultantPlatform");
            return new DeparturePassthroughStepSidesDTO(announceState, circulationState, ctcPlatform, forecastedOrAuditedDelay, observation, operatorPlatform, plannedPlatform, preassignedPlatform, plannedTime, sitraPlatform, timeType, visualEffects, technicalCirculationKey, resultantPlatform);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeparturePassthroughStepSidesDTO)) {
                return false;
            }
            DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO = (DeparturePassthroughStepSidesDTO) other;
            return Intrinsics.areEqual(this.announceState, departurePassthroughStepSidesDTO.announceState) && Intrinsics.areEqual(this.circulationState, departurePassthroughStepSidesDTO.circulationState) && Intrinsics.areEqual(this.ctcPlatform, departurePassthroughStepSidesDTO.ctcPlatform) && this.forecastedOrAuditedDelay == departurePassthroughStepSidesDTO.forecastedOrAuditedDelay && Intrinsics.areEqual(this.observation, departurePassthroughStepSidesDTO.observation) && Intrinsics.areEqual(this.operatorPlatform, departurePassthroughStepSidesDTO.operatorPlatform) && Intrinsics.areEqual(this.plannedPlatform, departurePassthroughStepSidesDTO.plannedPlatform) && Intrinsics.areEqual(this.preassignedPlatform, departurePassthroughStepSidesDTO.preassignedPlatform) && this.plannedTime == departurePassthroughStepSidesDTO.plannedTime && Intrinsics.areEqual(this.sitraPlatform, departurePassthroughStepSidesDTO.sitraPlatform) && Intrinsics.areEqual(this.timeType, departurePassthroughStepSidesDTO.timeType) && Intrinsics.areEqual(this.visualEffects, departurePassthroughStepSidesDTO.visualEffects) && Intrinsics.areEqual(this.technicalCirculationKey, departurePassthroughStepSidesDTO.technicalCirculationKey) && Intrinsics.areEqual(this.resultantPlatform, departurePassthroughStepSidesDTO.resultantPlatform);
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

        public final String getSitraPlatform() {
            return this.sitraPlatform;
        }

        public final PassthroughStepDTO.TechnicalCirculationKeyDTO getTechnicalCirculationKey() {
            return this.technicalCirculationKey;
        }

        public final String getTimeType() {
            return this.timeType;
        }

        public final VisualEffectsDTO getVisualEffects() {
            return this.visualEffects;
        }

        public int hashCode() {
            int d4 = a.d(this.circulationState, this.announceState.hashCode() * 31, 31);
            String str = this.ctcPlatform;
            int x3 = w.x(this.forecastedOrAuditedDelay, (d4 + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.observation;
            int hashCode = (x3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.operatorPlatform;
            int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.plannedPlatform;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.preassignedPlatform;
            int b4 = a.b(this.plannedTime, (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
            String str6 = this.sitraPlatform;
            int hashCode4 = (this.visualEffects.hashCode() + a.d(this.timeType, (b4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31)) * 31;
            PassthroughStepDTO.TechnicalCirculationKeyDTO technicalCirculationKeyDTO = this.technicalCirculationKey;
            return this.resultantPlatform.hashCode() + ((hashCode4 + (technicalCirculationKeyDTO != null ? technicalCirculationKeyDTO.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DeparturePassthroughStepSidesDTO(announceState=");
            sb.append(this.announceState);
            sb.append(", circulationState=");
            sb.append(this.circulationState);
            sb.append(", ctcPlatform=");
            sb.append(this.ctcPlatform);
            sb.append(", forecastedOrAuditedDelay=");
            sb.append(this.forecastedOrAuditedDelay);
            sb.append(", observation=");
            sb.append(this.observation);
            sb.append(", operatorPlatform=");
            sb.append(this.operatorPlatform);
            sb.append(", plannedPlatform=");
            sb.append(this.plannedPlatform);
            sb.append(", preassignedPlatform=");
            sb.append(this.preassignedPlatform);
            sb.append(", plannedTime=");
            sb.append(this.plannedTime);
            sb.append(", sitraPlatform=");
            sb.append(this.sitraPlatform);
            sb.append(", timeType=");
            sb.append(this.timeType);
            sb.append(", visualEffects=");
            sb.append(this.visualEffects);
            sb.append(", technicalCirculationKey=");
            sb.append(this.technicalCirculationKey);
            sb.append(", resultantPlatform=");
            return a.n(sb, this.resultantPlatform, ')');
        }
    }

    public PassthroughStepDTO(String stopType, boolean z3, String stationCode, DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO, DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO2) {
        Intrinsics.checkNotNullParameter(stopType, "stopType");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        this.stopType = stopType;
        this.announceable = z3;
        this.stationCode = stationCode;
        this.arrivalPassthroughStepSides = departurePassthroughStepSidesDTO;
        this.departurePassthroughStepSides = departurePassthroughStepSidesDTO2;
    }

    public static /* synthetic */ PassthroughStepDTO copy$default(PassthroughStepDTO passthroughStepDTO, String str, boolean z3, String str2, DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO, DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passthroughStepDTO.stopType;
        }
        if ((i & 2) != 0) {
            z3 = passthroughStepDTO.announceable;
        }
        if ((i & 4) != 0) {
            str2 = passthroughStepDTO.stationCode;
        }
        if ((i & 8) != 0) {
            departurePassthroughStepSidesDTO = passthroughStepDTO.arrivalPassthroughStepSides;
        }
        if ((i & 16) != 0) {
            departurePassthroughStepSidesDTO2 = passthroughStepDTO.departurePassthroughStepSides;
        }
        DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO3 = departurePassthroughStepSidesDTO2;
        String str3 = str2;
        return passthroughStepDTO.copy(str, z3, str3, departurePassthroughStepSidesDTO, departurePassthroughStepSidesDTO3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStopType() {
        return this.stopType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAnnounceable() {
        return this.announceable;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component4, reason: from getter */
    public final DeparturePassthroughStepSidesDTO getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    /* renamed from: component5, reason: from getter */
    public final DeparturePassthroughStepSidesDTO getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final PassthroughStepDTO copy(String stopType, boolean announceable, String stationCode, DeparturePassthroughStepSidesDTO arrivalPassthroughStepSides, DeparturePassthroughStepSidesDTO departurePassthroughStepSides) {
        Intrinsics.checkNotNullParameter(stopType, "stopType");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        return new PassthroughStepDTO(stopType, announceable, stationCode, arrivalPassthroughStepSides, departurePassthroughStepSides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassthroughStepDTO)) {
            return false;
        }
        PassthroughStepDTO passthroughStepDTO = (PassthroughStepDTO) other;
        return Intrinsics.areEqual(this.stopType, passthroughStepDTO.stopType) && this.announceable == passthroughStepDTO.announceable && Intrinsics.areEqual(this.stationCode, passthroughStepDTO.stationCode) && Intrinsics.areEqual(this.arrivalPassthroughStepSides, passthroughStepDTO.arrivalPassthroughStepSides) && Intrinsics.areEqual(this.departurePassthroughStepSides, passthroughStepDTO.departurePassthroughStepSides);
    }

    public final boolean getAnnounceable() {
        return this.announceable;
    }

    public final DeparturePassthroughStepSidesDTO getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    public final DeparturePassthroughStepSidesDTO getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final String getStopType() {
        return this.stopType;
    }

    public int hashCode() {
        int d4 = a.d(this.stationCode, w.c(this.stopType.hashCode() * 31, 31, this.announceable), 31);
        DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO = this.arrivalPassthroughStepSides;
        int hashCode = (d4 + (departurePassthroughStepSidesDTO == null ? 0 : departurePassthroughStepSidesDTO.hashCode())) * 31;
        DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO2 = this.departurePassthroughStepSides;
        return hashCode + (departurePassthroughStepSidesDTO2 != null ? departurePassthroughStepSidesDTO2.hashCode() : 0);
    }

    public String toString() {
        return "PassthroughStepDTO(stopType=" + this.stopType + ", announceable=" + this.announceable + ", stationCode=" + this.stationCode + ", arrivalPassthroughStepSides=" + this.arrivalPassthroughStepSides + ", departurePassthroughStepSides=" + this.departurePassthroughStepSides + ')';
    }
}
