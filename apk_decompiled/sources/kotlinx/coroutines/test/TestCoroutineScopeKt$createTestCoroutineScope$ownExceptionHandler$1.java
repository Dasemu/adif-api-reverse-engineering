package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"kotlinx/coroutines/test/TestCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/test/TestCoroutineScopeExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1 extends AbstractCoroutineContextElement implements TestCoroutineScopeExceptionHandler {
    final /* synthetic */ Ref.ObjectRef<TestCoroutineScopeImpl> $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1(Ref.ObjectRef<TestCoroutineScopeImpl> objectRef, CoroutineExceptionHandler.Companion companion) {
        super(companion);
        this.$scope = objectRef;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        TestCoroutineScopeImpl testCoroutineScopeImpl = this.$scope.element;
        Intrinsics.checkNotNull(testCoroutineScopeImpl);
        if (!testCoroutineScopeImpl.reportException(exception)) {
            throw exception;
        }
    }
}
