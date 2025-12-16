package H2;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes3.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f700c;

    public f(g gVar, View view, View view2) {
        this.f700c = gVar;
        this.f698a = view;
        this.f699b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f700c.c(this.f698a, this.f699b, valueAnimator.getAnimatedFraction());
    }
}
