package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.favourites.FavouritesStationsMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0607p;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvidesFavoritableMapperFactory implements Factory<FavouritesStationsMapper> {
    public static RepositoryModule_Companion_ProvidesFavoritableMapperFactory create() {
        return AbstractC0607p.f8406a;
    }

    public static FavouritesStationsMapper providesFavoritableMapper() {
        return (FavouritesStationsMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.providesFavoritableMapper());
    }

    @Override // javax.inject.Provider
    public FavouritesStationsMapper get() {
        return providesFavoritableMapper();
    }
}
