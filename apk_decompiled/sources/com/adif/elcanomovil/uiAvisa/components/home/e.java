package com.adif.elcanomovil.uiAvisa.components.home;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AvisaHomeViewModel f4904b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AvisaHomeViewModel avisaHomeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4904b = avisaHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f4904b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r5).collect(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f4903a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3d
        L12:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L1a:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L30
        L1e:
            kotlin.ResultKt.throwOnFailure(r5)
            com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeViewModel r5 = r4.f4904b
            com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationCategoriesUseCase r5 = com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeViewModel.access$getGetAvisaStationCategoriesUseCase$p(r5)
            r4.f4903a = r3
            java.lang.Object r5 = r5.invoke(r4)
            if (r5 != r0) goto L30
            goto L3c
        L30:
            kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
            com.adif.elcanomovil.uiAvisa.components.home.d r1 = com.adif.elcanomovil.uiAvisa.components.home.d.f4902a
            r4.f4903a = r2
            java.lang.Object r4 = r5.collect(r1, r4)
            if (r4 != r0) goto L3d
        L3c:
            return r0
        L3d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiAvisa.components.home.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
