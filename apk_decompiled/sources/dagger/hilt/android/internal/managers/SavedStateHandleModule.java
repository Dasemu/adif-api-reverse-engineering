package dagger.hilt.android.internal.managers;

import androidx.lifecycle.n0;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.lifecycle.ActivityRetainedSavedState;
import dagger.hilt.android.scopes.ActivityRetainedScoped;

@Module
@InstallIn({ActivityRetainedComponent.class})
/* loaded from: classes3.dex */
abstract class SavedStateHandleModule {
    @Provides
    @ActivityRetainedScoped
    @ActivityRetainedSavedState
    public static n0 provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        return savedStateHandleHolder.getSavedStateHandle();
    }
}
