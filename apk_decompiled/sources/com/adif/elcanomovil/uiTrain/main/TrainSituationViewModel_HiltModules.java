package com.adif.elcanomovil.uiTrain.main;

import androidx.lifecycle.w0;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

@OriginatingElement(topLevelClass = TrainSituationViewModel.class)
/* loaded from: classes3.dex */
public final class TrainSituationViewModel_HiltModules {

    @Module
    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes3.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        @Binds
        @StringKey("com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel")
        @HiltViewModelMap
        @IntoMap
        public abstract w0 binds(TrainSituationViewModel trainSituationViewModel);
    }

    @Module
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes3.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @HiltViewModelMap.KeySet
        @IntoSet
        public static String provide() {
            return "com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel";
        }
    }

    private TrainSituationViewModel_HiltModules() {
    }
}
