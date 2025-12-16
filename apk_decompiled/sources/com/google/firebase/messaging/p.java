package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6031b;

    public /* synthetic */ p(Object obj, int i) {
        this.f6030a = i;
        this.f6031b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i = this.f6030a;
        Object obj = this.f6031b;
        switch (i) {
            case 0:
                WakeLockHolder.completeWakefulIntent((Intent) obj);
                return;
            case 1:
                WithinAppServiceBinder.a((WithinAppServiceConnection.BindRequest) obj, task);
                return;
            default:
                ((ScheduledFuture) obj).cancel(false);
                return;
        }
    }
}
