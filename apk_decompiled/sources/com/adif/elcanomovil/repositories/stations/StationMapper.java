package com.adif.elcanomovil.repositories.stations;

import android.location.Location;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.repositories.utils.REGEX_UNACCENTKt;
import com.adif.elcanomovil.serviceNetworking.stations.model.RequestedStationInfoListDTO;
import com.adif.elcanomovil.serviceStorage.model.StationEntity;
import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapperKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/repositories/stations/StationMapper;", "", "()V", "entityToDomain", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "source", "Lcom/adif/elcanomovil/serviceStorage/model/StationEntity;", "logicTypeTraffic", "", "typeTraffic", "", "", "responseToEntity", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/RequestedStationInfoListDTO;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationMapper.kt\ncom/adif/elcanomovil/repositories/stations/StationMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1549#2:60\n1620#2,3:61\n*S KotlinDebug\n*F\n+ 1 StationMapper.kt\ncom/adif/elcanomovil/repositories/stations/StationMapper\n*L\n16#1:60\n16#1:61,3\n*E\n"})
/* loaded from: classes.dex */
public final class StationMapper {
    private final int logicTypeTraffic(List<String> typeTraffic) {
        List<String> list = typeTraffic;
        ArrayList arrayList = new ArrayList(CollectionsKt.g(list));
        for (String str : list) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String upperCase = str.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            arrayList.add(upperCase);
        }
        boolean contains = arrayList.contains(TrainInfoMapperKt.CERCANIAS);
        boolean contains2 = arrayList.contains("AVLDMD");
        if (contains && contains2) {
            return 2;
        }
        return (!contains && contains2) ? 1 : 0;
    }

    public final Station entityToDomain(StationEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String stationCode = source.getStationCode();
        String stationType = source.getStationType();
        String longName = source.getLongName();
        String shortName = source.getShortName();
        String commercialZoneType = source.getCommercialZoneType();
        Location location = new Location("");
        location.setLatitude(source.getLatitude());
        location.setLongitude(source.getLongitude());
        Unit unit = Unit.INSTANCE;
        return new Station(stationCode, stationType, longName, shortName, commercialZoneType, location, source.getTrafficType(), source.getCommuterNetwork(), null, 256, null);
    }

    public final StationEntity responseToEntity(RequestedStationInfoListDTO source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String stationCode = source.getStationInfo().getStationCode();
        String stationType = source.getStationInfo().getStationType();
        String longName = source.getStationInfo().getLongName();
        String shortName = source.getStationInfo().getShortName();
        String unaccent = REGEX_UNACCENTKt.unaccent(source.getStationInfo().getLongName());
        String unaccent2 = REGEX_UNACCENTKt.unaccent(source.getStationInfo().getShortName());
        double latitude = source.getStationInfo().getLocation().getLatitude();
        double longitude = source.getStationInfo().getLocation().getLongitude();
        int logicTypeTraffic = logicTypeTraffic(source.getStationInfo().getTrafficType());
        String commercialZoneType = source.getStationInfo().getCommercialZoneType();
        String commuterNetwork = source.getStationInfo().getCommuterNetwork();
        if (commuterNetwork == null) {
            commuterNetwork = "";
        }
        return new StationEntity(stationCode, stationType, longName, shortName, unaccent, unaccent2, latitude, longitude, logicTypeTraffic, commercialZoneType, commuterNetwork, CollectionsKt.l(source.getStationInfo().getAkaList(), "", null, null, null, 62));
    }
}
