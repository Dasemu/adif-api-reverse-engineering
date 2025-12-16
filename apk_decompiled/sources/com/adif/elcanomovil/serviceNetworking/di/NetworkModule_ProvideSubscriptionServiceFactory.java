package com.adif.elcanomovil.serviceNetworking.di;

import Z2.G;
import com.adif.elcanomovil.serviceNetworking.subscriptions.SubscriptionsService;
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
public final class NetworkModule_ProvideSubscriptionServiceFactory implements Factory<SubscriptionsService> {
    private final Provider<F> clientProvider;
    private final Provider<G> moshiProvider;

    public NetworkModule_ProvideSubscriptionServiceFactory(Provider<F> provider, Provider<G> provider2) {
        this.clientProvider = provider;
        this.moshiProvider = provider2;
    }

    public static NetworkModule_ProvideSubscriptionServiceFactory create(Provider<F> provider, Provider<G> provider2) {
        return new NetworkModule_ProvideSubscriptionServiceFactory(provider, provider2);
    }

    public static SubscriptionsService provideSubscriptionService(F f2, G g4) {
        return (SubscriptionsService) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideSubscriptionService(f2, g4));
    }

    @Override // javax.inject.Provider
    public SubscriptionsService get() {
        return provideSubscriptionService(this.clientProvider.get(), this.moshiProvider.get());
    }
}
