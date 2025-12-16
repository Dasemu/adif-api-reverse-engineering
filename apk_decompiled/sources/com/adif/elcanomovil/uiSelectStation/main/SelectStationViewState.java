package com.adif.elcanomovil.uiSelectStation.main;

import com.adif.elcanomovil.commonViews.data.StationOptionViewEntity;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.station.Station;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState;", "", "()V", "MainSearch", "NoResults", "ShowSearchResults", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState$MainSearch;", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState$NoResults;", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState$ShowSearchResults;", "ui-select-station_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SelectStationViewState {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState$MainSearch;", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState;", "lastSearches", "", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "homeStation", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "workStation", "userNearStation", "Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;", "(Ljava/util/List;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;)V", "getHomeStation", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "getLastSearches", "()Ljava/util/List;", "getUserNearStation", "()Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;", "getWorkStation", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-select-station_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class MainSearch extends SelectStationViewState {
        private final StationViewEntity homeStation;
        private final List<Station> lastSearches;
        private final StationOptionViewEntity userNearStation;
        private final StationViewEntity workStation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainSearch(List<Station> lastSearches, StationViewEntity stationViewEntity, StationViewEntity stationViewEntity2, StationOptionViewEntity stationOptionViewEntity) {
            super(null);
            Intrinsics.checkNotNullParameter(lastSearches, "lastSearches");
            this.lastSearches = lastSearches;
            this.homeStation = stationViewEntity;
            this.workStation = stationViewEntity2;
            this.userNearStation = stationOptionViewEntity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MainSearch copy$default(MainSearch mainSearch, List list, StationViewEntity stationViewEntity, StationViewEntity stationViewEntity2, StationOptionViewEntity stationOptionViewEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                list = mainSearch.lastSearches;
            }
            if ((i & 2) != 0) {
                stationViewEntity = mainSearch.homeStation;
            }
            if ((i & 4) != 0) {
                stationViewEntity2 = mainSearch.workStation;
            }
            if ((i & 8) != 0) {
                stationOptionViewEntity = mainSearch.userNearStation;
            }
            return mainSearch.copy(list, stationViewEntity, stationViewEntity2, stationOptionViewEntity);
        }

        public final List<Station> component1() {
            return this.lastSearches;
        }

        /* renamed from: component2, reason: from getter */
        public final StationViewEntity getHomeStation() {
            return this.homeStation;
        }

        /* renamed from: component3, reason: from getter */
        public final StationViewEntity getWorkStation() {
            return this.workStation;
        }

        /* renamed from: component4, reason: from getter */
        public final StationOptionViewEntity getUserNearStation() {
            return this.userNearStation;
        }

        public final MainSearch copy(List<Station> lastSearches, StationViewEntity homeStation, StationViewEntity workStation, StationOptionViewEntity userNearStation) {
            Intrinsics.checkNotNullParameter(lastSearches, "lastSearches");
            return new MainSearch(lastSearches, homeStation, workStation, userNearStation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainSearch)) {
                return false;
            }
            MainSearch mainSearch = (MainSearch) other;
            return Intrinsics.areEqual(this.lastSearches, mainSearch.lastSearches) && Intrinsics.areEqual(this.homeStation, mainSearch.homeStation) && Intrinsics.areEqual(this.workStation, mainSearch.workStation) && Intrinsics.areEqual(this.userNearStation, mainSearch.userNearStation);
        }

        public final StationViewEntity getHomeStation() {
            return this.homeStation;
        }

        public final List<Station> getLastSearches() {
            return this.lastSearches;
        }

        public final StationOptionViewEntity getUserNearStation() {
            return this.userNearStation;
        }

        public final StationViewEntity getWorkStation() {
            return this.workStation;
        }

        public int hashCode() {
            int hashCode = this.lastSearches.hashCode() * 31;
            StationViewEntity stationViewEntity = this.homeStation;
            int hashCode2 = (hashCode + (stationViewEntity == null ? 0 : stationViewEntity.hashCode())) * 31;
            StationViewEntity stationViewEntity2 = this.workStation;
            int hashCode3 = (hashCode2 + (stationViewEntity2 == null ? 0 : stationViewEntity2.hashCode())) * 31;
            StationOptionViewEntity stationOptionViewEntity = this.userNearStation;
            return hashCode3 + (stationOptionViewEntity != null ? stationOptionViewEntity.hashCode() : 0);
        }

        public String toString() {
            return "MainSearch(lastSearches=" + this.lastSearches + ", homeStation=" + this.homeStation + ", workStation=" + this.workStation + ", userNearStation=" + this.userNearStation + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState$NoResults;", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-select-station_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class NoResults extends SelectStationViewState {
        public static final NoResults INSTANCE = new NoResults();

        private NoResults() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NoResults);
        }

        public int hashCode() {
            return -425797016;
        }

        public String toString() {
            return "NoResults";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState$ShowSearchResults;", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState;", "stations", "", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "(Ljava/util/List;)V", "getStations", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-select-station_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class ShowSearchResults extends SelectStationViewState {
        private final List<Station> stations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSearchResults(List<Station> stations) {
            super(null);
            Intrinsics.checkNotNullParameter(stations, "stations");
            this.stations = stations;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowSearchResults copy$default(ShowSearchResults showSearchResults, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = showSearchResults.stations;
            }
            return showSearchResults.copy(list);
        }

        public final List<Station> component1() {
            return this.stations;
        }

        public final ShowSearchResults copy(List<Station> stations) {
            Intrinsics.checkNotNullParameter(stations, "stations");
            return new ShowSearchResults(stations);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowSearchResults) && Intrinsics.areEqual(this.stations, ((ShowSearchResults) other).stations);
        }

        public final List<Station> getStations() {
            return this.stations;
        }

        public int hashCode() {
            return this.stations.hashCode();
        }

        public String toString() {
            return com.google.android.gms.measurement.internal.a.o(new StringBuilder("ShowSearchResults(stations="), this.stations, ')');
        }
    }

    public /* synthetic */ SelectStationViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SelectStationViewState() {
    }
}
