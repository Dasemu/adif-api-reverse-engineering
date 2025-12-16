package com.adif.elcanomovil.repositories.di;

import android.content.Context;
import com.adif.elcanomovil.domain.providers.GooglePlayVersionProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideGooglePlayStatusProviderFactory implements Factory<GooglePlayVersionProvider> {
    private final Provider<Context> contextProvider;

    public RepositoryModule_Companion_ProvideGooglePlayStatusProviderFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static RepositoryModule_Companion_ProvideGooglePlayStatusProviderFactory create(Provider<Context> provider) {
        return new RepositoryModule_Companion_ProvideGooglePlayStatusProviderFactory(provider);
    }

    public static GooglePlayVersionProvider provideGooglePlayStatusProvider(Context context) {
        return (GooglePlayVersionProvider) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideGooglePlayStatusProvider(context));
    }

    @Override // javax.inject.Provider
    public GooglePlayVersionProvider get() {
        return provideGooglePlayStatusProvider(this.contextProvider.get());
    }
}
