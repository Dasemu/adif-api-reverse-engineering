package com.adif.elcanomovil.domain.usecases.favorites;

import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import l1.b;
import l1.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086B¢\u0006\u0002\u0010\tJ0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0086B¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/favorites/GetStationIsFavoriteUseCase;", "", "favoritesRepository", "Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;", "(Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;)V", "invoke", "", "idFavourite", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stationCode", "stationToCode", "type", "Lcom/adif/elcanomovil/domain/entities/DataType;", "isCercanias", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/DataType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetStationIsFavoriteUseCase {
    private final FavoritesRepository favoritesRepository;

    public GetStationIsFavoriteUseCase(FavoritesRepository favoritesRepository) {
        Intrinsics.checkNotNullParameter(favoritesRepository, "favoritesRepository");
        this.favoritesRepository = favoritesRepository;
    }

    public final Object invoke(String str, String str2, DataType dataType, boolean z3, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(this, str, str2, dataType, z3, null), continuation);
    }

    public final Object invoke(String str, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(this, str, null), continuation);
    }
}
