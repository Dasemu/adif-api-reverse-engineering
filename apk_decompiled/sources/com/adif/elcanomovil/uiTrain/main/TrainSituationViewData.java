package com.adif.elcanomovil.uiTrain.main;

import com.adif.elcanomovil.uiTrain.entities.TrainInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewData;", "", "()V", "Data", "Error", "Loading", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewData$Data;", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewData$Error;", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewData$Loading;", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TrainSituationViewData {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewData$Data;", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewData;", "results", "", "Lcom/adif/elcanomovil/uiTrain/entities/TrainInfo;", "(Ljava/util/List;)V", "getResults", "()Ljava/util/List;", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Data extends TrainSituationViewData {
        private final List<TrainInfo> results;

        public Data(List<TrainInfo> list) {
            super(null);
            this.results = list;
        }

        public final List<TrainInfo> getResults() {
            return this.results;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewData$Error;", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewData;", "()V", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Error extends TrainSituationViewData {
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewData$Loading;", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewData;", "()V", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
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
