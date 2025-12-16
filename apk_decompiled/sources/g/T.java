package g;

import O.X;
import O.h0;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f.AbstractC0336a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.AbstractC0405b;
import k.C0413j;
import k.C0414k;
import k.InterfaceC0404a;
import m.InterfaceC0456d;
import m.InterfaceC0459e0;
import m.Q0;
import m.V0;

/* loaded from: classes.dex */
public final class T extends AbstractC0354a implements InterfaceC0456d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f6576y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f6577z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f6578a;

    /* renamed from: b, reason: collision with root package name */
    public Context f6579b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f6580c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f6581d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0459e0 f6582e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f6583f;

    /* renamed from: g, reason: collision with root package name */
    public final View f6584g;
    public boolean h;
    public S i;

    /* renamed from: j, reason: collision with root package name */
    public S f6585j;

    /* renamed from: k, reason: collision with root package name */
    public F.i f6586k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6587l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f6588m;

    /* renamed from: n, reason: collision with root package name */
    public int f6589n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6590o;
    public boolean p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6591q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6592r;

    /* renamed from: s, reason: collision with root package name */
    public C0414k f6593s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6594t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6595u;

    /* renamed from: v, reason: collision with root package name */
    public final Q f6596v;

    /* renamed from: w, reason: collision with root package name */
    public final Q f6597w;

    /* renamed from: x, reason: collision with root package name */
    public final A.a f6598x;

    public T(Activity activity, boolean z3) {
        new ArrayList();
        this.f6588m = new ArrayList();
        this.f6589n = 0;
        this.f6590o = true;
        this.f6592r = true;
        this.f6596v = new Q(this, 0);
        this.f6597w = new Q(this, 1);
        this.f6598x = new A.a(this, 29);
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z3) {
            return;
        }
        this.f6584g = decorView.findViewById(R.id.content);
    }

    @Override // g.AbstractC0354a
    public final boolean b() {
        Q0 q02;
        InterfaceC0459e0 interfaceC0459e0 = this.f6582e;
        if (interfaceC0459e0 == null || (q02 = ((V0) interfaceC0459e0).f7624a.f2472M) == null || q02.f7604b == null) {
            return false;
        }
        Q0 q03 = ((V0) interfaceC0459e0).f7624a.f2472M;
        l.o oVar = q03 == null ? null : q03.f7604b;
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // g.AbstractC0354a
    public final void c(boolean z3) {
        if (z3 == this.f6587l) {
            return;
        }
        this.f6587l = z3;
        ArrayList arrayList = this.f6588m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // g.AbstractC0354a
    public final int d() {
        return ((V0) this.f6582e).f7625b;
    }

    @Override // g.AbstractC0354a
    public final Context e() {
        if (this.f6579b == null) {
            TypedValue typedValue = new TypedValue();
            this.f6578a.getTheme().resolveAttribute(com.adif.elcanomovil.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f6579b = new ContextThemeWrapper(this.f6578a, i);
            } else {
                this.f6579b = this.f6578a;
            }
        }
        return this.f6579b;
    }

    @Override // g.AbstractC0354a
    public final void g() {
        r(this.f6578a.getResources().getBoolean(com.adif.elcanomovil.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // g.AbstractC0354a
    public final boolean i(int i, KeyEvent keyEvent) {
        l.m mVar;
        S s4 = this.i;
        if (s4 == null || (mVar = s4.f6572d) == null) {
            return false;
        }
        mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return mVar.performShortcut(i, keyEvent, 0);
    }

    @Override // g.AbstractC0354a
    public final void l(boolean z3) {
        if (this.h) {
            return;
        }
        int i = z3 ? 4 : 0;
        V0 v02 = (V0) this.f6582e;
        int i4 = v02.f7625b;
        this.h = true;
        v02.a((i & 4) | (i4 & (-5)));
    }

    @Override // g.AbstractC0354a
    public final void m(boolean z3) {
        C0414k c0414k;
        this.f6594t = z3;
        if (z3 || (c0414k = this.f6593s) == null) {
            return;
        }
        c0414k.a();
    }

    @Override // g.AbstractC0354a
    public final void n(CharSequence charSequence) {
        V0 v02 = (V0) this.f6582e;
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

    @Override // g.AbstractC0354a
    public final AbstractC0405b o(F.i iVar) {
        S s4 = this.i;
        if (s4 != null) {
            s4.a();
        }
        this.f6580c.setHideOnContentScrollEnabled(false);
        this.f6583f.e();
        S s5 = new S(this, this.f6583f.getContext(), iVar);
        l.m mVar = s5.f6572d;
        mVar.w();
        try {
            if (!((InterfaceC0404a) s5.f6573e.f490b).i(s5, mVar)) {
                return null;
            }
            this.i = s5;
            s5.h();
            this.f6583f.c(s5);
            p(true);
            return s5;
        } finally {
            mVar.v();
        }
    }

    public final void p(boolean z3) {
        h0 i;
        h0 h0Var;
        if (z3) {
            if (!this.f6591q) {
                this.f6591q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6580c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                s(false);
            }
        } else if (this.f6591q) {
            this.f6591q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6580c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            s(false);
        }
        if (!this.f6581d.isLaidOut()) {
            if (z3) {
                ((V0) this.f6582e).f7624a.setVisibility(4);
                this.f6583f.setVisibility(0);
                return;
            } else {
                ((V0) this.f6582e).f7624a.setVisibility(0);
                this.f6583f.setVisibility(8);
                return;
            }
        }
        if (z3) {
            V0 v02 = (V0) this.f6582e;
            i = X.a(v02.f7624a);
            i.a(BitmapDescriptorFactory.HUE_RED);
            i.c(100L);
            i.d(new C0413j(v02, 4));
            h0Var = this.f6583f.i(0, 200L);
        } else {
            V0 v03 = (V0) this.f6582e;
            h0 a2 = X.a(v03.f7624a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new C0413j(v03, 0));
            i = this.f6583f.i(8, 100L);
            h0Var = a2;
        }
        C0414k c0414k = new C0414k();
        ArrayList arrayList = c0414k.f7011a;
        arrayList.add(i);
        View view = (View) i.f1255a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) h0Var.f1255a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(h0Var);
        c0414k.b();
    }

    public final void q(View view) {
        InterfaceC0459e0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.adif.elcanomovil.R.id.decor_content_parent);
        this.f6580c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.adif.elcanomovil.R.id.action_bar);
        if (findViewById instanceof InterfaceC0459e0) {
            wrapper = (InterfaceC0459e0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f6582e = wrapper;
        this.f6583f = (ActionBarContextView) view.findViewById(com.adif.elcanomovil.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.adif.elcanomovil.R.id.action_bar_container);
        this.f6581d = actionBarContainer;
        InterfaceC0459e0 interfaceC0459e0 = this.f6582e;
        if (interfaceC0459e0 == null || this.f6583f == null || actionBarContainer == null) {
            throw new IllegalStateException(T.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((V0) interfaceC0459e0).f7624a.getContext();
        this.f6578a = context;
        if ((((V0) this.f6582e).f7625b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f6582e.getClass();
        r(context.getResources().getBoolean(com.adif.elcanomovil.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f6578a.obtainStyledAttributes(null, AbstractC0336a.f6422a, com.adif.elcanomovil.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6580c;
            if (!actionBarOverlayLayout2.f2395g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f6595u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f6581d;
            WeakHashMap weakHashMap = X.f1226a;
            O.L.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void r(boolean z3) {
        if (z3) {
            this.f6581d.setTabContainer(null);
            ((V0) this.f6582e).getClass();
        } else {
            ((V0) this.f6582e).getClass();
            this.f6581d.setTabContainer(null);
        }
        this.f6582e.getClass();
        ((V0) this.f6582e).f7624a.setCollapsible(false);
        this.f6580c.setHasNonEmbeddedTabs(false);
    }

    public final void s(boolean z3) {
        boolean z4 = this.f6591q || !this.p;
        View view = this.f6584g;
        A.a aVar = this.f6598x;
        if (!z4) {
            if (this.f6592r) {
                this.f6592r = false;
                C0414k c0414k = this.f6593s;
                if (c0414k != null) {
                    c0414k.a();
                }
                int i = this.f6589n;
                Q q4 = this.f6596v;
                if (i != 0 || (!this.f6594t && !z3)) {
                    q4.a();
                    return;
                }
                this.f6581d.setAlpha(1.0f);
                this.f6581d.setTransitioning(true);
                C0414k c0414k2 = new C0414k();
                float f2 = -this.f6581d.getHeight();
                if (z3) {
                    this.f6581d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                h0 a2 = X.a(this.f6581d);
                a2.e(f2);
                View view2 = (View) a2.f1255a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(aVar != null ? new I2.h(aVar, view2) : null);
                }
                boolean z5 = c0414k2.f7015e;
                ArrayList arrayList = c0414k2.f7011a;
                if (!z5) {
                    arrayList.add(a2);
                }
                if (this.f6590o && view != null) {
                    h0 a4 = X.a(view);
                    a4.e(f2);
                    if (!c0414k2.f7015e) {
                        arrayList.add(a4);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f6576y;
                boolean z6 = c0414k2.f7015e;
                if (!z6) {
                    c0414k2.f7013c = accelerateInterpolator;
                }
                if (!z6) {
                    c0414k2.f7012b = 250L;
                }
                if (!z6) {
                    c0414k2.f7014d = q4;
                }
                this.f6593s = c0414k2;
                c0414k2.b();
                return;
            }
            return;
        }
        if (this.f6592r) {
            return;
        }
        this.f6592r = true;
        C0414k c0414k3 = this.f6593s;
        if (c0414k3 != null) {
            c0414k3.a();
        }
        this.f6581d.setVisibility(0);
        int i4 = this.f6589n;
        Q q5 = this.f6597w;
        if (i4 == 0 && (this.f6594t || z3)) {
            this.f6581d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            float f4 = -this.f6581d.getHeight();
            if (z3) {
                this.f6581d.getLocationInWindow(new int[]{0, 0});
                f4 -= r12[1];
            }
            this.f6581d.setTranslationY(f4);
            C0414k c0414k4 = new C0414k();
            h0 a5 = X.a(this.f6581d);
            a5.e(BitmapDescriptorFactory.HUE_RED);
            View view3 = (View) a5.f1255a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(aVar != null ? new I2.h(aVar, view3) : null);
            }
            boolean z7 = c0414k4.f7015e;
            ArrayList arrayList2 = c0414k4.f7011a;
            if (!z7) {
                arrayList2.add(a5);
            }
            if (this.f6590o && view != null) {
                view.setTranslationY(f4);
                h0 a6 = X.a(view);
                a6.e(BitmapDescriptorFactory.HUE_RED);
                if (!c0414k4.f7015e) {
                    arrayList2.add(a6);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f6577z;
            boolean z8 = c0414k4.f7015e;
            if (!z8) {
                c0414k4.f7013c = decelerateInterpolator;
            }
            if (!z8) {
                c0414k4.f7012b = 250L;
            }
            if (!z8) {
                c0414k4.f7014d = q5;
            }
            this.f6593s = c0414k4;
            c0414k4.b();
        } else {
            this.f6581d.setAlpha(1.0f);
            this.f6581d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            if (this.f6590o && view != null) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            q5.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6580c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = X.f1226a;
            O.J.c(actionBarOverlayLayout);
        }
    }

    public T(Dialog dialog) {
        new ArrayList();
        this.f6588m = new ArrayList();
        this.f6589n = 0;
        this.f6590o = true;
        this.f6592r = true;
        this.f6596v = new Q(this, 0);
        this.f6597w = new Q(this, 1);
        this.f6598x = new A.a(this, 29);
        q(dialog.getWindow().getDecorView());
    }
}
