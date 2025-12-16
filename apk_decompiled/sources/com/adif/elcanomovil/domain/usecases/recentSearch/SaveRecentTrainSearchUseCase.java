package com.adif.elcanomovil.domain.usecases.recentSearch;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import n1.d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JP\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/recentSearch/SaveRecentTrainSearchUseCase;", "", "searchesRepository", "Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;", "(Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;)V", "invoke", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "date", "", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "observation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaveRecentTrainSearchUseCase {
    private final SearchesRepository searchesRepository;

    public SaveRecentTrainSearchUseCase(SearchesRepository searchesRepository) {
        Intrinsics.checkNotNullParameter(searchesRepository, "searchesRepository");
        this.searchesRepository = searchesRepository;
    }

    public final Object invoke(String str, String str2, String str3, String str4, String str5, long j4, long j5, String str6, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new d(this, str, str2, str3, str4, str5, j4, j5, str6, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
