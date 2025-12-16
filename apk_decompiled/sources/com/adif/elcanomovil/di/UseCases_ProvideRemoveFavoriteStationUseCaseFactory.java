package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteStationUseCase;
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
public final class UseCases_ProvideRemoveFavoriteStationUseCaseFactory implements Factory<RemoveFavoriteStationUseCase> {
    private final Provider<FavoritesRepository> favoriteRepositoryProvider;

    public UseCases_ProvideRemoveFavoriteStationUseCaseFactory(Provider<FavoritesRepository> provider) {
        this.favoriteRepositoryProvider = provider;
    }

    public static UseCases_ProvideRemoveFavoriteStationUseCaseFactory create(Provider<FavoritesRepository> provider) {
        return new UseCases_ProvideRemoveFavoriteStationUseCaseFactory(provider);
    }

    public static RemoveFavoriteStationUseCase provideRemoveFavoriteStationUseCase(FavoritesRepository favoritesRepository) {
        return (RemoveFavoriteStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideRemoveFavoriteStationUseCase(favoritesRepository));
    }

    @Override // javax.inject.Provider
    public RemoveFavoriteStationUseCase get() {
        return provideRemoveFavoriteStationUseCase(this.favoriteRepositoryProvider.get());
    }
}
