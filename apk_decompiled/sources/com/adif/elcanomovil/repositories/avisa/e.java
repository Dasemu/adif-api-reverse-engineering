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
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultAvisaStationsRepository f4594b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DefaultAvisaStationsRepository defaultAvisaStationsRepository, Continuation continuation) {
        super(2, continuation);
        this.f4594b = defaultAvisaStationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f4594b, continuation);
        eVar.f4593a = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return FlowKt.flow(new d((List) this.f4593a, this.f4594b, null));
    }
}
