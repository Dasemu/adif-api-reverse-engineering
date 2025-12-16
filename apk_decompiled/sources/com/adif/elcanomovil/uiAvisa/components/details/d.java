package com.adif.elcanomovil.uiAvisa.components.details;

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
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IssueDetailsViewModel f4885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(IssueDetailsViewModel issueDetailsViewModel, int i, Continuation continuation) {
        super(2, continuation);
        this.f4885b = issueDetailsViewModel;
        this.f4886c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f4885b, this.f4886c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4884a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io = Dispatchers.getIO();
            c cVar = new c(this.f4885b, this.f4886c, null);
            this.f4884a = 1;
            if (BuildersKt.withContext(io, cVar, this) == coroutine_suspended) {
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
