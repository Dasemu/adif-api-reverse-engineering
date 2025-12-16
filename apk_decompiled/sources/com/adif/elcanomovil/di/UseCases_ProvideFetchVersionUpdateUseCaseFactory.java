package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import com.adif.elcanomovil.domain.usecases.FetchVersionUpdateUseCase;
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
public final class UseCases_ProvideFetchVersionUpdateUseCaseFactory implements Factory<FetchVersionUpdateUseCase> {
    private final Provider<RemoteConfigVersionRepository> remoteConfigVersionRepositoryProvider;

    public UseCases_ProvideFetchVersionUpdateUseCaseFactory(Provider<RemoteConfigVersionRepository> provider) {
        this.remoteConfigVersionRepositoryProvider = provider;
    }

    public static UseCases_ProvideFetchVersionUpdateUseCaseFactory create(Provider<RemoteConfigVersionRepository> provider) {
        return new UseCases_ProvideFetchVersionUpdateUseCaseFactory(provider);
    }

    public static FetchVersionUpdateUseCase provideFetchVersionUpdateUseCase(RemoteConfigVersionRepository remoteConfigVersionRepository) {
        return (FetchVersionUpdateUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideFetchVersionUpdateUseCase(remoteConfigVersionRepository));
    }

    @Override // javax.inject.Provider
    public FetchVersionUpdateUseCase get() {
        return provideFetchVersionUpdateUseCase(this.remoteConfigVersionRepositoryProvider.get());
    }
}
