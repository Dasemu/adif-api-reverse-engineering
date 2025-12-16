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
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultIncidenceRepository f4633a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(DefaultIncidenceRepository defaultIncidenceRepository, Continuation continuation) {
        super(2, continuation);
        this.f4633a = defaultIncidenceRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f4633a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DefaultIncidenceRepository defaultIncidenceRepository = this.f4633a;
        return FlowKt.flow(new DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1(null, defaultIncidenceRepository, defaultIncidenceRepository, defaultIncidenceRepository));
    }
}
