package G2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f580b;

    public /* synthetic */ c(k kVar, int i) {
        this.f579a = i;
        this.f580b = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f579a) {
            case 0:
                this.f580b.c();
                return;
            default:
                this.f580b.c();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f579a) {
            case 0:
                k kVar = this.f580b;
                SnackbarContentLayout snackbarContentLayout = kVar.f609j;
                int i = kVar.f604c;
                int i4 = kVar.f602a;
                int i5 = i - i4;
                snackbarContentLayout.f5754a.setAlpha(BitmapDescriptorFactory.HUE_RED);
                long j4 = i4;
                ViewPropertyAnimator duration = snackbarContentLayout.f5754a.animate().alpha(1.0f).setDuration(j4);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f5756c;
                long j5 = i5;
                duration.setInterpolator(timeInterpolator).setStartDelay(j5).start();
                if (snackbarContentLayout.f5755b.getVisibility() == 0) {
                    snackbarContentLayout.f5755b.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    snackbarContentLayout.f5755b.animate().alpha(1.0f).setDuration(j4).setInterpolator(timeInterpolator).setStartDelay(j5).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
