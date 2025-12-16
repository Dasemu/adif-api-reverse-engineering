package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4739a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Subscription f4741c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Subscription subscription, DefaultSubscriptionsRepository defaultSubscriptionsRepository, Continuation continuation, boolean z3) {
        super(2, continuation);
        this.f4741c = subscription;
        this.f4742d = defaultSubscriptionsRepository;
        this.f4743e = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.f4741c, this.f4742d, continuation, this.f4743e);
        fVar.f4740b = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
    
        if (r1.emit(r9, r8) != r0) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:11:0x0021, B:15:0x0037, B:16:0x0086, B:18:0x0090, B:22:0x00a5, B:26:0x005e, B:28:0x0064, B:31:0x00c0), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:11:0x0021, B:15:0x0037, B:16:0x0086, B:18:0x0090, B:22:0x00a5, B:26:0x005e, B:28:0x0064, B:31:0x00c0), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:11:0x0021, B:15:0x0037, B:16:0x0086, B:18:0x0090, B:22:0x00a5, B:26:0x005e, B:28:0x0064, B:31:0x00c0), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:11:0x0021, B:15:0x0037, B:16:0x0086, B:18:0x0090, B:22:0x00a5, B:26:0x005e, B:28:0x0064, B:31:0x00c0), top: B:2:0x000d }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.subscriptions.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
