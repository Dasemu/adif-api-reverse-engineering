package O;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1283a;

    /* renamed from: b, reason: collision with root package name */
    public float f1284b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f1285c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1286d;

    public q0(int i, Interpolator interpolator, long j4) {
        this.f1283a = i;
        this.f1285c = interpolator;
        this.f1286d = j4;
    }

    public long a() {
        return this.f1286d;
    }

    public float b() {
        Interpolator interpolator = this.f1285c;
        return interpolator != null ? interpolator.getInterpolation(this.f1284b) : this.f1284b;
    }

    public int c() {
        return this.f1283a;
    }

    public void d(float f2) {
        this.f1284b = f2;
    }
}
