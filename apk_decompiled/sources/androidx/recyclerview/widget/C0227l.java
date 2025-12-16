package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3834a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I0 f3835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3836c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0237q f3838e;

    public C0227l(C0237q c0237q, I0 i02, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3838e = c0237q;
        this.f3835b = i02;
        this.f3837d = viewPropertyAnimator;
        this.f3836c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3834a) {
            case 1:
                this.f3836c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3834a) {
            case 0:
                this.f3837d.setListener(null);
                this.f3836c.setAlpha(1.0f);
                C0237q c0237q = this.f3838e;
                I0 i02 = this.f3835b;
                c0237q.c(i02);
                c0237q.f3881q.remove(i02);
                c0237q.i();
                return;
            default:
                this.f3837d.setListener(null);
                C0237q c0237q2 = this.f3838e;
                I0 i03 = this.f3835b;
                c0237q2.c(i03);
                c0237q2.f3880o.remove(i03);
                c0237q2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3834a) {
            case 0:
                this.f3838e.getClass();
                return;
            default:
                this.f3838e.getClass();
                return;
        }
    }

    public C0227l(C0237q c0237q, I0 i02, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3838e = c0237q;
        this.f3835b = i02;
        this.f3836c = view;
        this.f3837d = viewPropertyAnimator;
    }
}
