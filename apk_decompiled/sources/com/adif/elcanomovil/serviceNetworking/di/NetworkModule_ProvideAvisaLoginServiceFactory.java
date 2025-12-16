package com.adif.elcanomovil.serviceNetworking.di;

import Z2.G;
import com.adif.elcanomovil.serviceNetworking.avisa.AvisaLoginService;
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
public final class NetworkModule_ProvideAvisaLoginServiceFactory implements Factory<AvisaLoginService> {
    private final Provider<F> clientProvider;
    private final Provider<G> moshiProvider;

    public NetworkModule_ProvideAvisaLoginServiceFactory(Provider<F> provider, Provider<G> provider2) {
        this.clientProvider = provider;
        this.moshiProvider = provider2;
    }

    public static NetworkModule_ProvideAvisaLoginServiceFactory create(Provider<F> provider, Provider<G> provider2) {
        return new NetworkModule_ProvideAvisaLoginServiceFactory(provider, provider2);
    }

    public static AvisaLoginService provideAvisaLoginService(F f2, G g4) {
        return (AvisaLoginService) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideAvisaLoginService(f2, g4));
    }

    @Override // javax.inject.Provider
    public AvisaLoginService get() {
        return provideAvisaLoginService(this.clientProvider.get(), this.moshiProvider.get());
    }
}
