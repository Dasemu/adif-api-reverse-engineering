package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsUseCase;
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
public final class UseCases_ProvideGetStationsUseCaseFactory implements Factory<GetStationsUseCase> {
    private final Provider<Check24hProvider> check24hProvider;
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetStationsUseCaseFactory(Provider<StationsRepository> provider, Provider<Check24hProvider> provider2) {
        this.stationsRepositoryProvider = provider;
        this.check24hProvider = provider2;
    }

    public static UseCases_ProvideGetStationsUseCaseFactory create(Provider<StationsRepository> provider, Provider<Check24hProvider> provider2) {
        return new UseCases_ProvideGetStationsUseCaseFactory(provider, provider2);
    }

    public static GetStationsUseCase provideGetStationsUseCase(StationsRepository stationsRepository, Check24hProvider check24hProvider) {
        return (GetStationsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetStationsUseCase(stationsRepository, check24hProvider));
    }

    @Override // javax.inject.Provider
    public GetStationsUseCase get() {
        return provideGetStationsUseCase(this.stationsRepositoryProvider.get(), this.check24hProvider.get());
    }
}
