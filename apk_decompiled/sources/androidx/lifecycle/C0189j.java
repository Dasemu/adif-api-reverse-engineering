package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189j extends W {

    /* renamed from: m, reason: collision with root package name */
    public C0182d f3392m;

    /* renamed from: n, reason: collision with root package name */
    public r f3393n;

    @Override // androidx.lifecycle.W, androidx.lifecycle.Q
    public final void g() {
        Job launch$default;
        super.g();
        C0182d c0182d = this.f3392m;
        if (c0182d != null) {
            Job job = c0182d.f3349f;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            c0182d.f3349f = null;
            if (c0182d.f3348e != null) {
                return;
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(c0182d.f3346c, null, null, new C0180c(c0182d, null), 3, null);
            c0182d.f3348e = launch$default;
        }
    }

    @Override // androidx.lifecycle.W, androidx.lifecycle.Q
    public final void h() {
        Job launch$default;
        super.h();
        C0182d c0182d = this.f3392m;
        if (c0182d != null) {
            if (c0182d.f3349f != null) {
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(c0182d.f3346c, Dispatchers.getMain().getImmediate(), null, new C0178b(c0182d, null), 2, null);
            c0182d.f3349f = launch$default;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.lifecycle.C0187h
            if (r0 == 0) goto L13
            r0 = r6
            androidx.lifecycle.h r0 = (androidx.lifecycle.C0187h) r0
            int r1 = r0.f3382d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3382d = r1
            goto L18
        L13:
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f3380b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3382d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            androidx.lifecycle.j r5 = r0.f3379a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.lifecycle.r r6 = r5.f3393n
            if (r6 == 0) goto L5c
            r0.f3379a = r5
            r0.f3382d = r4
            kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.MainCoroutineDispatcher r2 = r2.getImmediate()
            androidx.lifecycle.q r4 = new androidx.lifecycle.q
            r4.<init>(r6, r3)
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r2, r4, r0)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r0) goto L57
            goto L59
        L57:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L59:
            if (r6 != r1) goto L5c
            return r1
        L5c:
            r5.f3393n = r3
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0189j.l(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (l(r0) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.lifecycle.Q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(androidx.lifecycle.C0189j r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.C0188i
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.i r0 = (androidx.lifecycle.C0188i) r0
            int r1 = r0.f3391e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3391e = r1
            goto L18
        L13:
            androidx.lifecycle.i r0 = new androidx.lifecycle.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f3389c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3391e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            androidx.lifecycle.j r5 = r0.f3387a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L69
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            androidx.lifecycle.Q r6 = r0.f3388b
            androidx.lifecycle.j r5 = r0.f3387a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4e
        L3e:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f3387a = r5
            r0.f3388b = r6
            r0.f3391e = r4
            java.lang.Object r7 = r5.l(r0)
            if (r7 != r1) goto L4e
            goto L68
        L4e:
            r0.f3387a = r5
            r7 = 0
            r0.f3388b = r7
            r0.f3391e = r3
            kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.MainCoroutineDispatcher r2 = r2.getImmediate()
            androidx.lifecycle.k r3 = new androidx.lifecycle.k
            r3.<init>(r5, r6, r7)
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r2, r3, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            androidx.lifecycle.r r7 = (androidx.lifecycle.r) r7
            r5.f3393n = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0189j.m(androidx.lifecycle.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
