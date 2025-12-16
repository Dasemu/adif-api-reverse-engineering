package com.adif.elcanomovil.repositories.avisa;

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
    public final /* synthetic */ DefaultAvisaStationsRepository f4603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4604b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DefaultAvisaStationsRepository defaultAvisaStationsRepository, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f4603a = defaultAvisaStationsRepository;
        this.f4604b = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f4603a, this.f4604b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DefaultAvisaStationsRepository defaultAvisaStationsRepository = this.f4603a;
        return FlowKt.flow(new DefaultAvisaStationsRepository$fetchStationCategories$2$invokeSuspend$$inlined$networkBoundResource$1(null, defaultAvisaStationsRepository, this.f4604b, defaultAvisaStationsRepository, defaultAvisaStationsRepository));
    }
}
