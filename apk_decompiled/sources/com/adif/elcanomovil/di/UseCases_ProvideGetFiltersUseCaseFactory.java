package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.filters.FiltersRepository;
import com.adif.elcanomovil.domain.usecases.filters.GetFiltersUseCase;
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
public final class UseCases_ProvideGetFiltersUseCaseFactory implements Factory<GetFiltersUseCase> {
    private final Provider<FiltersRepository> filtersRepositoryProvider;

    public UseCases_ProvideGetFiltersUseCaseFactory(Provider<FiltersRepository> provider) {
        this.filtersRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetFiltersUseCaseFactory create(Provider<FiltersRepository> provider) {
        return new UseCases_ProvideGetFiltersUseCaseFactory(provider);
    }

    public static GetFiltersUseCase provideGetFiltersUseCase(FiltersRepository filtersRepository) {
        return (GetFiltersUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetFiltersUseCase(filtersRepository));
    }

    @Override // javax.inject.Provider
    public GetFiltersUseCase get() {
        return provideGetFiltersUseCase(this.filtersRepositoryProvider.get());
    }
}
