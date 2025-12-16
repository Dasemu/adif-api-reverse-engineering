package B0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.adif.elcanomovil.R;

/* loaded from: classes.dex */
public final class M extends AnimatorListenerAdapter implements v {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f112a;

    /* renamed from: b, reason: collision with root package name */
    public final View f113b;

    /* renamed from: c, reason: collision with root package name */
    public final View f114c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f115d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0030h f116e;

    public M(C0030h c0030h, ViewGroup viewGroup, View view, View view2) {
        this.f116e = c0030h;
        this.f112a = viewGroup;
        this.f113b = view;
        this.f114c = view2;
    }

    @Override // B0.v
    public final void a(x xVar) {
    }

    @Override // B0.v
    public final void b() {
    }

    @Override // B0.v
    public final void c(x xVar) {
        xVar.A(this);
    }

    @Override // B0.v
    public final void d() {
    }

    @Override // B0.v
    public final void e(x xVar) {
        if (this.f115d) {
            g();
        }
    }

    public final void g() {
        this.f114c.setTag(R.id.save_overlay_view, null);
        this.f112a.getOverlay().remove(this.f113b);
        this.f115d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f112a.getOverlay().remove(this.f113b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f113b;
        if (view.getParent() == null) {
            this.f112a.getOverlay().add(view);
        } else {
            this.f116e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            View view = this.f114c;
            View view2 = this.f113b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f112a.getOverlay().add(view2);
            this.f115d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        g();
    }
}
