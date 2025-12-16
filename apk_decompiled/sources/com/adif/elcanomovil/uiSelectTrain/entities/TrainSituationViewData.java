package com.adif.elcanomovil.uiSelectTrain.entities;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData;", "", "()V", "Data", "Empty", "Error", "Loading", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData$Data;", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData$Empty;", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData$Error;", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData$Loading;", "ui-select-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class TrainSituationViewData {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData$Data;", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData;", "results", "", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainInfo;", "(Ljava/util/List;)V", "getResults", "()Ljava/util/List;", "ui-select-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Data extends TrainSituationViewData {
        private final List<TrainInfo> results;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(List<TrainInfo> results) {
            super(null);
            Intrinsics.checkNotNullParameter(results, "results");
            this.results = results;
        }

        public final List<TrainInfo> getResults() {
            return this.results;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData$Empty;", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData;", "()V", "ui-select-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Empty extends TrainSituationViewData {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData$Error;", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData;", "()V", "ui-select-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Error extends TrainSituationViewData {
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData$Loading;", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData;", "()V", "ui-select-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Loading extends TrainSituationViewData {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    public /* synthetic */ TrainSituationViewData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TrainSituationViewData() {
    }
}
