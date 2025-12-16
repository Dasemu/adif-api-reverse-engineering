package com.adif.elcanomovil.repositories.avisa;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4581a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultAvisaLoginRepository f4583c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4587g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4588j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DefaultAvisaLoginRepository defaultAvisaLoginRepository, String str, String str2, String str3, String str4, String str5, String str6, String str7, Continuation continuation) {
        super(2, continuation);
        this.f4583c = defaultAvisaLoginRepository;
        this.f4584d = str;
        this.f4585e = str2;
        this.f4586f = str3;
        this.f4587g = str4;
        this.h = str5;
        this.i = str6;
        this.f4588j = str7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f4583c, this.f4584d, this.f4585e, this.f4586f, this.f4587g, this.h, this.i, this.f4588j, continuation);
        cVar.f4582b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:2)|(1:(1:(1:(1:(3:8|9|10)(2:12|13))(5:14|15|16|9|10))(5:18|19|20|21|22))(1:30))(1:39)|31|32|33|(2:35|22)|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (r0 != r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r7.emit(r0, r18) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
    
        if (r0.emit(r11, r18) == r2) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r1.f4581a
            com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository r3 = r1.f4583c
            java.lang.String r4 = r1.h
            java.lang.String r5 = r1.f4586f
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r0 == 0) goto L4d
            if (r0 == r9) goto L44
            if (r0 == r8) goto L37
            if (r0 == r7) goto L2a
            if (r0 != r6) goto L22
            kotlin.ResultKt.throwOnFailure(r19)
            goto Lbb
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2a:
            java.lang.Object r0 = r1.f4582b
            r7 = r0
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            kotlin.ResultKt.throwOnFailure(r19)     // Catch: java.lang.Throwable -> L34
            goto Lbb
        L34:
            r0 = move-exception
            goto La6
        L37:
            java.lang.Object r0 = r1.f4582b
            r8 = r0
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            kotlin.ResultKt.throwOnFailure(r19)     // Catch: java.lang.Throwable -> L41
            r7 = r8
            goto L8f
        L41:
            r0 = move-exception
            r7 = r8
            goto La6
        L44:
            java.lang.Object r0 = r1.f4582b
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            kotlin.ResultKt.throwOnFailure(r19)
        L4b:
            r9 = r0
            goto L65
        L4d:
            kotlin.ResultKt.throwOnFailure(r19)
            java.lang.Object r0 = r1.f4582b
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r11 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r11 = r11.loading(r10)
            r1.f4582b = r0
            r1.f4581a = r9
            java.lang.Object r9 = r0.emit(r11, r1)
            if (r9 != r2) goto L4b
            goto Lba
        L65:
            java.lang.String r0 = r1.f4584d     // Catch: java.lang.Throwable -> La4
            com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository.access$storeSubscriptionUserId(r3, r0)     // Catch: java.lang.Throwable -> La4
            com.adif.elcanomovil.serviceNetworking.avisa.AvisaLoginService r0 = com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository.access$getAvisaLoginService$p(r3)     // Catch: java.lang.Throwable -> La4
            java.lang.String r11 = r1.f4585e     // Catch: java.lang.Throwable -> La4
            com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaRegistrationRequest r12 = new com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaRegistrationRequest     // Catch: java.lang.Throwable -> La4
            java.lang.String r13 = r1.f4586f     // Catch: java.lang.Throwable -> La4
            java.lang.String r14 = r1.f4587g     // Catch: java.lang.Throwable -> La4
            java.lang.String r15 = r1.h     // Catch: java.lang.Throwable -> La4
            java.lang.String r6 = r1.i     // Catch: java.lang.Throwable -> La4
            java.lang.String r7 = r1.f4588j     // Catch: java.lang.Throwable -> La4
            r16 = r6
            r17 = r7
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> La4
            r1.f4582b = r9     // Catch: java.lang.Throwable -> La4
            r1.f4581a = r8     // Catch: java.lang.Throwable -> La4
            java.lang.Object r0 = r0.register(r11, r12, r1)     // Catch: java.lang.Throwable -> La4
            if (r0 != r2) goto L8e
            goto Lba
        L8e:
            r7 = r9
        L8f:
            com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository.access$storeAvisaUser(r3, r5, r4)     // Catch: java.lang.Throwable -> L34
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r0 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE     // Catch: java.lang.Throwable -> L34
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r0 = r0.success(r10)     // Catch: java.lang.Throwable -> L34
            r1.f4582b = r7     // Catch: java.lang.Throwable -> L34
            r6 = 3
            r1.f4581a = r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r7.emit(r0, r1)     // Catch: java.lang.Throwable -> L34
            if (r0 != r2) goto Lbb
            goto Lba
        La4:
            r0 = move-exception
            r7 = r9
        La6:
            com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository.access$storeAvisaUser(r3, r5, r4)
            com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r3 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE
            com.adif.elcanomovil.domain.entities.utils.AsyncResult r0 = r3.error(r0, r10)
            r1.f4582b = r10
            r3 = 4
            r1.f4581a = r3
            java.lang.Object r0 = r7.emit(r0, r1)
            if (r0 != r2) goto Lbb
        Lba:
            return r2
        Lbb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
