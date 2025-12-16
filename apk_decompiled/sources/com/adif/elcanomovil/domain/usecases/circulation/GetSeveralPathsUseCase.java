package com.adif.elcanomovil.domain.usecases.circulation;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import java.util.List;
import k1.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086B¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/circulation/GetSeveralPathsUseCase;", "", "circulationRepository", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "(Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_ALL_CONTROL_POINTS, "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetSeveralPathsUseCase {
    private final CirculationRepository circulationRepository;

    public GetSeveralPathsUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        this.circulationRepository = circulationRepository;
    }

    public final Object invoke(String str, boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<CommercialPathRouteSidesInfo>>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new f(this, str, z3, null), continuation);
    }
}
