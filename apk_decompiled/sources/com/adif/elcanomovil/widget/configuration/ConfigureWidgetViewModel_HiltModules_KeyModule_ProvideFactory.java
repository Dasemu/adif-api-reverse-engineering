package com.adif.elcanomovil.widget.configuration;

import com.adif.elcanomovil.widget.configuration.ConfigureWidgetViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes3.dex */
public final class ConfigureWidgetViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {

    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        private static final ConfigureWidgetViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ConfigureWidgetViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static ConfigureWidgetViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(ConfigureWidgetViewModel_HiltModules.KeyModule.provide());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
