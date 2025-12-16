package n;

import android.os.Looper;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508b extends m3.d {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0508b f7832b;

    /* renamed from: c, reason: collision with root package name */
    public static final ExecutorC0507a f7833c = new ExecutorC0507a(0);

    /* renamed from: a, reason: collision with root package name */
    public final C0510d f7834a = new C0510d();

    public static C0508b L() {
        if (f7832b != null) {
            return f7832b;
        }
        synchronized (C0508b.class) {
            try {
                if (f7832b == null) {
                    f7832b = new C0508b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f7832b;
    }

    public final boolean M() {
        this.f7834a.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
