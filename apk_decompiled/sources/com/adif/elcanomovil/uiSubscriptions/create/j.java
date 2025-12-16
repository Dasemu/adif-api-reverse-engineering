package com.adif.elcanomovil.uiSubscriptions.create;

import com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f5324a;

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f5325b;

    /* renamed from: c, reason: collision with root package name */
    public int f5326c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationViewModel f5329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Boolean f5330g;
    public final /* synthetic */ AnticipationType h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, String str2, SubscriptionCreationViewModel subscriptionCreationViewModel, Boolean bool, AnticipationType anticipationType, Continuation continuation) {
        super(2, continuation);
        this.f5327d = str;
        this.f5328e = str2;
        this.f5329f = subscriptionCreationViewModel;
        this.f5330g = bool;
        this.h = anticipationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f5327d, this.f5328e, this.f5329f, this.f5330g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5326c
            com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel r3 = r0.f5329f
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L2f
            if (r2 == r6) goto L25
            if (r2 != r5) goto L1d
            kotlin.jvm.internal.Ref$ObjectRef r1 = r0.f5325b
            kotlin.jvm.internal.Ref$ObjectRef r2 = r0.f5324a
            kotlin.ResultKt.throwOnFailure(r28)
            r5 = r28
            goto L74
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L25:
            kotlin.jvm.internal.Ref$ObjectRef r2 = r0.f5325b
            kotlin.jvm.internal.Ref$ObjectRef r7 = r0.f5324a
            kotlin.ResultKt.throwOnFailure(r28)
            r8 = r28
            goto L51
        L2f:
            kotlin.ResultKt.throwOnFailure(r28)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            java.lang.String r8 = r0.f5327d
            if (r8 == 0) goto L5d
            com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase r9 = com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel.access$getGetStationByIdUseCase$p(r3)
            r0.f5324a = r7
            r0.f5325b = r2
            r0.f5326c = r6
            java.lang.Object r8 = r9.invoke(r8, r0)
            if (r8 != r1) goto L51
            goto L71
        L51:
            com.adif.elcanomovil.domain.entities.station.Station r8 = (com.adif.elcanomovil.domain.entities.station.Station) r8
            if (r8 == 0) goto L5a
            java.lang.String r8 = r8.getShortName()
            goto L5b
        L5a:
            r8 = r4
        L5b:
            r7.element = r8
        L5d:
            java.lang.String r8 = r0.f5328e
            if (r8 == 0) goto L80
            com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase r9 = com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel.access$getGetStationByIdUseCase$p(r3)
            r0.f5324a = r7
            r0.f5325b = r2
            r0.f5326c = r5
            java.lang.Object r5 = r9.invoke(r8, r0)
            if (r5 != r1) goto L72
        L71:
            return r1
        L72:
            r1 = r2
            r2 = r7
        L74:
            com.adif.elcanomovil.domain.entities.station.Station r5 = (com.adif.elcanomovil.domain.entities.station.Station) r5
            if (r5 == 0) goto L7c
            java.lang.String r4 = r5.getShortName()
        L7c:
            r1.element = r4
            r7 = r2
            r2 = r1
        L80:
            androidx.lifecycle.X r1 = com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel.access$get_viewData$p(r3)
            java.lang.Boolean r3 = r0.f5330g
            if (r3 == 0) goto L8c
            boolean r6 = r3.booleanValue()
        L8c:
            r9 = r6
            T r3 = r7.element
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            T r2 = r2.element
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            com.adif.elcanomovil.domain.entities.subscription.SubscriptionType r21 = com.adif.elcanomovil.domain.entities.subscription.SubscriptionType.JOURNEY
            com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData r8 = new com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData
            r23 = 0
            r24 = 0
            java.lang.String r11 = r0.f5327d
            r12 = 0
            java.lang.String r15 = r0.f5328e
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType r0 = r0.h
            r22 = 0
            r25 = 59272(0xe788, float:8.3058E-41)
            r26 = 0
            r13 = r11
            r20 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.k(r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSubscriptions.create.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
