package G2;

import android.animation.ValueAnimator;
import j0.C0399a;

/* loaded from: classes3.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f578b;

    public /* synthetic */ b(k kVar, int i, byte b4) {
        this.f577a = i;
        this.f578b = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        k kVar = this.f578b;
        switch (this.f577a) {
            case 0:
                kVar.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.i.setScaleX(floatValue);
                kVar.i.setScaleY(floatValue);
                return;
            case 2:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C0399a c0399a = k.f597v;
                kVar.i.setTranslationY(intValue);
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C0399a c0399a2 = k.f597v;
                kVar.i.setTranslationY(intValue2);
                return;
        }
    }

    public b(k kVar, int i) {
        this.f577a = 2;
        this.f578b = kVar;
    }
}
