package com.adif.elcanomovil.serviceNetworking.di;

import com.adif.elcanomovil.serviceNetworking.pinning.PinningRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import e3.C0322h;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class NetworkModule_ProvideCertificatePinnerFactory implements Factory<C0322h> {
    private final Provider<PinningRepository> pinningRepositoryProvider;

    public NetworkModule_ProvideCertificatePinnerFactory(Provider<PinningRepository> provider) {
        this.pinningRepositoryProvider = provider;
    }

    public static NetworkModule_ProvideCertificatePinnerFactory create(Provider<PinningRepository> provider) {
        return new NetworkModule_ProvideCertificatePinnerFactory(provider);
    }

    public static C0322h provideCertificatePinner(PinningRepository pinningRepository) {
        return (C0322h) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideCertificatePinner(pinningRepository));
    }

    @Override // javax.inject.Provider
    public C0322h get() {
        return provideCertificatePinner(this.pinningRepositoryProvider.get());
    }
}
