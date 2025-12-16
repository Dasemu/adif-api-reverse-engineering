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
import l1.i;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JV\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086B¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteStationUseCase;", "", "favoritesRepository", "Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;", "(Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;)V", "invoke", "", "stationCode", "", "stationName", "type", "Lcom/adif/elcanomovil/domain/entities/DataType;", "stationToCode", "stationToName", "isCercanias", "", "isRodalies", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/DataType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaveFavoriteStationUseCase {
    private final FavoritesRepository favoritesRepository;

    public SaveFavoriteStationUseCase(FavoritesRepository favoritesRepository) {
        Intrinsics.checkNotNullParameter(favoritesRepository, "favoritesRepository");
        this.favoritesRepository = favoritesRepository;
    }

    public static /* synthetic */ Object invoke$default(SaveFavoriteStationUseCase saveFavoriteStationUseCase, String str, String str2, DataType dataType, String str3, String str4, Boolean bool, Boolean bool2, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            bool2 = null;
        }
        return saveFavoriteStationUseCase.invoke(str, str2, dataType, str3, str4, bool, bool2, continuation);
    }

    public final Object invoke(String str, String str2, DataType dataType, String str3, String str4, Boolean bool, Boolean bool2, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new i(this, str, str2, dataType, str3, str4, bool, bool2, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
