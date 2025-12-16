package com.adif.elcanomovil.uiSelectStation.main;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f5186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectStationFragment f5187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Flow flow, SelectStationFragment selectStationFragment, Continuation continuation) {
        super(2, continuation);
        this.f5186b = flow;
        this.f5187c = selectStationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f5186b, this.f5187c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5185a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C1.b bVar = new C1.b(this.f5187c, 11);
            this.f5185a = 1;
            if (this.f5186b.collect(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
