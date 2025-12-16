package O;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class M {
    public static D0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        D0 f2 = D0.f(null, rootWindowInsets);
        B0 b02 = f2.f1207a;
        b02.p(f2);
        b02.d(view.getRootView());
        return f2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i4) {
        view.setScrollIndicators(i, i4);
    }
}
