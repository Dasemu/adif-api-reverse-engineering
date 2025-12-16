package com.adif.elcanomovil.serviceNetworking.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import e3.C0322h;
import e3.F;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<F> {
    private final Provider<C0322h> certificatePinnerProvider;

    public NetworkModule_ProvideOkHttpClientFactory(Provider<C0322h> provider) {
        this.certificatePinnerProvider = provider;
    }

    public static NetworkModule_ProvideOkHttpClientFactory create(Provider<C0322h> provider) {
        return new NetworkModule_ProvideOkHttpClientFactory(provider);
    }

    public static F provideOkHttpClient(C0322h c0322h) {
        return (F) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideOkHttpClient(c0322h));
    }

    @Override // javax.inject.Provider
    public F get() {
        return provideOkHttpClient(this.certificatePinnerProvider.get());
    }
}
