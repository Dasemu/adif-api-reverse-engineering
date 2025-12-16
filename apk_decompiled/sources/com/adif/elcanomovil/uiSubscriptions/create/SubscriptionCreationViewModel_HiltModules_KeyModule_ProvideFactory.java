package com.adif.elcanomovil.uiSubscriptions.create;

import com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes3.dex */
public final class SubscriptionCreationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static SubscriptionCreationViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return t.f5353a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(SubscriptionCreationViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
