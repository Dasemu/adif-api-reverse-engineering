package O;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class g0 {
    public static boolean a(ViewParent viewParent, View view, float f2, float f4, boolean z3) {
        return viewParent.onNestedFling(view, f2, f4, z3);
    }

    public static boolean b(ViewParent viewParent, View view, float f2, float f4) {
        return viewParent.onNestedPreFling(view, f2, f4);
    }

    public static void c(ViewParent viewParent, View view, int i, int i4, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i4, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i, int i4, int i5, int i6) {
        viewParent.onNestedScroll(view, i, i4, i5, i6);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
