package com.google.android.material.appbar;

import A.b;
import A.e;
import O.X;
import a.AbstractC0106b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.AbstractC0379a;
import j2.AbstractC0403a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0403a {

    /* renamed from: b, reason: collision with root package name */
    public final int f5516b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void w(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // A.b
    public final void f(View view) {
    }

    @Override // A.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = ((e) view2.getLayoutParams()).f9a;
        if (bVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) bVar).getClass();
            int i = this.f5516b;
            int d4 = bottom - (i == 0 ? 0 : AbstractC0106b.d((int) (BitmapDescriptorFactory.HUE_RED * i), 0, i));
            WeakHashMap weakHashMap = X.f1226a;
            view.offsetTopAndBottom(d4);
        }
        return false;
    }

    @Override // A.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        int i6 = view.getLayoutParams().height;
        if (i6 != -1 && i6 != -2) {
            return false;
        }
        w(coordinatorLayout.j(view));
        return false;
    }

    @Override // A.b
    public final void p(CoordinatorLayout coordinatorLayout, View view) {
        w(coordinatorLayout.j(view));
    }

    @Override // j2.AbstractC0403a
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        w(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0379a.f6776y);
        this.f5516b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
