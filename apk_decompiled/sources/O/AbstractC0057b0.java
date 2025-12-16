package O;

import android.view.ViewGroup;

/* renamed from: O.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0057b0 {
    public static int a(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static boolean b(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    public static void c(ViewGroup viewGroup, boolean z3) {
        viewGroup.setTransitionGroup(z3);
    }
}
