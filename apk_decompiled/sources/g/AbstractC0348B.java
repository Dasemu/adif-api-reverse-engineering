package g;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* renamed from: g.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0348B {

    /* renamed from: a, reason: collision with root package name */
    public Object f6477a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6478b;

    public AbstractC0348B(Context context) {
        this.f6477a = context;
    }

    public void c() {
        C0347A c0347a = (C0347A) this.f6477a;
        if (c0347a != null) {
            try {
                ((LayoutInflaterFactory2C0351E) this.f6478b).f6527k.unregisterReceiver(c0347a);
            } catch (IllegalArgumentException unused) {
            }
            this.f6477a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof I.a)) {
            return menuItem;
        }
        I.a aVar = (I.a) menuItem;
        if (((s.j) this.f6478b) == null) {
            this.f6478b = new s.j(0);
        }
        MenuItem menuItem2 = (MenuItem) ((s.j) this.f6478b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        l.t tVar = new l.t((Context) this.f6477a, aVar);
        ((s.j) this.f6478b).put(aVar, tVar);
        return tVar;
    }

    public abstract void g();

    public void h() {
        c();
        IntentFilter d4 = d();
        if (d4.countActions() == 0) {
            return;
        }
        if (((C0347A) this.f6477a) == null) {
            this.f6477a = new C0347A(this);
        }
        ((LayoutInflaterFactory2C0351E) this.f6478b).f6527k.registerReceiver((C0347A) this.f6477a, d4);
    }

    public AbstractC0348B(LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E) {
        this.f6478b = layoutInflaterFactory2C0351E;
    }
}
