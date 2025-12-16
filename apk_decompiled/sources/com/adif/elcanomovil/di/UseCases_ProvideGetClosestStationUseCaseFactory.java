package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.domain.providers.LocationProvider;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase;
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
public final class UseCases_ProvideGetClosestStationUseCaseFactory implements Factory<GetClosestStationUseCase> {
    private final Provider<Check24hProvider> check24hProvider;
    private final Provider<LocationProvider> locationProvider;
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetClosestStationUseCaseFactory(Provider<LocationProvider> provider, Provider<StationsRepository> provider2, Provider<Check24hProvider> provider3) {
        this.locationProvider = provider;
        this.stationsRepositoryProvider = provider2;
        this.check24hProvider = provider3;
    }

    public static UseCases_ProvideGetClosestStationUseCaseFactory create(Provider<LocationProvider> provider, Provider<StationsRepository> provider2, Provider<Check24hProvider> provider3) {
        return new UseCases_ProvideGetClosestStationUseCaseFactory(provider, provider2, provider3);
    }

    public static GetClosestStationUseCase provideGetClosestStationUseCase(LocationProvider locationProvider, StationsRepository stationsRepository, Check24hProvider check24hProvider) {
        return (GetClosestStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetClosestStationUseCase(locationProvider, stationsRepository, check24hProvider));
    }

    @Override // javax.inject.Provider
    public GetClosestStationUseCase get() {
        return provideGetClosestStationUseCase(this.locationProvider.get(), this.stationsRepositoryProvider.get(), this.check24hProvider.get());
    }
}
