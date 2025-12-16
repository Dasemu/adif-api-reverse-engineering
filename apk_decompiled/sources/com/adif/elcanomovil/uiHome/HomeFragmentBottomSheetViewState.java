package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.uiHome.data.UserFavoriteVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState;", "", "()V", "Hidden", "NearestStationShown", "StationSelected", "Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState$Hidden;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState$NearestStationShown;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState$StationSelected;", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class HomeFragmentBottomSheetViewState {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState$Hidden;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class Hidden extends HomeFragmentBottomSheetViewState {
        public static final Hidden INSTANCE = new Hidden();

        private Hidden() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Hidden);
        }

        public int hashCode() {
            return -778207756;
        }

        public String toString() {
            return "Hidden";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006("}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState$NearestStationShown;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState;", "locationStatus", "Lcom/adif/elcanomovil/uiHome/LocationStatus;", "nearestStation", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "homeStation", "workStation", "favoriteEntries", "", "Lcom/adif/elcanomovil/uiHome/data/UserFavoriteVO;", "fullyExpanded", "", "(Lcom/adif/elcanomovil/uiHome/LocationStatus;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;Ljava/util/List;Z)V", "getFavoriteEntries", "()Ljava/util/List;", "getFullyExpanded", "()Z", "getHomeStation", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "getLocationStatus", "()Lcom/adif/elcanomovil/uiHome/LocationStatus;", "getNearestStation", "showLoading", "getShowLoading", "getWorkStation", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class NearestStationShown extends HomeFragmentBottomSheetViewState {
        private final List<UserFavoriteVO> favoriteEntries;
        private final boolean fullyExpanded;
        private final StationViewEntity homeStation;
        private final LocationStatus locationStatus;
        private final StationViewEntity nearestStation;
        private final StationViewEntity workStation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NearestStationShown(LocationStatus locationStatus, StationViewEntity stationViewEntity, StationViewEntity stationViewEntity2, StationViewEntity stationViewEntity3, List<UserFavoriteVO> favoriteEntries, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(locationStatus, "locationStatus");
            Intrinsics.checkNotNullParameter(favoriteEntries, "favoriteEntries");
            this.locationStatus = locationStatus;
            this.nearestStation = stationViewEntity;
            this.homeStation = stationViewEntity2;
            this.workStation = stationViewEntity3;
            this.favoriteEntries = favoriteEntries;
            this.fullyExpanded = z3;
        }

        public static /* synthetic */ NearestStationShown copy$default(NearestStationShown nearestStationShown, LocationStatus locationStatus, StationViewEntity stationViewEntity, StationViewEntity stationViewEntity2, StationViewEntity stationViewEntity3, List list, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                locationStatus = nearestStationShown.locationStatus;
            }
            if ((i & 2) != 0) {
                stationViewEntity = nearestStationShown.nearestStation;
            }
            if ((i & 4) != 0) {
                stationViewEntity2 = nearestStationShown.homeStation;
            }
            if ((i & 8) != 0) {
                stationViewEntity3 = nearestStationShown.workStation;
            }
            if ((i & 16) != 0) {
                list = nearestStationShown.favoriteEntries;
            }
            if ((i & 32) != 0) {
                z3 = nearestStationShown.fullyExpanded;
            }
            List list2 = list;
            boolean z4 = z3;
            return nearestStationShown.copy(locationStatus, stationViewEntity, stationViewEntity2, stationViewEntity3, list2, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final LocationStatus getLocationStatus() {
            return this.locationStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final StationViewEntity getNearestStation() {
            return this.nearestStation;
        }

        /* renamed from: component3, reason: from getter */
        public final StationViewEntity getHomeStation() {
            return this.homeStation;
        }

        /* renamed from: component4, reason: from getter */
        public final StationViewEntity getWorkStation() {
            return this.workStation;
        }

        public final List<UserFavoriteVO> component5() {
            return this.favoriteEntries;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getFullyExpanded() {
            return this.fullyExpanded;
        }

        public final NearestStationShown copy(LocationStatus locationStatus, StationViewEntity nearestStation, StationViewEntity homeStation, StationViewEntity workStation, List<UserFavoriteVO> favoriteEntries, boolean fullyExpanded) {
            Intrinsics.checkNotNullParameter(locationStatus, "locationStatus");
            Intrinsics.checkNotNullParameter(favoriteEntries, "favoriteEntries");
            return new NearestStationShown(locationStatus, nearestStation, homeStation, workStation, favoriteEntries, fullyExpanded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NearestStationShown)) {
                return false;
            }
            NearestStationShown nearestStationShown = (NearestStationShown) other;
            return this.locationStatus == nearestStationShown.locationStatus && Intrinsics.areEqual(this.nearestStation, nearestStationShown.nearestStation) && Intrinsics.areEqual(this.homeStation, nearestStationShown.homeStation) && Intrinsics.areEqual(this.workStation, nearestStationShown.workStation) && Intrinsics.areEqual(this.favoriteEntries, nearestStationShown.favoriteEntries) && this.fullyExpanded == nearestStationShown.fullyExpanded;
        }

        public final List<UserFavoriteVO> getFavoriteEntries() {
            return this.favoriteEntries;
        }

        public final boolean getFullyExpanded() {
            return this.fullyExpanded;
        }

        public final StationViewEntity getHomeStation() {
            return this.homeStation;
        }

        public final LocationStatus getLocationStatus() {
            return this.locationStatus;
        }

        public final StationViewEntity getNearestStation() {
            return this.nearestStation;
        }

        public final boolean getShowLoading() {
            return this.nearestStation == null && this.locationStatus.isEnabled();
        }

        public final StationViewEntity getWorkStation() {
            return this.workStation;
        }

        public int hashCode() {
            int hashCode = this.locationStatus.hashCode() * 31;
            StationViewEntity stationViewEntity = this.nearestStation;
            int hashCode2 = (hashCode + (stationViewEntity == null ? 0 : stationViewEntity.hashCode())) * 31;
            StationViewEntity stationViewEntity2 = this.homeStation;
            int hashCode3 = (hashCode2 + (stationViewEntity2 == null ? 0 : stationViewEntity2.hashCode())) * 31;
            StationViewEntity stationViewEntity3 = this.workStation;
            int hashCode4 = stationViewEntity3 != null ? stationViewEntity3.hashCode() : 0;
            return Boolean.hashCode(this.fullyExpanded) + ((this.favoriteEntries.hashCode() + ((hashCode3 + hashCode4) * 31)) * 31);
        }

        public String toString() {
            return "NearestStationShown(locationStatus=" + this.locationStatus + ", nearestStation=" + this.nearestStation + ", homeStation=" + this.homeStation + ", workStation=" + this.workStation + ", favoriteEntries=" + this.favoriteEntries + ", fullyExpanded=" + this.fullyExpanded + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState$StationSelected;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState;", "selectedStation", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;)V", "getSelectedStation", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class StationSelected extends HomeFragmentBottomSheetViewState {
        private final StationViewEntity selectedStation;

        public StationSelected(StationViewEntity stationViewEntity) {
            super(null);
            this.selectedStation = stationViewEntity;
        }

        public static /* synthetic */ StationSelected copy$default(StationSelected stationSelected, StationViewEntity stationViewEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                stationViewEntity = stationSelected.selectedStation;
            }
            return stationSelected.copy(stationViewEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final StationViewEntity getSelectedStation() {
            return this.selectedStation;
        }

        public final StationSelected copy(StationViewEntity selectedStation) {
            return new StationSelected(selectedStation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StationSelected) && Intrinsics.areEqual(this.selectedStation, ((StationSelected) other).selectedStation);
        }

        public final StationViewEntity getSelectedStation() {
            return this.selectedStation;
        }

        public int hashCode() {
            StationViewEntity stationViewEntity = this.selectedStation;
            if (stationViewEntity == null) {
                return 0;
            }
            return stationViewEntity.hashCode();
        }

        public String toString() {
            return "StationSelected(selectedStation=" + this.selectedStation + ')';
        }
    }

    public /* synthetic */ HomeFragmentBottomSheetViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HomeFragmentBottomSheetViewState() {
    }
}
