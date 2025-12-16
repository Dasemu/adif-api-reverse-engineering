package com.adif.elcanomovil.uiTrain.main;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public MutableStateFlow f5429a;

    /* renamed from: b, reason: collision with root package name */
    public int f5430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrainSituationViewModel f5431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TrainSituationViewModel trainSituationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5431c = trainSituationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f5431c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a1, code lost:
    
        if (r15 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r15.invoke(r1, r4, r6, r14) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r4.invoke(r5, r6, r7, r8, r9, r10, r11, r12, r13) == r0) goto L22;
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
            int r1 = r14.f5430b
            com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel r2 = r14.f5431c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            kotlinx.coroutines.flow.MutableStateFlow r14 = r14.f5429a
            kotlin.ResultKt.throwOnFailure(r15)
            goto La4
        L1a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L22:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L54
        L26:
            kotlin.ResultKt.throwOnFailure(r15)
            androidx.lifecycle.Q r15 = r2.getIsFavourite()
            java.lang.Object r15 = r15.d()
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r1)
            if (r15 == 0) goto L56
            com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteTrainUseCase r15 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getRemoveFavoriteTrainUseCase$p(r2)
            java.lang.String r1 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getCommercialNumber$p(r2)
            java.lang.String r4 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getOriginStationCode$p(r2)
            java.lang.String r6 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getDestinationStationCode$p(r2)
            r14.f5430b = r5
            java.lang.Object r15 = r15.invoke(r1, r4, r6, r14)
            if (r15 != r0) goto L54
            goto La3
        L54:
            r13 = r14
            goto L85
        L56:
            r15 = r4
            com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteTrainUseCase r4 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getSaveFavoriteTrainUseCase$p(r2)
            java.lang.String r5 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getOperator$p(r2)
            java.lang.String r6 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getCommercialProduct$p(r2)
            java.lang.String r7 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getCommercialNumber$p(r2)
            java.lang.String r8 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getOriginStationCode$p(r2)
            java.lang.String r9 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getDestinationStationCode$p(r2)
            java.lang.Long r10 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getLaunchingDate$p(r2)
            java.lang.String r11 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getTimeStationFrom$p(r2)
            java.lang.String r12 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getTimeStationTo$p(r2)
            r14.f5430b = r15
            r13 = r14
            java.lang.Object r14 = r4.invoke(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r0) goto L85
            goto La3
        L85:
            kotlinx.coroutines.flow.MutableStateFlow r14 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$get_isFavourite$p(r2)
            com.adif.elcanomovil.domain.usecases.favorites.GetTrainIsFavoriteUseCase r15 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getGetTrainIsFavoriteUseCase$p(r2)
            java.lang.String r1 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getCommercialNumber$p(r2)
            java.lang.String r4 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getOriginStationCode$p(r2)
            java.lang.String r2 = com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.access$getDestinationStationCode$p(r2)
            r13.f5429a = r14
            r13.f5430b = r3
            java.lang.Object r15 = r15.invoke(r1, r4, r2, r13)
            if (r15 != r0) goto La4
        La3:
            return r0
        La4:
            r14.setValue(r15)
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiTrain.main.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
