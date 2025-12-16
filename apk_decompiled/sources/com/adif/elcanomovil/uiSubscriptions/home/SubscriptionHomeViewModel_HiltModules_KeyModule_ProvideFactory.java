package com.adif.elcanomovil.uiSubscriptions.home;

import com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes3.dex */
public final class SubscriptionHomeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public static SubscriptionHomeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return t.f5396a;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(SubscriptionHomeViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
