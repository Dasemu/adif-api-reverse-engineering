package G2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes3.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f576c;

    public /* synthetic */ a(k kVar, int i, int i4) {
        this.f574a = i4;
        this.f576c = kVar;
        this.f575b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f574a) {
            case 0:
                this.f576c.b(this.f575b);
                return;
            default:
                this.f576c.b(this.f575b);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f574a) {
            case 1:
                k kVar = this.f576c;
                SnackbarContentLayout snackbarContentLayout = kVar.f609j;
                snackbarContentLayout.f5754a.setAlpha(1.0f);
                ViewPropertyAnimator alpha = snackbarContentLayout.f5754a.animate().alpha(BitmapDescriptorFactory.HUE_RED);
                long j4 = kVar.f603b;
                ViewPropertyAnimator duration = alpha.setDuration(j4);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f5756c;
                long j5 = 0;
                duration.setInterpolator(timeInterpolator).setStartDelay(j5).start();
                if (snackbarContentLayout.f5755b.getVisibility() == 0) {
                    snackbarContentLayout.f5755b.setAlpha(1.0f);
                    snackbarContentLayout.f5755b.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j4).setInterpolator(timeInterpolator).setStartDelay(j5).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
