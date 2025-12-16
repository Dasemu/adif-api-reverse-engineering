package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.test.internal.TestMainDispatcher;
import kotlinx.coroutines.test.internal.TestMainDispatcherJvmKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"resetMain", "", "Lkotlinx/coroutines/Dispatchers;", "setMain", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-test"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "TestDispatchers")
@SourceDebugExtension({"SMAP\nTestDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestDispatchers.kt\nkotlinx/coroutines/test/TestDispatchers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
/* loaded from: classes3.dex */
public final class TestDispatchers {
    @ExperimentalCoroutinesApi
    public static final void resetMain(Dispatchers dispatchers) {
        TestMainDispatcherJvmKt.getTestMainDispatcher(dispatchers).resetDispatcher();
    }

    @ExperimentalCoroutinesApi
    public static final void setMain(Dispatchers dispatchers, CoroutineDispatcher coroutineDispatcher) {
        if (coroutineDispatcher instanceof TestMainDispatcher) {
            throw new IllegalArgumentException("Dispatchers.setMain(Dispatchers.Main) is prohibited, probably Dispatchers.resetMain() should be used instead");
        }
        TestMainDispatcherJvmKt.getTestMainDispatcher(dispatchers).setDispatcher(coroutineDispatcher);
    }
}
