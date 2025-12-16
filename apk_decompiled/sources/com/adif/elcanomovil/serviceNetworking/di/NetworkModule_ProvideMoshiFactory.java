package com.adif.elcanomovil.serviceNetworking.di;

import Z2.G;
import Z2.InterfaceC0103k;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes.dex */
public final class NetworkModule_ProvideMoshiFactory implements Factory<G> {
    private final Provider<InterfaceC0103k> polymorphicFactoryProvider;
    private final Provider<InterfaceC0103k> polymorphicFactoryTrainProvider;

    public NetworkModule_ProvideMoshiFactory(Provider<InterfaceC0103k> provider, Provider<InterfaceC0103k> provider2) {
        this.polymorphicFactoryProvider = provider;
        this.polymorphicFactoryTrainProvider = provider2;
    }

    public static NetworkModule_ProvideMoshiFactory create(Provider<InterfaceC0103k> provider, Provider<InterfaceC0103k> provider2) {
        return new NetworkModule_ProvideMoshiFactory(provider, provider2);
    }

    public static G provideMoshi(InterfaceC0103k interfaceC0103k, InterfaceC0103k interfaceC0103k2) {
        return (G) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideMoshi(interfaceC0103k, interfaceC0103k2));
    }

    @Override // javax.inject.Provider
    public G get() {
        return provideMoshi(this.polymorphicFactoryProvider.get(), this.polymorphicFactoryTrainProvider.get());
    }
}
