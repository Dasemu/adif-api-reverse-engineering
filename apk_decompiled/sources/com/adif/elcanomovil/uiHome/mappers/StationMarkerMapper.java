package com.adif.elcanomovil.uiHome.mappers;

import android.location.Location;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.extensions.LocationExtensionsKt;
import com.adif.elcanomovil.uiHome.data.StationMarker;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J2\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ<\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00102\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/uiHome/mappers/StationMarkerMapper;", "", "()V", "isSelectedStation", "", "station", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "selected", "Lcom/adif/elcanomovil/uiHome/data/StationMarker;", "isUserSelectionStation", "userStation", "", "map", Constants.MessagePayloadKeys.FROM, "homeStation", "workStation", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationMarkerMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationMarkerMapper.kt\ncom/adif/elcanomovil/uiHome/mappers/StationMarkerMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1#2:53\n1#2:64\n1603#3,9:54\n1855#3:63\n1856#3:65\n1612#3:66\n*S KotlinDebug\n*F\n+ 1 StationMarkerMapper.kt\ncom/adif/elcanomovil/uiHome/mappers/StationMarkerMapper\n*L\n43#1:64\n43#1:54,9\n43#1:63\n43#1:65\n43#1:66\n*E\n"})
/* loaded from: classes2.dex */
public final class StationMarkerMapper {
    public static final StationMarkerMapper INSTANCE = new StationMarkerMapper();

    private StationMarkerMapper() {
    }

    private final boolean isSelectedStation(StationViewEntity station, StationMarker selected) {
        StationViewEntity station2;
        String str = null;
        String id = station != null ? station.getId() : null;
        if (selected != null && (station2 = selected.getStation()) != null) {
            str = station2.getId();
        }
        return Intrinsics.areEqual(id, str);
    }

    private final boolean isUserSelectionStation(StationViewEntity station, String userStation) {
        return Intrinsics.areEqual(station != null ? station.getId() : null, userStation);
    }

    public static /* synthetic */ StationMarker map$default(StationMarkerMapper stationMarkerMapper, StationViewEntity stationViewEntity, StationMarker stationMarker, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            stationMarker = null;
        }
        return stationMarkerMapper.map(stationViewEntity, stationMarker, str, str2);
    }

    public final StationMarker map(StationViewEntity from, StationMarker selected, String homeStation, String workStation) {
        if (from != null) {
            StationMarkerMapper stationMarkerMapper = INSTANCE;
            if (!stationMarkerMapper.isSelectedStation(from, selected)) {
                Location location = from.getLocation();
                selected = new StationMarker(null, from, location != null ? LocationExtensionsKt.toLatLng(location) : null, false);
            }
            if (stationMarkerMapper.isUserSelectionStation(selected != null ? selected.getStation() : null, homeStation)) {
                StationViewEntity station = selected != null ? selected.getStation() : null;
                if (station != null) {
                    station.setType(StationViewEntity.Type.HOME);
                }
            } else {
                if (stationMarkerMapper.isUserSelectionStation(selected != null ? selected.getStation() : null, workStation)) {
                    StationViewEntity station2 = selected != null ? selected.getStation() : null;
                    if (station2 != null) {
                        station2.setType(StationViewEntity.Type.WORK);
                    }
                } else {
                    StationViewEntity station3 = selected != null ? selected.getStation() : null;
                    if (station3 != null) {
                        station3.setType(StationViewEntity.Type.STATION);
                    }
                }
            }
            if (selected != null) {
                return selected;
            }
        }
        return null;
    }

    public static /* synthetic */ List map$default(StationMarkerMapper stationMarkerMapper, List list, StationMarker stationMarker, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            stationMarker = null;
        }
        return stationMarkerMapper.map((List<StationViewEntity>) list, stationMarker, str, str2);
    }

    public final List<StationMarker> map(List<StationViewEntity> from, StationMarker selected, String homeStation, String workStation) {
        Intrinsics.checkNotNullParameter(from, "from");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = from.iterator();
        while (it.hasNext()) {
            StationMarker map = INSTANCE.map((StationViewEntity) it.next(), selected, homeStation, workStation);
            if (map != null) {
                arrayList.add(map);
            }
        }
        return arrayList;
    }
}
