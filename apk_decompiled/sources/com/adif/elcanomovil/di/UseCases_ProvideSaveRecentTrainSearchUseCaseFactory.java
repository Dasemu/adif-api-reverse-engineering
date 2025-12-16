package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentTrainSearchUseCase;
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
public final class UseCases_ProvideSaveRecentTrainSearchUseCaseFactory implements Factory<SaveRecentTrainSearchUseCase> {
    private final Provider<SearchesRepository> searchesRepositoryProvider;

    public UseCases_ProvideSaveRecentTrainSearchUseCaseFactory(Provider<SearchesRepository> provider) {
        this.searchesRepositoryProvider = provider;
    }

    public static UseCases_ProvideSaveRecentTrainSearchUseCaseFactory create(Provider<SearchesRepository> provider) {
        return new UseCases_ProvideSaveRecentTrainSearchUseCaseFactory(provider);
    }

    public static SaveRecentTrainSearchUseCase provideSaveRecentTrainSearchUseCase(SearchesRepository searchesRepository) {
        return (SaveRecentTrainSearchUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideSaveRecentTrainSearchUseCase(searchesRepository));
    }

    @Override // javax.inject.Provider
    public SaveRecentTrainSearchUseCase get() {
        return provideSaveRecentTrainSearchUseCase(this.searchesRepositoryProvider.get());
    }
}
