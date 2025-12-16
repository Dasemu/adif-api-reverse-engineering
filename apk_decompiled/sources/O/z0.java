package O;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class z0 extends y0 {

    /* renamed from: n, reason: collision with root package name */
    public G.c f1314n;

    /* renamed from: o, reason: collision with root package name */
    public G.c f1315o;
    public G.c p;

    public z0(D0 d02, WindowInsets windowInsets) {
        super(d02, windowInsets);
        this.f1314n = null;
        this.f1315o = null;
        this.p = null;
    }

    @Override // O.B0
    public G.c g() {
        if (this.f1315o == null) {
            this.f1315o = G.c.c(this.f1305c.getMandatorySystemGestureInsets());
        }
        return this.f1315o;
    }

    @Override // O.B0
    public G.c i() {
        if (this.f1314n == null) {
            this.f1314n = G.c.c(this.f1305c.getSystemGestureInsets());
        }
        return this.f1314n;
    }

    @Override // O.B0
    public G.c k() {
        if (this.p == null) {
            this.p = G.c.c(this.f1305c.getTappableElementInsets());
        }
        return this.p;
    }

    @Override // O.B0
    public D0 l(int i, int i4, int i5, int i6) {
        return D0.f(null, this.f1305c.inset(i, i4, i5, i6));
    }
}
