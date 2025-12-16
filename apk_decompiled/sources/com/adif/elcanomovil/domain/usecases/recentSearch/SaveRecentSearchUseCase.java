package com.adif.elcanomovil.domain.usecases.recentSearch;

import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import n1.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086B¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/recentSearch/SaveRecentSearchUseCase;", "", "searchesRepository", "Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;", "(Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;)V", "invoke", "", "stationsCode", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaveRecentSearchUseCase {
    private final SearchesRepository searchesRepository;

    public SaveRecentSearchUseCase(SearchesRepository searchesRepository) {
        Intrinsics.checkNotNullParameter(searchesRepository, "searchesRepository");
        this.searchesRepository = searchesRepository;
    }

    public final Object invoke(List<String> list, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new c(this, list, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
