package com.adif.elcanomovil.domain.usecases.avisa.incidence;

import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStation;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.avisa.IncidenceRepository;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086B¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/GetIncidenceDetailsUseCase;", "", "incidenceRepository", "Lcom/adif/elcanomovil/domain/repositories/avisa/IncidenceRepository;", "(Lcom/adif/elcanomovil/domain/repositories/avisa/IncidenceRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;", ServicePaths.IncidenceService.pathIncidenceId, "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetIncidenceDetailsUseCase {
    private final IncidenceRepository incidenceRepository;

    public GetIncidenceDetailsUseCase(IncidenceRepository incidenceRepository) {
        Intrinsics.checkNotNullParameter(incidenceRepository, "incidenceRepository");
        this.incidenceRepository = incidenceRepository;
    }

    public final Object invoke(int i, Continuation<? super Flow<AsyncResult<IncidenceStation>>> continuation) {
        return this.incidenceRepository.incidenceDetails(i, continuation);
    }
}
