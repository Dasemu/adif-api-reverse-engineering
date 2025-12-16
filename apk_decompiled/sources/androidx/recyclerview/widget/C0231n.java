package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.recyclerview.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0233o f3852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3853c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f3854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0237q f3855e;

    public /* synthetic */ C0231n(C0237q c0237q, C0233o c0233o, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f3851a = i;
        this.f3855e = c0237q;
        this.f3852b = c0233o;
        this.f3853c = viewPropertyAnimator;
        this.f3854d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3851a) {
            case 0:
                this.f3853c.setListener(null);
                View view = this.f3854d;
                view.setAlpha(1.0f);
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                C0233o c0233o = this.f3852b;
                I0 i02 = c0233o.f3856a;
                C0237q c0237q = this.f3855e;
                c0237q.c(i02);
                c0237q.f3882r.remove(c0233o.f3856a);
                c0237q.i();
                return;
            default:
                this.f3853c.setListener(null);
                View view2 = this.f3854d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                C0233o c0233o2 = this.f3852b;
                I0 i03 = c0233o2.f3857b;
                C0237q c0237q2 = this.f3855e;
                c0237q2.c(i03);
                c0237q2.f3882r.remove(c0233o2.f3857b);
                c0237q2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3851a) {
            case 0:
                I0 i02 = this.f3852b.f3856a;
                this.f3855e.getClass();
                return;
            default:
                I0 i03 = this.f3852b.f3857b;
                this.f3855e.getClass();
                return;
        }
    }
}
