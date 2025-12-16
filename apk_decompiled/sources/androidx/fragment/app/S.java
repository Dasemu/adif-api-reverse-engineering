package androidx.fragment.app;

import O.ViewTreeObserverOnPreDrawListenerC0083y;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class S extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f3068a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3069b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3070c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3071d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3072e;

    public S(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f3072e = true;
        this.f3068a = viewGroup;
        this.f3069b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation) {
        this.f3072e = true;
        if (this.f3070c) {
            return !this.f3071d;
        }
        if (!super.getTransformation(j4, transformation)) {
            this.f3070c = true;
            ViewTreeObserverOnPreDrawListenerC0083y.a(this.f3068a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = this.f3070c;
        ViewGroup viewGroup = this.f3068a;
        if (z3 || !this.f3072e) {
            viewGroup.endViewTransition(this.f3069b);
            this.f3071d = true;
        } else {
            this.f3072e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation, float f2) {
        this.f3072e = true;
        if (this.f3070c) {
            return !this.f3071d;
        }
        if (!super.getTransformation(j4, transformation, f2)) {
            this.f3070c = true;
            ViewTreeObserverOnPreDrawListenerC0083y.a(this.f3068a, this);
        }
        return true;
    }
}
