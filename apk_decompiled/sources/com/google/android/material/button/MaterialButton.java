package com.google.android.material.button;

import C.w;
import D.h;
import E2.j;
import E2.k;
import E2.u;
import K2.a;
import O.X;
import a.AbstractC0105a;
import a.AbstractC0106b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.AbstractC0379a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m3.d;
import p2.InterfaceC0552a;
import p2.b;
import p2.c;
import x2.m;

/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, u {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f5589r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f5590s = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final c f5591d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f5592e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0552a f5593f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f5594g;
    public ColorStateList h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public String f5595j;

    /* renamed from: k, reason: collision with root package name */
    public int f5596k;

    /* renamed from: l, reason: collision with root package name */
    public int f5597l;

    /* renamed from: m, reason: collision with root package name */
    public int f5598m;

    /* renamed from: n, reason: collision with root package name */
    public int f5599n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5600o;
    public boolean p;

    /* renamed from: q, reason: collision with root package name */
    public int f5601q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.adif.elcanomovil.R.attr.materialButtonStyle, 2132018286), attributeSet, com.adif.elcanomovil.R.attr.materialButtonStyle);
        this.f5592e = new LinkedHashSet();
        this.f5600o = false;
        this.p = false;
        Context context2 = getContext();
        TypedArray h = m.h(context2, attributeSet, AbstractC0379a.f6764l, com.adif.elcanomovil.R.attr.materialButtonStyle, 2132018286, new int[0]);
        this.f5599n = h.getDimensionPixelSize(12, 0);
        int i = h.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f5594g = m.j(i, mode);
        this.h = AbstractC0105a.w(getContext(), h, 14);
        this.i = AbstractC0105a.z(getContext(), h, 10);
        this.f5601q = h.getInteger(11, 1);
        this.f5596k = h.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet, com.adif.elcanomovil.R.attr.materialButtonStyle, 2132018286).a());
        this.f5591d = cVar;
        cVar.f8124c = h.getDimensionPixelOffset(1, 0);
        cVar.f8125d = h.getDimensionPixelOffset(2, 0);
        cVar.f8126e = h.getDimensionPixelOffset(3, 0);
        cVar.f8127f = h.getDimensionPixelOffset(4, 0);
        if (h.hasValue(8)) {
            int dimensionPixelSize = h.getDimensionPixelSize(8, -1);
            cVar.f8128g = dimensionPixelSize;
            float f2 = dimensionPixelSize;
            j e4 = cVar.f8123b.e();
            e4.f422e = new E2.a(f2);
            e4.f423f = new E2.a(f2);
            e4.f424g = new E2.a(f2);
            e4.h = new E2.a(f2);
            cVar.c(e4.a());
            cVar.p = true;
        }
        cVar.h = h.getDimensionPixelSize(20, 0);
        cVar.i = m.j(h.getInt(7, -1), mode);
        cVar.f8129j = AbstractC0105a.w(getContext(), h, 6);
        cVar.f8130k = AbstractC0105a.w(getContext(), h, 19);
        cVar.f8131l = AbstractC0105a.w(getContext(), h, 16);
        cVar.f8135q = h.getBoolean(5, false);
        cVar.f8138t = h.getDimensionPixelSize(9, 0);
        cVar.f8136r = h.getBoolean(21, true);
        WeakHashMap weakHashMap = X.f1226a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (h.hasValue(0)) {
            cVar.f8134o = true;
            setSupportBackgroundTintList(cVar.f8129j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f8124c, paddingTop + cVar.f8126e, paddingEnd + cVar.f8125d, paddingBottom + cVar.f8127f);
        h.recycle();
        setCompoundDrawablePadding(this.f5599n);
        c(this.i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < lineCount; i++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f2);
    }

    public final boolean a() {
        c cVar = this.f5591d;
        return (cVar == null || cVar.f8134o) ? false : true;
    }

    public final void b() {
        int i = this.f5601q;
        boolean z3 = true;
        if (i != 1 && i != 2) {
            z3 = false;
        }
        if (z3) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    public final void c(boolean z3) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.i = mutate;
            H.a.h(mutate, this.h);
            PorterDuff.Mode mode = this.f5594g;
            if (mode != null) {
                H.a.i(this.i, mode);
            }
            int i = this.f5596k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i4 = this.f5596k;
            if (i4 == 0) {
                i4 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i5 = this.f5597l;
            int i6 = this.f5598m;
            drawable2.setBounds(i5, i6, i + i5, i4 + i6);
            this.i.setVisible(true, z3);
        }
        if (z3) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i7 = this.f5601q;
        if (((i7 == 1 || i7 == 2) && drawable3 != this.i) || (((i7 == 3 || i7 == 4) && drawable5 != this.i) || ((i7 == 16 || i7 == 32) && drawable4 != this.i))) {
            b();
        }
    }

    public final void d(int i, int i4) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i5 = this.f5601q;
        if (!(i5 == 1 || i5 == 2) && i5 != 3 && i5 != 4) {
            if (i5 == 16 || i5 == 32) {
                this.f5597l = 0;
                if (i5 == 16) {
                    this.f5598m = 0;
                    c(false);
                    return;
                }
                int i6 = this.f5596k;
                if (i6 == 0) {
                    i6 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i4 - getTextHeight()) - getPaddingTop()) - i6) - this.f5599n) - getPaddingBottom()) / 2);
                if (this.f5598m != max) {
                    this.f5598m = max;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f5598m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i7 = this.f5601q;
        if (i7 == 1 || i7 == 3 || ((i7 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i7 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f5597l = 0;
            c(false);
            return;
        }
        int i8 = this.f5596k;
        if (i8 == 0) {
            i8 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = X.f1226a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i8) - this.f5599n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f5601q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f5597l != paddingEnd) {
            this.f5597l = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f5595j)) {
            return this.f5595j;
        }
        c cVar = this.f5591d;
        return ((cVar == null || !cVar.f8135q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f5591d.f8128g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f5601q;
    }

    public int getIconPadding() {
        return this.f5599n;
    }

    public int getIconSize() {
        return this.f5596k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f5594g;
    }

    public int getInsetBottom() {
        return this.f5591d.f8127f;
    }

    public int getInsetTop() {
        return this.f5591d.f8126e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f5591d.f8131l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (a()) {
            return this.f5591d.f8123b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f5591d.f8130k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f5591d.h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f5591d.f8129j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f5591d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f5600o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            d.H(this, this.f5591d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        c cVar = this.f5591d;
        if (cVar != null && cVar.f8135q) {
            View.mergeDrawableStates(onCreateDrawableState, f5589r);
        }
        if (this.f5600o) {
            View.mergeDrawableStates(onCreateDrawableState, f5590s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f5600o);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f5591d;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f8135q);
        accessibilityNodeInfo.setChecked(this.f5600o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f1880a);
        setChecked(bVar.f8121c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, p2.b, W.b] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new W.b(super.onSaveInstanceState());
        bVar.f8121c = this.f5600o;
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        super.onTextChanged(charSequence, i, i4, i5);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f5591d.f8136r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f5595j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        c cVar = this.f5591d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f5591d;
        cVar.f8134o = true;
        ColorStateList colorStateList = cVar.f8129j;
        MaterialButton materialButton = cVar.f8122a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0106b.m(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z3) {
        if (a()) {
            this.f5591d.f8135q = z3;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        c cVar = this.f5591d;
        if (cVar == null || !cVar.f8135q || !isEnabled() || this.f5600o == z3) {
            return;
        }
        this.f5600o = z3;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z4 = this.f5600o;
            if (!materialButtonToggleGroup.f5608f) {
                materialButtonToggleGroup.b(getId(), z4);
            }
        }
        if (this.p) {
            return;
        }
        this.p = true;
        Iterator it = this.f5592e.iterator();
        if (it.hasNext()) {
            throw w.g(it);
        }
        this.p = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            c cVar = this.f5591d;
            if (cVar.p && cVar.f8128g == i) {
                return;
            }
            cVar.f8128g = i;
            cVar.p = true;
            float f2 = i;
            j e4 = cVar.f8123b.e();
            e4.f422e = new E2.a(f2);
            e4.f423f = new E2.a(f2);
            e4.f424g = new E2.a(f2);
            e4.h = new E2.a(f2);
            cVar.c(e4.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (a()) {
            this.f5591d.b(false).i(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f5601q != i) {
            this.f5601q = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f5599n != i) {
            this.f5599n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0106b.m(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f5596k != i) {
            this.f5596k = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f5594g != mode) {
            this.f5594g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(h.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.f5591d;
        cVar.d(cVar.f8126e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.f5591d;
        cVar.d(i, cVar.f8127f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0552a interfaceC0552a) {
        this.f5593f = interfaceC0552a;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        InterfaceC0552a interfaceC0552a = this.f5593f;
        if (interfaceC0552a != null) {
            ((MaterialButtonToggleGroup) ((h3.d) interfaceC0552a).f6791b).invalidate();
        }
        super.setPressed(z3);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f5591d;
            if (cVar.f8131l != colorStateList) {
                cVar.f8131l = colorStateList;
                MaterialButton materialButton = cVar.f8122a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(C2.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(h.getColorStateList(getContext(), i));
        }
    }

    @Override // E2.u
    public void setShapeAppearanceModel(k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f5591d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (a()) {
            c cVar = this.f5591d;
            cVar.f8133n = z3;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f5591d;
            if (cVar.f8130k != colorStateList) {
                cVar.f8130k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(h.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            c cVar = this.f5591d;
            if (cVar.h != i) {
                cVar.h = i;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f5591d;
        if (cVar.f8129j != colorStateList) {
            cVar.f8129j = colorStateList;
            if (cVar.b(false) != null) {
                H.a.h(cVar.b(false), cVar.f8129j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f5591d;
        if (cVar.i != mode) {
            cVar.i = mode;
            if (cVar.b(false) == null || cVar.i == null) {
                return;
            }
            H.a.i(cVar.b(false), cVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.f5591d.f8136r = z3;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f5600o);
    }
}
