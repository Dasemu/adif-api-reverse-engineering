package j0;

import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0400b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f6903a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6904b;

    public AbstractInterpolatorC0400b(float[] fArr) {
        this.f6903a = fArr;
        this.f6904b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr = this.f6903a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f4 = this.f6904b;
        float f5 = (f2 - (min * f4)) / f4;
        float f6 = fArr[min];
        return com.google.android.gms.measurement.internal.a.a(fArr[min + 1], f6, f5, f6);
    }
}
