package androidx.appcompat.widget;

import F0.c;
import M.g;
import O.C0074o;
import O.InterfaceC0070k;
import O.InterfaceC0076q;
import O.S;
import O.X;
import R0.h;
import W.b;
import a.AbstractC0106b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0140c0;
import com.adif.elcanomovil.R;
import com.google.android.material.datepicker.j;
import f.AbstractC0336a;
import g.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.C0412i;
import kotlin.jvm.internal.IntCompanionObject;
import l.m;
import l.o;
import m.C0472l;
import m.C0493w;
import m.G0;
import m.InterfaceC0459e0;
import m.N0;
import m.O0;
import m.P0;
import m.Q0;
import m.R0;
import m.S0;
import m.T0;
import m.V0;
import m.W;
import m.W0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0070k {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2461A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2462B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2463C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f2464D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f2465E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f2466F;

    /* renamed from: G, reason: collision with root package name */
    public final C0074o f2467G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f2468H;

    /* renamed from: I, reason: collision with root package name */
    public S0 f2469I;
    public final O0 J;

    /* renamed from: K, reason: collision with root package name */
    public V0 f2470K;

    /* renamed from: L, reason: collision with root package name */
    public C0472l f2471L;

    /* renamed from: M, reason: collision with root package name */
    public Q0 f2472M;

    /* renamed from: N, reason: collision with root package name */
    public g f2473N;

    /* renamed from: O, reason: collision with root package name */
    public M f2474O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2475P;

    /* renamed from: Q, reason: collision with root package name */
    public OnBackInvokedCallback f2476Q;

    /* renamed from: R, reason: collision with root package name */
    public OnBackInvokedDispatcher f2477R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2478S;

    /* renamed from: T, reason: collision with root package name */
    public final c f2479T;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f2480a;

    /* renamed from: b, reason: collision with root package name */
    public W f2481b;

    /* renamed from: c, reason: collision with root package name */
    public W f2482c;

    /* renamed from: d, reason: collision with root package name */
    public C0493w f2483d;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatImageView f2484e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f2485f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f2486g;
    public C0493w h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public Context f2487j;

    /* renamed from: k, reason: collision with root package name */
    public int f2488k;

    /* renamed from: l, reason: collision with root package name */
    public int f2489l;

    /* renamed from: m, reason: collision with root package name */
    public int f2490m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2491n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2492o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public int f2493q;

    /* renamed from: r, reason: collision with root package name */
    public int f2494r;

    /* renamed from: s, reason: collision with root package name */
    public int f2495s;

    /* renamed from: t, reason: collision with root package name */
    public G0 f2496t;

    /* renamed from: u, reason: collision with root package name */
    public int f2497u;

    /* renamed from: v, reason: collision with root package name */
    public int f2498v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2499w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f2500x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f2501y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2502z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0412i(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, m.R0] */
    public static R0 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f7607b = 0;
        marginLayoutParams.f7606a = 8388627;
        return marginLayoutParams;
    }

    public static R0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof R0;
        if (z3) {
            R0 r02 = (R0) layoutParams;
            R0 r03 = new R0(r02);
            r03.f7607b = 0;
            r03.f7607b = r02.f7607b;
            return r03;
        }
        if (z3) {
            R0 r04 = new R0((R0) layoutParams);
            r04.f7607b = 0;
            return r04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            R0 r05 = new R0(layoutParams);
            r05.f7607b = 0;
            return r05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        R0 r06 = new R0(marginLayoutParams);
        r06.f7607b = 0;
        ((ViewGroup.MarginLayoutParams) r06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) r06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) r06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) r06).bottomMargin = marginLayoutParams.bottomMargin;
        return r06;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z3) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                R0 r02 = (R0) childAt.getLayoutParams();
                if (r02.f7607b == 0 && u(childAt)) {
                    int i5 = r02.f7606a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            R0 r03 = (R0) childAt2.getLayoutParams();
            if (r03.f7607b == 0 && u(childAt2)) {
                int i7 = r03.f7606a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i7, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // O.InterfaceC0070k
    public final void addMenuProvider(InterfaceC0076q interfaceC0076q) {
        C0074o c0074o = this.f2467G;
        c0074o.f1276b.add(interfaceC0076q);
        c0074o.f1275a.run();
    }

    public final void b(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        R0 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (R0) layoutParams;
        h.f7607b = 1;
        if (!z3 || this.i == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.f2465E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            C0493w c0493w = new C0493w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = c0493w;
            c0493w.setImageDrawable(this.f2485f);
            this.h.setContentDescription(this.f2486g);
            R0 h = h();
            h.f7606a = (this.f2491n & 112) | 8388611;
            h.f7607b = 2;
            this.h.setLayoutParams(h);
            this.h.setOnClickListener(new j(this, 3));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof R0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [m.G0, java.lang.Object] */
    public final void d() {
        if (this.f2496t == null) {
            ?? obj = new Object();
            obj.f7520a = 0;
            obj.f7521b = 0;
            obj.f7522c = IntCompanionObject.MIN_VALUE;
            obj.f7523d = IntCompanionObject.MIN_VALUE;
            obj.f7524e = 0;
            obj.f7525f = 0;
            obj.f7526g = false;
            obj.h = false;
            this.f2496t = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f2480a;
        if (actionMenuView.p == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.f2472M == null) {
                this.f2472M = new Q0(this);
            }
            this.f2480a.setExpandedActionViewsExclusive(true);
            mVar.b(this.f2472M, this.f2487j);
            w();
        }
    }

    public final void f() {
        if (this.f2480a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f2480a = actionMenuView;
            actionMenuView.setPopupTheme(this.f2488k);
            this.f2480a.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.f2480a;
            g gVar = this.f2473N;
            O0 o02 = new O0(this);
            actionMenuView2.f2417u = gVar;
            actionMenuView2.f2418v = o02;
            R0 h = h();
            h.f7606a = (this.f2491n & 112) | 8388613;
            this.f2480a.setLayoutParams(h);
            b(this.f2480a, false);
        }
    }

    public final void g() {
        if (this.f2483d == null) {
            this.f2483d = new C0493w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            R0 h = h();
            h.f7606a = (this.f2491n & 112) | 8388611;
            this.f2483d.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0493w c0493w = this.h;
        if (c0493w != null) {
            return c0493w.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0493w c0493w = this.h;
        if (c0493w != null) {
            return c0493w.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        G0 g02 = this.f2496t;
        if (g02 != null) {
            return g02.f7526g ? g02.f7520a : g02.f7521b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f2498v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        G0 g02 = this.f2496t;
        if (g02 != null) {
            return g02.f7520a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        G0 g02 = this.f2496t;
        if (g02 != null) {
            return g02.f7521b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        G0 g02 = this.f2496t;
        if (g02 != null) {
            return g02.f7526g ? g02.f7521b : g02.f7520a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f2497u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f2480a;
        return (actionMenuView == null || (mVar = actionMenuView.p) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f2498v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2497u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f2484e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f2484e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f2480a.getMenu();
    }

    public View getNavButtonView() {
        return this.f2483d;
    }

    public CharSequence getNavigationContentDescription() {
        C0493w c0493w = this.f2483d;
        if (c0493w != null) {
            return c0493w.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0493w c0493w = this.f2483d;
        if (c0493w != null) {
            return c0493w.getDrawable();
        }
        return null;
    }

    public C0472l getOuterActionMenuPresenter() {
        return this.f2471L;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f2480a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2487j;
    }

    public int getPopupTheme() {
        return this.f2488k;
    }

    public CharSequence getSubtitle() {
        return this.f2501y;
    }

    public final TextView getSubtitleTextView() {
        return this.f2482c;
    }

    public CharSequence getTitle() {
        return this.f2500x;
    }

    public int getTitleMarginBottom() {
        return this.f2495s;
    }

    public int getTitleMarginEnd() {
        return this.f2493q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.f2494r;
    }

    public final TextView getTitleTextView() {
        return this.f2481b;
    }

    public InterfaceC0459e0 getWrapper() {
        if (this.f2470K == null) {
            this.f2470K = new V0(this, true);
        }
        return this.f2470K;
    }

    public final int j(View view, int i) {
        R0 r02 = (R0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i5 = r02.f7606a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.f2499w & 112;
        }
        if (i5 == 48) {
            return getPaddingTop() - i4;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) r02).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) r02).topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) r02).bottomMargin;
            if (i8 < i9) {
                i6 = Math.max(0, i6 - (i9 - i8));
            }
        }
        return paddingTop + i6;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.f2468H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.f2467G.f1276b.iterator();
        while (it2.hasNext()) {
            ((C0140c0) ((InterfaceC0076q) it2.next())).f3105a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f2468H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f2465E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2479T);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2463C = false;
        }
        if (!this.f2463C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2463C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f2463C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c8 A[LOOP:2: B:47:0x02c6->B:48:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0318 A[LOOP:3: B:56:0x0316->B:57:0x0318, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        char c4;
        Object[] objArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c4 = 0;
        } else {
            c4 = 1;
            objArr = false;
        }
        if (u(this.f2483d)) {
            t(this.f2483d, i, 0, i4, this.f2492o);
            i5 = k(this.f2483d) + this.f2483d.getMeasuredWidth();
            i6 = Math.max(0, l(this.f2483d) + this.f2483d.getMeasuredHeight());
            i7 = View.combineMeasuredStates(0, this.f2483d.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (u(this.h)) {
            t(this.h, i, 0, i4, this.f2492o);
            i5 = k(this.h) + this.h.getMeasuredWidth();
            i6 = Math.max(i6, l(this.h) + this.h.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        Object[] objArr2 = objArr;
        int[] iArr = this.f2466F;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (u(this.f2480a)) {
            t(this.f2480a, i, max, i4, this.f2492o);
            i8 = k(this.f2480a) + this.f2480a.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f2480a) + this.f2480a.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f2480a.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i8);
        iArr[c4] = Math.max(0, currentContentInsetEnd - i8);
        if (u(this.i)) {
            max3 += s(this.i, i, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.i) + this.i.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.i.getMeasuredState());
        }
        if (u(this.f2484e)) {
            max3 += s(this.f2484e, i, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f2484e) + this.f2484e.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f2484e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((R0) childAt.getLayoutParams()).f7607b == 0 && u(childAt)) {
                max3 += s(childAt, i, max3, i4, 0, iArr);
                int max4 = Math.max(i6, l(childAt) + childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
                i6 = max4;
            } else {
                max3 = max3;
            }
        }
        int i14 = max3;
        int i15 = this.f2494r + this.f2495s;
        int i16 = this.p + this.f2493q;
        if (u(this.f2481b)) {
            s(this.f2481b, i, i14 + i16, i4, i15, iArr);
            int k4 = k(this.f2481b) + this.f2481b.getMeasuredWidth();
            i9 = l(this.f2481b) + this.f2481b.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i7, this.f2481b.getMeasuredState());
            i11 = k4;
        } else {
            i9 = 0;
            i10 = i7;
            i11 = 0;
        }
        if (u(this.f2482c)) {
            i11 = Math.max(i11, s(this.f2482c, i, i14 + i16, i4, i15 + i9, iArr));
            i9 += l(this.f2482c) + this.f2482c.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i10, this.f2482c.getMeasuredState());
        }
        int max5 = Math.max(i6, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + i11;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i10 << 16);
        if (this.f2475P) {
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!u(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i12);
        }
        i12 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof T0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        T0 t02 = (T0) parcelable;
        super.onRestoreInstanceState(t02.f1880a);
        ActionMenuView actionMenuView = this.f2480a;
        m mVar = actionMenuView != null ? actionMenuView.p : null;
        int i = t02.f7619c;
        if (i != 0 && this.f2472M != null && mVar != null && (findItem = mVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (t02.f7620d) {
            c cVar = this.f2479T;
            removeCallbacks(cVar);
            post(cVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        G0 g02 = this.f2496t;
        boolean z3 = i == 1;
        if (z3 == g02.f7526g) {
            return;
        }
        g02.f7526g = z3;
        if (!g02.h) {
            g02.f7520a = g02.f7524e;
            g02.f7521b = g02.f7525f;
            return;
        }
        if (z3) {
            int i4 = g02.f7523d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = g02.f7524e;
            }
            g02.f7520a = i4;
            int i5 = g02.f7522c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = g02.f7525f;
            }
            g02.f7521b = i5;
            return;
        }
        int i6 = g02.f7522c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = g02.f7524e;
        }
        g02.f7520a = i6;
        int i7 = g02.f7523d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = g02.f7525f;
        }
        g02.f7521b = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, W.b, m.T0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar;
        ?? bVar = new b(super.onSaveInstanceState());
        Q0 q02 = this.f2472M;
        if (q02 != null && (oVar = q02.f7604b) != null) {
            bVar.f7619c = oVar.f7268a;
        }
        bVar.f7620d = p();
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2462B = false;
        }
        if (!this.f2462B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2462B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f2462B = false;
        return true;
    }

    public final boolean p() {
        C0472l c0472l;
        ActionMenuView actionMenuView = this.f2480a;
        return (actionMenuView == null || (c0472l = actionMenuView.f2416t) == null || !c0472l.f()) ? false : true;
    }

    public final int q(View view, int i, int i4, int[] iArr) {
        R0 r02 = (R0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) r02).leftMargin - iArr[0];
        int max = Math.max(0, i5) + i;
        iArr[0] = Math.max(0, -i5);
        int j4 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j4, max + measuredWidth, view.getMeasuredHeight() + j4);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) r02).rightMargin + max;
    }

    public final int r(View view, int i, int i4, int[] iArr) {
        R0 r02 = (R0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) r02).rightMargin - iArr[1];
        int max = i - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int j4 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j4, max, view.getMeasuredHeight() + j4);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) r02).leftMargin);
    }

    @Override // O.InterfaceC0070k
    public final void removeMenuProvider(InterfaceC0076q interfaceC0076q) {
        this.f2467G.b(interfaceC0076q);
    }

    public final int s(View view, int i, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.f2478S != z3) {
            this.f2478S = z3;
            w();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0106b.m(getContext(), i));
    }

    public void setCollapsible(boolean z3) {
        this.f2475P = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = IntCompanionObject.MIN_VALUE;
        }
        if (i != this.f2498v) {
            this.f2498v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = IntCompanionObject.MIN_VALUE;
        }
        if (i != this.f2497u) {
            this.f2497u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0106b.m(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0106b.m(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f2483d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(S0 s02) {
        this.f2469I = s02;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f2480a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f2488k != i) {
            this.f2488k = i;
            if (i == 0) {
                this.f2487j = getContext();
            } else {
                this.f2487j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f2495s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f2493q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f2494r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        C0472l c0472l;
        ActionMenuView actionMenuView = this.f2480a;
        return (actionMenuView == null || (c0472l = actionMenuView.f2416t) == null || !c0472l.n()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = P0.a(this);
            Q0 q02 = this.f2472M;
            boolean z3 = (q02 == null || q02.f7604b == null || a2 == null || !isAttachedToWindow() || !this.f2478S) ? false : true;
            if (z3 && this.f2477R == null) {
                if (this.f2476Q == null) {
                    this.f2476Q = P0.b(new N0(this, 0));
                }
                P0.c(a2, this.f2476Q);
                this.f2477R = a2;
                return;
            }
            if (z3 || (onBackInvokedDispatcher = this.f2477R) == null) {
                return;
            }
            P0.d(onBackInvokedDispatcher, this.f2476Q);
            this.f2477R = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f2499w = 8388627;
        this.f2464D = new ArrayList();
        this.f2465E = new ArrayList();
        this.f2466F = new int[2];
        this.f2467G = new C0074o(new N0(this, 1));
        this.f2468H = new ArrayList();
        this.J = new O0(this);
        this.f2479T = new c(this, 11);
        Context context2 = getContext();
        int[] iArr = AbstractC0336a.f6442x;
        h l4 = h.l(context2, attributeSet, iArr, R.attr.toolbarStyle);
        WeakHashMap weakHashMap = X.f1226a;
        S.d(this, context, iArr, attributeSet, (TypedArray) l4.f1414b, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) l4.f1414b;
        this.f2489l = typedArray.getResourceId(28, 0);
        this.f2490m = typedArray.getResourceId(19, 0);
        this.f2499w = typedArray.getInteger(0, 8388627);
        this.f2491n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f2495s = dimensionPixelOffset;
        this.f2494r = dimensionPixelOffset;
        this.f2493q = dimensionPixelOffset;
        this.p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f2493q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2494r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f2495s = dimensionPixelOffset5;
        }
        this.f2492o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, IntCompanionObject.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, IntCompanionObject.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        G0 g02 = this.f2496t;
        g02.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            g02.f7524e = dimensionPixelSize;
            g02.f7520a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            g02.f7525f = dimensionPixelSize2;
            g02.f7521b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            g02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2497u = typedArray.getDimensionPixelOffset(10, IntCompanionObject.MIN_VALUE);
        this.f2498v = typedArray.getDimensionPixelOffset(6, IntCompanionObject.MIN_VALUE);
        this.f2485f = l4.f(4);
        this.f2486g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2487j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable f2 = l4.f(16);
        if (f2 != null) {
            setNavigationIcon(f2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable f4 = l4.f(11);
        if (f4 != null) {
            setLogo(f4);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(l4.e(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(l4.e(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        l4.n();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, m.R0] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f7606a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0336a.f6423b);
        marginLayoutParams.f7606a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f7607b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0493w c0493w = this.h;
        if (c0493w != null) {
            c0493w.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            C0493w c0493w = this.h;
            if (c0493w != null) {
                c0493w.setImageDrawable(this.f2485f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2484e == null) {
                this.f2484e = new AppCompatImageView(getContext(), null);
            }
            if (!o(this.f2484e)) {
                b(this.f2484e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f2484e;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.f2484e);
                this.f2465E.remove(this.f2484e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f2484e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2484e == null) {
            this.f2484e = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f2484e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0493w c0493w = this.f2483d;
        if (c0493w != null) {
            c0493w.setContentDescription(charSequence);
            W0.a(this.f2483d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f2483d)) {
                b(this.f2483d, true);
            }
        } else {
            C0493w c0493w = this.f2483d;
            if (c0493w != null && o(c0493w)) {
                removeView(this.f2483d);
                this.f2465E.remove(this.f2483d);
            }
        }
        C0493w c0493w2 = this.f2483d;
        if (c0493w2 != null) {
            c0493w2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2482c == null) {
                Context context = getContext();
                W w3 = new W(context, null);
                this.f2482c = w3;
                w3.setSingleLine();
                this.f2482c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2490m;
                if (i != 0) {
                    this.f2482c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f2461A;
                if (colorStateList != null) {
                    this.f2482c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f2482c)) {
                b(this.f2482c, true);
            }
        } else {
            W w4 = this.f2482c;
            if (w4 != null && o(w4)) {
                removeView(this.f2482c);
                this.f2465E.remove(this.f2482c);
            }
        }
        W w5 = this.f2482c;
        if (w5 != null) {
            w5.setText(charSequence);
        }
        this.f2501y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2461A = colorStateList;
        W w3 = this.f2482c;
        if (w3 != null) {
            w3.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2481b == null) {
                Context context = getContext();
                W w3 = new W(context, null);
                this.f2481b = w3;
                w3.setSingleLine();
                this.f2481b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2489l;
                if (i != 0) {
                    this.f2481b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f2502z;
                if (colorStateList != null) {
                    this.f2481b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f2481b)) {
                b(this.f2481b, true);
            }
        } else {
            W w4 = this.f2481b;
            if (w4 != null && o(w4)) {
                removeView(this.f2481b);
                this.f2465E.remove(this.f2481b);
            }
        }
        W w5 = this.f2481b;
        if (w5 != null) {
            w5.setText(charSequence);
        }
        this.f2500x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2502z = colorStateList;
        W w3 = this.f2481b;
        if (w3 != null) {
            w3.setTextColor(colorStateList);
        }
    }
}
