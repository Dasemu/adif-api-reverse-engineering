package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class A extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3459a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f3460b;

    public A(C c4) {
        this.f3460b = c4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3459a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3459a) {
            this.f3459a = false;
            return;
        }
        C c4 = this.f3460b;
        if (((Float) c4.f3490z.getAnimatedValue()).floatValue() == BitmapDescriptorFactory.HUE_RED) {
            c4.f3466A = 0;
            c4.f(0);
        } else {
            c4.f3466A = 2;
            c4.f3483s.invalidate();
        }
    }
}
