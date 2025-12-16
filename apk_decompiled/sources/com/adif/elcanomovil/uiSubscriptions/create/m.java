package com.adif.elcanomovil.uiSubscriptions.create;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationViewModel f5341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SubscriptionCreationViewModel subscriptionCreationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5341b = subscriptionCreationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f5341b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        if (r4.collect(r5, r19) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0106, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0104, code lost:
    
        if (r3.collect(r5, r19) == r1) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5340a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L10
            if (r2 != r3) goto L15
        L10:
            kotlin.ResultKt.throwOnFailure(r20)
            goto L107
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1d:
            kotlin.ResultKt.throwOnFailure(r20)
            com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel r2 = r0.f5341b
            androidx.lifecycle.X r5 = com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel.access$get_viewData$p(r2)
            r6 = 0
            if (r5 == 0) goto L30
            java.lang.Object r5 = r5.d()
            com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData r5 = (com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData) r5
            goto L31
        L30:
            r5 = r6
        L31:
            if (r5 == 0) goto L107
            com.adif.elcanomovil.domain.entities.subscription.SubscriptionType r16 = r5.getTypeSubscription()
            if (r16 == 0) goto L107
            int[] r7 = com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel$createSusbscription$1$1$WhenMappings.$EnumSwitchMapping$0
            int r8 = r16.ordinal()
            r7 = r7[r8]
            if (r7 == r4) goto Lb4
            if (r7 == r3) goto L47
            goto L107
        L47:
            com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.CreateSubscriptionsUseCase r7 = com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel.access$getCreateSubscriptionsUseCase$p(r2)
            java.lang.String r8 = r5.getStationCode()
            com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType r4 = r5.getAnticipationTime()
            if (r4 == 0) goto L5d
            int r4 = r4.getValue()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
        L5d:
            java.lang.String r11 = java.lang.String.valueOf(r6)
            java.lang.String r13 = r5.getRepetitionDays()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = r5.getCodeTrain()
            r4.append(r6)
            r6 = 45
            r4.append(r6)
            java.lang.String r9 = r5.getStationFromCode()
            r4.append(r9)
            r4.append(r6)
            java.lang.String r6 = r5.getStationToCode()
            r4.append(r6)
            java.lang.String r14 = r4.toString()
            com.adif.elcanomovil.uiSubscriptions.utils.SubscriptionHelper$Companion r4 = com.adif.elcanomovil.uiSubscriptions.utils.SubscriptionHelper.INSTANCE
            java.util.Date r6 = new java.util.Date
            r6.<init>()
            java.lang.String r15 = r4.getMeDayString(r6)
            java.lang.String r17 = r5.getOperator()
            java.lang.String r18 = r5.getCommercialProduct()
            r10 = 0
            r12 = 0
            r9 = 0
            kotlinx.coroutines.flow.Flow r4 = r7.invoke(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.adif.elcanomovil.uiSubscriptions.create.l r5 = new com.adif.elcanomovil.uiSubscriptions.create.l
            r6 = 1
            r5.<init>(r2, r6)
            r0.f5340a = r3
            java.lang.Object r0 = r4.collect(r5, r0)
            if (r0 != r1) goto L107
            goto L106
        Lb4:
            java.util.Date r3 = r5.getInitialTime()
            if (r3 == 0) goto L107
            com.adif.elcanomovil.uiSubscriptions.utils.SubscriptionHelper$Companion r6 = com.adif.elcanomovil.uiSubscriptions.utils.SubscriptionHelper.INSTANCE
            com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType r7 = r5.getAnticipationTime()
            kotlin.Pair r3 = r6.calculateInfoDate(r3, r7)
            com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.CreateSubscriptionsUseCase r7 = com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel.access$getCreateSubscriptionsUseCase$p(r2)
            java.lang.String r8 = r5.getStationCode()
            java.lang.String r9 = r5.getStationToCode()
            java.lang.Object r10 = r3.getFirst()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r3.getFirst()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r3.getSecond()
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = r5.getRepetitionDays()
            boolean r3 = r5.isCercanias()
            java.lang.String r14 = r6.getTrainType(r3)
            java.lang.String r18 = ""
            r15 = 0
            java.lang.String r17 = ""
            kotlinx.coroutines.flow.Flow r3 = r7.invoke(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.adif.elcanomovil.uiSubscriptions.create.l r5 = new com.adif.elcanomovil.uiSubscriptions.create.l
            r6 = 0
            r5.<init>(r2, r6)
            r0.f5340a = r4
            java.lang.Object r0 = r3.collect(r5, r0)
            if (r0 != r1) goto L107
        L106:
            return r1
        L107:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSubscriptions.create.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
