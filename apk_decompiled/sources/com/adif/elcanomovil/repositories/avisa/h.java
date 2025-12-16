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
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultAvisaStationsRepository f4602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DefaultAvisaStationsRepository defaultAvisaStationsRepository, Continuation continuation) {
        super(2, continuation);
        this.f4602b = defaultAvisaStationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f4602b, continuation);
        hVar.f4601a = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return FlowKt.flow(new g((List) this.f4601a, this.f4602b, null));
    }
}
