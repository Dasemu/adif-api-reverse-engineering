package kotlinx.coroutines.test;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlinx.coroutines.AbstractCoroutine;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0002J\b\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/test/TestBodyCoroutine;", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/test/TestCoroutineScope;", "testScope", "(Lkotlinx/coroutines/test/TestCoroutineScope;)V", "testScheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getTestScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "cleanup", "cleanupTestCoroutines", "", "tryGetCompletionCause", "", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestBodyCoroutine extends AbstractCoroutine<Unit> implements TestCoroutineScope {
    private final TestCoroutineScope testScope;

    public TestBodyCoroutine(TestCoroutineScope testCoroutineScope) {
        super(testCoroutineScope.getCoroutineContext(), true, true);
        this.testScope = testCoroutineScope;
    }

    public final void cleanup() {
        this.testScope.mo1698cleanupTestCoroutines();
    }

    @Override // kotlinx.coroutines.test.TestCoroutineScope
    public TestCoroutineScheduler getTestScheduler() {
        return this.testScope.getTestScheduler();
    }

    public final Throwable tryGetCompletionCause() {
        return getCompletionCause();
    }

    @Override // kotlinx.coroutines.test.TestCoroutineScope
    @Deprecated(level = DeprecationLevel.ERROR, message = "This deprecation is to prevent accidentally calling `cleanupTestCoroutines` in our own code.", replaceWith = @ReplaceWith(expression = "this.cleanup()", imports = {}))
    /* renamed from: cleanupTestCoroutines, reason: merged with bridge method [inline-methods] */
    public Void mo1698cleanupTestCoroutines() {
        throw new UnsupportedOperationException("Calling `cleanupTestCoroutines` inside `runTest` is prohibited: it will be called at the end of the test in any case.");
    }
}
