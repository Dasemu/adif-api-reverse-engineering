package O;

import android.view.MenuItem;
import androidx.fragment.app.C0140c0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: O.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074o {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1275a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1276b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1277c = new HashMap();

    public C0074o(Runnable runnable) {
        this.f1275a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f1276b.iterator();
        while (it.hasNext()) {
            if (((C0140c0) ((InterfaceC0076q) it.next())).f3105a.p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC0076q interfaceC0076q) {
        this.f1276b.remove(interfaceC0076q);
        C0073n c0073n = (C0073n) this.f1277c.remove(interfaceC0076q);
        if (c0073n != null) {
            c0073n.f1273a.c(c0073n.f1274b);
            c0073n.f1274b = null;
        }
        this.f1275a.run();
    }
}
