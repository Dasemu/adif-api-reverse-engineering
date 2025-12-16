package com.adif.elcanomovil.serviceNetworking.di;

import Z2.G;
import com.adif.elcanomovil.serviceNetworking.circulations.CirculationService;
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
public final class NetworkModule_ProvideCirculationServiceFactory implements Factory<CirculationService> {
    private final Provider<F> clientProvider;
    private final Provider<G> moshiProvider;

    public NetworkModule_ProvideCirculationServiceFactory(Provider<F> provider, Provider<G> provider2) {
        this.clientProvider = provider;
        this.moshiProvider = provider2;
    }

    public static NetworkModule_ProvideCirculationServiceFactory create(Provider<F> provider, Provider<G> provider2) {
        return new NetworkModule_ProvideCirculationServiceFactory(provider, provider2);
    }

    public static CirculationService provideCirculationService(F f2, G g4) {
        return (CirculationService) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideCirculationService(f2, g4));
    }

    @Override // javax.inject.Provider
    public CirculationService get() {
        return provideCirculationService(this.clientProvider.get(), this.moshiProvider.get());
    }
}
