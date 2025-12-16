package g;

import java.util.concurrent.Executor;

/* renamed from: g.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0370q implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
