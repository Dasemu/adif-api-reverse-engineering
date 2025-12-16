package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.adif.elcanomovil.R;
import m.C0;
import m.C0475m0;
import m.C0496x0;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0421D extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f7162b;

    /* renamed from: c, reason: collision with root package name */
    public final m f7163c;

    /* renamed from: d, reason: collision with root package name */
    public final C0432j f7164d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7165e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7166f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7167g;
    public final C0 h;

    /* renamed from: k, reason: collision with root package name */
    public v f7169k;

    /* renamed from: l, reason: collision with root package name */
    public View f7170l;

    /* renamed from: m, reason: collision with root package name */
    public View f7171m;

    /* renamed from: n, reason: collision with root package name */
    public x f7172n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f7173o;
    public boolean p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7174q;

    /* renamed from: r, reason: collision with root package name */
    public int f7175r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7177t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0426d i = new ViewTreeObserverOnGlobalLayoutListenerC0426d(this, 1);

    /* renamed from: j, reason: collision with root package name */
    public final I2.o f7168j = new I2.o(this, 2);

    /* renamed from: s, reason: collision with root package name */
    public int f7176s = 0;

    /* JADX WARN: Type inference failed for: r6v1, types: [m.x0, m.C0] */
    public ViewOnKeyListenerC0421D(int i, Context context, View view, m mVar, boolean z3) {
        this.f7162b = context;
        this.f7163c = mVar;
        this.f7165e = z3;
        this.f7164d = new C0432j(mVar, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f7167g = i;
        Resources resources = context.getResources();
        this.f7166f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f7170l = view;
        this.h = new C0496x0(context, null, i);
        mVar.b(this, context);
    }

    @Override // l.InterfaceC0420C
    public final boolean a() {
        return !this.p && this.h.f7782z.isShowing();
    }

    @Override // l.y
    public final void b(m mVar, boolean z3) {
        if (mVar != this.f7163c) {
            return;
        }
        dismiss();
        x xVar = this.f7172n;
        if (xVar != null) {
            xVar.b(mVar, z3);
        }
    }

    @Override // l.InterfaceC0420C
    public final void c() {
        View view;
        if (a()) {
            return;
        }
        if (this.p || (view = this.f7170l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f7171m = view;
        C0 c02 = this.h;
        c02.f7782z.setOnDismissListener(this);
        c02.p = this;
        c02.f7781y = true;
        c02.f7782z.setFocusable(true);
        View view2 = this.f7171m;
        boolean z3 = this.f7173o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f7173o = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f7168j);
        c02.f7772o = view2;
        c02.f7769l = this.f7176s;
        boolean z4 = this.f7174q;
        Context context = this.f7162b;
        C0432j c0432j = this.f7164d;
        if (!z4) {
            this.f7175r = u.o(c0432j, context, this.f7166f);
            this.f7174q = true;
        }
        c02.r(this.f7175r);
        c02.f7782z.setInputMethodMode(2);
        Rect rect = this.f7301a;
        c02.f7780x = rect != null ? new Rect(rect) : null;
        c02.c();
        C0475m0 c0475m0 = c02.f7762c;
        c0475m0.setOnKeyListener(this);
        if (this.f7177t) {
            m mVar = this.f7163c;
            if (mVar.f7251m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0475m0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f7251m);
                }
                frameLayout.setEnabled(false);
                c0475m0.addHeaderView(frameLayout, null, false);
            }
        }
        c02.p(c0432j);
        c02.c();
    }

    @Override // l.y
    public final void d(Parcelable parcelable) {
    }

    @Override // l.InterfaceC0420C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // l.y
    public final void e(x xVar) {
        this.f7172n = xVar;
    }

    @Override // l.InterfaceC0420C
    public final C0475m0 f() {
        return this.h.f7762c;
    }

    @Override // l.y
    public final void h(boolean z3) {
        this.f7174q = false;
        C0432j c0432j = this.f7164d;
        if (c0432j != null) {
            c0432j.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final boolean j() {
        return false;
    }

    @Override // l.y
    public final Parcelable k() {
        return null;
    }

    @Override // l.y
    public final boolean l(SubMenuC0422E subMenuC0422E) {
        if (subMenuC0422E.hasVisibleItems()) {
            View view = this.f7171m;
            w wVar = new w(this.f7167g, this.f7162b, view, subMenuC0422E, this.f7165e);
            x xVar = this.f7172n;
            wVar.h = xVar;
            u uVar = wVar.i;
            if (uVar != null) {
                uVar.e(xVar);
            }
            boolean w3 = u.w(subMenuC0422E);
            wVar.f7309g = w3;
            u uVar2 = wVar.i;
            if (uVar2 != null) {
                uVar2.q(w3);
            }
            wVar.f7310j = this.f7169k;
            this.f7169k = null;
            this.f7163c.c(false);
            C0 c02 = this.h;
            int i = c02.f7765f;
            int n4 = c02.n();
            if ((Gravity.getAbsoluteGravity(this.f7176s, this.f7170l.getLayoutDirection()) & 7) == 5) {
                i += this.f7170l.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f7307e != null) {
                    wVar.d(i, n4, true, true);
                }
            }
            x xVar2 = this.f7172n;
            if (xVar2 != null) {
                xVar2.f(subMenuC0422E);
            }
            return true;
        }
        return false;
    }

    @Override // l.u
    public final void n(m mVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f7163c.c(true);
        ViewTreeObserver viewTreeObserver = this.f7173o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f7173o = this.f7171m.getViewTreeObserver();
            }
            this.f7173o.removeGlobalOnLayoutListener(this.i);
            this.f7173o = null;
        }
        this.f7171m.removeOnAttachStateChangeListener(this.f7168j);
        v vVar = this.f7169k;
        if (vVar != null) {
            vVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.u
    public final void p(View view) {
        this.f7170l = view;
    }

    @Override // l.u
    public final void q(boolean z3) {
        this.f7164d.f7236c = z3;
    }

    @Override // l.u
    public final void r(int i) {
        this.f7176s = i;
    }

    @Override // l.u
    public final void s(int i) {
        this.h.f7765f = i;
    }

    @Override // l.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f7169k = (v) onDismissListener;
    }

    @Override // l.u
    public final void u(boolean z3) {
        this.f7177t = z3;
    }

    @Override // l.u
    public final void v(int i) {
        this.h.i(i);
    }
}
