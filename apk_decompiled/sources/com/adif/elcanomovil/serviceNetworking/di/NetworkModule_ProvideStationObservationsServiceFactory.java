package com.adif.elcanomovil.serviceNetworking.di;

import Z2.G;
import com.adif.elcanomovil.serviceNetworking.stationObservations.StationObservationsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import e3.F;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes.dex */
public final class NetworkModule_ProvideStationObservationsServiceFactory implements Factory<StationObservationsService> {
    private final Provider<F> clientProvider;
    private final Provider<G> moshiProvider;

    public NetworkModule_ProvideStationObservationsServiceFactory(Provider<F> provider, Provider<G> provider2) {
        this.clientProvider = provider;
        this.moshiProvider = provider2;
    }

    public static NetworkModule_ProvideStationObservationsServiceFactory create(Provider<F> provider, Provider<G> provider2) {
        return new NetworkModule_ProvideStationObservationsServiceFactory(provider, provider2);
    }

    public static StationObservationsService provideStationObservationsService(F f2, G g4) {
        return (StationObservationsService) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideStationObservationsService(f2, g4));
    }

    @Override // javax.inject.Provider
    public StationObservationsService get() {
        return provideStationObservationsService(this.clientProvider.get(), this.moshiProvider.get());
    }
}
