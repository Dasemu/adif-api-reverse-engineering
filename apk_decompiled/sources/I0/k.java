package I0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0.j f764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, S0.j jVar, Continuation continuation) {
        super(2, continuation);
        this.f763b = pVar;
        this.f764c = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f763b, this.f764c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f762a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.f762a = 1;
        Object a2 = p.a(this.f763b, this.f764c, 1, this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
