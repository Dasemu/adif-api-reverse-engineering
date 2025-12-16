package com.adif.elcanomovil.domain.usecases.circulation;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDepartureTypeTrainIsCercaniasUseCase;", "", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "(Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;)V", "invoke", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository$TrainTypeRequest;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetLastDepartureTypeTrainIsCercaniasUseCase {
    private final CirculationRepository stationsRepository;

    public GetLastDepartureTypeTrainIsCercaniasUseCase(CirculationRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        this.stationsRepository = stationsRepository;
    }

    public final CirculationRepository.TrainTypeRequest invoke() {
        return this.stationsRepository.readTrainTypeRequest();
    }
}
