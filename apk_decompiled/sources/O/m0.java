package O;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j0.C0399a;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 extends q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f1270e = new PathInterpolator(BitmapDescriptorFactory.HUE_RED, 1.1f, BitmapDescriptorFactory.HUE_RED, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C0399a f1271f = new C0399a(0);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f1272g = new DecelerateInterpolator();

    public static void e(View view) {
        C0060d j4 = j(view);
        if (j4 != null) {
            ((View) j4.f1239e).setTranslationY(BitmapDescriptorFactory.HUE_RED);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z3) {
        C0060d j4 = j(view);
        if (j4 != null) {
            j4.f1236b = windowInsets;
            if (!z3) {
                View view2 = (View) j4.f1239e;
                int[] iArr = (int[]) j4.f1240f;
                view2.getLocationOnScreen(iArr);
                z3 = true;
                j4.f1237c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z3);
            }
        }
    }

    public static void g(View view, D0 d02, List list) {
        C0060d j4 = j(view);
        if (j4 != null) {
            j4.a(d02, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), d02, list);
            }
        }
    }

    public static void h(View view, F.i iVar) {
        C0060d j4 = j(view);
        if (j4 != null) {
            View view2 = (View) j4.f1239e;
            int[] iArr = (int[]) j4.f1240f;
            view2.getLocationOnScreen(iArr);
            int i = j4.f1237c - iArr[1];
            j4.f1238d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                h(viewGroup.getChildAt(i4), iVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C0060d j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof l0) {
            return ((l0) tag).f1265a;
        }
        return null;
    }
}
