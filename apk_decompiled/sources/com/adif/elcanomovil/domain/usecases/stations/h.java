package com.adif.elcanomovil.domain.usecases.stations;

import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetStationsUseCase f4509b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GetStationsUseCase getStationsUseCase, Continuation continuation) {
        super(2, continuation);
        this.f4509b = getStationsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f4509b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StationsRepository stationsRepository;
        Check24hProvider check24hProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4508a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        GetStationsUseCase getStationsUseCase = this.f4509b;
        stationsRepository = getStationsUseCase.stationsRepository;
        check24hProvider = getStationsUseCase.check24hProvider;
        boolean checkfetchInfo$default = Check24hProvider.DefaultImpls.checkfetchInfo$default(check24hProvider, false, 1, null);
        this.f4508a = 1;
        Object fetch = stationsRepository.fetch(checkfetchInfo$default, this);
        return fetch == coroutine_suspended ? coroutine_suspended : fetch;
    }
}
