package r;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f8202a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f2, float f4, boolean z3) {
        if (!z3) {
            return f2;
        }
        return (float) (((1.0d - f8202a) * f4) + f2);
    }

    public static float b(float f2, float f4, boolean z3) {
        if (!z3) {
            return f2 * 1.5f;
        }
        return (float) (((1.0d - f8202a) * f4) + (f2 * 1.5f));
    }
}
