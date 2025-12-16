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
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultAvisaStationsRepository f4609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DefaultAvisaStationsRepository defaultAvisaStationsRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.f4609a = defaultAvisaStationsRepository;
        this.f4610b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f4609a, this.f4610b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DefaultAvisaStationsRepository defaultAvisaStationsRepository = this.f4609a;
        String str = this.f4610b;
        return FlowKt.flow(new DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1(null, defaultAvisaStationsRepository, str, defaultAvisaStationsRepository, str, defaultAvisaStationsRepository, str, defaultAvisaStationsRepository, str));
    }
}
