package G2;

import O.D0;
import O.InterfaceC0080v;
import android.view.View;

/* loaded from: classes3.dex */
public final class f implements InterfaceC0080v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f583a;

    public /* synthetic */ f(k kVar) {
        this.f583a = kVar;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f583a.a(0);
    }

    @Override // O.InterfaceC0080v
    public D0 g(View view, D0 d02) {
        int a2 = d02.a();
        k kVar = this.f583a;
        kVar.f612m = a2;
        kVar.f613n = d02.b();
        kVar.f614o = d02.c();
        kVar.e();
        return d02;
    }
}
