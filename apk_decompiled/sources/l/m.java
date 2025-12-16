package l;

import O.Z;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f7240y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f7241a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f7242b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7243c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7244d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0433k f7245e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7246f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7247g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f7248j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7249k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f7251m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f7252n;

    /* renamed from: o, reason: collision with root package name */
    public View f7253o;

    /* renamed from: v, reason: collision with root package name */
    public o f7259v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7261x;

    /* renamed from: l, reason: collision with root package name */
    public int f7250l = 0;
    public boolean p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7254q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7255r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7256s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f7257t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f7258u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f7260w = false;

    public m(Context context) {
        boolean z3 = false;
        this.f7241a = context;
        Resources resources = context.getResources();
        this.f7242b = resources;
        this.f7246f = new ArrayList();
        this.f7247g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.f7248j = new ArrayList();
        this.f7249k = true;
        if (resources.getConfiguration().keyboard != 1 && Z.b(ViewConfiguration.get(context))) {
            z3 = true;
        }
        this.f7244d = z3;
    }

    public o a(int i, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = ((-65536) & i5) >> 16;
        if (i7 < 0 || i7 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i8 = (f7240y[i7] << 16) | (65535 & i5);
        o oVar = new o(this, i, i4, i5, i8, charSequence, this.f7250l);
        ArrayList arrayList = this.f7246f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i6 = 0;
                break;
            }
            if (((o) arrayList.get(size)).f7271d <= i8) {
                i6 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i6, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f7241a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o a2 = a(i, i4, i5, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f7274g = intent2;
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = a2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f7258u.add(new WeakReference(yVar));
        yVar.i(context, this);
        this.f7249k = true;
    }

    public final void c(boolean z3) {
        if (this.f7256s) {
            return;
        }
        this.f7256s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7258u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.b(this, z3);
            }
        }
        this.f7256s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f7259v;
        if (oVar != null) {
            d(oVar);
        }
        this.f7246f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f7252n = null;
        this.f7251m = null;
        this.f7253o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7258u;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f7259v == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = yVar.m(oVar);
                    if (z3) {
                        break;
                    }
                }
            }
            v();
            if (z3) {
                this.f7259v = null;
            }
        }
        return z3;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        InterfaceC0433k interfaceC0433k = this.f7245e;
        return interfaceC0433k != null && interfaceC0433k.c(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7258u;
        boolean z3 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z3 = yVar.g(oVar);
                if (z3) {
                    break;
                }
            }
        }
        v();
        if (z3) {
            this.f7259v = oVar;
        }
        return z3;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f7246f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (oVar.f7268a == i) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f7280o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f7257t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean n4 = n();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            char c4 = n4 ? oVar.f7275j : oVar.h;
            char[] cArr = keyData.meta;
            if ((c4 == cArr[0] && (metaState & 2) == 0) || ((c4 == cArr[2] && (metaState & 2) != 0) || (n4 && c4 == '\b' && i == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f7246f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean n4 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f7246f;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                o oVar = (o) arrayList2.get(i4);
                if (oVar.hasSubMenu()) {
                    oVar.f7280o.h(arrayList, i, keyEvent);
                }
                char c4 = n4 ? oVar.f7275j : oVar.h;
                if ((modifiers & 69647) == ((n4 ? oVar.f7276k : oVar.i) & 69647) && c4 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c4 == cArr[0] || c4 == cArr[2] || (n4 && c4 == '\b' && i == 67)) && oVar.isEnabled()) {
                        arrayList.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f7261x) {
            return true;
        }
        ArrayList arrayList = this.f7246f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l4 = l();
        if (this.f7249k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f7258u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 |= yVar.j();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f7248j;
            if (z3) {
                arrayList.clear();
                arrayList2.clear();
                int size = l4.size();
                for (int i = 0; i < size; i++) {
                    o oVar = (o) l4.get(i);
                    if ((oVar.f7288x & 32) == 32) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f7249k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z3 = this.h;
        ArrayList arrayList = this.f7247g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f7246f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList2.get(i);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.h = false;
        this.f7249k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f7260w;
    }

    public boolean n() {
        return this.f7243c;
    }

    public boolean o() {
        return this.f7244d;
    }

    public final void p(boolean z3) {
        if (this.p) {
            this.f7254q = true;
            if (z3) {
                this.f7255r = true;
                return;
            }
            return;
        }
        if (z3) {
            this.h = true;
            this.f7249k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7258u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.h(z3);
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i4) {
        return q(findItem(i), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i4) {
        o g4 = g(i, keyEvent);
        boolean q4 = g4 != null ? q(g4, null, i4) : false;
        if ((i4 & 2) != 0) {
            c(true);
        }
        return q4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, l.y r8, int r9) {
        /*
            r6 = this;
            l.o r7 = (l.o) r7
            r0 = 0
            if (r7 == 0) goto Ld4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld4
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            l.m r1 = r7.f7279n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f7274g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f7241a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            l.p r1 = r7.f7265A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f7292b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            l.p r3 = r7.f7265A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f7292b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld3
            r6.c(r2)
            goto Ld3
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld3
            r6.c(r2)
            goto Ld3
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            l.E r9 = new l.E
            android.content.Context r5 = r6.f7241a
            r9.<init>(r5, r6, r7)
            r7.f7280o = r9
            java.lang.CharSequence r5 = r7.f7272e
            r9.setHeaderTitle(r5)
        L90:
            l.E r7 = r7.f7280o
            if (r4 == 0) goto L9b
            l.t r9 = r3.f7293c
            android.view.ActionProvider r9 = r3.f7292b
            r9.onPrepareSubMenu(r7)
        L9b:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f7258u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La4
            goto Lcd
        La4:
            if (r8 == 0) goto Laa
            boolean r0 = r8.l(r7)
        Laa:
            java.util.Iterator r8 = r9.iterator()
        Lae:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lcd
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            l.y r4 = (l.y) r4
            if (r4 != 0) goto Lc6
            r9.remove(r3)
            goto Lae
        Lc6:
            if (r0 != 0) goto Lae
            boolean r0 = r4.l(r7)
            goto Lae
        Lcd:
            r1 = r1 | r0
            if (r1 != 0) goto Ld3
            r6.c(r2)
        Ld3:
            return r1
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.m.q(android.view.MenuItem, l.y, int):boolean");
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7258u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f7246f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((o) arrayList.get(i5)).f7269b == i) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((o) arrayList.get(i5)).f7269b != i) {
                    break;
                }
                if (i5 >= 0) {
                    ArrayList arrayList2 = this.f7246f;
                    if (i5 < arrayList2.size()) {
                        arrayList2.remove(i5);
                    }
                }
                i4 = i6;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f7246f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((o) arrayList.get(i4)).f7268a == i) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList2 = this.f7246f;
            if (i4 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i4);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f7246f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0422E) item.getSubMenu()).s(bundle);
            }
        }
        int i4 = bundle.getInt("android:menu:expandedactionview");
        if (i4 <= 0 || (findItem = findItem(i4)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z3, boolean z4) {
        ArrayList arrayList = this.f7246f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (oVar.f7269b == i) {
                oVar.f(z4);
                oVar.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f7260w = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z3) {
        ArrayList arrayList = this.f7246f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (oVar.f7269b == i) {
                oVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z3) {
        ArrayList arrayList = this.f7246f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (oVar.f7269b == i) {
                int i5 = oVar.f7288x;
                int i6 = (i5 & (-9)) | (z3 ? 0 : 8);
                oVar.f7288x = i6;
                if (i5 != i6) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f7243c = z3;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f7246f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f7246f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0422E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i4, Drawable drawable, View view) {
        if (view != null) {
            this.f7253o = view;
            this.f7251m = null;
            this.f7252n = null;
        } else {
            if (i > 0) {
                this.f7251m = this.f7242b.getText(i);
            } else if (charSequence != null) {
                this.f7251m = charSequence;
            }
            if (i4 > 0) {
                this.f7252n = D.h.getDrawable(this.f7241a, i4);
            } else if (drawable != null) {
                this.f7252n = drawable;
            }
            this.f7253o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.f7254q) {
            this.f7254q = false;
            p(this.f7255r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.f7254q = false;
        this.f7255r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f7242b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f7242b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i5, CharSequence charSequence) {
        return a(i, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i4, int i5, CharSequence charSequence) {
        o a2 = a(i, i4, i5, charSequence);
        SubMenuC0422E subMenuC0422E = new SubMenuC0422E(this.f7241a, this, a2);
        a2.f7280o = subMenuC0422E;
        subMenuC0422E.setHeaderTitle(a2.f7272e);
        return subMenuC0422E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i5, int i6) {
        return a(i, i4, i5, this.f7242b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i5, int i6) {
        return addSubMenu(i, i4, i5, this.f7242b.getString(i6));
    }
}
