package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f4118a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f4119b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f4121d;

    public k(o oVar) {
        this.f4121d = oVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f4119b = runnable;
        View decorView = this.f4121d.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (!this.f4120c) {
            decorView.postOnAnimation(new F2.f(this, 5));
        } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f4119b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f4118a) {
                this.f4120c = false;
                this.f4121d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f4119b = null;
        q fullyDrawnReporter = this.f4121d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f4131a) {
            z3 = fullyDrawnReporter.f4132b;
        }
        if (z3) {
            this.f4120c = false;
            this.f4121d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4121d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
