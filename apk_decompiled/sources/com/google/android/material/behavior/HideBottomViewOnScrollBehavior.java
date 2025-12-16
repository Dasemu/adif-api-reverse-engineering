package com.google.android.material.behavior;

import A.b;
import B0.q;
import C.w;
import a.AbstractC0106b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.adif.elcanomovil.R;
import i2.AbstractC0396a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: b, reason: collision with root package name */
    public int f5524b;

    /* renamed from: c, reason: collision with root package name */
    public int f5525c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f5526d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f5527e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f5523a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f5528f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f5529g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // A.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f5528f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f5524b = AbstractC0106b.E(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f5525c = AbstractC0106b.E(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f5526d = AbstractC0106b.F(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0396a.f6818d);
        this.f5527e = AbstractC0106b.F(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0396a.f6817c);
        return false;
    }

    @Override // A.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f5523a;
        if (i > 0) {
            if (this.f5529g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f5529g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw w.g(it);
            }
            this.h = view.animate().translationY(this.f5528f).setInterpolator(this.f5527e).setDuration(this.f5525c).setListener(new q(this, 5));
            return;
        }
        if (i >= 0 || this.f5529g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f5529g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw w.g(it2);
        }
        this.h = view.animate().translationY(0).setInterpolator(this.f5526d).setDuration(this.f5524b).setListener(new q(this, 5));
    }

    @Override // A.b
    public boolean s(View view, int i, int i4) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
