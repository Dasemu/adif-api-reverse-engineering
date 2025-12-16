package com.adif.elcanomovil.uiMoreAdif.di;

import J1.a;
import com.adif.elcanomovil.uiMoreAdif.HelpItemsProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class MoreAdifModule_ProvideHelpItemsProviderFactory implements Factory<HelpItemsProvider> {
    public static MoreAdifModule_ProvideHelpItemsProviderFactory create() {
        return a.f963a;
    }

    public static HelpItemsProvider provideHelpItemsProvider() {
        return (HelpItemsProvider) Preconditions.checkNotNullFromProvides(MoreAdifModule.INSTANCE.provideHelpItemsProvider());
    }

    @Override // javax.inject.Provider
    public HelpItemsProvider get() {
        return provideHelpItemsProvider();
    }
}
