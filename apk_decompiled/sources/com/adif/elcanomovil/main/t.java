package com.adif.elcanomovil.main;

import androidx.lifecycle.C;
import androidx.lifecycle.q0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.f4568b = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.f4568b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4567a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainActivity mainActivity = this.f4568b;
            C lifecycle = mainActivity.getLifecycle();
            s sVar = new s(mainActivity, null);
            this.f4567a = 1;
            if (q0.l(lifecycle, sVar, this) == coroutine_suspended) {
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
