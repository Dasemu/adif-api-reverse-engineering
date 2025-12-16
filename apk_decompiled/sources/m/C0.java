package m;

import android.content.Context;

/* loaded from: classes.dex */
public final class C0 extends C0496x0 implements InterfaceC0498y0 {

    /* renamed from: A, reason: collision with root package name */
    public h3.d f7505A;

    @Override // m.InterfaceC0498y0
    public final void e(l.m mVar, l.o oVar) {
        h3.d dVar = this.f7505A;
        if (dVar != null) {
            dVar.e(mVar, oVar);
        }
    }

    @Override // m.InterfaceC0498y0
    public final void m(l.m mVar, l.o oVar) {
        h3.d dVar = this.f7505A;
        if (dVar != null) {
            dVar.m(mVar, oVar);
        }
    }

    @Override // m.C0496x0
    public final C0475m0 q(Context context, boolean z3) {
        B0 b02 = new B0(context, z3);
        b02.setHoverListener(this);
        return b02;
    }
}
