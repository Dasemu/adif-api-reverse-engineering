package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f5945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f5946c;

    public /* synthetic */ c(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i) {
        this.f5944a = i;
        this.f5945b = runnable;
        this.f5946c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5944a) {
            case 0:
                DelegatingScheduledExecutorService.h(this.f5945b, this.f5946c);
                return;
            case 1:
                DelegatingScheduledExecutorService.j(this.f5945b, this.f5946c);
                return;
            default:
                DelegatingScheduledExecutorService.e(this.f5945b, this.f5946c);
                return;
        }
    }
}
