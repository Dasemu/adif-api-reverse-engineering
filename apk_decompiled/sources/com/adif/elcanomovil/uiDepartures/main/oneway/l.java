package com.adif.elcanomovil.uiDepartures.main.oneway;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f4997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4997b = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f4997b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f4996a;
        CirculationsViewModel circulationsViewModel = this.f4997b;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            i = circulationsViewModel.currentPage;
            circulationsViewModel.currentPage = i + 1;
            this.f4996a = 1;
            if (CirculationsViewModel.reloadCirculations$default(circulationsViewModel, false, false, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        circulationsViewModel.updateObservations();
        return Unit.INSTANCE;
    }
}
