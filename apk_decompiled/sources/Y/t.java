package Y;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2100a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f2102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(F f2, Continuation continuation) {
        super(2, continuation);
        this.f2102c = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        t tVar = new t(this.f2102c, continuation);
        tVar.f2101b = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2100a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f2101b;
            F f2 = this.f2102c;
            G g4 = (G) f2.f2061g.getValue();
            if (!(g4 instanceof C0086b)) {
                f2.i.l(new k(g4));
            }
            s sVar = new s(FlowKt.dropWhile(f2.f2061g, new q(g4, null)));
            this.f2100a = 1;
            if (FlowKt.emitAll(flowCollector, sVar, this) == coroutine_suspended) {
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
