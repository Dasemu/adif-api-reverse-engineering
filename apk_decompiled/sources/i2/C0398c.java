package i2;

import android.animation.TimeInterpolator;

/* renamed from: i2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0398c {

    /* renamed from: a, reason: collision with root package name */
    public long f6821a;

    /* renamed from: b, reason: collision with root package name */
    public long f6822b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f6823c;

    /* renamed from: d, reason: collision with root package name */
    public int f6824d;

    /* renamed from: e, reason: collision with root package name */
    public int f6825e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f6823c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0396a.f6816b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0398c)) {
            return false;
        }
        C0398c c0398c = (C0398c) obj;
        if (this.f6821a == c0398c.f6821a && this.f6822b == c0398c.f6822b && this.f6824d == c0398c.f6824d && this.f6825e == c0398c.f6825e) {
            return a().getClass().equals(c0398c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f6821a;
        long j5 = this.f6822b;
        return ((((a().getClass().hashCode() + (((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31)) * 31) + this.f6824d) * 31) + this.f6825e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C0398c.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f6821a);
        sb.append(" duration: ");
        sb.append(this.f6822b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f6824d);
        sb.append(" repeatMode: ");
        return com.google.android.gms.measurement.internal.a.m(sb, this.f6825e, "}\n");
    }
}
