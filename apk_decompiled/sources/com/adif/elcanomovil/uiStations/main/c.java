package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.domain.entities.station.RequestedStationInfo;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.usecases.stations.GetCurrentOneStationUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StationsPageActivitiesViewModel f5273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(StationsPageActivitiesViewModel stationsPageActivitiesViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5273b = stationsPageActivitiesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f5273b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetCurrentOneStationUseCase getCurrentOneStationUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5272a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StationsPageActivitiesViewModel stationsPageActivitiesViewModel = this.f5273b;
            getCurrentOneStationUseCase = stationsPageActivitiesViewModel.getCurrentOneStationUseCase;
            Flow<AsyncResult<RequestedStationInfo>> invoke = getCurrentOneStationUseCase.invoke();
            C1.b bVar = new C1.b(stationsPageActivitiesViewModel, 13);
            this.f5272a = 1;
            if (invoke.collect(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
