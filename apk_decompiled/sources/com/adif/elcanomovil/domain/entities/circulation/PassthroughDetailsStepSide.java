package com.adif.elcanomovil.domain.entities.circulation;

import C.w;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0017J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003JÃ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010;\u001a\u00020\u00032\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0007HÖ\u0001J\t\u0010>\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006?"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStepSide;", "", "isAnnounceable", "", "isAudited", "isSuppressed", "forecastedOrAuditedDelay", "", "observation", "", "plannedTime", "", "platform", "platformMuted", "isPlatformWarning", "showDelay", "operatorPlatform", "plannedPlatform", "sitraPlatform", "ctcPlatform", "technicalNumber", "resultantPlatform", "preassignedPlatform", "(ZZZILjava/lang/String;JLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCtcPlatform", "()Ljava/lang/String;", "getForecastedOrAuditedDelay", "()I", "()Z", "getObservation", "getOperatorPlatform", "getPlannedPlatform", "getPlannedTime", "()J", "getPlatform", "getPlatformMuted", "getPreassignedPlatform", "getResultantPlatform", "getShowDelay", "getSitraPlatform", "getTechnicalNumber", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PassthroughDetailsStepSide {
    private final String ctcPlatform;
    private final int forecastedOrAuditedDelay;
    private final boolean isAnnounceable;
    private final boolean isAudited;
    private final boolean isPlatformWarning;
    private final boolean isSuppressed;
    private final String observation;
    private final String operatorPlatform;
    private final String plannedPlatform;
    private final long plannedTime;
    private final String platform;
    private final boolean platformMuted;
    private final String preassignedPlatform;
    private final String resultantPlatform;
    private final boolean showDelay;
    private final String sitraPlatform;
    private final String technicalNumber;

    public PassthroughDetailsStepSide(boolean z3, boolean z4, boolean z5, int i, String str, long j4, String platform, boolean z6, boolean z7, boolean z8, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.isAnnounceable = z3;
        this.isAudited = z4;
        this.isSuppressed = z5;
        this.forecastedOrAuditedDelay = i;
        this.observation = str;
        this.plannedTime = j4;
        this.platform = platform;
        this.platformMuted = z6;
        this.isPlatformWarning = z7;
        this.showDelay = z8;
        this.operatorPlatform = str2;
        this.plannedPlatform = str3;
        this.sitraPlatform = str4;
        this.ctcPlatform = str5;
        this.technicalNumber = str6;
        this.resultantPlatform = str7;
        this.preassignedPlatform = str8;
    }

    public static /* synthetic */ PassthroughDetailsStepSide copy$default(PassthroughDetailsStepSide passthroughDetailsStepSide, boolean z3, boolean z4, boolean z5, int i, String str, long j4, String str2, boolean z6, boolean z7, boolean z8, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i4, Object obj) {
        String str10;
        String str11;
        boolean z9 = (i4 & 1) != 0 ? passthroughDetailsStepSide.isAnnounceable : z3;
        boolean z10 = (i4 & 2) != 0 ? passthroughDetailsStepSide.isAudited : z4;
        boolean z11 = (i4 & 4) != 0 ? passthroughDetailsStepSide.isSuppressed : z5;
        int i5 = (i4 & 8) != 0 ? passthroughDetailsStepSide.forecastedOrAuditedDelay : i;
        String str12 = (i4 & 16) != 0 ? passthroughDetailsStepSide.observation : str;
        long j5 = (i4 & 32) != 0 ? passthroughDetailsStepSide.plannedTime : j4;
        String str13 = (i4 & 64) != 0 ? passthroughDetailsStepSide.platform : str2;
        boolean z12 = (i4 & 128) != 0 ? passthroughDetailsStepSide.platformMuted : z6;
        boolean z13 = (i4 & 256) != 0 ? passthroughDetailsStepSide.isPlatformWarning : z7;
        boolean z14 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? passthroughDetailsStepSide.showDelay : z8;
        String str14 = (i4 & 1024) != 0 ? passthroughDetailsStepSide.operatorPlatform : str3;
        String str15 = (i4 & 2048) != 0 ? passthroughDetailsStepSide.plannedPlatform : str4;
        String str16 = (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? passthroughDetailsStepSide.sitraPlatform : str5;
        boolean z15 = z9;
        String str17 = (i4 & 8192) != 0 ? passthroughDetailsStepSide.ctcPlatform : str6;
        String str18 = (i4 & 16384) != 0 ? passthroughDetailsStepSide.technicalNumber : str7;
        String str19 = (i4 & 32768) != 0 ? passthroughDetailsStepSide.resultantPlatform : str8;
        if ((i4 & 65536) != 0) {
            str11 = str19;
            str10 = passthroughDetailsStepSide.preassignedPlatform;
        } else {
            str10 = str9;
            str11 = str19;
        }
        return passthroughDetailsStepSide.copy(z15, z10, z11, i5, str12, j5, str13, z12, z13, z14, str14, str15, str16, str17, str18, str11, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAnnounceable() {
        return this.isAnnounceable;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowDelay() {
        return this.showDelay;
    }

    /* renamed from: component11, reason: from getter */
    public final String getOperatorPlatform() {
        return this.operatorPlatform;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPlannedPlatform() {
        return this.plannedPlatform;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSitraPlatform() {
        return this.sitraPlatform;
    }

    /* renamed from: component14, reason: from getter */
    public final String getCtcPlatform() {
        return this.ctcPlatform;
    }

    /* renamed from: component15, reason: from getter */
    public final String getTechnicalNumber() {
        return this.technicalNumber;
    }

    /* renamed from: component16, reason: from getter */
    public final String getResultantPlatform() {
        return this.resultantPlatform;
    }

    /* renamed from: component17, reason: from getter */
    public final String getPreassignedPlatform() {
        return this.preassignedPlatform;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAudited() {
        return this.isAudited;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSuppressed() {
        return this.isSuppressed;
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
    public final long getPlannedTime() {
        return this.plannedTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getPlatformMuted() {
        return this.platformMuted;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsPlatformWarning() {
        return this.isPlatformWarning;
    }

    public final PassthroughDetailsStepSide copy(boolean isAnnounceable, boolean isAudited, boolean isSuppressed, int forecastedOrAuditedDelay, String observation, long plannedTime, String platform, boolean platformMuted, boolean isPlatformWarning, boolean showDelay, String operatorPlatform, String plannedPlatform, String sitraPlatform, String ctcPlatform, String technicalNumber, String resultantPlatform, String preassignedPlatform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new PassthroughDetailsStepSide(isAnnounceable, isAudited, isSuppressed, forecastedOrAuditedDelay, observation, plannedTime, platform, platformMuted, isPlatformWarning, showDelay, operatorPlatform, plannedPlatform, sitraPlatform, ctcPlatform, technicalNumber, resultantPlatform, preassignedPlatform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassthroughDetailsStepSide)) {
            return false;
        }
        PassthroughDetailsStepSide passthroughDetailsStepSide = (PassthroughDetailsStepSide) other;
        return this.isAnnounceable == passthroughDetailsStepSide.isAnnounceable && this.isAudited == passthroughDetailsStepSide.isAudited && this.isSuppressed == passthroughDetailsStepSide.isSuppressed && this.forecastedOrAuditedDelay == passthroughDetailsStepSide.forecastedOrAuditedDelay && Intrinsics.areEqual(this.observation, passthroughDetailsStepSide.observation) && this.plannedTime == passthroughDetailsStepSide.plannedTime && Intrinsics.areEqual(this.platform, passthroughDetailsStepSide.platform) && this.platformMuted == passthroughDetailsStepSide.platformMuted && this.isPlatformWarning == passthroughDetailsStepSide.isPlatformWarning && this.showDelay == passthroughDetailsStepSide.showDelay && Intrinsics.areEqual(this.operatorPlatform, passthroughDetailsStepSide.operatorPlatform) && Intrinsics.areEqual(this.plannedPlatform, passthroughDetailsStepSide.plannedPlatform) && Intrinsics.areEqual(this.sitraPlatform, passthroughDetailsStepSide.sitraPlatform) && Intrinsics.areEqual(this.ctcPlatform, passthroughDetailsStepSide.ctcPlatform) && Intrinsics.areEqual(this.technicalNumber, passthroughDetailsStepSide.technicalNumber) && Intrinsics.areEqual(this.resultantPlatform, passthroughDetailsStepSide.resultantPlatform) && Intrinsics.areEqual(this.preassignedPlatform, passthroughDetailsStepSide.preassignedPlatform);
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

    public final String getPlatform() {
        return this.platform;
    }

    public final boolean getPlatformMuted() {
        return this.platformMuted;
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
        int x3 = w.x(this.forecastedOrAuditedDelay, w.c(w.c(Boolean.hashCode(this.isAnnounceable) * 31, 31, this.isAudited), 31, this.isSuppressed), 31);
        String str = this.observation;
        int c4 = w.c(w.c(w.c(a.d(this.platform, a.b(this.plannedTime, (x3 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.platformMuted), 31, this.isPlatformWarning), 31, this.showDelay);
        String str2 = this.operatorPlatform;
        int hashCode = (c4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.plannedPlatform;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sitraPlatform;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ctcPlatform;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.technicalNumber;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.resultantPlatform;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.preassignedPlatform;
        return hashCode6 + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean isAnnounceable() {
        return this.isAnnounceable;
    }

    public final boolean isAudited() {
        return this.isAudited;
    }

    public final boolean isPlatformWarning() {
        return this.isPlatformWarning;
    }

    public final boolean isSuppressed() {
        return this.isSuppressed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PassthroughDetailsStepSide(isAnnounceable=");
        sb.append(this.isAnnounceable);
        sb.append(", isAudited=");
        sb.append(this.isAudited);
        sb.append(", isSuppressed=");
        sb.append(this.isSuppressed);
        sb.append(", forecastedOrAuditedDelay=");
        sb.append(this.forecastedOrAuditedDelay);
        sb.append(", observation=");
        sb.append(this.observation);
        sb.append(", plannedTime=");
        sb.append(this.plannedTime);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", platformMuted=");
        sb.append(this.platformMuted);
        sb.append(", isPlatformWarning=");
        sb.append(this.isPlatformWarning);
        sb.append(", showDelay=");
        sb.append(this.showDelay);
        sb.append(", operatorPlatform=");
        sb.append(this.operatorPlatform);
        sb.append(", plannedPlatform=");
        sb.append(this.plannedPlatform);
        sb.append(", sitraPlatform=");
        sb.append(this.sitraPlatform);
        sb.append(", ctcPlatform=");
        sb.append(this.ctcPlatform);
        sb.append(", technicalNumber=");
        sb.append(this.technicalNumber);
        sb.append(", resultantPlatform=");
        sb.append(this.resultantPlatform);
        sb.append(", preassignedPlatform=");
        return a.n(sb, this.preassignedPlatform, ')');
    }
}
