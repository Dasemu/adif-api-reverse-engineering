package com.adif.elcanomovil.repositories.di;

import android.content.Context;
import com.adif.elcanomovil.domain.providers.LogoProvider;
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
public final class RepositoryModule_Companion_ProvideLogoProviderFactory implements Factory<LogoProvider> {
    private final Provider<Context> contextProvider;

    public RepositoryModule_Companion_ProvideLogoProviderFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static RepositoryModule_Companion_ProvideLogoProviderFactory create(Provider<Context> provider) {
        return new RepositoryModule_Companion_ProvideLogoProviderFactory(provider);
    }

    public static LogoProvider provideLogoProvider(Context context) {
        return (LogoProvider) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideLogoProvider(context));
    }

    @Override // javax.inject.Provider
    public LogoProvider get() {
        return provideLogoProvider(this.contextProvider.get());
    }
}
