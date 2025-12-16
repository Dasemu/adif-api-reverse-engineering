package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Subscription f4787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4788c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4792g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4793j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4794k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f4795l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Subscription subscription, DefaultSubscriptionsRepository defaultSubscriptionsRepository, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Continuation continuation) {
        super(2, continuation);
        this.f4787b = subscription;
        this.f4788c = str;
        this.f4789d = str2;
        this.f4790e = str3;
        this.f4791f = str4;
        this.f4792g = str5;
        this.h = str6;
        this.i = str7;
        this.f4793j = str8;
        this.f4794k = defaultSubscriptionsRepository;
        this.f4795l = str9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f4787b, this.f4794k, this.f4788c, this.f4789d, this.f4790e, this.f4791f, this.f4792g, this.h, this.i, this.f4793j, this.f4795l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r0 == r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        if (r0 == r8) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r7 = r20
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.f4786a
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            kotlin.ResultKt.throwOnFailure(r21)
            r0 = r21
            goto L6f
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1e:
            kotlin.ResultKt.throwOnFailure(r21)
            r0 = r21
            goto Lbb
        L25:
            kotlin.ResultKt.throwOnFailure(r21)
            com.adif.elcanomovil.domain.entities.subscription.Subscription r0 = r7.f4787b
            com.adif.elcanomovil.domain.entities.subscription.SubscriptionType r0 = r0.getTypeSubscription()
            int[] r3 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$modify$1$response$1$WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r3[r0]
            com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository r3 = r7.f4794k
            if (r0 == r2) goto L78
            if (r0 != r1) goto L72
            com.adif.elcanomovil.serviceNetworking.subscriptions.models.SubscriptionTrainRequest r6 = new com.adif.elcanomovil.serviceNetworking.subscriptions.models.SubscriptionTrainRequest
            java.lang.String r12 = r7.f4788c
            java.lang.String r13 = r7.f4791f
            java.lang.String r10 = "300"
            java.lang.String r11 = "10"
            java.lang.String r14 = r7.h
            java.lang.String r15 = r7.f4793j
            r9 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15)
            com.adif.elcanomovil.serviceNetworking.subscriptions.SubscriptionsService r0 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getSubscriptionsService$p(r3)
            java.lang.String r2 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getHeader$p(r3)
            r4 = r3
            java.lang.String r3 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getPushId(r4)
            r5 = r4
            java.lang.String r4 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getDeviceId(r5)
            java.lang.String r5 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getHeaderAuth$p(r5)
            r7.f4786a = r1
            java.lang.String r1 = r7.f4795l
            java.lang.Object r0 = r0.modifyTrainSubscription(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r8) goto L6f
            goto Lba
        L6f:
            retrofit2.Response r0 = (retrofit2.Response) r0
            return r0
        L72:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L78:
            r5 = r3
            com.adif.elcanomovil.serviceNetworking.subscriptions.models.SubscriptionRequest r6 = new com.adif.elcanomovil.serviceNetworking.subscriptions.models.SubscriptionRequest
            java.lang.String r0 = r7.f4792g
            java.lang.String r1 = r7.h
            java.lang.String r10 = "300"
            java.lang.String r11 = "10"
            java.lang.String r12 = r7.f4788c
            java.lang.String r13 = r7.f4789d
            java.lang.String r14 = r7.f4790e
            java.lang.String r15 = r7.f4791f
            java.lang.String r3 = r7.i
            java.lang.String r4 = r7.f4793j
            r16 = r0
            r17 = r1
            r18 = r3
            r19 = r4
            r9 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.adif.elcanomovil.serviceNetworking.subscriptions.SubscriptionsService r0 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getSubscriptionsService$p(r5)
            java.lang.String r1 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getHeader$p(r5)
            java.lang.String r3 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getPushId(r5)
            java.lang.String r4 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getDeviceId(r5)
            java.lang.String r5 = com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.access$getHeaderAuth$p(r5)
            r7.f4786a = r2
            r2 = r1
            java.lang.String r1 = r7.f4795l
            java.lang.Object r0 = r0.modifyJourneySubscription(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r8) goto Lbb
        Lba:
            return r8
        Lbb:
            retrofit2.Response r0 = (retrofit2.Response) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.subscriptions.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
