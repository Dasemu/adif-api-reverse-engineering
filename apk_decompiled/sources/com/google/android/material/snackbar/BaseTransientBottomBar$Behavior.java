package com.google.android.material.snackbar;

import A.a;
import A.j;
import G2.g;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final a i;

    public BaseTransientBottomBar$Behavior() {
        a aVar = new a(4, false);
        this.f5535f = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 0.1f), 1.0f);
        this.f5536g = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 0.6f), 1.0f);
        this.f5534e = 0;
        this.i = aVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, A.b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        a aVar = this.i;
        aVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                j.h().n((g) aVar.f7b);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            j.h().m((g) aVar.f7b);
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean v(View view) {
        this.i.getClass();
        return view instanceof G2.j;
    }
}
