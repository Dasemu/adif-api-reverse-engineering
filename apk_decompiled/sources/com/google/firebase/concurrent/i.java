package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f5964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5965c;

    public /* synthetic */ i(Runnable runnable, Object obj, int i) {
        this.f5963a = i;
        this.f5964b = runnable;
        this.f5965c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$submit$0;
        Object lambda$submit$02;
        switch (this.f5963a) {
            case 0:
                lambda$submit$0 = LimitedConcurrencyExecutorService.lambda$submit$0(this.f5964b, this.f5965c);
                return lambda$submit$0;
            default:
                lambda$submit$02 = PausableExecutorServiceImpl.lambda$submit$0(this.f5964b, this.f5965c);
                return lambda$submit$02;
        }
    }
}
