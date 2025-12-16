package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0422E extends m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final o f7178A;

    /* renamed from: z, reason: collision with root package name */
    public final m f7179z;

    public SubMenuC0422E(Context context, m mVar, o oVar) {
        super(context);
        this.f7179z = mVar;
        this.f7178A = oVar;
    }

    @Override // l.m
    public final boolean d(o oVar) {
        return this.f7179z.d(oVar);
    }

    @Override // l.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f7179z.e(mVar, menuItem);
    }

    @Override // l.m
    public final boolean f(o oVar) {
        return this.f7179z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f7178A;
    }

    @Override // l.m
    public final String j() {
        o oVar = this.f7178A;
        int i = oVar != null ? oVar.f7268a : 0;
        if (i == 0) {
            return null;
        }
        return com.google.android.gms.measurement.internal.a.l(i, "android:menu:actionviewstates:");
    }

    @Override // l.m
    public final m k() {
        return this.f7179z.k();
    }

    @Override // l.m
    public final boolean m() {
        return this.f7179z.m();
    }

    @Override // l.m
    public final boolean n() {
        return this.f7179z.n();
    }

    @Override // l.m
    public final boolean o() {
        return this.f7179z.o();
    }

    @Override // l.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f7179z.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f7178A.setIcon(drawable);
        return this;
    }

    @Override // l.m, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f7179z.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f7178A.setIcon(i);
        return this;
    }
}
