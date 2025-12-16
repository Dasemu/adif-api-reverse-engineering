package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.providers.Check24hProvider;
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
public final class RepositoryModule_Companion_ProvideCheck24hProviderFactory implements Factory<Check24hProvider> {
    private final Provider<PreferenceStorage> preferenceStorageProvider;

    public RepositoryModule_Companion_ProvideCheck24hProviderFactory(Provider<PreferenceStorage> provider) {
        this.preferenceStorageProvider = provider;
    }

    public static RepositoryModule_Companion_ProvideCheck24hProviderFactory create(Provider<PreferenceStorage> provider) {
        return new RepositoryModule_Companion_ProvideCheck24hProviderFactory(provider);
    }

    public static Check24hProvider provideCheck24hProvider(PreferenceStorage preferenceStorage) {
        return (Check24hProvider) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideCheck24hProvider(preferenceStorage));
    }

    @Override // javax.inject.Provider
    public Check24hProvider get() {
        return provideCheck24hProvider(this.preferenceStorageProvider.get());
    }
}
