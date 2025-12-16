package com.adif.elcanomovil.uiAvisa.components.create;

import com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes.dex */
public final class NewIssueViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static NewIssueViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return z.f4876a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(NewIssueViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
