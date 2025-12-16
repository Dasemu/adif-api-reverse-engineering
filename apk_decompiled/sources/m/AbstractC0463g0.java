package m;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: m.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0463g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7662a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f7663b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f7664c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f7662a);
        } else {
            drawable.setState(f7663b);
        }
        drawable.setState(state);
    }

    public static Rect b(Drawable drawable) {
        Insets a2 = AbstractC0461f0.a(drawable);
        return new Rect(a2.left, a2.top, a2.right, a2.bottom);
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
