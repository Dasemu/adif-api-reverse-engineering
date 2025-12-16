package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f5940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f5942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5943e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j4, TimeUnit timeUnit, int i) {
        this.f5939a = i;
        this.f5940b = delegatingScheduledExecutorService;
        this.f5943e = obj;
        this.f5941c = j4;
        this.f5942d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f5939a) {
            case 0:
                return DelegatingScheduledExecutorService.l(this.f5940b, (Runnable) this.f5943e, this.f5941c, this.f5942d, completer);
            default:
                return DelegatingScheduledExecutorService.a(this.f5940b, (Callable) this.f5943e, this.f5941c, this.f5942d, completer);
        }
    }
}
