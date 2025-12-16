package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.filters.FiltersRepository;
import com.adif.elcanomovil.domain.usecases.filters.SaveFilterUseCase;
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
public final class UseCases_ProvideSaveFilterUseCaseFactory implements Factory<SaveFilterUseCase> {
    private final Provider<FiltersRepository> filtersRepositoryProvider;

    public UseCases_ProvideSaveFilterUseCaseFactory(Provider<FiltersRepository> provider) {
        this.filtersRepositoryProvider = provider;
    }

    public static UseCases_ProvideSaveFilterUseCaseFactory create(Provider<FiltersRepository> provider) {
        return new UseCases_ProvideSaveFilterUseCaseFactory(provider);
    }

    public static SaveFilterUseCase provideSaveFilterUseCase(FiltersRepository filtersRepository) {
        return (SaveFilterUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideSaveFilterUseCase(filtersRepository));
    }

    @Override // javax.inject.Provider
    public SaveFilterUseCase get() {
        return provideSaveFilterUseCase(this.filtersRepositoryProvider.get());
    }
}
