package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.domain.providers.LocationProvider;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsForRegionUseCase;
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
public final class UseCases_ProvideGetStationsForRegionUseCaseFactory implements Factory<GetStationsForRegionUseCase> {
    private final Provider<Check24hProvider> check24hProvider;
    private final Provider<LocationProvider> locationProvider;
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetStationsForRegionUseCaseFactory(Provider<LocationProvider> provider, Provider<StationsRepository> provider2, Provider<Check24hProvider> provider3) {
        this.locationProvider = provider;
        this.stationsRepositoryProvider = provider2;
        this.check24hProvider = provider3;
    }

    public static UseCases_ProvideGetStationsForRegionUseCaseFactory create(Provider<LocationProvider> provider, Provider<StationsRepository> provider2, Provider<Check24hProvider> provider3) {
        return new UseCases_ProvideGetStationsForRegionUseCaseFactory(provider, provider2, provider3);
    }

    public static GetStationsForRegionUseCase provideGetStationsForRegionUseCase(LocationProvider locationProvider, StationsRepository stationsRepository, Check24hProvider check24hProvider) {
        return (GetStationsForRegionUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetStationsForRegionUseCase(locationProvider, stationsRepository, check24hProvider));
    }

    @Override // javax.inject.Provider
    public GetStationsForRegionUseCase get() {
        return provideGetStationsForRegionUseCase(this.locationProvider.get(), this.stationsRepositoryProvider.get(), this.check24hProvider.get());
    }
}
