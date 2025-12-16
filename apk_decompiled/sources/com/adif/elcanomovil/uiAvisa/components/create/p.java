package com.adif.elcanomovil.uiAvisa.components.create;

import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceNotificationType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewIssueViewModel f4857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IncidenceNotificationType f4858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(NewIssueViewModel newIssueViewModel, IncidenceNotificationType incidenceNotificationType, Continuation continuation) {
        super(2, continuation);
        this.f4857b = newIssueViewModel;
        this.f4858c = incidenceNotificationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f4857b, this.f4858c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r12).collect(r11, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r12 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f4856a
            com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewModel r2 = r11.f4857b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r12)
            goto L81
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L1c:
            kotlin.ResultKt.throwOnFailure(r12)
            r10 = r11
            goto L70
        L21:
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r4
            com.adif.elcanomovil.domain.usecases.avisa.incidence.CreateIncidenceUseCase r4 = com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewModel.access$getCreateIncidenceUseCase$p(r2)
            androidx.lifecycle.X r1 = com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewModel.access$getSelectedCategory$p(r2)
            java.lang.Object r1 = r1.d()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory r1 = (com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory) r1
            java.lang.String r5 = r1.getCatId()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewModel.access$getIssueDescription$p(r2)
            r1.append(r6)
            r6 = 10
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            androidx.lifecycle.X r1 = com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewModel.access$getSelectedStation$p(r2)
            java.lang.Object r1 = r1.d()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            com.adif.elcanomovil.domain.entities.avisa.AvisaStation r1 = (com.adif.elcanomovil.domain.entities.avisa.AvisaStation) r1
            java.lang.String r8 = r1.getStId()
            java.util.List r9 = com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewModel.access$getPictures$p(r2)
            r11.f4856a = r12
            com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceNotificationType r7 = r11.f4858c
            r10 = r11
            java.lang.Object r12 = r4.invoke(r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L70
            goto L80
        L70:
            kotlinx.coroutines.flow.Flow r12 = (kotlinx.coroutines.flow.Flow) r12
            com.adif.elcanomovil.uiAvisa.components.create.o r11 = new com.adif.elcanomovil.uiAvisa.components.create.o
            r1 = 0
            r11.<init>(r2, r1)
            r10.f4856a = r3
            java.lang.Object r11 = r12.collect(r11, r10)
            if (r11 != r0) goto L81
        L80:
            return r0
        L81:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiAvisa.components.create.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
