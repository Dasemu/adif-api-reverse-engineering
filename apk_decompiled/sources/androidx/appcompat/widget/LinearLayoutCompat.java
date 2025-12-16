package androidx.appcompat.widget;

import O.S;
import O.X;
import R0.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f.AbstractC0336a;
import java.util.WeakHashMap;
import m.C0483q0;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2445a;

    /* renamed from: b, reason: collision with root package name */
    public int f2446b;

    /* renamed from: c, reason: collision with root package name */
    public int f2447c;

    /* renamed from: d, reason: collision with root package name */
    public int f2448d;

    /* renamed from: e, reason: collision with root package name */
    public int f2449e;

    /* renamed from: f, reason: collision with root package name */
    public int f2450f;

    /* renamed from: g, reason: collision with root package name */
    public float f2451g;
    public boolean h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f2452j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f2453k;

    /* renamed from: l, reason: collision with root package name */
    public int f2454l;

    /* renamed from: m, reason: collision with root package name */
    public int f2455m;

    /* renamed from: n, reason: collision with root package name */
    public int f2456n;

    /* renamed from: o, reason: collision with root package name */
    public int f2457o;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0483q0;
    }

    public final void d(Canvas canvas, int i) {
        this.f2453k.setBounds(getPaddingLeft() + this.f2457o, i, (getWidth() - getPaddingRight()) - this.f2457o, this.f2455m + i);
        this.f2453k.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.f2453k.setBounds(i, getPaddingTop() + this.f2457o, this.f2454l + i, (getHeight() - getPaddingBottom()) - this.f2457o);
        this.f2453k.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [m.q0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r2v4, types: [m.q0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0483q0 generateDefaultLayoutParams() {
        int i = this.f2448d;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.q0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0483q0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f2446b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f2446b;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2446b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i5 = this.f2447c;
        if (this.f2448d == 1 && (i = this.f2449e & 112) != 48) {
            if (i == 16) {
                i5 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2450f) / 2;
            } else if (i == 80) {
                i5 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2450f;
            }
        }
        return i5 + ((LinearLayout.LayoutParams) ((C0483q0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2446b;
    }

    public Drawable getDividerDrawable() {
        return this.f2453k;
    }

    public int getDividerPadding() {
        return this.f2457o;
    }

    public int getDividerWidth() {
        return this.f2454l;
    }

    public int getGravity() {
        return this.f2449e;
    }

    public int getOrientation() {
        return this.f2448d;
    }

    public int getShowDividers() {
        return this.f2456n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2451g;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [m.q0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [m.q0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v5, types: [m.q0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0483q0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0483q0 ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f2456n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f2456n & 4) != 0;
        }
        if ((this.f2456n & 2) != 0) {
            for (int i4 = i - 1; i4 >= 0; i4--) {
                if (getChildAt(i4).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f2453k == null) {
            return;
        }
        int i4 = 0;
        if (this.f2448d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && i(i4)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0483q0) childAt.getLayoutParams())).topMargin) - this.f2455m);
                }
                i4++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2455m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0483q0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z3 = getLayoutDirection() == 1;
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i4)) {
                C0483q0 c0483q0 = (C0483q0) childAt3.getLayoutParams();
                e(canvas, z3 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0483q0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0483q0).leftMargin) - this.f2454l);
            }
            i4++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0483q0 c0483q02 = (C0483q0) childAt4.getLayoutParams();
                if (z3) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0483q02).leftMargin;
                    i = this.f2454l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0483q02).rightMargin;
                }
            } else if (z3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f2454l;
                right = left - i;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z3) {
        this.f2445a = z3;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f2446b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2453k) {
            return;
        }
        this.f2453k = drawable;
        if (drawable != null) {
            this.f2454l = drawable.getIntrinsicWidth();
            this.f2455m = drawable.getIntrinsicHeight();
        } else {
            this.f2454l = 0;
            this.f2455m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f2457o = i;
    }

    public void setGravity(int i) {
        if (this.f2449e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2449e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i4 = i & 8388615;
        int i5 = this.f2449e;
        if ((8388615 & i5) != i4) {
            this.f2449e = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.h = z3;
    }

    public void setOrientation(int i) {
        if (this.f2448d != i) {
            this.f2448d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f2456n) {
            requestLayout();
        }
        this.f2456n = i;
    }

    public void setVerticalGravity(int i) {
        int i4 = i & 112;
        int i5 = this.f2449e;
        if ((i5 & 112) != i4) {
            this.f2449e = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f2451g = Math.max(BitmapDescriptorFactory.HUE_RED, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f2445a = true;
        this.f2446b = -1;
        this.f2447c = 0;
        this.f2449e = 8388659;
        int[] iArr = AbstractC0336a.f6433n;
        h l4 = h.l(context, attributeSet, iArr, 0);
        WeakHashMap weakHashMap = X.f1226a;
        S.d(this, context, iArr, attributeSet, (TypedArray) l4.f1414b, 0, 0);
        TypedArray typedArray = (TypedArray) l4.f1414b;
        int i4 = typedArray.getInt(1, -1);
        if (i4 >= 0) {
            setOrientation(i4);
        }
        int i5 = typedArray.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f2451g = typedArray.getFloat(4, -1.0f);
        this.f2446b = typedArray.getInt(3, -1);
        this.h = typedArray.getBoolean(7, false);
        setDividerDrawable(l4.f(5));
        this.f2456n = typedArray.getInt(8, 0);
        this.f2457o = typedArray.getDimensionPixelSize(6, 0);
        l4.n();
    }
}
