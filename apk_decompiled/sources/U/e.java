package U;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public abstract class e {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f2, float f4) {
        try {
            return edgeEffect.onPullDistance(f2, f4);
        } catch (Throwable unused) {
            edgeEffect.onPull(f2, f4);
            return BitmapDescriptorFactory.HUE_RED;
        }
    }
}
