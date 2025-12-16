package com.adif.elcanomovil.observers;

import com.adif.elcanomovil.domain.usecases.stations.GetStationsUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/observers/UpdateStationsObserver;", "Lcom/adif/elcanomovil/observers/ApplicationObserver;", "getStationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsUseCase;", "(Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsUseCase;)V", "start", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdateStationsObserver implements ApplicationObserver {
    private final GetStationsUseCase getStationsUseCase;

    public UpdateStationsObserver(GetStationsUseCase getStationsUseCase) {
        Intrinsics.checkNotNullParameter(getStationsUseCase, "getStationsUseCase");
        this.getStationsUseCase = getStationsUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r6).collect(r5, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.adif.elcanomovil.observers.ApplicationObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object start(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p1.C0551b
            if (r0 == 0) goto L13
            r0 = r6
            p1.b r0 = (p1.C0551b) r0
            int r1 = r0.f8119c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8119c = r1
            goto L18
        L13:
            p1.b r0 = new p1.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f8117a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f8119c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)
            goto L53
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L46
        L38:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.domain.usecases.stations.GetStationsUseCase r5 = r5.getStationsUseCase
            r0.f8119c = r4
            java.lang.Object r6 = r5.invoke(r0)
            if (r6 != r1) goto L46
            goto L52
        L46:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            p1.c r5 = p1.c.f8120a
            r0.f8119c = r3
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.observers.UpdateStationsObserver.start(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
