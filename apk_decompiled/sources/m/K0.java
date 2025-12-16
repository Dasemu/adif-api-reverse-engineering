package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import f.AbstractC0336a;

/* loaded from: classes.dex */
public abstract class K0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f7581a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f7582b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f7583c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f7584d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f7585e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f7586f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f7587g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0336a.f6429j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList d4 = d(context, i);
        if (d4 != null && d4.isStateful()) {
            return d4.getColorForState(f7582b, d4.getDefaultColor());
        }
        ThreadLocal threadLocal = f7581a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return G.a.d(c(context, i), Math.round(Color.alpha(r4) * f2));
    }

    public static int c(Context context, int i) {
        int[] iArr = f7587g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f7587g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = D.h.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
