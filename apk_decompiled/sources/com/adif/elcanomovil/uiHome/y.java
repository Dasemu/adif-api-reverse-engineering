package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.uiHome.HomeFragmentViewAction;
import com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class y extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public HomeViewModel f5148a;

    /* renamed from: b, reason: collision with root package name */
    public StationViewEntityMapper f5149b;

    /* renamed from: c, reason: collision with root package name */
    public int f5150c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f5151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HomeFragmentViewAction.HomeStationSet f5152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(HomeViewModel homeViewModel, HomeFragmentViewAction.HomeStationSet homeStationSet, Continuation continuation) {
        super(2, continuation);
        this.f5151d = homeViewModel;
        this.f5152e = homeStationSet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new y(this.f5151d, this.f5152e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r6.invoke(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f5150c
            com.adif.elcanomovil.uiHome.HomeViewModel r2 = r5.f5151d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper r0 = r5.f5149b
            com.adif.elcanomovil.uiHome.HomeViewModel r5 = r5.f5148a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L50
        L18:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L20:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3a
        L24:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.domain.usecases.stations.SetHomeStationUseCase r6 = com.adif.elcanomovil.uiHome.HomeViewModel.access$getSetHomeStationUseCase$p(r2)
            com.adif.elcanomovil.uiHome.HomeFragmentViewAction$HomeStationSet r1 = r5.f5152e
            java.lang.String r1 = r1.getStationId()
            r5.f5150c = r4
            java.lang.Object r6 = r6.invoke(r1, r5)
            if (r6 != r0) goto L3a
            goto L4c
        L3a:
            com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper r6 = com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper.INSTANCE
            com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase r1 = com.adif.elcanomovil.uiHome.HomeViewModel.access$getGetHomeStationUseCase$p(r2)
            r5.f5148a = r2
            r5.f5149b = r6
            r5.f5150c = r3
            java.lang.Object r5 = r1.invoke(r5)
            if (r5 != r0) goto L4d
        L4c:
            return r0
        L4d:
            r0 = r6
            r6 = r5
            r5 = r2
        L50:
            com.adif.elcanomovil.domain.entities.station.Station r6 = (com.adif.elcanomovil.domain.entities.station.Station) r6
            com.adif.elcanomovil.commonViews.data.StationViewEntity r6 = r0.map(r6)
            if (r6 != 0) goto L59
            goto L5e
        L59:
            com.adif.elcanomovil.commonViews.data.StationViewEntity$Type r0 = com.adif.elcanomovil.commonViews.data.StationViewEntity.Type.HOME
            r6.setType(r0)
        L5e:
            com.adif.elcanomovil.uiHome.HomeViewModel.access$setHomeStation$p(r5, r6)
            com.adif.elcanomovil.uiHome.HomeViewModel.access$updateViewState(r2)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
