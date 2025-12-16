package com.adif.elcanomovil.uiAvisa.components.create;

import d1.InterfaceC0307a;
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
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewIssueViewModel f4871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(NewIssueViewModel newIssueViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4871b = newIssueViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f4871b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC0307a interfaceC0307a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4870a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            NewIssueViewModel newIssueViewModel = this.f4871b;
            interfaceC0307a = newIssueViewModel.appDispatcher;
            ((d1.d) interfaceC0307a).getClass();
            CoroutineDispatcher io = Dispatchers.getIO();
            t tVar = new t(newIssueViewModel, null);
            this.f4870a = 1;
            if (BuildersKt.withContext(io, tVar, this) == coroutine_suspended) {
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
