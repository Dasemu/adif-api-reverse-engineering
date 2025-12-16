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
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetStationByIdUseCase f4499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GetStationByIdUseCase getStationByIdUseCase, String str, Continuation continuation) {
        super(2, continuation);
        this.f4499b = getStationByIdUseCase;
        this.f4500c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f4499b, this.f4500c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StationsRepository stationsRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4498a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        stationsRepository = this.f4499b.stationsRepository;
        this.f4498a = 1;
        Object fetchStation = stationsRepository.fetchStation(this.f4500c, this);
        return fetchStation == coroutine_suspended ? coroutine_suspended : fetchStation;
    }
}
