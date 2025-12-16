package com.adif.elcanomovil.domain.usecases.circulation;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDepartureTypeTrainIsCercaniasUseCase;", "", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "(Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;)V", "invoke", "", "trainTypeRequest", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository$TrainTypeRequest;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SetLastDepartureTypeTrainIsCercaniasUseCase {
    private final CirculationRepository stationsRepository;

    public SetLastDepartureTypeTrainIsCercaniasUseCase(CirculationRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        this.stationsRepository = stationsRepository;
    }

    public final void invoke(CirculationRepository.TrainTypeRequest trainTypeRequest) {
        this.stationsRepository.setLastDepartureTypeTrainIsCercanias(trainTypeRequest);
    }
}
