package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository;
import com.adif.elcanomovil.repositories.compositions.CompositionsMapper;
import com.adif.elcanomovil.serviceNetworking.compositions.CompositionsService;
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
public final class RepositoryModule_Companion_ProvideCompositionsRepositoryFactory implements Factory<CompositionsRepository> {
    private final Provider<CompositionsMapper> compositionsMapperProvider;
    private final Provider<CompositionsService> compositionsServiceProvider;
    private final Provider<PreferenceStorage> preferenceStorageProvider;

    public RepositoryModule_Companion_ProvideCompositionsRepositoryFactory(Provider<CompositionsService> provider, Provider<CompositionsMapper> provider2, Provider<PreferenceStorage> provider3) {
        this.compositionsServiceProvider = provider;
        this.compositionsMapperProvider = provider2;
        this.preferenceStorageProvider = provider3;
    }

    public static RepositoryModule_Companion_ProvideCompositionsRepositoryFactory create(Provider<CompositionsService> provider, Provider<CompositionsMapper> provider2, Provider<PreferenceStorage> provider3) {
        return new RepositoryModule_Companion_ProvideCompositionsRepositoryFactory(provider, provider2, provider3);
    }

    public static CompositionsRepository provideCompositionsRepository(CompositionsService compositionsService, CompositionsMapper compositionsMapper, PreferenceStorage preferenceStorage) {
        return (CompositionsRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideCompositionsRepository(compositionsService, compositionsMapper, preferenceStorage));
    }

    @Override // javax.inject.Provider
    public CompositionsRepository get() {
        return provideCompositionsRepository(this.compositionsServiceProvider.get(), this.compositionsMapperProvider.get(), this.preferenceStorageProvider.get());
    }
}
