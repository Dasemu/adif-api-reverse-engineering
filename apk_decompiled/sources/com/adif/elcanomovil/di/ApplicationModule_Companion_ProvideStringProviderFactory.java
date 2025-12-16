package com.adif.elcanomovil.di;

import android.content.Context;
import d1.g;
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
public final class ApplicationModule_Companion_ProvideStringProviderFactory implements Factory<g> {
    private final Provider<Context> contextProvider;

    public ApplicationModule_Companion_ProvideStringProviderFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ApplicationModule_Companion_ProvideStringProviderFactory create(Provider<Context> provider) {
        return new ApplicationModule_Companion_ProvideStringProviderFactory(provider);
    }

    public static g provideStringProvider(Context context) {
        return (g) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideStringProvider(context));
    }

    @Override // javax.inject.Provider
    public g get() {
        return provideStringProvider(this.contextProvider.get());
    }
}
