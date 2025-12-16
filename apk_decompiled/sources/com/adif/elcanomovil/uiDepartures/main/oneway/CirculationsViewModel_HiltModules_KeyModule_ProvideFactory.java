package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class CirculationsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static CirculationsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return x.f5038a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(CirculationsViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
