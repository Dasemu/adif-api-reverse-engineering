package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5938c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f5936a = i;
        this.f5937b = obj;
        this.f5938c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5936a) {
            case 0:
                ((CustomThreadFactory) this.f5937b).lambda$newThread$0((Runnable) this.f5938c);
                return;
            case 1:
                DelegatingScheduledExecutorService.d((Callable) this.f5937b, (DelegatingScheduledFuture.Completer) this.f5938c);
                return;
            default:
                LimitedConcurrencyExecutor.a((LimitedConcurrencyExecutor) this.f5937b, (Runnable) this.f5938c);
                return;
        }
    }
}
