package com.adif.elcanomovil.repositories.stations;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsRepository f4669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DefaultStationsRepository defaultStationsRepository, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f4669a = defaultStationsRepository;
        this.f4670b = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f4669a, this.f4670b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DefaultStationsRepository defaultStationsRepository = this.f4669a;
        return FlowKt.flow(new DefaultStationsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1(null, defaultStationsRepository, this.f4670b, defaultStationsRepository, defaultStationsRepository, defaultStationsRepository));
    }
}
