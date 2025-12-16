package com.adif.elcanomovil.uiHome.mappers;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/uiHome/mappers/LocationMapper;", "", "()V", "map", "Landroid/location/Location;", Constants.MessagePayloadKeys.FROM, "Lcom/google/android/gms/maps/model/LatLng;", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationMapper.kt\ncom/adif/elcanomovil/uiHome/mappers/LocationMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1603#2,9:18\n1855#2:27\n1856#2:29\n1612#2:30\n1#3:28\n*S KotlinDebug\n*F\n+ 1 LocationMapper.kt\ncom/adif/elcanomovil/uiHome/mappers/LocationMapper\n*L\n15#1:18,9\n15#1:27\n15#1:29\n15#1:30\n15#1:28\n*E\n"})
/* loaded from: classes2.dex */
public final class LocationMapper {
    public static final LocationMapper INSTANCE = new LocationMapper();

    private LocationMapper() {
    }

    public final Location map(LatLng from) {
        if (from == null) {
            return null;
        }
        Location location = new Location("gps");
        location.setLatitude(from.latitude);
        location.setLongitude(from.longitude);
        return location;
    }

    public final List<Location> map(List<LatLng> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = from.iterator();
        while (it.hasNext()) {
            Location map = INSTANCE.map((LatLng) it.next());
            if (map != null) {
                arrayList.add(map);
            }
        }
        return arrayList;
    }
}
