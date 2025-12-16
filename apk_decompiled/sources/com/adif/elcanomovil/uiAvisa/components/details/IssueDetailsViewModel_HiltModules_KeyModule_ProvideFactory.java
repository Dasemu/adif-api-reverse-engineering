package com.adif.elcanomovil.uiAvisa.components.details;

import com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes.dex */
public final class IssueDetailsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static IssueDetailsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return h.f4895a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(IssueDetailsViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
