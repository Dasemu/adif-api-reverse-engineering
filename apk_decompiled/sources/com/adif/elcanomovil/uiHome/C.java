package com.adif.elcanomovil.uiHome;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class C extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f5059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(HomeViewModel homeViewModel, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f5059b = homeViewModel;
        this.f5060c = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C(this.f5059b, this.f5060c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
    
        if (r7 == r0) goto L20;
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
            int r1 = r6.f5058a
            com.adif.elcanomovil.uiHome.HomeViewModel r2 = r6.f5059b
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.ResultKt.throwOnFailure(r7)
            goto L45
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1f:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3c
        L23:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L33
        L27:
            kotlin.ResultKt.throwOnFailure(r7)
            r6.f5058a = r5
            java.lang.Object r7 = com.adif.elcanomovil.uiHome.HomeViewModel.access$fetchHomeStation(r2, r6)
            if (r7 != r0) goto L33
            goto L44
        L33:
            r6.f5058a = r4
            java.lang.Object r7 = com.adif.elcanomovil.uiHome.HomeViewModel.access$fetchWorkStation(r2, r6)
            if (r7 != r0) goto L3c
            goto L44
        L3c:
            r6.f5058a = r3
            java.lang.Object r7 = com.adif.elcanomovil.uiHome.HomeViewModel.access$fetchFavorites(r2, r6)
            if (r7 != r0) goto L45
        L44:
            return r0
        L45:
            com.adif.elcanomovil.uiHome.HomeViewModel.access$collectLocationStatus(r2)
            com.adif.elcanomovil.uiHome.HomeViewModel.access$collectNearestStation(r2)
            boolean r6 = r6.f5060c
            if (r6 == 0) goto L53
            com.adif.elcanomovil.uiHome.HomeViewModel.access$showFavorites(r2)
            goto L5a
        L53:
            r6 = 0
            com.adif.elcanomovil.uiHome.HomeViewModel.access$setFullyExpandedBottomSheet$p(r2, r6)
            com.adif.elcanomovil.uiHome.HomeViewModel.access$updateViewState(r2)
        L5a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.C.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
