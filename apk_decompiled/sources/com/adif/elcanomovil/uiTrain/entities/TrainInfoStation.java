package com.adif.elcanomovil.uiTrain.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/entities/TrainInfoStation;", "", "stationCode", "", "stationName", "time", "delayedTime", "platform", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDelayedTime", "()Ljava/lang/String;", "getPlatform", "getStationCode", "setStationCode", "(Ljava/lang/String;)V", "getStationName", "setStationName", "getTime", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainInfoStation {
    private final String delayedTime;
    private final String platform;
    private String stationCode;
    private String stationName;
    private final String time;

    public TrainInfoStation(String stationCode, String str, String time, String delayedTime, String platform) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(delayedTime, "delayedTime");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.stationCode = stationCode;
        this.stationName = str;
        this.time = time;
        this.delayedTime = delayedTime;
        this.platform = platform;
    }

    public final String getDelayedTime() {
        return this.delayedTime;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final String getStationName() {
        return this.stationName;
    }

    public final String getTime() {
        return this.time;
    }

    public final void setStationCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stationCode = str;
    }

    public final void setStationName(String str) {
        this.stationName = str;
    }
}
