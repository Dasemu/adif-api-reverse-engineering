package com.adif.elcanomovil.uiDepartures.main.oneway;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f4992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4992b = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f4992b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4991a;
        CirculationsViewModel circulationsViewModel = this.f4992b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f4991a = 1;
            if (circulationsViewModel.fetchCirculations(true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        circulationsViewModel.updateObservations();
        return Unit.INSTANCE;
    }
}
