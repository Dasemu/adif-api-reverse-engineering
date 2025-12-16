package i2;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import j0.AbstractInterpolatorC0400b;
import j0.C0399a;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0396a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f6815a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C0399a f6816b = new C0399a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final C0399a f6817c = new C0399a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C0399a f6818d = new AbstractInterpolatorC0400b(C0399a.f6902e);

    /* JADX WARN: Type inference failed for: r0v3, types: [j0.a, j0.b] */
    static {
        new DecelerateInterpolator();
    }

    public static float a(float f2, float f4, float f5) {
        return com.google.android.gms.measurement.internal.a.a(f4, f2, f5, f2);
    }

    public static float b(float f2, float f4, float f5, float f6, float f7) {
        return f7 <= f5 ? f2 : f7 >= f6 ? f4 : a(f2, f4, (f7 - f5) / (f6 - f5));
    }

    public static int c(float f2, int i, int i4) {
        return Math.round(f2 * (i4 - i)) + i;
    }
}
