package com.adif.elcanomovil.domain.entities;

import C.w;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0012HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u008a\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0005HÖ\u0001J\t\u00107\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0017R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u0002\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$¨\u00068"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/PassthroughStepSides;", "", "isCommercial", "", "stationCode", "", "plannedTime", "", "forecatedOrAuditedDelay", "platform", "", "observation", "immediateDeparture", "countDown", "showDelay", "isSuppressed", "isAudited", "announceState", "Lcom/adif/elcanomovil/domain/entities/AnnounceState;", "(Ljava/lang/Boolean;Ljava/lang/Integer;JILjava/lang/String;Ljava/lang/String;ZZZZZLcom/adif/elcanomovil/domain/entities/AnnounceState;)V", "getAnnounceState", "()Lcom/adif/elcanomovil/domain/entities/AnnounceState;", "getCountDown", "()Z", "getForecatedOrAuditedDelay", "()I", "getImmediateDeparture", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getObservation", "()Ljava/lang/String;", "getPlannedTime", "()J", "getPlatform", "getShowDelay", "getStationCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;JILjava/lang/String;Ljava/lang/String;ZZZZZLcom/adif/elcanomovil/domain/entities/AnnounceState;)Lcom/adif/elcanomovil/domain/entities/PassthroughStepSides;", "equals", "other", "hashCode", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PassthroughStepSides {
    private final AnnounceState announceState;
    private final boolean countDown;
    private final int forecatedOrAuditedDelay;
    private final boolean immediateDeparture;
    private final boolean isAudited;
    private final Boolean isCommercial;
    private final boolean isSuppressed;
    private final String observation;
    private final long plannedTime;
    private final String platform;
    private final boolean showDelay;
    private final Integer stationCode;

    public PassthroughStepSides(Boolean bool, Integer num, long j4, int i, String platform, String observation, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, AnnounceState announceState) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(observation, "observation");
        Intrinsics.checkNotNullParameter(announceState, "announceState");
        this.isCommercial = bool;
        this.stationCode = num;
        this.plannedTime = j4;
        this.forecatedOrAuditedDelay = i;
        this.platform = platform;
        this.observation = observation;
        this.immediateDeparture = z3;
        this.countDown = z4;
        this.showDelay = z5;
        this.isSuppressed = z6;
        this.isAudited = z7;
        this.announceState = announceState;
    }

    public static /* synthetic */ PassthroughStepSides copy$default(PassthroughStepSides passthroughStepSides, Boolean bool, Integer num, long j4, int i, String str, String str2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, AnnounceState announceState, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bool = passthroughStepSides.isCommercial;
        }
        return passthroughStepSides.copy(bool, (i4 & 2) != 0 ? passthroughStepSides.stationCode : num, (i4 & 4) != 0 ? passthroughStepSides.plannedTime : j4, (i4 & 8) != 0 ? passthroughStepSides.forecatedOrAuditedDelay : i, (i4 & 16) != 0 ? passthroughStepSides.platform : str, (i4 & 32) != 0 ? passthroughStepSides.observation : str2, (i4 & 64) != 0 ? passthroughStepSides.immediateDeparture : z3, (i4 & 128) != 0 ? passthroughStepSides.countDown : z4, (i4 & 256) != 0 ? passthroughStepSides.showDelay : z5, (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? passthroughStepSides.isSuppressed : z6, (i4 & 1024) != 0 ? passthroughStepSides.isAudited : z7, (i4 & 2048) != 0 ? passthroughStepSides.announceState : announceState);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsCommercial() {
        return this.isCommercial;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsSuppressed() {
        return this.isSuppressed;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsAudited() {
        return this.isAudited;
    }

    /* renamed from: component12, reason: from getter */
    public final AnnounceState getAnnounceState() {
        return this.announceState;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPlannedTime() {
        return this.plannedTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getForecatedOrAuditedDelay() {
        return this.forecatedOrAuditedDelay;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component6, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getImmediateDeparture() {
        return this.immediateDeparture;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getCountDown() {
        return this.countDown;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowDelay() {
        return this.showDelay;
    }

    public final PassthroughStepSides copy(Boolean isCommercial, Integer stationCode, long plannedTime, int forecatedOrAuditedDelay, String platform, String observation, boolean immediateDeparture, boolean countDown, boolean showDelay, boolean isSuppressed, boolean isAudited, AnnounceState announceState) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(observation, "observation");
        Intrinsics.checkNotNullParameter(announceState, "announceState");
        return new PassthroughStepSides(isCommercial, stationCode, plannedTime, forecatedOrAuditedDelay, platform, observation, immediateDeparture, countDown, showDelay, isSuppressed, isAudited, announceState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassthroughStepSides)) {
            return false;
        }
        PassthroughStepSides passthroughStepSides = (PassthroughStepSides) other;
        return Intrinsics.areEqual(this.isCommercial, passthroughStepSides.isCommercial) && Intrinsics.areEqual(this.stationCode, passthroughStepSides.stationCode) && this.plannedTime == passthroughStepSides.plannedTime && this.forecatedOrAuditedDelay == passthroughStepSides.forecatedOrAuditedDelay && Intrinsics.areEqual(this.platform, passthroughStepSides.platform) && Intrinsics.areEqual(this.observation, passthroughStepSides.observation) && this.immediateDeparture == passthroughStepSides.immediateDeparture && this.countDown == passthroughStepSides.countDown && this.showDelay == passthroughStepSides.showDelay && this.isSuppressed == passthroughStepSides.isSuppressed && this.isAudited == passthroughStepSides.isAudited && this.announceState == passthroughStepSides.announceState;
    }

    public final AnnounceState getAnnounceState() {
        return this.announceState;
    }

    public final boolean getCountDown() {
        return this.countDown;
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

    public final long getPlannedTime() {
        return this.plannedTime;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final boolean getShowDelay() {
        return this.showDelay;
    }

    public final Integer getStationCode() {
        return this.stationCode;
    }

    public int hashCode() {
        Boolean bool = this.isCommercial;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.stationCode;
        return this.announceState.hashCode() + w.c(w.c(w.c(w.c(w.c(a.d(this.observation, a.d(this.platform, w.x(this.forecatedOrAuditedDelay, a.b(this.plannedTime, (hashCode + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31), 31), 31, this.immediateDeparture), 31, this.countDown), 31, this.showDelay), 31, this.isSuppressed), 31, this.isAudited);
    }

    public final boolean isAudited() {
        return this.isAudited;
    }

    public final Boolean isCommercial() {
        return this.isCommercial;
    }

    public final boolean isSuppressed() {
        return this.isSuppressed;
    }

    public String toString() {
        return "PassthroughStepSides(isCommercial=" + this.isCommercial + ", stationCode=" + this.stationCode + ", plannedTime=" + this.plannedTime + ", forecatedOrAuditedDelay=" + this.forecatedOrAuditedDelay + ", platform=" + this.platform + ", observation=" + this.observation + ", immediateDeparture=" + this.immediateDeparture + ", countDown=" + this.countDown + ", showDelay=" + this.showDelay + ", isSuppressed=" + this.isSuppressed + ", isAudited=" + this.isAudited + ", announceState=" + this.announceState + ')';
    }
}
