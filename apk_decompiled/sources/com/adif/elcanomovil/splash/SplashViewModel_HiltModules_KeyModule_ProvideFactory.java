package com.adif.elcanomovil.splash;

import com.adif.elcanomovil.splash.SplashViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes.dex */
public final class SplashViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static SplashViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return d.f4824a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(SplashViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
