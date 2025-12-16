package n2;

import O.X;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.adif.elcanomovil.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import l.m;
import z2.AbstractC0675e;

/* loaded from: classes3.dex */
public final class b extends AbstractC0675e {

    /* renamed from: H, reason: collision with root package name */
    public final int f7862H;

    /* renamed from: I, reason: collision with root package name */
    public final int f7863I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f7864K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f7865L;

    /* renamed from: M, reason: collision with root package name */
    public final ArrayList f7866M;

    public b(Context context) {
        super(context);
        this.f7866M = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f7862H = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f7863I = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.J = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f7864K = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int i7 = i5 - i;
        int i8 = i6 - i4;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = X.f1226a;
                if (getLayoutDirection() == 1) {
                    int i11 = i7 - i9;
                    childAt.layout(i11 - childAt.getMeasuredWidth(), 0, i11, i8);
                } else {
                    childAt.layout(i9, 0, childAt.getMeasuredWidth() + i9, i8);
                }
                i9 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        int i6;
        m menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f7866M;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i4);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        boolean z3 = labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3;
        int i7 = this.J;
        if (z3 && this.f7865L) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i8 = this.f7864K;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7, IntCompanionObject.MIN_VALUE), makeMeasureSpec);
                i8 = Math.max(i8, childAt.getMeasuredWidth());
            }
            int i9 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f7863I * i9), Math.min(i8, i7));
            int i10 = size - min;
            int min2 = Math.min(i10 / (i9 != 0 ? i9 : 1), this.f7862H);
            int i11 = i10 - (i9 * min2);
            int i12 = 0;
            while (i12 < childCount) {
                if (getChildAt(i12).getVisibility() != 8) {
                    i6 = i12 == getSelectedItemPosition() ? min : min2;
                    if (i11 > 0) {
                        i6++;
                        i11--;
                    }
                } else {
                    i6 = 0;
                }
                arrayList.add(Integer.valueOf(i6));
                i12++;
            }
        } else {
            int min3 = Math.min(size / (size2 != 0 ? size2 : 1), i7);
            int i13 = size - (size2 * min3);
            for (int i14 = 0; i14 < childCount; i14++) {
                if (getChildAt(i14).getVisibility() == 8) {
                    i5 = 0;
                } else if (i13 > 0) {
                    i5 = min3 + 1;
                    i13--;
                } else {
                    i5 = min3;
                }
                arrayList.add(Integer.valueOf(i5));
            }
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i16)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i15 = childAt2.getMeasuredWidth() + i15;
            }
        }
        setMeasuredDimension(i15, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z3) {
        this.f7865L = z3;
    }
}
