package com.adif.elcanomovil.uiSelectTrain.main;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectTrainViewModel f5242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SelectTrainViewModel selectTrainViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.f5242b = selectTrainViewModel;
        this.f5243c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f5242b, this.f5243c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r1.collect(r7, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f5241a
            com.adif.elcanomovil.uiSelectTrain.main.SelectTrainViewModel r2 = r6.f5242b
            java.lang.String r3 = r6.f5243c
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            kotlin.ResultKt.throwOnFailure(r7)
            goto L48
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1e:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L33
        L22:
            kotlin.ResultKt.throwOnFailure(r7)
            com.adif.elcanomovil.domain.usecases.circulation.GetSeveralPathsUseCase r7 = com.adif.elcanomovil.uiSelectTrain.main.SelectTrainViewModel.access$getGetSeveralPathsUseCase$p(r2)
            r6.f5241a = r5
            r1 = 0
            java.lang.Object r7 = r7.invoke(r3, r1, r6)
            if (r7 != r0) goto L33
            goto L47
        L33:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            com.adif.elcanomovil.uiSelectTrain.main.SelectTrainViewModel$fetchTrain$1$invokeSuspend$$inlined$map$1 r1 = new com.adif.elcanomovil.uiSelectTrain.main.SelectTrainViewModel$fetchTrain$1$invokeSuspend$$inlined$map$1
            r1.<init>()
            com.adif.elcanomovil.uiSelectTrain.main.e r7 = new com.adif.elcanomovil.uiSelectTrain.main.e
            r7.<init>(r2, r3)
            r6.f5241a = r4
            java.lang.Object r6 = r1.collect(r7, r6)
            if (r6 != r0) goto L48
        L47:
            return r0
        L48:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSelectTrain.main.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
