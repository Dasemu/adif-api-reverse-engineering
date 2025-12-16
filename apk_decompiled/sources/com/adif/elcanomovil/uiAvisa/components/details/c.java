package com.adif.elcanomovil.uiAvisa.components.details;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IssueDetailsViewModel f4882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(IssueDetailsViewModel issueDetailsViewModel, int i, Continuation continuation) {
        super(2, continuation);
        this.f4882b = issueDetailsViewModel;
        this.f4883c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f4882b, this.f4883c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r6).collect(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f4881a
            com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsViewModel r2 = r5.f4882b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r6)
            goto L44
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1c:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L32
        L20:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.domain.usecases.avisa.incidence.GetIncidenceDetailsUseCase r6 = com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsViewModel.access$getGetIncidenceDetailsUseCase$p(r2)
            r5.f4881a = r4
            int r1 = r5.f4883c
            java.lang.Object r6 = r6.invoke(r1, r5)
            if (r6 != r0) goto L32
            goto L43
        L32:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            C1.b r1 = new C1.b
            r4 = 8
            r1.<init>(r2, r4)
            r5.f4881a = r3
            java.lang.Object r5 = r6.collect(r1, r5)
            if (r5 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiAvisa.components.details.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
