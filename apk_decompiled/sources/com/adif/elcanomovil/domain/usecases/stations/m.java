package com.adif.elcanomovil.domain.usecases.stations;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4523a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObserveRecentlySearchedStationsWithDistanceUseCase f4525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f4526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ObserveRecentlySearchedStationsWithDistanceUseCase observeRecentlySearchedStationsWithDistanceUseCase, List list, Continuation continuation) {
        super(2, continuation);
        this.f4525c = observeRecentlySearchedStationsWithDistanceUseCase;
        this.f4526d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        m mVar = new m(this.f4525c, this.f4526d, continuation);
        mVar.f4524b = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r7).collect(r4, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f4523a
            com.adif.elcanomovil.domain.usecases.stations.ObserveRecentlySearchedStationsWithDistanceUseCase r2 = r6.f4525c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r7)
            goto L50
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1c:
            java.lang.Object r1 = r6.f4524b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3b
        L24:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f4524b
            r1 = r7
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            com.adif.elcanomovil.domain.providers.LocationProvider r7 = com.adif.elcanomovil.domain.usecases.stations.ObserveRecentlySearchedStationsWithDistanceUseCase.access$getLocationProvider$p(r2)
            r6.f4524b = r1
            r6.f4523a = r4
            java.lang.Object r7 = r7.fetchLastLocation(r6)
            if (r7 != r0) goto L3b
            goto L4f
        L3b:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            com.adif.elcanomovil.domain.usecases.stations.l r4 = new com.adif.elcanomovil.domain.usecases.stations.l
            java.util.List r5 = r6.f4526d
            r4.<init>(r1, r2, r5)
            r1 = 0
            r6.f4524b = r1
            r6.f4523a = r3
            java.lang.Object r6 = r7.collect(r4, r6)
            if (r6 != r0) goto L50
        L4f:
            return r0
        L50:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.stations.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
