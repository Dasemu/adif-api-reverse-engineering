package com.adif.elcanomovil.repositories.stations;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsRepository f4668b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DefaultStationsRepository defaultStationsRepository, Continuation continuation) {
        super(2, continuation);
        this.f4668b = defaultStationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f4668b, continuation);
        bVar.f4667a = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return FlowKt.flow(new a((List) this.f4667a, this.f4668b, null));
    }
}
