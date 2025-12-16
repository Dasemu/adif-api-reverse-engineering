package com.adif.elcanomovil.repositories.subscriptions;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DefaultSubscriptionsRepository defaultSubscriptionsRepository, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f4750a = defaultSubscriptionsRepository;
        this.f4751b = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f4750a, this.f4751b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DefaultSubscriptionsRepository defaultSubscriptionsRepository = this.f4750a;
        return FlowKt.flow(new DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1(null, defaultSubscriptionsRepository, this.f4751b, defaultSubscriptionsRepository, defaultSubscriptionsRepository));
    }
}
