package androidx.appcompat.widget;

import O.S;
import O.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.adif.elcanomovil.R;
import f.AbstractC0336a;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2435a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2436b;

    /* renamed from: c, reason: collision with root package name */
    public int f2437c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2437c = -1;
        int[] iArr = AbstractC0336a.f6430k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        WeakHashMap weakHashMap = X.f1226a;
        S.d(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f2435a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f2435a);
        }
    }

    private void setStacked(boolean z3) {
        if (this.f2436b != z3) {
            if (!z3 || this.f2435a) {
                this.f2436b = z3;
                setOrientation(z3 ? 1 : 0);
                setGravity(z3 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z3 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        boolean z3;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int i7 = 0;
        if (this.f2435a) {
            if (size > this.f2437c && this.f2436b) {
                setStacked(false);
            }
            this.f2437c = size;
        }
        if (this.f2436b || View.MeasureSpec.getMode(i) != 1073741824) {
            i5 = i;
            z3 = false;
        } else {
            i5 = View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE);
            z3 = true;
        }
        super.onMeasure(i5, i4);
        if (this.f2435a && !this.f2436b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z3 = true;
        }
        if (z3) {
            super.onMeasure(i, i4);
        }
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            i6 = -1;
            if (i8 >= childCount) {
                i8 = -1;
                break;
            } else if (getChildAt(i8).getVisibility() == 0) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            View childAt = getChildAt(i8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f2436b) {
                int i9 = i8 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i9 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i9).getVisibility() == 0) {
                        i6 = i9;
                        break;
                    }
                    i9++;
                }
                i7 = i6 >= 0 ? getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i7 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = X.f1226a;
        if (getMinimumHeight() != i7) {
            setMinimumHeight(i7);
            if (i4 == 0) {
                super.onMeasure(i, i4);
            }
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f2435a != z3) {
            this.f2435a = z3;
            if (!z3 && this.f2436b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
