package G2;

import O.J;
import O.L;
import O.X;
import a.AbstractC0105a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.adif.elcanomovil.R;
import h2.AbstractC0379a;
import j0.C0399a;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class j extends FrameLayout {

    /* renamed from: l */
    public static final i f586l = new i(0);

    /* renamed from: a */
    public k f587a;

    /* renamed from: b */
    public final E2.k f588b;

    /* renamed from: c */
    public int f589c;

    /* renamed from: d */
    public final float f590d;

    /* renamed from: e */
    public final float f591e;

    /* renamed from: f */
    public final int f592f;

    /* renamed from: g */
    public final int f593g;
    public ColorStateList h;
    public PorterDuff.Mode i;

    /* renamed from: j */
    public Rect f594j;

    /* renamed from: k */
    public boolean f595k;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Context context, AttributeSet attributeSet) {
        super(K2.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0379a.f6748B);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = X.f1226a;
            L.s(this, dimensionPixelSize);
        }
        this.f589c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f588b = E2.k.b(context2, attributeSet, 0, 0).a();
        }
        this.f590d = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0105a.w(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(x2.m.j(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f591e = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f592f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f593g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f586l);
        setFocusable(true);
        if (getBackground() == null) {
            int y3 = m3.d.y(getBackgroundOverlayColorAlpha(), m3.d.t(this, R.attr.colorSurface), m3.d.t(this, R.attr.colorOnSurface));
            E2.k kVar = this.f588b;
            if (kVar != null) {
                C0399a c0399a = k.f597v;
                E2.g gVar = new E2.g(kVar);
                gVar.j(ColorStateList.valueOf(y3));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                C0399a c0399a2 = k.f597v;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(y3);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.h;
            if (colorStateList != null) {
                H.a.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = X.f1226a;
            setBackground(gradientDrawable);
        }
    }

    public static /* synthetic */ void a(j jVar, k kVar) {
        jVar.setBaseTransientBottomBar(kVar);
    }

    public void setBaseTransientBottomBar(k kVar) {
        this.f587a = kVar;
    }

    public float getActionTextColorAlpha() {
        return this.f591e;
    }

    public int getAnimationMode() {
        return this.f589c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f590d;
    }

    public int getMaxInlineActionWidth() {
        return this.f593g;
    }

    public int getMaxWidth() {
        return this.f592f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        k kVar = this.f587a;
        if (kVar != null && (rootWindowInsets = kVar.i.getRootWindowInsets()) != null) {
            kVar.p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            kVar.e();
        }
        WeakHashMap weakHashMap = X.f1226a;
        J.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z3;
        super.onDetachedFromWindow();
        k kVar = this.f587a;
        if (kVar != null) {
            A.j h = A.j.h();
            g gVar = kVar.f619u;
            synchronized (h.f27a) {
                z3 = true;
                if (!h.k(gVar)) {
                    o oVar = (o) h.f30d;
                    if (!(oVar != null && oVar.f627a.get() == gVar)) {
                        z3 = false;
                    }
                }
            }
            if (z3) {
                k.f600y.post(new e(kVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        k kVar = this.f587a;
        if (kVar == null || !kVar.f616r) {
            return;
        }
        kVar.d();
        kVar.f616r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int i5 = this.f592f;
        if (i5 <= 0 || getMeasuredWidth() <= i5) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i4);
    }

    public void setAnimationMode(int i) {
        this.f589c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.h != null) {
            drawable = drawable.mutate();
            H.a.h(drawable, this.h);
            H.a.i(drawable, this.i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.h = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            H.a.h(mutate, colorStateList);
            H.a.i(mutate, this.i);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            H.a.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.f595k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f594j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        k kVar = this.f587a;
        if (kVar != null) {
            C0399a c0399a = k.f597v;
            kVar.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f586l);
        super.setOnClickListener(onClickListener);
    }
}
