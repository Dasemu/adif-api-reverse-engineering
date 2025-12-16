package androidx.appcompat.widget;

import B0.q;
import G.c;
import O.B0;
import O.C0079u;
import O.D0;
import O.InterfaceC0077s;
import O.InterfaceC0078t;
import O.J;
import O.L;
import O.X;
import O.t0;
import O.u0;
import O.v0;
import a.AbstractC0106b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.adif.elcanomovil.R;
import g.T;
import java.util.WeakHashMap;
import k.C0414k;
import kotlin.jvm.internal.IntCompanionObject;
import l.m;
import l.x;
import m.C0458e;
import m.C0460f;
import m.C0472l;
import m.InterfaceC0456d;
import m.InterfaceC0457d0;
import m.InterfaceC0459e0;
import m.Q0;
import m.RunnableC0454c;
import m.V0;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0457d0, InterfaceC0077s, InterfaceC0078t {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2384C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final D0 f2385D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f2386E;

    /* renamed from: A, reason: collision with root package name */
    public final C0079u f2387A;

    /* renamed from: B, reason: collision with root package name */
    public final C0460f f2388B;

    /* renamed from: a, reason: collision with root package name */
    public int f2389a;

    /* renamed from: b, reason: collision with root package name */
    public int f2390b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f2391c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f2392d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0459e0 f2393e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2394f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2395g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2396j;

    /* renamed from: k, reason: collision with root package name */
    public int f2397k;

    /* renamed from: l, reason: collision with root package name */
    public int f2398l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f2399m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f2400n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f2401o;
    public final Rect p;

    /* renamed from: q, reason: collision with root package name */
    public D0 f2402q;

    /* renamed from: r, reason: collision with root package name */
    public D0 f2403r;

    /* renamed from: s, reason: collision with root package name */
    public D0 f2404s;

    /* renamed from: t, reason: collision with root package name */
    public D0 f2405t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0456d f2406u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f2407v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f2408w;

    /* renamed from: x, reason: collision with root package name */
    public final q f2409x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0454c f2410y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0454c f2411z;

    static {
        v0 u0Var = Build.VERSION.SDK_INT >= 30 ? new u0() : new t0();
        u0Var.f(c.b(0, 1, 0, 1));
        f2385D = u0Var.b();
        f2386E = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [O.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [m.f, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2390b = 0;
        this.f2399m = new Rect();
        this.f2400n = new Rect();
        this.f2401o = new Rect();
        this.p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        D0 d02 = D0.f1206b;
        this.f2402q = d02;
        this.f2403r = d02;
        this.f2404s = d02;
        this.f2405t = d02;
        this.f2409x = new q(this, 6);
        this.f2410y = new RunnableC0454c(this, 0);
        this.f2411z = new RunnableC0454c(this, 1);
        i(context);
        this.f2387A = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.f2388B = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z4;
        C0458e c0458e = (C0458e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0458e).leftMargin;
        int i4 = rect.left;
        if (i != i4) {
            ((ViewGroup.MarginLayoutParams) c0458e).leftMargin = i4;
            z4 = true;
        } else {
            z4 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0458e).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0458e).topMargin = i6;
            z4 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) c0458e).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0458e).rightMargin = i8;
            z4 = true;
        }
        if (z3) {
            int i9 = ((ViewGroup.MarginLayoutParams) c0458e).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) c0458e).bottomMargin = i10;
                return true;
            }
        }
        return z4;
    }

    @Override // O.InterfaceC0077s
    public final void a(View view, View view2, int i, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // O.InterfaceC0077s
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // O.InterfaceC0077s
    public final void c(View view, int i, int i4, int[] iArr, int i5) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0458e;
    }

    @Override // O.InterfaceC0078t
    public final void d(View view, int i, int i4, int i5, int i6, int i7, int[] iArr) {
        e(view, i, i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f2394f != null) {
            if (this.f2392d.getVisibility() == 0) {
                i = (int) (this.f2392d.getTranslationY() + this.f2392d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f2394f.setBounds(0, i, getWidth(), this.f2394f.getIntrinsicHeight() + i);
            this.f2394f.draw(canvas);
        }
    }

    @Override // O.InterfaceC0077s
    public final void e(View view, int i, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(view, i, i4, i5, i6);
        }
    }

    @Override // O.InterfaceC0077s
    public final boolean f(View view, View view2, int i, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2392d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0079u c0079u = this.f2387A;
        return c0079u.f1299b | c0079u.f1298a;
    }

    public CharSequence getTitle() {
        k();
        return ((V0) this.f2393e).f7624a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f2410y);
        removeCallbacks(this.f2411z);
        ViewPropertyAnimator viewPropertyAnimator = this.f2408w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2384C);
        this.f2389a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f2394f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f2407v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((V0) this.f2393e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((V0) this.f2393e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0459e0 wrapper;
        if (this.f2391c == null) {
            this.f2391c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f2392d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0459e0) {
                wrapper = (InterfaceC0459e0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f2393e = wrapper;
        }
    }

    public final void l(m mVar, x xVar) {
        k();
        V0 v02 = (V0) this.f2393e;
        C0472l c0472l = v02.f7634m;
        Toolbar toolbar = v02.f7624a;
        if (c0472l == null) {
            C0472l c0472l2 = new C0472l(toolbar.getContext());
            v02.f7634m = c0472l2;
            c0472l2.i = R.id.action_menu_presenter;
        }
        C0472l c0472l3 = v02.f7634m;
        c0472l3.f7680e = xVar;
        if (mVar == null && toolbar.f2480a == null) {
            return;
        }
        toolbar.f();
        m mVar2 = toolbar.f2480a.p;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.f2471L);
            mVar2.r(toolbar.f2472M);
        }
        if (toolbar.f2472M == null) {
            toolbar.f2472M = new Q0(toolbar);
        }
        c0472l3.f7690r = true;
        if (mVar != null) {
            mVar.b(c0472l3, toolbar.f2487j);
            mVar.b(toolbar.f2472M, toolbar.f2487j);
        } else {
            c0472l3.i(toolbar.f2487j, null);
            toolbar.f2472M.i(toolbar.f2487j, null);
            c0472l3.h(true);
            toolbar.f2472M.h(true);
        }
        toolbar.f2480a.setPopupTheme(toolbar.f2488k);
        toolbar.f2480a.setPresenter(c0472l3);
        toolbar.f2471L = c0472l3;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        D0 f2 = D0.f(this, windowInsets);
        boolean g4 = g(this.f2392d, new Rect(f2.b(), f2.d(), f2.c(), f2.a()), false);
        WeakHashMap weakHashMap = X.f1226a;
        Rect rect = this.f2399m;
        L.b(this, f2, rect);
        int i = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        B0 b02 = f2.f1207a;
        D0 l4 = b02.l(i, i4, i5, i6);
        this.f2402q = l4;
        boolean z3 = true;
        if (!this.f2403r.equals(l4)) {
            this.f2403r = this.f2402q;
            g4 = true;
        }
        Rect rect2 = this.f2400n;
        if (rect2.equals(rect)) {
            z3 = g4;
        } else {
            rect2.set(rect);
        }
        if (z3) {
            requestLayout();
        }
        return b02.a().f1207a.c().f1207a.b().e();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = X.f1226a;
        J.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0458e c0458e = (C0458e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) c0458e).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) c0458e).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f4, boolean z3) {
        if (!this.i || !z3) {
            return false;
        }
        this.f2407v.fling(0, 0, 0, (int) f4, 0, 0, IntCompanionObject.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f2407v.getFinalY() > this.f2392d.getHeight()) {
            h();
            this.f2411z.run();
        } else {
            h();
            this.f2410y.run();
        }
        this.f2396j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i5, int i6) {
        int i7 = this.f2397k + i4;
        this.f2397k = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        T t2;
        C0414k c0414k;
        this.f2387A.f1298a = i;
        this.f2397k = getActionBarHideOffset();
        h();
        InterfaceC0456d interfaceC0456d = this.f2406u;
        if (interfaceC0456d == null || (c0414k = (t2 = (T) interfaceC0456d).f6593s) == null) {
            return;
        }
        c0414k.a();
        t2.f6593s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2392d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.f2396j) {
            return;
        }
        if (this.f2397k <= this.f2392d.getHeight()) {
            h();
            postDelayed(this.f2410y, 600L);
        } else {
            h();
            postDelayed(this.f2411z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i4 = this.f2398l ^ i;
        this.f2398l = i;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 256) != 0;
        InterfaceC0456d interfaceC0456d = this.f2406u;
        if (interfaceC0456d != null) {
            T t2 = (T) interfaceC0456d;
            t2.f6590o = !z4;
            if (z3 || !z4) {
                if (t2.p) {
                    t2.p = false;
                    t2.s(true);
                }
            } else if (!t2.p) {
                t2.p = true;
                t2.s(true);
            }
        }
        if ((i4 & 256) == 0 || this.f2406u == null) {
            return;
        }
        WeakHashMap weakHashMap = X.f1226a;
        J.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2390b = i;
        InterfaceC0456d interfaceC0456d = this.f2406u;
        if (interfaceC0456d != null) {
            ((T) interfaceC0456d).f6589n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f2392d.setTranslationY(-Math.max(0, Math.min(i, this.f2392d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0456d interfaceC0456d) {
        this.f2406u = interfaceC0456d;
        if (getWindowToken() != null) {
            ((T) this.f2406u).f6589n = this.f2390b;
            int i = this.f2398l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = X.f1226a;
                J.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.h = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.i) {
            this.i = z3;
            if (z3) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        V0 v02 = (V0) this.f2393e;
        v02.f7627d = i != 0 ? AbstractC0106b.m(v02.f7624a.getContext(), i) : null;
        v02.c();
    }

    public void setLogo(int i) {
        k();
        V0 v02 = (V0) this.f2393e;
        v02.f7628e = i != 0 ? AbstractC0106b.m(v02.f7624a.getContext(), i) : null;
        v02.c();
    }

    public void setOverlayMode(boolean z3) {
        this.f2395g = z3;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i) {
    }

    @Override // m.InterfaceC0457d0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((V0) this.f2393e).f7632k = callback;
    }

    @Override // m.InterfaceC0457d0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        V0 v02 = (V0) this.f2393e;
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

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        V0 v02 = (V0) this.f2393e;
        v02.f7627d = drawable;
        v02.c();
    }
}
