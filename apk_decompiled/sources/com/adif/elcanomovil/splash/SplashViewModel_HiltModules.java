package com.adif.elcanomovil.splash;

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

@OriginatingElement(topLevelClass = SplashViewModel.class)
/* loaded from: classes.dex */
public final class SplashViewModel_HiltModules {

    @Module
    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        @Binds
        @StringKey("com.adif.elcanomovil.splash.SplashViewModel")
        @HiltViewModelMap
        @IntoMap
        public abstract w0 binds(SplashViewModel splashViewModel);
    }

    @Module
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @HiltViewModelMap.KeySet
        @IntoSet
        public static String provide() {
            return "com.adif.elcanomovil.splash.SplashViewModel";
        }
    }

    private SplashViewModel_HiltModules() {
    }
}
