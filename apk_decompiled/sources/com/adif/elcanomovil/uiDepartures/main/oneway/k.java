package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f4994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CirculationsViewModel circulationsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.f4994b = circulationsViewModel;
        this.f4995c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f4994b, this.f4995c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SetLastDeparturesArrivalsStationUseCase setLastDeparturesArrivalsStationUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4993a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            setLastDeparturesArrivalsStationUseCase = this.f4994b.setLastDeparturesArrivalsStationUseCase;
            this.f4993a = 1;
            if (setLastDeparturesArrivalsStationUseCase.invoke(this.f4995c, this) == coroutine_suspended) {
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
