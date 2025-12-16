package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes.dex */
public final class h0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3383a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f3385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f3386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(C c4, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f3385c = c4;
        this.f3386d = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h0 h0Var = new h0(this.f3385c, this.f3386d, continuation);
        h0Var.f3384b = obj;
        return h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3383a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f3384b;
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            g0 g0Var = new g0(this.f3385c, coroutineScope, this.f3386d, null);
            this.f3383a = 1;
            if (BuildersKt.withContext(immediate, g0Var, this) == coroutine_suspended) {
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
