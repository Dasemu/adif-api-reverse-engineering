package com.adif.elcanomovil.domain.usecases.circulation;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.entities.circulation.CommercialCirculation;
import com.adif.elcanomovil.domain.entities.utils.SyncResult;
import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JF\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086B¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/circulation/GetBetweenStationsUseCase;", "", "circulationRepository", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "(Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;)V", "invoke", "Lcom/adif/elcanomovil/domain/entities/utils/SyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialCirculation;", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "isCercanias", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "page", "", "showOnlyCommercialStopType", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/TrainType;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetBetweenStationsUseCase {
    private final CirculationRepository circulationRepository;

    public GetBetweenStationsUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        this.circulationRepository = circulationRepository;
    }

    public final Object invoke(String str, String str2, TrainType trainType, int i, boolean z3, Continuation<? super SyncResult<? extends List<? extends CommercialCirculation>>> continuation) {
        return this.circulationRepository.betweenStations(str, str2, trainType, i, z3, continuation);
    }
}
