package com.adif.elcanomovil.uiAvisa.components.home;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AvisaHomeViewModel f4916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AvisaHomeViewModel avisaHomeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4916b = avisaHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f4916b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4915a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io = Dispatchers.getIO();
            j jVar = new j(this.f4916b, null);
            this.f4915a = 1;
            if (BuildersKt.withContext(io, jVar, this) == coroutine_suspended) {
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
