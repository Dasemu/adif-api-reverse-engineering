package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.uiHome.HomeViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class HomeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static HomeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return E.f5066a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(HomeViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
