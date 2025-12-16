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
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetHomeStationUseCase f4528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(SetHomeStationUseCase setHomeStationUseCase, String str, Continuation continuation) {
        super(2, continuation);
        this.f4528b = setHomeStationUseCase;
        this.f4529c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f4528b, this.f4529c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StationsRepository stationsRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4527a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            stationsRepository = this.f4528b.stationsRepository;
            this.f4527a = 1;
            if (stationsRepository.saveHomeStation(this.f4529c, this) == coroutine_suspended) {
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
