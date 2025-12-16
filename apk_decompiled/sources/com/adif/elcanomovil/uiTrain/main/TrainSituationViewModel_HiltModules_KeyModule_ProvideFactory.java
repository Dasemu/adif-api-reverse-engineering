package com.adif.elcanomovil.uiTrain.main;

import com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes3.dex */
public final class TrainSituationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static TrainSituationViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return w.f5472a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(TrainSituationViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
