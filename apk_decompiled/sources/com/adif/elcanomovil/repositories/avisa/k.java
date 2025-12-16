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
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4608a;

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.SuspendLambda, com.adif.elcanomovil.repositories.avisa.k] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ?? suspendLambda = new SuspendLambda(2, continuation);
        suspendLambda.f4608a = obj;
        return suspendLambda;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return FlowKt.flow(new j((List) this.f4608a, null));
    }
}
