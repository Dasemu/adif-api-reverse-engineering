package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import g.AbstractC0348B;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class t extends AbstractC0348B implements MenuItem {

    /* renamed from: c, reason: collision with root package name */
    public final I.a f7299c;

    /* renamed from: d, reason: collision with root package name */
    public Method f7300d;

    public t(Context context, I.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f7299c = aVar;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f7299c.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f7299c.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        p a2 = this.f7299c.a();
        if (a2 != null) {
            return a2.f7292b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f7299c.getActionView();
        return actionView instanceof q ? (View) ((q) actionView).f7294a : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f7299c.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f7299c.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f7299c.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f7299c.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f7299c.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f7299c.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f7299c.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f7299c.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f7299c.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f7299c.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f7299c.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f7299c.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f7299c.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f7299c.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f7299c.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f7299c.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f7299c.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f7299c.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f7299c.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f7299c.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f7299c.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f7299c.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f7299c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        p pVar = new p(this, actionProvider);
        if (actionProvider == null) {
            pVar = null;
        }
        this.f7299c.b(pVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new q(view);
        }
        this.f7299c.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        this.f7299c.setAlphabeticShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        this.f7299c.setCheckable(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        this.f7299c.setChecked(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f7299c.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        this.f7299c.setEnabled(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f7299c.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7299c.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7299c.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f7299c.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        this.f7299c.setNumericShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7299c.setOnActionExpandListener(onActionExpandListener != null ? new r(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7299c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new s(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5) {
        this.f7299c.setShortcut(c4, c5);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f7299c.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f7299c.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f7299c.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7299c.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f7299c.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        return this.f7299c.setVisible(z3);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i) {
        this.f7299c.setAlphabeticShortcut(c4, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f7299c.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i) {
        this.f7299c.setNumericShortcut(c4, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5, int i, int i4) {
        this.f7299c.setShortcut(c4, c5, i, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f7299c.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        I.a aVar = this.f7299c;
        aVar.setActionView(i);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new q(actionView));
        }
        return this;
    }
}
