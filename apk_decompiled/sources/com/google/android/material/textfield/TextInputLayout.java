package com.google.android.material.textfield;

import B0.C0030h;
import B0.w;
import E2.e;
import E2.f;
import E2.g;
import E2.j;
import E2.k;
import I2.A;
import I2.B;
import I2.C;
import I2.D;
import I2.n;
import I2.q;
import I2.t;
import I2.u;
import I2.x;
import I2.z;
import K2.a;
import O.O;
import O.X;
import R0.h;
import a.AbstractC0105a;
import a.AbstractC0106b;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.CheckableImageButton;
import h2.AbstractC0379a;
import i2.AbstractC0396a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import m.AbstractC0463g0;
import m.C0487t;
import m.W;
import m3.d;
import m3.l;
import x2.b;
import x2.c;
import x2.m;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f5809C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f5810A;
    public boolean A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f5811B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f5812B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f5813C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f5814D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5815E;

    /* renamed from: F, reason: collision with root package name */
    public g f5816F;

    /* renamed from: G, reason: collision with root package name */
    public g f5817G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f5818H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5819I;
    public g J;

    /* renamed from: K, reason: collision with root package name */
    public g f5820K;

    /* renamed from: L, reason: collision with root package name */
    public k f5821L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f5822M;

    /* renamed from: N, reason: collision with root package name */
    public final int f5823N;

    /* renamed from: O, reason: collision with root package name */
    public int f5824O;

    /* renamed from: P, reason: collision with root package name */
    public int f5825P;

    /* renamed from: Q, reason: collision with root package name */
    public int f5826Q;

    /* renamed from: R, reason: collision with root package name */
    public int f5827R;

    /* renamed from: S, reason: collision with root package name */
    public int f5828S;

    /* renamed from: T, reason: collision with root package name */
    public int f5829T;

    /* renamed from: U, reason: collision with root package name */
    public int f5830U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f5831V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f5832W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f5833a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f5834a0;

    /* renamed from: b, reason: collision with root package name */
    public final z f5835b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f5836b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f5837c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f5838c0;

    /* renamed from: d, reason: collision with root package name */
    public EditText f5839d;

    /* renamed from: d0, reason: collision with root package name */
    public int f5840d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f5841e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f5842e0;

    /* renamed from: f, reason: collision with root package name */
    public int f5843f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f5844f0;

    /* renamed from: g, reason: collision with root package name */
    public int f5845g;

    /* renamed from: g0, reason: collision with root package name */
    public int f5846g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f5847h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f5848i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f5849j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f5850j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5851k;

    /* renamed from: k0, reason: collision with root package name */
    public int f5852k0;

    /* renamed from: l, reason: collision with root package name */
    public int f5853l;

    /* renamed from: l0, reason: collision with root package name */
    public int f5854l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5855m;

    /* renamed from: m0, reason: collision with root package name */
    public int f5856m0;

    /* renamed from: n, reason: collision with root package name */
    public C f5857n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f5858n0;

    /* renamed from: o, reason: collision with root package name */
    public W f5859o;

    /* renamed from: o0, reason: collision with root package name */
    public int f5860o0;
    public int p;

    /* renamed from: p0, reason: collision with root package name */
    public int f5861p0;

    /* renamed from: q, reason: collision with root package name */
    public int f5862q;

    /* renamed from: q0, reason: collision with root package name */
    public int f5863q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f5864r;

    /* renamed from: r0, reason: collision with root package name */
    public int f5865r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5866s;

    /* renamed from: s0, reason: collision with root package name */
    public int f5867s0;

    /* renamed from: t, reason: collision with root package name */
    public W f5868t;

    /* renamed from: t0, reason: collision with root package name */
    public int f5869t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f5870u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f5871u0;

    /* renamed from: v, reason: collision with root package name */
    public int f5872v;

    /* renamed from: v0, reason: collision with root package name */
    public final b f5873v0;

    /* renamed from: w, reason: collision with root package name */
    public C0030h f5874w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f5875w0;

    /* renamed from: x, reason: collision with root package name */
    public C0030h f5876x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f5877x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f5878y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f5879y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f5880z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f5881z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.adif.elcanomovil.R.attr.textInputStyle, 2132018093), attributeSet, com.adif.elcanomovil.R.attr.textInputStyle);
        this.f5843f = -1;
        this.f5845g = -1;
        this.h = -1;
        this.i = -1;
        this.f5849j = new u(this);
        this.f5857n = new w(5);
        this.f5831V = new Rect();
        this.f5832W = new Rect();
        this.f5834a0 = new RectF();
        this.f5842e0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f5873v0 = bVar;
        this.f5812B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f5833a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0396a.f6815a;
        bVar.f8904Q = linearInterpolator;
        bVar.h(false);
        bVar.f8903P = linearInterpolator;
        bVar.h(false);
        if (bVar.f8925g != 8388659) {
            bVar.f8925g = 8388659;
            bVar.h(false);
        }
        h i = m.i(context2, attributeSet, AbstractC0379a.f6753G, com.adif.elcanomovil.R.attr.textInputStyle, 2132018093, 22, 20, 40, 45, 49);
        z zVar = new z(this, i);
        this.f5835b = zVar;
        TypedArray typedArray = (TypedArray) i.f1414b;
        this.f5813C = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f5877x0 = typedArray.getBoolean(47, true);
        this.f5875w0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f5821L = k.b(context2, attributeSet, com.adif.elcanomovil.R.attr.textInputStyle, 2132018093).a();
        this.f5823N = context2.getResources().getDimensionPixelOffset(com.adif.elcanomovil.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f5825P = typedArray.getDimensionPixelOffset(9, 0);
        this.f5827R = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.adif.elcanomovil.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f5828S = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.adif.elcanomovil.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f5826Q = this.f5827R;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        j e4 = this.f5821L.e();
        if (dimension >= BitmapDescriptorFactory.HUE_RED) {
            e4.f422e = new E2.a(dimension);
        }
        if (dimension2 >= BitmapDescriptorFactory.HUE_RED) {
            e4.f423f = new E2.a(dimension2);
        }
        if (dimension3 >= BitmapDescriptorFactory.HUE_RED) {
            e4.f424g = new E2.a(dimension3);
        }
        if (dimension4 >= BitmapDescriptorFactory.HUE_RED) {
            e4.h = new E2.a(dimension4);
        }
        this.f5821L = e4.a();
        ColorStateList v3 = AbstractC0105a.v(context2, i, 7);
        if (v3 != null) {
            int defaultColor = v3.getDefaultColor();
            this.f5860o0 = defaultColor;
            this.f5830U = defaultColor;
            if (v3.isStateful()) {
                this.f5861p0 = v3.getColorForState(new int[]{-16842910}, -1);
                this.f5863q0 = v3.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f5865r0 = v3.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f5863q0 = this.f5860o0;
                ColorStateList colorStateList = D.h.getColorStateList(context2, com.adif.elcanomovil.R.color.mtrl_filled_background_color);
                this.f5861p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f5865r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f5830U = 0;
            this.f5860o0 = 0;
            this.f5861p0 = 0;
            this.f5863q0 = 0;
            this.f5865r0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList e5 = i.e(1);
            this.f5850j0 = e5;
            this.f5848i0 = e5;
        }
        ColorStateList v4 = AbstractC0105a.v(context2, i, 14);
        this.f5856m0 = typedArray.getColor(14, 0);
        this.f5852k0 = D.h.getColor(context2, com.adif.elcanomovil.R.color.mtrl_textinput_default_box_stroke_color);
        this.f5867s0 = D.h.getColor(context2, com.adif.elcanomovil.R.color.mtrl_textinput_disabled_color);
        this.f5854l0 = D.h.getColor(context2, com.adif.elcanomovil.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (v4 != null) {
            setBoxStrokeColorStateList(v4);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0105a.v(context2, i, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.f5810A = i.e(24);
        this.f5811B = i.e(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i4 = typedArray.getInt(34, 1);
        boolean z3 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z4 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z5 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f5862q = typedArray.getResourceId(22, 0);
        this.p = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i4);
        setCounterOverflowTextAppearance(this.p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f5862q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(i.e(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(i.e(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(i.e(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(i.e(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(i.e(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(i.e(58));
        }
        q qVar = new q(this, i);
        this.f5837c = qVar;
        boolean z6 = typedArray.getBoolean(0, true);
        i.n();
        WeakHashMap weakHashMap = X.f1226a;
        setImportantForAccessibility(2);
        O.m(this, 1);
        frameLayout.addView(zVar);
        frameLayout.addView(qVar);
        addView(frameLayout);
        setEnabled(z6);
        setHelperTextEnabled(z4);
        setErrorEnabled(z3);
        setCounterEnabled(z5);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f5839d;
        if (!(editText instanceof AutoCompleteTextView) || l.E(editText)) {
            return this.f5816F;
        }
        int t2 = d.t(this.f5839d, com.adif.elcanomovil.R.attr.colorControlHighlight);
        int i = this.f5824O;
        int[][] iArr = f5809C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.f5816F;
            int i4 = this.f5830U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{d.y(0.1f, t2, i4), i4}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f5816F;
        TypedValue V3 = l.V(context, com.adif.elcanomovil.R.attr.colorSurface, "TextInputLayout");
        int i5 = V3.resourceId;
        int color = i5 != 0 ? D.h.getColor(context, i5) : V3.data;
        g gVar3 = new g(gVar2.f400a.f386a);
        int y3 = d.y(0.1f, t2, color);
        gVar3.j(new ColorStateList(iArr, new int[]{y3, 0}));
        gVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{y3, color});
        g gVar4 = new g(gVar2.f400a.f386a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f5818H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f5818H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f5818H.addState(new int[0], f(false));
        }
        return this.f5818H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f5817G == null) {
            this.f5817G = f(true);
        }
        return this.f5817G;
    }

    public static void k(ViewGroup viewGroup, boolean z3) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z3);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z3);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f5839d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f5839d = editText;
        int i = this.f5843f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i4 = this.f5845g;
        if (i4 != -1) {
            setMaxEms(i4);
        } else {
            setMaxWidth(this.i);
        }
        this.f5819I = false;
        i();
        setTextInputAccessibilityDelegate(new B(this));
        Typeface typeface = this.f5839d.getTypeface();
        b bVar = this.f5873v0;
        bVar.m(typeface);
        float textSize = this.f5839d.getTextSize();
        if (bVar.h != textSize) {
            bVar.h = textSize;
            bVar.h(false);
        }
        float letterSpacing = this.f5839d.getLetterSpacing();
        if (bVar.f8910W != letterSpacing) {
            bVar.f8910W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f5839d.getGravity();
        int i5 = (gravity & (-113)) | 48;
        if (bVar.f8925g != i5) {
            bVar.f8925g = i5;
            bVar.h(false);
        }
        if (bVar.f8923f != gravity) {
            bVar.f8923f = gravity;
            bVar.h(false);
        }
        WeakHashMap weakHashMap = X.f1226a;
        this.f5869t0 = editText.getMinimumHeight();
        this.f5839d.addTextChangedListener(new A(this, editText));
        if (this.f5848i0 == null) {
            this.f5848i0 = this.f5839d.getHintTextColors();
        }
        if (this.f5813C) {
            if (TextUtils.isEmpty(this.f5814D)) {
                CharSequence hint = this.f5839d.getHint();
                this.f5841e = hint;
                setHint(hint);
                this.f5839d.setHint((CharSequence) null);
            }
            this.f5815E = true;
        }
        p();
        if (this.f5859o != null) {
            n(this.f5839d.getText());
        }
        r();
        this.f5849j.b();
        this.f5835b.bringToFront();
        q qVar = this.f5837c;
        qVar.bringToFront();
        Iterator it = this.f5842e0.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(this);
        }
        qVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f5814D)) {
            return;
        }
        this.f5814D = charSequence;
        b bVar = this.f5873v0;
        if (charSequence == null || !TextUtils.equals(bVar.f8889A, charSequence)) {
            bVar.f8889A = charSequence;
            bVar.f8890B = null;
            Bitmap bitmap = bVar.f8893E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f8893E = null;
            }
            bVar.h(false);
        }
        if (this.f5871u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f5866s == z3) {
            return;
        }
        if (z3) {
            W w3 = this.f5868t;
            if (w3 != null) {
                this.f5833a.addView(w3);
                this.f5868t.setVisibility(0);
            }
        } else {
            W w4 = this.f5868t;
            if (w4 != null) {
                w4.setVisibility(8);
            }
            this.f5868t = null;
        }
        this.f5866s = z3;
    }

    public final void a(float f2) {
        int i = 1;
        b bVar = this.f5873v0;
        if (bVar.f8915b == f2) {
            return;
        }
        if (this.f5879y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f5879y0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0106b.F(getContext(), com.adif.elcanomovil.R.attr.motionEasingEmphasizedInterpolator, AbstractC0396a.f6816b));
            this.f5879y0.setDuration(AbstractC0106b.E(getContext(), com.adif.elcanomovil.R.attr.motionDurationMedium4, 167));
            this.f5879y0.addUpdateListener(new H2.b(this, i));
        }
        this.f5879y0.setFloatValues(bVar.f8915b, f2);
        this.f5879y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f5833a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i4;
        g gVar = this.f5816F;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f400a.f386a;
        k kVar2 = this.f5821L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f5824O == 2 && (i = this.f5826Q) > -1 && (i4 = this.f5829T) != 0) {
            g gVar2 = this.f5816F;
            gVar2.f400a.f393j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i4);
            f fVar = gVar2.f400a;
            if (fVar.f389d != valueOf) {
                fVar.f389d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i5 = this.f5830U;
        if (this.f5824O == 1) {
            i5 = G.a.b(this.f5830U, d.s(getContext(), com.adif.elcanomovil.R.attr.colorSurface, 0));
        }
        this.f5830U = i5;
        this.f5816F.j(ColorStateList.valueOf(i5));
        g gVar3 = this.J;
        if (gVar3 != null && this.f5820K != null) {
            if (this.f5826Q > -1 && this.f5829T != 0) {
                gVar3.j(this.f5839d.isFocused() ? ColorStateList.valueOf(this.f5852k0) : ColorStateList.valueOf(this.f5829T));
                this.f5820K.j(ColorStateList.valueOf(this.f5829T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d4;
        if (!this.f5813C) {
            return 0;
        }
        int i = this.f5824O;
        b bVar = this.f5873v0;
        if (i == 0) {
            d4 = bVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d4 = bVar.d() / 2.0f;
        }
        return (int) d4;
    }

    public final C0030h d() {
        C0030h c0030h = new C0030h();
        c0030h.f185c = AbstractC0106b.E(getContext(), com.adif.elcanomovil.R.attr.motionDurationShort2, 87);
        c0030h.f186d = AbstractC0106b.F(getContext(), com.adif.elcanomovil.R.attr.motionEasingLinearInterpolator, AbstractC0396a.f6815a);
        return c0030h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f5839d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f5841e != null) {
            boolean z3 = this.f5815E;
            this.f5815E = false;
            CharSequence hint = editText.getHint();
            this.f5839d.setHint(this.f5841e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f5839d.setHint(hint);
                this.f5815E = z3;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f5833a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i4 = 0; i4 < frameLayout.getChildCount(); i4++) {
            View childAt = frameLayout.getChildAt(i4);
            ViewStructure newChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f5839d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z3 = this.f5813C;
        b bVar = this.f5873v0;
        if (z3) {
            bVar.getClass();
            int save = canvas2.save();
            if (bVar.f8890B != null) {
                RectF rectF = bVar.f8921e;
                if (rectF.width() > BitmapDescriptorFactory.HUE_RED && rectF.height() > BitmapDescriptorFactory.HUE_RED) {
                    TextPaint textPaint = bVar.f8901N;
                    textPaint.setTextSize(bVar.f8895G);
                    float f2 = bVar.p;
                    float f4 = bVar.f8932q;
                    float f5 = bVar.f8894F;
                    if (f5 != 1.0f) {
                        canvas2.scale(f5, f5, f2, f4);
                    }
                    if (bVar.f8920d0 <= 1 || bVar.f8891C) {
                        canvas2.translate(f2, f4);
                        bVar.f8912Y.draw(canvas2);
                    } else {
                        float lineStart = bVar.p - bVar.f8912Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(lineStart, f4);
                        float f6 = alpha;
                        textPaint.setAlpha((int) (bVar.f8916b0 * f6));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            float f7 = bVar.f8896H;
                            float f8 = bVar.f8897I;
                            float f9 = bVar.J;
                            int i4 = bVar.f8898K;
                            textPaint.setShadowLayer(f7, f8, f9, G.a.d(i4, (textPaint.getAlpha() * Color.alpha(i4)) / KotlinVersion.MAX_COMPONENT_VALUE));
                        }
                        bVar.f8912Y.draw(canvas2);
                        textPaint.setAlpha((int) (bVar.f8914a0 * f6));
                        if (i >= 31) {
                            float f10 = bVar.f8896H;
                            float f11 = bVar.f8897I;
                            float f12 = bVar.J;
                            int i5 = bVar.f8898K;
                            textPaint.setShadowLayer(f10, f11, f12, G.a.d(i5, (Color.alpha(i5) * textPaint.getAlpha()) / KotlinVersion.MAX_COMPONENT_VALUE));
                        }
                        int lineBaseline = bVar.f8912Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f8918c0;
                        float f13 = lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), BitmapDescriptorFactory.HUE_RED, f13, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(bVar.f8896H, bVar.f8897I, bVar.J, bVar.f8898K);
                        }
                        String trim = bVar.f8918c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(bVar.f8912Y.getLineEnd(0), str.length()), BitmapDescriptorFactory.HUE_RED, f13, (Paint) textPaint);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.f5820K == null || (gVar = this.J) == null) {
            return;
        }
        gVar.draw(canvas2);
        if (this.f5839d.isFocused()) {
            Rect bounds = this.f5820K.getBounds();
            Rect bounds2 = this.J.getBounds();
            float f14 = bVar.f8915b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0396a.c(f14, centerX, bounds2.left);
            bounds.right = AbstractC0396a.c(f14, centerX, bounds2.right);
            this.f5820K.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f5881z0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f5881z0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            x2.b r3 = r4.f5873v0
            if (r3 == 0) goto L2f
            r3.f8899L = r1
            android.content.res.ColorStateList r1 = r3.f8927k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f8926j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f5839d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = O.X.f1226a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f5881z0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.f5813C && !TextUtils.isEmpty(this.f5814D) && (this.f5816F instanceof I2.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, E2.k] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.b, java.lang.Object] */
    public final g f(boolean z3) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.adif.elcanomovil.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z3 ? dimensionPixelOffset : BitmapDescriptorFactory.HUE_RED;
        EditText editText = this.f5839d;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.adif.elcanomovil.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.adif.elcanomovil.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        E2.a aVar = new E2.a(f2);
        E2.a aVar2 = new E2.a(f2);
        E2.a aVar3 = new E2.a(dimensionPixelOffset);
        E2.a aVar4 = new E2.a(dimensionPixelOffset);
        ?? obj5 = new Object();
        obj5.f428a = obj;
        obj5.f429b = obj2;
        obj5.f430c = obj3;
        obj5.f431d = obj4;
        obj5.f432e = aVar;
        obj5.f433f = aVar2;
        obj5.f434g = aVar4;
        obj5.h = aVar3;
        obj5.i = eVar;
        obj5.f435j = eVar2;
        obj5.f436k = eVar3;
        obj5.f437l = eVar4;
        EditText editText2 = this.f5839d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            int i4 = g.f399u;
            TypedValue V3 = l.V(context, com.adif.elcanomovil.R.attr.colorSurface, g.class.getSimpleName());
            int i5 = V3.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i5 != 0 ? D.h.getColor(context, i5) : V3.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(obj5);
        f fVar = gVar.f400a;
        if (fVar.f392g == null) {
            fVar.f392g = new Rect();
        }
        gVar.f400a.f392g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z3) {
        return ((z3 || getPrefixText() == null) ? (!z3 || getSuffixText() == null) ? this.f5839d.getCompoundPaddingLeft() : this.f5837c.c() : this.f5835b.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f5839d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f5824O;
        if (i == 1 || i == 2) {
            return this.f5816F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f5830U;
    }

    public int getBoxBackgroundMode() {
        return this.f5824O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f5825P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean g4 = m.g(this);
        RectF rectF = this.f5834a0;
        return g4 ? this.f5821L.h.a(rectF) : this.f5821L.f434g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean g4 = m.g(this);
        RectF rectF = this.f5834a0;
        return g4 ? this.f5821L.f434g.a(rectF) : this.f5821L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean g4 = m.g(this);
        RectF rectF = this.f5834a0;
        return g4 ? this.f5821L.f432e.a(rectF) : this.f5821L.f433f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean g4 = m.g(this);
        RectF rectF = this.f5834a0;
        return g4 ? this.f5821L.f433f.a(rectF) : this.f5821L.f432e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f5856m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f5858n0;
    }

    public int getBoxStrokeWidth() {
        return this.f5827R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f5828S;
    }

    public int getCounterMaxLength() {
        return this.f5853l;
    }

    public CharSequence getCounterOverflowDescription() {
        W w3;
        if (this.f5851k && this.f5855m && (w3 = this.f5859o) != null) {
            return w3.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f5880z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f5878y;
    }

    public ColorStateList getCursorColor() {
        return this.f5810A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f5811B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f5848i0;
    }

    public EditText getEditText() {
        return this.f5839d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f5837c.f849g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f5837c.f849g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f5837c.f853m;
    }

    public int getEndIconMode() {
        return this.f5837c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f5837c.f854n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f5837c.f849g;
    }

    public CharSequence getError() {
        u uVar = this.f5849j;
        if (uVar.f887q) {
            return uVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f5849j.f890t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f5849j.f889s;
    }

    public int getErrorCurrentTextColors() {
        W w3 = this.f5849j.f888r;
        if (w3 != null) {
            return w3.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f5837c.f845c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f5849j;
        if (uVar.f894x) {
            return uVar.f893w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        W w3 = this.f5849j.f895y;
        if (w3 != null) {
            return w3.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f5813C) {
            return this.f5814D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f5873v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f5873v0;
        return bVar.e(bVar.f8927k);
    }

    public ColorStateList getHintTextColor() {
        return this.f5850j0;
    }

    public C getLengthCounter() {
        return this.f5857n;
    }

    public int getMaxEms() {
        return this.f5845g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f5843f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f5837c.f849g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f5837c.f849g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f5866s) {
            return this.f5864r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f5872v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f5870u;
    }

    public CharSequence getPrefixText() {
        return this.f5835b.f913c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f5835b.f912b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f5835b.f912b;
    }

    public k getShapeAppearanceModel() {
        return this.f5821L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f5835b.f914d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f5835b.f914d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f5835b.f917g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f5835b.h;
    }

    public CharSequence getSuffixText() {
        return this.f5837c.p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f5837c.f856q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f5837c.f856q;
    }

    public Typeface getTypeface() {
        return this.f5836b0;
    }

    public final int h(int i, boolean z3) {
        return i - ((z3 || getSuffixText() == null) ? (!z3 || getPrefixText() == null) ? this.f5839d.getCompoundPaddingRight() : this.f5835b.a() : this.f5837c.c());
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [I2.g, E2.g] */
    public final void i() {
        int i = this.f5824O;
        if (i == 0) {
            this.f5816F = null;
            this.J = null;
            this.f5820K = null;
        } else if (i == 1) {
            this.f5816F = new g(this.f5821L);
            this.J = new g();
            this.f5820K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.m(new StringBuilder(), this.f5824O, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f5813C || (this.f5816F instanceof I2.g)) {
                this.f5816F = new g(this.f5821L);
            } else {
                k kVar = this.f5821L;
                int i4 = I2.g.f815w;
                if (kVar == null) {
                    kVar = new k();
                }
                I2.f fVar = new I2.f(kVar, new RectF());
                ?? gVar = new g(fVar);
                gVar.f816v = fVar;
                this.f5816F = gVar;
            }
            this.J = null;
            this.f5820K = null;
        }
        s();
        x();
        if (this.f5824O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f5825P = getResources().getDimensionPixelSize(com.adif.elcanomovil.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0105a.H(getContext())) {
                this.f5825P = getResources().getDimensionPixelSize(com.adif.elcanomovil.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f5839d != null && this.f5824O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f5839d;
                WeakHashMap weakHashMap = X.f1226a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.adif.elcanomovil.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f5839d.getPaddingEnd(), getResources().getDimensionPixelSize(com.adif.elcanomovil.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC0105a.H(getContext())) {
                EditText editText2 = this.f5839d;
                WeakHashMap weakHashMap2 = X.f1226a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.adif.elcanomovil.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f5839d.getPaddingEnd(), getResources().getDimensionPixelSize(com.adif.elcanomovil.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f5824O != 0) {
            t();
        }
        EditText editText3 = this.f5839d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i5 = this.f5824O;
                if (i5 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i5 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f2;
        float f4;
        float f5;
        RectF rectF;
        float f6;
        int i;
        float f7;
        int i4;
        if (e()) {
            int width = this.f5839d.getWidth();
            int gravity = this.f5839d.getGravity();
            b bVar = this.f5873v0;
            boolean b4 = bVar.b(bVar.f8889A);
            bVar.f8891C = b4;
            Rect rect = bVar.f8919d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b4) {
                        i4 = rect.left;
                        f5 = i4;
                    } else {
                        f2 = rect.right;
                        f4 = bVar.Z;
                    }
                } else if (b4) {
                    f2 = rect.right;
                    f4 = bVar.Z;
                } else {
                    i4 = rect.left;
                    f5 = i4;
                }
                float max = Math.max(f5, rect.left);
                rectF = this.f5834a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f6 = (width / 2.0f) + (bVar.Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.f8891C) {
                        f7 = bVar.Z;
                        f6 = f7 + max;
                    } else {
                        i = rect.right;
                        f6 = i;
                    }
                } else if (bVar.f8891C) {
                    i = rect.right;
                    f6 = i;
                } else {
                    f7 = bVar.Z;
                    f6 = f7 + max;
                }
                rectF.right = Math.min(f6, rect.right);
                rectF.bottom = bVar.d() + rect.top;
                if (rectF.width() > BitmapDescriptorFactory.HUE_RED || rectF.height() <= BitmapDescriptorFactory.HUE_RED) {
                }
                float f8 = rectF.left;
                float f9 = this.f5823N;
                rectF.left = f8 - f9;
                rectF.right += f9;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f5826Q);
                I2.g gVar = (I2.g) this.f5816F;
                gVar.getClass();
                gVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f4 = bVar.Z / 2.0f;
            f5 = f2 - f4;
            float max2 = Math.max(f5, rect.left);
            rectF = this.f5834a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f6 = (width / 2.0f) + (bVar.Z / 2.0f);
            rectF.right = Math.min(f6, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() > BitmapDescriptorFactory.HUE_RED) {
            }
        }
    }

    public final void l(W w3, int i) {
        try {
            w3.setTextAppearance(i);
            if (w3.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        w3.setTextAppearance(2132017615);
        w3.setTextColor(D.h.getColor(getContext(), com.adif.elcanomovil.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.f5849j;
        return (uVar.f886o != 1 || uVar.f888r == null || TextUtils.isEmpty(uVar.p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((w) this.f5857n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z3 = this.f5855m;
        int i = this.f5853l;
        String str = null;
        if (i == -1) {
            this.f5859o.setText(String.valueOf(length));
            this.f5859o.setContentDescription(null);
            this.f5855m = false;
        } else {
            this.f5855m = length > i;
            Context context = getContext();
            this.f5859o.setContentDescription(context.getString(this.f5855m ? com.adif.elcanomovil.R.string.character_counter_overflowed_content_description : com.adif.elcanomovil.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f5853l)));
            if (z3 != this.f5855m) {
                o();
            }
            String str2 = M.b.f1065b;
            M.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? M.b.f1068e : M.b.f1067d;
            W w3 = this.f5859o;
            String string = getContext().getString(com.adif.elcanomovil.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f5853l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                M.g gVar = M.h.f1077a;
                str = bVar.c(string).toString();
            }
            w3.setText(str);
        }
        if (this.f5839d == null || z3 == this.f5855m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        W w3 = this.f5859o;
        if (w3 != null) {
            l(w3, this.f5855m ? this.p : this.f5862q);
            if (!this.f5855m && (colorStateList2 = this.f5878y) != null) {
                this.f5859o.setTextColor(colorStateList2);
            }
            if (!this.f5855m || (colorStateList = this.f5880z) == null) {
                return;
            }
            this.f5859o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5873v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f5837c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z3 = false;
        this.f5812B0 = false;
        if (this.f5839d != null && this.f5839d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f5835b.getMeasuredHeight()))) {
            this.f5839d.setMinimumHeight(max);
            z3 = true;
        }
        boolean q4 = q();
        if (z3 || q4) {
            this.f5839d.post(new F2.f(this, 3));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        EditText editText = this.f5839d;
        if (editText != null) {
            ThreadLocal threadLocal = c.f8942a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f5831V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = c.f8942a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = c.f8943b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.J;
            if (gVar != null) {
                int i7 = rect.bottom;
                gVar.setBounds(rect.left, i7 - this.f5827R, rect.right, i7);
            }
            g gVar2 = this.f5820K;
            if (gVar2 != null) {
                int i8 = rect.bottom;
                gVar2.setBounds(rect.left, i8 - this.f5828S, rect.right, i8);
            }
            if (this.f5813C) {
                float textSize = this.f5839d.getTextSize();
                b bVar = this.f5873v0;
                if (bVar.h != textSize) {
                    bVar.h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f5839d.getGravity();
                int i9 = (gravity & (-113)) | 48;
                if (bVar.f8925g != i9) {
                    bVar.f8925g = i9;
                    bVar.h(false);
                }
                if (bVar.f8923f != gravity) {
                    bVar.f8923f = gravity;
                    bVar.h(false);
                }
                if (this.f5839d == null) {
                    throw new IllegalStateException();
                }
                boolean g4 = m.g(this);
                int i10 = rect.bottom;
                Rect rect2 = this.f5832W;
                rect2.bottom = i10;
                int i11 = this.f5824O;
                if (i11 == 1) {
                    rect2.left = g(rect.left, g4);
                    rect2.top = rect.top + this.f5825P;
                    rect2.right = h(rect.right, g4);
                } else if (i11 != 2) {
                    rect2.left = g(rect.left, g4);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, g4);
                } else {
                    rect2.left = this.f5839d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f5839d.getPaddingRight();
                }
                int i12 = rect2.left;
                int i13 = rect2.top;
                int i14 = rect2.right;
                int i15 = rect2.bottom;
                Rect rect3 = bVar.f8919d;
                if (rect3.left != i12 || rect3.top != i13 || rect3.right != i14 || rect3.bottom != i15) {
                    rect3.set(i12, i13, i14, i15);
                    bVar.f8900M = true;
                }
                if (this.f5839d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f8902O;
                textPaint.setTextSize(bVar.h);
                textPaint.setTypeface(bVar.f8936u);
                textPaint.setLetterSpacing(bVar.f8910W);
                float f2 = -textPaint.ascent();
                rect2.left = this.f5839d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f5824O != 1 || this.f5839d.getMinLines() > 1) ? rect.top + this.f5839d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.f5839d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f5824O != 1 || this.f5839d.getMinLines() > 1) ? rect.bottom - this.f5839d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i16 = rect2.left;
                int i17 = rect2.top;
                int i18 = rect2.right;
                Rect rect4 = bVar.f8917c;
                if (rect4.left != i16 || rect4.top != i17 || rect4.right != i18 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i16, i17, i18, compoundPaddingBottom);
                    bVar.f8900M = true;
                }
                bVar.h(false);
                if (!e() || this.f5871u0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        EditText editText;
        super.onMeasure(i, i4);
        boolean z3 = this.f5812B0;
        q qVar = this.f5837c;
        if (!z3) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f5812B0 = true;
        }
        if (this.f5868t != null && (editText = this.f5839d) != null) {
            this.f5868t.setGravity(editText.getGravity());
            this.f5868t.setPadding(this.f5839d.getCompoundPaddingLeft(), this.f5839d.getCompoundPaddingTop(), this.f5839d.getCompoundPaddingRight(), this.f5839d.getCompoundPaddingBottom());
        }
        qVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof D)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        D d4 = (D) parcelable;
        super.onRestoreInstanceState(d4.f1880a);
        setError(d4.f798c);
        if (d4.f799d) {
            post(new F0.c(this, 1));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, E2.k] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z3 = i == 1;
        if (z3 != this.f5822M) {
            E2.c cVar = this.f5821L.f432e;
            RectF rectF = this.f5834a0;
            float a2 = cVar.a(rectF);
            float a4 = this.f5821L.f433f.a(rectF);
            float a5 = this.f5821L.h.a(rectF);
            float a6 = this.f5821L.f434g.a(rectF);
            k kVar = this.f5821L;
            AbstractC0106b abstractC0106b = kVar.f428a;
            AbstractC0106b abstractC0106b2 = kVar.f429b;
            AbstractC0106b abstractC0106b3 = kVar.f431d;
            AbstractC0106b abstractC0106b4 = kVar.f430c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(abstractC0106b2);
            j.b(abstractC0106b);
            j.b(abstractC0106b4);
            j.b(abstractC0106b3);
            E2.a aVar = new E2.a(a4);
            E2.a aVar2 = new E2.a(a2);
            E2.a aVar3 = new E2.a(a6);
            E2.a aVar4 = new E2.a(a5);
            ?? obj = new Object();
            obj.f428a = abstractC0106b2;
            obj.f429b = abstractC0106b;
            obj.f430c = abstractC0106b3;
            obj.f431d = abstractC0106b4;
            obj.f432e = aVar;
            obj.f433f = aVar2;
            obj.f434g = aVar4;
            obj.h = aVar3;
            obj.i = eVar;
            obj.f435j = eVar2;
            obj.f436k = eVar3;
            obj.f437l = eVar4;
            this.f5822M = z3;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, W.b, I2.D] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new W.b(super.onSaveInstanceState());
        if (m()) {
            bVar.f798c = getError();
        }
        q qVar = this.f5837c;
        bVar.f799d = qVar.i != 0 && qVar.f849g.f5718d;
        return bVar;
    }

    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f5810A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue T3 = l.T(context, com.adif.elcanomovil.R.attr.colorControlActivated);
            if (T3 != null) {
                int i = T3.resourceId;
                if (i != 0) {
                    colorStateList2 = D.h.getColorStateList(context, i);
                } else {
                    int i4 = T3.data;
                    if (i4 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i4);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f5839d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable mutate = this.f5839d.getTextCursorDrawable().mutate();
        if ((m() || (this.f5859o != null && this.f5855m)) && (colorStateList = this.f5811B) != null) {
            colorStateList2 = colorStateList;
        }
        H.a.h(mutate, colorStateList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        W w3;
        EditText editText = this.f5839d;
        if (editText == null || this.f5824O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0463g0.f7662a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0487t.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f5855m && (w3 = this.f5859o) != null) {
            mutate.setColorFilter(C0487t.c(w3.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f5839d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f5839d;
        if (editText == null || this.f5816F == null) {
            return;
        }
        if ((this.f5819I || editText.getBackground() == null) && this.f5824O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f5839d;
            WeakHashMap weakHashMap = X.f1226a;
            editText2.setBackground(editTextBoxBackground);
            this.f5819I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f5830U != i) {
            this.f5830U = i;
            this.f5860o0 = i;
            this.f5863q0 = i;
            this.f5865r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(D.h.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f5860o0 = defaultColor;
        this.f5830U = defaultColor;
        this.f5861p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f5863q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f5865r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f5824O) {
            return;
        }
        this.f5824O = i;
        if (this.f5839d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f5825P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e4 = this.f5821L.e();
        E2.c cVar = this.f5821L.f432e;
        AbstractC0106b m4 = d.m(i);
        e4.f418a = m4;
        j.b(m4);
        e4.f422e = cVar;
        E2.c cVar2 = this.f5821L.f433f;
        AbstractC0106b m5 = d.m(i);
        e4.f419b = m5;
        j.b(m5);
        e4.f423f = cVar2;
        E2.c cVar3 = this.f5821L.h;
        AbstractC0106b m6 = d.m(i);
        e4.f421d = m6;
        j.b(m6);
        e4.h = cVar3;
        E2.c cVar4 = this.f5821L.f434g;
        AbstractC0106b m7 = d.m(i);
        e4.f420c = m7;
        j.b(m7);
        e4.f424g = cVar4;
        this.f5821L = e4.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f5856m0 != i) {
            this.f5856m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f5852k0 = colorStateList.getDefaultColor();
            this.f5867s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f5854l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f5856m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f5856m0 != colorStateList.getDefaultColor()) {
            this.f5856m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f5858n0 != colorStateList) {
            this.f5858n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f5827R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f5828S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f5851k != z3) {
            u uVar = this.f5849j;
            if (z3) {
                W w3 = new W(getContext(), null);
                this.f5859o = w3;
                w3.setId(com.adif.elcanomovil.R.id.textinput_counter);
                Typeface typeface = this.f5836b0;
                if (typeface != null) {
                    this.f5859o.setTypeface(typeface);
                }
                this.f5859o.setMaxLines(1);
                uVar.a(this.f5859o, 2);
                ((ViewGroup.MarginLayoutParams) this.f5859o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.adif.elcanomovil.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f5859o != null) {
                    EditText editText = this.f5839d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f5859o, 2);
                this.f5859o = null;
            }
            this.f5851k = z3;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f5853l != i) {
            if (i > 0) {
                this.f5853l = i;
            } else {
                this.f5853l = -1;
            }
            if (!this.f5851k || this.f5859o == null) {
                return;
            }
            EditText editText = this.f5839d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.p != i) {
            this.p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f5880z != colorStateList) {
            this.f5880z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f5862q != i) {
            this.f5862q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f5878y != colorStateList) {
            this.f5878y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f5810A != colorStateList) {
            this.f5810A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f5811B != colorStateList) {
            this.f5811B = colorStateList;
            if (m() || (this.f5859o != null && this.f5855m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f5848i0 = colorStateList;
        this.f5850j0 = colorStateList;
        if (this.f5839d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        k(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.f5837c.f849g.setActivated(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.f5837c.f849g.setCheckable(z3);
    }

    public void setEndIconContentDescription(int i) {
        q qVar = this.f5837c;
        CharSequence text = i != 0 ? qVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = qVar.f849g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        q qVar = this.f5837c;
        Drawable m4 = i != 0 ? AbstractC0106b.m(qVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = qVar.f849g;
        checkableImageButton.setImageDrawable(m4);
        if (m4 != null) {
            ColorStateList colorStateList = qVar.f851k;
            PorterDuff.Mode mode = qVar.f852l;
            TextInputLayout textInputLayout = qVar.f843a;
            AbstractC0105a.b(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0105a.N(textInputLayout, checkableImageButton, qVar.f851k);
        }
    }

    public void setEndIconMinSize(int i) {
        q qVar = this.f5837c;
        if (i < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != qVar.f853m) {
            qVar.f853m = i;
            CheckableImageButton checkableImageButton = qVar.f849g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qVar.f845c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f5837c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f5837c;
        View.OnLongClickListener onLongClickListener = qVar.f855o;
        CheckableImageButton checkableImageButton = qVar.f849g;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0105a.P(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f5837c;
        qVar.f855o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f849g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0105a.P(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f5837c;
        qVar.f854n = scaleType;
        qVar.f849g.setScaleType(scaleType);
        qVar.f845c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f5837c;
        if (qVar.f851k != colorStateList) {
            qVar.f851k = colorStateList;
            AbstractC0105a.b(qVar.f843a, qVar.f849g, colorStateList, qVar.f852l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f5837c;
        if (qVar.f852l != mode) {
            qVar.f852l = mode;
            AbstractC0105a.b(qVar.f843a, qVar.f849g, qVar.f851k, mode);
        }
    }

    public void setEndIconVisible(boolean z3) {
        this.f5837c.h(z3);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f5849j;
        if (!uVar.f887q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            uVar.f();
            return;
        }
        uVar.c();
        uVar.p = charSequence;
        uVar.f888r.setText(charSequence);
        int i = uVar.f885n;
        if (i != 1) {
            uVar.f886o = 1;
        }
        uVar.i(i, uVar.f886o, uVar.h(uVar.f888r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u uVar = this.f5849j;
        uVar.f890t = i;
        W w3 = uVar.f888r;
        if (w3 != null) {
            WeakHashMap weakHashMap = X.f1226a;
            w3.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f5849j;
        uVar.f889s = charSequence;
        W w3 = uVar.f888r;
        if (w3 != null) {
            w3.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z3) {
        u uVar = this.f5849j;
        if (uVar.f887q == z3) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.h;
        if (z3) {
            W w3 = new W(uVar.f880g, null);
            uVar.f888r = w3;
            w3.setId(com.adif.elcanomovil.R.id.textinput_error);
            uVar.f888r.setTextAlignment(5);
            Typeface typeface = uVar.f873B;
            if (typeface != null) {
                uVar.f888r.setTypeface(typeface);
            }
            int i = uVar.f891u;
            uVar.f891u = i;
            W w4 = uVar.f888r;
            if (w4 != null) {
                textInputLayout.l(w4, i);
            }
            ColorStateList colorStateList = uVar.f892v;
            uVar.f892v = colorStateList;
            W w5 = uVar.f888r;
            if (w5 != null && colorStateList != null) {
                w5.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f889s;
            uVar.f889s = charSequence;
            W w6 = uVar.f888r;
            if (w6 != null) {
                w6.setContentDescription(charSequence);
            }
            int i4 = uVar.f890t;
            uVar.f890t = i4;
            W w7 = uVar.f888r;
            if (w7 != null) {
                WeakHashMap weakHashMap = X.f1226a;
                w7.setAccessibilityLiveRegion(i4);
            }
            uVar.f888r.setVisibility(4);
            uVar.a(uVar.f888r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f888r, 0);
            uVar.f888r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f887q = z3;
    }

    public void setErrorIconDrawable(int i) {
        q qVar = this.f5837c;
        qVar.i(i != 0 ? AbstractC0106b.m(qVar.getContext(), i) : null);
        AbstractC0105a.N(qVar.f843a, qVar.f845c, qVar.f846d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f5837c;
        CheckableImageButton checkableImageButton = qVar.f845c;
        View.OnLongClickListener onLongClickListener = qVar.f848f;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0105a.P(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f5837c;
        qVar.f848f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f845c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0105a.P(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f5837c;
        if (qVar.f846d != colorStateList) {
            qVar.f846d = colorStateList;
            AbstractC0105a.b(qVar.f843a, qVar.f845c, colorStateList, qVar.f847e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f5837c;
        if (qVar.f847e != mode) {
            qVar.f847e = mode;
            AbstractC0105a.b(qVar.f843a, qVar.f845c, qVar.f846d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u uVar = this.f5849j;
        uVar.f891u = i;
        W w3 = uVar.f888r;
        if (w3 != null) {
            uVar.h.l(w3, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f5849j;
        uVar.f892v = colorStateList;
        W w3 = uVar.f888r;
        if (w3 == null || colorStateList == null) {
            return;
        }
        w3.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.f5875w0 != z3) {
            this.f5875w0 = z3;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f5849j;
        if (isEmpty) {
            if (uVar.f894x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f894x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f893w = charSequence;
        uVar.f895y.setText(charSequence);
        int i = uVar.f885n;
        if (i != 2) {
            uVar.f886o = 2;
        }
        uVar.i(i, uVar.f886o, uVar.h(uVar.f895y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f5849j;
        uVar.f872A = colorStateList;
        W w3 = uVar.f895y;
        if (w3 == null || colorStateList == null) {
            return;
        }
        w3.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z3) {
        u uVar = this.f5849j;
        if (uVar.f894x == z3) {
            return;
        }
        uVar.c();
        if (z3) {
            W w3 = new W(uVar.f880g, null);
            uVar.f895y = w3;
            w3.setId(com.adif.elcanomovil.R.id.textinput_helper_text);
            uVar.f895y.setTextAlignment(5);
            Typeface typeface = uVar.f873B;
            if (typeface != null) {
                uVar.f895y.setTypeface(typeface);
            }
            uVar.f895y.setVisibility(4);
            W w4 = uVar.f895y;
            WeakHashMap weakHashMap = X.f1226a;
            w4.setAccessibilityLiveRegion(1);
            int i = uVar.f896z;
            uVar.f896z = i;
            W w5 = uVar.f895y;
            if (w5 != null) {
                w5.setTextAppearance(i);
            }
            ColorStateList colorStateList = uVar.f872A;
            uVar.f872A = colorStateList;
            W w6 = uVar.f895y;
            if (w6 != null && colorStateList != null) {
                w6.setTextColor(colorStateList);
            }
            uVar.a(uVar.f895y, 1);
            uVar.f895y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i4 = uVar.f885n;
            if (i4 == 2) {
                uVar.f886o = 0;
            }
            uVar.i(i4, uVar.f886o, uVar.h(uVar.f895y, ""));
            uVar.g(uVar.f895y, 1);
            uVar.f895y = null;
            TextInputLayout textInputLayout = uVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f894x = z3;
    }

    public void setHelperTextTextAppearance(int i) {
        u uVar = this.f5849j;
        uVar.f896z = i;
        W w3 = uVar.f895y;
        if (w3 != null) {
            w3.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f5813C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z3) {
        this.f5877x0 = z3;
    }

    public void setHintEnabled(boolean z3) {
        if (z3 != this.f5813C) {
            this.f5813C = z3;
            if (z3) {
                CharSequence hint = this.f5839d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f5814D)) {
                        setHint(hint);
                    }
                    this.f5839d.setHint((CharSequence) null);
                }
                this.f5815E = true;
            } else {
                this.f5815E = false;
                if (!TextUtils.isEmpty(this.f5814D) && TextUtils.isEmpty(this.f5839d.getHint())) {
                    this.f5839d.setHint(this.f5814D);
                }
                setHintInternal(null);
            }
            if (this.f5839d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.f5873v0;
        TextInputLayout textInputLayout = bVar.f8913a;
        B2.d dVar = new B2.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f226j;
        if (colorStateList != null) {
            bVar.f8927k = colorStateList;
        }
        float f2 = dVar.f227k;
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            bVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f219a;
        if (colorStateList2 != null) {
            bVar.f8908U = colorStateList2;
        }
        bVar.f8906S = dVar.f223e;
        bVar.f8907T = dVar.f224f;
        bVar.f8905R = dVar.f225g;
        bVar.f8909V = dVar.i;
        B2.a aVar = bVar.f8940y;
        if (aVar != null) {
            aVar.f212c = true;
        }
        h3.d dVar2 = new h3.d(bVar, 10);
        dVar.a();
        bVar.f8940y = new B2.a(dVar2, dVar.f230n);
        dVar.c(textInputLayout.getContext(), bVar.f8940y);
        bVar.h(false);
        this.f5850j0 = bVar.f8927k;
        if (this.f5839d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f5850j0 != colorStateList) {
            if (this.f5848i0 == null) {
                b bVar = this.f5873v0;
                if (bVar.f8927k != colorStateList) {
                    bVar.f8927k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f5850j0 = colorStateList;
            if (this.f5839d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(C c4) {
        this.f5857n = c4;
    }

    public void setMaxEms(int i) {
        this.f5845g = i;
        EditText editText = this.f5839d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.f5839d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f5843f = i;
        EditText editText = this.f5839d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.f5839d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        q qVar = this.f5837c;
        qVar.f849g.setContentDescription(i != 0 ? qVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        q qVar = this.f5837c;
        qVar.f849g.setImageDrawable(i != 0 ? AbstractC0106b.m(qVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        q qVar = this.f5837c;
        if (z3 && qVar.i != 1) {
            qVar.g(1);
        } else if (z3) {
            qVar.getClass();
        } else {
            qVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        q qVar = this.f5837c;
        qVar.f851k = colorStateList;
        AbstractC0105a.b(qVar.f843a, qVar.f849g, colorStateList, qVar.f852l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f5837c;
        qVar.f852l = mode;
        AbstractC0105a.b(qVar.f843a, qVar.f849g, qVar.f851k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f5868t == null) {
            W w3 = new W(getContext(), null);
            this.f5868t = w3;
            w3.setId(com.adif.elcanomovil.R.id.textinput_placeholder);
            W w4 = this.f5868t;
            WeakHashMap weakHashMap = X.f1226a;
            w4.setImportantForAccessibility(2);
            C0030h d4 = d();
            this.f5874w = d4;
            d4.f184b = 67L;
            this.f5876x = d();
            setPlaceholderTextAppearance(this.f5872v);
            setPlaceholderTextColor(this.f5870u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f5866s) {
                setPlaceholderTextEnabled(true);
            }
            this.f5864r = charSequence;
        }
        EditText editText = this.f5839d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f5872v = i;
        W w3 = this.f5868t;
        if (w3 != null) {
            w3.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f5870u != colorStateList) {
            this.f5870u = colorStateList;
            W w3 = this.f5868t;
            if (w3 == null || colorStateList == null) {
                return;
            }
            w3.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f5835b;
        zVar.getClass();
        zVar.f913c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f912b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f5835b.f912b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f5835b.f912b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f5816F;
        if (gVar == null || gVar.f400a.f386a == kVar) {
            return;
        }
        this.f5821L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z3) {
        this.f5835b.f914d.setCheckable(z3);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f5835b.f914d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0106b.m(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        z zVar = this.f5835b;
        if (i < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != zVar.f917g) {
            zVar.f917g = i;
            CheckableImageButton checkableImageButton = zVar.f914d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f5835b;
        View.OnLongClickListener onLongClickListener = zVar.i;
        CheckableImageButton checkableImageButton = zVar.f914d;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0105a.P(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f5835b;
        zVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.f914d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0105a.P(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f5835b;
        zVar.h = scaleType;
        zVar.f914d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f5835b;
        if (zVar.f915e != colorStateList) {
            zVar.f915e = colorStateList;
            AbstractC0105a.b(zVar.f911a, zVar.f914d, colorStateList, zVar.f916f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f5835b;
        if (zVar.f916f != mode) {
            zVar.f916f = mode;
            AbstractC0105a.b(zVar.f911a, zVar.f914d, zVar.f915e, mode);
        }
    }

    public void setStartIconVisible(boolean z3) {
        this.f5835b.c(z3);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f5837c;
        qVar.getClass();
        qVar.p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f856q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f5837c.f856q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f5837c.f856q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(B b4) {
        EditText editText = this.f5839d;
        if (editText != null) {
            X.j(editText, b4);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f5836b0) {
            this.f5836b0 = typeface;
            this.f5873v0.m(typeface);
            u uVar = this.f5849j;
            if (typeface != uVar.f873B) {
                uVar.f873B = typeface;
                W w3 = uVar.f888r;
                if (w3 != null) {
                    w3.setTypeface(typeface);
                }
                W w4 = uVar.f895y;
                if (w4 != null) {
                    w4.setTypeface(typeface);
                }
            }
            W w5 = this.f5859o;
            if (w5 != null) {
                w5.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f5824O != 1) {
            FrameLayout frameLayout = this.f5833a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c4 = c();
            if (c4 != layoutParams.topMargin) {
                layoutParams.topMargin = c4;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z3, boolean z4) {
        ColorStateList colorStateList;
        W w3;
        boolean isEnabled = isEnabled();
        EditText editText = this.f5839d;
        boolean z5 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f5839d;
        boolean z6 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f5848i0;
        b bVar = this.f5873v0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f5848i0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f5867s0) : this.f5867s0));
        } else if (m()) {
            W w4 = this.f5849j.f888r;
            bVar.i(w4 != null ? w4.getTextColors() : null);
        } else if (this.f5855m && (w3 = this.f5859o) != null) {
            bVar.i(w3.getTextColors());
        } else if (z6 && (colorStateList = this.f5850j0) != null && bVar.f8927k != colorStateList) {
            bVar.f8927k = colorStateList;
            bVar.h(false);
        }
        q qVar = this.f5837c;
        z zVar = this.f5835b;
        if (z5 || !this.f5875w0 || (isEnabled() && z6)) {
            if (z4 || this.f5871u0) {
                ValueAnimator valueAnimator = this.f5879y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f5879y0.cancel();
                }
                if (z3 && this.f5877x0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f5871u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f5839d;
                v(editText3 != null ? editText3.getText() : null);
                zVar.f918j = false;
                zVar.e();
                qVar.f857r = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z4 || !this.f5871u0) {
            ValueAnimator valueAnimator2 = this.f5879y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f5879y0.cancel();
            }
            if (z3 && this.f5877x0) {
                a(BitmapDescriptorFactory.HUE_RED);
            } else {
                bVar.k(BitmapDescriptorFactory.HUE_RED);
            }
            if (e() && !((I2.g) this.f5816F).f816v.f814q.isEmpty() && e()) {
                ((I2.g) this.f5816F).n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            this.f5871u0 = true;
            W w5 = this.f5868t;
            if (w5 != null && this.f5866s) {
                w5.setText((CharSequence) null);
                B0.B.a(this.f5833a, this.f5876x);
                this.f5868t.setVisibility(4);
            }
            zVar.f918j = true;
            zVar.e();
            qVar.f857r = true;
            qVar.n();
        }
    }

    public final void v(Editable editable) {
        ((w) this.f5857n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f5833a;
        if (length != 0 || this.f5871u0) {
            W w3 = this.f5868t;
            if (w3 == null || !this.f5866s) {
                return;
            }
            w3.setText((CharSequence) null);
            B0.B.a(frameLayout, this.f5876x);
            this.f5868t.setVisibility(4);
            return;
        }
        if (this.f5868t == null || !this.f5866s || TextUtils.isEmpty(this.f5864r)) {
            return;
        }
        this.f5868t.setText(this.f5864r);
        B0.B.a(frameLayout, this.f5874w);
        this.f5868t.setVisibility(0);
        this.f5868t.bringToFront();
        announceForAccessibility(this.f5864r);
    }

    public final void w(boolean z3, boolean z4) {
        int defaultColor = this.f5858n0.getDefaultColor();
        int colorForState = this.f5858n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f5858n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z3) {
            this.f5829T = colorForState2;
        } else if (z4) {
            this.f5829T = colorForState;
        } else {
            this.f5829T = defaultColor;
        }
    }

    public final void x() {
        W w3;
        EditText editText;
        EditText editText2;
        if (this.f5816F == null || this.f5824O == 0) {
            return;
        }
        boolean z3 = false;
        boolean z4 = isFocused() || ((editText2 = this.f5839d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f5839d) != null && editText.isHovered())) {
            z3 = true;
        }
        if (!isEnabled()) {
            this.f5829T = this.f5867s0;
        } else if (m()) {
            if (this.f5858n0 != null) {
                w(z4, z3);
            } else {
                this.f5829T = getErrorCurrentTextColors();
            }
        } else if (!this.f5855m || (w3 = this.f5859o) == null) {
            if (z4) {
                this.f5829T = this.f5856m0;
            } else if (z3) {
                this.f5829T = this.f5854l0;
            } else {
                this.f5829T = this.f5852k0;
            }
        } else if (this.f5858n0 != null) {
            w(z4, z3);
        } else {
            this.f5829T = w3.getCurrentTextColor();
        }
        p();
        q qVar = this.f5837c;
        qVar.l();
        CheckableImageButton checkableImageButton = qVar.f845c;
        ColorStateList colorStateList = qVar.f846d;
        TextInputLayout textInputLayout = qVar.f843a;
        AbstractC0105a.N(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = qVar.f851k;
        CheckableImageButton checkableImageButton2 = qVar.f849g;
        AbstractC0105a.N(textInputLayout, checkableImageButton2, colorStateList2);
        if (qVar.b() instanceof I2.l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                AbstractC0105a.b(textInputLayout, checkableImageButton2, qVar.f851k, qVar.f852l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                H.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        z zVar = this.f5835b;
        AbstractC0105a.N(zVar.f911a, zVar.f914d, zVar.f915e);
        if (this.f5824O == 2) {
            int i = this.f5826Q;
            if (z4 && isEnabled()) {
                this.f5826Q = this.f5828S;
            } else {
                this.f5826Q = this.f5827R;
            }
            if (this.f5826Q != i && e() && !this.f5871u0) {
                if (e()) {
                    ((I2.g) this.f5816F).n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                j();
            }
        }
        if (this.f5824O == 1) {
            if (!isEnabled()) {
                this.f5830U = this.f5861p0;
            } else if (z3 && !z4) {
                this.f5830U = this.f5865r0;
            } else if (z4) {
                this.f5830U = this.f5863q0;
            } else {
                this.f5830U = this.f5860o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f5835b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f5837c.f849g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f5837c.f849g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f5837c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f5837c.f849g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f5837c;
        CheckableImageButton checkableImageButton = qVar.f849g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f851k;
            PorterDuff.Mode mode = qVar.f852l;
            TextInputLayout textInputLayout = qVar.f843a;
            AbstractC0105a.b(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0105a.N(textInputLayout, checkableImageButton, qVar.f851k);
        }
    }
}
