package com.adif.elcanomovil.uiSubscriptions.home;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes3.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionHomeViewModel f5373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SubscriptionHomeViewModel subscriptionHomeViewModel, int i, Continuation continuation) {
        super(2, continuation);
        this.f5373b = subscriptionHomeViewModel;
        this.f5374c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f5373b, this.f5374c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5372a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io = Dispatchers.getIO();
            i iVar = new i(this.f5373b, this.f5374c, null);
            this.f5372a = 1;
            if (BuildersKt.withContext(io, iVar, this) == coroutine_suspended) {
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
