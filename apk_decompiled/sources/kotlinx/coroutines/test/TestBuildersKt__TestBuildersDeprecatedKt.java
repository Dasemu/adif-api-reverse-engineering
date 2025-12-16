package kotlinx.coroutines.test;

import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001a@\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001aJ\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u0010\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00112'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u0013\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00062'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u0014\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\f2'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u0015\u001aH\u0010\u0016\u001a\u00060\u0001j\u0002`\u0017*\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"runBlockingTest", "", "context", "Lkotlin/coroutines/CoroutineContext;", "testBody", "Lkotlin/Function2;", "Lkotlinx/coroutines/test/TestCoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "runBlockingTestOnTestScope", "Lkotlinx/coroutines/test/TestScope;", "runTestWithLegacyScope", "dispatchTimeoutMs", "", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)V", "Lkotlinx/coroutines/test/TestCoroutineDispatcher;", "block", "(Lkotlinx/coroutines/test/TestCoroutineDispatcher;Lkotlin/jvm/functions/Function2;)V", "(Lkotlinx/coroutines/test/TestCoroutineScope;Lkotlin/jvm/functions/Function2;)V", "(Lkotlinx/coroutines/test/TestScope;Lkotlin/jvm/functions/Function2;)V", "runTest", "Lkotlinx/coroutines/test/TestResult;", "(Lkotlinx/coroutines/test/TestCoroutineScope;JLkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-test"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/test/TestBuildersKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class TestBuildersKt__TestBuildersDeprecatedKt {
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use `runTest` instead to support completing from other dispatchers. Please see the migration guide for details: https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-test/MIGRATION.md")
    public static final void runBlockingTest(CoroutineContext coroutineContext, Function2<? super TestCoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        Deferred async$default;
        TestCoroutineScope createTestCoroutineScope = TestCoroutineScopeKt.createTestCoroutineScope(new TestCoroutineDispatcher(null, 1, null).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(coroutineContext));
        TestCoroutineScheduler testScheduler = createTestCoroutineScope.getTestScheduler();
        async$default = BuildersKt__Builders_commonKt.async$default(createTestCoroutineScope, null, null, new TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1(function2, createTestCoroutineScope, null), 3, null);
        testScheduler.advanceUntilIdle();
        Throwable completionExceptionOrNull = async$default.getCompletionExceptionOrNull();
        if (completionExceptionOrNull == null) {
            createTestCoroutineScope.mo1698cleanupTestCoroutines();
            return;
        }
        throw completionExceptionOrNull;
    }

    public static /* synthetic */ void runBlockingTest$default(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        TestBuildersKt.runBlockingTest(coroutineContext, (Function2<? super TestCoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use `runTest` instead to support completing from other dispatchers.")
    public static final void runBlockingTestOnTestScope(CoroutineContext coroutineContext, Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        Throwable th;
        List<Throwable> emptyList;
        CoroutineContext plus = new TestCoroutineDispatcher(null, 1, null).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(coroutineContext);
        Set<Job> activeJobs = TestCoroutineScopeKt.activeJobs(plus);
        TestScopeImpl asSpecificImplementation = TestScopeKt.asSpecificImplementation(TestScopeKt.TestScope(plus));
        asSpecificImplementation.enter();
        asSpecificImplementation.start(CoroutineStart.UNDISPATCHED, asSpecificImplementation, new TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$1(function2, asSpecificImplementation, null));
        asSpecificImplementation.getTestScheduler().advanceUntilIdle();
        try {
            th = asSpecificImplementation.getCompletionExceptionOrNull();
        } catch (IllegalStateException unused) {
            th = null;
        }
        CoroutineScopeKt.cancel$default(asSpecificImplementation.getBackgroundScope(), null, 1, null);
        asSpecificImplementation.getTestScheduler().advanceUntilIdleOr$kotlinx_coroutines_test(new Function0<Boolean>() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        });
        if (th != null) {
            try {
                emptyList = asSpecificImplementation.legacyLeave();
            } catch (UncompletedCoroutinesError unused2) {
                emptyList = CollectionsKt.emptyList();
            }
            TestBuildersKt.throwAll(th, emptyList);
        } else {
            TestBuildersKt.throwAll(null, asSpecificImplementation.legacyLeave());
            Set minus = SetsKt.minus((Set) TestCoroutineScopeKt.activeJobs(plus), (Iterable) activeJobs);
            if (minus.isEmpty()) {
                return;
            }
            throw new UncompletedCoroutinesError("Some jobs were not completed at the end of the test: " + minus);
        }
    }

    public static /* synthetic */ void runBlockingTestOnTestScope$default(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        TestBuildersKt.runBlockingTestOnTestScope(coroutineContext, function2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use `TestScope.runTest` instead.")
    @ExperimentalCoroutinesApi
    public static final void runTest(TestCoroutineScope testCoroutineScope, long j4, Function2<? super TestCoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        TestBuildersKt.runTestWithLegacyScope(testCoroutineScope.getCoroutineContext(), j4, function2);
    }

    public static /* synthetic */ void runTest$default(TestCoroutineScope testCoroutineScope, long j4, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            j4 = TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS;
        }
        TestBuildersKt.runTest(testCoroutineScope, j4, (Function2<? super TestCoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use `runTest` instead.")
    @ExperimentalCoroutinesApi
    public static final void runTestWithLegacyScope(CoroutineContext coroutineContext, long j4, Function2<? super TestCoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        RunningInRunTest runningInRunTest = RunningInRunTest.INSTANCE;
        if (coroutineContext.get(runningInRunTest) != null) {
            throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.");
        }
        TestBuildersJvmKt.createTestResult(new TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1(new TestBodyCoroutine(TestCoroutineScopeKt.createTestCoroutineScope(coroutineContext.plus(runningInRunTest))), j4, function2, null));
    }

    public static /* synthetic */ void runTestWithLegacyScope$default(CoroutineContext coroutineContext, long j4, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j4 = TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS;
        }
        TestBuildersKt.runTestWithLegacyScope(coroutineContext, j4, function2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use `runTest` instead to support completing from other dispatchers. Please see the migration guide for details: https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-test/MIGRATION.md")
    public static final void runBlockingTest(TestCoroutineScope testCoroutineScope, Function2<? super TestCoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        TestBuildersKt.runBlockingTest(testCoroutineScope.getCoroutineContext(), function2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use `runTest` instead to support completing from other dispatchers.")
    public static final void runBlockingTest(TestScope testScope, Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        TestBuildersKt.runBlockingTestOnTestScope(testScope.getCoroutineContext(), function2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use `runTest` instead to support completing from other dispatchers. Please see the migration guide for details: https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-test/MIGRATION.md")
    public static final void runBlockingTest(TestCoroutineDispatcher testCoroutineDispatcher, Function2<? super TestCoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        TestBuildersKt.runBlockingTest((CoroutineContext) testCoroutineDispatcher, function2);
    }
}
