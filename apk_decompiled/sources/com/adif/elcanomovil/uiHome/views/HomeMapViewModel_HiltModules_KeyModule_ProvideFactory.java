package com.adif.elcanomovil.uiHome.views;

import com.adif.elcanomovil.uiHome.views.HomeMapViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class HomeMapViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static HomeMapViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return i.f5135a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(HomeMapViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
