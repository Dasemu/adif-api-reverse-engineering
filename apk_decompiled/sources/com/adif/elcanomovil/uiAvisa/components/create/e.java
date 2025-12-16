package com.adif.elcanomovil.uiAvisa.components.create;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewIssueFragment f4837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NewIssueFragment newIssueFragment, Continuation continuation) {
        super(2, continuation);
        this.f4837b = newIssueFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f4837b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NewIssueViewModel viewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4836a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            NewIssueFragment newIssueFragment = this.f4837b;
            viewModel = newIssueFragment.getViewModel();
            Flow<Integer> messages = viewModel.getMessages();
            C1.b bVar = new C1.b(newIssueFragment, 7);
            this.f4836a = 1;
            if (messages.collect(bVar, this) == coroutine_suspended) {
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
