package O;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1255a;

    public h0(View view) {
        this.f1255a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f1255a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f1255a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j4) {
        View view = (View) this.f1255a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
    }

    public final void d(i0 i0Var) {
        View view = (View) this.f1255a.get();
        if (view != null) {
            if (i0Var != null) {
                view.animate().setListener(new B0.q(i0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f1255a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
