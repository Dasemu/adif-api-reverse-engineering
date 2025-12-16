package com.adif.elcanomovil.domain.usecases.stations;

import com.adif.elcanomovil.domain.entities.MapRegion;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Flow f4504a;

    /* renamed from: b, reason: collision with root package name */
    public int f4505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetStationsForRegionUseCase f4506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MapRegion f4507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GetStationsForRegionUseCase getStationsForRegionUseCase, MapRegion mapRegion, Continuation continuation) {
        super(2, continuation);
        this.f4506c = getStationsForRegionUseCase;
        this.f4507d = mapRegion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f4506c, this.f4507d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
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
            int r1 = r6.f4505b
            com.adif.elcanomovil.domain.usecases.stations.GetStationsForRegionUseCase r2 = r6.f4506c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlinx.coroutines.flow.Flow r6 = r6.f4504a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4d
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1e:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L32
        L22:
            kotlin.ResultKt.throwOnFailure(r7)
            com.adif.elcanomovil.domain.providers.LocationProvider r7 = com.adif.elcanomovil.domain.usecases.stations.GetStationsForRegionUseCase.access$getLocationProvider$p(r2)
            r6.f4505b = r4
            java.lang.Object r7 = r7.fetchLastLocation(r6)
            if (r7 != r0) goto L32
            goto L49
        L32:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.filterNotNull(r7)
            com.adif.elcanomovil.domain.repositories.stations.StationsRepository r1 = com.adif.elcanomovil.domain.usecases.stations.GetStationsForRegionUseCase.access$getStationsRepository$p(r2)
            r6.f4504a = r7
            r6.f4505b = r3
            com.adif.elcanomovil.domain.entities.MapRegion r3 = r6.f4507d
            r4 = 0
            java.lang.Object r6 = r1.fetchForRegion(r3, r4, r6)
            if (r6 != r0) goto L4a
        L49:
            return r0
        L4a:
            r5 = r7
            r7 = r6
            r6 = r5
        L4d:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            com.adif.elcanomovil.domain.usecases.stations.GetStationsForRegionUseCase$invoke$2$invokeSuspend$$inlined$filter$1 r0 = new com.adif.elcanomovil.domain.usecases.stations.GetStationsForRegionUseCase$invoke$2$invokeSuspend$$inlined$filter$1
            r0.<init>()
            com.adif.elcanomovil.domain.usecases.stations.a r7 = new com.adif.elcanomovil.domain.usecases.stations.a
            r1 = 0
            r3 = 1
            r7.<init>(r2, r1, r3)
            kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.combine(r6, r0, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.stations.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
