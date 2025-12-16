package E2;

/* loaded from: classes3.dex */
public final class o extends s {

    /* renamed from: a, reason: collision with root package name */
    public final q f449a;

    /* renamed from: b, reason: collision with root package name */
    public final float f450b;

    /* renamed from: c, reason: collision with root package name */
    public final float f451c;

    public o(q qVar, float f2, float f4) {
        this.f449a = qVar;
        this.f450b = f2;
        this.f451c = f4;
    }

    public final float a() {
        q qVar = this.f449a;
        return (float) Math.toDegrees(Math.atan((qVar.f459c - this.f451c) / (qVar.f458b - this.f450b)));
    }
}
