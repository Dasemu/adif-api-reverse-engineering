package kotlinx.coroutines.test;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DelayWithTimeoutDiagnostics;
import kotlinx.coroutines.DisposableHandle;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\b\u0000¢\u0006\u0002\u0010\u0004J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u001e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lkotlinx/coroutines/test/TestDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/coroutines/DelayWithTimeoutDiagnostics;", "()V", "scheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "context", "Lkotlin/coroutines/CoroutineContext;", "processEvent", "", "marker", "", "processEvent$kotlinx_coroutines_test", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "timeoutMessage", "", "timeout", "Lkotlin/time/Duration;", "timeoutMessage-LRDsOJo", "(J)Ljava/lang/String;", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TestDispatcher extends CoroutineDispatcher implements Delay, DelayWithTimeoutDiagnostics {
    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long j4, Continuation<? super Unit> continuation) {
        return Delay.DefaultImpls.delay(this, j4, continuation);
    }

    public abstract TestCoroutineScheduler getScheduler();

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long timeMillis, Runnable block, CoroutineContext context) {
        return getScheduler().registerEvent$kotlinx_coroutines_test(this, timeMillis, block, context, new Function1<Runnable, Boolean>() { // from class: kotlinx.coroutines.test.TestDispatcher$invokeOnTimeout$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Runnable runnable) {
                return Boolean.FALSE;
            }
        });
    }

    public final void processEvent$kotlinx_coroutines_test(Object marker) {
        if (!(marker instanceof Runnable)) {
            throw new IllegalStateException("Check failed.");
        }
        ((Runnable) marker).run();
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: scheduleResumeAfterDelay */
    public void mo1686scheduleResumeAfterDelay(long timeMillis, CancellableContinuation<? super Unit> continuation) {
        CancellableContinuationKt.disposeOnCancellation(continuation, getScheduler().registerEvent$kotlinx_coroutines_test(this, timeMillis, new CancellableContinuationRunnable(continuation, this), continuation.getContext(), TestDispatcher$scheduleResumeAfterDelay$handle$1.INSTANCE));
    }

    @Override // kotlinx.coroutines.DelayWithTimeoutDiagnostics
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Is only needed internally")
    /* renamed from: timeoutMessage-LRDsOJo */
    public /* synthetic */ String mo1621timeoutMessageLRDsOJo(long timeout) {
        return "Timed out after " + ((Object) Duration.m1504toStringimpl(timeout)) + " of _virtual_ (kotlinx.coroutines.test) time. To use the real time, wrap 'withTimeout' in 'withContext(Dispatchers.Default.limitedParallelism(1))'";
    }
}
