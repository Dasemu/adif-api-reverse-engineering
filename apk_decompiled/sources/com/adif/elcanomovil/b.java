package com.adif.elcanomovil;

import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.internal.Provider;

/* loaded from: classes.dex */
public final class b implements Provider {
    @Override // javax.inject.Provider
    public final Object get() {
        return ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();
    }
}
