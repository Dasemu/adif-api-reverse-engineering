package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentTrainSearchesUseCase;
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
public final class UseCases_ProvideGetRecentTrainSearchesUseCaseFactory implements Factory<GetRecentTrainSearchesUseCase> {
    private final Provider<SearchesRepository> searchesRepositoryProvider;

    public UseCases_ProvideGetRecentTrainSearchesUseCaseFactory(Provider<SearchesRepository> provider) {
        this.searchesRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetRecentTrainSearchesUseCaseFactory create(Provider<SearchesRepository> provider) {
        return new UseCases_ProvideGetRecentTrainSearchesUseCaseFactory(provider);
    }

    public static GetRecentTrainSearchesUseCase provideGetRecentTrainSearchesUseCase(SearchesRepository searchesRepository) {
        return (GetRecentTrainSearchesUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetRecentTrainSearchesUseCase(searchesRepository));
    }

    @Override // javax.inject.Provider
    public GetRecentTrainSearchesUseCase get() {
        return provideGetRecentTrainSearchesUseCase(this.searchesRepositoryProvider.get());
    }
}
