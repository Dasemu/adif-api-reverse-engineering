package androidx.appcompat.widget;

import O.X;
import O.h0;
import a.AbstractC0106b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.datepicker.j;
import f.AbstractC0336a;
import k.AbstractC0405b;
import kotlin.jvm.internal.IntCompanionObject;
import l.InterfaceC0418A;
import l.m;
import m.C0450a;
import m.C0462g;
import m.C0472l;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0450a f2367a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2368b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f2369c;

    /* renamed from: d, reason: collision with root package name */
    public C0472l f2370d;

    /* renamed from: e, reason: collision with root package name */
    public int f2371e;

    /* renamed from: f, reason: collision with root package name */
    public h0 f2372f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2373g;
    public boolean h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2374j;

    /* renamed from: k, reason: collision with root package name */
    public View f2375k;

    /* renamed from: l, reason: collision with root package name */
    public View f2376l;

    /* renamed from: m, reason: collision with root package name */
    public View f2377m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f2378n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f2379o;
    public TextView p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2380q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2381r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2382s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2383t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f2367a = new C0450a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2368b = context;
        } else {
            this.f2368b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0336a.f6425d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0106b.m(context, resourceId));
        this.f2380q = obtainStyledAttributes.getResourceId(5, 0);
        this.f2381r = obtainStyledAttributes.getResourceId(4, 0);
        this.f2371e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f2383t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, IntCompanionObject.MIN_VALUE), i4);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(int i, int i4, int i5, View view, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = ((i5 - measuredHeight) / 2) + i4;
        if (z3) {
            view.layout(i - measuredWidth, i6, i, measuredHeight + i6);
        } else {
            view.layout(i, i6, i + measuredWidth, measuredHeight + i6);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC0405b abstractC0405b) {
        View view = this.f2375k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f2383t, (ViewGroup) this, false);
            this.f2375k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f2375k);
        }
        View findViewById = this.f2375k.findViewById(R.id.action_mode_close_button);
        this.f2376l = findViewById;
        findViewById.setOnClickListener(new j(abstractC0405b, 2));
        m d4 = abstractC0405b.d();
        C0472l c0472l = this.f2370d;
        if (c0472l != null) {
            c0472l.c();
            C0462g c0462g = c0472l.f7693u;
            if (c0462g != null && c0462g.b()) {
                c0462g.i.dismiss();
            }
        }
        C0472l c0472l2 = new C0472l(getContext());
        this.f2370d = c0472l2;
        c0472l2.f7686m = true;
        c0472l2.f7687n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        d4.b(this.f2370d, this.f2368b);
        C0472l c0472l3 = this.f2370d;
        InterfaceC0418A interfaceC0418A = c0472l3.h;
        if (interfaceC0418A == null) {
            InterfaceC0418A interfaceC0418A2 = (InterfaceC0418A) c0472l3.f7679d.inflate(c0472l3.f7681f, (ViewGroup) this, false);
            c0472l3.h = interfaceC0418A2;
            interfaceC0418A2.a(c0472l3.f7678c);
            c0472l3.h(true);
        }
        InterfaceC0418A interfaceC0418A3 = c0472l3.h;
        if (interfaceC0418A != interfaceC0418A3) {
            ((ActionMenuView) interfaceC0418A3).setPresenter(c0472l3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0418A3;
        this.f2369c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f2369c, layoutParams);
    }

    public final void d() {
        if (this.f2378n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2378n = linearLayout;
            this.f2379o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.p = (TextView) this.f2378n.findViewById(R.id.action_bar_subtitle);
            int i = this.f2380q;
            if (i != 0) {
                this.f2379o.setTextAppearance(getContext(), i);
            }
            int i4 = this.f2381r;
            if (i4 != 0) {
                this.p.setTextAppearance(getContext(), i4);
            }
        }
        this.f2379o.setText(this.i);
        this.p.setText(this.f2374j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f2374j);
        this.p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f2378n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f2378n.getParent() == null) {
            addView(this.f2378n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f2377m = null;
        this.f2369c = null;
        this.f2370d = null;
        View view = this.f2376l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f2372f != null ? this.f2367a.f7645b : getVisibility();
    }

    public int getContentHeight() {
        return this.f2371e;
    }

    public CharSequence getSubtitle() {
        return this.f2374j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            h0 h0Var = this.f2372f;
            if (h0Var != null) {
                h0Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final h0 i(int i, long j4) {
        h0 h0Var = this.f2372f;
        if (h0Var != null) {
            h0Var.b();
        }
        C0450a c0450a = this.f2367a;
        if (i != 0) {
            h0 a2 = X.a(this);
            a2.a(BitmapDescriptorFactory.HUE_RED);
            a2.c(j4);
            c0450a.f7646c.f2372f = a2;
            c0450a.f7645b = i;
            a2.d(c0450a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        h0 a4 = X.a(this);
        a4.a(1.0f);
        a4.c(j4);
        c0450a.f7646c.f2372f = a4;
        c0450a.f7645b = i;
        a4.d(c0450a);
        return a4;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0336a.f6422a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0472l c0472l = this.f2370d;
        if (c0472l != null) {
            Configuration configuration2 = c0472l.f7677b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i4 = configuration2.screenHeightDp;
            c0472l.f7689q = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i4 > 720) || (i > 720 && i4 > 960)) ? 5 : (i >= 500 || (i > 640 && i4 > 480) || (i > 480 && i4 > 640)) ? 4 : i >= 360 ? 3 : 2;
            m mVar = c0472l.f7678c;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0472l c0472l = this.f2370d;
        if (c0472l != null) {
            c0472l.c();
            C0462g c0462g = this.f2370d.f7693u;
            if (c0462g == null || !c0462g.b()) {
                return;
            }
            c0462g.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i5 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2375k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2375k.getLayoutParams();
            int i7 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i8 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i9 = z4 ? paddingRight - i7 : paddingRight + i7;
            int g4 = g(i9, paddingTop, paddingTop2, this.f2375k, z4) + i9;
            paddingRight = z4 ? g4 - i8 : g4 + i8;
        }
        LinearLayout linearLayout = this.f2378n;
        if (linearLayout != null && this.f2377m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.f2378n, z4);
        }
        View view2 = this.f2377m;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i5 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2369c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i4) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i5 = this.f2371e;
        if (i5 <= 0) {
            i5 = View.MeasureSpec.getSize(i4);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i6 = i5 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, IntCompanionObject.MIN_VALUE);
        View view = this.f2375k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2375k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f2369c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f2369c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f2378n;
        if (linearLayout != null && this.f2377m == null) {
            if (this.f2382s) {
                this.f2378n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f2378n.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f2378n.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f2377m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i7 = layoutParams.width;
            int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i7 >= 0) {
                paddingLeft = Math.min(i7, paddingLeft);
            }
            int i9 = layoutParams.height;
            int i10 = i9 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i9 >= 0) {
                i6 = Math.min(i9, i6);
            }
            this.f2377m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i10));
        }
        if (this.f2371e > 0) {
            setMeasuredDimension(size, i5);
            return;
        }
        int childCount = getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i11) {
                i11 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2373g = false;
        }
        if (!this.f2373g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2373g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f2373g = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f2371e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2377m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2377m = view;
        if (view != null && (linearLayout = this.f2378n) != null) {
            removeView(linearLayout);
            this.f2378n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2374j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        X.k(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f2382s) {
            requestLayout();
        }
        this.f2382s = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
