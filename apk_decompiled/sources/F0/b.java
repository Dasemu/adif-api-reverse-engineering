package F0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f515a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        switch (this.f515a) {
            case 0:
                float f4 = f2 - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
            default:
                float f5 = f2 - 1.0f;
                return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }
}
