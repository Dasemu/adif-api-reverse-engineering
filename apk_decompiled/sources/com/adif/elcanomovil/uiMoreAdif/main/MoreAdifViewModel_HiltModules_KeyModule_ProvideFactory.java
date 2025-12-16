package com.adif.elcanomovil.uiMoreAdif.main;

import com.adif.elcanomovil.uiMoreAdif.main.MoreAdifViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class MoreAdifViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static MoreAdifViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return c.f5178a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(MoreAdifViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
