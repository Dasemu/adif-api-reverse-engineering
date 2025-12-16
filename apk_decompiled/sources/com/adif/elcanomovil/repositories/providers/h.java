package com.adif.elcanomovil.repositories.providers;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultLocationStatusProvider f4655b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DefaultLocationStatusProvider defaultLocationStatusProvider, Continuation continuation) {
        super(2, continuation);
        this.f4655b = defaultLocationStatusProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f4655b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Z0.c cVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4654a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DefaultLocationStatusProvider defaultLocationStatusProvider = this.f4655b;
            cVar = defaultLocationStatusProvider.locationStatusReceiver;
            MutableSharedFlow mutableSharedFlow = cVar.f2166c;
            C1.b bVar = new C1.b(defaultLocationStatusProvider, 6);
            this.f4654a = 1;
            if (mutableSharedFlow.collect(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
