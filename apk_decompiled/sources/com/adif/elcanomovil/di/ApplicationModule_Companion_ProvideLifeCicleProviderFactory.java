package com.adif.elcanomovil.di;

import androidx.lifecycle.I;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import g1.AbstractC0376c;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ApplicationModule_Companion_ProvideLifeCicleProviderFactory implements Factory<I> {
    public static ApplicationModule_Companion_ProvideLifeCicleProviderFactory create() {
        return AbstractC0376c.f6738a;
    }

    public static I provideLifeCicleProvider() {
        return (I) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideLifeCicleProvider());
    }

    @Override // javax.inject.Provider
    public I get() {
        return provideLifeCicleProvider();
    }
}
