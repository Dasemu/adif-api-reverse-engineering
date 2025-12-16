package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.GetTrainIsFavoriteUseCase;
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
public final class UseCases_ProvideGetTrainIsFavoriteUseCaseFactory implements Factory<GetTrainIsFavoriteUseCase> {
    private final Provider<FavoritesRepository> favoriteRepositoryProvider;

    public UseCases_ProvideGetTrainIsFavoriteUseCaseFactory(Provider<FavoritesRepository> provider) {
        this.favoriteRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetTrainIsFavoriteUseCaseFactory create(Provider<FavoritesRepository> provider) {
        return new UseCases_ProvideGetTrainIsFavoriteUseCaseFactory(provider);
    }

    public static GetTrainIsFavoriteUseCase provideGetTrainIsFavoriteUseCase(FavoritesRepository favoritesRepository) {
        return (GetTrainIsFavoriteUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetTrainIsFavoriteUseCase(favoritesRepository));
    }

    @Override // javax.inject.Provider
    public GetTrainIsFavoriteUseCase get() {
        return provideGetTrainIsFavoriteUseCase(this.favoriteRepositoryProvider.get());
    }
}
