package x2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import h2.AbstractC0379a;

/* loaded from: classes3.dex */
public abstract class d extends LinearLayoutCompat {
    public Drawable p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f8944q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f8945r;

    /* renamed from: s, reason: collision with root package name */
    public int f8946s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8947t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8948u;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8944q = new Rect();
        this.f8945r = new Rect();
        this.f8946s = 119;
        this.f8947t = true;
        this.f8948u = false;
        int[] iArr = AbstractC0379a.f6762j;
        m.a(context, attributeSet, 0, 0);
        m.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f8946s = obtainStyledAttributes.getInt(1, this.f8946s);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f8947t = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.p;
        if (drawable != null) {
            if (this.f8948u) {
                this.f8948u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z3 = this.f8947t;
                Rect rect = this.f8944q;
                if (z3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f8946s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f8945r;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f4) {
        super.drawableHotspotChanged(f2, f4);
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setHotspot(f2, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f8946s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        this.f8948u = z3 | this.f8948u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i5, int i6) {
        super.onSizeChanged(i, i4, i5, i6);
        this.f8948u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.p);
            }
            this.p = drawable;
            this.f8948u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f8946s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f8946s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f8946s = i;
            if (i == 119 && this.p != null) {
                this.p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }
}
