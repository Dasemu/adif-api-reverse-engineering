package O;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.adif.elcanomovil.R;

/* loaded from: classes.dex */
public abstract class L {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static D0 b(View view, D0 d02, Rect rect) {
        WindowInsets e4 = d02.e();
        if (e4 != null) {
            return D0.f(view, view.computeSystemWindowInsets(e4, rect));
        }
        rect.setEmpty();
        return d02;
    }

    public static boolean c(View view, float f2, float f4, boolean z3) {
        return view.dispatchNestedFling(f2, f4, z3);
    }

    public static boolean d(View view, float f2, float f4) {
        return view.dispatchNestedPreFling(f2, f4);
    }

    public static boolean e(View view, int i, int i4, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i4, iArr, iArr2);
    }

    public static boolean f(View view, int i, int i4, int i5, int i6, int[] iArr) {
        return view.dispatchNestedScroll(i, i4, i5, i6, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static D0 j(View view) {
        if (!s0.f1296d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = s0.f1293a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) s0.f1294b.get(obj);
            Rect rect2 = (Rect) s0.f1295c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            t0 u0Var = Build.VERSION.SDK_INT >= 30 ? new u0() : new t0();
            u0Var.h(G.c.b(rect.left, rect.top, rect.right, rect.bottom));
            u0Var.f(G.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            D0 b4 = u0Var.b();
            b4.f1207a.p(b4);
            b4.f1207a.d(view.getRootView());
            return b4;
        } catch (IllegalAccessException e4) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f2) {
        view.setElevation(f2);
    }

    public static void t(View view, boolean z3) {
        view.setNestedScrollingEnabled(z3);
    }

    public static void u(View view, InterfaceC0080v interfaceC0080v) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0080v);
        }
        if (interfaceC0080v == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new K(view, interfaceC0080v));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f2) {
        view.setTranslationZ(f2);
    }

    public static void x(View view, float f2) {
        view.setZ(f2);
    }

    public static boolean y(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
