package com.adif.elcanomovil.repositories.di;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideFusedLocationProviderClientFactory implements Factory<FusedLocationProviderClient> {
    private final Provider<Context> contextProvider;

    public RepositoryModule_Companion_ProvideFusedLocationProviderClientFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static RepositoryModule_Companion_ProvideFusedLocationProviderClientFactory create(Provider<Context> provider) {
        return new RepositoryModule_Companion_ProvideFusedLocationProviderClientFactory(provider);
    }

    public static FusedLocationProviderClient provideFusedLocationProviderClient(Context context) {
        return (FusedLocationProviderClient) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideFusedLocationProviderClient(context));
    }

    @Override // javax.inject.Provider
    public FusedLocationProviderClient get() {
        return provideFusedLocationProviderClient(this.contextProvider.get());
    }
}
