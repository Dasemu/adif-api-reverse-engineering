package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.providers.PushIdTokenProvider;
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
public final class RepositoryModule_Companion_ProvidePushIdTokenProviderFactory implements Factory<PushIdTokenProvider> {
    private final Provider<PreferenceStorage> preferenceStorageProvider;

    public RepositoryModule_Companion_ProvidePushIdTokenProviderFactory(Provider<PreferenceStorage> provider) {
        this.preferenceStorageProvider = provider;
    }

    public static RepositoryModule_Companion_ProvidePushIdTokenProviderFactory create(Provider<PreferenceStorage> provider) {
        return new RepositoryModule_Companion_ProvidePushIdTokenProviderFactory(provider);
    }

    public static PushIdTokenProvider providePushIdTokenProvider(PreferenceStorage preferenceStorage) {
        return (PushIdTokenProvider) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.providePushIdTokenProvider(preferenceStorage));
    }

    @Override // javax.inject.Provider
    public PushIdTokenProvider get() {
        return providePushIdTokenProvider(this.preferenceStorageProvider.get());
    }
}
