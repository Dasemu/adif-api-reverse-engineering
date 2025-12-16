package com.adif.elcanomovil.domain.usecases.avisa.station;

import com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.avisa.AvisaStationsRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086B¢\u0006\u0002\u0010\nJ(\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086B¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationCategoriesUseCase;", "", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaStationsRepository;", "(Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaStationsRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStationCategory;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stationCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetAvisaStationCategoriesUseCase {
    private final AvisaStationsRepository stationsRepository;

    public GetAvisaStationCategoriesUseCase(AvisaStationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        this.stationsRepository = stationsRepository;
    }

    public final Object invoke(String str, Continuation<? super Flow<? extends AsyncResult<? extends List<AvisaStationCategory>>>> continuation) {
        return this.stationsRepository.fetchStationCategories(str, continuation);
    }

    public final Object invoke(Continuation<? super Flow<? extends AsyncResult<? extends List<AvisaStationCategory>>>> continuation) {
        return AvisaStationsRepository.DefaultImpls.fetchStationCategories$default(this.stationsRepository, false, continuation, 1, null);
    }
}
