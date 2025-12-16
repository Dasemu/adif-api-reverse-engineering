package com.adif.elcanomovil.uiDepartures.main;

import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeparturesViewModel f4938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TabDataHolder.TabData.Departures f4939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DeparturesViewModel departuresViewModel, TabDataHolder.TabData.Departures departures, Continuation continuation) {
        super(2, continuation);
        this.f4938b = departuresViewModel;
        this.f4939c = departures;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f4938b, this.f4939c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r1.invoke(r9, r8) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1.invoke(r9, r8) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f4937a
            com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder$TabData$Departures r2 = r8.f4939c
            com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel r3 = r8.f4938b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5f
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1e:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4c
        L22:
            kotlin.ResultKt.throwOnFailure(r9)
            com.adif.elcanomovil.domain.usecases.circulation.SetLastDepartureTypeTrainIsCercaniasUseCase r9 = com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel.access$getSetLastDepartureTypeTrainIsCercaniasUseCase$p(r3)
            com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository$TrainTypeRequest r1 = new com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository$TrainTypeRequest
            com.adif.elcanomovil.domain.entities.TrainType r6 = r2.isCercanias()
            com.adif.elcanomovil.domain.entities.CirculationType r7 = com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel.access$getCurrentTab$p(r3)
            r1.<init>(r6, r7)
            r9.invoke(r1)
            java.lang.String r9 = r2.getOrigin()
            if (r9 == 0) goto L4c
            com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationUseCase r1 = com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel.access$getSetLastDeparturesArrivalsStationUseCase$p(r3)
            r8.f4937a = r5
            java.lang.Object r9 = r1.invoke(r9, r8)
            if (r9 != r0) goto L4c
            goto L5e
        L4c:
            java.lang.String r9 = r2.getDestination()
            if (r9 == 0) goto L5f
            com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationToUseCase r1 = com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel.access$getSetLastDeparturesArrivalsStationToUseCase$p(r3)
            r8.f4937a = r4
            java.lang.Object r8 = r1.invoke(r9, r8)
            if (r8 != r0) goto L5f
        L5e:
            return r0
        L5f:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
