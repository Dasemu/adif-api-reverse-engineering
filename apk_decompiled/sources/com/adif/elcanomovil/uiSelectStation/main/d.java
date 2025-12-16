package com.adif.elcanomovil.uiSelectStation.main;

import androidx.lifecycle.q0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectStationFragment f5184b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SelectStationFragment selectStationFragment, Continuation continuation) {
        super(2, continuation);
        this.f5184b = selectStationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f5184b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5183a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SelectStationFragment selectStationFragment = this.f5184b;
            c cVar = new c(selectStationFragment, null);
            this.f5183a = 1;
            Object l4 = q0.l(selectStationFragment.getLifecycle(), cVar, this);
            if (l4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                l4 = Unit.INSTANCE;
            }
            if (l4 == coroutine_suspended) {
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
