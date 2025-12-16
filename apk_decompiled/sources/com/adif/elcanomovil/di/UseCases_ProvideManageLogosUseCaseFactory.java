package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.LogoProvider;
import com.adif.elcanomovil.domain.repositories.logos.LogosInfoRepository;
import com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase;
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
public final class UseCases_ProvideManageLogosUseCaseFactory implements Factory<ManageLogosUseCase> {
    private final Provider<LogoProvider> logoProvider;
    private final Provider<LogosInfoRepository> logosInfoRepositoryProvider;

    public UseCases_ProvideManageLogosUseCaseFactory(Provider<LogosInfoRepository> provider, Provider<LogoProvider> provider2) {
        this.logosInfoRepositoryProvider = provider;
        this.logoProvider = provider2;
    }

    public static UseCases_ProvideManageLogosUseCaseFactory create(Provider<LogosInfoRepository> provider, Provider<LogoProvider> provider2) {
        return new UseCases_ProvideManageLogosUseCaseFactory(provider, provider2);
    }

    public static ManageLogosUseCase provideManageLogosUseCase(LogosInfoRepository logosInfoRepository, LogoProvider logoProvider) {
        return (ManageLogosUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideManageLogosUseCase(logosInfoRepository, logoProvider));
    }

    @Override // javax.inject.Provider
    public ManageLogosUseCase get() {
        return provideManageLogosUseCase(this.logosInfoRepositoryProvider.get(), this.logoProvider.get());
    }
}
