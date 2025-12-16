package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.recyclerview.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f3839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3841c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0237q f3844f;

    public C0229m(C0237q c0237q, I0 i02, int i, View view, int i4, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3844f = c0237q;
        this.f3839a = i02;
        this.f3840b = i;
        this.f3841c = view;
        this.f3842d = i4;
        this.f3843e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f3840b;
        View view = this.f3841c;
        if (i != 0) {
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        }
        if (this.f3842d != 0) {
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3843e.setListener(null);
        C0237q c0237q = this.f3844f;
        I0 i02 = this.f3839a;
        c0237q.c(i02);
        c0237q.p.remove(i02);
        c0237q.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3844f.getClass();
    }
}
