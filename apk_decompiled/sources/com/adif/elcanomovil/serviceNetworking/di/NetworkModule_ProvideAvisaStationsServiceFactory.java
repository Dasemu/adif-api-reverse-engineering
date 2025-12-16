package com.adif.elcanomovil.serviceNetworking.di;

import Z2.G;
import com.adif.elcanomovil.serviceNetworking.avisa.AvisaStationsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import e3.F;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class NetworkModule_ProvideAvisaStationsServiceFactory implements Factory<AvisaStationsService> {
    private final Provider<F> clientProvider;
    private final Provider<G> moshiProvider;

    public NetworkModule_ProvideAvisaStationsServiceFactory(Provider<F> provider, Provider<G> provider2) {
        this.clientProvider = provider;
        this.moshiProvider = provider2;
    }

    public static NetworkModule_ProvideAvisaStationsServiceFactory create(Provider<F> provider, Provider<G> provider2) {
        return new NetworkModule_ProvideAvisaStationsServiceFactory(provider, provider2);
    }

    public static AvisaStationsService provideAvisaStationsService(F f2, G g4) {
        return (AvisaStationsService) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideAvisaStationsService(f2, g4));
    }

    @Override // javax.inject.Provider
    public AvisaStationsService get() {
        return provideAvisaStationsService(this.clientProvider.get(), this.moshiProvider.get());
    }
}
