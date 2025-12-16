package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f3416a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196q(r rVar, Continuation continuation) {
        super(2, continuation);
        this.f3416a = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0196q(this.f3416a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0196q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        r rVar = this.f3416a;
        if (!rVar.f3423c) {
            V v3 = (V) rVar.f3422b.f3331l.c(rVar.f3421a);
            if (v3 != null) {
                v3.f3328a.i(v3);
            }
            rVar.f3423c = true;
        }
        return Unit.INSTANCE;
    }
}
