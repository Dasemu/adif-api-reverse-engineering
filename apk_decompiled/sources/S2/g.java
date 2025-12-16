package S2;

import java.util.List;

/* loaded from: classes3.dex */
public final class g extends Q2.l {

    /* renamed from: a, reason: collision with root package name */
    public Q2.l f1591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1593c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q2.d f1594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X2.a f1595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f1596f;

    public g(h hVar, boolean z3, boolean z4, Q2.d dVar, X2.a aVar) {
        this.f1596f = hVar;
        this.f1592b = z3;
        this.f1593c = z4;
        this.f1594d = dVar;
        this.f1595e = aVar;
    }

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        if (this.f1592b) {
            aVar.u0();
            return null;
        }
        Q2.l lVar = this.f1591a;
        if (lVar == null) {
            X2.a aVar2 = this.f1595e;
            Q2.d dVar = this.f1594d;
            List<Q2.m> list = dVar.f1383e;
            Q2.m mVar = this.f1596f;
            if (!list.contains(mVar)) {
                mVar = dVar.f1382d;
            }
            boolean z3 = false;
            for (Q2.m mVar2 : list) {
                if (z3) {
                    Q2.l a2 = mVar2.a(dVar, aVar2);
                    if (a2 != null) {
                        this.f1591a = a2;
                        lVar = a2;
                    }
                } else if (mVar2 == mVar) {
                    z3 = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + aVar2);
        }
        return lVar.a(aVar);
    }

    @Override // Q2.l
    public final void b(Y2.b bVar, Object obj) {
        if (this.f1593c) {
            bVar.b0();
            return;
        }
        Q2.l lVar = this.f1591a;
        if (lVar == null) {
            X2.a aVar = this.f1595e;
            Q2.d dVar = this.f1594d;
            List<Q2.m> list = dVar.f1383e;
            Q2.m mVar = this.f1596f;
            if (!list.contains(mVar)) {
                mVar = dVar.f1382d;
            }
            boolean z3 = false;
            for (Q2.m mVar2 : list) {
                if (z3) {
                    Q2.l a2 = mVar2.a(dVar, aVar);
                    if (a2 != null) {
                        this.f1591a = a2;
                        lVar = a2;
                    }
                } else if (mVar2 == mVar) {
                    z3 = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + aVar);
        }
        lVar.b(bVar, obj);
    }
}
