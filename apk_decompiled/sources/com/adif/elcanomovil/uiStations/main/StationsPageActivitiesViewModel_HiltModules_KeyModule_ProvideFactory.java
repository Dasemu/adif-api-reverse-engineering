package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.uiStations.main.StationsPageActivitiesViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class StationsPageActivitiesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static StationsPageActivitiesViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return d.f5274a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(StationsPageActivitiesViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
