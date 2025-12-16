package com.adif.elcanomovil.domain.usecases.stations;

import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0086B¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsUseCase;", "", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "check24hProvider", "Lcom/adif/elcanomovil/domain/providers/Check24hProvider;", "(Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;Lcom/adif/elcanomovil/domain/providers/Check24hProvider;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetStationsUseCase {
    private final Check24hProvider check24hProvider;
    private final StationsRepository stationsRepository;

    public GetStationsUseCase(StationsRepository stationsRepository, Check24hProvider check24hProvider) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        Intrinsics.checkNotNullParameter(check24hProvider, "check24hProvider");
        this.stationsRepository = stationsRepository;
        this.check24hProvider = check24hProvider;
    }

    public final Object invoke(Continuation<? super Flow<? extends AsyncResult<? extends List<Station>>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new h(this, null), continuation);
    }
}
