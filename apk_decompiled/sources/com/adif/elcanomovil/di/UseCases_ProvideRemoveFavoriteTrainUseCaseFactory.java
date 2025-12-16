package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteTrainUseCase;
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
public final class UseCases_ProvideRemoveFavoriteTrainUseCaseFactory implements Factory<RemoveFavoriteTrainUseCase> {
    private final Provider<FavoritesRepository> favoriteRepositoryProvider;

    public UseCases_ProvideRemoveFavoriteTrainUseCaseFactory(Provider<FavoritesRepository> provider) {
        this.favoriteRepositoryProvider = provider;
    }

    public static UseCases_ProvideRemoveFavoriteTrainUseCaseFactory create(Provider<FavoritesRepository> provider) {
        return new UseCases_ProvideRemoveFavoriteTrainUseCaseFactory(provider);
    }

    public static RemoveFavoriteTrainUseCase provideRemoveFavoriteTrainUseCase(FavoritesRepository favoritesRepository) {
        return (RemoveFavoriteTrainUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideRemoveFavoriteTrainUseCase(favoritesRepository));
    }

    @Override // javax.inject.Provider
    public RemoveFavoriteTrainUseCase get() {
        return provideRemoveFavoriteTrainUseCase(this.favoriteRepositoryProvider.get());
    }
}
