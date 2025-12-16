package com.adif.elcanomovil;

import android.app.Application;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes.dex */
public abstract class Hilt_ElcanoApplication extends Application implements GeneratedComponentManagerHolder {
    private boolean injected = false;
    private final ApplicationComponentManager componentManager = new ApplicationComponentManager(new f(this));

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public void hiltInternalInject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((ElcanoApplication_GeneratedInjector) generatedComponent()).injectElcanoApplication((ElcanoApplication) UnsafeCasts.unsafeCast(this));
    }

    @Override // android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final ApplicationComponentManager componentManager() {
        return this.componentManager;
    }
}
