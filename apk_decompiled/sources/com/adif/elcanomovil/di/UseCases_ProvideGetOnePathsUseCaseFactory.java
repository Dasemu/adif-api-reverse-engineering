package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetOnePathsUseCase;
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
public final class UseCases_ProvideGetOnePathsUseCaseFactory implements Factory<GetOnePathsUseCase> {
    private final Provider<CirculationRepository> circulationRepositoryProvider;
    private final Provider<RemoteConfigVersionRepository> remoteConfigVersionRepositoryProvider;

    public UseCases_ProvideGetOnePathsUseCaseFactory(Provider<CirculationRepository> provider, Provider<RemoteConfigVersionRepository> provider2) {
        this.circulationRepositoryProvider = provider;
        this.remoteConfigVersionRepositoryProvider = provider2;
    }

    public static UseCases_ProvideGetOnePathsUseCaseFactory create(Provider<CirculationRepository> provider, Provider<RemoteConfigVersionRepository> provider2) {
        return new UseCases_ProvideGetOnePathsUseCaseFactory(provider, provider2);
    }

    public static GetOnePathsUseCase provideGetOnePathsUseCase(CirculationRepository circulationRepository, RemoteConfigVersionRepository remoteConfigVersionRepository) {
        return (GetOnePathsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetOnePathsUseCase(circulationRepository, remoteConfigVersionRepository));
    }

    @Override // javax.inject.Provider
    public GetOnePathsUseCase get() {
        return provideGetOnePathsUseCase(this.circulationRepositoryProvider.get(), this.remoteConfigVersionRepositoryProvider.get());
    }
}
