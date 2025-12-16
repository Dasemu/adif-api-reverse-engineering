package com.adif.elcanomovil.serviceNetworking.di;

import Z2.G;
import com.adif.elcanomovil.serviceNetworking.avisa.IncidenceService;
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
public final class NetworkModule_ProvideIncidenceServiceFactory implements Factory<IncidenceService> {
    private final Provider<F> clientProvider;
    private final Provider<G> moshiProvider;

    public NetworkModule_ProvideIncidenceServiceFactory(Provider<F> provider, Provider<G> provider2) {
        this.clientProvider = provider;
        this.moshiProvider = provider2;
    }

    public static NetworkModule_ProvideIncidenceServiceFactory create(Provider<F> provider, Provider<G> provider2) {
        return new NetworkModule_ProvideIncidenceServiceFactory(provider, provider2);
    }

    public static IncidenceService provideIncidenceService(F f2, G g4) {
        return (IncidenceService) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideIncidenceService(f2, g4));
    }

    @Override // javax.inject.Provider
    public IncidenceService get() {
        return provideIncidenceService(this.clientProvider.get(), this.moshiProvider.get());
    }
}
