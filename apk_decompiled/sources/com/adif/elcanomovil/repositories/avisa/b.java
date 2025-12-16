package com.adif.elcanomovil.repositories.avisa;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4578a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultAvisaLoginRepository f4580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DefaultAvisaLoginRepository defaultAvisaLoginRepository, Continuation continuation) {
        super(2, continuation);
        this.f4580c = defaultAvisaLoginRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f4580c, continuation);
        bVar.f4579b = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r1.emit(r11, r10) != r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        if (r1.emit(r11, r10) != r0) goto L38;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f4578a
            com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository r2 = r10.f4580c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L3f
            if (r1 == r6) goto L37
            if (r1 == r5) goto L2f
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            kotlin.ResultKt.throwOnFailure(r11)
            goto La8
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L24:
            java.lang.Object r1 = r10.f4579b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L2d
            goto La8
        L2d:
            r11 = move-exception
            goto L97
        L2f:
            java.lang.Object r1 = r10.f4579b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L2d
            goto L81
        L37:
            java.lang.Object r1 = r10.f4579b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L58
        L3f:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f4579b
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r1 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r1 = r1.loading(r7)
            r10.f4579b = r11
            r10.f4578a = r6
            java.lang.Object r1 = r11.emit(r1, r10)
            if (r1 != r0) goto L57
            goto La7
        L57:
            r1 = r11
        L58:
            com.adif.elcanomovil.serviceNetworking.avisa.AvisaLoginService r11 = com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository.access$getAvisaLoginService$p(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "Basic YXZpc3RhX2NsaWVudF9hbmRyb2lkOjh5WzZKNyFmSjwhXypmYXE1NyNnOSohNElwa2MjWC1BTg=="
            com.adif.elcanomovil.repositories.avisa.ServiceGrantType r8 = com.adif.elcanomovil.repositories.avisa.ServiceGrantType.TOKEN     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = r8.getValue()     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage r9 = com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository.access$getPreferences$p(r2)     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.serviceStorage.model.avisa.AvisaToken r9 = r9.getAvisaToken()     // Catch: java.lang.Throwable -> L2d
            if (r9 == 0) goto L74
            java.lang.String r9 = r9.getRefreshToken()     // Catch: java.lang.Throwable -> L2d
            if (r9 != 0) goto L76
        L74:
            java.lang.String r9 = ""
        L76:
            r10.f4579b = r1     // Catch: java.lang.Throwable -> L2d
            r10.f4578a = r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r11 = r11.refreshToken(r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L2d
            if (r11 != r0) goto L81
            goto La7
        L81:
            com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaLoginResponse r11 = (com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaLoginResponse) r11     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository.access$handleAvisaLoginResponse(r2, r11)     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r11 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE     // Catch: java.lang.Throwable -> L2d
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r11 = r11.success(r7)     // Catch: java.lang.Throwable -> L2d
            r10.f4579b = r1     // Catch: java.lang.Throwable -> L2d
            r10.f4578a = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r10 = r1.emit(r11, r10)     // Catch: java.lang.Throwable -> L2d
            if (r10 != r0) goto La8
            goto La7
        L97:
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r2 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r11 = r2.error(r11, r7)
            r10.f4579b = r7
            r10.f4578a = r3
            java.lang.Object r10 = r1.emit(r11, r10)
            if (r10 != r0) goto La8
        La7:
            return r0
        La8:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
