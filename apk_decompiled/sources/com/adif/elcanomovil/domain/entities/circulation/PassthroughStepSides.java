package com.adif.elcanomovil.domain.entities.circulation;

import C.w;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b;\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0002\u0010\u0019J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003JÓ\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007HÆ\u0001J\u0013\u0010@\u001a\u00020\t2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0005HÖ\u0001J\t\u0010C\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001d¨\u0006D"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStepSides;", "", "plannedTime", "", "forecatedOrAuditedDelay", "", "platform", "", "isPlatformWarning", "", "observation", "immediateDeparture", "countDown", "showDelay", "isSuppressed", "isAudited", "isAnnounceable", "isMuted", "operatorPlatform", "plannedPlatform", "preassignedPlatform", "sitraPlatform", "ctcPlatform", "technicalNumber", "resultantPlatform", "(JILjava/lang/String;ZLjava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountDown", "()Z", "getCtcPlatform", "()Ljava/lang/String;", "getForecatedOrAuditedDelay", "()I", "getImmediateDeparture", "getObservation", "getOperatorPlatform", "getPlannedPlatform", "getPlannedTime", "()J", "getPlatform", "getPreassignedPlatform", "getResultantPlatform", "getShowDelay", "getSitraPlatform", "getTechnicalNumber", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PassthroughStepSides {
    private final boolean countDown;
    private final String ctcPlatform;
    private final int forecatedOrAuditedDelay;
    private final boolean immediateDeparture;
    private final boolean isAnnounceable;
    private final boolean isAudited;
    private final boolean isMuted;
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
    private final String technicalNumber;

    public PassthroughStepSides(long j4, int i, String platform, boolean z3, String observation, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, String resultantPlatform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(observation, "observation");
        Intrinsics.checkNotNullParameter(resultantPlatform, "resultantPlatform");
        this.plannedTime = j4;
        this.forecatedOrAuditedDelay = i;
        this.platform = platform;
        this.isPlatformWarning = z3;
        this.observation = observation;
        this.immediateDeparture = z4;
        this.countDown = z5;
        this.showDelay = z6;
        this.isSuppressed = z7;
        this.isAudited = z8;
        this.isAnnounceable = z9;
        this.isMuted = z10;
        this.operatorPlatform = str;
        this.plannedPlatform = str2;
        this.preassignedPlatform = str3;
        this.sitraPlatform = str4;
        this.ctcPlatform = str5;
        this.technicalNumber = str6;
        this.resultantPlatform = resultantPlatform;
    }

    public static /* synthetic */ PassthroughStepSides copy$default(PassthroughStepSides passthroughStepSides, long j4, int i, String str, boolean z3, String str2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i4, Object obj) {
        String str10;
        String str11;
        long j5 = (i4 & 1) != 0 ? passthroughStepSides.plannedTime : j4;
        int i5 = (i4 & 2) != 0 ? passthroughStepSides.forecatedOrAuditedDelay : i;
        String str12 = (i4 & 4) != 0 ? passthroughStepSides.platform : str;
        boolean z11 = (i4 & 8) != 0 ? passthroughStepSides.isPlatformWarning : z3;
        String str13 = (i4 & 16) != 0 ? passthroughStepSides.observation : str2;
        boolean z12 = (i4 & 32) != 0 ? passthroughStepSides.immediateDeparture : z4;
        boolean z13 = (i4 & 64) != 0 ? passthroughStepSides.countDown : z5;
        boolean z14 = (i4 & 128) != 0 ? passthroughStepSides.showDelay : z6;
        boolean z15 = (i4 & 256) != 0 ? passthroughStepSides.isSuppressed : z7;
        boolean z16 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? passthroughStepSides.isAudited : z8;
        boolean z17 = (i4 & 1024) != 0 ? passthroughStepSides.isAnnounceable : z9;
        boolean z18 = (i4 & 2048) != 0 ? passthroughStepSides.isMuted : z10;
        String str14 = (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? passthroughStepSides.operatorPlatform : str3;
        long j6 = j5;
        String str15 = (i4 & 8192) != 0 ? passthroughStepSides.plannedPlatform : str4;
        String str16 = (i4 & 16384) != 0 ? passthroughStepSides.preassignedPlatform : str5;
        String str17 = (i4 & 32768) != 0 ? passthroughStepSides.sitraPlatform : str6;
        String str18 = (i4 & 65536) != 0 ? passthroughStepSides.ctcPlatform : str7;
        String str19 = (i4 & 131072) != 0 ? passthroughStepSides.technicalNumber : str8;
        if ((i4 & 262144) != 0) {
            str11 = str19;
            str10 = passthroughStepSides.resultantPlatform;
        } else {
            str10 = str9;
            str11 = str19;
        }
        return passthroughStepSides.copy(j6, i5, str12, z11, str13, z12, z13, z14, z15, z16, z17, z18, str14, str15, str16, str17, str18, str11, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPlannedTime() {
        return this.plannedTime;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsAudited() {
        return this.isAudited;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsAnnounceable() {
        return this.isAnnounceable;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    /* renamed from: component13, reason: from getter */
    public final String getOperatorPlatform() {
        return this.operatorPlatform;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPlannedPlatform() {
        return this.plannedPlatform;
    }

    /* renamed from: component15, reason: from getter */
    public final String getPreassignedPlatform() {
        return this.preassignedPlatform;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSitraPlatform() {
        return this.sitraPlatform;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCtcPlatform() {
        return this.ctcPlatform;
    }

    /* renamed from: component18, reason: from getter */
    public final String getTechnicalNumber() {
        return this.technicalNumber;
    }

    /* renamed from: component19, reason: from getter */
    public final String getResultantPlatform() {
        return this.resultantPlatform;
    }

    /* renamed from: component2, reason: from getter */
    public final int getForecatedOrAuditedDelay() {
        return this.forecatedOrAuditedDelay;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPlatformWarning() {
        return this.isPlatformWarning;
    }

    /* renamed from: component5, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getImmediateDeparture() {
        return this.immediateDeparture;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getCountDown() {
        return this.countDown;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowDelay() {
        return this.showDelay;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsSuppressed() {
        return this.isSuppressed;
    }

    public final PassthroughStepSides copy(long plannedTime, int forecatedOrAuditedDelay, String platform, boolean isPlatformWarning, String observation, boolean immediateDeparture, boolean countDown, boolean showDelay, boolean isSuppressed, boolean isAudited, boolean isAnnounceable, boolean isMuted, String operatorPlatform, String plannedPlatform, String preassignedPlatform, String sitraPlatform, String ctcPlatform, String technicalNumber, String resultantPlatform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(observation, "observation");
        Intrinsics.checkNotNullParameter(resultantPlatform, "resultantPlatform");
        return new PassthroughStepSides(plannedTime, forecatedOrAuditedDelay, platform, isPlatformWarning, observation, immediateDeparture, countDown, showDelay, isSuppressed, isAudited, isAnnounceable, isMuted, operatorPlatform, plannedPlatform, preassignedPlatform, sitraPlatform, ctcPlatform, technicalNumber, resultantPlatform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassthroughStepSides)) {
            return false;
        }
        PassthroughStepSides passthroughStepSides = (PassthroughStepSides) other;
        return this.plannedTime == passthroughStepSides.plannedTime && this.forecatedOrAuditedDelay == passthroughStepSides.forecatedOrAuditedDelay && Intrinsics.areEqual(this.platform, passthroughStepSides.platform) && this.isPlatformWarning == passthroughStepSides.isPlatformWarning && Intrinsics.areEqual(this.observation, passthroughStepSides.observation) && this.immediateDeparture == passthroughStepSides.immediateDeparture && this.countDown == passthroughStepSides.countDown && this.showDelay == passthroughStepSides.showDelay && this.isSuppressed == passthroughStepSides.isSuppressed && this.isAudited == passthroughStepSides.isAudited && this.isAnnounceable == passthroughStepSides.isAnnounceable && this.isMuted == passthroughStepSides.isMuted && Intrinsics.areEqual(this.operatorPlatform, passthroughStepSides.operatorPlatform) && Intrinsics.areEqual(this.plannedPlatform, passthroughStepSides.plannedPlatform) && Intrinsics.areEqual(this.preassignedPlatform, passthroughStepSides.preassignedPlatform) && Intrinsics.areEqual(this.sitraPlatform, passthroughStepSides.sitraPlatform) && Intrinsics.areEqual(this.ctcPlatform, passthroughStepSides.ctcPlatform) && Intrinsics.areEqual(this.technicalNumber, passthroughStepSides.technicalNumber) && Intrinsics.areEqual(this.resultantPlatform, passthroughStepSides.resultantPlatform);
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

    public final String getTechnicalNumber() {
        return this.technicalNumber;
    }

    public int hashCode() {
        int c4 = w.c(w.c(w.c(w.c(w.c(w.c(w.c(a.d(this.observation, w.c(a.d(this.platform, w.x(this.forecatedOrAuditedDelay, Long.hashCode(this.plannedTime) * 31, 31), 31), 31, this.isPlatformWarning), 31), 31, this.immediateDeparture), 31, this.countDown), 31, this.showDelay), 31, this.isSuppressed), 31, this.isAudited), 31, this.isAnnounceable), 31, this.isMuted);
        String str = this.operatorPlatform;
        int hashCode = (c4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.plannedPlatform;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.preassignedPlatform;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sitraPlatform;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ctcPlatform;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.technicalNumber;
        return this.resultantPlatform.hashCode() + ((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final boolean isAnnounceable() {
        return this.isAnnounceable;
    }

    public final boolean isAudited() {
        return this.isAudited;
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final boolean isPlatformWarning() {
        return this.isPlatformWarning;
    }

    public final boolean isSuppressed() {
        return this.isSuppressed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PassthroughStepSides(plannedTime=");
        sb.append(this.plannedTime);
        sb.append(", forecatedOrAuditedDelay=");
        sb.append(this.forecatedOrAuditedDelay);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", isPlatformWarning=");
        sb.append(this.isPlatformWarning);
        sb.append(", observation=");
        sb.append(this.observation);
        sb.append(", immediateDeparture=");
        sb.append(this.immediateDeparture);
        sb.append(", countDown=");
        sb.append(this.countDown);
        sb.append(", showDelay=");
        sb.append(this.showDelay);
        sb.append(", isSuppressed=");
        sb.append(this.isSuppressed);
        sb.append(", isAudited=");
        sb.append(this.isAudited);
        sb.append(", isAnnounceable=");
        sb.append(this.isAnnounceable);
        sb.append(", isMuted=");
        sb.append(this.isMuted);
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
