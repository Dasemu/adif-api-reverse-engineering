package W0;

/* loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, W0.b, java.lang.Object, androidx.lifecycle.I] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.lifecycle.C r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof W0.a
            if (r0 == 0) goto L13
            r0 = r7
            W0.a r0 = (W0.a) r0
            int r1 = r0.f1884d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1884d = r1
            goto L18
        L13:
            W0.a r0 = new W0.a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1883c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1884d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f1882b
            androidx.lifecycle.C r0 = r0.f1881a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2d
            goto L86
        L2d:
            r7 = move-exception
            goto L92
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            androidx.lifecycle.B r7 = r6.b()
            androidx.lifecycle.B r2 = androidx.lifecycle.B.f3283d
            boolean r7 = r7.a(r2)
            if (r7 == 0) goto L49
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L49:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.f1881a = r6     // Catch: java.lang.Throwable -> L7b
            r0.f1882b = r7     // Catch: java.lang.Throwable -> L7b
            r0.f1884d = r3     // Catch: java.lang.Throwable -> L7b
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L7b
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L7b
            r2.initCancellability()     // Catch: java.lang.Throwable -> L7b
            W0.b r3 = new W0.b     // Catch: java.lang.Throwable -> L7b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            r7.element = r3     // Catch: java.lang.Throwable -> L7b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L7b
            r6.a(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r2 = r2.getResult()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L7b
            if (r2 != r3) goto L81
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L7b
            goto L81
        L7b:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L92
        L81:
            if (r2 != r1) goto L84
            return r1
        L84:
            r0 = r6
            r6 = r7
        L86:
            T r6 = r6.element
            androidx.lifecycle.I r6 = (androidx.lifecycle.I) r6
            if (r6 == 0) goto L8f
            r0.c(r6)
        L8f:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L92:
            T r6 = r6.element
            androidx.lifecycle.I r6 = (androidx.lifecycle.I) r6
            if (r6 == 0) goto L9b
            r0.c(r6)
        L9b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.c.a(androidx.lifecycle.C, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
