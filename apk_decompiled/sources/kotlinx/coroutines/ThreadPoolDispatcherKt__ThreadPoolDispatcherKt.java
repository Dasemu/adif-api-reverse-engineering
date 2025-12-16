package kotlinx.coroutines;

import C.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/ThreadPoolDispatcherKt")
@SourceDebugExtension({"SMAP\nThreadPoolDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadPoolDispatcher.kt\nkotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
/* loaded from: classes3.dex */
public final /* synthetic */ class ThreadPoolDispatcherKt__ThreadPoolDispatcherKt {
    @DelicateCoroutinesApi
    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(final int i, final String str) {
        if (i < 1) {
            throw new IllegalArgumentException(w.i(i, "Expected at least one thread, but ", " specified").toString());
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        return ExecutorsKt.from((ExecutorService) Executors.newScheduledThreadPool(i, new ThreadFactory() { // from class: kotlinx.coroutines.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt;
                newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt = ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(i, str, atomicInteger, runnable);
                return newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
