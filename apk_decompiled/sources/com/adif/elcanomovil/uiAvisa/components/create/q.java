package com.adif.elcanomovil.uiAvisa.components.create;

import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceNotificationType;
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
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NewIssueViewModel f4861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z3, NewIssueViewModel newIssueViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4860b = z3;
        this.f4861c = newIssueViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f4860b, this.f4861c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC0307a interfaceC0307a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4859a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            IncidenceNotificationType incidenceNotificationType = this.f4860b ? IncidenceNotificationType.NOTIFICATION_TYPE_PUSH_NOTIFICATION : IncidenceNotificationType.NOT_USED;
            NewIssueViewModel newIssueViewModel = this.f4861c;
            interfaceC0307a = newIssueViewModel.appDispatcher;
            ((d1.d) interfaceC0307a).getClass();
            CoroutineDispatcher io = Dispatchers.getIO();
            p pVar = new p(newIssueViewModel, incidenceNotificationType, null);
            this.f4859a = 1;
            if (BuildersKt.withContext(io, pVar, this) == coroutine_suspended) {
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
