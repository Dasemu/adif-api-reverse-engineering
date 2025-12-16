package com.adif.elcanomovil.uiSelectStation.mappers;

import android.location.Location;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/mappers/StationViewEntityMapper;", "", "()V", "map", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", Constants.MessagePayloadKeys.FROM, "Lcom/adif/elcanomovil/domain/entities/station/Station;", "ui-select-station_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationViewEntityMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationViewEntityMapper.kt\ncom/adif/elcanomovil/uiSelectStation/mappers/StationViewEntityMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
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
}
