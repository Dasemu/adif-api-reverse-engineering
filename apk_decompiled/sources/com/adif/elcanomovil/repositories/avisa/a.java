package com.adif.elcanomovil.repositories.avisa;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4575a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultAvisaLoginRepository f4577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DefaultAvisaLoginRepository defaultAvisaLoginRepository, Continuation continuation) {
        super(2, continuation);
        this.f4577c = defaultAvisaLoginRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = new a(this.f4577c, continuation);
        aVar.f4576b = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(1:(1:(3:(1:(1:7)(2:11|12))(3:13|14|15)|8|9)(6:22|23|24|25|26|27))(1:36))(1:50)|37|38|39|40|41|(3:43|26|27)|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        if (r2.emit(r14, r13) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (r5.emit(r14, r13) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        r2 = r15;
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ad, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0061, code lost:
    
        if (r15.emit(r0, r14) == r1) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r14.f4575a
            com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository r2 = r14.f4577c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L4c
            if (r0 == r6) goto L43
            if (r0 == r5) goto L33
            if (r0 == r4) goto L24
            if (r0 != r3) goto L1c
            kotlin.ResultKt.throwOnFailure(r15)
            goto Lc0
        L1c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L24:
            java.lang.Object r0 = r14.f4576b
            r2 = r0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L2e
            goto Lc0
        L2e:
            r0 = move-exception
            r15 = r0
            r13 = r14
            goto Laf
        L33:
            java.lang.Object r0 = r14.f4576b
            r5 = r0
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L3d
            r13 = r14
            goto L8e
        L3d:
            r0 = move-exception
            r15 = r0
            r13 = r14
        L40:
            r2 = r5
            goto Laf
        L43:
            java.lang.Object r0 = r14.f4576b
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            kotlin.ResultKt.throwOnFailure(r15)
            r15 = r0
            goto L64
        L4c:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.f4576b
            kotlinx.coroutines.flow.FlowCollector r15 = (kotlinx.coroutines.flow.FlowCollector) r15
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r0 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r0 = r0.loading(r7)
            r14.f4576b = r15
            r14.f4575a = r6
            java.lang.Object r0 = r15.emit(r0, r14)
            if (r0 != r1) goto L64
            goto Lbf
        L64:
            com.adif.elcanomovil.serviceNetworking.avisa.AvisaLoginService r8 = com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository.access$getAvisaLoginService$p(r2)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r9 = "Basic YXZpc3RhX2NsaWVudF9hbmRyb2lkOjh5WzZKNyFmSjwhXypmYXE1NyNnOSohNElwa2MjWC1BTg=="
            com.adif.elcanomovil.repositories.avisa.ServiceGrantType r0 = com.adif.elcanomovil.repositories.avisa.ServiceGrantType.PASSWORD     // Catch: java.lang.Throwable -> Lac
            java.lang.String r10 = r0.getValue()     // Catch: java.lang.Throwable -> Lac
            com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage r0 = com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository.access$getPreferences$p(r2)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r11 = r0.getAvisaUserId()     // Catch: java.lang.Throwable -> Lac
            com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage r0 = com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository.access$getPreferences$p(r2)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r12 = r0.getAvisaPassword()     // Catch: java.lang.Throwable -> Lac
            r14.f4576b = r15     // Catch: java.lang.Throwable -> Lac
            r14.f4575a = r5     // Catch: java.lang.Throwable -> Lac
            r13 = r14
            java.lang.Object r14 = r8.login(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> La7
            if (r14 != r1) goto L8c
            goto Lbf
        L8c:
            r5 = r15
            r15 = r14
        L8e:
            com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaLoginResponse r15 = (com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaLoginResponse) r15     // Catch: java.lang.Throwable -> La4
            com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository.access$handleAvisaLoginResponse(r2, r15)     // Catch: java.lang.Throwable -> La4
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r14 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE     // Catch: java.lang.Throwable -> La4
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r14 = r14.success(r7)     // Catch: java.lang.Throwable -> La4
            r13.f4576b = r5     // Catch: java.lang.Throwable -> La4
            r13.f4575a = r4     // Catch: java.lang.Throwable -> La4
            java.lang.Object r14 = r5.emit(r14, r13)     // Catch: java.lang.Throwable -> La4
            if (r14 != r1) goto Lc0
            goto Lbf
        La4:
            r0 = move-exception
            r15 = r0
            goto L40
        La7:
            r0 = move-exception
        La8:
            r14 = r0
            r2 = r15
            r15 = r14
            goto Laf
        Lac:
            r0 = move-exception
            r13 = r14
            goto La8
        Laf:
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r14 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r14 = r14.error(r15, r7)
            r13.f4576b = r7
            r13.f4575a = r3
            java.lang.Object r14 = r2.emit(r14, r13)
            if (r14 != r1) goto Lc0
        Lbf:
            return r1
        Lc0:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
