package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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
public final class RepositoryModule_Companion_ProvideRemoteConfigVersionRepositoryFactory implements Factory<RemoteConfigVersionRepository> {
    private final Provider<PreferenceStorage> preferenceStorageProvider;
    private final Provider<FirebaseRemoteConfig> remoteConfigProvider;

    public RepositoryModule_Companion_ProvideRemoteConfigVersionRepositoryFactory(Provider<FirebaseRemoteConfig> provider, Provider<PreferenceStorage> provider2) {
        this.remoteConfigProvider = provider;
        this.preferenceStorageProvider = provider2;
    }

    public static RepositoryModule_Companion_ProvideRemoteConfigVersionRepositoryFactory create(Provider<FirebaseRemoteConfig> provider, Provider<PreferenceStorage> provider2) {
        return new RepositoryModule_Companion_ProvideRemoteConfigVersionRepositoryFactory(provider, provider2);
    }

    public static RemoteConfigVersionRepository provideRemoteConfigVersionRepository(FirebaseRemoteConfig firebaseRemoteConfig, PreferenceStorage preferenceStorage) {
        return (RemoteConfigVersionRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideRemoteConfigVersionRepository(firebaseRemoteConfig, preferenceStorage));
    }

    @Override // javax.inject.Provider
    public RemoteConfigVersionRepository get() {
        return provideRemoteConfigVersionRepository(this.remoteConfigProvider.get(), this.preferenceStorageProvider.get());
    }
}
