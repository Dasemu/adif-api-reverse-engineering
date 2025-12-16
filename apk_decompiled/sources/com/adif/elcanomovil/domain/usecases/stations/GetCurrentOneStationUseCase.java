package com.adif.elcanomovil.domain.usecases.stations;

import com.adif.elcanomovil.domain.entities.station.RequestedStationInfo;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/stations/GetCurrentOneStationUseCase;", "", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "(Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "Lcom/adif/elcanomovil/domain/entities/station/RequestedStationInfo;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetCurrentOneStationUseCase {
    private final StationsRepository stationsRepository;

    public GetCurrentOneStationUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        this.stationsRepository = stationsRepository;
    }

    public final Flow<AsyncResult<RequestedStationInfo>> invoke() {
        return this.stationsRepository.getCurrentOneStation();
    }
}
