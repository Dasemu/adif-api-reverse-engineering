package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import g.AbstractC0348B;

/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0419B extends AbstractC0348B implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final m f7161c;

    public MenuC0419B(Context context, m mVar) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f7161c = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f7161c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f7161c.addIntentOptions(i, i4, i5, componentName, intentArr, intent, i6, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                menuItemArr[i7] = f(menuItemArr2[i7]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f7161c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        s.j jVar = (s.j) this.f6478b;
        if (jVar != null) {
            jVar.clear();
        }
        this.f7161c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f7161c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return f(this.f7161c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return f(this.f7161c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f7161c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f7161c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i4) {
        return this.f7161c.performIdentifierAction(i, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i4) {
        return this.f7161c.performShortcut(i, keyEvent, i4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((s.j) this.f6478b) != null) {
            int i4 = 0;
            while (true) {
                s.j jVar = (s.j) this.f6478b;
                if (i4 >= jVar.f8352c) {
                    break;
                }
                if (((I.a) jVar.f(i4)).getGroupId() == i) {
                    ((s.j) this.f6478b).g(i4);
                    i4--;
                }
                i4++;
            }
        }
        this.f7161c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((s.j) this.f6478b) != null) {
            int i4 = 0;
            while (true) {
                s.j jVar = (s.j) this.f6478b;
                if (i4 >= jVar.f8352c) {
                    break;
                }
                if (((I.a) jVar.f(i4)).getItemId() == i) {
                    ((s.j) this.f6478b).g(i4);
                    break;
                }
                i4++;
            }
        }
        this.f7161c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z3, boolean z4) {
        this.f7161c.setGroupCheckable(i, z3, z4);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z3) {
        this.f7161c.setGroupEnabled(i, z3);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z3) {
        this.f7161c.setGroupVisible(i, z3);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f7161c.setQwertyMode(z3);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f7161c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f7161c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return f(this.f7161c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i5, CharSequence charSequence) {
        return this.f7161c.addSubMenu(i, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i5, CharSequence charSequence) {
        return f(this.f7161c.a(i, i4, i5, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i5, int i6) {
        return this.f7161c.addSubMenu(i, i4, i5, i6);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i5, int i6) {
        return f(this.f7161c.add(i, i4, i5, i6));
    }
}
