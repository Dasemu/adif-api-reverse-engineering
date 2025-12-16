package kotlinx.coroutines.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0017J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineScopeImpl;", "Lkotlinx/coroutines/test/TestCoroutineScope;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "cleanedUp", "", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "exceptions", "", "", "initialJobs", "", "Lkotlinx/coroutines/Job;", "lock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "testScheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getTestScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "cleanupTestCoroutines", "", "reportException", "throwable", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTestCoroutineScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestCoroutineScope.kt\nkotlinx/coroutines/test/TestCoroutineScopeImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 TestCoroutineScope.kt\nkotlinx/coroutines/test/TestCoroutineScopeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n28#2,4:349\n28#2,4:356\n20#3:353\n20#3:360\n218#4,2:354\n1855#5,2:361\n*S KotlinDebug\n*F\n+ 1 TestCoroutineScope.kt\nkotlinx/coroutines/test/TestCoroutineScopeImpl\n*L\n74#1:349,4\n104#1:356,4\n74#1:353\n104#1:360\n91#1:354,2\n110#1:361,2\n*E\n"})
/* loaded from: classes3.dex */
public final class TestCoroutineScopeImpl implements TestCoroutineScope {
    private boolean cleanedUp;
    private final CoroutineContext coroutineContext;
    private final Object lock = new Object();
    private List<Throwable> exceptions = new ArrayList();
    private final Set<Job> initialJobs = TestCoroutineScopeKt.activeJobs(getCoroutineContext());

    public TestCoroutineScopeImpl(CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (getTestScheduler().isIdle$kotlinx_coroutines_test(false) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlinx.coroutines.test.TestCoroutineScope
    @kotlin.Deprecated(message = "Please call `runTest`, which automatically performs the cleanup, instead of using this function.")
    /* renamed from: cleanupTestCoroutines */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1698cleanupTestCoroutines() {
        /*
            r5 = this;
            kotlin.coroutines.CoroutineContext r0 = r5.getCoroutineContext()
            kotlin.coroutines.ContinuationInterceptor$Key r1 = kotlin.coroutines.ContinuationInterceptor.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlin.coroutines.ContinuationInterceptor r0 = (kotlin.coroutines.ContinuationInterceptor) r0
            boolean r1 = r0 instanceof kotlinx.coroutines.test.DelayController
            r2 = 0
            if (r1 == 0) goto L14
            kotlinx.coroutines.test.DelayController r0 = (kotlinx.coroutines.test.DelayController) r0
            goto L15
        L14:
            r0 = r2
        L15:
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L1d
            r0.cleanupTestCoroutines()     // Catch: kotlinx.coroutines.test.UncompletedCoroutinesError -> L2e
            goto L2f
        L1d:
            kotlinx.coroutines.test.TestCoroutineScheduler r0 = r5.getTestScheduler()
            r0.runCurrent()
            kotlinx.coroutines.test.TestCoroutineScheduler r0 = r5.getTestScheduler()
            boolean r0 = r0.isIdle$kotlinx_coroutines_test(r1)
            if (r0 != 0) goto L2f
        L2e:
            r1 = r3
        L2f:
            kotlin.coroutines.CoroutineContext r0 = r5.getCoroutineContext()
            kotlinx.coroutines.CoroutineExceptionHandler$Key r4 = kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r4)
            boolean r4 = r0 instanceof kotlinx.coroutines.test.UncaughtExceptionCaptor
            if (r4 == 0) goto L40
            r2 = r0
            kotlinx.coroutines.test.UncaughtExceptionCaptor r2 = (kotlinx.coroutines.test.UncaughtExceptionCaptor) r2
        L40:
            if (r2 == 0) goto L45
            r2.cleanupTestCoroutines()
        L45:
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            boolean r2 = r5.cleanedUp     // Catch: java.lang.Throwable -> Lad
            if (r2 != 0) goto Laf
            r5.cleanedUp = r3     // Catch: java.lang.Throwable -> Lad
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r0)
            java.util.List<java.lang.Throwable> r0 = r5.exceptions
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L7a
            java.util.List<java.lang.Throwable> r5 = r5.exceptions
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = kotlin.collections.CollectionsKt.drop(r5, r3)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L69:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r5.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            kotlin.ExceptionsKt.addSuppressed(r0, r1)
            goto L69
        L79:
            throw r0
        L7a:
            if (r1 != 0) goto La5
            kotlin.coroutines.CoroutineContext r0 = r5.getCoroutineContext()
            java.util.Set r0 = kotlinx.coroutines.test.TestCoroutineScopeKt.activeJobs(r0)
            java.util.Set<kotlinx.coroutines.Job> r5 = r5.initialJobs
            java.util.Set r5 = kotlin.collections.SetsKt.minus(r0, r5)
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L91
            return
        L91:
            kotlinx.coroutines.test.UncompletedCoroutinesError r5 = new kotlinx.coroutines.test.UncompletedCoroutinesError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Test finished with active jobs: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        La5:
            kotlinx.coroutines.test.UncompletedCoroutinesError r5 = new kotlinx.coroutines.test.UncompletedCoroutinesError
            java.lang.String r0 = "Unfinished coroutines during teardown. Ensure all coroutines are completed or cancelled by your test."
            r5.<init>(r0)
            throw r5
        Lad:
            r5 = move-exception
            goto Lb7
        Laf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "Attempting to clean up a test coroutine scope more than once."
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Lad
            throw r5     // Catch: java.lang.Throwable -> Lad
        Lb7:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestCoroutineScopeImpl.mo1698cleanupTestCoroutines():void");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // kotlinx.coroutines.test.TestCoroutineScope
    public TestCoroutineScheduler getTestScheduler() {
        CoroutineContext.Element element = getCoroutineContext().get(TestCoroutineScheduler.INSTANCE);
        Intrinsics.checkNotNull(element);
        return (TestCoroutineScheduler) element;
    }

    public final boolean reportException(Throwable throwable) {
        boolean z3;
        synchronized (this.lock) {
            if (this.cleanedUp) {
                z3 = false;
            } else {
                this.exceptions.add(throwable);
                z3 = true;
            }
        }
        return z3;
    }
}
