package z2;

import H0.p;
import O.AbstractC0084z;
import O.N;
import O.X;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f0.C0338b;
import i2.AbstractC0396a;
import java.util.WeakHashMap;
import k2.C0417a;
import l.o;
import l.z;
import m.W0;
import m2.ViewOnLayoutChangeListenerC0506a;
import n2.C0514a;

/* renamed from: z2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0673c extends FrameLayout implements z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f9018G = {R.attr.state_checked};

    /* renamed from: H, reason: collision with root package name */
    public static final C0338b f9019H = new C0338b(22);

    /* renamed from: I, reason: collision with root package name */
    public static final C0672b f9020I = new C0338b(22);

    /* renamed from: A, reason: collision with root package name */
    public boolean f9021A;

    /* renamed from: B, reason: collision with root package name */
    public int f9022B;

    /* renamed from: C, reason: collision with root package name */
    public int f9023C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9024D;

    /* renamed from: E, reason: collision with root package name */
    public int f9025E;

    /* renamed from: F, reason: collision with root package name */
    public C0417a f9026F;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9027a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f9028b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f9029c;

    /* renamed from: d, reason: collision with root package name */
    public int f9030d;

    /* renamed from: e, reason: collision with root package name */
    public int f9031e;

    /* renamed from: f, reason: collision with root package name */
    public int f9032f;

    /* renamed from: g, reason: collision with root package name */
    public float f9033g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f9034j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9035k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f9036l;

    /* renamed from: m, reason: collision with root package name */
    public final View f9037m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f9038n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewGroup f9039o;
    public final TextView p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f9040q;

    /* renamed from: r, reason: collision with root package name */
    public int f9041r;

    /* renamed from: s, reason: collision with root package name */
    public int f9042s;

    /* renamed from: t, reason: collision with root package name */
    public o f9043t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f9044u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f9045v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f9046w;

    /* renamed from: x, reason: collision with root package name */
    public ValueAnimator f9047x;

    /* renamed from: y, reason: collision with root package name */
    public C0338b f9048y;

    /* renamed from: z, reason: collision with root package name */
    public float f9049z;

    public AbstractC0673c(Context context) {
        super(context);
        this.f9027a = false;
        this.f9041r = -1;
        this.f9042s = 0;
        this.f9048y = f9019H;
        this.f9049z = BitmapDescriptorFactory.HUE_RED;
        this.f9021A = false;
        this.f9022B = 0;
        this.f9023C = 0;
        this.f9024D = false;
        this.f9025E = 0;
        int i = 1;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f9036l = (FrameLayout) findViewById(com.adif.elcanomovil.R.id.navigation_bar_item_icon_container);
        this.f9037m = findViewById(com.adif.elcanomovil.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.adif.elcanomovil.R.id.navigation_bar_item_icon_view);
        this.f9038n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.adif.elcanomovil.R.id.navigation_bar_item_labels_group);
        this.f9039o = viewGroup;
        TextView textView = (TextView) findViewById(com.adif.elcanomovil.R.id.navigation_bar_item_small_label_view);
        this.p = textView;
        TextView textView2 = (TextView) findViewById(com.adif.elcanomovil.R.id.navigation_bar_item_large_label_view);
        this.f9040q = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f9030d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f9031e = viewGroup.getPaddingBottom();
        this.f9032f = getResources().getDimensionPixelSize(com.adif.elcanomovil.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = X.f1226a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0506a((C0514a) this, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lb
            goto L1f
        Lb:
            int[] r2 = h2.AbstractC0379a.f6751E
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
        L1f:
            r5 = r1
            goto L4c
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.AbstractC0673c.f(android.widget.TextView, int):void");
    }

    public static void g(View view, float f2, float f4, int i) {
        view.setScaleX(f2);
        view.setScaleY(f4);
        view.setVisibility(i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f9036l;
        return frameLayout != null ? frameLayout : this.f9038n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i4 = 0; i4 < indexOfChild; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof AbstractC0673c) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        C0417a c0417a = this.f9026F;
        int minimumWidth = c0417a == null ? 0 : c0417a.getMinimumWidth() - this.f9026F.f7054e.f7089b.f7084w.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f9038n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i, int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i4;
        view.setLayoutParams(layoutParams);
    }

    public static void j(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public final void a(float f2, float f4) {
        this.f9033g = f2 - f4;
        this.h = (f4 * 1.0f) / f2;
        this.i = (f2 * 1.0f) / f4;
    }

    @Override // l.z
    public final void b(o oVar) {
        this.f9043t = oVar;
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setIcon(oVar.getIcon());
        setTitle(oVar.f7272e);
        setId(oVar.f7268a);
        if (!TextUtils.isEmpty(oVar.f7281q)) {
            setContentDescription(oVar.f7281q);
        }
        W0.a(this, !TextUtils.isEmpty(oVar.f7282r) ? oVar.f7282r : oVar.f7272e);
        setVisibility(oVar.isVisible() ? 0 : 8);
        this.f9027a = true;
    }

    public final void c() {
        o oVar = this.f9043t;
        if (oVar != null) {
            setChecked(oVar.isChecked());
        }
    }

    public final void d() {
        Drawable drawable = this.f9029c;
        ColorStateList colorStateList = this.f9028b;
        FrameLayout frameLayout = this.f9036l;
        RippleDrawable rippleDrawable = null;
        boolean z3 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f9021A && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(C2.a.c(this.f9028b), null, activeIndicatorDrawable);
                z3 = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(C2.a.a(this.f9028b), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable);
        }
        WeakHashMap weakHashMap = X.f1226a;
        setBackground(drawable);
        setDefaultFocusHighlightEnabled(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f9036l;
        if (frameLayout != null && this.f9021A) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f2, float f4) {
        View view = this.f9037m;
        if (view != null) {
            C0338b c0338b = this.f9048y;
            c0338b.getClass();
            view.setScaleX(AbstractC0396a.a(0.4f, 1.0f, f2));
            view.setScaleY(c0338b.i(f2, f4));
            view.setAlpha(AbstractC0396a.b(BitmapDescriptorFactory.HUE_RED, 1.0f, f4 == BitmapDescriptorFactory.HUE_RED ? 0.8f : 0.0f, f4 == BitmapDescriptorFactory.HUE_RED ? 1.0f : 0.2f, f2));
        }
        this.f9049z = f2;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f9037m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C0417a getBadge() {
        return this.f9026F;
    }

    public int getItemBackgroundResId() {
        return com.adif.elcanomovil.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // l.z
    public o getItemData() {
        return this.f9043t;
    }

    public int getItemDefaultMarginResId() {
        return com.adif.elcanomovil.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f9041r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f9039o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f9032f : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f9039o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(int i) {
        View view = this.f9037m;
        if (view == null || i <= 0) {
            return;
        }
        int min = Math.min(this.f9022B, i - (this.f9025E * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f9024D && this.f9034j == 2) ? min : this.f9023C;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o oVar = this.f9043t;
        if (oVar != null && oVar.isCheckable() && this.f9043t.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9018G);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0417a c0417a = this.f9026F;
        if (c0417a != null && c0417a.isVisible()) {
            o oVar = this.f9043t;
            CharSequence charSequence = oVar.f7272e;
            if (!TextUtils.isEmpty(oVar.f7281q)) {
                charSequence = this.f9043t.f7281q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f9026F.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo(P.j.a(isSelected(), 0, 1, getItemVisiblePosition(), 1).f1340a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) P.f.f1330e.f1336a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.adif.elcanomovil.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i5, int i6) {
        super.onSizeChanged(i, i4, i5, i6);
        post(new p(i, 4, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f9037m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z3) {
        this.f9021A = z3;
        d();
        View view = this.f9037m;
        if (view != null) {
            view.setVisibility(z3 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f9023C = i;
        i(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f9032f != i) {
            this.f9032f = i;
            c();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f9025E = i;
        i(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z3) {
        this.f9024D = z3;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f9022B = i;
        i(getWidth());
    }

    public void setBadge(C0417a c0417a) {
        C0417a c0417a2 = this.f9026F;
        if (c0417a2 == c0417a) {
            return;
        }
        boolean z3 = c0417a2 != null;
        ImageView imageView = this.f9038n;
        if (z3 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f9026F != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C0417a c0417a3 = this.f9026F;
                if (c0417a3 != null) {
                    if (c0417a3.d() != null) {
                        c0417a3.d().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c0417a3);
                    }
                }
                this.f9026F = null;
            }
        }
        this.f9026F = c0417a;
        if (imageView == null || c0417a == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        C0417a c0417a4 = this.f9026F;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        c0417a4.setBounds(rect);
        c0417a4.i(imageView, null);
        if (c0417a4.d() != null) {
            c0417a4.d().setForeground(c0417a4);
        } else {
            imageView.getOverlay().add(c0417a4);
        }
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.AbstractC0673c.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        this.p.setEnabled(z3);
        this.f9040q.setEnabled(z3);
        this.f9038n.setEnabled(z3);
        if (!z3) {
            WeakHashMap weakHashMap = X.f1226a;
            N.d(this, null);
        } else {
            PointerIcon b4 = AbstractC0084z.b(getContext(), 1002);
            WeakHashMap weakHashMap2 = X.f1226a;
            N.d(this, b4);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f9045v) {
            return;
        }
        this.f9045v = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f9046w = drawable;
            ColorStateList colorStateList = this.f9044u;
            if (colorStateList != null) {
                H.a.h(drawable, colorStateList);
            }
        }
        this.f9038n.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f9038n;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f9044u = colorStateList;
        if (this.f9043t == null || (drawable = this.f9046w) == null) {
            return;
        }
        H.a.h(drawable, colorStateList);
        this.f9046w.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : D.h.getDrawable(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f9031e != i) {
            this.f9031e = i;
            c();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f9030d != i) {
            this.f9030d = i;
            c();
        }
    }

    public void setItemPosition(int i) {
        this.f9041r = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f9028b = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f9034j != i) {
            this.f9034j = i;
            if (this.f9024D && i == 2) {
                this.f9048y = f9020I;
            } else {
                this.f9048y = f9019H;
            }
            i(getWidth());
            c();
        }
    }

    public void setShifting(boolean z3) {
        if (this.f9035k != z3) {
            this.f9035k = z3;
            c();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.f9042s = i;
        TextView textView = this.f9040q;
        f(textView, i);
        a(this.p.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z3) {
        setTextAppearanceActive(this.f9042s);
        TextView textView = this.f9040q;
        textView.setTypeface(textView.getTypeface(), z3 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.p;
        f(textView, i);
        a(textView.getTextSize(), this.f9040q.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.p.setTextColor(colorStateList);
            this.f9040q.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.p.setText(charSequence);
        this.f9040q.setText(charSequence);
        o oVar = this.f9043t;
        if (oVar == null || TextUtils.isEmpty(oVar.f7281q)) {
            setContentDescription(charSequence);
        }
        o oVar2 = this.f9043t;
        if (oVar2 != null && !TextUtils.isEmpty(oVar2.f7282r)) {
            charSequence = this.f9043t.f7282r;
        }
        W0.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f9029c = drawable;
        d();
    }
}
