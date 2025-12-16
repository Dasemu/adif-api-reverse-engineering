package com.adif.elcanomovil.domain.usecases.stations;

import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class l implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f4520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ObserveRecentlySearchedStationsWithDistanceUseCase f4521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f4522c;

    public l(FlowCollector flowCollector, ObserveRecentlySearchedStationsWithDistanceUseCase observeRecentlySearchedStationsWithDistanceUseCase, List list) {
        this.f4520a = flowCollector;
        this.f4521b = observeRecentlySearchedStationsWithDistanceUseCase;
        this.f4522c = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r7.emit(r6.f4522c, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r6.f4520a.emit(r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(android.location.Location r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.adif.elcanomovil.domain.usecases.stations.k
            if (r0 == 0) goto L13
            r0 = r8
            com.adif.elcanomovil.domain.usecases.stations.k r0 = (com.adif.elcanomovil.domain.usecases.stations.k) r0
            int r1 = r0.f4519d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4519d = r1
            goto L18
        L13:
            com.adif.elcanomovil.domain.usecases.stations.k r0 = new com.adif.elcanomovil.domain.usecases.stations.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f4517b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4519d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            com.adif.elcanomovil.domain.usecases.stations.l r6 = r0.f4516a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L55
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            if (r7 == 0) goto L58
            com.adif.elcanomovil.domain.usecases.stations.ObserveRecentlySearchedStationsWithDistanceUseCase r8 = r6.f4521b
            java.util.List r2 = r6.f4522c
            java.util.List r7 = com.adif.elcanomovil.domain.usecases.stations.ObserveRecentlySearchedStationsWithDistanceUseCase.access$calculateLocationtStation(r8, r2, r7)
            r0.f4516a = r6
            r0.f4519d = r5
            kotlinx.coroutines.flow.FlowCollector r8 = r6.f4520a
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L55
            goto L69
        L55:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            goto L59
        L58:
            r7 = r3
        L59:
            if (r7 != 0) goto L6a
            kotlinx.coroutines.flow.FlowCollector r7 = r6.f4520a
            r0.f4516a = r3
            r0.f4519d = r4
            java.util.List r6 = r6.f4522c
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.stations.l.emit(android.location.Location, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
