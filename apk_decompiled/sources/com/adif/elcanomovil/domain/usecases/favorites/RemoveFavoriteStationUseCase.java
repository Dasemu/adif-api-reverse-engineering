package com.adif.elcanomovil.domain.usecases.favorites;

import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import l1.g;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0086B¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteStationUseCase;", "", "favoritesRepository", "Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;", "(Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;)V", "invoke", "", "stationCode", "", "type", "Lcom/adif/elcanomovil/domain/entities/DataType;", "stationToCode", "isCercanias", "", "(Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/DataType;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RemoveFavoriteStationUseCase {
    private final FavoritesRepository favoritesRepository;

    public RemoveFavoriteStationUseCase(FavoritesRepository favoritesRepository) {
        Intrinsics.checkNotNullParameter(favoritesRepository, "favoritesRepository");
        this.favoritesRepository = favoritesRepository;
    }

    public static /* synthetic */ Object invoke$default(RemoveFavoriteStationUseCase removeFavoriteStationUseCase, String str, DataType dataType, String str2, Boolean bool, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        return removeFavoriteStationUseCase.invoke(str, dataType, str2, bool, continuation);
    }

    public final Object invoke(String str, DataType dataType, String str2, Boolean bool, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new g(this, str, dataType, str2, bool, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
