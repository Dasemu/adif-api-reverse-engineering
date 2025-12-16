package com.adif.elcanomovil.domain.usecases.favorites;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import l1.j;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J^\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteTrainUseCase;", "", "favoritesRepository", "Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;", "(Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;)V", "invoke", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", "timeStationFrom", "timeStationTo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaveFavoriteTrainUseCase {
    private final FavoritesRepository favoritesRepository;

    public SaveFavoriteTrainUseCase(FavoritesRepository favoritesRepository) {
        Intrinsics.checkNotNullParameter(favoritesRepository, "favoritesRepository");
        this.favoritesRepository = favoritesRepository;
    }

    public final Object invoke(String str, String str2, String str3, String str4, String str5, Long l4, String str6, String str7, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new j(this, str3, str4, str5, l4, str, str2, str6, str7, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
