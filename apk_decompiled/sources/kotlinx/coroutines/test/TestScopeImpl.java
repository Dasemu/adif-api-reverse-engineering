package kotlinx.coroutines.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt;
import kotlinx.coroutines.test.internal.ExceptionCollector;
import kotlinx.coroutines.test.internal.ReportingSupervisorJob;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aJ\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0017J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u0004\u0018\u00010\u0017R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lkotlinx/coroutines/test/TestScopeImpl;", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/test/TestScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "backgroundScope", "Lkotlinx/coroutines/CoroutineScope;", "getBackgroundScope", "()Lkotlinx/coroutines/CoroutineScope;", "entered", "", "finished", "lock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "testScheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getTestScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "uncaughtExceptions", "", "", "enter", "leave", "", "legacyLeave", "reportException", "throwable", "toString", "", "tryGetCompletionCause", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTestScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestScope.kt\nkotlinx/coroutines/test/TestScopeImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,336:1\n28#2,4:337\n28#2,4:343\n28#2,4:348\n28#2,4:353\n20#3:341\n20#3:347\n20#3:352\n20#3:357\n1#4:342\n163#5:358\n*S KotlinDebug\n*F\n+ 1 TestScope.kt\nkotlinx/coroutines/test/TestScopeImpl\n*L\n224#1:337,4\n251#1:343,4\n261#1:348,4\n287#1:353,4\n224#1:341\n251#1:347\n261#1:352\n287#1:357\n294#1:358\n*E\n"})
/* loaded from: classes3.dex */
public final class TestScopeImpl extends AbstractCoroutine<Unit> implements TestScope {
    private final CoroutineScope backgroundScope;
    private boolean entered;
    private boolean finished;
    private final Object lock;
    private final List<Throwable> uncaughtExceptions;

    public TestScopeImpl(CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.uncaughtExceptions = new ArrayList();
        this.lock = new Object();
        this.backgroundScope = CoroutineScopeKt.CoroutineScope(getCoroutineContext().plus(BackgroundWork.INSTANCE).plus(new ReportingSupervisorJob(null, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.test.TestScopeImpl$backgroundScope$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th instanceof CancellationException) {
                    return;
                }
                TestScopeImpl.this.reportException(th);
            }
        }, 1, null)));
    }

    public final void enter() {
        ExceptionCollector exceptionCollector;
        List<Throwable> list;
        synchronized (this.lock) {
            try {
                if (this.entered) {
                    throw new IllegalStateException("Only a single call to `runTest` can be performed during one test.");
                }
                this.entered = true;
                if (this.finished) {
                    throw new IllegalStateException("Check failed.");
                }
                exceptionCollector = ExceptionCollector.INSTANCE;
                CoroutineExceptionHandlerImplKt.ensurePlatformExceptionHandlerLoaded(exceptionCollector);
                if (TestScopeKt.getCatchNonTestRelatedExceptions()) {
                    exceptionCollector.addOnExceptionCallback(this.lock, new TestScopeImpl$enter$exceptions$1$2(this));
                }
                list = this.uncaughtExceptions;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        exceptionCollector.removeOnExceptionCallback(this.lock);
        UncaughtExceptionsBeforeTest uncaughtExceptionsBeforeTest = new UncaughtExceptionsBeforeTest();
        Iterator<Throwable> it = list.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(uncaughtExceptionsBeforeTest, it.next());
        }
        throw uncaughtExceptionsBeforeTest;
    }

    @Override // kotlinx.coroutines.test.TestScope
    public CoroutineScope getBackgroundScope() {
        return this.backgroundScope;
    }

    @Override // kotlinx.coroutines.test.TestScope
    public TestCoroutineScheduler getTestScheduler() {
        CoroutineContext.Element element = get$context().get(TestCoroutineScheduler.INSTANCE);
        Intrinsics.checkNotNull(element);
        return (TestCoroutineScheduler) element;
    }

    public final List<Throwable> leave() {
        List<Throwable> list;
        synchronized (this.lock) {
            if (!this.entered || this.finished) {
                throw new IllegalStateException("Check failed.");
            }
            ExceptionCollector.INSTANCE.removeOnExceptionCallback(this.lock);
            this.finished = true;
            list = this.uncaughtExceptions;
        }
        return list;
    }

    public final List<Throwable> legacyLeave() {
        List<Throwable> list;
        synchronized (this.lock) {
            if (!this.entered || this.finished) {
                throw new IllegalStateException("Check failed.");
            }
            ExceptionCollector.INSTANCE.removeOnExceptionCallback(this.lock);
            this.finished = true;
            list = this.uncaughtExceptions;
        }
        List list2 = SequencesKt.toList(SequencesKt.filter(getChildren(), new Function1<Job, Boolean>() { // from class: kotlinx.coroutines.test.TestScopeImpl$legacyLeave$activeJobs$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Job job) {
                return Boolean.valueOf(job.isActive());
            }
        }));
        if (list.isEmpty()) {
            if (!list2.isEmpty()) {
                throw new UncompletedCoroutinesError("Active jobs found during the tear-down. Ensure that all coroutines are completed or cancelled by your test. The active jobs: " + list2);
            }
            if (!TestCoroutineScheduler.isIdle$kotlinx_coroutines_test$default(getTestScheduler(), false, 1, null)) {
                throw new UncompletedCoroutinesError("Unfinished coroutines found during the tear-down. Ensure that all coroutines are completed or cancelled by your test.");
            }
        }
        return list;
    }

    public final void reportException(Throwable throwable) {
        synchronized (this.lock) {
            if (this.finished) {
                throw throwable;
            }
            Iterator<Throwable> it = this.uncaughtExceptions.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(throwable, it.next())) {
                    return;
                }
            }
            this.uncaughtExceptions.add(throwable);
            if (this.entered) {
                Unit unit = Unit.INSTANCE;
            } else {
                UncaughtExceptionsBeforeTest uncaughtExceptionsBeforeTest = new UncaughtExceptionsBeforeTest();
                ExceptionsKt.addSuppressed(uncaughtExceptionsBeforeTest, throwable);
                throw uncaughtExceptionsBeforeTest;
            }
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    public String toString() {
        return com.google.android.gms.measurement.internal.a.n(new StringBuilder("TestScope["), this.finished ? "test ended" : this.entered ? "test started" : "test not started", ']');
    }

    public final Throwable tryGetCompletionCause() {
        return getCompletionCause();
    }
}
