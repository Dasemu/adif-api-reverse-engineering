package I2;

import android.animation.ValueAnimator;
import android.view.View;
import g.T;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f817a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f818b;

    public /* synthetic */ h(A.a aVar, View view) {
        this.f818b = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f817a) {
            case 0:
                l lVar = (l) this.f818b;
                lVar.getClass();
                lVar.f865d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((View) ((T) ((A.a) this.f818b).f7b).f6581d.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ h(l lVar) {
        this.f818b = lVar;
    }
}
