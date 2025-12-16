package O;

import a.AbstractC0106b;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final D0 f1300a;

    /* renamed from: b, reason: collision with root package name */
    public G.c[] f1301b;

    public v0() {
        this(new D0());
    }

    public final void a() {
        G.c[] cVarArr = this.f1301b;
        if (cVarArr != null) {
            G.c cVar = cVarArr[0];
            G.c cVar2 = cVarArr[1];
            D0 d02 = this.f1300a;
            if (cVar2 == null) {
                cVar2 = d02.f1207a.f(2);
            }
            if (cVar == null) {
                cVar = d02.f1207a.f(1);
            }
            f(G.c.a(cVar, cVar2));
            G.c cVar3 = this.f1301b[AbstractC0106b.q(16)];
            if (cVar3 != null) {
                e(cVar3);
            }
            G.c cVar4 = this.f1301b[AbstractC0106b.q(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            G.c cVar5 = this.f1301b[AbstractC0106b.q(64)];
            if (cVar5 != null) {
                g(cVar5);
            }
        }
    }

    public abstract D0 b();

    public void c(int i, G.c cVar) {
        if (this.f1301b == null) {
            this.f1301b = new G.c[9];
        }
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i & i4) != 0) {
                this.f1301b[AbstractC0106b.q(i4)] = cVar;
            }
        }
    }

    public abstract void d(G.c cVar);

    public abstract void e(G.c cVar);

    public abstract void f(G.c cVar);

    public abstract void g(G.c cVar);

    public v0(D0 d02) {
        this.f1300a = d02;
    }
}
