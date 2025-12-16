package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/test/TestScope;", "Lkotlinx/coroutines/CoroutineScope;", "backgroundScope", "getBackgroundScope", "()Lkotlinx/coroutines/CoroutineScope;", "testScheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getTestScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "Lkotlinx/coroutines/test/TestScopeImpl;", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TestScope extends CoroutineScope {
    CoroutineScope getBackgroundScope();

    TestCoroutineScheduler getTestScheduler();
}
