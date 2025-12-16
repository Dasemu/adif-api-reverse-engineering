package j2;

import A.b;
import O.X;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0403a extends b {

    /* renamed from: a, reason: collision with root package name */
    public l f6942a;

    @Override // A.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        v(coordinatorLayout, view, i);
        if (this.f6942a == null) {
            this.f6942a = new l(view);
        }
        l lVar = this.f6942a;
        View view2 = (View) lVar.f5667a;
        lVar.f5668b = view2.getTop();
        lVar.f5669c = view2.getLeft();
        l lVar2 = this.f6942a;
        View view3 = (View) lVar2.f5667a;
        int top = 0 - (view3.getTop() - lVar2.f5668b);
        WeakHashMap weakHashMap = X.f1226a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f5669c));
        return true;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
