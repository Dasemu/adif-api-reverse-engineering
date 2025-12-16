package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6015c;

    public /* synthetic */ i(Object obj, TaskCompletionSource taskCompletionSource, int i) {
        this.f6013a = i;
        this.f6014b = obj;
        this.f6015c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6013a) {
            case 0:
                FirebaseMessaging.a((FirebaseMessaging) this.f6014b, this.f6015c);
                return;
            case 1:
                FirebaseMessaging.c((FirebaseMessaging) this.f6014b, this.f6015c);
                return;
            case 2:
                FirebaseMessaging.d((FirebaseMessaging) this.f6014b, this.f6015c);
                return;
            default:
                ImageDownload.d((ImageDownload) this.f6014b, this.f6015c);
                return;
        }
    }
}
