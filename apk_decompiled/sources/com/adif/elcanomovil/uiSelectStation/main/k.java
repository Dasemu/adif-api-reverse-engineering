package com.adif.elcanomovil.uiSelectStation.main;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectStationViewModel f5208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SelectStationViewModel selectStationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5208b = selectStationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f5208b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r8 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f5207a
            com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel r2 = r7.f5208b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4b
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1c:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L30
        L20:
            kotlin.ResultKt.throwOnFailure(r8)
            com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase r8 = com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel.access$getGetClosestStationUseCase$p(r2)
            r7.f5207a = r4
            java.lang.Object r8 = r8.invoke(r7)
            if (r8 != r0) goto L30
            goto L4a
        L30:
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.filterNotNull(r8)
            com.adif.elcanomovil.uiHome.u r1 = new com.adif.elcanomovil.uiHome.u
            r4 = 3
            r5 = 0
            r6 = 4
            r1.<init>(r4, r5, r6)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.m1659catch(r8, r1)
            r7.f5207a = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r8, r7)
            if (r8 != r0) goto L4b
        L4a:
            return r0
        L4b:
            com.adif.elcanomovil.domain.entities.station.Station r8 = (com.adif.elcanomovil.domain.entities.station.Station) r8
            if (r8 == 0) goto L61
            com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel.access$setUserNearStation$p(r2, r8)
            kotlinx.coroutines.flow.MutableStateFlow r7 = com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel.access$get_viewState$p(r2)
            java.lang.Object r7 = r7.getValue()
            boolean r7 = r7 instanceof com.adif.elcanomovil.uiSelectStation.main.SelectStationViewState.MainSearch
            if (r7 == 0) goto L61
            com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel.access$showUpdateMainSearch(r2)
        L61:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSelectStation.main.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
