package S1;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final float f1549a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1550b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1551c = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    public final float f1552d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f1554f;

    public m(o oVar, float f2, float f4, float f5, float f6) {
        this.f1554f = oVar;
        this.f1549a = f5;
        this.f1550b = f6;
        this.f1552d = f2;
        this.f1553e = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f1551c)) * 1.0f;
        o oVar = this.f1554f;
        float interpolation = oVar.f1559a.getInterpolation(Math.min(1.0f, currentTimeMillis / oVar.f1560b));
        float f2 = this.f1553e;
        float f4 = this.f1552d;
        oVar.f1578w.t(com.google.android.gms.measurement.internal.a.a(f2, f4, interpolation, f4) / oVar.d(), this.f1549a, this.f1550b);
        if (interpolation < 1.0f) {
            oVar.h.postOnAnimation(this);
        }
    }
}
