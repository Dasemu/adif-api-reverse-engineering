package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository;
import com.adif.elcanomovil.repositories.avisa.TokenMapper;
import com.adif.elcanomovil.serviceNetworking.avisa.AvisaLoginService;
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
public final class RepositoryModule_Companion_ProvideAvisaLoginRepositoryFactory implements Factory<AvisaLoginRepository> {
    private final Provider<AvisaLoginService> avisaLoginServiceProvider;
    private final Provider<PreferenceStorage> preferencesProvider;
    private final Provider<TokenMapper> tokenMapperProvider;

    public RepositoryModule_Companion_ProvideAvisaLoginRepositoryFactory(Provider<AvisaLoginService> provider, Provider<PreferenceStorage> provider2, Provider<TokenMapper> provider3) {
        this.avisaLoginServiceProvider = provider;
        this.preferencesProvider = provider2;
        this.tokenMapperProvider = provider3;
    }

    public static RepositoryModule_Companion_ProvideAvisaLoginRepositoryFactory create(Provider<AvisaLoginService> provider, Provider<PreferenceStorage> provider2, Provider<TokenMapper> provider3) {
        return new RepositoryModule_Companion_ProvideAvisaLoginRepositoryFactory(provider, provider2, provider3);
    }

    public static AvisaLoginRepository provideAvisaLoginRepository(AvisaLoginService avisaLoginService, PreferenceStorage preferenceStorage, TokenMapper tokenMapper) {
        return (AvisaLoginRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideAvisaLoginRepository(avisaLoginService, preferenceStorage, tokenMapper));
    }

    @Override // javax.inject.Provider
    public AvisaLoginRepository get() {
        return provideAvisaLoginRepository(this.avisaLoginServiceProvider.get(), this.preferencesProvider.get(), this.tokenMapperProvider.get());
    }
}
