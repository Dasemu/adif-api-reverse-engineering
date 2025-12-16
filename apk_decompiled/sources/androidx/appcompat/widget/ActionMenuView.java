package androidx.appcompat.widget;

import M.g;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f0.C0338b;
import h3.d;
import kotlin.jvm.internal.IntCompanionObject;
import l.InterfaceC0418A;
import l.InterfaceC0433k;
import l.InterfaceC0434l;
import l.m;
import l.o;
import l.x;
import m.C0462g;
import m.C0468j;
import m.C0472l;
import m.C0476n;
import m.C0483q0;
import m.InterfaceC0474m;
import m.InterfaceC0478o;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements InterfaceC0434l, InterfaceC0418A {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC0478o f2412A;
    public m p;

    /* renamed from: q, reason: collision with root package name */
    public Context f2413q;

    /* renamed from: r, reason: collision with root package name */
    public int f2414r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2415s;

    /* renamed from: t, reason: collision with root package name */
    public C0472l f2416t;

    /* renamed from: u, reason: collision with root package name */
    public g f2417u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0433k f2418v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2419w;

    /* renamed from: x, reason: collision with root package name */
    public int f2420x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2421y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2422z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f2421y = (int) (56.0f * f2);
        this.f2422z = (int) (f2 * 4.0f);
        this.f2413q = context;
        this.f2414r = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, m.n] */
    public static C0476n j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f7709a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, m.n] */
    public static C0476n k(ViewGroup.LayoutParams layoutParams) {
        C0476n c0476n;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0476n) {
            C0476n c0476n2 = (C0476n) layoutParams;
            ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c0476n2);
            layoutParams2.f7709a = c0476n2.f7709a;
            c0476n = layoutParams2;
        } else {
            c0476n = new LinearLayout.LayoutParams(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0476n).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0476n).gravity = 16;
        }
        return c0476n;
    }

    @Override // l.InterfaceC0418A
    public final void a(m mVar) {
        this.p = mVar;
    }

    @Override // l.InterfaceC0434l
    public final boolean c(o oVar) {
        return this.p.q(oVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0476n;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0483q0 generateDefaultLayoutParams() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.q0, android.widget.LinearLayout$LayoutParams] */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public final C0483q0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.p = mVar;
            mVar.f7245e = new d(this, 6);
            C0472l c0472l = new C0472l(context);
            this.f2416t = c0472l;
            c0472l.f7686m = true;
            c0472l.f7687n = true;
            x xVar = this.f2417u;
            if (xVar == null) {
                xVar = new C0338b(6);
            }
            c0472l.f7680e = xVar;
            this.p.b(c0472l, this.f2413q);
            C0472l c0472l2 = this.f2416t;
            c0472l2.h = this;
            this.p = c0472l2.f7678c;
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0472l c0472l = this.f2416t;
        C0468j c0468j = c0472l.f7683j;
        if (c0468j != null) {
            return c0468j.getDrawable();
        }
        if (c0472l.f7685l) {
            return c0472l.f7684k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f2414r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0483q0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z3 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0474m)) {
            z3 = ((InterfaceC0474m) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0474m)) ? z3 : ((InterfaceC0474m) childAt2).c() | z3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0472l c0472l = this.f2416t;
        if (c0472l != null) {
            c0472l.h(false);
            if (this.f2416t.f()) {
                this.f2416t.c();
                this.f2416t.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0472l c0472l = this.f2416t;
        if (c0472l != null) {
            c0472l.c();
            C0462g c0462g = c0472l.f7693u;
            if (c0462g == null || !c0462g.b()) {
                return;
            }
            c0462g.i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int width;
        int i7;
        if (!this.f2419w) {
            super.onLayout(z3, i, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i5 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean z4 = getLayoutDirection() == 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0476n c0476n = (C0476n) childAt.getLayoutParams();
                if (c0476n.f7709a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        i7 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0476n).leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0476n).rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0476n).leftMargin) + ((LinearLayout.LayoutParams) c0476n).rightMargin;
                    l(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (z4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C0476n c0476n2 = (C0476n) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0476n2.f7709a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) c0476n2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0476n2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C0476n c0476n3 = (C0476n) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0476n3.f7709a) {
                int i21 = paddingLeft + ((LinearLayout.LayoutParams) c0476n3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0476n3).rightMargin + max + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        int i6;
        ?? r11;
        int i7;
        int i8;
        m mVar;
        boolean z3 = this.f2419w;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f2419w = z4;
        if (z3 != z4) {
            this.f2420x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f2419w && (mVar = this.p) != null && size != this.f2420x) {
            this.f2420x = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f2419w || childCount <= 0) {
            for (int i9 = 0; i9 < childCount; i9++) {
                C0476n c0476n = (C0476n) getChildAt(i9).getLayoutParams();
                ((LinearLayout.LayoutParams) c0476n).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0476n).leftMargin = 0;
            }
            super.onMeasure(i, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i10 = size2 - paddingRight;
        int i11 = this.f2421y;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = (i13 / i12) + i11;
        int childCount2 = getChildCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = false;
        int i19 = 0;
        long j4 = 0;
        while (true) {
            i5 = this.f2422z;
            if (i18 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i18);
            int i20 = size3;
            int i21 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i7 = i14;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                i16++;
                if (z6) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                C0476n c0476n2 = (C0476n) childAt.getLayoutParams();
                c0476n2.f7714f = false;
                c0476n2.f7711c = 0;
                c0476n2.f7710b = 0;
                c0476n2.f7712d = false;
                ((LinearLayout.LayoutParams) c0476n2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0476n2).rightMargin = 0;
                c0476n2.f7713e = z6 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i22 = c0476n2.f7709a ? 1 : i12;
                C0476n c0476n3 = (C0476n) childAt.getLayoutParams();
                int i23 = i12;
                i7 = i14;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i21, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z8 = z7;
                if (i22 <= 0 || (z7 && i22 < 2)) {
                    i8 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i22, IntCompanionObject.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i8 = measuredWidth / i7;
                    if (measuredWidth % i7 != 0) {
                        i8++;
                    }
                    if (z8 && i8 < 2) {
                        i8 = 2;
                    }
                }
                c0476n3.f7712d = !c0476n3.f7709a && z8;
                c0476n3.f7710b = i8;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, 1073741824), makeMeasureSpec);
                i17 = Math.max(i17, i8);
                if (c0476n2.f7712d) {
                    i19++;
                }
                if (c0476n2.f7709a) {
                    z5 = true;
                }
                i12 = i23 - i8;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (i8 == 1) {
                    j4 |= 1 << i18;
                }
            }
            i18++;
            size3 = i20;
            paddingBottom = i21;
            i14 = i7;
        }
        int i24 = size3;
        int i25 = i12;
        int i26 = i14;
        boolean z9 = z5 && i16 == 2;
        int i27 = i25;
        boolean z10 = false;
        while (i19 > 0 && i27 > 0) {
            int i28 = Integer.MAX_VALUE;
            long j5 = 0;
            int i29 = 0;
            int i30 = 0;
            while (i30 < childCount2) {
                boolean z11 = z9;
                C0476n c0476n4 = (C0476n) getChildAt(i30).getLayoutParams();
                int i31 = i15;
                if (c0476n4.f7712d) {
                    int i32 = c0476n4.f7710b;
                    if (i32 < i28) {
                        j5 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        j5 |= 1 << i30;
                        i29++;
                    }
                }
                i30++;
                i15 = i31;
                z9 = z11;
            }
            boolean z12 = z9;
            i6 = i15;
            j4 |= j5;
            if (i29 > i27) {
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C0476n c0476n5 = (C0476n) childAt2.getLayoutParams();
                boolean z13 = z5;
                long j6 = 1 << i34;
                if ((j5 & j6) != 0) {
                    if (z12 && c0476n5.f7713e) {
                        r11 = 1;
                        r11 = 1;
                        if (i27 == 1) {
                            childAt2.setPadding(i5 + i26, 0, i5, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0476n5.f7710b += r11;
                    c0476n5.f7714f = r11;
                    i27--;
                } else if (c0476n5.f7710b == i33) {
                    j4 |= j6;
                }
                i34++;
                z5 = z13;
            }
            i15 = i6;
            z9 = z12;
            z10 = true;
        }
        i6 = i15;
        boolean z14 = !z5 && i16 == 1;
        if (i27 > 0 && j4 != 0 && (i27 < i16 - 1 || z14 || i17 > 1)) {
            float bitCount = Long.bitCount(j4);
            if (!z14) {
                if ((j4 & 1) != 0 && !((C0476n) getChildAt(0).getLayoutParams()).f7713e) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount2 - 1;
                if ((j4 & (1 << i35)) != 0 && !((C0476n) getChildAt(i35).getLayoutParams()).f7713e) {
                    bitCount -= 0.5f;
                }
            }
            int i36 = bitCount > BitmapDescriptorFactory.HUE_RED ? (int) ((i27 * i26) / bitCount) : 0;
            boolean z15 = z10;
            for (int i37 = 0; i37 < childCount2; i37++) {
                if ((j4 & (1 << i37)) != 0) {
                    View childAt3 = getChildAt(i37);
                    C0476n c0476n6 = (C0476n) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0476n6.f7711c = i36;
                        c0476n6.f7714f = true;
                        if (i37 == 0 && !c0476n6.f7713e) {
                            ((LinearLayout.LayoutParams) c0476n6).leftMargin = (-i36) / 2;
                        }
                        z15 = true;
                    } else if (c0476n6.f7709a) {
                        c0476n6.f7711c = i36;
                        c0476n6.f7714f = true;
                        ((LinearLayout.LayoutParams) c0476n6).rightMargin = (-i36) / 2;
                        z15 = true;
                    } else {
                        if (i37 != 0) {
                            ((LinearLayout.LayoutParams) c0476n6).leftMargin = i36 / 2;
                        }
                        if (i37 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0476n6).rightMargin = i36 / 2;
                        }
                    }
                }
            }
            z10 = z15;
        }
        if (z10) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                C0476n c0476n7 = (C0476n) childAt4.getLayoutParams();
                if (c0476n7.f7714f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0476n7.f7710b * i26) + c0476n7.f7711c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, mode != 1073741824 ? i6 : i24);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f2416t.f7690r = z3;
    }

    public void setOnMenuItemClickListener(InterfaceC0478o interfaceC0478o) {
        this.f2412A = interfaceC0478o;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0472l c0472l = this.f2416t;
        C0468j c0468j = c0472l.f7683j;
        if (c0468j != null) {
            c0468j.setImageDrawable(drawable);
        } else {
            c0472l.f7685l = true;
            c0472l.f7684k = drawable;
        }
    }

    public void setOverflowReserved(boolean z3) {
        this.f2415s = z3;
    }

    public void setPopupTheme(int i) {
        if (this.f2414r != i) {
            this.f2414r = i;
            if (i == 0) {
                this.f2413q = getContext();
            } else {
                this.f2413q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0472l c0472l) {
        this.f2416t = c0472l;
        c0472l.h = this;
        this.p = c0472l.f7678c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
