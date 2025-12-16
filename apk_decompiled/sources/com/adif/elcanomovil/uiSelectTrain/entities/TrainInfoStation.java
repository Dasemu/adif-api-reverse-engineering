package com.adif.elcanomovil.uiSelectTrain.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainInfoStation;", "", "stationCode", "", "stationName", "(Ljava/lang/String;Ljava/lang/String;)V", "getStationCode", "()Ljava/lang/String;", "getStationName", "setStationName", "(Ljava/lang/String;)V", "ui-select-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrainInfoStation {
    private final String stationCode;
    private String stationName;

    public TrainInfoStation(String stationCode, String str) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        this.stationCode = stationCode;
        this.stationName = str;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final String getStationName() {
        return this.stationName;
    }

    public final void setStationName(String str) {
        this.stationName = str;
    }
}
