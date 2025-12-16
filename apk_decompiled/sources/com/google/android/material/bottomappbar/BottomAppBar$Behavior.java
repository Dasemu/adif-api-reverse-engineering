package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import m2.ViewOnLayoutChangeListenerC0506a;

/* loaded from: classes3.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<Object> {
    public BottomAppBar$Behavior() {
        new ViewOnLayoutChangeListenerC0506a(this, 0);
        new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, A.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, A.b
    public final boolean s(View view, int i, int i4) {
        throw new ClassCastException();
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ViewOnLayoutChangeListenerC0506a(this, 0);
        new Rect();
    }
}
