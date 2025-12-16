package Y;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: Y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089e extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f2072a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuspendLambda(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0089e) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2072a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f2072a = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
