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
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultIncidenceRepository f4625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DefaultIncidenceRepository defaultIncidenceRepository, int i, Continuation continuation) {
        super(2, continuation);
        this.f4625a = defaultIncidenceRepository;
        this.f4626b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f4625a, this.f4626b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DefaultIncidenceRepository defaultIncidenceRepository = this.f4625a;
        int i = this.f4626b;
        return FlowKt.flow(new DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1(null, defaultIncidenceRepository, i, defaultIncidenceRepository, defaultIncidenceRepository, i));
    }
}
