package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.adif.elcanomovil.R;
import f.AbstractC0336a;
import kotlin.jvm.internal.IntCompanionObject;
import m.C0452b;
import m.H0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2360a;

    /* renamed from: b, reason: collision with root package name */
    public View f2361b;

    /* renamed from: c, reason: collision with root package name */
    public View f2362c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f2363d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2364e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2365f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2366g;
    public boolean h;
    public final int i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0452b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0336a.f6422a);
        boolean z3 = false;
        this.f2363d = obtainStyledAttributes.getDrawable(0);
        this.f2364e = obtainStyledAttributes.getDrawable(2);
        this.i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f2366g = true;
            this.f2365f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f2366g ? !(this.f2363d != null || this.f2364e != null) : this.f2365f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2363d;
        if (drawable != null && drawable.isStateful()) {
            this.f2363d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2364e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2364e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2365f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2365f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2363d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2364e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2365f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2361b = findViewById(R.id.action_bar);
        this.f2362c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2360a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        boolean z4 = true;
        if (this.f2366g) {
            Drawable drawable = this.f2365f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.f2363d == null) {
                z4 = false;
            } else if (this.f2361b.getVisibility() == 0) {
                this.f2363d.setBounds(this.f2361b.getLeft(), this.f2361b.getTop(), this.f2361b.getRight(), this.f2361b.getBottom());
            } else {
                View view = this.f2362c;
                if (view == null || view.getVisibility() != 0) {
                    this.f2363d.setBounds(0, 0, 0, 0);
                } else {
                    this.f2363d.setBounds(this.f2362c.getLeft(), this.f2362c.getTop(), this.f2362c.getRight(), this.f2362c.getBottom());
                }
            }
            this.h = false;
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        if (this.f2361b == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.i) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), IntCompanionObject.MIN_VALUE);
        }
        super.onMeasure(i, i4);
        if (this.f2361b == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2363d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2363d);
        }
        this.f2363d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2361b;
            if (view != null) {
                this.f2363d.setBounds(view.getLeft(), this.f2361b.getTop(), this.f2361b.getRight(), this.f2361b.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f2366g ? !(this.f2363d != null || this.f2364e != null) : this.f2365f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2365f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2365f);
        }
        this.f2365f = drawable;
        boolean z3 = this.f2366g;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f2365f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f2363d != null || this.f2364e != null) : this.f2365f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f2364e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2364e);
        }
        this.f2364e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.h && this.f2364e != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f2366g ? !(this.f2363d != null || this.f2364e != null) : this.f2365f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(H0 h02) {
    }

    public void setTransitioning(boolean z3) {
        this.f2360a = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z3 = i == 0;
        Drawable drawable = this.f2363d;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f2364e;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f2365f;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2363d;
        boolean z3 = this.f2366g;
        if (drawable == drawable2 && !z3) {
            return true;
        }
        if (drawable == this.f2364e && this.h) {
            return true;
        }
        return (drawable == this.f2365f && z3) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
