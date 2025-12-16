package dagger.hilt.android.internal.managers;

import androidx.lifecycle.n0;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.lifecycle.ActivityRetainedSavedState"})
/* loaded from: classes3.dex */
public final class SavedStateHandleModule_ProvideSavedStateHandleFactory implements Factory<n0> {
    private final Provider<SavedStateHandleHolder> savedStateHandleHolderProvider;

    public SavedStateHandleModule_ProvideSavedStateHandleFactory(Provider<SavedStateHandleHolder> provider) {
        this.savedStateHandleHolderProvider = provider;
    }

    public static SavedStateHandleModule_ProvideSavedStateHandleFactory create(Provider<SavedStateHandleHolder> provider) {
        return new SavedStateHandleModule_ProvideSavedStateHandleFactory(provider);
    }

    public static n0 provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        return (n0) Preconditions.checkNotNullFromProvides(SavedStateHandleModule.provideSavedStateHandle(savedStateHandleHolder));
    }

    @Override // javax.inject.Provider
    public n0 get() {
        return provideSavedStateHandle(this.savedStateHandleHolderProvider.get());
    }
}
