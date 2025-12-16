package com.adif.elcanomovil.repositories.stationObservations;

import com.adif.elcanomovil.domain.entities.stationObservations.StationObservation;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.stations.StationsObservationsRepository;
import com.adif.elcanomovil.serviceNetworking.stationObservations.StationObservationsService;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import x1.C0657a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0096@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/repositories/stationObservations/DefaultStationsObservationsRepository;", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsObservationsRepository;", "stationsObservationsService", "Lcom/adif/elcanomovil/serviceNetworking/stationObservations/StationObservationsService;", "stationObservationMapper", "Lcom/adif/elcanomovil/repositories/stationObservations/StationObservationsMapper;", "(Lcom/adif/elcanomovil/serviceNetworking/stationObservations/StationObservationsService;Lcom/adif/elcanomovil/repositories/stationObservations/StationObservationsMapper;)V", "observations", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/stationObservations/StationObservation;", "stations", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultStationsObservationsRepository implements StationsObservationsRepository {
    private final StationObservationsMapper stationObservationMapper;
    private final StationObservationsService stationsObservationsService;

    public DefaultStationsObservationsRepository(StationObservationsService stationsObservationsService, StationObservationsMapper stationObservationMapper) {
        Intrinsics.checkNotNullParameter(stationsObservationsService, "stationsObservationsService");
        Intrinsics.checkNotNullParameter(stationObservationMapper, "stationObservationMapper");
        this.stationsObservationsService = stationsObservationsService;
        this.stationObservationMapper = stationObservationMapper;
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsObservationsRepository
    public Object observations(List<String> list, Continuation<? super Flow<? extends AsyncResult<? extends List<StationObservation>>>> continuation) {
        return FlowKt.flow(new C0657a(list, this, null));
    }
}
