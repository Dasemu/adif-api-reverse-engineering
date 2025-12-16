package com.adif.elcanomovil.domain.usecases.circulation;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086B¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationUseCase;", "", "circulationRepository", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "(Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;)V", "invoke", "", "stationCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SetLastDeparturesArrivalsStationUseCase {
    private final CirculationRepository circulationRepository;

    public SetLastDeparturesArrivalsStationUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        this.circulationRepository = circulationRepository;
    }

    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        Object lastDepartureArrivalStation = this.circulationRepository.setLastDepartureArrivalStation(str, continuation);
        return lastDepartureArrivalStation == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? lastDepartureArrivalStation : Unit.INSTANCE;
    }
}
