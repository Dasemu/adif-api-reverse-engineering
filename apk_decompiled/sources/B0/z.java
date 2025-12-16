package B0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.e f206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f207b;

    public z(A a2, s.e eVar) {
        this.f207b = a2;
        this.f206a = eVar;
    }

    @Override // B0.y, B0.v
    public final void c(x xVar) {
        ((ArrayList) this.f206a.get(this.f207b.f87b)).remove(xVar);
        xVar.A(this);
    }
}
