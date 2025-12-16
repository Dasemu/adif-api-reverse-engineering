package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.repositories.logos.LogosInfoRepository;
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
public final class RepositoryModule_Companion_ProvideLogosInfoRepositoryFactory implements Factory<LogosInfoRepository> {
    private final Provider<PreferenceStorage> storageProvider;

    public RepositoryModule_Companion_ProvideLogosInfoRepositoryFactory(Provider<PreferenceStorage> provider) {
        this.storageProvider = provider;
    }

    public static RepositoryModule_Companion_ProvideLogosInfoRepositoryFactory create(Provider<PreferenceStorage> provider) {
        return new RepositoryModule_Companion_ProvideLogosInfoRepositoryFactory(provider);
    }

    public static LogosInfoRepository provideLogosInfoRepository(PreferenceStorage preferenceStorage) {
        return (LogosInfoRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideLogosInfoRepository(preferenceStorage));
    }

    @Override // javax.inject.Provider
    public LogosInfoRepository get() {
        return provideLogosInfoRepository(this.storageProvider.get());
    }
}
