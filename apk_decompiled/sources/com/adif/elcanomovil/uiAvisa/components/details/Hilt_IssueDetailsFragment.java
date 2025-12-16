package com.adif.elcanomovil.uiAvisa.components.details;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.K;
import androidx.lifecycle.y0;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes.dex */
public abstract class Hilt_IssueDetailsFragment extends K implements GeneratedComponentManagerHolder {
    private ContextWrapper componentContext;
    private volatile FragmentComponentManager componentManager;
    private final Object componentManagerLock;
    private boolean disableGetContextFix;
    private boolean injected;

    public Hilt_IssueDetailsFragment() {
        this.componentManagerLock = new Object();
        this.injected = false;
    }

    private void initializeComponentContext() {
        if (this.componentContext == null) {
            this.componentContext = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.disableGetContextFix = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    public FragmentComponentManager createComponentManager() {
        return new FragmentComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.K
    public Context getContext() {
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        initializeComponentContext();
        return this.componentContext;
    }

    @Override // androidx.fragment.app.K, androidx.lifecycle.InterfaceC0200v
    public y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((IssueDetailsFragment_GeneratedInjector) generatedComponent()).injectIssueDetailsFragment((IssueDetailsFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // androidx.fragment.app.K
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    @Override // androidx.fragment.app.K
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final FragmentComponentManager componentManager() {
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

    public Hilt_IssueDetailsFragment(int i) {
        super(i);
        this.componentManagerLock = new Object();
        this.injected = false;
    }

    @Override // androidx.fragment.app.K
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
