package B0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: B0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029g extends AnimatorListenerAdapter implements v {

    /* renamed from: a, reason: collision with root package name */
    public final View f138a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f139b = false;

    public C0029g(View view) {
        this.f138a = view;
    }

    @Override // B0.v
    public final void a(x xVar) {
    }

    @Override // B0.v
    public final void b() {
        float f2;
        View view = this.f138a;
        if (view.getVisibility() == 0) {
            C0024b c0024b = I.f105a;
            f2 = view.getTransitionAlpha();
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f2));
    }

    @Override // B0.v
    public final void c(x xVar) {
    }

    @Override // B0.v
    public final void d() {
        this.f138a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // B0.v
    public final void e(x xVar) {
    }

    @Override // B0.v
    public final void f(x xVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C0024b c0024b = I.f105a;
        this.f138a.setTransitionAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f138a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f139b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        boolean z4 = this.f139b;
        View view = this.f138a;
        if (z4) {
            view.setLayerType(0, null);
        }
        if (z3) {
            return;
        }
        C0024b c0024b = I.f105a;
        view.setTransitionAlpha(1.0f);
    }
}
