package com.adif.elcanomovil.uiDepartures.main;

import com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class DeparturesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static DeparturesViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return k.f4959a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(DeparturesViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
