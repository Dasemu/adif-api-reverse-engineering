package com.adif.elcanomovil.uiMoreAdif.main;

import com.adif.elcanomovil.uiMoreAdif.OptionsProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class MoreAdifViewModel_Factory implements Factory<MoreAdifViewModel> {
    private final Provider<OptionsProvider> providerProvider;

    public MoreAdifViewModel_Factory(Provider<OptionsProvider> provider) {
        this.providerProvider = provider;
    }

    public static MoreAdifViewModel_Factory create(Provider<OptionsProvider> provider) {
        return new MoreAdifViewModel_Factory(provider);
    }

    public static MoreAdifViewModel newInstance(OptionsProvider optionsProvider) {
        return new MoreAdifViewModel(optionsProvider);
    }

    @Override // javax.inject.Provider
    public MoreAdifViewModel get() {
        return newInstance(this.providerProvider.get());
    }
}
