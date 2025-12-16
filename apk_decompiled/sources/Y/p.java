package Y;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2091a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f2093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(F f2, Continuation continuation) {
        super(2, continuation);
        this.f2093c = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        p pVar = new p(this.f2093c, continuation);
        pVar.f2092b = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((m) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r5 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (Y.F.c(r4, (Y.l) r6, r5) == r0) goto L40;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f2091a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L86
        L1c:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.f2092b
            Y.m r6 = (Y.m) r6
            boolean r1 = r6 instanceof Y.k
            Y.F r4 = r5.f2093c
            if (r1 == 0) goto L77
            Y.k r6 = (Y.k) r6
            r5.f2091a = r3
            kotlinx.coroutines.flow.MutableStateFlow r1 = r4.f2061g
            java.lang.Object r1 = r1.getValue()
            Y.G r1 = (Y.G) r1
            boolean r2 = r1 instanceof Y.C0086b
            if (r2 == 0) goto L3a
            goto L6a
        L3a:
            boolean r2 = r1 instanceof Y.i
            if (r2 == 0) goto L50
            Y.G r6 = r6.f2084a
            if (r1 != r6) goto L6a
            java.lang.Object r5 = r4.g(r5)
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L4d
            goto L6c
        L4d:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L6c
        L50:
            Y.H r6 = Y.H.f2062a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 == 0) goto L66
            java.lang.Object r5 = r4.g(r5)
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L63
            goto L6c
        L63:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L6c
        L66:
            boolean r5 = r1 instanceof Y.C0092h
            if (r5 != 0) goto L6f
        L6a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L6c:
            if (r5 != r0) goto L86
            goto L85
        L6f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Can't read in final state."
            r5.<init>(r6)
            throw r5
        L77:
            boolean r1 = r6 instanceof Y.l
            if (r1 == 0) goto L86
            Y.l r6 = (Y.l) r6
            r5.f2091a = r2
            java.lang.Object r5 = Y.F.c(r4, r6, r5)
            if (r5 != r0) goto L86
        L85:
            return r0
        L86:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
