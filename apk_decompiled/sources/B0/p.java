package B0;

import O.m0;
import O.r0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f156c;

    public p(r0 r0Var, View view) {
        this.f155b = r0Var;
        this.f156c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f154a) {
            case 0:
                ((s.e) this.f155b).remove(animator);
                ((x) this.f156c).f194n.remove(animator);
                return;
            default:
                ((r0) this.f155b).f1292a.d(1.0f);
                m0.e((View) this.f156c);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f154a) {
            case 0:
                ((x) this.f156c).f194n.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public p(x xVar, s.e eVar) {
        this.f156c = xVar;
        this.f155b = eVar;
    }
}
