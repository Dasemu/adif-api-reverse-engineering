package com.adif.elcanomovil.extensions;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0004"}, d2 = {"toLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "Landroid/location/Location;", "toLatLngTranslatedToSouth", "common-resources_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocationExtensionsKt {
    public static final LatLng toLatLng(Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    public static final LatLng toLatLngTranslatedToSouth(Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return new LatLng(location.getLatitude() - 0.012d, location.getLongitude());
    }

    public static final LatLng toLatLngTranslatedToSouth(LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "<this>");
        return new LatLng(latLng.latitude - 0.012d, latLng.longitude);
    }
}
