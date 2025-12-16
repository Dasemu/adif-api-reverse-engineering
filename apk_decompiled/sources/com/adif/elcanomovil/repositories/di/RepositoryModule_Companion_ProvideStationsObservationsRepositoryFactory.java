package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsObservationsRepository;
import com.adif.elcanomovil.repositories.stationObservations.StationObservationsMapper;
import com.adif.elcanomovil.serviceNetworking.stationObservations.StationObservationsService;
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
public final class RepositoryModule_Companion_ProvideStationsObservationsRepositoryFactory implements Factory<StationsObservationsRepository> {
    private final Provider<StationObservationsMapper> stationObservationMapperProvider;
    private final Provider<StationObservationsService> stationsObservationsServiceProvider;

    public RepositoryModule_Companion_ProvideStationsObservationsRepositoryFactory(Provider<StationObservationsService> provider, Provider<StationObservationsMapper> provider2) {
        this.stationsObservationsServiceProvider = provider;
        this.stationObservationMapperProvider = provider2;
    }

    public static RepositoryModule_Companion_ProvideStationsObservationsRepositoryFactory create(Provider<StationObservationsService> provider, Provider<StationObservationsMapper> provider2) {
        return new RepositoryModule_Companion_ProvideStationsObservationsRepositoryFactory(provider, provider2);
    }

    public static StationsObservationsRepository provideStationsObservationsRepository(StationObservationsService stationObservationsService, StationObservationsMapper stationObservationsMapper) {
        return (StationsObservationsRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideStationsObservationsRepository(stationObservationsService, stationObservationsMapper));
    }

    @Override // javax.inject.Provider
    public StationsObservationsRepository get() {
        return provideStationsObservationsRepository(this.stationsObservationsServiceProvider.get(), this.stationObservationMapperProvider.get());
    }
}
