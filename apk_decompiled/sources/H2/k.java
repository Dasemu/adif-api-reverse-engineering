package H2;

import O.AbstractC0084z;
import O.N;
import O.X;
import a.AbstractC0106b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import k2.C0417a;
import kotlin.jvm.internal.IntCompanionObject;
import m.W0;

/* loaded from: classes3.dex */
public final class k extends LinearLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f714l = 0;

    /* renamed from: a, reason: collision with root package name */
    public h f715a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f716b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f717c;

    /* renamed from: d, reason: collision with root package name */
    public View f718d;

    /* renamed from: e, reason: collision with root package name */
    public C0417a f719e;

    /* renamed from: f, reason: collision with root package name */
    public View f720f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f721g;
    public ImageView h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public int f722j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TabLayout f723k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TabLayout tabLayout, Context context) {
        super(context);
        this.f723k = tabLayout;
        this.f722j = 2;
        e(context);
        int i = tabLayout.f5788e;
        WeakHashMap weakHashMap = X.f1226a;
        setPaddingRelative(i, tabLayout.f5789f, tabLayout.f5790g, tabLayout.h);
        setGravity(17);
        setOrientation(!tabLayout.f5766C ? 1 : 0);
        setClickable(true);
        N.d(this, AbstractC0084z.b(getContext(), 1002));
    }

    private C0417a getBadge() {
        return this.f719e;
    }

    private C0417a getOrCreateBadge() {
        if (this.f719e == null) {
            this.f719e = new C0417a(getContext(), null);
        }
        b();
        C0417a c0417a = this.f719e;
        if (c0417a != null) {
            return c0417a;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a() {
        if (this.f719e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f718d;
            if (view != null) {
                C0417a c0417a = this.f719e;
                if (c0417a != null) {
                    if (c0417a.d() != null) {
                        c0417a.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(c0417a);
                    }
                }
                this.f718d = null;
            }
        }
    }

    public final void b() {
        if (this.f719e != null) {
            if (this.f720f != null) {
                a();
                return;
            }
            TextView textView = this.f716b;
            if (textView == null || this.f715a == null) {
                a();
                return;
            }
            if (this.f718d == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.f716b;
            if (this.f719e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            C0417a c0417a = this.f719e;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            c0417a.setBounds(rect);
            c0417a.i(textView2, null);
            if (c0417a.d() != null) {
                c0417a.d().setForeground(c0417a);
            } else {
                textView2.getOverlay().add(c0417a);
            }
            this.f718d = textView2;
        }
    }

    public final void c(View view) {
        C0417a c0417a = this.f719e;
        if (c0417a == null || view != this.f718d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c0417a.setBounds(rect);
        c0417a.i(view, null);
    }

    public final void d() {
        boolean z3;
        f();
        h hVar = this.f715a;
        if (hVar != null) {
            TabLayout tabLayout = hVar.f707d;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == hVar.f705b) {
                z3 = true;
                setSelected(z3);
            }
        }
        z3 = false;
        setSelected(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if ((drawable == null || !drawable.isStateful()) ? false : this.i.setState(drawableState)) {
            invalidate();
            this.f723k.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [H2.k, android.view.View] */
    public final void e(Context context) {
        TabLayout tabLayout = this.f723k;
        int i = tabLayout.f5799s;
        if (i != 0) {
            Drawable m4 = AbstractC0106b.m(context, i);
            this.i = m4;
            if (m4 != null && m4.isStateful()) {
                this.i.setState(getDrawableState());
            }
        } else {
            this.i = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.f5795n != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList a2 = C2.a.a(tabLayout.f5795n);
            boolean z3 = tabLayout.f5770G;
            if (z3) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(a2, gradientDrawable, z3 ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = X.f1226a;
        setBackground(gradientDrawable);
        tabLayout.invalidate();
    }

    public final void f() {
        int i;
        ViewParent parent;
        h hVar = this.f715a;
        View view = hVar != null ? hVar.f706c : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f720f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f720f);
                }
                addView(view);
            }
            this.f720f = view;
            TextView textView = this.f716b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f717c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f717c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f721g = textView2;
            if (textView2 != null) {
                this.f722j = textView2.getMaxLines();
            }
            this.h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f720f;
            if (view3 != null) {
                removeView(view3);
                this.f720f = null;
            }
            this.f721g = null;
            this.h = null;
        }
        if (this.f720f == null) {
            if (this.f717c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.adif.elcanomovil.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f717c = imageView2;
                addView(imageView2, 0);
            }
            if (this.f716b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.adif.elcanomovil.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f716b = textView3;
                addView(textView3);
                this.f722j = this.f716b.getMaxLines();
            }
            TextView textView4 = this.f716b;
            TabLayout tabLayout = this.f723k;
            textView4.setTextAppearance(tabLayout.i);
            if (!isSelected() || (i = tabLayout.f5792k) == -1) {
                this.f716b.setTextAppearance(tabLayout.f5791j);
            } else {
                this.f716b.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.f5793l;
            if (colorStateList != null) {
                this.f716b.setTextColor(colorStateList);
            }
            g(this.f716b, this.f717c, true);
            b();
            ImageView imageView3 = this.f717c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new j(this, imageView3));
            }
            TextView textView5 = this.f716b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new j(this, textView5));
            }
        } else {
            TextView textView6 = this.f721g;
            if (textView6 != null || this.h != null) {
                g(textView6, this.h, false);
            }
        }
        if (hVar == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void g(TextView textView, ImageView imageView, boolean z3) {
        boolean z4;
        h hVar = this.f715a;
        CharSequence charSequence = hVar != null ? hVar.f704a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (isEmpty) {
                z4 = false;
            } else {
                this.f715a.getClass();
                z4 = true;
            }
            textView.setText(!isEmpty ? charSequence : null);
            textView.setVisibility(z4 ? 0 : 8);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z4 = false;
        }
        if (z3 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int e4 = (z4 && imageView.getVisibility() == 0) ? (int) x2.m.e(getContext(), 8) : 0;
            if (this.f723k.f5766C) {
                if (e4 != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(e4);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (e4 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = e4;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        W0.a(this, isEmpty ? null : charSequence);
    }

    public int getContentHeight() {
        View[] viewArr = {this.f716b, this.f717c, this.f720f};
        int i = 0;
        int i4 = 0;
        boolean z3 = false;
        for (int i5 = 0; i5 < 3; i5++) {
            View view = viewArr[i5];
            if (view != null && view.getVisibility() == 0) {
                i4 = z3 ? Math.min(i4, view.getTop()) : view.getTop();
                i = z3 ? Math.max(i, view.getBottom()) : view.getBottom();
                z3 = true;
            }
        }
        return i - i4;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f716b, this.f717c, this.f720f};
        int i = 0;
        int i4 = 0;
        boolean z3 = false;
        for (int i5 = 0; i5 < 3; i5++) {
            View view = viewArr[i5];
            if (view != null && view.getVisibility() == 0) {
                i4 = z3 ? Math.min(i4, view.getLeft()) : view.getLeft();
                i = z3 ? Math.max(i, view.getRight()) : view.getRight();
                z3 = true;
            }
        }
        return i - i4;
    }

    public h getTab() {
        return this.f715a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0417a c0417a = this.f719e;
        if (c0417a != null && c0417a.isVisible()) {
            accessibilityNodeInfo.setContentDescription(this.f719e.c());
        }
        accessibilityNodeInfo.setCollectionItemInfo(P.j.a(isSelected(), 0, 1, this.f715a.f705b, 1).f1340a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) P.f.f1330e.f1336a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.adif.elcanomovil.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.f723k;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.f5800t, IntCompanionObject.MIN_VALUE);
        }
        super.onMeasure(i, i4);
        if (this.f716b != null) {
            float f2 = tabLayout.f5797q;
            int i5 = this.f722j;
            ImageView imageView = this.f717c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f716b;
                if (textView != null && textView.getLineCount() > 1) {
                    f2 = tabLayout.f5798r;
                }
            } else {
                i5 = 1;
            }
            float textSize = this.f716b.getTextSize();
            int lineCount = this.f716b.getLineCount();
            int maxLines = this.f716b.getMaxLines();
            if (f2 != textSize || (maxLines >= 0 && i5 != maxLines)) {
                if (tabLayout.f5765B == 1 && f2 > textSize && lineCount == 1) {
                    Layout layout = this.f716b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f2 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f716b.setTextSize(0, f2);
                this.f716b.setMaxLines(i5);
                super.onMeasure(i, i4);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f715a == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        h hVar = this.f715a;
        TabLayout tabLayout = hVar.f707d;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.k(hVar, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z3) {
        isSelected();
        super.setSelected(z3);
        TextView textView = this.f716b;
        if (textView != null) {
            textView.setSelected(z3);
        }
        ImageView imageView = this.f717c;
        if (imageView != null) {
            imageView.setSelected(z3);
        }
        View view = this.f720f;
        if (view != null) {
            view.setSelected(z3);
        }
    }

    public void setTab(h hVar) {
        if (hVar != this.f715a) {
            this.f715a = hVar;
            d();
        }
    }
}
