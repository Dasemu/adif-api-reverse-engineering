package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0189j f3394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f3395b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190k(C0189j c0189j, Q q4, Continuation continuation) {
        super(2, continuation);
        this.f3394a = c0189j;
        this.f3395b = q4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0190k(this.f3394a, this.f3395b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0190k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C0189j c0189j = this.f3394a;
        C0191l c0191l = new C0191l(new I1.b(c0189j, 4));
        c0189j.getClass();
        Q q4 = this.f3395b;
        if (q4 == null) {
            throw new NullPointerException("source cannot be null");
        }
        V v3 = new V(q4, c0191l);
        V v4 = (V) c0189j.f3331l.b(q4, v3);
        if (v4 != null && v4.f3329b != c0191l) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (v4 == null && c0189j.f3314c > 0) {
            q4.f(v3);
        }
        return new r(q4, c0189j);
    }
}
