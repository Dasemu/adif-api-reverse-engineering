package B0;

/* loaded from: classes.dex */
public final class C extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91a;

    /* renamed from: b, reason: collision with root package name */
    public x f92b;

    public /* synthetic */ C() {
        this.f91a = 1;
    }

    @Override // B0.y, B0.v
    public void a(x xVar) {
        switch (this.f91a) {
            case 1:
                D d4 = (D) this.f92b;
                if (d4.f96H) {
                    return;
                }
                d4.L();
                d4.f96H = true;
                return;
            default:
                return;
        }
    }

    @Override // B0.y, B0.v
    public void c(x xVar) {
        switch (this.f91a) {
            case 1:
                D d4 = (D) this.f92b;
                int i = d4.f95G - 1;
                d4.f95G = i;
                if (i == 0) {
                    d4.f96H = false;
                    d4.m();
                }
                xVar.A(this);
                return;
            case 2:
                this.f92b.D();
                xVar.A(this);
                return;
            default:
                return;
        }
    }

    @Override // B0.y, B0.v
    public void e(x xVar) {
        switch (this.f91a) {
            case 0:
                D d4 = (D) this.f92b;
                d4.f93E.remove(xVar);
                if (d4.s()) {
                    return;
                }
                d4.x(d4, w.f175d, false);
                d4.f197r = true;
                d4.x(d4, w.f174c, false);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ C(x xVar, int i) {
        this.f91a = i;
        this.f92b = xVar;
    }
}
