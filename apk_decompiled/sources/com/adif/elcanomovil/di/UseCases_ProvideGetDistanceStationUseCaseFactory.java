package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.LocationProvider;
import com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentSearchesUseCase;
import com.adif.elcanomovil.domain.usecases.stations.ObserveRecentlySearchedStationsWithDistanceUseCase;
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
public final class UseCases_ProvideGetDistanceStationUseCaseFactory implements Factory<ObserveRecentlySearchedStationsWithDistanceUseCase> {
    private final Provider<GetRecentSearchesUseCase> getRecentStationsProvider;
    private final Provider<LocationProvider> locationProvider;

    public UseCases_ProvideGetDistanceStationUseCaseFactory(Provider<LocationProvider> provider, Provider<GetRecentSearchesUseCase> provider2) {
        this.locationProvider = provider;
        this.getRecentStationsProvider = provider2;
    }

    public static UseCases_ProvideGetDistanceStationUseCaseFactory create(Provider<LocationProvider> provider, Provider<GetRecentSearchesUseCase> provider2) {
        return new UseCases_ProvideGetDistanceStationUseCaseFactory(provider, provider2);
    }

    public static ObserveRecentlySearchedStationsWithDistanceUseCase provideGetDistanceStationUseCase(LocationProvider locationProvider, GetRecentSearchesUseCase getRecentSearchesUseCase) {
        return (ObserveRecentlySearchedStationsWithDistanceUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetDistanceStationUseCase(locationProvider, getRecentSearchesUseCase));
    }

    @Override // javax.inject.Provider
    public ObserveRecentlySearchedStationsWithDistanceUseCase get() {
        return provideGetDistanceStationUseCase(this.locationProvider.get(), this.getRecentStationsProvider.get());
    }
}
