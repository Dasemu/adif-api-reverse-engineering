package l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423a implements I.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f7180a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f7181b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f7182c;

    /* renamed from: d, reason: collision with root package name */
    public char f7183d;

    /* renamed from: e, reason: collision with root package name */
    public int f7184e;

    /* renamed from: f, reason: collision with root package name */
    public char f7185f;

    /* renamed from: g, reason: collision with root package name */
    public int f7186g;
    public Drawable h;
    public Context i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f7187j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f7188k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f7189l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f7190m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7191n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7192o;
    public int p;

    @Override // I.a
    public final p a() {
        return null;
    }

    @Override // I.a
    public final I.a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f7191n || this.f7192o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f7191n) {
                    H.a.h(mutate, this.f7189l);
                }
                if (this.f7192o) {
                    H.a.i(this.h, this.f7190m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f7186g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f7185f;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f7187j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // I.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f7189l;
    }

    @Override // I.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f7190m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f7182c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f7184e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f7183d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f7180a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7181b;
        return charSequence != null ? charSequence : this.f7180a;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f7188k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        this.f7185f = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        this.p = (z3 ? 1 : 0) | (this.p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        this.p = (z3 ? 2 : 0) | (this.p & (-3));
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setContentDescription(CharSequence charSequence) {
        this.f7187j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        this.p = (z3 ? 16 : 0) | (this.p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7189l = colorStateList;
        this.f7191n = true;
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7190m = mode;
        this.f7192o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f7182c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        this.f7183d = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5) {
        this.f7183d = c4;
        this.f7185f = Character.toLowerCase(c5);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f7180a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7181b = charSequence;
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setTooltipText(CharSequence charSequence) {
        this.f7188k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        this.p = (this.p & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i) {
        this.f7185f = Character.toLowerCase(c4);
        this.f7186g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f7187j = charSequence;
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i) {
        this.f7183d = c4;
        this.f7184e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f7180a = this.i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f7188k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.h = D.h.getDrawable(this.i, i);
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5, int i, int i4) {
        this.f7183d = c4;
        this.f7184e = KeyEvent.normalizeMetaState(i);
        this.f7185f = Character.toLowerCase(c5);
        this.f7186g = KeyEvent.normalizeMetaState(i4);
        return this;
    }
}
