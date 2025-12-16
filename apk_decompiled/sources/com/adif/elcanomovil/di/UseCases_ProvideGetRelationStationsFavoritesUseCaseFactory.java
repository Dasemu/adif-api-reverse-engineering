package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.GetRelationStationsFavoritesUseCase;
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
public final class UseCases_ProvideGetRelationStationsFavoritesUseCaseFactory implements Factory<GetRelationStationsFavoritesUseCase> {
    private final Provider<FavoritesRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetRelationStationsFavoritesUseCaseFactory(Provider<FavoritesRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetRelationStationsFavoritesUseCaseFactory create(Provider<FavoritesRepository> provider) {
        return new UseCases_ProvideGetRelationStationsFavoritesUseCaseFactory(provider);
    }

    public static GetRelationStationsFavoritesUseCase provideGetRelationStationsFavoritesUseCase(FavoritesRepository favoritesRepository) {
        return (GetRelationStationsFavoritesUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetRelationStationsFavoritesUseCase(favoritesRepository));
    }

    @Override // javax.inject.Provider
    public GetRelationStationsFavoritesUseCase get() {
        return provideGetRelationStationsFavoritesUseCase(this.stationsRepositoryProvider.get());
    }
}
