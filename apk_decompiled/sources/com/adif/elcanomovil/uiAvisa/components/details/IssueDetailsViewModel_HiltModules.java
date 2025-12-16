package com.adif.elcanomovil.uiAvisa.components.details;

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

@OriginatingElement(topLevelClass = IssueDetailsViewModel.class)
/* loaded from: classes.dex */
public final class IssueDetailsViewModel_HiltModules {

    @Module
    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        @Binds
        @StringKey("com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsViewModel")
        @HiltViewModelMap
        @IntoMap
        public abstract w0 binds(IssueDetailsViewModel issueDetailsViewModel);
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
            return "com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsViewModel";
        }
    }

    private IssueDetailsViewModel_HiltModules() {
    }
}
