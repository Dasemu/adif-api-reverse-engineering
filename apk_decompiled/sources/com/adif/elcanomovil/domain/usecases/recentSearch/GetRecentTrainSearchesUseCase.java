package com.adif.elcanomovil.domain.usecases.recentSearch;

import com.adif.elcanomovil.domain.entities.StorableData;
import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import n1.b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086B¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/recentSearch/GetRecentTrainSearchesUseCase;", "", "searchesRepository", "Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;", "(Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;)V", "invoke", "", "Lcom/adif/elcanomovil/domain/entities/StorableData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetRecentTrainSearchesUseCase {
    private final SearchesRepository searchesRepository;

    public GetRecentTrainSearchesUseCase(SearchesRepository searchesRepository) {
        Intrinsics.checkNotNullParameter(searchesRepository, "searchesRepository");
        this.searchesRepository = searchesRepository;
    }

    public final Object invoke(Continuation<? super List<? extends StorableData>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(this, null), continuation);
    }
}
