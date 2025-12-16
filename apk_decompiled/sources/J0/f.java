package J0;

import kotlinx.coroutines.sync.Semaphore;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final p f929a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.o f930b;

    /* renamed from: c, reason: collision with root package name */
    public final Semaphore f931c;

    /* renamed from: d, reason: collision with root package name */
    public final l f932d;

    public f(p pVar, S0.o oVar, Semaphore semaphore, l lVar) {
        this.f929a = pVar;
        this.f930b = oVar;
        this.f931c = semaphore;
        this.f932d = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if (r8.acquire(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof J0.d
            if (r0 == 0) goto L13
            r0 = r8
            J0.d r0 = (J0.d) r0
            int r1 = r0.f926e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f926e = r1
            goto L18
        L13:
            J0.d r0 = new J0.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f924c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f926e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f922a
            kotlinx.coroutines.sync.Semaphore r7 = (kotlinx.coroutines.sync.Semaphore) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L30
            goto L6f
        L30:
            r8 = move-exception
            goto L79
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlinx.coroutines.sync.Semaphore r7 = r0.f923b
            java.lang.Object r2 = r0.f922a
            J0.f r2 = (J0.f) r2
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r2
            goto L58
        L46:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f922a = r7
            kotlinx.coroutines.sync.Semaphore r8 = r7.f931c
            r0.f923b = r8
            r0.f926e = r4
            java.lang.Object r2 = r8.acquire(r0)
            if (r2 != r1) goto L58
            goto L6b
        L58:
            J0.e r2 = new J0.e     // Catch: java.lang.Throwable -> L75
            r5 = 0
            r2.<init>(r7, r5)     // Catch: java.lang.Throwable -> L75
            r0.f922a = r8     // Catch: java.lang.Throwable -> L75
            r7 = 0
            r0.f923b = r7     // Catch: java.lang.Throwable -> L75
            r0.f926e = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(r7, r2, r0, r4, r7)     // Catch: java.lang.Throwable -> L75
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r6 = r8
            r8 = r7
            r7 = r6
        L6f:
            J0.h r8 = (J0.h) r8     // Catch: java.lang.Throwable -> L30
            r7.release()
            return r8
        L75:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L79:
            r7.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.f.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
