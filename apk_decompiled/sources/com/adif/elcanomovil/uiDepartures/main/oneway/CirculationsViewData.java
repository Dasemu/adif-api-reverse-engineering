package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.entities.circulation.Circulation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData;", "", "()V", "Data", "Error", "ErrorOriginOrDestinationStation", "ErrorOriginStation", "Loading", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData$Data;", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData$Error;", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData$ErrorOriginOrDestinationStation;", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData$ErrorOriginStation;", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData$Loading;", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CirculationsViewData {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData$Data;", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData;", "results", "", "Lcom/adif/elcanomovil/domain/entities/circulation/Circulation;", "(Ljava/util/List;)V", "getResults", "()Ljava/util/List;", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Data extends CirculationsViewData {
        private final List<Circulation> results;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Data(List<? extends Circulation> results) {
            super(null);
            Intrinsics.checkNotNullParameter(results, "results");
            this.results = results;
        }

        public final List<Circulation> getResults() {
            return this.results;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData$Error;", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData;", "()V", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Error extends CirculationsViewData {
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData$ErrorOriginOrDestinationStation;", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData;", "()V", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ErrorOriginOrDestinationStation extends CirculationsViewData {
        public static final ErrorOriginOrDestinationStation INSTANCE = new ErrorOriginOrDestinationStation();

        private ErrorOriginOrDestinationStation() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData$ErrorOriginStation;", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData;", "()V", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ErrorOriginStation extends CirculationsViewData {
        public static final ErrorOriginStation INSTANCE = new ErrorOriginStation();

        private ErrorOriginStation() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData$Loading;", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData;", "()V", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Loading extends CirculationsViewData {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    public /* synthetic */ CirculationsViewData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CirculationsViewData() {
    }
}
