package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class g0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f3372a;

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f3373b;

    /* renamed from: c, reason: collision with root package name */
    public CoroutineScope f3374c;

    /* renamed from: d, reason: collision with root package name */
    public int f3375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C f3376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f3377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f3378g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(C c4, CoroutineScope coroutineScope, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f3376e = c4;
        this.f3377f = coroutineScope;
        this.f3378g = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g0(this.f3376e, this.f3377f, this.f3378g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Object, androidx.lifecycle.f0, androidx.lifecycle.I] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.f3375d
            androidx.lifecycle.C r2 = r13.f3376e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 != r4) goto L1b
            kotlin.jvm.internal.Ref$ObjectRef r1 = r13.f3373b
            kotlin.jvm.internal.Ref$ObjectRef r13 = r13.f3372a
            kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Throwable -> L17
            goto L8c
        L17:
            r0 = move-exception
            r14 = r0
            goto La5
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L23:
            kotlin.ResultKt.throwOnFailure(r14)
            androidx.lifecycle.B r14 = r2.b()
            androidx.lifecycle.B r1 = androidx.lifecycle.B.f3280a
            if (r14 != r1) goto L31
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        L31:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            androidx.lifecycle.B r14 = androidx.lifecycle.B.f3283d     // Catch: java.lang.Throwable -> L84
            kotlinx.coroutines.CoroutineScope r8 = r13.f3377f     // Catch: java.lang.Throwable -> L84
            kotlin.coroutines.jvm.internal.SuspendLambda r12 = r13.f3378g     // Catch: java.lang.Throwable -> L84
            r13.f3372a = r7     // Catch: java.lang.Throwable -> L84
            r13.f3373b = r1     // Catch: java.lang.Throwable -> L84
            r13.f3374c = r8     // Catch: java.lang.Throwable -> L84
            r13.f3375d = r4     // Catch: java.lang.Throwable -> L84
            kotlinx.coroutines.CancellableContinuationImpl r10 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L84
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r13)     // Catch: java.lang.Throwable -> L84
            r10.<init>(r5, r4)     // Catch: java.lang.Throwable -> L84
            r10.initCancellability()     // Catch: java.lang.Throwable -> L84
            androidx.lifecycle.y r5 = androidx.lifecycle.A.Companion     // Catch: java.lang.Throwable -> L84
            r5.getClass()     // Catch: java.lang.Throwable -> La1
            androidx.lifecycle.A r6 = androidx.lifecycle.C0203y.c(r14)     // Catch: java.lang.Throwable -> La1
            androidx.lifecycle.A r9 = androidx.lifecycle.C0203y.a(r14)     // Catch: java.lang.Throwable -> L84
            r14 = 0
            kotlinx.coroutines.sync.Mutex r11 = kotlinx.coroutines.sync.MutexKt.Mutex$default(r14, r4, r3)     // Catch: java.lang.Throwable -> L84
            androidx.lifecycle.f0 r5 = new androidx.lifecycle.f0     // Catch: java.lang.Throwable -> L84
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L84
            r1.element = r5     // Catch: java.lang.Throwable -> L84
            java.lang.String r14 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r14)     // Catch: java.lang.Throwable -> L84
            r2.a(r5)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r14 = r10.getResult()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L84
            if (r14 != r5) goto L88
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r13)     // Catch: java.lang.Throwable -> L84
            goto L88
        L84:
            r0 = move-exception
            r14 = r0
        L86:
            r13 = r7
            goto La5
        L88:
            if (r14 != r0) goto L8b
            return r0
        L8b:
            r13 = r7
        L8c:
            T r13 = r13.element
            kotlinx.coroutines.Job r13 = (kotlinx.coroutines.Job) r13
            if (r13 == 0) goto L95
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r13, r3, r4, r3)
        L95:
            T r13 = r1.element
            androidx.lifecycle.H r13 = (androidx.lifecycle.H) r13
            if (r13 == 0) goto L9e
            r2.c(r13)
        L9e:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        La1:
            r0 = move-exception
            r13 = r0
            r14 = r13
            goto L86
        La5:
            T r13 = r13.element
            kotlinx.coroutines.Job r13 = (kotlinx.coroutines.Job) r13
            if (r13 == 0) goto Lae
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r13, r3, r4, r3)
        Lae:
            T r13 = r1.element
            androidx.lifecycle.H r13 = (androidx.lifecycle.H) r13
            if (r13 == 0) goto Lb7
            r2.c(r13)
        Lb7:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
