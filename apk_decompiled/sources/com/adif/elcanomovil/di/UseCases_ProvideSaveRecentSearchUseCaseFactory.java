package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentSearchUseCase;
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
public final class UseCases_ProvideSaveRecentSearchUseCaseFactory implements Factory<SaveRecentSearchUseCase> {
    private final Provider<SearchesRepository> searchesRepositoryProvider;

    public UseCases_ProvideSaveRecentSearchUseCaseFactory(Provider<SearchesRepository> provider) {
        this.searchesRepositoryProvider = provider;
    }

    public static UseCases_ProvideSaveRecentSearchUseCaseFactory create(Provider<SearchesRepository> provider) {
        return new UseCases_ProvideSaveRecentSearchUseCaseFactory(provider);
    }

    public static SaveRecentSearchUseCase provideSaveRecentSearchUseCase(SearchesRepository searchesRepository) {
        return (SaveRecentSearchUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideSaveRecentSearchUseCase(searchesRepository));
    }

    @Override // javax.inject.Provider
    public SaveRecentSearchUseCase get() {
        return provideSaveRecentSearchUseCase(this.searchesRepositoryProvider.get());
    }
}
