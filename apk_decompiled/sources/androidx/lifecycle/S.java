package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class S extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f3321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3322c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u3, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f3321b = u3;
        this.f3322c = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new S(this.f3321b, this.f3322c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3320a;
        U u3 = this.f3321b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0189j c0189j = u3.f3326a;
            this.f3320a = 1;
            if (c0189j.l(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        u3.f3326a.j(this.f3322c);
        return Unit.INSTANCE;
    }
}
