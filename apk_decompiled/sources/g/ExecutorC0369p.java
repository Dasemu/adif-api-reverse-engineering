package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: g.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0369p implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6654a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f6655b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorC0370q f6656c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f6657d;

    public ExecutorC0369p(ExecutorC0370q executorC0370q) {
        this.f6656c = executorC0370q;
    }

    public final void a() {
        synchronized (this.f6654a) {
            try {
                Runnable runnable = (Runnable) this.f6655b.poll();
                this.f6657d = runnable;
                if (runnable != null) {
                    this.f6656c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f6654a) {
            try {
                this.f6655b.add(new F.n(7, this, runnable));
                if (this.f6657d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
