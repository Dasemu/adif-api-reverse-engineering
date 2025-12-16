package com.adif.elcanomovil.repositories.di;

import android.content.Context;
import com.adif.elcanomovil.domain.providers.AppVersionProvider;
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
public final class RepositoryModule_Companion_ProvideAppVersionProviderFactory implements Factory<AppVersionProvider> {
    private final Provider<Context> contextProvider;

    public RepositoryModule_Companion_ProvideAppVersionProviderFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static RepositoryModule_Companion_ProvideAppVersionProviderFactory create(Provider<Context> provider) {
        return new RepositoryModule_Companion_ProvideAppVersionProviderFactory(provider);
    }

    public static AppVersionProvider provideAppVersionProvider(Context context) {
        return (AppVersionProvider) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideAppVersionProvider(context));
    }

    @Override // javax.inject.Provider
    public AppVersionProvider get() {
        return provideAppVersionProvider(this.contextProvider.get());
    }
}
