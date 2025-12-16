package com.adif.elcanomovil.domain.entities.circulation;

import C.w;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001a\u001a\u00020\f¢\u0006\u0002\u0010\u001bJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\nHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010D\u001a\u00020\u000eHÆ\u0003Jé\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001a\u001a\u00020\fHÆ\u0001J\u0013\u0010F\u001a\u00020\u00032\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\nHÖ\u0001J\t\u0010I\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u001a\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0012\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 ¨\u0006J"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/RouteStepSide;", "", "announceable", "", "countDown", "immediateDeparture", "isAudited", "isCommercial", "isSuppressed", "forecatedOrAuditedDelay", "", "observation", "", "plannedTime", "", "platform", "isPlatformWarning", "isPlatformMuted", "stationCode", "showDelay", "operatorPlatform", "plannedPlatform", "preassignedPlatform", "sitraPlatform", "ctcPlatform", "technicalNumber", "resultantPlatform", "(ZZZZZZILjava/lang/String;JLjava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAnnounceable", "()Z", "getCountDown", "getCtcPlatform", "()Ljava/lang/String;", "getForecatedOrAuditedDelay", "()I", "getImmediateDeparture", "getObservation", "getOperatorPlatform", "getPlannedPlatform", "getPlannedTime", "()J", "getPlatform", "getPreassignedPlatform", "getResultantPlatform", "getShowDelay", "getSitraPlatform", "getStationCode", "getTechnicalNumber", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RouteStepSide {
    private final boolean announceable;
    private final boolean countDown;
    private final String ctcPlatform;
    private final int forecatedOrAuditedDelay;
    private final boolean immediateDeparture;
    private final boolean isAudited;
    private final boolean isCommercial;
    private final boolean isPlatformMuted;
    private final boolean isPlatformWarning;
    private final boolean isSuppressed;
    private final String observation;
    private final String operatorPlatform;
    private final String plannedPlatform;
    private final long plannedTime;
    private final String platform;
    private final String preassignedPlatform;
    private final String resultantPlatform;
    private final boolean showDelay;
    private final String sitraPlatform;
    private final String stationCode;
    private final String technicalNumber;

    public RouteStepSide(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, String str, long j4, String platform, boolean z9, boolean z10, String stationCode, boolean z11, String str2, String str3, String str4, String str5, String str6, String str7, String resultantPlatform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(resultantPlatform, "resultantPlatform");
        this.announceable = z3;
        this.countDown = z4;
        this.immediateDeparture = z5;
        this.isAudited = z6;
        this.isCommercial = z7;
        this.isSuppressed = z8;
        this.forecatedOrAuditedDelay = i;
        this.observation = str;
        this.plannedTime = j4;
        this.platform = platform;
        this.isPlatformWarning = z9;
        this.isPlatformMuted = z10;
        this.stationCode = stationCode;
        this.showDelay = z11;
        this.operatorPlatform = str2;
        this.plannedPlatform = str3;
        this.preassignedPlatform = str4;
        this.sitraPlatform = str5;
        this.ctcPlatform = str6;
        this.technicalNumber = str7;
        this.resultantPlatform = resultantPlatform;
    }

    public static /* synthetic */ RouteStepSide copy$default(RouteStepSide routeStepSide, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, String str, long j4, String str2, boolean z9, boolean z10, String str3, boolean z11, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i4, Object obj) {
        String str11;
        String str12;
        boolean z12 = (i4 & 1) != 0 ? routeStepSide.announceable : z3;
        boolean z13 = (i4 & 2) != 0 ? routeStepSide.countDown : z4;
        boolean z14 = (i4 & 4) != 0 ? routeStepSide.immediateDeparture : z5;
        boolean z15 = (i4 & 8) != 0 ? routeStepSide.isAudited : z6;
        boolean z16 = (i4 & 16) != 0 ? routeStepSide.isCommercial : z7;
        boolean z17 = (i4 & 32) != 0 ? routeStepSide.isSuppressed : z8;
        int i5 = (i4 & 64) != 0 ? routeStepSide.forecatedOrAuditedDelay : i;
        String str13 = (i4 & 128) != 0 ? routeStepSide.observation : str;
        long j5 = (i4 & 256) != 0 ? routeStepSide.plannedTime : j4;
        String str14 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? routeStepSide.platform : str2;
        boolean z18 = (i4 & 1024) != 0 ? routeStepSide.isPlatformWarning : z9;
        boolean z19 = (i4 & 2048) != 0 ? routeStepSide.isPlatformMuted : z10;
        String str15 = (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? routeStepSide.stationCode : str3;
        boolean z20 = z12;
        boolean z21 = (i4 & 8192) != 0 ? routeStepSide.showDelay : z11;
        String str16 = (i4 & 16384) != 0 ? routeStepSide.operatorPlatform : str4;
        String str17 = (i4 & 32768) != 0 ? routeStepSide.plannedPlatform : str5;
        String str18 = (i4 & 65536) != 0 ? routeStepSide.preassignedPlatform : str6;
        String str19 = (i4 & 131072) != 0 ? routeStepSide.sitraPlatform : str7;
        String str20 = (i4 & 262144) != 0 ? routeStepSide.ctcPlatform : str8;
        String str21 = (i4 & 524288) != 0 ? routeStepSide.technicalNumber : str9;
        if ((i4 & 1048576) != 0) {
            str12 = str21;
            str11 = routeStepSide.resultantPlatform;
        } else {
            str11 = str10;
            str12 = str21;
        }
        return routeStepSide.copy(z20, z13, z14, z15, z16, z17, i5, str13, j5, str14, z18, z19, str15, z21, str16, str17, str18, str19, str20, str12, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAnnounceable() {
        return this.announceable;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsPlatformWarning() {
        return this.isPlatformWarning;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsPlatformMuted() {
        return this.isPlatformMuted;
    }

    /* renamed from: component13, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowDelay() {
        return this.showDelay;
    }

    /* renamed from: component15, reason: from getter */
    public final String getOperatorPlatform() {
        return this.operatorPlatform;
    }

    /* renamed from: component16, reason: from getter */
    public final String getPlannedPlatform() {
        return this.plannedPlatform;
    }

    /* renamed from: component17, reason: from getter */
    public final String getPreassignedPlatform() {
        return this.preassignedPlatform;
    }

    /* renamed from: component18, reason: from getter */
    public final String getSitraPlatform() {
        return this.sitraPlatform;
    }

    /* renamed from: component19, reason: from getter */
    public final String getCtcPlatform() {
        return this.ctcPlatform;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCountDown() {
        return this.countDown;
    }

    /* renamed from: component20, reason: from getter */
    public final String getTechnicalNumber() {
        return this.technicalNumber;
    }

    /* renamed from: component21, reason: from getter */
    public final String getResultantPlatform() {
        return this.resultantPlatform;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getImmediateDeparture() {
        return this.immediateDeparture;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAudited() {
        return this.isAudited;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCommercial() {
        return this.isCommercial;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSuppressed() {
        return this.isSuppressed;
    }

    /* renamed from: component7, reason: from getter */
    public final int getForecatedOrAuditedDelay() {
        return this.forecatedOrAuditedDelay;
    }

    /* renamed from: component8, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component9, reason: from getter */
    public final long getPlannedTime() {
        return this.plannedTime;
    }

    public final RouteStepSide copy(boolean announceable, boolean countDown, boolean immediateDeparture, boolean isAudited, boolean isCommercial, boolean isSuppressed, int forecatedOrAuditedDelay, String observation, long plannedTime, String platform, boolean isPlatformWarning, boolean isPlatformMuted, String stationCode, boolean showDelay, String operatorPlatform, String plannedPlatform, String preassignedPlatform, String sitraPlatform, String ctcPlatform, String technicalNumber, String resultantPlatform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(resultantPlatform, "resultantPlatform");
        return new RouteStepSide(announceable, countDown, immediateDeparture, isAudited, isCommercial, isSuppressed, forecatedOrAuditedDelay, observation, plannedTime, platform, isPlatformWarning, isPlatformMuted, stationCode, showDelay, operatorPlatform, plannedPlatform, preassignedPlatform, sitraPlatform, ctcPlatform, technicalNumber, resultantPlatform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteStepSide)) {
            return false;
        }
        RouteStepSide routeStepSide = (RouteStepSide) other;
        return this.announceable == routeStepSide.announceable && this.countDown == routeStepSide.countDown && this.immediateDeparture == routeStepSide.immediateDeparture && this.isAudited == routeStepSide.isAudited && this.isCommercial == routeStepSide.isCommercial && this.isSuppressed == routeStepSide.isSuppressed && this.forecatedOrAuditedDelay == routeStepSide.forecatedOrAuditedDelay && Intrinsics.areEqual(this.observation, routeStepSide.observation) && this.plannedTime == routeStepSide.plannedTime && Intrinsics.areEqual(this.platform, routeStepSide.platform) && this.isPlatformWarning == routeStepSide.isPlatformWarning && this.isPlatformMuted == routeStepSide.isPlatformMuted && Intrinsics.areEqual(this.stationCode, routeStepSide.stationCode) && this.showDelay == routeStepSide.showDelay && Intrinsics.areEqual(this.operatorPlatform, routeStepSide.operatorPlatform) && Intrinsics.areEqual(this.plannedPlatform, routeStepSide.plannedPlatform) && Intrinsics.areEqual(this.preassignedPlatform, routeStepSide.preassignedPlatform) && Intrinsics.areEqual(this.sitraPlatform, routeStepSide.sitraPlatform) && Intrinsics.areEqual(this.ctcPlatform, routeStepSide.ctcPlatform) && Intrinsics.areEqual(this.technicalNumber, routeStepSide.technicalNumber) && Intrinsics.areEqual(this.resultantPlatform, routeStepSide.resultantPlatform);
    }

    public final boolean getAnnounceable() {
        return this.announceable;
    }

    public final boolean getCountDown() {
        return this.countDown;
    }

    public final String getCtcPlatform() {
        return this.ctcPlatform;
    }

    public final int getForecatedOrAuditedDelay() {
        return this.forecatedOrAuditedDelay;
    }

    public final boolean getImmediateDeparture() {
        return this.immediateDeparture;
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

    public final String getPlatform() {
        return this.platform;
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

    public final String getStationCode() {
        return this.stationCode;
    }

    public final String getTechnicalNumber() {
        return this.technicalNumber;
    }

    public int hashCode() {
        int x3 = w.x(this.forecatedOrAuditedDelay, w.c(w.c(w.c(w.c(w.c(Boolean.hashCode(this.announceable) * 31, 31, this.countDown), 31, this.immediateDeparture), 31, this.isAudited), 31, this.isCommercial), 31, this.isSuppressed), 31);
        String str = this.observation;
        int c4 = w.c(a.d(this.stationCode, w.c(w.c(a.d(this.platform, a.b(this.plannedTime, (x3 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.isPlatformWarning), 31, this.isPlatformMuted), 31), 31, this.showDelay);
        String str2 = this.operatorPlatform;
        int hashCode = (c4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.plannedPlatform;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.preassignedPlatform;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sitraPlatform;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ctcPlatform;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.technicalNumber;
        return this.resultantPlatform.hashCode() + ((hashCode5 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final boolean isAudited() {
        return this.isAudited;
    }

    public final boolean isCommercial() {
        return this.isCommercial;
    }

    public final boolean isPlatformMuted() {
        return this.isPlatformMuted;
    }

    public final boolean isPlatformWarning() {
        return this.isPlatformWarning;
    }

    public final boolean isSuppressed() {
        return this.isSuppressed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RouteStepSide(announceable=");
        sb.append(this.announceable);
        sb.append(", countDown=");
        sb.append(this.countDown);
        sb.append(", immediateDeparture=");
        sb.append(this.immediateDeparture);
        sb.append(", isAudited=");
        sb.append(this.isAudited);
        sb.append(", isCommercial=");
        sb.append(this.isCommercial);
        sb.append(", isSuppressed=");
        sb.append(this.isSuppressed);
        sb.append(", forecatedOrAuditedDelay=");
        sb.append(this.forecatedOrAuditedDelay);
        sb.append(", observation=");
        sb.append(this.observation);
        sb.append(", plannedTime=");
        sb.append(this.plannedTime);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", isPlatformWarning=");
        sb.append(this.isPlatformWarning);
        sb.append(", isPlatformMuted=");
        sb.append(this.isPlatformMuted);
        sb.append(", stationCode=");
        sb.append(this.stationCode);
        sb.append(", showDelay=");
        sb.append(this.showDelay);
        sb.append(", operatorPlatform=");
        sb.append(this.operatorPlatform);
        sb.append(", plannedPlatform=");
        sb.append(this.plannedPlatform);
        sb.append(", preassignedPlatform=");
        sb.append(this.preassignedPlatform);
        sb.append(", sitraPlatform=");
        sb.append(this.sitraPlatform);
        sb.append(", ctcPlatform=");
        sb.append(this.ctcPlatform);
        sb.append(", technicalNumber=");
        sb.append(this.technicalNumber);
        sb.append(", resultantPlatform=");
        return a.n(sb, this.resultantPlatform, ')');
    }
}
