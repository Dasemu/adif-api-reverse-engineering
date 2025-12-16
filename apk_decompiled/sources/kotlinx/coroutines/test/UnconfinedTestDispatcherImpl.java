package kotlinx.coroutines.test;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.YieldContext;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/test/UnconfinedTestDispatcherImpl;", "Lkotlinx/coroutines/test/TestDispatcher;", "scheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "(Lkotlinx/coroutines/test/TestCoroutineScheduler;Ljava/lang/String;)V", "getScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "isDispatchNeeded", "", "toString", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class UnconfinedTestDispatcherImpl extends TestDispatcher {
    private final String name;
    private final TestCoroutineScheduler scheduler;

    public /* synthetic */ UnconfinedTestDispatcherImpl(TestCoroutineScheduler testCoroutineScheduler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(testCoroutineScheduler, (i & 2) != 0 ? null : str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo1685dispatch(CoroutineContext context, Runnable block) {
        TestCoroutineSchedulerKt.checkSchedulerInContext(getScheduler(), context);
        getScheduler().sendDispatchEvent$kotlinx_coroutines_test(context);
        YieldContext yieldContext = (YieldContext) context.get(YieldContext.INSTANCE);
        if (yieldContext == null) {
            throw new UnsupportedOperationException("Function UnconfinedTestCoroutineDispatcher.dispatch can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        yieldContext.dispatcherWasUnconfined = true;
    }

    @Override // kotlinx.coroutines.test.TestDispatcher
    public TestCoroutineScheduler getScheduler() {
        return this.scheduler;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext context) {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.name;
        if (str == null) {
            str = "UnconfinedTestDispatcher";
        }
        sb.append(str);
        sb.append("[scheduler=");
        sb.append(getScheduler());
        sb.append(']');
        return sb.toString();
    }

    public UnconfinedTestDispatcherImpl(TestCoroutineScheduler testCoroutineScheduler, String str) {
        this.scheduler = testCoroutineScheduler;
        this.name = str;
    }
}
