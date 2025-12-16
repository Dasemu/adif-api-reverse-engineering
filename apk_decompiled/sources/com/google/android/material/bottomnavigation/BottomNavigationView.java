package com.google.android.material.bottomnavigation;

import R0.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.adif.elcanomovil.R;
import f0.C0338b;
import h2.AbstractC0379a;
import n2.b;
import n2.c;
import n2.d;
import x2.m;
import z2.AbstractC0681k;

/* loaded from: classes3.dex */
public class BottomNavigationView extends AbstractC0681k {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h i = m.i(getContext(), attributeSet, AbstractC0379a.f6756b, R.attr.bottomNavigationStyle, 2132018084, new int[0]);
        TypedArray typedArray = (TypedArray) i.f1414b;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        i.n();
        m.d(this, new C0338b(8));
    }

    @Override // z2.AbstractC0681k
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i4) != 1073741824 && suggestedMinimumHeight > 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i4);
    }

    public void setItemHorizontalTranslationEnabled(boolean z3) {
        b bVar = (b) getMenuView();
        if (bVar.f7865L != z3) {
            bVar.setItemHorizontalTranslationEnabled(z3);
            getPresenter().h(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(d dVar) {
        setOnItemSelectedListener(dVar);
    }
}
