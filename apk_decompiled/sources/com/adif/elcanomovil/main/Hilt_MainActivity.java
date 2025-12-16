package com.adif.elcanomovil.main;

import android.os.Bundle;
import androidx.lifecycle.y0;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import g.AbstractActivityC0364k;

/* loaded from: classes.dex */
public abstract class Hilt_MainActivity extends AbstractActivityC0364k implements GeneratedComponentManagerHolder {
    private volatile ActivityComponentManager componentManager;
    private final Object componentManagerLock;
    private boolean injected;
    private SavedStateHandleHolder savedStateHandleHolder;

    public Hilt_MainActivity() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new q(this, 0));
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof GeneratedComponentManager) {
            SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
            this.savedStateHandleHolder = savedStateHandleHolder;
            if (savedStateHandleHolder.isInvalid()) {
                this.savedStateHandleHolder.setExtras(getDefaultViewModelCreationExtras());
            }
        }
    }

    public ActivityComponentManager createComponentManager() {
        return new ActivityComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // b.o, androidx.lifecycle.InterfaceC0200v
    public y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((MainActivity_GeneratedInjector) generatedComponent()).injectMainActivity((MainActivity) UnsafeCasts.unsafeCast(this));
    }

    @Override // androidx.fragment.app.P, b.o, C.AbstractActivityC0048l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // g.AbstractActivityC0364k, androidx.fragment.app.P, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.savedStateHandleHolder;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final ActivityComponentManager componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }

    public Hilt_MainActivity(int i) {
        super(i);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }
}
