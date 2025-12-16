package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.favourites.FavouritesTrainsMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.q;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvidesFavoritableTrainMapperFactory implements Factory<FavouritesTrainsMapper> {
    public static RepositoryModule_Companion_ProvidesFavoritableTrainMapperFactory create() {
        return q.f8407a;
    }

    public static FavouritesTrainsMapper providesFavoritableTrainMapper() {
        return (FavouritesTrainsMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.providesFavoritableTrainMapper());
    }

    @Override // javax.inject.Provider
    public FavouritesTrainsMapper get() {
        return providesFavoritableTrainMapper();
    }
}
