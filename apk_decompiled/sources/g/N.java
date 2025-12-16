package g;

import O.X;
import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C0472l;
import m.Q0;
import m.V0;

/* loaded from: classes.dex */
public final class N extends AbstractC0354a {

    /* renamed from: a, reason: collision with root package name */
    public final V0 f6556a;

    /* renamed from: b, reason: collision with root package name */
    public final y f6557b;

    /* renamed from: c, reason: collision with root package name */
    public final M f6558c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6559d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6560e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6561f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6562g = new ArrayList();
    public final F0.c h = new F0.c(this, 7);

    public N(Toolbar toolbar, CharSequence charSequence, y yVar) {
        M m4 = new M(this);
        V0 v02 = new V0(toolbar, false);
        this.f6556a = v02;
        yVar.getClass();
        this.f6557b = yVar;
        v02.f7632k = yVar;
        toolbar.setOnMenuItemClickListener(m4);
        if (!v02.f7630g) {
            v02.h = charSequence;
            if ((v02.f7625b & 8) != 0) {
                Toolbar toolbar2 = v02.f7624a;
                toolbar2.setTitle(charSequence);
                if (v02.f7630g) {
                    X.k(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f6558c = new M(this);
    }

    @Override // g.AbstractC0354a
    public final boolean a() {
        C0472l c0472l;
        ActionMenuView actionMenuView = this.f6556a.f7624a.f2480a;
        return (actionMenuView == null || (c0472l = actionMenuView.f2416t) == null || !c0472l.c()) ? false : true;
    }

    @Override // g.AbstractC0354a
    public final boolean b() {
        l.o oVar;
        Q0 q02 = this.f6556a.f7624a.f2472M;
        if (q02 == null || (oVar = q02.f7604b) == null) {
            return false;
        }
        if (q02 == null) {
            oVar = null;
        }
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // g.AbstractC0354a
    public final void c(boolean z3) {
        if (z3 == this.f6561f) {
            return;
        }
        this.f6561f = z3;
        ArrayList arrayList = this.f6562g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // g.AbstractC0354a
    public final int d() {
        return this.f6556a.f7625b;
    }

    @Override // g.AbstractC0354a
    public final Context e() {
        return this.f6556a.f7624a.getContext();
    }

    @Override // g.AbstractC0354a
    public final boolean f() {
        V0 v02 = this.f6556a;
        Toolbar toolbar = v02.f7624a;
        F0.c cVar = this.h;
        toolbar.removeCallbacks(cVar);
        Toolbar toolbar2 = v02.f7624a;
        WeakHashMap weakHashMap = X.f1226a;
        toolbar2.postOnAnimation(cVar);
        return true;
    }

    @Override // g.AbstractC0354a
    public final void g() {
    }

    @Override // g.AbstractC0354a
    public final void h() {
        this.f6556a.f7624a.removeCallbacks(this.h);
    }

    @Override // g.AbstractC0354a
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu p = p();
        if (p == null) {
            return false;
        }
        p.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return p.performShortcut(i, keyEvent, 0);
    }

    @Override // g.AbstractC0354a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // g.AbstractC0354a
    public final boolean k() {
        return this.f6556a.f7624a.v();
    }

    @Override // g.AbstractC0354a
    public final void l(boolean z3) {
    }

    @Override // g.AbstractC0354a
    public final void m(boolean z3) {
    }

    @Override // g.AbstractC0354a
    public final void n(CharSequence charSequence) {
        V0 v02 = this.f6556a;
        if (v02.f7630g) {
            return;
        }
        v02.h = charSequence;
        if ((v02.f7625b & 8) != 0) {
            Toolbar toolbar = v02.f7624a;
            toolbar.setTitle(charSequence);
            if (v02.f7630g) {
                X.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu p() {
        boolean z3 = this.f6560e;
        V0 v02 = this.f6556a;
        if (!z3) {
            M.g gVar = new M.g(this);
            M m4 = new M(this);
            Toolbar toolbar = v02.f7624a;
            toolbar.f2473N = gVar;
            toolbar.f2474O = m4;
            ActionMenuView actionMenuView = toolbar.f2480a;
            if (actionMenuView != null) {
                actionMenuView.f2417u = gVar;
                actionMenuView.f2418v = m4;
            }
            this.f6560e = true;
        }
        return v02.f7624a.getMenu();
    }
}
