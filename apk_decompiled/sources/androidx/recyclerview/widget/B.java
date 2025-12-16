package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class B implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3462b;

    public /* synthetic */ B(Object obj, int i) {
        this.f3461a = i;
        this.f3462b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3461a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C c4 = (C) this.f3462b;
                c4.f3470c.setAlpha(floatValue);
                c4.f3471d.setAlpha(floatValue);
                c4.f3483s.invalidate();
                return;
            default:
                ((H) this.f3462b).f3541m = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
