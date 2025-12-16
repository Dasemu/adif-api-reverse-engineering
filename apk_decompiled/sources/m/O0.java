package m;

import O.InterfaceC0076q;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0140c0;
import java.util.Iterator;
import l.InterfaceC0433k;

/* loaded from: classes.dex */
public final class O0 implements InterfaceC0478o, InterfaceC0433k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f7602a;

    public /* synthetic */ O0(Toolbar toolbar) {
        this.f7602a = toolbar;
    }

    @Override // l.InterfaceC0433k
    public boolean c(l.m mVar, MenuItem menuItem) {
        g.M m4 = this.f7602a.f2474O;
        return false;
    }

    @Override // l.InterfaceC0433k
    public void i(l.m mVar) {
        Toolbar toolbar = this.f7602a;
        C0472l c0472l = toolbar.f2480a.f2416t;
        if (c0472l == null || !c0472l.f()) {
            Iterator it = toolbar.f2467G.f1276b.iterator();
            while (it.hasNext()) {
                ((C0140c0) ((InterfaceC0076q) it.next())).f3105a.t(mVar);
            }
        }
        g.M m4 = toolbar.f2474O;
        if (m4 != null) {
            m4.i(mVar);
        }
    }
}
