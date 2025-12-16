package com.adif.elcanomovil.uiHome;

import androidx.lifecycle.q0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f5085b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f5085b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f5085b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5084a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HomeFragment homeFragment = this.f5085b;
            androidx.lifecycle.C lifecycle = homeFragment.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            k kVar = new k(homeFragment, null);
            this.f5084a = 1;
            if (q0.l(lifecycle, kVar, this) == coroutine_suspended) {
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
