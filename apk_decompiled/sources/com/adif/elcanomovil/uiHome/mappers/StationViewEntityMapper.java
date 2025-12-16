package com.adif.elcanomovil.uiHome.mappers;

import android.location.Location;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/uiHome/mappers/StationViewEntityMapper;", "", "()V", "map", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", Constants.MessagePayloadKeys.FROM, "Lcom/adif/elcanomovil/domain/entities/station/Station;", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationViewEntityMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationViewEntityMapper.kt\ncom/adif/elcanomovil/uiHome/mappers/StationViewEntityMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1#2:32\n1549#3:33\n1620#3,3:34\n*S KotlinDebug\n*F\n+ 1 StationViewEntityMapper.kt\ncom/adif/elcanomovil/uiHome/mappers/StationViewEntityMapper\n*L\n29#1:33\n29#1:34,3\n*E\n"})
/* loaded from: classes2.dex */
public final class StationViewEntityMapper {
    public static final StationViewEntityMapper INSTANCE = new StationViewEntityMapper();

    private StationViewEntityMapper() {
    }

    public final StationViewEntity map(Station from) {
        if (from == null) {
            return null;
        }
        String stationCode = from.getStationCode();
        String longName = from.getLongName();
        String shortName = from.getShortName();
        Float distance = from.getDistance();
        Float duration = from.getDuration();
        Location location = from.getLocation();
        String commercialZoneType = from.getCommercialZoneType();
        if (commercialZoneType == null) {
            commercialZoneType = "";
        }
        return new StationViewEntity(stationCode, longName, shortName, distance, duration, location, null, commercialZoneType, CollectionsKt.arrayListOf(StationViewEntity.Service.ARRIVALS, StationViewEntity.Service.DEPARTURES, StationViewEntity.Service.INFO, StationViewEntity.Service.COMMERCIAL), null, null, 1600, null);
    }

    public final List<StationViewEntity> map(List<Station> from) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(from, "from");
        List<Station> list = from;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.map((Station) it.next()));
        }
        return arrayList;
    }
}
