package com.facebook.shimmer;

import R1.a;
import R1.b;
import R1.c;
import R1.d;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f5504a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5505b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5506c;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f5504a = new Paint();
        d dVar = new d();
        this.f5505b = dVar;
        this.f5506c = true;
        setWillNotDraw(false);
        dVar.setCallback(this);
        if (attributeSet == null) {
            a(new b(0).b());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1416a, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                bVar = new b(1);
                ((c) bVar.f267a).p = false;
            } else {
                bVar = new b(0);
            }
            a(bVar.c(obtainStyledAttributes).b());
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(c cVar) {
        boolean z3;
        d dVar = this.f5505b;
        dVar.f1440f = cVar;
        if (cVar != null) {
            dVar.f1436b.setXfermode(new PorterDuffXfermode(dVar.f1440f.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        dVar.b();
        if (dVar.f1440f != null) {
            ValueAnimator valueAnimator = dVar.f1439e;
            if (valueAnimator != null) {
                z3 = valueAnimator.isStarted();
                dVar.f1439e.cancel();
                dVar.f1439e.removeAllUpdateListeners();
            } else {
                z3 = false;
            }
            c cVar2 = dVar.f1440f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, ((float) (cVar2.f1434t / cVar2.f1433s)) + 1.0f);
            dVar.f1439e = ofFloat;
            ofFloat.setRepeatMode(dVar.f1440f.f1432r);
            dVar.f1439e.setRepeatCount(dVar.f1440f.f1431q);
            ValueAnimator valueAnimator2 = dVar.f1439e;
            c cVar3 = dVar.f1440f;
            valueAnimator2.setDuration(cVar3.f1433s + cVar3.f1434t);
            dVar.f1439e.addUpdateListener(dVar.f1435a);
            if (z3) {
                dVar.f1439e.start();
            }
        }
        dVar.invalidateSelf();
        if (cVar == null || !cVar.f1429n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f5504a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f5506c) {
            this.f5505b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5505b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d dVar = this.f5505b;
        ValueAnimator valueAnimator = dVar.f1439e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        dVar.f1439e.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        this.f5505b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5505b;
    }
}
