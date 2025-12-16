package com.adif.elcanomovil.widget;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes3.dex */
public abstract class Hilt_DeparturesWidget extends AppWidgetProvider {
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();

    public void inject(Context context) {
        if (this.injected) {
            return;
        }
        synchronized (this.injectedLock) {
            try {
                if (!this.injected) {
                    ((DeparturesWidget_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectDeparturesWidget((DeparturesWidget) UnsafeCasts.unsafeCast(this));
                    this.injected = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        inject(context);
        super.onReceive(context, intent);
    }
}
