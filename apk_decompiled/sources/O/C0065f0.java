package O;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* renamed from: O.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065f0 extends RestrictedSuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1245a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1247c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0065f0(View view, Continuation continuation) {
        super(2, continuation);
        this.f1247c = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0065f0 c0065f0 = new C0065f0(this.f1247c, continuation);
        c0065f0.f1246b = obj;
        return c0065f0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0065f0) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r1.yieldAll(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1.yield(r2, r5) == r0) goto L17;
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
            int r1 = r5.f1245a
            android.view.View r2 = r5.f1247c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4e
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1c:
            java.lang.Object r1 = r5.f1246b
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L37
        L24:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.f1246b
            r1 = r6
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            r5.f1246b = r1
            r5.f1245a = r4
            java.lang.Object r6 = r1.yield(r2, r5)
            if (r6 != r0) goto L37
            goto L4d
        L37:
            boolean r6 = r2 instanceof android.view.ViewGroup
            if (r6 == 0) goto L4e
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            O.e0 r6 = new O.e0
            r6.<init>(r2)
            r2 = 0
            r5.f1246b = r2
            r5.f1245a = r3
            java.lang.Object r5 = r1.yieldAll(r6, r5)
            if (r5 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0065f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
