package com.adif.elcanomovil.domain.usecases.circulation;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JH\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086B¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/circulation/GetOnePathsUseCase;", "", "circulationRepository", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "remoteConfigVersionRepository", "Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;", "(Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;)V", "delayTime", "", "getDelayTime", "()J", "updateTime", "getUpdateTime", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_ALL_CONTROL_POINTS, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetOnePathsUseCase {
    private final CirculationRepository circulationRepository;
    private final RemoteConfigVersionRepository remoteConfigVersionRepository;

    public GetOnePathsUseCase(CirculationRepository circulationRepository, RemoteConfigVersionRepository remoteConfigVersionRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        Intrinsics.checkNotNullParameter(remoteConfigVersionRepository, "remoteConfigVersionRepository");
        this.circulationRepository = circulationRepository;
        this.remoteConfigVersionRepository = remoteConfigVersionRepository;
    }

    public final long getDelayTime() {
        return 300L;
    }

    public final long getUpdateTime() {
        return this.remoteConfigVersionRepository.getCirculationsFetchInterval() * 1000;
    }

    public final Object invoke(String str, String str2, String str3, long j4, boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<CommercialPathRouteSidesInfo>>>> continuation) {
        return this.circulationRepository.onePaths(str, str2, str3, j4, z3, continuation);
    }
}
