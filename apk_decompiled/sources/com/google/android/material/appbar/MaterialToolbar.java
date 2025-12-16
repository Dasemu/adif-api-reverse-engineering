package com.google.android.material.appbar;

import A.i;
import E2.g;
import K2.a;
import O.L;
import O.X;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.adif.elcanomovil.R;
import h2.AbstractC0379a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import m3.d;
import m3.l;
import x2.m;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: c0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f5517c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: U, reason: collision with root package name */
    public Integer f5518U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f5519V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f5520W;

    /* renamed from: a0, reason: collision with root package name */
    public ImageView.ScaleType f5521a0;

    /* renamed from: b0, reason: collision with root package name */
    public Boolean f5522b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2132018386), attributeSet, 0);
        Context context2 = getContext();
        TypedArray h = m.h(context2, attributeSet, AbstractC0379a.f6772u, R.attr.toolbarStyle, 2132018386, new int[0]);
        if (h.hasValue(2)) {
            setNavigationIconTint(h.getColor(2, -1));
        }
        this.f5519V = h.getBoolean(4, false);
        this.f5520W = h.getBoolean(3, false);
        int i = h.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f5517c0;
            if (i < scaleTypeArr.length) {
                this.f5521a0 = scaleTypeArr[i];
            }
        }
        if (h.hasValue(0)) {
            this.f5522b0 = Boolean.valueOf(h.getBoolean(0, false));
        }
        h.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : l.p(background);
        if (valueOf != null) {
            g gVar = new g();
            gVar.j(valueOf);
            gVar.h(context2);
            WeakHashMap weakHashMap = X.f1226a;
            gVar.i(L.i(this));
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f5521a0;
    }

    public Integer getNavigationIconTint() {
        return this.f5518U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z3 = menu instanceof l.m;
        if (z3) {
            ((l.m) menu).w();
        }
        super.m(i);
        if (z3) {
            ((l.m) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            d.H(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z3, i, i4, i5, i6);
        int i7 = 0;
        ImageView imageView2 = null;
        if (this.f5519V || this.f5520W) {
            ArrayList f2 = m.f(this, getTitle());
            boolean isEmpty = f2.isEmpty();
            i iVar = m.f8967c;
            TextView textView = isEmpty ? null : (TextView) Collections.min(f2, iVar);
            ArrayList f4 = m.f(this, getSubtitle());
            TextView textView2 = f4.isEmpty() ? null : (TextView) Collections.max(f4, iVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i8 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i8 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i8 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f5519V && textView != null) {
                    x(textView, pair);
                }
                if (this.f5520W && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i7 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i7++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f5522b0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f5521a0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f2);
        }
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.f5522b0;
        if (bool == null || bool.booleanValue() != z3) {
            this.f5522b0 = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f5521a0 != scaleType) {
            this.f5521a0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f5518U != null) {
            drawable = drawable.mutate();
            H.a.g(drawable, this.f5518U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f5518U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.f5520W != z3) {
            this.f5520W = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.f5519V != z3) {
            this.f5519V = z3;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i4 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i4 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i4 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i4 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i4, textView.getBottom());
    }
}
