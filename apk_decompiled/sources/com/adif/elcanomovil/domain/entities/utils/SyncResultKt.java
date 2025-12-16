package com.adif.elcanomovil.domain.entities.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00012\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0086@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"mapResult", "Lcom/adif/elcanomovil/domain/entities/utils/SyncResult;", "O", "I", "mapper", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/adif/elcanomovil/domain/entities/utils/SyncResult;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SyncResultKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I, O> java.lang.Object mapResult(com.adif.elcanomovil.domain.entities.utils.SyncResult<? extends I> r4, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super O>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.domain.entities.utils.SyncResult<? extends O>> r6) {
        /*
            boolean r0 = r6 instanceof i1.C0395a
            if (r0 == 0) goto L13
            r0 = r6
            i1.a r0 = (i1.C0395a) r0
            int r1 = r0.f6814b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6814b = r1
            goto L18
        L13:
            i1.a r0 = new i1.a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6813a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6814b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r4 instanceof com.adif.elcanomovil.domain.entities.utils.SyncResult.Success
            if (r6 == 0) goto L4d
            com.adif.elcanomovil.domain.entities.utils.SyncResult$Success r4 = (com.adif.elcanomovil.domain.entities.utils.SyncResult.Success) r4
            java.lang.Object r4 = r4.getValue()
            r0.f6814b = r3
            java.lang.Object r6 = r5.invoke(r4, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.adif.elcanomovil.domain.entities.utils.SyncResult$Success r4 = new com.adif.elcanomovil.domain.entities.utils.SyncResult$Success
            r4.<init>(r6)
            return r4
        L4d:
            boolean r5 = r4 instanceof com.adif.elcanomovil.domain.entities.utils.SyncResult.Error
            if (r5 == 0) goto L52
            return r4
        L52:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.entities.utils.SyncResultKt.mapResult(com.adif.elcanomovil.domain.entities.utils.SyncResult, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
