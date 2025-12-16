package com.adif.elcanomovil.uiAvisa.components.home;

import com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes.dex */
public final class AvisaHomeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static AvisaHomeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return n.f4919a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(AvisaHomeViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
