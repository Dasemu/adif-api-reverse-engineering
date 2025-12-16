package Y;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public p f2081a;

    /* renamed from: b, reason: collision with root package name */
    public int f2082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.j f2083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(A.j jVar, Continuation continuation) {
        super(2, continuation);
        this.f2083c = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f2083c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0053 -> B:6:0x0056). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f2082b
            r2 = 2
            r3 = 1
            A.j r4 = r6.f2083c
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.ResultKt.throwOnFailure(r7)
            goto L56
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1c:
            Y.p r1 = r6.f2081a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4a
        L22:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r4.f30d
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L63
        L2f:
            java.lang.Object r7 = r4.f27a
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            kotlinx.coroutines.CoroutineScopeKt.ensureActive(r7)
            java.lang.Object r7 = r4.f28b
            r1 = r7
            Y.p r1 = (Y.p) r1
            r6.f2081a = r1
            r6.f2082b = r3
            java.lang.Object r7 = r4.f29c
            kotlinx.coroutines.channels.Channel r7 = (kotlinx.coroutines.channels.Channel) r7
            java.lang.Object r7 = r7.receive(r6)
            if (r7 != r0) goto L4a
            goto L55
        L4a:
            r5 = 0
            r6.f2081a = r5
            r6.f2082b = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L56
        L55:
            return r0
        L56:
            java.lang.Object r7 = r4.f30d
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2f
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L63:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Check failed."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
