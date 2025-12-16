package Y;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f2095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(G g4, Continuation continuation) {
        super(2, continuation);
        this.f2095b = g4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        q qVar = new q(this.f2095b, continuation);
        qVar.f2094a = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((G) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        G g4 = (G) this.f2094a;
        G g5 = this.f2095b;
        boolean z3 = false;
        if (!(g5 instanceof C0086b) && !(g5 instanceof C0092h) && g4 == g5) {
            z3 = true;
        }
        return Boxing.boxBoolean(z3);
    }
}
