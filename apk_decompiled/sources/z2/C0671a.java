package z2;

import android.animation.ValueAnimator;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0671a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f9016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0673c f9017b;

    public C0671a(AbstractC0673c abstractC0673c, float f2) {
        this.f9017b = abstractC0673c;
        this.f9016a = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9017b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f9016a);
    }
}
