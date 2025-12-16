package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.GetStationIsFavoriteUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class UseCases_ProvideGetStationIsFavoriteUseCaseFactory implements Factory<GetStationIsFavoriteUseCase> {
    private final Provider<FavoritesRepository> favoriteRepositoryProvider;

    public UseCases_ProvideGetStationIsFavoriteUseCaseFactory(Provider<FavoritesRepository> provider) {
        this.favoriteRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetStationIsFavoriteUseCaseFactory create(Provider<FavoritesRepository> provider) {
        return new UseCases_ProvideGetStationIsFavoriteUseCaseFactory(provider);
    }

    public static GetStationIsFavoriteUseCase provideGetStationIsFavoriteUseCase(FavoritesRepository favoritesRepository) {
        return (GetStationIsFavoriteUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetStationIsFavoriteUseCase(favoritesRepository));
    }

    @Override // javax.inject.Provider
    public GetStationIsFavoriteUseCase get() {
        return provideGetStationIsFavoriteUseCase(this.favoriteRepositoryProvider.get());
    }
}
