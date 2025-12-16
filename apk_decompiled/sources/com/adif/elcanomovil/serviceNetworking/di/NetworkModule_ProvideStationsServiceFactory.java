package com.adif.elcanomovil.serviceNetworking.di;

import Z2.G;
import com.adif.elcanomovil.serviceNetworking.stations.StationsService;
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
public final class NetworkModule_ProvideStationsServiceFactory implements Factory<StationsService> {
    private final Provider<F> clientProvider;
    private final Provider<G> moshiProvider;

    public NetworkModule_ProvideStationsServiceFactory(Provider<F> provider, Provider<G> provider2) {
        this.clientProvider = provider;
        this.moshiProvider = provider2;
    }

    public static NetworkModule_ProvideStationsServiceFactory create(Provider<F> provider, Provider<G> provider2) {
        return new NetworkModule_ProvideStationsServiceFactory(provider, provider2);
    }

    public static StationsService provideStationsService(F f2, G g4) {
        return (StationsService) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideStationsService(f2, g4));
    }

    @Override // javax.inject.Provider
    public StationsService get() {
        return provideStationsService(this.clientProvider.get(), this.moshiProvider.get());
    }
}
