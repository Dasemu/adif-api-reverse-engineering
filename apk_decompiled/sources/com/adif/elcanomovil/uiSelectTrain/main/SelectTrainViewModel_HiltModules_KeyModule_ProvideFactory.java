package com.adif.elcanomovil.uiSelectTrain.main;

import com.adif.elcanomovil.uiSelectTrain.main.SelectTrainViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class SelectTrainViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static SelectTrainViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return l.f5268a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(SelectTrainViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
