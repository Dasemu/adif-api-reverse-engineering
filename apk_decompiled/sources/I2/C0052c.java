package I2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: I2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0052c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0053d f805b;

    public /* synthetic */ C0052c(C0053d c0053d, int i) {
        this.f804a = i;
        this.f805b = c0053d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f804a) {
            case 1:
                this.f805b.f863b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f804a) {
            case 0:
                this.f805b.f863b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
