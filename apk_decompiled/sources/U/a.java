package U;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1733a;

    /* renamed from: b, reason: collision with root package name */
    public int f1734b;

    /* renamed from: c, reason: collision with root package name */
    public float f1735c;

    /* renamed from: d, reason: collision with root package name */
    public float f1736d;

    /* renamed from: e, reason: collision with root package name */
    public long f1737e;

    /* renamed from: f, reason: collision with root package name */
    public long f1738f;

    /* renamed from: g, reason: collision with root package name */
    public long f1739g;
    public float h;
    public int i;

    public final float a(long j4) {
        long j5 = this.f1737e;
        if (j4 < j5) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        long j6 = this.f1739g;
        if (j6 < 0 || j4 < j6) {
            return g.b(((float) (j4 - j5)) / this.f1733a, BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.5f;
        }
        float f2 = this.h;
        return (g.b(((float) (j4 - j6)) / this.i, BitmapDescriptorFactory.HUE_RED, 1.0f) * f2) + (1.0f - f2);
    }
}
