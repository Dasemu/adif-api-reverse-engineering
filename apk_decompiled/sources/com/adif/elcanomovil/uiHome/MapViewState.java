package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/uiHome/MapViewState;", "", "highlightedStation", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;)V", "getHighlightedStation", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MapViewState {
    private final StationViewEntity highlightedStation;

    public MapViewState(StationViewEntity stationViewEntity) {
        this.highlightedStation = stationViewEntity;
    }

    public static /* synthetic */ MapViewState copy$default(MapViewState mapViewState, StationViewEntity stationViewEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            stationViewEntity = mapViewState.highlightedStation;
        }
        return mapViewState.copy(stationViewEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final StationViewEntity getHighlightedStation() {
        return this.highlightedStation;
    }

    public final MapViewState copy(StationViewEntity highlightedStation) {
        return new MapViewState(highlightedStation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapViewState) && Intrinsics.areEqual(this.highlightedStation, ((MapViewState) other).highlightedStation);
    }

    public final StationViewEntity getHighlightedStation() {
        return this.highlightedStation;
    }

    public int hashCode() {
        StationViewEntity stationViewEntity = this.highlightedStation;
        if (stationViewEntity == null) {
            return 0;
        }
        return stationViewEntity.hashCode();
    }

    public String toString() {
        return "MapViewState(highlightedStation=" + this.highlightedStation + ')';
    }
}
