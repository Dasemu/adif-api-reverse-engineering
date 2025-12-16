package com.adif.elcanomovil.domain.entities;

import com.adif.elcanomovil.domain.entities.station.Station;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/StationFavourites;", "", "station", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "favourites", "", "Lcom/adif/elcanomovil/domain/entities/DataType;", "(Lcom/adif/elcanomovil/domain/entities/station/Station;Ljava/util/List;)V", "getFavourites", "()Ljava/util/List;", "getStation", "()Lcom/adif/elcanomovil/domain/entities/station/Station;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationFavourites {
    private final List<DataType> favourites;
    private final Station station;

    /* JADX WARN: Multi-variable type inference failed */
    public StationFavourites(Station station, List<? extends DataType> favourites) {
        Intrinsics.checkNotNullParameter(station, "station");
        Intrinsics.checkNotNullParameter(favourites, "favourites");
        this.station = station;
        this.favourites = favourites;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StationFavourites copy$default(StationFavourites stationFavourites, Station station, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            station = stationFavourites.station;
        }
        if ((i & 2) != 0) {
            list = stationFavourites.favourites;
        }
        return stationFavourites.copy(station, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Station getStation() {
        return this.station;
    }

    public final List<DataType> component2() {
        return this.favourites;
    }

    public final StationFavourites copy(Station station, List<? extends DataType> favourites) {
        Intrinsics.checkNotNullParameter(station, "station");
        Intrinsics.checkNotNullParameter(favourites, "favourites");
        return new StationFavourites(station, favourites);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationFavourites)) {
            return false;
        }
        StationFavourites stationFavourites = (StationFavourites) other;
        return Intrinsics.areEqual(this.station, stationFavourites.station) && Intrinsics.areEqual(this.favourites, stationFavourites.favourites);
    }

    public final List<DataType> getFavourites() {
        return this.favourites;
    }

    public final Station getStation() {
        return this.station;
    }

    public int hashCode() {
        return this.favourites.hashCode() + (this.station.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StationFavourites(station=");
        sb.append(this.station);
        sb.append(", favourites=");
        return a.o(sb, this.favourites, ')');
    }
}
