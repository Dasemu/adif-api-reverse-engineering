package c0;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280f {

    /* renamed from: a, reason: collision with root package name */
    public double f4220a;

    /* renamed from: b, reason: collision with root package name */
    public double f4221b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4222c;

    /* renamed from: d, reason: collision with root package name */
    public double f4223d;

    /* renamed from: e, reason: collision with root package name */
    public double f4224e;

    /* renamed from: f, reason: collision with root package name */
    public double f4225f;

    /* renamed from: g, reason: collision with root package name */
    public double f4226g;
    public double h;
    public double i;

    /* renamed from: j, reason: collision with root package name */
    public final C0277c f4227j;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, c0.c] */
    public C0280f() {
        this.f4220a = Math.sqrt(1500.0d);
        this.f4221b = 0.5d;
        this.f4222c = false;
        this.i = Double.MAX_VALUE;
        this.f4227j = new Object();
    }

    public final C0277c a(double d4, double d5, long j4) {
        double sin;
        double cos;
        if (!this.f4222c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d6 = this.f4221b;
            if (d6 > 1.0d) {
                double d7 = this.f4220a;
                this.f4225f = (Math.sqrt((d6 * d6) - 1.0d) * d7) + ((-d6) * d7);
                double d8 = this.f4221b;
                double d9 = this.f4220a;
                this.f4226g = ((-d8) * d9) - (Math.sqrt((d8 * d8) - 1.0d) * d9);
            } else if (d6 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d6 < 1.0d) {
                this.h = Math.sqrt(1.0d - (d6 * d6)) * this.f4220a;
            }
            this.f4222c = true;
        }
        double d10 = j4 / 1000.0d;
        double d11 = d4 - this.i;
        double d12 = this.f4221b;
        if (d12 > 1.0d) {
            double d13 = this.f4226g;
            double d14 = ((d13 * d11) - d5) / (d13 - this.f4225f);
            double d15 = d11 - d14;
            sin = (Math.pow(2.718281828459045d, this.f4225f * d10) * d14) + (Math.pow(2.718281828459045d, d13 * d10) * d15);
            double d16 = this.f4226g;
            double pow = Math.pow(2.718281828459045d, d16 * d10) * d15 * d16;
            double d17 = this.f4225f;
            cos = (Math.pow(2.718281828459045d, d17 * d10) * d14 * d17) + pow;
        } else if (d12 == 1.0d) {
            double d18 = this.f4220a;
            double d19 = (d18 * d11) + d5;
            double d20 = (d19 * d10) + d11;
            double pow2 = Math.pow(2.718281828459045d, (-d18) * d10) * d20;
            double pow3 = Math.pow(2.718281828459045d, (-this.f4220a) * d10) * d20;
            double d21 = -this.f4220a;
            cos = (Math.pow(2.718281828459045d, d21 * d10) * d19) + (pow3 * d21);
            sin = pow2;
        } else {
            double d22 = 1.0d / this.h;
            double d23 = this.f4220a;
            double d24 = ((d12 * d23 * d11) + d5) * d22;
            sin = ((Math.sin(this.h * d10) * d24) + (Math.cos(this.h * d10) * d11)) * Math.pow(2.718281828459045d, (-d12) * d23 * d10);
            double d25 = this.f4220a;
            double d26 = this.f4221b;
            double d27 = (-d25) * sin * d26;
            double pow4 = Math.pow(2.718281828459045d, (-d26) * d25 * d10);
            double d28 = this.h;
            double sin2 = Math.sin(d28 * d10) * (-d28) * d11;
            double d29 = this.h;
            cos = (((Math.cos(d29 * d10) * d24 * d29) + sin2) * pow4) + d27;
        }
        float f2 = (float) (sin + this.i);
        C0277c c0277c = this.f4227j;
        c0277c.f4206a = f2;
        c0277c.f4207b = (float) cos;
        return c0277c;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, c0.c] */
    public C0280f(float f2) {
        this.f4220a = Math.sqrt(1500.0d);
        this.f4221b = 0.5d;
        this.f4222c = false;
        this.f4227j = new Object();
        this.i = f2;
    }
}
