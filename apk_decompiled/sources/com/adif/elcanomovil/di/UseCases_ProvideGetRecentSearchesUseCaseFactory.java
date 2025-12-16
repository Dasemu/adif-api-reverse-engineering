package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentSearchesUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
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
public final class UseCases_ProvideGetRecentSearchesUseCaseFactory implements Factory<GetRecentSearchesUseCase> {
    private final Provider<GetStationByIdUseCase> getStationByIdUseCaseProvider;
    private final Provider<SearchesRepository> searchesRepositoryProvider;

    public UseCases_ProvideGetRecentSearchesUseCaseFactory(Provider<SearchesRepository> provider, Provider<GetStationByIdUseCase> provider2) {
        this.searchesRepositoryProvider = provider;
        this.getStationByIdUseCaseProvider = provider2;
    }

    public static UseCases_ProvideGetRecentSearchesUseCaseFactory create(Provider<SearchesRepository> provider, Provider<GetStationByIdUseCase> provider2) {
        return new UseCases_ProvideGetRecentSearchesUseCaseFactory(provider, provider2);
    }

    public static GetRecentSearchesUseCase provideGetRecentSearchesUseCase(SearchesRepository searchesRepository, GetStationByIdUseCase getStationByIdUseCase) {
        return (GetRecentSearchesUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetRecentSearchesUseCase(searchesRepository, getStationByIdUseCase));
    }

    @Override // javax.inject.Provider
    public GetRecentSearchesUseCase get() {
        return provideGetRecentSearchesUseCase(this.searchesRepositoryProvider.get(), this.getStationByIdUseCaseProvider.get());
    }
}
