package com.adif.elcanomovil.uiDepartures.main.oneway;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class w extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f5037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5037b = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w(this.f5037b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r8).collect(r1, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r5 = r2.destinationStationCode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r8 == r0) goto L27;
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
            int r1 = r7.f5036a
            com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel r2 = r7.f5037b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7b
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1c:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L69
        L20:
            kotlin.ResultKt.throwOnFailure(r8)
            com.adif.elcanomovil.domain.usecases.stations.GetStationsObservationsUseCase r8 = com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel.access$getGetStationsObservationsUseCase$p(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r5 = com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel.access$getOriginStationCode$p(r2)
            if (r5 == 0) goto L42
            int r5 = r5.length()
            if (r5 <= 0) goto L42
            java.lang.String r5 = com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel.access$getOriginStationCode$p(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r1.add(r5)
        L42:
            com.adif.elcanomovil.domain.entities.CirculationType r5 = r2.getPageType()
            com.adif.elcanomovil.domain.entities.CirculationType r6 = com.adif.elcanomovil.domain.entities.CirculationType.BETWEEN_STATIONS
            if (r5 != r6) goto L60
            java.lang.String r5 = com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel.access$getDestinationStationCode$p(r2)
            if (r5 == 0) goto L60
            int r5 = r5.length()
            if (r5 <= 0) goto L60
            java.lang.String r5 = com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel.access$getDestinationStationCode$p(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r1.add(r5)
        L60:
            r7.f5036a = r4
            java.lang.Object r8 = r8.invoke(r1, r7)
            if (r8 != r0) goto L69
            goto L7a
        L69:
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            C1.b r1 = new C1.b
            r4 = 9
            r1.<init>(r2, r4)
            r7.f5036a = r3
            java.lang.Object r7 = r8.collect(r1, r7)
            if (r7 != r0) goto L7b
        L7a:
            return r0
        L7b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
