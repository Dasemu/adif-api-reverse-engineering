package O;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class t0 extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f1297c;

    public t0() {
        this.f1297c = new WindowInsets.Builder();
    }

    @Override // O.v0
    public D0 b() {
        a();
        D0 f2 = D0.f(null, this.f1297c.build());
        f2.f1207a.o(this.f1301b);
        return f2;
    }

    @Override // O.v0
    public void d(G.c cVar) {
        this.f1297c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // O.v0
    public void e(G.c cVar) {
        this.f1297c.setSystemGestureInsets(cVar.d());
    }

    @Override // O.v0
    public void f(G.c cVar) {
        this.f1297c.setSystemWindowInsets(cVar.d());
    }

    @Override // O.v0
    public void g(G.c cVar) {
        this.f1297c.setTappableElementInsets(cVar.d());
    }

    public void h(G.c cVar) {
        this.f1297c.setStableInsets(cVar.d());
    }

    public t0(D0 d02) {
        super(d02);
        WindowInsets.Builder builder;
        WindowInsets e4 = d02.e();
        if (e4 != null) {
            builder = new WindowInsets.Builder(e4);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.f1297c = builder;
    }
}
