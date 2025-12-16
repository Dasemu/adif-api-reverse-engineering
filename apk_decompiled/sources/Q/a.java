package Q;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class a {
    public static Interpolator a(float f2, float f4) {
        return new PathInterpolator(f2, f4);
    }

    public static Interpolator b(float f2, float f4, float f5, float f6) {
        return new PathInterpolator(f2, f4, f5, f6);
    }

    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
