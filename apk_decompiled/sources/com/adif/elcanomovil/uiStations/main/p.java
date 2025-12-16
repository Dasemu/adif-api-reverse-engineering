package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.domain.usecases.stations.GetLastVisitedStationUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StationsViewModel f5295b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(StationsViewModel stationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5295b = stationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f5295b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetLastVisitedStationUseCase getLastVisitedStationUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5294a;
        StationsViewModel stationsViewModel = this.f5295b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            getLastVisitedStationUseCase = stationsViewModel.getLastVisitedStationUseCase;
            this.f5294a = 1;
            obj = getLastVisitedStationUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (!StringsKt.isBlank(str)) {
            stationsViewModel.handleSelectedStation(str);
        }
        return Unit.INSTANCE;
    }
}
