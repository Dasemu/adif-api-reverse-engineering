package O;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class x0 extends w0 {

    /* renamed from: m, reason: collision with root package name */
    public G.c f1310m;

    public x0(D0 d02, WindowInsets windowInsets) {
        super(d02, windowInsets);
        this.f1310m = null;
    }

    @Override // O.B0
    public D0 b() {
        return D0.f(null, this.f1305c.consumeStableInsets());
    }

    @Override // O.B0
    public D0 c() {
        return D0.f(null, this.f1305c.consumeSystemWindowInsets());
    }

    @Override // O.B0
    public final G.c h() {
        if (this.f1310m == null) {
            WindowInsets windowInsets = this.f1305c;
            this.f1310m = G.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f1310m;
    }

    @Override // O.B0
    public boolean m() {
        return this.f1305c.isConsumed();
    }
}
