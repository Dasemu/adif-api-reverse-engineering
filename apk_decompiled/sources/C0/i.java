package C0;

import B0.G;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public G f287d;

    /* renamed from: e, reason: collision with root package name */
    public float f288e;

    /* renamed from: f, reason: collision with root package name */
    public G f289f;

    /* renamed from: g, reason: collision with root package name */
    public float f290g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f291j;

    /* renamed from: k, reason: collision with root package name */
    public float f292k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f293l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f294m;

    /* renamed from: n, reason: collision with root package name */
    public float f295n;

    @Override // C0.k
    public final boolean a() {
        return this.f289f.d() || this.f287d.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // C0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r6) {
        /*
            r5 = this;
            B0.G r0 = r5.f289f
            boolean r1 = r0.d()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f104d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r4)
            int r4 = r0.f102b
            if (r1 == r4) goto L1e
            r0.f102b = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            B0.G r5 = r5.f287d
            boolean r1 = r5.d()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.f104d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r6 = r1.getColorForState(r6, r4)
            int r1 = r5.f102b
            if (r6 == r1) goto L3a
            r5.f102b = r6
            r2 = r3
        L3a:
            r5 = r0 | r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f289f.f102b;
    }

    public float getStrokeAlpha() {
        return this.f290g;
    }

    public int getStrokeColor() {
        return this.f287d.f102b;
    }

    public float getStrokeWidth() {
        return this.f288e;
    }

    public float getTrimPathEnd() {
        return this.f291j;
    }

    public float getTrimPathOffset() {
        return this.f292k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.h = f2;
    }

    public void setFillColor(int i) {
        this.f289f.f102b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f290g = f2;
    }

    public void setStrokeColor(int i) {
        this.f287d.f102b = i;
    }

    public void setStrokeWidth(float f2) {
        this.f288e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f291j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f292k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
