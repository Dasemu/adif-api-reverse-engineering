package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteStationUseCase;
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
public final class UseCases_ProvideSaveFavoriteStationUseCaseFactory implements Factory<SaveFavoriteStationUseCase> {
    private final Provider<FavoritesRepository> favoriteRepositoryProvider;

    public UseCases_ProvideSaveFavoriteStationUseCaseFactory(Provider<FavoritesRepository> provider) {
        this.favoriteRepositoryProvider = provider;
    }

    public static UseCases_ProvideSaveFavoriteStationUseCaseFactory create(Provider<FavoritesRepository> provider) {
        return new UseCases_ProvideSaveFavoriteStationUseCaseFactory(provider);
    }

    public static SaveFavoriteStationUseCase provideSaveFavoriteStationUseCase(FavoritesRepository favoritesRepository) {
        return (SaveFavoriteStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideSaveFavoriteStationUseCase(favoritesRepository));
    }

    @Override // javax.inject.Provider
    public SaveFavoriteStationUseCase get() {
        return provideSaveFavoriteStationUseCase(this.favoriteRepositoryProvider.get());
    }
}
