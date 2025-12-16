package com.adif.elcanomovil.uiMoreAdif.about;

import com.adif.elcanomovil.uiMoreAdif.about.AboutViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes2.dex */
public final class AboutViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static AboutViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return d.f5160a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(AboutViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
