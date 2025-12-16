package com.adif.elcanomovil.domain.usecases.stations;

import com.adif.elcanomovil.domain.entities.stationObservations.StationObservation;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.stations.StationsObservationsRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0086B¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsObservationsUseCase;", "", "stationsObservationsRepository", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsObservationsRepository;", "(Lcom/adif/elcanomovil/domain/repositories/stations/StationsObservationsRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/stationObservations/StationObservation;", "stations", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetStationsObservationsUseCase {
    private final StationsObservationsRepository stationsObservationsRepository;

    public GetStationsObservationsUseCase(StationsObservationsRepository stationsObservationsRepository) {
        Intrinsics.checkNotNullParameter(stationsObservationsRepository, "stationsObservationsRepository");
        this.stationsObservationsRepository = stationsObservationsRepository;
    }

    public final Object invoke(List<String> list, Continuation<? super Flow<? extends AsyncResult<? extends List<StationObservation>>>> continuation) {
        return this.stationsObservationsRepository.observations(list, continuation);
    }
}
