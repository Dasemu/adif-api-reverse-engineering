package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class H implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f3531a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3532b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3533c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3534d;

    /* renamed from: e, reason: collision with root package name */
    public final I0 f3535e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3536f;

    /* renamed from: g, reason: collision with root package name */
    public final ValueAnimator f3537g;
    public boolean h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3538j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3539k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3540l = false;

    /* renamed from: m, reason: collision with root package name */
    public float f3541m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3542n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I0 f3543o;
    public final /* synthetic */ N p;

    public H(N n4, I0 i02, int i, float f2, float f4, float f5, float f6, int i4, I0 i03) {
        this.p = n4;
        this.f3542n = i4;
        this.f3543o = i03;
        this.f3536f = i;
        this.f3535e = i02;
        this.f3531a = f2;
        this.f3532b = f4;
        this.f3533c = f5;
        this.f3534d = f6;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f3537g = ofFloat;
        ofFloat.addUpdateListener(new B(this, 1));
        ofFloat.setTarget(i02.itemView);
        ofFloat.addListener(this);
        this.f3541m = BitmapDescriptorFactory.HUE_RED;
    }

    public final void a(Animator animator) {
        if (!this.f3540l) {
            this.f3535e.setIsRecyclable(true);
        }
        this.f3540l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3541m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.f3539k) {
            return;
        }
        int i = this.f3542n;
        I0 i02 = this.f3543o;
        N n4 = this.p;
        if (i <= 0) {
            n4.f3597m.clearView(n4.f3601r, i02);
        } else {
            n4.f3587a.add(i02.itemView);
            this.h = true;
            if (i > 0) {
                n4.f3601r.post(new I(n4, i, 0, this));
            }
        }
        View view = n4.f3606w;
        View view2 = i02.itemView;
        if (view == view2) {
            n4.k(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
