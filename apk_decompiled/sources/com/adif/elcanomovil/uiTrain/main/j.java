package com.adif.elcanomovil.uiTrain.main;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Flow f5420a;

    /* renamed from: b, reason: collision with root package name */
    public int f5421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrainSituationViewModel f5422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TrainSituationViewModel trainSituationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5422c = trainSituationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f5422c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ae, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collect(r14, r13) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        if (r15 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r15 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f5421b
            r2 = 3
            r3 = 2
            r4 = 1
            com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel r5 = r14.f5422c
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            kotlin.ResultKt.throwOnFailure(r15)
            goto Lb1
        L18:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L20:
            kotlinx.coroutines.flow.Flow r1 = r14.f5420a
            kotlin.ResultKt.throwOnFailure(r15)
            r13 = r14
            goto L99
        L28:
            kotlin.ResultKt.throwOnFailure(r15)
            r13 = r14
            goto L66
        L2d:
            kotlin.ResultKt.throwOnFailure(r15)
            com.adif.elcanomovil.domain.usecases.circulation.GetOnePathsUseCase r6 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getGetOnePathsUseCase$p(r5)
            java.lang.String r7 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getCommercialNumber$p(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            java.lang.String r8 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getOriginStationCode$p(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            java.lang.String r9 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getDestinationStationCode$p(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            java.lang.Long r15 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getLaunchingDate$p(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            long r10 = r15.longValue()
            com.adif.elcanomovil.commonNavGraph.arguments.Filter r15 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getFilter_all_stations$p(r5)
            boolean r12 = r15.getEnable()
            r14.f5421b = r4
            r13 = r14
            java.lang.Object r15 = r6.invoke(r7, r8, r9, r10, r12, r13)
            if (r15 != r0) goto L66
            goto Lb0
        L66:
            r1 = r15
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            com.adif.elcanomovil.domain.usecases.circulation.GetCompositionsUseCase r6 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getGetCompositionsUseCase$p(r5)
            java.lang.String r7 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getCommercialNumber$p(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            java.lang.String r8 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getDestinationStationCode$p(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            java.lang.String r11 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getOriginStationCode$p(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            java.lang.Long r14 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getLaunchingDate$p(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            long r9 = r14.longValue()
            r13.f5420a = r1
            r13.f5421b = r3
            r12 = 0
            java.lang.Object r15 = r6.invoke(r7, r8, r9, r11, r12, r13)
            if (r15 != r0) goto L99
            goto Lb0
        L99:
            kotlinx.coroutines.flow.Flow r15 = (kotlinx.coroutines.flow.Flow) r15
            com.adif.elcanomovil.uiTrain.main.i r14 = new com.adif.elcanomovil.uiTrain.main.i
            r3 = 0
            r4 = 0
            r14.<init>(r5, r3, r4)
            kotlinx.coroutines.flow.Flow r14 = kotlinx.coroutines.flow.FlowKt.combine(r1, r15, r14)
            r13.f5420a = r3
            r13.f5421b = r2
            java.lang.Object r14 = kotlinx.coroutines.flow.FlowKt.collect(r14, r13)
            if (r14 != r0) goto Lb1
        Lb0:
            return r0
        Lb1:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiTrain.main.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
