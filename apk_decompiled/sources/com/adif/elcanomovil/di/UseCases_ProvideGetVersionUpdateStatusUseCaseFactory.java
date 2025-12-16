package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.AppVersionProvider;
import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import com.adif.elcanomovil.domain.usecases.GetVersionUpdateStatusUseCase;
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
public final class UseCases_ProvideGetVersionUpdateStatusUseCaseFactory implements Factory<GetVersionUpdateStatusUseCase> {
    private final Provider<AppVersionProvider> appVersionProvider;
    private final Provider<RemoteConfigVersionRepository> remoteConfigVersionRepositoryProvider;

    public UseCases_ProvideGetVersionUpdateStatusUseCaseFactory(Provider<AppVersionProvider> provider, Provider<RemoteConfigVersionRepository> provider2) {
        this.appVersionProvider = provider;
        this.remoteConfigVersionRepositoryProvider = provider2;
    }

    public static UseCases_ProvideGetVersionUpdateStatusUseCaseFactory create(Provider<AppVersionProvider> provider, Provider<RemoteConfigVersionRepository> provider2) {
        return new UseCases_ProvideGetVersionUpdateStatusUseCaseFactory(provider, provider2);
    }

    public static GetVersionUpdateStatusUseCase provideGetVersionUpdateStatusUseCase(AppVersionProvider appVersionProvider, RemoteConfigVersionRepository remoteConfigVersionRepository) {
        return (GetVersionUpdateStatusUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetVersionUpdateStatusUseCase(appVersionProvider, remoteConfigVersionRepository));
    }

    @Override // javax.inject.Provider
    public GetVersionUpdateStatusUseCase get() {
        return provideGetVersionUpdateStatusUseCase(this.appVersionProvider.get(), this.remoteConfigVersionRepositoryProvider.get());
    }
}
