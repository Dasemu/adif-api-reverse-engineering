package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TestDispatcher$scheduleResumeAfterDelay$handle$1 extends FunctionReferenceImpl implements Function1<CancellableContinuationRunnable, Boolean> {
    public static final TestDispatcher$scheduleResumeAfterDelay$handle$1 INSTANCE = new TestDispatcher$scheduleResumeAfterDelay$handle$1();

    public TestDispatcher$scheduleResumeAfterDelay$handle$1() {
        super(1, TestDispatcherKt.class, "cancellableRunnableIsCancelled", "cancellableRunnableIsCancelled(Lkotlinx/coroutines/test/CancellableContinuationRunnable;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CancellableContinuationRunnable cancellableContinuationRunnable) {
        boolean cancellableRunnableIsCancelled;
        cancellableRunnableIsCancelled = TestDispatcherKt.cancellableRunnableIsCancelled(cancellableContinuationRunnable);
        return Boolean.valueOf(cancellableRunnableIsCancelled);
    }
}
