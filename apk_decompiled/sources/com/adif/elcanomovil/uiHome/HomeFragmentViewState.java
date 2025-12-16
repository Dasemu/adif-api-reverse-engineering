package com.adif.elcanomovil.uiHome;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentViewState;", "", "mapViewState", "Lcom/adif/elcanomovil/uiHome/MapViewState;", "bottomSheetViewState", "Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState;", "(Lcom/adif/elcanomovil/uiHome/MapViewState;Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState;)V", "getBottomSheetViewState", "()Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState;", "getMapViewState", "()Lcom/adif/elcanomovil/uiHome/MapViewState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HomeFragmentViewState {
    private final HomeFragmentBottomSheetViewState bottomSheetViewState;
    private final MapViewState mapViewState;

    public HomeFragmentViewState(MapViewState mapViewState, HomeFragmentBottomSheetViewState bottomSheetViewState) {
        Intrinsics.checkNotNullParameter(mapViewState, "mapViewState");
        Intrinsics.checkNotNullParameter(bottomSheetViewState, "bottomSheetViewState");
        this.mapViewState = mapViewState;
        this.bottomSheetViewState = bottomSheetViewState;
    }

    public static /* synthetic */ HomeFragmentViewState copy$default(HomeFragmentViewState homeFragmentViewState, MapViewState mapViewState, HomeFragmentBottomSheetViewState homeFragmentBottomSheetViewState, int i, Object obj) {
        if ((i & 1) != 0) {
            mapViewState = homeFragmentViewState.mapViewState;
        }
        if ((i & 2) != 0) {
            homeFragmentBottomSheetViewState = homeFragmentViewState.bottomSheetViewState;
        }
        return homeFragmentViewState.copy(mapViewState, homeFragmentBottomSheetViewState);
    }

    /* renamed from: component1, reason: from getter */
    public final MapViewState getMapViewState() {
        return this.mapViewState;
    }

    /* renamed from: component2, reason: from getter */
    public final HomeFragmentBottomSheetViewState getBottomSheetViewState() {
        return this.bottomSheetViewState;
    }

    public final HomeFragmentViewState copy(MapViewState mapViewState, HomeFragmentBottomSheetViewState bottomSheetViewState) {
        Intrinsics.checkNotNullParameter(mapViewState, "mapViewState");
        Intrinsics.checkNotNullParameter(bottomSheetViewState, "bottomSheetViewState");
        return new HomeFragmentViewState(mapViewState, bottomSheetViewState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeFragmentViewState)) {
            return false;
        }
        HomeFragmentViewState homeFragmentViewState = (HomeFragmentViewState) other;
        return Intrinsics.areEqual(this.mapViewState, homeFragmentViewState.mapViewState) && Intrinsics.areEqual(this.bottomSheetViewState, homeFragmentViewState.bottomSheetViewState);
    }

    public final HomeFragmentBottomSheetViewState getBottomSheetViewState() {
        return this.bottomSheetViewState;
    }

    public final MapViewState getMapViewState() {
        return this.mapViewState;
    }

    public int hashCode() {
        return this.bottomSheetViewState.hashCode() + (this.mapViewState.hashCode() * 31);
    }

    public String toString() {
        return "HomeFragmentViewState(mapViewState=" + this.mapViewState + ", bottomSheetViewState=" + this.bottomSheetViewState + ')';
    }
}
