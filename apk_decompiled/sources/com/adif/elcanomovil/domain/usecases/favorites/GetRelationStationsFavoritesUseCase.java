package com.adif.elcanomovil.domain.usecases.favorites;

import com.adif.elcanomovil.domain.entities.FavouriteStation;
import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import l1.C0436a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086B¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/favorites/GetRelationStationsFavoritesUseCase;", "", "favoritesRepository", "Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;", "(Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/adif/elcanomovil/domain/entities/FavouriteStation;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetRelationStationsFavoritesUseCase {
    private final FavoritesRepository favoritesRepository;

    public GetRelationStationsFavoritesUseCase(FavoritesRepository favoritesRepository) {
        Intrinsics.checkNotNullParameter(favoritesRepository, "favoritesRepository");
        this.favoritesRepository = favoritesRepository;
    }

    public final Object invoke(Continuation<? super Flow<? extends List<FavouriteStation>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C0436a(this, null), continuation);
    }
}
