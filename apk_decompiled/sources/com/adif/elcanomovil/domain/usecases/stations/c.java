package com.adif.elcanomovil.domain.usecases.stations;

import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetHomeStationUseCase f4496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GetHomeStationUseCase getHomeStationUseCase, Continuation continuation) {
        super(2, continuation);
        this.f4496b = getHomeStationUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f4496b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StationsRepository stationsRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4495a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        stationsRepository = this.f4496b.stationsRepository;
        this.f4495a = 1;
        Object homeStation = stationsRepository.homeStation(this);
        return homeStation == coroutine_suspended ? coroutine_suspended : homeStation;
    }
}
