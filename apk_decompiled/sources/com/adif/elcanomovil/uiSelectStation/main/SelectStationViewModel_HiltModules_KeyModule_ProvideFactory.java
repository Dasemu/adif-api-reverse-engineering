package com.adif.elcanomovil.uiSelectStation.main;

import com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class SelectStationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static SelectStationViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return o.f5217a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(SelectStationViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
