package com.adif.elcanomovil.repositories.di;

import android.content.Context;
import com.adif.elcanomovil.domain.providers.CredentialsProvider;
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
public final class RepositoryModule_Companion_ProvideCredentialsProviderFactory implements Factory<CredentialsProvider> {
    private final Provider<Context> contextProvider;

    public RepositoryModule_Companion_ProvideCredentialsProviderFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static RepositoryModule_Companion_ProvideCredentialsProviderFactory create(Provider<Context> provider) {
        return new RepositoryModule_Companion_ProvideCredentialsProviderFactory(provider);
    }

    public static CredentialsProvider provideCredentialsProvider(Context context) {
        return (CredentialsProvider) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideCredentialsProvider(context));
    }

    @Override // javax.inject.Provider
    public CredentialsProvider get() {
        return provideCredentialsProvider(this.contextProvider.get());
    }
}
