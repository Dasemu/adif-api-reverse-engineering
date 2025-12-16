package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f5962b;

    public /* synthetic */ h(Runnable runnable, int i) {
        this.f5961a = i;
        this.f5962b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f5961a;
        Runnable runnable = this.f5962b;
        switch (i) {
            case 0:
                return LimitedConcurrencyExecutorService.c(runnable);
            default:
                return PausableExecutorServiceImpl.a(runnable);
        }
    }
}
