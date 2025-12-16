package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0215f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3808a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3808a.post(runnable);
    }
}
