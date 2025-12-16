package k;

import O.AbstractC0075p;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.o;
import l.p;
import l.t;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411h {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f6973A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f6974B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C0412i f6977E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f6978a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f6985j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f6986k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f6987l;

    /* renamed from: m, reason: collision with root package name */
    public int f6988m;

    /* renamed from: n, reason: collision with root package name */
    public char f6989n;

    /* renamed from: o, reason: collision with root package name */
    public int f6990o;
    public char p;

    /* renamed from: q, reason: collision with root package name */
    public int f6991q;

    /* renamed from: r, reason: collision with root package name */
    public int f6992r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6993s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6994t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6995u;

    /* renamed from: v, reason: collision with root package name */
    public int f6996v;

    /* renamed from: w, reason: collision with root package name */
    public int f6997w;

    /* renamed from: x, reason: collision with root package name */
    public String f6998x;

    /* renamed from: y, reason: collision with root package name */
    public String f6999y;

    /* renamed from: z, reason: collision with root package name */
    public p f7000z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f6975C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f6976D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f6979b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f6980c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f6981d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f6982e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6983f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6984g = true;

    public C0411h(C0412i c0412i, Menu menu) {
        this.f6977E = c0412i;
        this.f6978a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f6977E.f7005c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.view.MenuItem$OnMenuItemClickListener, k.g, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z3 = false;
        menuItem.setChecked(this.f6993s).setVisible(this.f6994t).setEnabled(this.f6995u).setCheckable(this.f6992r >= 1).setTitleCondensed(this.f6987l).setIcon(this.f6988m);
        int i = this.f6996v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f6999y;
        C0412i c0412i = this.f6977E;
        if (str != null) {
            if (c0412i.f7005c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0412i.f7006d == null) {
                c0412i.f7006d = C0412i.a(c0412i.f7005c);
            }
            Object obj = c0412i.f7006d;
            String str2 = this.f6999y;
            ?? obj2 = new Object();
            obj2.f6971a = obj;
            Class<?> cls = obj.getClass();
            try {
                obj2.f6972b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0410g.f6970c);
                menuItem.setOnMenuItemClickListener(obj2);
            } catch (Exception e4) {
                StringBuilder p = com.google.android.gms.measurement.internal.a.p("Couldn't resolve menu item onClick handler ", str2, " in class ");
                p.append(cls.getName());
                InflateException inflateException = new InflateException(p.toString());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        if (this.f6992r >= 2) {
            if (menuItem instanceof o) {
                ((o) menuItem).f(true);
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                try {
                    Method method = tVar.f7300d;
                    I.a aVar = tVar.f7299c;
                    if (method == null) {
                        tVar.f7300d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f7300d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e5) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e5);
                }
            }
        }
        String str3 = this.f6998x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0412i.f7001e, c0412i.f7003a));
            z3 = true;
        }
        int i4 = this.f6997w;
        if (i4 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        p pVar = this.f7000z;
        if (pVar != null) {
            if (menuItem instanceof I.a) {
                ((I.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f6973A;
        boolean z4 = menuItem instanceof I.a;
        if (z4) {
            ((I.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0075p.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f6974B;
        if (z4) {
            ((I.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0075p.m(menuItem, charSequence2);
        }
        char c4 = this.f6989n;
        int i5 = this.f6990o;
        if (z4) {
            ((I.a) menuItem).setAlphabeticShortcut(c4, i5);
        } else {
            AbstractC0075p.g(menuItem, c4, i5);
        }
        char c5 = this.p;
        int i6 = this.f6991q;
        if (z4) {
            ((I.a) menuItem).setNumericShortcut(c5, i6);
        } else {
            AbstractC0075p.k(menuItem, c5, i6);
        }
        PorterDuff.Mode mode = this.f6976D;
        if (mode != null) {
            if (z4) {
                ((I.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0075p.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f6975C;
        if (colorStateList != null) {
            if (z4) {
                ((I.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0075p.i(menuItem, colorStateList);
            }
        }
    }
}
