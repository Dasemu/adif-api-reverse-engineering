package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
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

/* loaded from: classes.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Subscription f4785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Subscription subscription, DefaultSubscriptionsRepository defaultSubscriptionsRepository, Continuation continuation) {
        super(2, continuation);
        this.f4784b = defaultSubscriptionsRepository;
        this.f4785c = subscription;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f4785c, this.f4784b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4783a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io = Dispatchers.getIO();
            n nVar = new n(this.f4785c, this.f4784b, null);
            this.f4783a = 1;
            if (BuildersKt.withContext(io, nVar, this) == coroutine_suspended) {
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
