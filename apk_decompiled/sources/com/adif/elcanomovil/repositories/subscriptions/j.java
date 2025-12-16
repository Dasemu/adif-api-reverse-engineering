package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Subscription f4753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Subscription subscription, DefaultSubscriptionsRepository defaultSubscriptionsRepository, Continuation continuation, boolean z3) {
        super(2, continuation);
        this.f4753b = subscription;
        this.f4754c = z3;
        this.f4755d = defaultSubscriptionsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        boolean z3 = this.f4754c;
        return new j(this.f4753b, this.f4755d, continuation, z3);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r2.insert(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r1.delete(r6, r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f4752a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L50
        L1b:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.domain.entities.subscription.Subscription r6 = r5.f4753b
            r1 = 0
            r6.setActive(r1)
            com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository r1 = r5.f4755d
            boolean r4 = r5.f4754c
            if (r4 == 0) goto L3f
            com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao r2 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getSubscriptionsDao$p(r1)
            com.adif.elcanomovil.repositories.subscriptions.SubscriptionMapper r1 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getSubscriptionMapper$p(r1)
            com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionEntity r6 = r1.domainToEntity(r6)
            r5.f4752a = r3
            java.lang.Object r5 = r2.insert(r6, r5)
            if (r5 != r0) goto L50
            goto L4f
        L3f:
            com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao r1 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getSubscriptionsDao$p(r1)
            int r6 = r6.getId()
            r5.f4752a = r2
            java.lang.Object r5 = r1.delete(r6, r5)
            if (r5 != r0) goto L50
        L4f:
            return r0
        L50:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.subscriptions.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
