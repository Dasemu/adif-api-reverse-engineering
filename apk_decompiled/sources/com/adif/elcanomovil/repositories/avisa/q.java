package com.adif.elcanomovil.repositories.avisa;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultIncidenceRepository f4632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(DefaultIncidenceRepository defaultIncidenceRepository, Continuation continuation) {
        super(2, continuation);
        this.f4632b = defaultIncidenceRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        q qVar = new q(this.f4632b, continuation);
        qVar.f4631a = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return FlowKt.flow(new p((List) this.f4631a, this.f4632b, null));
    }
}
