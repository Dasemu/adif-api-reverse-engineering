package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.ExperimentalTime;
import kotlin.time.TimeSource;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\n2\u0006\u0010\u0019\u001a\u00020\tH\u0007\u001a\u001e\u0010\u0017\u001a\u00020\u0018*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\f\u0010\u001e\u001a\u00020\u0018*\u00020\nH\u0007\u001a\f\u0010\u001f\u001a\u00020 *\u00020\nH\u0000\u001a\f\u0010!\u001a\u00020\u0018*\u00020\nH\u0007\u001a\f\u0010\"\u001a\u00020\u0016*\u00020\u0016H\u0000\"$\u0010\u0000\u001a\u00020\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u001e\u0010\b\u001a\u00020\t*\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u001e\u0010\u000f\u001a\u00020\u0010*\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"catchNonTestRelatedExceptions", "", "getCatchNonTestRelatedExceptions$annotations", "()V", "getCatchNonTestRelatedExceptions", "()Z", "setCatchNonTestRelatedExceptions", "(Z)V", "currentTime", "", "Lkotlinx/coroutines/test/TestScope;", "getCurrentTime$annotations", "(Lkotlinx/coroutines/test/TestScope;)V", "getCurrentTime", "(Lkotlinx/coroutines/test/TestScope;)J", "testTimeSource", "Lkotlin/time/TimeSource$WithComparableMarks;", "getTestTimeSource$annotations", "getTestTimeSource", "(Lkotlinx/coroutines/test/TestScope;)Lkotlin/time/TimeSource$WithComparableMarks;", "TestScope", "context", "Lkotlin/coroutines/CoroutineContext;", "advanceTimeBy", "", "delayTimeMillis", "delayTime", "Lkotlin/time/Duration;", "advanceTimeBy-HG0u8IE", "(Lkotlinx/coroutines/test/TestScope;J)V", "advanceUntilIdle", "asSpecificImplementation", "Lkotlinx/coroutines/test/TestScopeImpl;", "runCurrent", "withDelaySkipping", "kotlinx-coroutines-test"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTestScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestScope.kt\nkotlinx/coroutines/test/TestScopeKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n48#2,4:337\n1#3:341\n*S KotlinDebug\n*F\n+ 1 TestScope.kt\nkotlinx/coroutines/test/TestScopeKt\n*L\n171#1:337,4\n*E\n"})
/* loaded from: classes3.dex */
public final class TestScopeKt {
    private static boolean catchNonTestRelatedExceptions = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.test.TestScopeImpl, T, kotlinx.coroutines.test.TestScope] */
    public static final TestScope TestScope(CoroutineContext coroutineContext) {
        CoroutineContext withDelaySkipping = withDelaySkipping(coroutineContext);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CoroutineExceptionHandler.Companion companion = CoroutineExceptionHandler.INSTANCE;
        if (((CoroutineExceptionHandler) withDelaySkipping.get(companion)) != null) {
            throw new IllegalArgumentException("A CoroutineExceptionHandler was passed to TestScope. Please pass it as an argument to a `launch` or `async` block on an already-created scope if uncaught exceptions require special treatment.");
        }
        ?? testScopeImpl = new TestScopeImpl(withDelaySkipping.plus(new TestScopeKt$TestScope$$inlined$CoroutineExceptionHandler$1(companion, objectRef)));
        objectRef.element = testScopeImpl;
        return testScopeImpl;
    }

    public static /* synthetic */ TestScope TestScope$default(CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return TestScope(coroutineContext);
    }

    @ExperimentalCoroutinesApi
    public static final void advanceTimeBy(TestScope testScope, long j4) {
        testScope.getTestScheduler().advanceTimeBy(j4);
    }

    @ExperimentalCoroutinesApi
    /* renamed from: advanceTimeBy-HG0u8IE, reason: not valid java name */
    public static final void m1712advanceTimeByHG0u8IE(TestScope testScope, long j4) {
        testScope.getTestScheduler().m1711advanceTimeByLRDsOJo(j4);
    }

    @ExperimentalCoroutinesApi
    public static final void advanceUntilIdle(TestScope testScope) {
        testScope.getTestScheduler().advanceUntilIdle();
    }

    public static final TestScopeImpl asSpecificImplementation(TestScope testScope) {
        if (testScope instanceof TestScopeImpl) {
            return (TestScopeImpl) testScope;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean getCatchNonTestRelatedExceptions() {
        return catchNonTestRelatedExceptions;
    }

    @PublishedApi
    public static /* synthetic */ void getCatchNonTestRelatedExceptions$annotations() {
    }

    public static final long getCurrentTime(TestScope testScope) {
        return testScope.getTestScheduler().getCurrentTime();
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getCurrentTime$annotations(TestScope testScope) {
    }

    public static final TimeSource.WithComparableMarks getTestTimeSource(TestScope testScope) {
        return testScope.getTestScheduler().getTimeSource();
    }

    @ExperimentalTime
    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getTestTimeSource$annotations(TestScope testScope) {
    }

    @ExperimentalCoroutinesApi
    public static final void runCurrent(TestScope testScope) {
        testScope.getTestScheduler().runCurrent();
    }

    public static final void setCatchNonTestRelatedExceptions(boolean z3) {
        catchNonTestRelatedExceptions = z3;
    }

    public static final CoroutineContext withDelaySkipping(CoroutineContext coroutineContext) {
        TestDispatcher StandardTestDispatcher$default;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE);
        if (continuationInterceptor instanceof TestDispatcher) {
            TestCoroutineScheduler testCoroutineScheduler = (TestCoroutineScheduler) coroutineContext.get(TestCoroutineScheduler.INSTANCE);
            if (testCoroutineScheduler != null && ((TestDispatcher) continuationInterceptor).getScheduler() != testCoroutineScheduler) {
                throw new IllegalArgumentException(("Both a TestCoroutineScheduler " + testCoroutineScheduler + " and TestDispatcher " + continuationInterceptor + " linked to another scheduler were passed.").toString());
            }
            StandardTestDispatcher$default = (TestDispatcher) continuationInterceptor;
        } else {
            if (continuationInterceptor != null) {
                throw new IllegalArgumentException("Dispatcher must implement TestDispatcher: " + continuationInterceptor);
            }
            StandardTestDispatcher$default = TestCoroutineDispatchersKt.StandardTestDispatcher$default((TestCoroutineScheduler) coroutineContext.get(TestCoroutineScheduler.INSTANCE), null, 2, null);
        }
        return coroutineContext.plus(StandardTestDispatcher$default).plus(StandardTestDispatcher$default.getScheduler());
    }
}
