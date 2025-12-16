package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.uiStations.entities.ServicesTabViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/uiStations/main/OneStationViewData;", "", "()V", "Data", "Error", "Loading", "Lcom/adif/elcanomovil/uiStations/main/OneStationViewData$Data;", "Lcom/adif/elcanomovil/uiStations/main/OneStationViewData$Error;", "Lcom/adif/elcanomovil/uiStations/main/OneStationViewData$Loading;", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class OneStationViewData {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiStations/main/OneStationViewData$Data;", "Lcom/adif/elcanomovil/uiStations/main/OneStationViewData;", "results", "Lcom/adif/elcanomovil/uiStations/entities/ServicesTabViewData;", "(Lcom/adif/elcanomovil/uiStations/entities/ServicesTabViewData;)V", "getResults", "()Lcom/adif/elcanomovil/uiStations/entities/ServicesTabViewData;", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Data extends OneStationViewData {
        private final ServicesTabViewData results;

        public Data(ServicesTabViewData servicesTabViewData) {
            super(null);
            this.results = servicesTabViewData;
        }

        public final ServicesTabViewData getResults() {
            return this.results;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/uiStations/main/OneStationViewData$Error;", "Lcom/adif/elcanomovil/uiStations/main/OneStationViewData;", "()V", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Error extends OneStationViewData {
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/uiStations/main/OneStationViewData$Loading;", "Lcom/adif/elcanomovil/uiStations/main/OneStationViewData;", "()V", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Loading extends OneStationViewData {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    public /* synthetic */ OneStationViewData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OneStationViewData() {
    }
}
