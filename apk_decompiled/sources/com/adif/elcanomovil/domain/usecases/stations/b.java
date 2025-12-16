package com.adif.elcanomovil.domain.usecases.stations;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Flow f4492a;

    /* renamed from: b, reason: collision with root package name */
    public int f4493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetClosestStationUseCase f4494c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GetClosestStationUseCase getClosestStationUseCase, Continuation continuation) {
        super(2, continuation);
        this.f4494c = getClosestStationUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f4494c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f4493b
            com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase r2 = r9.f4494c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            kotlinx.coroutines.flow.Flow r9 = r9.f4492a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L54
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L1f:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L33
        L23:
            kotlin.ResultKt.throwOnFailure(r10)
            com.adif.elcanomovil.domain.providers.LocationProvider r10 = com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase.access$getLocationProvider$p(r2)
            r9.f4493b = r5
            java.lang.Object r10 = r10.fetchLastLocation(r9)
            if (r10 != r0) goto L33
            goto L50
        L33:
            kotlinx.coroutines.flow.Flow r10 = (kotlinx.coroutines.flow.Flow) r10
            kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.filterNotNull(r10)
            com.adif.elcanomovil.domain.repositories.stations.StationsRepository r1 = com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase.access$getStationsRepository$p(r2)
            com.adif.elcanomovil.domain.providers.Check24hProvider r6 = com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase.access$getCheck24hProvider$p(r2)
            r7 = 0
            boolean r5 = com.adif.elcanomovil.domain.providers.Check24hProvider.DefaultImpls.checkfetchInfo$default(r6, r7, r5, r3)
            r9.f4492a = r10
            r9.f4493b = r4
            java.lang.Object r9 = r1.fetch(r5, r9)
            if (r9 != r0) goto L51
        L50:
            return r0
        L51:
            r8 = r10
            r10 = r9
            r9 = r8
        L54:
            kotlinx.coroutines.flow.Flow r10 = (kotlinx.coroutines.flow.Flow) r10
            com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase$invoke$2$invokeSuspend$$inlined$filter$1 r0 = new com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase$invoke$2$invokeSuspend$$inlined$filter$1
            r0.<init>()
            com.adif.elcanomovil.domain.usecases.stations.a r10 = new com.adif.elcanomovil.domain.usecases.stations.a
            r1 = 0
            r10.<init>(r2, r3, r1)
            kotlinx.coroutines.flow.Flow r9 = kotlinx.coroutines.flow.FlowKt.combine(r9, r0, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.stations.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
