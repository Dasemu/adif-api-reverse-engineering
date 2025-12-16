package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.uiHome.data.UserFavoriteVO;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "", "()V", "BottomSheetHidden", "FavoriteTapped", "HomeStationSet", "LocationPermissionGranted", "MapTapped", "OpenBottomSheet", "SetHomeStationTapped", "SetWorkStationTapped", "ShowFavorites", "StationDetailTapped", "StationSelected", "WorkStationSet", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$BottomSheetHidden;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$FavoriteTapped;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$HomeStationSet;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$LocationPermissionGranted;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$MapTapped;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$OpenBottomSheet;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$SetHomeStationTapped;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$SetWorkStationTapped;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$ShowFavorites;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$StationDetailTapped;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$StationSelected;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$WorkStationSet;", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class HomeFragmentViewAction {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$BottomSheetHidden;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class BottomSheetHidden extends HomeFragmentViewAction {
        public static final BottomSheetHidden INSTANCE = new BottomSheetHidden();

        private BottomSheetHidden() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BottomSheetHidden);
        }

        public int hashCode() {
            return 473365079;
        }

        public String toString() {
            return "BottomSheetHidden";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$FavoriteTapped;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "favorite", "Lcom/adif/elcanomovil/uiHome/data/UserFavoriteVO;", "(Lcom/adif/elcanomovil/uiHome/data/UserFavoriteVO;)V", "getFavorite", "()Lcom/adif/elcanomovil/uiHome/data/UserFavoriteVO;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class FavoriteTapped extends HomeFragmentViewAction {
        private final UserFavoriteVO favorite;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FavoriteTapped(UserFavoriteVO favorite) {
            super(null);
            Intrinsics.checkNotNullParameter(favorite, "favorite");
            this.favorite = favorite;
        }

        public static /* synthetic */ FavoriteTapped copy$default(FavoriteTapped favoriteTapped, UserFavoriteVO userFavoriteVO, int i, Object obj) {
            if ((i & 1) != 0) {
                userFavoriteVO = favoriteTapped.favorite;
            }
            return favoriteTapped.copy(userFavoriteVO);
        }

        /* renamed from: component1, reason: from getter */
        public final UserFavoriteVO getFavorite() {
            return this.favorite;
        }

        public final FavoriteTapped copy(UserFavoriteVO favorite) {
            Intrinsics.checkNotNullParameter(favorite, "favorite");
            return new FavoriteTapped(favorite);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FavoriteTapped) && Intrinsics.areEqual(this.favorite, ((FavoriteTapped) other).favorite);
        }

        public final UserFavoriteVO getFavorite() {
            return this.favorite;
        }

        public int hashCode() {
            return this.favorite.hashCode();
        }

        public String toString() {
            return "FavoriteTapped(favorite=" + this.favorite + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$HomeStationSet;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "stationId", "", "(Ljava/lang/String;)V", "getStationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class HomeStationSet extends HomeFragmentViewAction {
        private final String stationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeStationSet(String stationId) {
            super(null);
            Intrinsics.checkNotNullParameter(stationId, "stationId");
            this.stationId = stationId;
        }

        public static /* synthetic */ HomeStationSet copy$default(HomeStationSet homeStationSet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = homeStationSet.stationId;
            }
            return homeStationSet.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getStationId() {
            return this.stationId;
        }

        public final HomeStationSet copy(String stationId) {
            Intrinsics.checkNotNullParameter(stationId, "stationId");
            return new HomeStationSet(stationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HomeStationSet) && Intrinsics.areEqual(this.stationId, ((HomeStationSet) other).stationId);
        }

        public final String getStationId() {
            return this.stationId;
        }

        public int hashCode() {
            return this.stationId.hashCode();
        }

        public String toString() {
            return com.google.android.gms.measurement.internal.a.n(new StringBuilder("HomeStationSet(stationId="), this.stationId, ')');
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$LocationPermissionGranted;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class LocationPermissionGranted extends HomeFragmentViewAction {
        public static final LocationPermissionGranted INSTANCE = new LocationPermissionGranted();

        private LocationPermissionGranted() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LocationPermissionGranted);
        }

        public int hashCode() {
            return -1252168880;
        }

        public String toString() {
            return "LocationPermissionGranted";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$MapTapped;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class MapTapped extends HomeFragmentViewAction {
        public static final MapTapped INSTANCE = new MapTapped();

        private MapTapped() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MapTapped);
        }

        public int hashCode() {
            return 1011790241;
        }

        public String toString() {
            return "MapTapped";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$OpenBottomSheet;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class OpenBottomSheet extends HomeFragmentViewAction {
        public static final OpenBottomSheet INSTANCE = new OpenBottomSheet();

        private OpenBottomSheet() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OpenBottomSheet);
        }

        public int hashCode() {
            return -1516250845;
        }

        public String toString() {
            return "OpenBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$SetHomeStationTapped;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class SetHomeStationTapped extends HomeFragmentViewAction {
        public static final SetHomeStationTapped INSTANCE = new SetHomeStationTapped();

        private SetHomeStationTapped() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SetHomeStationTapped);
        }

        public int hashCode() {
            return -805405242;
        }

        public String toString() {
            return "SetHomeStationTapped";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$SetWorkStationTapped;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class SetWorkStationTapped extends HomeFragmentViewAction {
        public static final SetWorkStationTapped INSTANCE = new SetWorkStationTapped();

        private SetWorkStationTapped() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SetWorkStationTapped);
        }

        public int hashCode() {
            return -1771156268;
        }

        public String toString() {
            return "SetWorkStationTapped";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$ShowFavorites;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class ShowFavorites extends HomeFragmentViewAction {
        public static final ShowFavorites INSTANCE = new ShowFavorites();

        private ShowFavorites() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowFavorites);
        }

        public int hashCode() {
            return 1619112435;
        }

        public String toString() {
            return "ShowFavorites";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$StationDetailTapped;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "stationType", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;", "stationId", "", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;Ljava/lang/String;)V", "getStationId", "()Ljava/lang/String;", "getStationType", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class StationDetailTapped extends HomeFragmentViewAction {
        private final String stationId;
        private final StationViewEntity.Type stationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StationDetailTapped(StationViewEntity.Type stationType, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(stationType, "stationType");
            this.stationType = stationType;
            this.stationId = str;
        }

        public static /* synthetic */ StationDetailTapped copy$default(StationDetailTapped stationDetailTapped, StationViewEntity.Type type, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                type = stationDetailTapped.stationType;
            }
            if ((i & 2) != 0) {
                str = stationDetailTapped.stationId;
            }
            return stationDetailTapped.copy(type, str);
        }

        /* renamed from: component1, reason: from getter */
        public final StationViewEntity.Type getStationType() {
            return this.stationType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStationId() {
            return this.stationId;
        }

        public final StationDetailTapped copy(StationViewEntity.Type stationType, String stationId) {
            Intrinsics.checkNotNullParameter(stationType, "stationType");
            return new StationDetailTapped(stationType, stationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StationDetailTapped)) {
                return false;
            }
            StationDetailTapped stationDetailTapped = (StationDetailTapped) other;
            return this.stationType == stationDetailTapped.stationType && Intrinsics.areEqual(this.stationId, stationDetailTapped.stationId);
        }

        public final String getStationId() {
            return this.stationId;
        }

        public final StationViewEntity.Type getStationType() {
            return this.stationType;
        }

        public int hashCode() {
            int hashCode = this.stationType.hashCode() * 31;
            String str = this.stationId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("StationDetailTapped(stationType=");
            sb.append(this.stationType);
            sb.append(", stationId=");
            return com.google.android.gms.measurement.internal.a.n(sb, this.stationId, ')');
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$StationSelected;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "station", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;)V", "getStation", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class StationSelected extends HomeFragmentViewAction {
        private final StationViewEntity station;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StationSelected(StationViewEntity station) {
            super(null);
            Intrinsics.checkNotNullParameter(station, "station");
            this.station = station;
        }

        public static /* synthetic */ StationSelected copy$default(StationSelected stationSelected, StationViewEntity stationViewEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                stationViewEntity = stationSelected.station;
            }
            return stationSelected.copy(stationViewEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final StationViewEntity getStation() {
            return this.station;
        }

        public final StationSelected copy(StationViewEntity station) {
            Intrinsics.checkNotNullParameter(station, "station");
            return new StationSelected(station);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StationSelected) && Intrinsics.areEqual(this.station, ((StationSelected) other).station);
        }

        public final StationViewEntity getStation() {
            return this.station;
        }

        public int hashCode() {
            return this.station.hashCode();
        }

        public String toString() {
            return "StationSelected(station=" + this.station + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$WorkStationSet;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "stationId", "", "(Ljava/lang/String;)V", "getStationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class WorkStationSet extends HomeFragmentViewAction {
        private final String stationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WorkStationSet(String stationId) {
            super(null);
            Intrinsics.checkNotNullParameter(stationId, "stationId");
            this.stationId = stationId;
        }

        public static /* synthetic */ WorkStationSet copy$default(WorkStationSet workStationSet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = workStationSet.stationId;
            }
            return workStationSet.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getStationId() {
            return this.stationId;
        }

        public final WorkStationSet copy(String stationId) {
            Intrinsics.checkNotNullParameter(stationId, "stationId");
            return new WorkStationSet(stationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WorkStationSet) && Intrinsics.areEqual(this.stationId, ((WorkStationSet) other).stationId);
        }

        public final String getStationId() {
            return this.stationId;
        }

        public int hashCode() {
            return this.stationId.hashCode();
        }

        public String toString() {
            return com.google.android.gms.measurement.internal.a.n(new StringBuilder("WorkStationSet(stationId="), this.stationId, ')');
        }
    }

    public /* synthetic */ HomeFragmentViewAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HomeFragmentViewAction() {
    }
}
