package com.adif.elcanomovil;

import com.adif.elcanomovil.observers.ApplicationObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ElcanoApplication f4534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ElcanoApplication elcanoApplication, Continuation continuation) {
        super(2, continuation);
        this.f4534b = elcanoApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f4534b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4533a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApplicationObserver applicationObserver = this.f4534b.getApplicationObserver();
            this.f4533a = 1;
            if (applicationObserver.start(this) == coroutine_suspended) {
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
