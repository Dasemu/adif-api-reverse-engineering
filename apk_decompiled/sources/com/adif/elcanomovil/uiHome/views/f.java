package com.adif.elcanomovil.uiHome.views;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5127a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeMapViewModel f5129c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(HomeMapViewModel homeMapViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5129c = homeMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.f5129c, continuation);
        fVar.f5128b = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
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
            int r1 = r6.f5127a
            com.adif.elcanomovil.uiHome.views.HomeMapViewModel r2 = r6.f5129c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            java.lang.Object r6 = r6.f5128b
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5a
        L19:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L21:
            java.lang.Object r1 = r6.f5128b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L40
        L29:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f5128b
            r1 = r7
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            com.adif.elcanomovil.domain.usecases.user.GetUserLastLocationUseCase r7 = com.adif.elcanomovil.uiHome.views.HomeMapViewModel.access$getGetUserLastLocationUseCase$p(r2)
            r6.f5128b = r1
            r6.f5127a = r5
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r0) goto L40
            goto L59
        L40:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.filterNotNull(r7)
            com.adif.elcanomovil.uiHome.u r5 = new com.adif.elcanomovil.uiHome.u
            r5.<init>(r2, r3)
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.m1659catch(r7, r5)
            r6.f5128b = r1
            r6.f5127a = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r7, r6)
            if (r7 != r0) goto L5a
        L59:
            return r0
        L5a:
            android.location.Location r7 = (android.location.Location) r7
            if (r7 == 0) goto L6a
            com.google.android.gms.maps.model.LatLng r6 = com.adif.elcanomovil.extensions.LocationExtensionsKt.toLatLngTranslatedToSouth(r7)
            com.adif.elcanomovil.uiHome.views.HomeMapViewModel.access$notifyViewMoveCameraToLocation(r2, r6)
            com.adif.elcanomovil.uiHome.views.HomeMapViewModel.access$notifyUserPermissionEnabled(r2)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
        L6a:
            if (r3 != 0) goto L73
            com.google.android.gms.maps.model.LatLng r6 = com.adif.elcanomovil.uiHome.views.HomeMapViewModelKt.access$getDEFAULT_LOCATION$p()
            com.adif.elcanomovil.uiHome.views.HomeMapViewModel.access$notifyViewMoveCameraToLocation(r2, r6)
        L73:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.views.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
