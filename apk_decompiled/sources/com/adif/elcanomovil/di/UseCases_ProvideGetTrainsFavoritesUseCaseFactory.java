package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.GetTrainsFavoritesUseCase;
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
public final class UseCases_ProvideGetTrainsFavoritesUseCaseFactory implements Factory<GetTrainsFavoritesUseCase> {
    private final Provider<FavoritesRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetTrainsFavoritesUseCaseFactory(Provider<FavoritesRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetTrainsFavoritesUseCaseFactory create(Provider<FavoritesRepository> provider) {
        return new UseCases_ProvideGetTrainsFavoritesUseCaseFactory(provider);
    }

    public static GetTrainsFavoritesUseCase provideGetTrainsFavoritesUseCase(FavoritesRepository favoritesRepository) {
        return (GetTrainsFavoritesUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetTrainsFavoritesUseCase(favoritesRepository));
    }

    @Override // javax.inject.Provider
    public GetTrainsFavoritesUseCase get() {
        return provideGetTrainsFavoritesUseCase(this.stationsRepositoryProvider.get());
    }
}
