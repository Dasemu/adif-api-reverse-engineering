package B0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class L extends AnimatorListenerAdapter implements v {

    /* renamed from: a, reason: collision with root package name */
    public final View f106a;

    /* renamed from: b, reason: collision with root package name */
    public final int f107b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f108c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f110e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f111f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f109d = true;

    public L(View view, int i) {
        this.f106a = view;
        this.f107b = i;
        this.f108c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // B0.v
    public final void a(x xVar) {
    }

    @Override // B0.v
    public final void b() {
        g(false);
        if (this.f111f) {
            return;
        }
        C0024b c0024b = I.f105a;
        this.f106a.setTransitionVisibility(this.f107b);
    }

    @Override // B0.v
    public final void c(x xVar) {
        xVar.A(this);
    }

    @Override // B0.v
    public final void d() {
        g(true);
        if (this.f111f) {
            return;
        }
        C0024b c0024b = I.f105a;
        this.f106a.setTransitionVisibility(0);
    }

    @Override // B0.v
    public final void e(x xVar) {
    }

    public final void g(boolean z3) {
        ViewGroup viewGroup;
        if (!this.f109d || this.f110e == z3 || (viewGroup = this.f108c) == null) {
            return;
        }
        this.f110e = z3;
        H.b(viewGroup, z3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f111f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f111f) {
            C0024b c0024b = I.f105a;
            this.f106a.setTransitionVisibility(this.f107b);
            ViewGroup viewGroup = this.f108c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            C0024b c0024b = I.f105a;
            this.f106a.setTransitionVisibility(0);
            ViewGroup viewGroup = this.f108c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        if (!this.f111f) {
            C0024b c0024b = I.f105a;
            this.f106a.setTransitionVisibility(this.f107b);
            ViewGroup viewGroup = this.f108c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
