package I2;

import O.X;
import a.AbstractC0105a;
import a.AbstractC0106b;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.adif.elcanomovil.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.W;

/* loaded from: classes3.dex */
public final class q extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f843a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f844b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f845c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f846d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f847e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f848f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f849g;
    public final p h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f850j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f851k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f852l;

    /* renamed from: m, reason: collision with root package name */
    public int f853m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f854n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f855o;
    public CharSequence p;

    /* renamed from: q, reason: collision with root package name */
    public final W f856q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f857r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f858s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f859t;

    /* renamed from: u, reason: collision with root package name */
    public k f860u;

    /* renamed from: v, reason: collision with root package name */
    public final m f861v;

    public q(TextInputLayout textInputLayout, R0.h hVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.f850j = new LinkedHashSet();
        this.f861v = new m(this);
        n nVar = new n(this);
        this.f859t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f843a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f844b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f845c = a2;
        CheckableImageButton a4 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f849g = a4;
        this.h = new p(this, hVar);
        W w3 = new W(getContext(), null);
        this.f856q = w3;
        TypedArray typedArray = (TypedArray) hVar.f1414b;
        if (typedArray.hasValue(38)) {
            this.f846d = AbstractC0105a.v(getContext(), hVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f847e = x2.m.j(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(hVar.f(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = X.f1226a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f851k = AbstractC0105a.v(getContext(), hVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f852l = x2.m.j(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a4.getContentDescription() != (text = typedArray.getText(27))) {
                a4.setContentDescription(text);
            }
            a4.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f851k = AbstractC0105a.v(getContext(), hVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f852l = x2.m.j(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a4.getContentDescription() != text2) {
                a4.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f853m) {
            this.f853m = dimensionPixelSize;
            a4.setMinimumWidth(dimensionPixelSize);
            a4.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType l4 = AbstractC0105a.l(typedArray.getInt(31, -1));
            this.f854n = l4;
            a4.setScaleType(l4);
            a2.setScaleType(l4);
        }
        w3.setVisibility(8);
        w3.setId(R.id.textinput_suffix_text);
        w3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        w3.setAccessibilityLiveRegion(1);
        w3.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            w3.setTextColor(hVar.e(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.p = TextUtils.isEmpty(text3) ? null : text3;
        w3.setText(text3);
        n();
        frameLayout.addView(a4);
        addView(w3);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f5842e0.add(nVar);
        if (textInputLayout.f5839d != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new o(this, i));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC0105a.H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r eVar;
        int i = this.i;
        p pVar = this.h;
        SparseArray sparseArray = pVar.f839a;
        r rVar = (r) sparseArray.get(i);
        if (rVar != null) {
            return rVar;
        }
        q qVar = pVar.f840b;
        if (i == -1) {
            eVar = new e(qVar, 0);
        } else if (i == 0) {
            eVar = new e(qVar, 1);
        } else if (i == 1) {
            eVar = new y(qVar, pVar.f842d);
        } else if (i == 2) {
            eVar = new C0053d(qVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "Invalid end icon mode: "));
            }
            eVar = new l(qVar);
        }
        sparseArray.append(i, eVar);
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f849g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = X.f1226a;
        return this.f856q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f844b.getVisibility() == 0 && this.f849g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f845c.getVisibility() == 0;
    }

    public final void f(boolean z3) {
        boolean z4;
        boolean isActivated;
        boolean z5;
        r b4 = b();
        boolean k4 = b4.k();
        CheckableImageButton checkableImageButton = this.f849g;
        boolean z6 = true;
        if (!k4 || (z5 = checkableImageButton.f5718d) == b4.l()) {
            z4 = false;
        } else {
            checkableImageButton.setChecked(!z5);
            z4 = true;
        }
        if (!(b4 instanceof l) || (isActivated = checkableImageButton.isActivated()) == b4.j()) {
            z6 = z4;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z3 || z6) {
            AbstractC0105a.N(this.f843a, checkableImageButton, this.f851k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        r b4 = b();
        k kVar = this.f860u;
        AccessibilityManager accessibilityManager = this.f859t;
        if (kVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new P.b(kVar));
        }
        this.f860u = null;
        b4.s();
        this.i = i;
        Iterator it = this.f850j.iterator();
        if (it.hasNext()) {
            throw C.w.g(it);
        }
        h(i != 0);
        r b5 = b();
        int i4 = this.h.f841c;
        if (i4 == 0) {
            i4 = b5.d();
        }
        Drawable m4 = i4 != 0 ? AbstractC0106b.m(getContext(), i4) : null;
        CheckableImageButton checkableImageButton = this.f849g;
        checkableImageButton.setImageDrawable(m4);
        TextInputLayout textInputLayout = this.f843a;
        if (m4 != null) {
            AbstractC0105a.b(textInputLayout, checkableImageButton, this.f851k, this.f852l);
            AbstractC0105a.N(textInputLayout, checkableImageButton, this.f851k);
        }
        int c4 = b5.c();
        CharSequence text = c4 != 0 ? getResources().getText(c4) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b5.k());
        if (!b5.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b5.r();
        k h = b5.h();
        this.f860u = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = X.f1226a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new P.b(this.f860u));
            }
        }
        View.OnClickListener f2 = b5.f();
        View.OnLongClickListener onLongClickListener = this.f855o;
        checkableImageButton.setOnClickListener(f2);
        AbstractC0105a.P(checkableImageButton, onLongClickListener);
        EditText editText = this.f858s;
        if (editText != null) {
            b5.m(editText);
            j(b5);
        }
        AbstractC0105a.b(textInputLayout, checkableImageButton, this.f851k, this.f852l);
        f(true);
    }

    public final void h(boolean z3) {
        if (d() != z3) {
            this.f849g.setVisibility(z3 ? 0 : 8);
            k();
            m();
            this.f843a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f845c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        AbstractC0105a.b(this.f843a, checkableImageButton, this.f846d, this.f847e);
    }

    public final void j(r rVar) {
        if (this.f858s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f858s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f849g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final void k() {
        this.f844b.setVisibility((this.f849g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.p == null || this.f857r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f845c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f843a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f5849j.f887q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f843a;
        if (textInputLayout.f5839d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.f5839d;
            WeakHashMap weakHashMap = X.f1226a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f5839d.getPaddingTop();
        int paddingBottom = textInputLayout.f5839d.getPaddingBottom();
        WeakHashMap weakHashMap2 = X.f1226a;
        this.f856q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        W w3 = this.f856q;
        int visibility = w3.getVisibility();
        int i = (this.p == null || this.f857r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        w3.setVisibility(i);
        this.f843a.q();
    }
}
