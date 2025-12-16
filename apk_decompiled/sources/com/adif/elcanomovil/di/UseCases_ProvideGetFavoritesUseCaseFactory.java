package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.GetStationsFavoritesUseCase;
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
public final class UseCases_ProvideGetFavoritesUseCaseFactory implements Factory<GetStationsFavoritesUseCase> {
    private final Provider<FavoritesRepository> favoriteRepositoryProvider;

    public UseCases_ProvideGetFavoritesUseCaseFactory(Provider<FavoritesRepository> provider) {
        this.favoriteRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetFavoritesUseCaseFactory create(Provider<FavoritesRepository> provider) {
        return new UseCases_ProvideGetFavoritesUseCaseFactory(provider);
    }

    public static GetStationsFavoritesUseCase provideGetFavoritesUseCase(FavoritesRepository favoritesRepository) {
        return (GetStationsFavoritesUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetFavoritesUseCase(favoritesRepository));
    }

    @Override // javax.inject.Provider
    public GetStationsFavoritesUseCase get() {
        return provideGetFavoritesUseCase(this.favoriteRepositoryProvider.get());
    }
}
