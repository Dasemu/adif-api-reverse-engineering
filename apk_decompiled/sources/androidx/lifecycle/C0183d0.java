package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: androidx.lifecycle.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183d0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3350a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f3352c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183d0(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f3352c = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0183d0 c0183d0 = new C0183d0(this.f3352c, continuation);
        c0183d0.f3351b = obj;
        return c0183d0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0183d0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3350a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f3351b;
            this.f3350a = 1;
            if (this.f3352c.invoke(coroutineScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
