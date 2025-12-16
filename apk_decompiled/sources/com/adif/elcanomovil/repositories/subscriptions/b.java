package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4706a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Subscription f4708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Subscription subscription, DefaultSubscriptionsRepository defaultSubscriptionsRepository, Continuation continuation) {
        super(2, continuation);
        this.f4708c = subscription;
        this.f4709d = defaultSubscriptionsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f4708c, this.f4709d, continuation);
        bVar.f4707b = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(1:(1:(3:8|9|10)(2:12|13))(1:14))(1:22)|15|16|9|10) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:(2:(5:(1:(1:(3:8|9|10)(2:12|13))(1:14))(1:22)|15|16|9|10)(6:23|24|25|26|27|(4:29|(2:31|21)|9|10)(1:32))|19)(1:36))(1:49)|37|38|39|(1:41)(1:46)|42|(3:44|27|(0)(0))|21) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x011a, code lost:
    
        if (r3.emit(r0, r23) == r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0109, code lost:
    
        if (r7.emit(r0, r23) == r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0092, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006c, code lost:
    
        if (r0.emit(r11, r23) == r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db A[Catch: all -> 0x004a, TryCatch #2 {all -> 0x004a, blocks: (B:25:0x0043, B:27:0x00d1, B:29:0x00db, B:32:0x00f2), top: B:24:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:25:0x0043, B:27:0x00d1, B:29:0x00db, B:32:0x00f2), top: B:24:0x0043 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.subscriptions.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
