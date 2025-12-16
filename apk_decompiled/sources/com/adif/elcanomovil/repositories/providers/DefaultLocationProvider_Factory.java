package com.adif.elcanomovil.repositories.providers;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class DefaultLocationProvider_Factory implements Factory<DefaultLocationProvider> {
    private final Provider<Context> contextProvider;
    private final Provider<FusedLocationProviderClient> fusedLocationClientProvider;

    public DefaultLocationProvider_Factory(Provider<FusedLocationProviderClient> provider, Provider<Context> provider2) {
        this.fusedLocationClientProvider = provider;
        this.contextProvider = provider2;
    }

    public static DefaultLocationProvider_Factory create(Provider<FusedLocationProviderClient> provider, Provider<Context> provider2) {
        return new DefaultLocationProvider_Factory(provider, provider2);
    }

    public static DefaultLocationProvider newInstance(FusedLocationProviderClient fusedLocationProviderClient, Context context) {
        return new DefaultLocationProvider(fusedLocationProviderClient, context);
    }

    @Override // javax.inject.Provider
    public DefaultLocationProvider get() {
        return newInstance(this.fusedLocationClientProvider.get(), this.contextProvider.get());
    }
}
