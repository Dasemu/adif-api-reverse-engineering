package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes.dex */
public final class e0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Mutex f3355a;

    /* renamed from: b, reason: collision with root package name */
    public SuspendLambda f3356b;

    /* renamed from: c, reason: collision with root package name */
    public int f3357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Mutex f3358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f3359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(Mutex mutex, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f3358d = mutex;
        this.f3359e = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e0(this.f3358d, this.f3359e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003b, code lost:
    
        if (r7.lock(null, r6) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f3357c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlinx.coroutines.sync.Mutex r6 = r6.f3355a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L15
            goto L51
        L15:
            r7 = move-exception
            goto L5d
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1f:
            kotlin.coroutines.jvm.internal.SuspendLambda r1 = r6.f3356b
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlinx.coroutines.sync.Mutex r3 = r6.f3355a
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r3
            goto L3e
        L2a:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.sync.Mutex r7 = r6.f3358d
            r6.f3355a = r7
            kotlin.coroutines.jvm.internal.SuspendLambda r1 = r6.f3359e
            r6.f3356b = r1
            r6.f3357c = r3
            java.lang.Object r3 = r7.lock(r4, r6)
            if (r3 != r0) goto L3e
            goto L4f
        L3e:
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0     // Catch: java.lang.Throwable -> L59
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L59
            r6.f3355a = r7     // Catch: java.lang.Throwable -> L59
            r6.f3356b = r4     // Catch: java.lang.Throwable -> L59
            r6.f3357c = r2     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r3, r6)     // Catch: java.lang.Throwable -> L59
            if (r6 != r0) goto L50
        L4f:
            return r0
        L50:
            r6 = r7
        L51:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L15
            r6.unlock(r4)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L59:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L5d:
            r6.unlock(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
