package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import com.adif.elcanomovil.domain.usecases.GetCirculationUpdateTimeUseCase;
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
public final class UseCases_ProvideGetCirculationUpdateTimeUseCaseFactory implements Factory<GetCirculationUpdateTimeUseCase> {
    private final Provider<RemoteConfigVersionRepository> remoteConfigVersionRepositoryProvider;

    public UseCases_ProvideGetCirculationUpdateTimeUseCaseFactory(Provider<RemoteConfigVersionRepository> provider) {
        this.remoteConfigVersionRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetCirculationUpdateTimeUseCaseFactory create(Provider<RemoteConfigVersionRepository> provider) {
        return new UseCases_ProvideGetCirculationUpdateTimeUseCaseFactory(provider);
    }

    public static GetCirculationUpdateTimeUseCase provideGetCirculationUpdateTimeUseCase(RemoteConfigVersionRepository remoteConfigVersionRepository) {
        return (GetCirculationUpdateTimeUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetCirculationUpdateTimeUseCase(remoteConfigVersionRepository));
    }

    @Override // javax.inject.Provider
    public GetCirculationUpdateTimeUseCase get() {
        return provideGetCirculationUpdateTimeUseCase(this.remoteConfigVersionRepositoryProvider.get());
    }
}
