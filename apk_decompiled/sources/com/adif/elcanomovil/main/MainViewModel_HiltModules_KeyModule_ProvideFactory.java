package com.adif.elcanomovil.main;

import com.adif.elcanomovil.main.MainViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes.dex */
public final class MainViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static MainViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return x.f4574a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(MainViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
