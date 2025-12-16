package l;

import a.AbstractC0106b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public final class o implements I.a {

    /* renamed from: A, reason: collision with root package name */
    public p f7265A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f7266B;

    /* renamed from: a, reason: collision with root package name */
    public final int f7268a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7269b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7270c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7271d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f7272e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f7273f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f7274g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f7275j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f7277l;

    /* renamed from: n, reason: collision with root package name */
    public final m f7279n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0422E f7280o;
    public MenuItem.OnMenuItemClickListener p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f7281q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f7282r;

    /* renamed from: y, reason: collision with root package name */
    public int f7289y;

    /* renamed from: z, reason: collision with root package name */
    public View f7290z;
    public int i = ConstantsKt.DEFAULT_BLOCK_SIZE;

    /* renamed from: k, reason: collision with root package name */
    public int f7276k = ConstantsKt.DEFAULT_BLOCK_SIZE;

    /* renamed from: m, reason: collision with root package name */
    public int f7278m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f7283s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f7284t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7285u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7286v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7287w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f7288x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f7267C = false;

    public o(m mVar, int i, int i4, int i5, int i6, CharSequence charSequence, int i7) {
        this.f7279n = mVar;
        this.f7268a = i4;
        this.f7269b = i;
        this.f7270c = i5;
        this.f7271d = i6;
        this.f7272e = charSequence;
        this.f7289y = i7;
    }

    public static void c(StringBuilder sb, int i, int i4, String str) {
        if ((i & i4) == i4) {
            sb.append(str);
        }
    }

    @Override // I.a
    public final p a() {
        return this.f7265A;
    }

    @Override // I.a
    public final I.a b(p pVar) {
        this.f7290z = null;
        this.f7265A = pVar;
        this.f7279n.p(true);
        p pVar2 = this.f7265A;
        if (pVar2 != null) {
            pVar2.f7291a = new h3.d(this, 3);
            pVar2.f7292b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f7289y & 8) == 0) {
            return false;
        }
        if (this.f7290z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7266B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f7279n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f7287w && (this.f7285u || this.f7286v)) {
            drawable = drawable.mutate();
            if (this.f7285u) {
                H.a.h(drawable, this.f7283s);
            }
            if (this.f7286v) {
                H.a.i(drawable, this.f7284t);
            }
            this.f7287w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f7289y & 8) != 0) {
            if (this.f7290z == null && (pVar = this.f7265A) != null) {
                this.f7290z = pVar.f7292b.onCreateActionView(this);
            }
            if (this.f7290z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7266B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f7279n.f(this);
        }
        return false;
    }

    public final void f(boolean z3) {
        this.f7288x = (z3 ? 4 : 0) | (this.f7288x & (-5));
    }

    public final void g(boolean z3) {
        if (z3) {
            this.f7288x |= 32;
        } else {
            this.f7288x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f7290z;
        if (view != null) {
            return view;
        }
        p pVar = this.f7265A;
        if (pVar == null) {
            return null;
        }
        View onCreateActionView = pVar.f7292b.onCreateActionView(this);
        this.f7290z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // I.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f7276k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f7275j;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f7281q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f7269b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f7277l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f7278m;
        if (i == 0) {
            return null;
        }
        Drawable m4 = AbstractC0106b.m(this.f7279n.f7241a, i);
        this.f7278m = 0;
        this.f7277l = m4;
        return d(m4);
    }

    @Override // I.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f7283s;
    }

    @Override // I.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f7284t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f7274g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f7268a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f7270c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f7280o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f7272e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7273f;
        return charSequence != null ? charSequence : this.f7272e;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f7282r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f7280o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f7267C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f7288x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f7288x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f7288x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.f7265A;
        return (pVar == null || !pVar.f7292b.overridesItemVisibility()) ? (this.f7288x & 8) == 0 : (this.f7288x & 8) == 0 && this.f7265A.f7292b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f7290z = view;
        this.f7265A = null;
        if (view != null && view.getId() == -1 && (i = this.f7268a) > 0) {
            view.setId(i);
        }
        m mVar = this.f7279n;
        mVar.f7249k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        if (this.f7275j == c4) {
            return this;
        }
        this.f7275j = Character.toLowerCase(c4);
        this.f7279n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i = this.f7288x;
        int i4 = (z3 ? 1 : 0) | (i & (-2));
        this.f7288x = i4;
        if (i != i4) {
            this.f7279n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i = this.f7288x;
        if ((i & 4) == 0) {
            int i4 = (i & (-3)) | (z3 ? 2 : 0);
            this.f7288x = i4;
            if (i != i4) {
                this.f7279n.p(false);
            }
            return this;
        }
        m mVar = this.f7279n;
        mVar.getClass();
        ArrayList arrayList = mVar.f7246f;
        int size = arrayList.size();
        mVar.w();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f7269b == this.f7269b && (oVar.f7288x & 4) != 0 && oVar.isCheckable()) {
                boolean z4 = oVar == this;
                int i6 = oVar.f7288x;
                int i7 = (z4 ? 2 : 0) | (i6 & (-3));
                oVar.f7288x = i7;
                if (i6 != i7) {
                    oVar.f7279n.p(false);
                }
            }
        }
        mVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f7288x |= 16;
        } else {
            this.f7288x &= -17;
        }
        this.f7279n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f7278m = 0;
        this.f7277l = drawable;
        this.f7287w = true;
        this.f7279n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7283s = colorStateList;
        this.f7285u = true;
        this.f7287w = true;
        this.f7279n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7284t = mode;
        this.f7286v = true;
        this.f7287w = true;
        this.f7279n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f7274g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        if (this.h == c4) {
            return this;
        }
        this.h = c4;
        this.f7279n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7266B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5) {
        this.h = c4;
        this.f7275j = Character.toLowerCase(c5);
        this.f7279n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i4 = i & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f7289y = i;
        m mVar = this.f7279n;
        mVar.f7249k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f7272e = charSequence;
        this.f7279n.p(false);
        SubMenuC0422E subMenuC0422E = this.f7280o;
        if (subMenuC0422E != null) {
            subMenuC0422E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7273f = charSequence;
        this.f7279n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i = this.f7288x;
        int i4 = (z3 ? 0 : 8) | (i & (-9));
        this.f7288x = i4;
        if (i != i4) {
            m mVar = this.f7279n;
            mVar.h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f7272e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setContentDescription(CharSequence charSequence) {
        this.f7281q = charSequence;
        this.f7279n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setTooltipText(CharSequence charSequence) {
        this.f7282r = charSequence;
        this.f7279n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i) {
        if (this.f7275j == c4 && this.f7276k == i) {
            return this;
        }
        this.f7275j = Character.toLowerCase(c4);
        this.f7276k = KeyEvent.normalizeMetaState(i);
        this.f7279n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i) {
        if (this.h == c4 && this.i == i) {
            return this;
        }
        this.h = c4;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f7279n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5, int i, int i4) {
        this.h = c4;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f7275j = Character.toLowerCase(c5);
        this.f7276k = KeyEvent.normalizeMetaState(i4);
        this.f7279n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f7277l = null;
        this.f7278m = i;
        this.f7287w = true;
        this.f7279n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f7279n.f7241a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i4;
        Context context = this.f7279n.f7241a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f7290z = inflate;
        this.f7265A = null;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f7268a) > 0) {
            inflate.setId(i4);
        }
        m mVar = this.f7279n;
        mVar.f7249k = true;
        mVar.p(true);
        return this;
    }
}
