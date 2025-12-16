package O;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: O.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0083y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f1311a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f1312b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f1313c;

    public ViewTreeObserverOnPreDrawListenerC0083y(View view, Runnable runnable) {
        this.f1311a = view;
        this.f1312b = view.getViewTreeObserver();
        this.f1313c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0083y viewTreeObserverOnPreDrawListenerC0083y = new ViewTreeObserverOnPreDrawListenerC0083y(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0083y);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0083y);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f1312b.isAlive();
        View view = this.f1311a;
        if (isAlive) {
            this.f1312b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f1313c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1312b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f1312b.isAlive();
        View view2 = this.f1311a;
        if (isAlive) {
            this.f1312b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
