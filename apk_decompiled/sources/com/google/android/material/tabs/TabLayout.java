package com.google.android.material.tabs;

import E2.e;
import F0.a;
import F0.d;
import F0.i;
import H2.b;
import H2.c;
import H2.g;
import H2.h;
import H2.k;
import H2.l;
import O.L;
import O.X;
import a.AbstractC0105a;
import a.AbstractC0106b;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.adif.elcanomovil.R;
import com.adif.elcanomovil.repositories.circulation.CirculationMapper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f.AbstractC0336a;
import h2.AbstractC0379a;
import i2.AbstractC0396a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import x2.m;

@d
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: V, reason: collision with root package name */
    public static final N.d f5763V = new N.d(16);

    /* renamed from: A, reason: collision with root package name */
    public int f5764A;

    /* renamed from: B, reason: collision with root package name */
    public int f5765B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f5766C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5767D;

    /* renamed from: E, reason: collision with root package name */
    public int f5768E;

    /* renamed from: F, reason: collision with root package name */
    public int f5769F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5770G;

    /* renamed from: H, reason: collision with root package name */
    public e f5771H;

    /* renamed from: I, reason: collision with root package name */
    public final TimeInterpolator f5772I;
    public H2.d J;

    /* renamed from: K, reason: collision with root package name */
    public final ArrayList f5773K;

    /* renamed from: L, reason: collision with root package name */
    public l f5774L;

    /* renamed from: M, reason: collision with root package name */
    public ValueAnimator f5775M;

    /* renamed from: N, reason: collision with root package name */
    public ViewPager f5776N;

    /* renamed from: O, reason: collision with root package name */
    public a f5777O;

    /* renamed from: P, reason: collision with root package name */
    public i f5778P;

    /* renamed from: Q, reason: collision with root package name */
    public H2.i f5779Q;

    /* renamed from: R, reason: collision with root package name */
    public c f5780R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5781S;

    /* renamed from: T, reason: collision with root package name */
    public int f5782T;

    /* renamed from: U, reason: collision with root package name */
    public final N.c f5783U;

    /* renamed from: a, reason: collision with root package name */
    public int f5784a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5785b;

    /* renamed from: c, reason: collision with root package name */
    public h f5786c;

    /* renamed from: d, reason: collision with root package name */
    public final g f5787d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5788e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5789f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5790g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5791j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5792k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f5793l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f5794m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f5795n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f5796o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public final float f5797q;

    /* renamed from: r, reason: collision with root package name */
    public final float f5798r;

    /* renamed from: s, reason: collision with root package name */
    public final int f5799s;

    /* renamed from: t, reason: collision with root package name */
    public int f5800t;

    /* renamed from: u, reason: collision with root package name */
    public final int f5801u;

    /* renamed from: v, reason: collision with root package name */
    public final int f5802v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5803w;

    /* renamed from: x, reason: collision with root package name */
    public final int f5804x;

    /* renamed from: y, reason: collision with root package name */
    public int f5805y;

    /* renamed from: z, reason: collision with root package name */
    public final int f5806z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(K2.a.a(context, attributeSet, R.attr.tabStyle, 2132018091), attributeSet, R.attr.tabStyle);
        this.f5784a = -1;
        this.f5785b = new ArrayList();
        this.f5792k = -1;
        this.p = 0;
        this.f5800t = Integer.MAX_VALUE;
        this.f5768E = -1;
        this.f5773K = new ArrayList();
        this.f5783U = new N.c(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        g gVar = new g(this, context2);
        this.f5787d = gVar;
        super.addView(gVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray h = m.h(context2, attributeSet, AbstractC0379a.f6750D, R.attr.tabStyle, 2132018091, 24);
        ColorStateList p = m3.l.p(getBackground());
        if (p != null) {
            E2.g gVar2 = new E2.g();
            gVar2.j(p);
            gVar2.h(context2);
            WeakHashMap weakHashMap = X.f1226a;
            gVar2.i(L.i(this));
            setBackground(gVar2);
        }
        setSelectedTabIndicator(AbstractC0105a.z(context2, h, 5));
        setSelectedTabIndicatorColor(h.getColor(8, 0));
        gVar.b(h.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(h.getInt(10, 0));
        setTabIndicatorAnimationMode(h.getInt(7, 0));
        setTabIndicatorFullWidth(h.getBoolean(9, true));
        int dimensionPixelSize = h.getDimensionPixelSize(16, 0);
        this.h = dimensionPixelSize;
        this.f5790g = dimensionPixelSize;
        this.f5789f = dimensionPixelSize;
        this.f5788e = dimensionPixelSize;
        this.f5788e = h.getDimensionPixelSize(19, dimensionPixelSize);
        this.f5789f = h.getDimensionPixelSize(20, dimensionPixelSize);
        this.f5790g = h.getDimensionPixelSize(18, dimensionPixelSize);
        this.h = h.getDimensionPixelSize(17, dimensionPixelSize);
        if (m3.l.U(context2, R.attr.isMaterial3Theme, false)) {
            this.i = R.attr.textAppearanceTitleSmall;
        } else {
            this.i = R.attr.textAppearanceButton;
        }
        int resourceId = h.getResourceId(24, 2132017674);
        this.f5791j = resourceId;
        int[] iArr = AbstractC0336a.f6441w;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f5797q = dimensionPixelSize2;
            this.f5793l = AbstractC0105a.w(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (h.hasValue(22)) {
                this.f5792k = h.getResourceId(22, resourceId);
            }
            int i = this.f5792k;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList w3 = AbstractC0105a.w(context2, obtainStyledAttributes, 3);
                    if (w3 != null) {
                        this.f5793l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{w3.getColorForState(new int[]{android.R.attr.state_selected}, w3.getDefaultColor()), this.f5793l.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (h.hasValue(25)) {
                this.f5793l = AbstractC0105a.w(context2, h, 25);
            }
            if (h.hasValue(23)) {
                this.f5793l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{h.getColor(23, 0), this.f5793l.getDefaultColor()});
            }
            this.f5794m = AbstractC0105a.w(context2, h, 3);
            m.j(h.getInt(4, -1), null);
            this.f5795n = AbstractC0105a.w(context2, h, 21);
            this.f5806z = h.getInt(6, CirculationMapper.TIME_TO_WARNING);
            this.f5772I = AbstractC0106b.F(context2, R.attr.motionEasingEmphasizedInterpolator, AbstractC0396a.f6816b);
            this.f5801u = h.getDimensionPixelSize(14, -1);
            this.f5802v = h.getDimensionPixelSize(13, -1);
            this.f5799s = h.getResourceId(0, 0);
            this.f5804x = h.getDimensionPixelSize(1, 0);
            this.f5765B = h.getInt(15, 1);
            this.f5805y = h.getInt(2, 0);
            this.f5766C = h.getBoolean(12, false);
            this.f5770G = h.getBoolean(26, false);
            h.recycle();
            Resources resources = getResources();
            this.f5798r = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f5803w = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            d();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f5785b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f5801u;
        if (i != -1) {
            return i;
        }
        int i4 = this.f5765B;
        if (i4 == 0 || i4 == 2) {
            return this.f5803w;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f5787d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        g gVar = this.f5787d;
        int childCount = gVar.getChildCount();
        if (i < childCount) {
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = gVar.getChildAt(i4);
                if ((i4 != i || childAt.isSelected()) && (i4 == i || !childAt.isSelected())) {
                    childAt.setSelected(i4 == i);
                    childAt.setActivated(i4 == i);
                } else {
                    childAt.setSelected(i4 == i);
                    childAt.setActivated(i4 == i);
                    if (childAt instanceof k) {
                        ((k) childAt).f();
                    }
                }
                i4++;
            }
        }
    }

    public final void a(H2.d dVar) {
        ArrayList arrayList = this.f5773K;
        if (arrayList.contains(dVar)) {
            return;
        }
        arrayList.add(dVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(h hVar, boolean z3) {
        ArrayList arrayList = this.f5785b;
        int size = arrayList.size();
        if (hVar.f707d != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        hVar.f705b = size;
        arrayList.add(size, hVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i4 = size + 1; i4 < size2; i4++) {
            if (((h) arrayList.get(i4)).f705b == this.f5784a) {
                i = i4;
            }
            ((h) arrayList.get(i4)).f705b = i4;
        }
        this.f5784a = i;
        k kVar = hVar.f708e;
        kVar.setSelected(false);
        kVar.setActivated(false);
        int i5 = hVar.f705b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f5765B == 1 && this.f5805y == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
        }
        this.f5787d.addView(kVar, i5, layoutParams);
        if (z3) {
            TabLayout tabLayout = hVar.f707d;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.k(hVar, true);
        }
    }

    public final void c(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = X.f1226a;
            if (isLaidOut()) {
                g gVar = this.f5787d;
                int childCount = gVar.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    if (gVar.getChildAt(i4).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int e4 = e(i, BitmapDescriptorFactory.HUE_RED);
                if (scrollX != e4) {
                    f();
                    this.f5775M.setIntValues(scrollX, e4);
                    this.f5775M.start();
                }
                ValueAnimator valueAnimator = gVar.f702a;
                if (valueAnimator != null && valueAnimator.isRunning() && gVar.f703b.f5784a != i) {
                    gVar.f702a.cancel();
                }
                gVar.d(i, this.f5806z, true);
                return;
            }
        }
        m(i, BitmapDescriptorFactory.HUE_RED, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r5 = this;
            int r0 = r5.f5765B
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r5.f5804x
            int r3 = r5.f5788e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap r3 = O.X.f1226a
            H2.g r3 = r5.f5787d
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r5.f5765B
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 == r4) goto L27
            if (r0 == r1) goto L27
            goto L4c
        L27:
            int r0 = r5.f5805y
            if (r0 != r1) goto L30
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L30:
            r3.setGravity(r4)
            goto L4c
        L34:
            int r0 = r5.f5805y
            if (r0 == 0) goto L41
            if (r0 == r4) goto L3d
            if (r0 == r1) goto L46
            goto L4c
        L3d:
            r3.setGravity(r4)
            goto L4c
        L41:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L46:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L4c:
            r5.o(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(int i, float f2) {
        g gVar;
        View childAt;
        int i4 = this.f5765B;
        if ((i4 != 0 && i4 != 2) || (childAt = (gVar = this.f5787d).getChildAt(i)) == null) {
            return 0;
        }
        int i5 = i + 1;
        View childAt2 = i5 < gVar.getChildCount() ? gVar.getChildAt(i5) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i6 = (int) ((width + width2) * 0.5f * f2);
        WeakHashMap weakHashMap = X.f1226a;
        return getLayoutDirection() == 0 ? left + i6 : left - i6;
    }

    public final void f() {
        if (this.f5775M == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f5775M = valueAnimator;
            valueAnimator.setInterpolator(this.f5772I);
            this.f5775M.setDuration(this.f5806z);
            this.f5775M.addUpdateListener(new b(this, 0));
        }
    }

    public final h g(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (h) this.f5785b.get(i);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        h hVar = this.f5786c;
        if (hVar != null) {
            return hVar.f705b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f5785b.size();
    }

    public int getTabGravity() {
        return this.f5805y;
    }

    public ColorStateList getTabIconTint() {
        return this.f5794m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f5769F;
    }

    public int getTabIndicatorGravity() {
        return this.f5764A;
    }

    public int getTabMaxWidth() {
        return this.f5800t;
    }

    public int getTabMode() {
        return this.f5765B;
    }

    public ColorStateList getTabRippleColor() {
        return this.f5795n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f5796o;
    }

    public ColorStateList getTabTextColors() {
        return this.f5793l;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [H2.h, java.lang.Object] */
    public final h h() {
        h hVar = (h) f5763V.a();
        h hVar2 = hVar;
        if (hVar == null) {
            ?? obj = new Object();
            obj.f705b = -1;
            hVar2 = obj;
        }
        hVar2.f707d = this;
        N.c cVar = this.f5783U;
        k kVar = cVar != null ? (k) cVar.a() : null;
        if (kVar == null) {
            kVar = new k(this, getContext());
        }
        kVar.setTab(hVar2);
        kVar.setFocusable(true);
        kVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            kVar.setContentDescription(hVar2.f704a);
        } else {
            kVar.setContentDescription(null);
        }
        hVar2.f708e = kVar;
        return hVar2;
    }

    public final void i() {
        int currentItem;
        j();
        a aVar = this.f5777O;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i = 0; i < count; i++) {
                h h = h();
                h.a(this.f5777O.getPageTitle(i));
                b(h, false);
            }
            ViewPager viewPager = this.f5776N;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            k(g(currentItem), true);
        }
    }

    public final void j() {
        g gVar = this.f5787d;
        int childCount = gVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            k kVar = (k) gVar.getChildAt(childCount);
            gVar.removeViewAt(childCount);
            if (kVar != null) {
                kVar.setTab(null);
                kVar.setSelected(false);
                this.f5783U.c(kVar);
            }
            requestLayout();
        }
        Iterator it = this.f5785b.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            it.remove();
            hVar.f707d = null;
            hVar.f708e = null;
            hVar.f704a = null;
            hVar.f705b = -1;
            hVar.f706c = null;
            f5763V.c(hVar);
        }
        this.f5786c = null;
    }

    public final void k(h hVar, boolean z3) {
        TabLayout tabLayout;
        h hVar2 = this.f5786c;
        ArrayList arrayList = this.f5773K;
        if (hVar2 == hVar) {
            if (hVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((H2.d) arrayList.get(size)).onTabReselected(hVar);
                }
                c(hVar.f705b);
                return;
            }
            return;
        }
        int i = hVar != null ? hVar.f705b : -1;
        if (z3) {
            if ((hVar2 == null || hVar2.f705b == -1) && i != -1) {
                tabLayout = this;
                tabLayout.m(i, BitmapDescriptorFactory.HUE_RED, true, true, true);
            } else {
                tabLayout = this;
                tabLayout.c(i);
            }
            if (i != -1) {
                tabLayout.setSelectedTabView(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.f5786c = hVar;
        if (hVar2 != null && hVar2.f707d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((H2.d) arrayList.get(size2)).onTabUnselected(hVar2);
            }
        }
        if (hVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((H2.d) arrayList.get(size3)).onTabSelected(hVar);
            }
        }
    }

    public final void l(a aVar, boolean z3) {
        i iVar;
        a aVar2 = this.f5777O;
        if (aVar2 != null && (iVar = this.f5778P) != null) {
            aVar2.unregisterDataSetObserver(iVar);
        }
        this.f5777O = aVar;
        if (z3 && aVar != null) {
            if (this.f5778P == null) {
                this.f5778P = new i(this, 1);
            }
            aVar.registerDataSetObserver(this.f5778P);
        }
        i();
    }

    public final void m(int i, float f2, boolean z3, boolean z4, boolean z5) {
        float f4 = i + f2;
        int round = Math.round(f4);
        if (round >= 0) {
            g gVar = this.f5787d;
            if (round >= gVar.getChildCount()) {
                return;
            }
            if (z4) {
                gVar.f703b.f5784a = Math.round(f4);
                ValueAnimator valueAnimator = gVar.f702a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    gVar.f702a.cancel();
                }
                gVar.c(gVar.getChildAt(i), gVar.getChildAt(i + 1), f2);
            }
            ValueAnimator valueAnimator2 = this.f5775M;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f5775M.cancel();
            }
            int e4 = e(i, f2);
            int scrollX = getScrollX();
            boolean z6 = (i < getSelectedTabPosition() && e4 >= scrollX) || (i > getSelectedTabPosition() && e4 <= scrollX) || i == getSelectedTabPosition();
            WeakHashMap weakHashMap = X.f1226a;
            if (getLayoutDirection() == 1) {
                z6 = (i < getSelectedTabPosition() && e4 <= scrollX) || (i > getSelectedTabPosition() && e4 >= scrollX) || i == getSelectedTabPosition();
            }
            if (z6 || this.f5782T == 1 || z5) {
                if (i < 0) {
                    e4 = 0;
                }
                scrollTo(e4, 0);
            }
            if (z3) {
                setSelectedTabView(round);
            }
        }
    }

    public final void n(ViewPager viewPager, boolean z3) {
        TabLayout tabLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f5776N;
        if (viewPager2 != null) {
            H2.i iVar = this.f5779Q;
            if (iVar != null && (arrayList2 = viewPager2.f4040R) != null) {
                arrayList2.remove(iVar);
            }
            c cVar = this.f5780R;
            if (cVar != null && (arrayList = this.f5776N.f4042T) != null) {
                arrayList.remove(cVar);
            }
        }
        l lVar = this.f5774L;
        if (lVar != null) {
            this.f5773K.remove(lVar);
            this.f5774L = null;
        }
        if (viewPager != null) {
            this.f5776N = viewPager;
            if (this.f5779Q == null) {
                this.f5779Q = new H2.i(this);
            }
            H2.i iVar2 = this.f5779Q;
            iVar2.f711c = 0;
            iVar2.f710b = 0;
            if (viewPager.f4040R == null) {
                viewPager.f4040R = new ArrayList();
            }
            viewPager.f4040R.add(iVar2);
            l lVar2 = new l(viewPager, 0);
            this.f5774L = lVar2;
            a(lVar2);
            a adapter = viewPager.getAdapter();
            if (adapter != null) {
                l(adapter, true);
            }
            if (this.f5780R == null) {
                this.f5780R = new c(this);
            }
            c cVar2 = this.f5780R;
            cVar2.f696a = true;
            if (viewPager.f4042T == null) {
                viewPager.f4042T = new ArrayList();
            }
            viewPager.f4042T.add(cVar2);
            tabLayout = this;
            tabLayout.m(viewPager.getCurrentItem(), BitmapDescriptorFactory.HUE_RED, true, true, true);
        } else {
            tabLayout = this;
            tabLayout.f5776N = null;
            tabLayout.l(null, false);
        }
        tabLayout.f5781S = z3;
    }

    public final void o(boolean z3) {
        int i = 0;
        while (true) {
            g gVar = this.f5787d;
            if (i >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f5765B == 1 && this.f5805y == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
            }
            if (z3) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof E2.g) {
            m3.d.H(this, (E2.g) background);
        }
        if (this.f5776N == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                n((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5781S) {
            setupWithViewPager(null);
            this.f5781S = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k kVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            g gVar = this.f5787d;
            if (i >= gVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = gVar.getChildAt(i);
            if ((childAt instanceof k) && (drawable = (kVar = (k) childAt).i) != null) {
                drawable.setBounds(kVar.getLeft(), kVar.getTop(), kVar.getRight(), kVar.getBottom());
                kVar.i.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) A.a.s(1, getTabCount(), 1).f7b);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int round = Math.round(m.e(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i4);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i4 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i4) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i5 = this.f5802v;
            if (i5 <= 0) {
                i5 = (int) (size - m.e(getContext(), 56));
            }
            this.f5800t = i5;
        }
        super.onMeasure(i, i4);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i6 = this.f5765B;
            if (i6 != 0) {
                if (i6 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i6 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof E2.g) {
            ((E2.g) background).i(f2);
        }
    }

    public void setInlineLabel(boolean z3) {
        if (this.f5766C == z3) {
            return;
        }
        this.f5766C = z3;
        int i = 0;
        while (true) {
            g gVar = this.f5787d;
            if (i >= gVar.getChildCount()) {
                d();
                return;
            }
            View childAt = gVar.getChildAt(i);
            if (childAt instanceof k) {
                k kVar = (k) childAt;
                kVar.setOrientation(!kVar.f723k.f5766C ? 1 : 0);
                TextView textView = kVar.f721g;
                if (textView == null && kVar.h == null) {
                    kVar.g(kVar.f716b, kVar.f717c, true);
                } else {
                    kVar.g(textView, kVar.h, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(H2.e eVar) {
        setOnTabSelectedListener((H2.d) eVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.f5775M.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.f5796o = mutate;
        int i = this.p;
        if (i != 0) {
            H.a.g(mutate, i);
        } else {
            H.a.h(mutate, null);
        }
        int i4 = this.f5768E;
        if (i4 == -1) {
            i4 = this.f5796o.getIntrinsicHeight();
        }
        this.f5787d.b(i4);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.p = i;
        Drawable drawable = this.f5796o;
        if (i != 0) {
            H.a.g(drawable, i);
        } else {
            H.a.h(drawable, null);
        }
        o(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f5764A != i) {
            this.f5764A = i;
            WeakHashMap weakHashMap = X.f1226a;
            this.f5787d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f5768E = i;
        this.f5787d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.f5805y != i) {
            this.f5805y = i;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f5794m != colorStateList) {
            this.f5794m = colorStateList;
            ArrayList arrayList = this.f5785b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                k kVar = ((h) arrayList.get(i)).f708e;
                if (kVar != null) {
                    kVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(D.h.getColorStateList(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f5769F = i;
        if (i == 0) {
            this.f5771H = new e(3);
            return;
        }
        if (i == 1) {
            this.f5771H = new H2.a(0);
        } else {
            if (i == 2) {
                this.f5771H = new H2.a(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z3) {
        this.f5767D = z3;
        int i = g.f701c;
        g gVar = this.f5787d;
        gVar.a(gVar.f703b.getSelectedTabPosition());
        WeakHashMap weakHashMap = X.f1226a;
        gVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f5765B) {
            this.f5765B = i;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f5795n == colorStateList) {
            return;
        }
        this.f5795n = colorStateList;
        int i = 0;
        while (true) {
            g gVar = this.f5787d;
            if (i >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i);
            if (childAt instanceof k) {
                Context context = getContext();
                int i4 = k.f714l;
                ((k) childAt).e(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(D.h.getColorStateList(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f5793l != colorStateList) {
            this.f5793l = colorStateList;
            ArrayList arrayList = this.f5785b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                k kVar = ((h) arrayList.get(i)).f708e;
                if (kVar != null) {
                    kVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(a aVar) {
        l(aVar, false);
    }

    public void setUnboundedRipple(boolean z3) {
        if (this.f5770G == z3) {
            return;
        }
        this.f5770G = z3;
        int i = 0;
        while (true) {
            g gVar = this.f5787d;
            if (i >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i);
            if (childAt instanceof k) {
                Context context = getContext();
                int i4 = k.f714l;
                ((k) childAt).e(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        n(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(H2.d dVar) {
        H2.d dVar2 = this.J;
        if (dVar2 != null) {
            this.f5773K.remove(dVar2);
        }
        this.J = dVar;
        if (dVar != null) {
            a(dVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(AbstractC0106b.m(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
