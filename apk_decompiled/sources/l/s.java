package l;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f7297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f7298b;

    public s(t tVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7298b = tVar;
        this.f7297a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f7297a.onMenuItemClick(this.f7298b.f(menuItem));
    }
}
