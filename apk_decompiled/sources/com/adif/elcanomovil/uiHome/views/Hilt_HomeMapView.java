package com.adif.elcanomovil.uiHome.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes2.dex */
public abstract class Hilt_HomeMapView extends ConstraintLayout implements GeneratedComponentManagerHolder {
    private ViewComponentManager componentManager;
    private boolean injected;

    public Hilt_HomeMapView(Context context) {
        super(context);
        inject();
    }

    public ViewComponentManager createComponentManager() {
        return new ViewComponentManager(this, false);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((HomeMapView_GeneratedInjector) generatedComponent()).injectHomeMapView((HomeMapView) UnsafeCasts.unsafeCast(this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final ViewComponentManager componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }

    public Hilt_HomeMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inject();
    }

    public Hilt_HomeMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inject();
    }

    @TargetApi(21)
    public Hilt_HomeMapView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        inject();
    }
}
