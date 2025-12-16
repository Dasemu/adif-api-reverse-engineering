package com.adif.elcanomovil.domain.usecases.circulation;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationToUseCase;", "", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "(Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;)V", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "", "invoke", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetLastDeparturesArrivalsStationToUseCase {
    private final CirculationRepository stationsRepository;

    public GetLastDeparturesArrivalsStationToUseCase(CirculationRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        this.stationsRepository = stationsRepository;
    }

    public final Flow<String> asFlow() {
        return this.stationsRepository.getDestinationStationCodeAsFlow();
    }

    public final String invoke() {
        return this.stationsRepository.getDestinationStationCode();
    }
}
