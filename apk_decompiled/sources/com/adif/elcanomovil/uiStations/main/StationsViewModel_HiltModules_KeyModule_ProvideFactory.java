package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.uiStations.main.StationsViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class StationsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static StationsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return r.f5301a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(StationsViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
