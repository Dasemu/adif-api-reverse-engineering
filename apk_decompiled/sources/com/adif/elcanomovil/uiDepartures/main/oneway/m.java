package com.adif.elcanomovil.uiDepartures.main.oneway;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f4999b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4999b = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f4999b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object reloadCirculations;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4998a;
        CirculationsViewModel circulationsViewModel = this.f4999b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            circulationsViewModel.currentPage = 0;
            circulationsViewModel.canFetchMore = true;
            this.f4998a = 1;
            reloadCirculations = circulationsViewModel.reloadCirculations(false, true, this);
            if (reloadCirculations == coroutine_suspended) {
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
