package com.adif.elcanomovil.uiStations.main;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public String f5296a;

    /* renamed from: b, reason: collision with root package name */
    public String f5297b;

    /* renamed from: c, reason: collision with root package name */
    public int f5298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StationsViewModel f5299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(StationsViewModel stationsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.f5299d = stationsViewModel;
        this.f5300e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f5299d, this.f5300e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003e, code lost:
    
        if (r8 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f5298c
            com.adif.elcanomovil.uiStations.main.StationsViewModel r2 = r7.f5299d
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = r7.f5300e
            if (r1 == 0) goto L31
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1d
            java.lang.String r0 = r7.f5297b
            java.lang.String r7 = r7.f5296a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L77
        L1d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L25:
            java.lang.String r1 = r7.f5297b
            java.lang.String r4 = r7.f5296a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L64
        L2d:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L41
        L31:
            kotlin.ResultKt.throwOnFailure(r8)
            com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase r8 = com.adif.elcanomovil.uiStations.main.StationsViewModel.access$getGetStationByIdUseCase$p(r2)
            r7.f5298c = r5
            java.lang.Object r8 = r8.invoke(r6, r7)
            if (r8 != r0) goto L41
            goto L74
        L41:
            com.adif.elcanomovil.domain.entities.station.Station r8 = (com.adif.elcanomovil.domain.entities.station.Station) r8
            r1 = 0
            if (r8 == 0) goto L4b
            java.lang.String r5 = r8.getShortName()
            goto L4c
        L4b:
            r5 = r1
        L4c:
            if (r8 == 0) goto L52
            java.lang.String r1 = r8.getLongName()
        L52:
            com.adif.elcanomovil.domain.usecases.stations.GetOneStationUseCase r8 = com.adif.elcanomovil.uiStations.main.StationsViewModel.access$getGetOneStationUseCase$p(r2)
            r7.f5296a = r5
            r7.f5297b = r1
            r7.f5298c = r4
            java.lang.Object r8 = r8.invoke(r6, r7)
            if (r8 != r0) goto L63
            goto L74
        L63:
            r4 = r5
        L64:
            com.adif.elcanomovil.domain.usecases.stations.SetLastVisitedStationUseCase r8 = com.adif.elcanomovil.uiStations.main.StationsViewModel.access$getSetLastVisitedStationUseCase$p(r2)
            r7.f5296a = r4
            r7.f5297b = r1
            r7.f5298c = r3
            java.lang.Object r7 = r8.invoke(r6, r7)
            if (r7 != r0) goto L75
        L74:
            return r0
        L75:
            r0 = r1
            r7 = r4
        L77:
            kotlinx.coroutines.flow.MutableStateFlow r8 = com.adif.elcanomovil.uiStations.main.StationsViewModel.access$getViewDataFlow$p(r2)
            com.adif.elcanomovil.uiStations.entities.StationHeaderData r1 = new com.adif.elcanomovil.uiStations.entities.StationHeaderData
            if (r7 != 0) goto L80
            r7 = r6
        L80:
            if (r0 != 0) goto L83
            r0 = r6
        L83:
            r1.<init>(r6, r7, r0)
            r8.setValue(r1)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiStations.main.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
