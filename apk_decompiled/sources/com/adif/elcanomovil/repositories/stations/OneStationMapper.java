package com.adif.elcanomovil.repositories.stations;

import com.adif.elcanomovil.domain.entities.station.ExtendedStationInfo;
import com.adif.elcanomovil.domain.entities.station.RequestedStationInfo;
import com.adif.elcanomovil.domain.entities.station.StationInfo;
import com.adif.elcanomovil.serviceNetworking.stations.model.BannerDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.ExtendedStationInfoDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.RequestedStationInfoDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.StationCommercialServicesDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.StationInfoDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.StationTransportServicesDTO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/repositories/stations/OneStationMapper;", "", "()V", "responseToDomain", "Lcom/adif/elcanomovil/domain/entities/station/RequestedStationInfo;", "source", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/RequestedStationInfoDTO;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OneStationMapper {
    public final RequestedStationInfo responseToDomain(RequestedStationInfoDTO source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String stationCode = source.getStationCode();
        StationInfoDTO stationInfo = source.getStationInfo();
        StationInfo domain = stationInfo != null ? OneStationMapperKt.toDomain(stationInfo) : null;
        ExtendedStationInfoDTO extendedStationInfo = source.getExtendedStationInfo();
        ExtendedStationInfo domain2 = extendedStationInfo != null ? OneStationMapperKt.toDomain(extendedStationInfo) : null;
        List<StationServicesDTO> stationServices = source.getStationServices();
        List domain3 = stationServices != null ? OneStationMapperKt.toDomain((List<StationServicesDTO>) stationServices) : null;
        List<StationTransportServicesDTO> stationTransportServices = source.getStationTransportServices();
        List stationTransportServicesToDomain = stationTransportServices != null ? OneStationMapperKt.stationTransportServicesToDomain(stationTransportServices) : null;
        List<StationCommercialServicesDTO> stationCommercialServices = source.getStationCommercialServices();
        List stationCommercialServicesToDomain = stationCommercialServices != null ? OneStationMapperKt.stationCommercialServicesToDomain(stationCommercialServices) : null;
        List<StationCommercialServicesDTO> stationActivities = source.getStationActivities();
        List stationCommercialServicesToDomain2 = stationActivities != null ? OneStationMapperKt.stationCommercialServicesToDomain(stationActivities) : null;
        BannerDTO banner = source.getBanner();
        return new RequestedStationInfo(stationCode, domain, domain2, domain3, stationTransportServicesToDomain, stationCommercialServicesToDomain, stationCommercialServicesToDomain2, banner != null ? OneStationMapperKt.toDomain(banner) : null);
    }
}
