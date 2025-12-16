package com.adif.elcanomovil.domain.entities;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/MapRegion;", "", "southwest", "Landroid/location/Location;", "northeast", "(Landroid/location/Location;Landroid/location/Location;)V", "getNortheast", "()Landroid/location/Location;", "getSouthwest", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MapRegion {
    private final Location northeast;
    private final Location southwest;

    public MapRegion(Location southwest, Location northeast) {
        Intrinsics.checkNotNullParameter(southwest, "southwest");
        Intrinsics.checkNotNullParameter(northeast, "northeast");
        this.southwest = southwest;
        this.northeast = northeast;
    }

    public static /* synthetic */ MapRegion copy$default(MapRegion mapRegion, Location location, Location location2, int i, Object obj) {
        if ((i & 1) != 0) {
            location = mapRegion.southwest;
        }
        if ((i & 2) != 0) {
            location2 = mapRegion.northeast;
        }
        return mapRegion.copy(location, location2);
    }

    /* renamed from: component1, reason: from getter */
    public final Location getSouthwest() {
        return this.southwest;
    }

    /* renamed from: component2, reason: from getter */
    public final Location getNortheast() {
        return this.northeast;
    }

    public final MapRegion copy(Location southwest, Location northeast) {
        Intrinsics.checkNotNullParameter(southwest, "southwest");
        Intrinsics.checkNotNullParameter(northeast, "northeast");
        return new MapRegion(southwest, northeast);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapRegion)) {
            return false;
        }
        MapRegion mapRegion = (MapRegion) other;
        return Intrinsics.areEqual(this.southwest, mapRegion.southwest) && Intrinsics.areEqual(this.northeast, mapRegion.northeast);
    }

    public final Location getNortheast() {
        return this.northeast;
    }

    public final Location getSouthwest() {
        return this.southwest;
    }

    public int hashCode() {
        return this.northeast.hashCode() + (this.southwest.hashCode() * 31);
    }

    public String toString() {
        return "MapRegion(southwest=" + this.southwest + ", northeast=" + this.northeast + ')';
    }
}
