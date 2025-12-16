package com.adif.elcanomovil.uiSelectStation.main;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectStationViewModel f5210b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SelectStationViewModel selectStationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5210b = selectStationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f5210b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r6).collect(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r6 == r0) goto L15;
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
            int r1 = r5.f5209a
            com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel r2 = r5.f5210b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r6)
            goto L42
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1c:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L30
        L20:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.domain.usecases.stations.ObserveRecentlySearchedStationsWithDistanceUseCase r6 = com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel.access$getObserveRecentlySearchedStationsWithDistance$p(r2)
            r5.f5209a = r4
            java.lang.Object r6 = r6.invoke(r5)
            if (r6 != r0) goto L30
            goto L41
        L30:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            C1.b r1 = new C1.b
            r4 = 12
            r1.<init>(r2, r4)
            r5.f5209a = r3
            java.lang.Object r5 = r6.collect(r1, r5)
            if (r5 != r0) goto L42
        L41:
            return r0
        L42:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSelectStation.main.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
