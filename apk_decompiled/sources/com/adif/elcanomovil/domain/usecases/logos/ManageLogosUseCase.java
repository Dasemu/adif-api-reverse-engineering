package com.adif.elcanomovil.domain.usecases.logos;

import com.adif.elcanomovil.domain.providers.LogoProvider;
import com.adif.elcanomovil.domain.repositories.logos.LogosInfoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0086B¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/logos/ManageLogosUseCase;", "", "logosInfoRepository", "Lcom/adif/elcanomovil/domain/repositories/logos/LogosInfoRepository;", "logoProvider", "Lcom/adif/elcanomovil/domain/providers/LogoProvider;", "(Lcom/adif/elcanomovil/domain/repositories/logos/LogosInfoRepository;Lcom/adif/elcanomovil/domain/providers/LogoProvider;)V", "checkFetchInfo", "", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ManageLogosUseCase {
    private final LogoProvider logoProvider;
    private final LogosInfoRepository logosInfoRepository;

    public ManageLogosUseCase(LogosInfoRepository logosInfoRepository, LogoProvider logoProvider) {
        Intrinsics.checkNotNullParameter(logosInfoRepository, "logosInfoRepository");
        Intrinsics.checkNotNullParameter(logoProvider, "logoProvider");
        this.logosInfoRepository = logosInfoRepository;
        this.logoProvider = logoProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkFetchInfo(java.lang.String r5, kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m1.C0504a
            if (r0 == 0) goto L13
            r0 = r6
            m1.a r0 = (m1.C0504a) r0
            int r1 = r0.f7795c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7795c = r1
            goto L18
        L13:
            m1.a r0 = new m1.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f7793a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7795c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.domain.repositories.logos.LogosInfoRepository r4 = r4.logosInfoRepository
            r0.f7795c = r3
            java.lang.Object r6 = r4.getLogo(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L63
            long r4 = r6.longValue()
            java.util.Date r6 = new java.util.Date
            r6.<init>()
            long r0 = r6.getTime()
            long r0 = r0 - r4
            long r4 = java.lang.Math.abs(r0)
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L5d
            goto L5e
        L5d:
            r3 = 0
        L5e:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r4
        L63:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase.checkFetchInfo(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof m1.C0505b
            if (r0 == 0) goto L13
            r0 = r7
            m1.b r0 = (m1.C0505b) r0
            int r1 = r0.f7800e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7800e = r1
            goto L18
        L13:
            m1.b r0 = new m1.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f7798c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7800e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.String r6 = r0.f7797b
            com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase r5 = r0.f7796a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4c
        L3c:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f7796a = r5
            r0.f7797b = r6
            r0.f7800e = r4
            java.lang.Object r7 = r5.checkFetchInfo(r6, r0)
            if (r7 != r1) goto L4c
            goto L6a
        L4c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6e
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            m1.c r2 = new m1.c
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f7796a = r4
            r0.f7797b = r4
            r0.f7800e = r3
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r5 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L6e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase.invoke(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
