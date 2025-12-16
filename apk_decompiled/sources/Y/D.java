package Y;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class D extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f2044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f2044b = (SuspendLambda) function2;
        this.f2045c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new D(this.f2044b, this.f2045c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2043a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.f2043a = 1;
        Object invoke = this.f2044b.invoke(this.f2045c, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }
}
