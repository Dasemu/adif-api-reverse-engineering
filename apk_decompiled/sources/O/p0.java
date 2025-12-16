package O;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class p0 extends q0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f1282e;

    public p0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f1282e = windowInsetsAnimation;
    }

    @Override // O.q0
    public final long a() {
        long durationMillis;
        durationMillis = this.f1282e.getDurationMillis();
        return durationMillis;
    }

    @Override // O.q0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f1282e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // O.q0
    public final int c() {
        int typeMask;
        typeMask = this.f1282e.getTypeMask();
        return typeMask;
    }

    @Override // O.q0
    public final void d(float f2) {
        this.f1282e.setFraction(f2);
    }
}
