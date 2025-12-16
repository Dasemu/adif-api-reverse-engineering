package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.repositories.filters.FiltersRepository;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideFiltersRepositoryFactory implements Factory<FiltersRepository> {
    private final Provider<PreferenceStorage> storageProvider;

    public RepositoryModule_Companion_ProvideFiltersRepositoryFactory(Provider<PreferenceStorage> provider) {
        this.storageProvider = provider;
    }

    public static RepositoryModule_Companion_ProvideFiltersRepositoryFactory create(Provider<PreferenceStorage> provider) {
        return new RepositoryModule_Companion_ProvideFiltersRepositoryFactory(provider);
    }

    public static FiltersRepository provideFiltersRepository(PreferenceStorage preferenceStorage) {
        return (FiltersRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideFiltersRepository(preferenceStorage));
    }

    @Override // javax.inject.Provider
    public FiltersRepository get() {
        return provideFiltersRepository(this.storageProvider.get());
    }
}
