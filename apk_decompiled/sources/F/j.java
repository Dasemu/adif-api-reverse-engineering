package F;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class j {
    public static Drawable a(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static Drawable b(Resources resources, int i, int i4, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i4, theme);
    }
}
