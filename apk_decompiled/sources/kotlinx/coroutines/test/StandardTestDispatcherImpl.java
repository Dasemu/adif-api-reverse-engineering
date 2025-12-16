package kotlinx.coroutines.test;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/test/StandardTestDispatcherImpl;", "Lkotlinx/coroutines/test/TestDispatcher;", "scheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "(Lkotlinx/coroutines/test/TestCoroutineScheduler;Ljava/lang/String;)V", "getScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "toString", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class StandardTestDispatcherImpl extends TestDispatcher {
    private final String name;
    private final TestCoroutineScheduler scheduler;

    /* JADX WARN: Multi-variable type inference failed */
    public StandardTestDispatcherImpl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo1685dispatch(CoroutineContext context, Runnable block) {
        getScheduler().registerEvent$kotlinx_coroutines_test(this, 0L, block, context, new Function1<Runnable, Boolean>() { // from class: kotlinx.coroutines.test.StandardTestDispatcherImpl$dispatch$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Runnable runnable) {
                return Boolean.FALSE;
            }
        });
    }

    @Override // kotlinx.coroutines.test.TestDispatcher
    public TestCoroutineScheduler getScheduler() {
        return this.scheduler;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.name;
        if (str == null) {
            str = "StandardTestDispatcher";
        }
        sb.append(str);
        sb.append("[scheduler=");
        sb.append(getScheduler());
        sb.append(']');
        return sb.toString();
    }

    public /* synthetic */ StandardTestDispatcherImpl(TestCoroutineScheduler testCoroutineScheduler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TestCoroutineScheduler() : testCoroutineScheduler, (i & 2) != 0 ? null : str);
    }

    public StandardTestDispatcherImpl(TestCoroutineScheduler testCoroutineScheduler, String str) {
        this.scheduler = testCoroutineScheduler;
        this.name = str;
    }
}
