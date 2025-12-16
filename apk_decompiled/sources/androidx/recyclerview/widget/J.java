package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class J implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3555a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        switch (this.f3555a) {
            case 0:
                return f2 * f2 * f2 * f2 * f2;
            case 1:
                float f4 = f2 - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
            default:
                float f5 = f2 - 1.0f;
                return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }
}
