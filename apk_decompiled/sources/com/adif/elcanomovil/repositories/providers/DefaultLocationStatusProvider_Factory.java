package com.adif.elcanomovil.repositories.providers;

import d1.InterfaceC0307a;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class DefaultLocationStatusProvider_Factory implements Factory<DefaultLocationStatusProvider> {
    private final Provider<InterfaceC0307a> appDispatcherProvider;
    private final Provider<Z0.a> isLocationEnabledProvider;
    private final Provider<Z0.c> locationStatusReceiverProvider;

    public DefaultLocationStatusProvider_Factory(Provider<Z0.c> provider, Provider<Z0.a> provider2, Provider<InterfaceC0307a> provider3) {
        this.locationStatusReceiverProvider = provider;
        this.isLocationEnabledProvider = provider2;
        this.appDispatcherProvider = provider3;
    }

    public static DefaultLocationStatusProvider_Factory create(Provider<Z0.c> provider, Provider<Z0.a> provider2, Provider<InterfaceC0307a> provider3) {
        return new DefaultLocationStatusProvider_Factory(provider, provider2, provider3);
    }

    public static DefaultLocationStatusProvider newInstance(Z0.c cVar, Z0.a aVar, InterfaceC0307a interfaceC0307a) {
        return new DefaultLocationStatusProvider(cVar, aVar, interfaceC0307a);
    }

    @Override // javax.inject.Provider
    public DefaultLocationStatusProvider get() {
        return newInstance(this.locationStatusReceiverProvider.get(), this.isLocationEnabledProvider.get(), this.appDispatcherProvider.get());
    }
}
