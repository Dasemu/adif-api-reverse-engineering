package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0005H\u0016R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/test/CancellableContinuationRunnable;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CancellableContinuation;Lkotlinx/coroutines/CoroutineDispatcher;)V", "run", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTestDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestDispatcher.kt\nkotlinx/coroutines/test/CancellableContinuationRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
/* loaded from: classes3.dex */
public final class CancellableContinuationRunnable implements Runnable {

    @JvmField
    public final CancellableContinuation<Unit> continuation;
    private final CoroutineDispatcher dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationRunnable(CancellableContinuation<? super Unit> cancellableContinuation, CoroutineDispatcher coroutineDispatcher) {
        this.continuation = cancellableContinuation;
        this.dispatcher = coroutineDispatcher;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.resumeUndispatched(this.dispatcher, Unit.INSTANCE);
    }
}
