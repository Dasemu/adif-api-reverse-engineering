package com.adif.elcanomovil.serviceNetworking.circulations.model.response;

import C.w;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/RouteStepDTO;", "", "arrivalPassthroughStepSides", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/RouteStepDTO$RouteStepSideDTO;", "departurePassthroughStepSides", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/RouteStepDTO$RouteStepSideDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/RouteStepDTO$RouteStepSideDTO;)V", "getArrivalPassthroughStepSides", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/RouteStepDTO$RouteStepSideDTO;", "getDeparturePassthroughStepSides", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RouteStepSideDTO", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RouteStepDTO {
    private final RouteStepSideDTO arrivalPassthroughStepSides;
    private final RouteStepSideDTO departurePassthroughStepSides;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0015HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÁ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005HÆ\u0001J\u0013\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\tHÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006E"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/RouteStepDTO$RouteStepSideDTO;", "", "announceable", "", "announceState", "", "circulationState", "ctcPlatform", "forecastedOrAuditedDelay", "", "observation", "operatorPlatform", "plannedPlatform", "preassignedPlatform", "plannedTime", "", "sitraPlatform", "stationCode", "stopType", "timeType", "visualEffects", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/VisualEffectsDTO;", "technicalNumber", "resultantPlatform", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/VisualEffectsDTO;Ljava/lang/String;Ljava/lang/String;)V", "getAnnounceState", "()Ljava/lang/String;", "getAnnounceable", "()Z", "getCirculationState", "getCtcPlatform", "getForecastedOrAuditedDelay", "()I", "getObservation", "getOperatorPlatform", "getPlannedPlatform", "getPlannedTime", "()J", "getPreassignedPlatform", "getResultantPlatform", "getSitraPlatform", "getStationCode", "getStopType", "getTechnicalNumber", "getTimeType", "getVisualEffects", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/VisualEffectsDTO;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class RouteStepSideDTO {
        private final String announceState;
        private final boolean announceable;
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
        private final String stationCode;
        private final String stopType;
        private final String technicalNumber;
        private final String timeType;
        private final VisualEffectsDTO visualEffects;

        public RouteStepSideDTO(boolean z3, String announceState, String circulationState, String str, int i, String str2, String str3, String str4, String str5, long j4, String str6, String stationCode, String stopType, String timeType, VisualEffectsDTO visualEffects, String str7, String resultantPlatform) {
            Intrinsics.checkNotNullParameter(announceState, "announceState");
            Intrinsics.checkNotNullParameter(circulationState, "circulationState");
            Intrinsics.checkNotNullParameter(stationCode, "stationCode");
            Intrinsics.checkNotNullParameter(stopType, "stopType");
            Intrinsics.checkNotNullParameter(timeType, "timeType");
            Intrinsics.checkNotNullParameter(visualEffects, "visualEffects");
            Intrinsics.checkNotNullParameter(resultantPlatform, "resultantPlatform");
            this.announceable = z3;
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
            this.stationCode = stationCode;
            this.stopType = stopType;
            this.timeType = timeType;
            this.visualEffects = visualEffects;
            this.technicalNumber = str7;
            this.resultantPlatform = resultantPlatform;
        }

        public static /* synthetic */ RouteStepSideDTO copy$default(RouteStepSideDTO routeStepSideDTO, boolean z3, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, long j4, String str8, String str9, String str10, String str11, VisualEffectsDTO visualEffectsDTO, String str12, String str13, int i4, Object obj) {
            String str14;
            String str15;
            boolean z4 = (i4 & 1) != 0 ? routeStepSideDTO.announceable : z3;
            String str16 = (i4 & 2) != 0 ? routeStepSideDTO.announceState : str;
            String str17 = (i4 & 4) != 0 ? routeStepSideDTO.circulationState : str2;
            String str18 = (i4 & 8) != 0 ? routeStepSideDTO.ctcPlatform : str3;
            int i5 = (i4 & 16) != 0 ? routeStepSideDTO.forecastedOrAuditedDelay : i;
            String str19 = (i4 & 32) != 0 ? routeStepSideDTO.observation : str4;
            String str20 = (i4 & 64) != 0 ? routeStepSideDTO.operatorPlatform : str5;
            String str21 = (i4 & 128) != 0 ? routeStepSideDTO.plannedPlatform : str6;
            String str22 = (i4 & 256) != 0 ? routeStepSideDTO.preassignedPlatform : str7;
            long j5 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? routeStepSideDTO.plannedTime : j4;
            String str23 = (i4 & 1024) != 0 ? routeStepSideDTO.sitraPlatform : str8;
            String str24 = (i4 & 2048) != 0 ? routeStepSideDTO.stationCode : str9;
            String str25 = (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? routeStepSideDTO.stopType : str10;
            boolean z5 = z4;
            String str26 = (i4 & 8192) != 0 ? routeStepSideDTO.timeType : str11;
            VisualEffectsDTO visualEffectsDTO2 = (i4 & 16384) != 0 ? routeStepSideDTO.visualEffects : visualEffectsDTO;
            String str27 = (i4 & 32768) != 0 ? routeStepSideDTO.technicalNumber : str12;
            if ((i4 & 65536) != 0) {
                str15 = str27;
                str14 = routeStepSideDTO.resultantPlatform;
            } else {
                str14 = str13;
                str15 = str27;
            }
            return routeStepSideDTO.copy(z5, str16, str17, str18, i5, str19, str20, str21, str22, j5, str23, str24, str25, str26, visualEffectsDTO2, str15, str14);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAnnounceable() {
            return this.announceable;
        }

        /* renamed from: component10, reason: from getter */
        public final long getPlannedTime() {
            return this.plannedTime;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSitraPlatform() {
            return this.sitraPlatform;
        }

        /* renamed from: component12, reason: from getter */
        public final String getStationCode() {
            return this.stationCode;
        }

        /* renamed from: component13, reason: from getter */
        public final String getStopType() {
            return this.stopType;
        }

        /* renamed from: component14, reason: from getter */
        public final String getTimeType() {
            return this.timeType;
        }

        /* renamed from: component15, reason: from getter */
        public final VisualEffectsDTO getVisualEffects() {
            return this.visualEffects;
        }

        /* renamed from: component16, reason: from getter */
        public final String getTechnicalNumber() {
            return this.technicalNumber;
        }

        /* renamed from: component17, reason: from getter */
        public final String getResultantPlatform() {
            return this.resultantPlatform;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAnnounceState() {
            return this.announceState;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCirculationState() {
            return this.circulationState;
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
        public final String getPreassignedPlatform() {
            return this.preassignedPlatform;
        }

        public final RouteStepSideDTO copy(boolean announceable, String announceState, String circulationState, String ctcPlatform, int forecastedOrAuditedDelay, String observation, String operatorPlatform, String plannedPlatform, String preassignedPlatform, long plannedTime, String sitraPlatform, String stationCode, String stopType, String timeType, VisualEffectsDTO visualEffects, String technicalNumber, String resultantPlatform) {
            Intrinsics.checkNotNullParameter(announceState, "announceState");
            Intrinsics.checkNotNullParameter(circulationState, "circulationState");
            Intrinsics.checkNotNullParameter(stationCode, "stationCode");
            Intrinsics.checkNotNullParameter(stopType, "stopType");
            Intrinsics.checkNotNullParameter(timeType, "timeType");
            Intrinsics.checkNotNullParameter(visualEffects, "visualEffects");
            Intrinsics.checkNotNullParameter(resultantPlatform, "resultantPlatform");
            return new RouteStepSideDTO(announceable, announceState, circulationState, ctcPlatform, forecastedOrAuditedDelay, observation, operatorPlatform, plannedPlatform, preassignedPlatform, plannedTime, sitraPlatform, stationCode, stopType, timeType, visualEffects, technicalNumber, resultantPlatform);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RouteStepSideDTO)) {
                return false;
            }
            RouteStepSideDTO routeStepSideDTO = (RouteStepSideDTO) other;
            return this.announceable == routeStepSideDTO.announceable && Intrinsics.areEqual(this.announceState, routeStepSideDTO.announceState) && Intrinsics.areEqual(this.circulationState, routeStepSideDTO.circulationState) && Intrinsics.areEqual(this.ctcPlatform, routeStepSideDTO.ctcPlatform) && this.forecastedOrAuditedDelay == routeStepSideDTO.forecastedOrAuditedDelay && Intrinsics.areEqual(this.observation, routeStepSideDTO.observation) && Intrinsics.areEqual(this.operatorPlatform, routeStepSideDTO.operatorPlatform) && Intrinsics.areEqual(this.plannedPlatform, routeStepSideDTO.plannedPlatform) && Intrinsics.areEqual(this.preassignedPlatform, routeStepSideDTO.preassignedPlatform) && this.plannedTime == routeStepSideDTO.plannedTime && Intrinsics.areEqual(this.sitraPlatform, routeStepSideDTO.sitraPlatform) && Intrinsics.areEqual(this.stationCode, routeStepSideDTO.stationCode) && Intrinsics.areEqual(this.stopType, routeStepSideDTO.stopType) && Intrinsics.areEqual(this.timeType, routeStepSideDTO.timeType) && Intrinsics.areEqual(this.visualEffects, routeStepSideDTO.visualEffects) && Intrinsics.areEqual(this.technicalNumber, routeStepSideDTO.technicalNumber) && Intrinsics.areEqual(this.resultantPlatform, routeStepSideDTO.resultantPlatform);
        }

        public final String getAnnounceState() {
            return this.announceState;
        }

        public final boolean getAnnounceable() {
            return this.announceable;
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

        public final String getStationCode() {
            return this.stationCode;
        }

        public final String getStopType() {
            return this.stopType;
        }

        public final String getTechnicalNumber() {
            return this.technicalNumber;
        }

        public final String getTimeType() {
            return this.timeType;
        }

        public final VisualEffectsDTO getVisualEffects() {
            return this.visualEffects;
        }

        public int hashCode() {
            int d4 = a.d(this.circulationState, a.d(this.announceState, Boolean.hashCode(this.announceable) * 31, 31), 31);
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
            int hashCode4 = (this.visualEffects.hashCode() + a.d(this.timeType, a.d(this.stopType, a.d(this.stationCode, (b4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31), 31)) * 31;
            String str7 = this.technicalNumber;
            return this.resultantPlatform.hashCode() + ((hashCode4 + (str7 != null ? str7.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RouteStepSideDTO(announceable=");
            sb.append(this.announceable);
            sb.append(", announceState=");
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
            sb.append(", stationCode=");
            sb.append(this.stationCode);
            sb.append(", stopType=");
            sb.append(this.stopType);
            sb.append(", timeType=");
            sb.append(this.timeType);
            sb.append(", visualEffects=");
            sb.append(this.visualEffects);
            sb.append(", technicalNumber=");
            sb.append(this.technicalNumber);
            sb.append(", resultantPlatform=");
            return a.n(sb, this.resultantPlatform, ')');
        }
    }

    public RouteStepDTO(RouteStepSideDTO arrivalPassthroughStepSides, RouteStepSideDTO departurePassthroughStepSides) {
        Intrinsics.checkNotNullParameter(arrivalPassthroughStepSides, "arrivalPassthroughStepSides");
        Intrinsics.checkNotNullParameter(departurePassthroughStepSides, "departurePassthroughStepSides");
        this.arrivalPassthroughStepSides = arrivalPassthroughStepSides;
        this.departurePassthroughStepSides = departurePassthroughStepSides;
    }

    public static /* synthetic */ RouteStepDTO copy$default(RouteStepDTO routeStepDTO, RouteStepSideDTO routeStepSideDTO, RouteStepSideDTO routeStepSideDTO2, int i, Object obj) {
        if ((i & 1) != 0) {
            routeStepSideDTO = routeStepDTO.arrivalPassthroughStepSides;
        }
        if ((i & 2) != 0) {
            routeStepSideDTO2 = routeStepDTO.departurePassthroughStepSides;
        }
        return routeStepDTO.copy(routeStepSideDTO, routeStepSideDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final RouteStepSideDTO getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    /* renamed from: component2, reason: from getter */
    public final RouteStepSideDTO getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final RouteStepDTO copy(RouteStepSideDTO arrivalPassthroughStepSides, RouteStepSideDTO departurePassthroughStepSides) {
        Intrinsics.checkNotNullParameter(arrivalPassthroughStepSides, "arrivalPassthroughStepSides");
        Intrinsics.checkNotNullParameter(departurePassthroughStepSides, "departurePassthroughStepSides");
        return new RouteStepDTO(arrivalPassthroughStepSides, departurePassthroughStepSides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteStepDTO)) {
            return false;
        }
        RouteStepDTO routeStepDTO = (RouteStepDTO) other;
        return Intrinsics.areEqual(this.arrivalPassthroughStepSides, routeStepDTO.arrivalPassthroughStepSides) && Intrinsics.areEqual(this.departurePassthroughStepSides, routeStepDTO.departurePassthroughStepSides);
    }

    public final RouteStepSideDTO getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    public final RouteStepSideDTO getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public int hashCode() {
        return this.departurePassthroughStepSides.hashCode() + (this.arrivalPassthroughStepSides.hashCode() * 31);
    }

    public String toString() {
        return "RouteStepDTO(arrivalPassthroughStepSides=" + this.arrivalPassthroughStepSides + ", departurePassthroughStepSides=" + this.departurePassthroughStepSides + ')';
    }
}
