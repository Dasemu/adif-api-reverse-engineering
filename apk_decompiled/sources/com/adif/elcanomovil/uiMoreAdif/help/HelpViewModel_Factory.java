package com.adif.elcanomovil.uiMoreAdif.help;

import com.adif.elcanomovil.uiMoreAdif.HelpItemsProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class HelpViewModel_Factory implements Factory<HelpViewModel> {
    private final Provider<HelpItemsProvider> providerProvider;

    public HelpViewModel_Factory(Provider<HelpItemsProvider> provider) {
        this.providerProvider = provider;
    }

    public static HelpViewModel_Factory create(Provider<HelpItemsProvider> provider) {
        return new HelpViewModel_Factory(provider);
    }

    public static HelpViewModel newInstance(HelpItemsProvider helpItemsProvider) {
        return new HelpViewModel(helpItemsProvider);
    }

    @Override // javax.inject.Provider
    public HelpViewModel get() {
        return newInstance(this.providerProvider.get());
    }
}
