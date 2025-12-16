package com.adif.elcanomovil.serviceStorage.model;

import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/StationBase;", "Ljava/io/Serializable;", "latitude", "", "getLatitude", "()D", "longitude", "getLongitude", "stId", "", "getStId", "()Ljava/lang/String;", "distanceTo", "", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "isLocated", "", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StationBase extends Serializable {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static float distanceTo(StationBase stationBase, Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            Location location2 = new Location(FirebaseAnalytics.Param.LOCATION);
            location2.setLatitude(stationBase.getLatitude());
            location2.setLongitude(stationBase.getLongitude());
            return location2.distanceTo(location);
        }

        public static boolean isLocated(StationBase stationBase) {
            return (stationBase.getLatitude() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && stationBase.getLongitude() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? false : true;
        }
    }

    float distanceTo(Location location);

    double getLatitude();

    double getLongitude();

    String getStId();

    boolean isLocated();
}
