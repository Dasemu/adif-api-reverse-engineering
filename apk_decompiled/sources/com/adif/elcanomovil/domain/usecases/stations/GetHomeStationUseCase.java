package com.adif.elcanomovil.domain.usecases.stations;

import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0086B¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;", "", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "(Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;)V", "invoke", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetHomeStationUseCase {
    private final StationsRepository stationsRepository;

    public GetHomeStationUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        this.stationsRepository = stationsRepository;
    }

    public final Object invoke(Continuation<? super Station> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(this, null), continuation);
    }
}
