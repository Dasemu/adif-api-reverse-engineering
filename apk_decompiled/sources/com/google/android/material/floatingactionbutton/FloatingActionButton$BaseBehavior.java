package com.google.android.material.floatingactionbutton;

import A.b;
import A.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h2.AbstractC0379a;

/* loaded from: classes3.dex */
public class FloatingActionButton$BaseBehavior<T> extends b {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // A.b
    public final boolean e(View view) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final void g(e eVar) {
        if (eVar.h == 0) {
            eVar.h = 80;
        }
    }

    @Override // A.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0379a.i);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
