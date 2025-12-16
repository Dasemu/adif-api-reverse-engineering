package com.adif.elcanomovil.observers;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/observers/ComposedApplicationObserver;", "Lcom/adif/elcanomovil/observers/ApplicationObserver;", "observers", "", "(Ljava/util/List;)V", "start", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposedApplicationObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposedApplicationObserver.kt\ncom/adif/elcanomovil/observers/ComposedApplicationObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n1855#2,2:14\n*S KotlinDebug\n*F\n+ 1 ComposedApplicationObserver.kt\ncom/adif/elcanomovil/observers/ComposedApplicationObserver\n*L\n10#1:14,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposedApplicationObserver implements ApplicationObserver {
    private final List<ApplicationObserver> observers;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposedApplicationObserver(List<? extends ApplicationObserver> observers) {
        Intrinsics.checkNotNullParameter(observers, "observers");
        this.observers = observers;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.adif.elcanomovil.observers.ApplicationObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object start(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p1.C0550a
            if (r0 == 0) goto L13
            r0 = r5
            p1.a r0 = (p1.C0550a) r0
            int r1 = r0.f8116d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8116d = r1
            goto L18
        L13:
            p1.a r0 = new p1.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8114b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f8116d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r4 = r0.f8113a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3e
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            java.util.List<com.adif.elcanomovil.observers.ApplicationObserver> r4 = r4.observers
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            com.adif.elcanomovil.observers.ApplicationObserver r5 = (com.adif.elcanomovil.observers.ApplicationObserver) r5
            r0.f8113a = r4
            r0.f8116d = r3
            java.lang.Object r5 = r5.start(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.observers.ComposedApplicationObserver.start(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
