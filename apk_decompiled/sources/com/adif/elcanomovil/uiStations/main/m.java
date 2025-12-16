package com.adif.elcanomovil.uiStations.main;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public StationsPageServicesViewModel f5287a;

    /* renamed from: b, reason: collision with root package name */
    public int f5288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StationsPageServicesViewModel f5289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(StationsPageServicesViewModel stationsPageServicesViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5289c = stationsPageServicesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f5289c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteStationUseCase.invoke$default(r0, r1, r3, null, null, r13, 12, null) == r11) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteStationUseCase.invoke$default(r3, r1, r2, r3, null, null, r4, null, r13, 88, null) == r11) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r13.f5288b
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L17
            if (r0 != r1) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L17:
            com.adif.elcanomovil.uiStations.main.StationsPageServicesViewModel r0 = r13.f5287a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L79
        L1d:
            kotlin.ResultKt.throwOnFailure(r14)
            com.adif.elcanomovil.uiStations.main.StationsPageServicesViewModel r12 = r13.f5289c
            r0 = r1
            java.lang.String r1 = com.adif.elcanomovil.uiStations.main.StationsPageServicesViewModel.access$getCurrentStationCode$p(r12)
            if (r1 == 0) goto L7c
            androidx.lifecycle.Q r3 = r12.getIsFavourite()
            java.lang.Object r3 = r3.d()
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L55
            com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteStationUseCase r0 = com.adif.elcanomovil.uiStations.main.StationsPageServicesViewModel.access$getRemoveFavoriteStationUseCase$p(r12)
            com.adif.elcanomovil.domain.entities.DataType r3 = com.adif.elcanomovil.domain.entities.DataType.INFO
            r13.f5287a = r12
            r13.f5288b = r2
            r6 = 12
            r7 = 0
            r2 = r3
            r3 = 0
            r4 = 0
            r5 = r13
            java.lang.Object r0 = com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteStationUseCase.invoke$default(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r11) goto L53
            goto L78
        L53:
            r0 = r12
            goto L79
        L55:
            com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteStationUseCase r3 = com.adif.elcanomovil.uiStations.main.StationsPageServicesViewModel.access$getSaveFavoriteStationUseCase$p(r12)
            r4 = r2
            java.lang.String r2 = com.adif.elcanomovil.uiStations.main.StationsPageServicesViewModel.access$getCurrentStationName$p(r12)
            r6 = r3
            com.adif.elcanomovil.domain.entities.DataType r3 = com.adif.elcanomovil.domain.entities.DataType.INFO
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            r13.f5287a = r12
            r13.f5288b = r0
            r9 = 88
            r10 = 0
            r0 = r6
            r6 = r4
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = r13
            java.lang.Object r0 = com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteStationUseCase.invoke$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r11) goto L53
        L78:
            return r11
        L79:
            com.adif.elcanomovil.uiStations.main.StationsPageServicesViewModel.access$refreshIsFavourite(r0)
        L7c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiStations.main.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
