package com.google.firebase.storage.internal;

import android.annotation.SuppressLint;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.storage.StorageTaskScheduler;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class SmartHandler {
    static boolean testMode = false;
    private final Executor executor;

    @SuppressLint({"ThreadPoolCreation"})
    public SmartHandler(Executor executor) {
        if (executor != null) {
            this.executor = executor;
        } else if (testMode) {
            this.executor = null;
        } else {
            this.executor = StorageTaskScheduler.getInstance().getMainThreadExecutor();
        }
    }

    public void callBack(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        Executor executor = this.executor;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            StorageTaskScheduler.getInstance().scheduleCallback(runnable);
        }
    }
}
