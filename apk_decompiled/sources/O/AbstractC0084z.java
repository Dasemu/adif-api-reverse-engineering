package O;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* renamed from: O.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0084z {
    public static PointerIcon a(Bitmap bitmap, float f2, float f4) {
        return PointerIcon.create(bitmap, f2, f4);
    }

    public static PointerIcon b(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    public static PointerIcon c(Resources resources, int i) {
        return PointerIcon.load(resources, i);
    }
}
