package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f5952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f5953c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f5956f;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j4, long j5, TimeUnit timeUnit, int i) {
        this.f5951a = i;
        this.f5952b = delegatingScheduledExecutorService;
        this.f5953c = runnable;
        this.f5954d = j4;
        this.f5955e = j5;
        this.f5956f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        ScheduledFuture lambda$scheduleAtFixedRate$8;
        ScheduledFuture lambda$scheduleWithFixedDelay$11;
        switch (this.f5951a) {
            case 0:
                lambda$scheduleAtFixedRate$8 = this.f5952b.lambda$scheduleAtFixedRate$8(this.f5953c, this.f5954d, this.f5955e, this.f5956f, completer);
                return lambda$scheduleAtFixedRate$8;
            default:
                lambda$scheduleWithFixedDelay$11 = this.f5952b.lambda$scheduleWithFixedDelay$11(this.f5953c, this.f5954d, this.f5955e, this.f5956f, completer);
                return lambda$scheduleWithFixedDelay$11;
        }
    }
}
