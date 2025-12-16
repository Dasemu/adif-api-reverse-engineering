package l;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f7295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f7296b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7296b = tVar;
        this.f7295a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f7295a.onMenuItemActionCollapse(this.f7296b.f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f7295a.onMenuItemActionExpand(this.f7296b.f(menuItem));
    }
}
