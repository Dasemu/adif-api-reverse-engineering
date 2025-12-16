package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f5948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f5949c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f5950d;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, int i) {
        this.f5947a = i;
        this.f5948b = delegatingScheduledExecutorService;
        this.f5949c = runnable;
        this.f5950d = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5947a) {
            case 0:
                this.f5948b.lambda$scheduleWithFixedDelay$10(this.f5949c, this.f5950d);
                return;
            case 1:
                this.f5948b.lambda$scheduleAtFixedRate$7(this.f5949c, this.f5950d);
                return;
            default:
                DelegatingScheduledExecutorService.i(this.f5948b, this.f5949c, this.f5950d);
                return;
        }
    }
}
