package Y;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class s implements Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f2099a;

    public s(Flow flow) {
        this.f2099a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.f2099a.collect(new C1.b(flowCollector, 1), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
