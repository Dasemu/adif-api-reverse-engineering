package V0;

import S0.f;
import S0.k;
import S0.r;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final U0.a f1794a;

    /* renamed from: b, reason: collision with root package name */
    public final k f1795b;

    public c(U0.a aVar, k kVar) {
        this.f1794a = aVar;
        this.f1795b = kVar;
    }

    @Override // V0.e
    public final void a() {
        k kVar = this.f1795b;
        boolean z3 = kVar instanceof r;
        U0.a aVar = this.f1794a;
        if (z3) {
            aVar.b(((r) kVar).f1517a);
        } else if (kVar instanceof f) {
            aVar.b(((f) kVar).f1457a);
        }
    }
}
