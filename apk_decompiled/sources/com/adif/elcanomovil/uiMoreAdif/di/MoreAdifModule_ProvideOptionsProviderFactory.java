package com.adif.elcanomovil.uiMoreAdif.di;

import J1.b;
import com.adif.elcanomovil.uiMoreAdif.OptionsProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class MoreAdifModule_ProvideOptionsProviderFactory implements Factory<OptionsProvider> {
    public static MoreAdifModule_ProvideOptionsProviderFactory create() {
        return b.f964a;
    }

    public static OptionsProvider provideOptionsProvider() {
        return (OptionsProvider) Preconditions.checkNotNullFromProvides(MoreAdifModule.INSTANCE.provideOptionsProvider());
    }

    @Override // javax.inject.Provider
    public OptionsProvider get() {
        return provideOptionsProvider();
    }
}
