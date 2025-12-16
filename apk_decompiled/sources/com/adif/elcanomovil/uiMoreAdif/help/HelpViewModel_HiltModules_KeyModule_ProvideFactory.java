package com.adif.elcanomovil.uiMoreAdif.help;

import com.adif.elcanomovil.uiMoreAdif.help.HelpViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class HelpViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static HelpViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return c.f5170a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(HelpViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
