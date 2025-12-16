package com.adif.elcanomovil.domain.usecases.user;

import com.adif.elcanomovil.domain.providers.LocationProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0086B¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/user/GetUserLastLocationUseCase;", "", "locationProvider", "Lcom/adif/elcanomovil/domain/providers/LocationProvider;", "(Lcom/adif/elcanomovil/domain/providers/LocationProvider;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Landroid/location/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetUserLastLocationUseCase {
    private final LocationProvider locationProvider;

    public GetUserLastLocationUseCase(LocationProvider locationProvider) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        this.locationProvider = locationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends android.location.Location>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o1.C0548a
            if (r0 == 0) goto L13
            r0 = r5
            o1.a r0 = (o1.C0548a) r0
            int r1 = r0.f8081c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8081c = r1
            goto L18
        L13:
            o1.a r0 = new o1.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8079a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f8081c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            com.adif.elcanomovil.domain.providers.LocationProvider r4 = r4.locationProvider
            r0.f8081c = r3
            java.lang.Object r5 = r4.fetchLastLocation(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
            kotlinx.coroutines.flow.Flow r4 = kotlinx.coroutines.flow.FlowKt.filterNotNull(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.user.GetUserLastLocationUseCase.invoke(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
