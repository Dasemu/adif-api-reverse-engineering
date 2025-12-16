package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.uiStations.main.StationsPageCommercialViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class StationsPageCommercialViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static StationsPageCommercialViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return h.f5280a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(StationsPageCommercialViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
