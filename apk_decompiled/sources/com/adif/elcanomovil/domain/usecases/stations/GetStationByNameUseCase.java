package com.adif.elcanomovil.domain.usecases.stations;

import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086B¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByNameUseCase;", "", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "(Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;)V", "invoke", "", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "searchText", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetStationByNameUseCase {
    private final StationsRepository stationsRepository;

    public GetStationByNameUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        this.stationsRepository = stationsRepository;
    }

    public final Object invoke(String str, Continuation<? super List<Station>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new f(this, str, null), continuation);
    }
}
