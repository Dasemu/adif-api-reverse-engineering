package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n.C0508b;
import n.ExecutorC0507a;

/* loaded from: classes.dex */
public final class B implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f3945a;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f3946b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3947c;

    public B() {
        ExecutorC0507a executor = C0508b.f7833c;
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f3945a = new ArrayDeque();
        this.f3947c = new Object();
    }

    public final void a() {
        synchronized (this.f3947c) {
            Object poll = this.f3945a.poll();
            Runnable runnable = (Runnable) poll;
            this.f3946b = runnable;
            if (poll != null) {
                C0508b.L().f7834a.f7837b.execute(runnable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f3947c) {
            try {
                this.f3945a.offer(new F.n(1, command, this));
                if (this.f3946b == null) {
                    a();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
