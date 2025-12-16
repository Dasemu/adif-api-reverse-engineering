package com.adif.elcanomovil.uiMoreAdif.accessibility;

import com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class AccessibilityViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static AccessibilityViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return d.f5166a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(AccessibilityViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
