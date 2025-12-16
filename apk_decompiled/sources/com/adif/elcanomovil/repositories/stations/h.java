package com.adif.elcanomovil.repositories.stations;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4685a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsRepository f4687c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DefaultStationsRepository defaultStationsRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.f4687c = defaultStationsRepository;
        this.f4688d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f4687c, this.f4688d, continuation);
        hVar.f4686b = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
    
        if (r1.emit(r11, r10) != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if (r1.emit(r11, r10) != r0) goto L33;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f4685a
            com.adif.elcanomovil.repositories.stations.DefaultStationsRepository r2 = r10.f4687c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L40
            if (r1 == r6) goto L38
            if (r1 == r5) goto L30
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lca
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L24:
            java.lang.Object r1 = r10.f4686b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L2d
            goto Lca
        L2d:
            r11 = move-exception
            goto Lae
        L30:
            java.lang.Object r1 = r10.f4686b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L2d
            goto L83
        L38:
            java.lang.Object r1 = r10.f4686b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L64
        L40:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f4686b
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.adif.elcanomovil.repositories.stations.DefaultStationsRepository.access$get_currentOneStation$p(r2)
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r8 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r9 = r8.loading(r7)
            r1.setValue(r9)
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r1 = r8.loading(r7)
            r10.f4686b = r11
            r10.f4685a = r6
            java.lang.Object r1 = r11.emit(r1, r10)
            if (r1 != r0) goto L63
            goto Lc9
        L63:
            r1 = r11
        L64:
            d1.a r11 = com.adif.elcanomovil.repositories.stations.DefaultStationsRepository.access$getAppDispatcher$p(r2)     // Catch: java.lang.Throwable -> L2d
            d1.d r11 = (d1.d) r11     // Catch: java.lang.Throwable -> L2d
            r11.getClass()     // Catch: java.lang.Throwable -> L2d
            kotlinx.coroutines.CoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.repositories.stations.g r6 = new com.adif.elcanomovil.repositories.stations.g     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = r10.f4688d     // Catch: java.lang.Throwable -> L2d
            r6.<init>(r2, r8, r7)     // Catch: java.lang.Throwable -> L2d
            r10.f4686b = r1     // Catch: java.lang.Throwable -> L2d
            r10.f4685a = r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r6, r10)     // Catch: java.lang.Throwable -> L2d
            if (r11 != r0) goto L83
            goto Lc9
        L83:
            com.adif.elcanomovil.serviceNetworking.stations.model.StationResponse r11 = (com.adif.elcanomovil.serviceNetworking.stations.model.StationResponse) r11     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r5 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.serviceNetworking.stations.model.RequestedStationInfoDTO r11 = r11.getRequestedStationInfo()     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.repositories.stations.OneStationMapper r6 = new com.adif.elcanomovil.repositories.stations.OneStationMapper     // Catch: java.lang.Throwable -> L2d
            r6.<init>()     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.domain.entities.station.RequestedStationInfo r11 = r6.responseToDomain(r11)     // Catch: java.lang.Throwable -> L2d
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.adif.elcanomovil.repositories.stations.DefaultStationsRepository.access$get_currentOneStation$p(r2)     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r8 = r5.success(r11)     // Catch: java.lang.Throwable -> L2d
            r6.setValue(r8)     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r11 = r5.success(r11)     // Catch: java.lang.Throwable -> L2d
            r10.f4686b = r1     // Catch: java.lang.Throwable -> L2d
            r10.f4685a = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r10 = r1.emit(r11, r10)     // Catch: java.lang.Throwable -> L2d
            if (r10 != r0) goto Lca
            goto Lc9
        Lae:
            kotlinx.coroutines.flow.MutableStateFlow r2 = com.adif.elcanomovil.repositories.stations.DefaultStationsRepository.access$get_currentOneStation$p(r2)
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r4 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r5 = r4.error(r11, r7)
            r2.setValue(r5)
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r11 = r4.error(r11, r7)
            r10.f4686b = r7
            r10.f4685a = r3
            java.lang.Object r10 = r1.emit(r11, r10)
            if (r10 != r0) goto Lca
        Lc9:
            return r0
        Lca:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.stations.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
