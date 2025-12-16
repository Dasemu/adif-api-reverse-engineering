package com.google.android.material.transformation;

import A.b;
import O.X;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends b {
    public ExpandableBehavior() {
    }

    @Override // A.b
    public abstract void f(View view);

    @Override // A.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // A.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = X.f1226a;
        if (!view.isLaidOut()) {
            ArrayList j4 = coordinatorLayout.j(view);
            int size = j4.size();
            for (int i4 = 0; i4 < size; i4++) {
                f(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
