package W1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f1948a;

    public q(ExecutorService executorService) {
        this.f1948a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1948a.execute(new F0.c(runnable, 3));
    }
}
