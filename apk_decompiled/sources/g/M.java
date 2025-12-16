package g;

import android.view.MenuItem;
import l.InterfaceC0433k;
import m.S0;

/* loaded from: classes.dex */
public final class M implements S0, InterfaceC0433k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f6555a;

    public /* synthetic */ M(N n4) {
        this.f6555a = n4;
    }

    @Override // l.InterfaceC0433k
    public boolean c(l.m mVar, MenuItem menuItem) {
        return false;
    }

    @Override // l.InterfaceC0433k
    public void i(l.m mVar) {
        N n4 = this.f6555a;
        boolean p = n4.f6556a.f7624a.p();
        y yVar = n4.f6557b;
        if (p) {
            yVar.onPanelClosed(108, mVar);
        } else if (yVar.onPreparePanel(0, null, mVar)) {
            yVar.onMenuOpened(108, mVar);
        }
    }
}
