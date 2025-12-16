package com.adif.elcanomovil.serviceNetworking.di;

import Z2.G;
import com.adif.elcanomovil.serviceNetworking.compositions.CompositionsService;
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
public final class NetworkModule_ProvideTrainCompositionServiceFactory implements Factory<CompositionsService> {
    private final Provider<F> clientProvider;
    private final Provider<G> moshiProvider;

    public NetworkModule_ProvideTrainCompositionServiceFactory(Provider<F> provider, Provider<G> provider2) {
        this.clientProvider = provider;
        this.moshiProvider = provider2;
    }

    public static NetworkModule_ProvideTrainCompositionServiceFactory create(Provider<F> provider, Provider<G> provider2) {
        return new NetworkModule_ProvideTrainCompositionServiceFactory(provider, provider2);
    }

    public static CompositionsService provideTrainCompositionService(F f2, G g4) {
        return (CompositionsService) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideTrainCompositionService(f2, g4));
    }

    @Override // javax.inject.Provider
    public CompositionsService get() {
        return provideTrainCompositionService(this.clientProvider.get(), this.moshiProvider.get());
    }
}
