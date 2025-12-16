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
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Subscription f4757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Subscription subscription, DefaultSubscriptionsRepository defaultSubscriptionsRepository, Continuation continuation, boolean z3) {
        super(2, continuation);
        this.f4757b = subscription;
        this.f4758c = z3;
        this.f4759d = defaultSubscriptionsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        boolean z3 = this.f4758c;
        return new k(this.f4757b, this.f4759d, continuation, z3);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4756a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io = Dispatchers.getIO();
            j jVar = new j(this.f4757b, this.f4759d, null, this.f4758c);
            this.f4756a = 1;
            if (BuildersKt.withContext(io, jVar, this) == coroutine_suspended) {
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
