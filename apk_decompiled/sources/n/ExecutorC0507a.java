package n;

import java.util.concurrent.Executor;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0507a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7831a;

    public /* synthetic */ ExecutorC0507a(int i) {
        this.f7831a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7831a) {
            case 0:
                C0508b.L().f7834a.f7837b.execute(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
