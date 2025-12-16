package B0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class H {
    public static int a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void b(ViewGroup viewGroup, boolean z3) {
        viewGroup.suppressLayout(z3);
    }
}
