package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteTrainUseCase;
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
public final class UseCases_ProvideSaveFavoriteTrainUseCaseFactory implements Factory<SaveFavoriteTrainUseCase> {
    private final Provider<FavoritesRepository> favoriteRepositoryProvider;

    public UseCases_ProvideSaveFavoriteTrainUseCaseFactory(Provider<FavoritesRepository> provider) {
        this.favoriteRepositoryProvider = provider;
    }

    public static UseCases_ProvideSaveFavoriteTrainUseCaseFactory create(Provider<FavoritesRepository> provider) {
        return new UseCases_ProvideSaveFavoriteTrainUseCaseFactory(provider);
    }

    public static SaveFavoriteTrainUseCase provideSaveFavoriteTrainUseCase(FavoritesRepository favoritesRepository) {
        return (SaveFavoriteTrainUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideSaveFavoriteTrainUseCase(favoritesRepository));
    }

    @Override // javax.inject.Provider
    public SaveFavoriteTrainUseCase get() {
        return provideSaveFavoriteTrainUseCase(this.favoriteRepositoryProvider.get());
    }
}
