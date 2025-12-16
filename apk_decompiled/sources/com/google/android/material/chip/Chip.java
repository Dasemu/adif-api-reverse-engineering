package com.google.android.material.chip;

import B2.d;
import D.h;
import E2.k;
import E2.u;
import H.b;
import H.g;
import K2.a;
import O.L;
import O.X;
import a.AbstractC0105a;
import a.AbstractC0106b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.AbstractC0379a;
import i2.C0397b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import m.C0482q;
import s2.C0608a;
import s2.C0609b;
import s2.C0610c;
import s2.C0612e;
import s2.InterfaceC0611d;
import x2.e;
import x2.j;
import x2.m;

/* loaded from: classes3.dex */
public class Chip extends C0482q implements InterfaceC0611d, u, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f5613w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f5614x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f5615y = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public C0612e f5616e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f5617f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f5618g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5619j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5620k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5621l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5622m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5623n;

    /* renamed from: o, reason: collision with root package name */
    public int f5624o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f5625q;

    /* renamed from: r, reason: collision with root package name */
    public final C0610c f5626r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5627s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f5628t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f5629u;

    /* renamed from: v, reason: collision with root package name */
    public final C0608a f5630v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.adif.elcanomovil.R.attr.chipStyle, 2132018300), attributeSet, com.adif.elcanomovil.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f5628t = new Rect();
        this.f5629u = new RectF();
        this.f5630v = new C0608a(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C0612e c0612e = new C0612e(context2, attributeSet);
        int[] iArr = AbstractC0379a.f6759e;
        TypedArray h = m.h(c0612e.f8443c0, attributeSet, iArr, com.adif.elcanomovil.R.attr.chipStyle, 2132018300, new int[0]);
        c0612e.f8419C0 = h.hasValue(37);
        Context context3 = c0612e.f8443c0;
        ColorStateList w3 = AbstractC0105a.w(context3, h, 24);
        if (c0612e.f8462v != w3) {
            c0612e.f8462v = w3;
            c0612e.onStateChange(c0612e.getState());
        }
        ColorStateList w4 = AbstractC0105a.w(context3, h, 11);
        if (c0612e.f8464w != w4) {
            c0612e.f8464w = w4;
            c0612e.onStateChange(c0612e.getState());
        }
        float dimension = h.getDimension(19, BitmapDescriptorFactory.HUE_RED);
        if (c0612e.f8466x != dimension) {
            c0612e.f8466x = dimension;
            c0612e.invalidateSelf();
            c0612e.u();
        }
        if (h.hasValue(12)) {
            c0612e.A(h.getDimension(12, BitmapDescriptorFactory.HUE_RED));
        }
        c0612e.F(AbstractC0105a.w(context3, h, 22));
        c0612e.G(h.getDimension(23, BitmapDescriptorFactory.HUE_RED));
        c0612e.P(AbstractC0105a.w(context3, h, 36));
        String text = h.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(c0612e.f8418C, text);
        j jVar = c0612e.f8449i0;
        if (!equals) {
            c0612e.f8418C = text;
            jVar.f8962e = true;
            c0612e.invalidateSelf();
            c0612e.u();
        }
        d dVar = (!h.hasValue(0) || (resourceId3 = h.getResourceId(0, 0)) == 0) ? null : new d(context3, resourceId3);
        dVar.f227k = h.getDimension(1, dVar.f227k);
        jVar.b(dVar, context3);
        int i = h.getInt(3, 0);
        if (i == 1) {
            c0612e.f8471z0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c0612e.f8471z0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c0612e.f8471z0 = TextUtils.TruncateAt.END;
        }
        c0612e.E(h.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0612e.E(h.getBoolean(15, false));
        }
        c0612e.B(AbstractC0105a.z(context3, h, 14));
        if (h.hasValue(17)) {
            c0612e.D(AbstractC0105a.w(context3, h, 17));
        }
        c0612e.C(h.getDimension(16, -1.0f));
        c0612e.M(h.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0612e.M(h.getBoolean(26, false));
        }
        c0612e.H(AbstractC0105a.z(context3, h, 25));
        c0612e.L(AbstractC0105a.w(context3, h, 30));
        c0612e.J(h.getDimension(28, BitmapDescriptorFactory.HUE_RED));
        c0612e.w(h.getBoolean(6, false));
        c0612e.z(h.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0612e.z(h.getBoolean(8, false));
        }
        c0612e.x(AbstractC0105a.z(context3, h, 7));
        if (h.hasValue(9)) {
            c0612e.y(AbstractC0105a.w(context3, h, 9));
        }
        c0612e.f8434S = (!h.hasValue(39) || (resourceId2 = h.getResourceId(39, 0)) == 0) ? null : C0397b.a(context3, resourceId2);
        c0612e.f8435T = (!h.hasValue(33) || (resourceId = h.getResourceId(33, 0)) == 0) ? null : C0397b.a(context3, resourceId);
        float dimension2 = h.getDimension(21, BitmapDescriptorFactory.HUE_RED);
        if (c0612e.f8436U != dimension2) {
            c0612e.f8436U = dimension2;
            c0612e.invalidateSelf();
            c0612e.u();
        }
        c0612e.O(h.getDimension(35, BitmapDescriptorFactory.HUE_RED));
        c0612e.N(h.getDimension(34, BitmapDescriptorFactory.HUE_RED));
        float dimension3 = h.getDimension(41, BitmapDescriptorFactory.HUE_RED);
        if (c0612e.f8439X != dimension3) {
            c0612e.f8439X = dimension3;
            c0612e.invalidateSelf();
            c0612e.u();
        }
        float dimension4 = h.getDimension(40, BitmapDescriptorFactory.HUE_RED);
        if (c0612e.f8440Y != dimension4) {
            c0612e.f8440Y = dimension4;
            c0612e.invalidateSelf();
            c0612e.u();
        }
        c0612e.K(h.getDimension(29, BitmapDescriptorFactory.HUE_RED));
        c0612e.I(h.getDimension(27, BitmapDescriptorFactory.HUE_RED));
        float dimension5 = h.getDimension(13, BitmapDescriptorFactory.HUE_RED);
        if (c0612e.f8442b0 != dimension5) {
            c0612e.f8442b0 = dimension5;
            c0612e.invalidateSelf();
            c0612e.u();
        }
        c0612e.f8417B0 = h.getDimensionPixelSize(4, Integer.MAX_VALUE);
        h.recycle();
        m.a(context2, attributeSet, com.adif.elcanomovil.R.attr.chipStyle, 2132018300);
        m.b(context2, attributeSet, iArr, com.adif.elcanomovil.R.attr.chipStyle, 2132018300, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.adif.elcanomovil.R.attr.chipStyle, 2132018300);
        this.f5623n = obtainStyledAttributes.getBoolean(32, false);
        this.p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(m.e(getContext(), 48))));
        obtainStyledAttributes.recycle();
        setChipDrawable(c0612e);
        WeakHashMap weakHashMap = X.f1226a;
        c0612e.i(L.i(this));
        m.a(context2, attributeSet, com.adif.elcanomovil.R.attr.chipStyle, 2132018300);
        m.b(context2, attributeSet, iArr, com.adif.elcanomovil.R.attr.chipStyle, 2132018300, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.adif.elcanomovil.R.attr.chipStyle, 2132018300);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f5626r = new C0610c(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new C0609b(this));
        }
        setChecked(this.f5619j);
        setText(c0612e.f8418C);
        setEllipsize(c0612e.f8471z0);
        g();
        if (!this.f5616e.A0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f5623n) {
            setMinHeight(this.p);
        }
        this.f5624o = getLayoutDirection();
        super.setOnCheckedChangeListener(new O1.a(this, 2));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f5629u;
        rectF.setEmpty();
        if (c() && this.h != null) {
            C0612e c0612e = this.f5616e;
            Rect bounds = c0612e.getBounds();
            rectF.setEmpty();
            if (c0612e.S()) {
                float f2 = c0612e.f8442b0 + c0612e.f8441a0 + c0612e.f8428M + c0612e.Z + c0612e.f8440Y;
                if (b.a(c0612e) == 0) {
                    float f4 = bounds.right;
                    rectF.right = f4;
                    rectF.left = f4 - f2;
                } else {
                    float f5 = bounds.left;
                    rectF.left = f5;
                    rectF.right = f5 + f2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i4 = (int) closeIconTouchBounds.top;
        int i5 = (int) closeIconTouchBounds.right;
        int i6 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f5628t;
        rect.set(i, i4, i5, i6);
        return rect;
    }

    private d getTextAppearance() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8449i0.f8964g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f5621l != z3) {
            this.f5621l = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f5620k != z3) {
            this.f5620k = z3;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.p = i;
        if (!this.f5623n) {
            InsetDrawable insetDrawable = this.f5617f;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f5617f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f5616e.f8466x));
        int max2 = Math.max(0, i - this.f5616e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f5617f;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f5617f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i4 = max2 > 0 ? max2 / 2 : 0;
        int i5 = max > 0 ? max / 2 : 0;
        if (this.f5617f != null) {
            Rect rect = new Rect();
            this.f5617f.getPadding(rect);
            if (rect.top == i5 && rect.bottom == i5 && rect.left == i4 && rect.right == i4) {
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f5617f = new InsetDrawable((Drawable) this.f5616e, i4, i5, i4, i5);
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r1 = this;
            s2.e r1 = r1.f5616e
            if (r1 == 0) goto L13
            android.graphics.drawable.Drawable r1 = r1.J
            if (r1 == 0) goto Le
            boolean r0 = r1 instanceof H.g
            if (r0 == 0) goto Lf
            H.g r1 = (H.g) r1
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.c():boolean");
    }

    public final void d() {
        C0612e c0612e;
        if (!c() || (c0612e = this.f5616e) == null || !c0612e.f8425I || this.h == null) {
            X.j(this, null);
            this.f5627s = false;
        } else {
            X.j(this, this.f5626r);
            this.f5627s = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f5627s
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchHoverEvent(r10)
            return r9
        L9:
            s2.c r0 = r9.f5626r
            android.view.accessibility.AccessibilityManager r1 = r0.h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L6c
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6c
        L1c:
            int r1 = r10.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 7
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r5) goto L3d
            r5 = 9
            if (r1 == r5) goto L3d
            r5 = 10
            if (r1 == r5) goto L30
            goto L6c
        L30:
            int r1 = r0.f1985m
            if (r1 == r6) goto L6c
            if (r1 != r6) goto L37
            goto L72
        L37:
            r0.f1985m = r6
            r0.q(r1, r2)
            return r3
        L3d:
            float r1 = r10.getX()
            float r5 = r10.getY()
            com.google.android.material.chip.Chip r7 = r0.f8413q
            boolean r8 = r7.c()
            if (r8 == 0) goto L59
            android.graphics.RectF r7 = r7.getCloseIconTouchBounds()
            boolean r1 = r7.contains(r1, r5)
            if (r1 == 0) goto L59
            r1 = r3
            goto L5a
        L59:
            r1 = r4
        L5a:
            int r5 = r0.f1985m
            if (r5 != r1) goto L5f
            goto L69
        L5f:
            r0.f1985m = r1
            r7 = 128(0x80, float:1.8E-43)
            r0.q(r1, r7)
            r0.q(r5, r2)
        L69:
            if (r1 == r6) goto L6c
            goto L72
        L6c:
            boolean r9 = super.dispatchHoverEvent(r10)
            if (r9 == 0) goto L73
        L72:
            return r3
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f5627s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C0610c c0610c = this.f5626r;
        c0610c.getClass();
        boolean z3 = false;
        int i = 0;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i4 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i4 = 33;
                                } else if (keyCode == 21) {
                                    i4 = 17;
                                } else if (keyCode != 22) {
                                    i4 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z4 = false;
                                while (i < repeatCount && c0610c.m(i4, null)) {
                                    i++;
                                    z4 = true;
                                }
                                z3 = z4;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i5 = c0610c.f1984l;
                    if (i5 != Integer.MIN_VALUE) {
                        Chip chip = c0610c.f8413q;
                        if (i5 == 0) {
                            chip.performClick();
                        } else if (i5 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f5627s) {
                                chip.f5626r.q(1, 1);
                            }
                        }
                    }
                    z3 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z3 = c0610c.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z3 = c0610c.m(1, null);
            }
        }
        if (!z3 || c0610c.f1984l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // m.C0482q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C0612e c0612e = this.f5616e;
        boolean z3 = false;
        if (c0612e != null && C0612e.t(c0612e.J)) {
            C0612e c0612e2 = this.f5616e;
            ?? isEnabled = isEnabled();
            int i4 = isEnabled;
            if (this.f5622m) {
                i4 = isEnabled + 1;
            }
            int i5 = i4;
            if (this.f5621l) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (this.f5620k) {
                i6 = i5 + 1;
            }
            int i7 = i6;
            if (isChecked()) {
                i7 = i6 + 1;
            }
            int[] iArr = new int[i7];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f5622m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f5621l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f5620k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c0612e2.f8465w0, iArr)) {
                c0612e2.f8465w0 = iArr;
                if (c0612e2.S()) {
                    z3 = c0612e2.v(c0612e2.getState(), iArr);
                }
            }
        }
        if (z3) {
            invalidate();
        }
    }

    public final void e() {
        this.f5618g = new RippleDrawable(C2.a.c(this.f5616e.f8416B), getBackgroundDrawable(), null);
        this.f5616e.getClass();
        RippleDrawable rippleDrawable = this.f5618g;
        WeakHashMap weakHashMap = X.f1226a;
        setBackground(rippleDrawable);
        f();
    }

    public final void f() {
        C0612e c0612e;
        if (TextUtils.isEmpty(getText()) || (c0612e = this.f5616e) == null) {
            return;
        }
        int q4 = (int) (c0612e.q() + c0612e.f8442b0 + c0612e.f8440Y);
        C0612e c0612e2 = this.f5616e;
        int p = (int) (c0612e2.p() + c0612e2.f8436U + c0612e2.f8439X);
        if (this.f5617f != null) {
            Rect rect = new Rect();
            this.f5617f.getPadding(rect);
            p += rect.left;
            q4 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = X.f1226a;
        setPaddingRelative(p, paddingTop, q4, paddingBottom);
    }

    public final void g() {
        TextPaint paint = getPaint();
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            paint.drawableState = c0612e.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f5630v);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f5625q)) {
            return this.f5625q;
        }
        C0612e c0612e = this.f5616e;
        if (!(c0612e != null && c0612e.f8430O)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f5617f;
        return insetDrawable == null ? this.f5616e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8432Q;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8433R;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8464w;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? Math.max(BitmapDescriptorFactory.HUE_RED, c0612e.r()) : BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getChipDrawable() {
        return this.f5616e;
    }

    public float getChipEndPadding() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.f8442b0 : BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0612e c0612e = this.f5616e;
        if (c0612e == null || (drawable = c0612e.f8421E) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.f8423G : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getChipIconTint() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8422F;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.f8466x : BitmapDescriptorFactory.HUE_RED;
    }

    public float getChipStartPadding() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.f8436U : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getChipStrokeColor() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8470z;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.f8415A : BitmapDescriptorFactory.HUE_RED;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C0612e c0612e = this.f5616e;
        if (c0612e == null || (drawable = c0612e.J) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8429N;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.f8441a0 : BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconSize() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.f8428M : BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconStartPadding() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.Z : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getCloseIconTint() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8427L;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8471z0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f5627s) {
            C0610c c0610c = this.f5626r;
            if (c0610c.f1984l == 1 || c0610c.f1983k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0397b getHideMotionSpec() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8435T;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.f8438W : BitmapDescriptorFactory.HUE_RED;
    }

    public float getIconStartPadding() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.f8437V : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getRippleColor() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8416B;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f5616e.f400a.f386a;
    }

    public C0397b getShowMotionSpec() {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            return c0612e.f8434S;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.f8440Y : BitmapDescriptorFactory.HUE_RED;
    }

    public float getTextStartPadding() {
        C0612e c0612e = this.f5616e;
        return c0612e != null ? c0612e.f8439X : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3.d.H(this, this.f5616e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f5614x);
        }
        C0612e c0612e = this.f5616e;
        if (c0612e != null && c0612e.f8430O) {
            View.mergeDrawableStates(onCreateDrawableState, f5615y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i, Rect rect) {
        super.onFocusChanged(z3, i, rect);
        if (this.f5627s) {
            C0610c c0610c = this.f5626r;
            int i4 = c0610c.f1984l;
            if (i4 != Integer.MIN_VALUE) {
                c0610c.j(i4);
            }
            if (z3) {
                c0610c.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C0612e c0612e = this.f5616e;
        accessibilityNodeInfo.setCheckable(c0612e != null && c0612e.f8430O);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f5624o != i) {
            this.f5624o = i;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f5620k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f5620k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f5627s
            if (r0 == 0) goto L43
            s2.c r0 = r5.f5626r
            r0.q(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L5b
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L5a
            goto L5b
        L5a:
            return r2
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f5625q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5618g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // m.C0482q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5618g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // m.C0482q, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z3) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.w(z3);
        }
    }

    public void setCheckableResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.w(c0612e.f8443c0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        C0612e c0612e = this.f5616e;
        if (c0612e == null) {
            this.f5619j = z3;
        } else if (c0612e.f8430O) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.x(AbstractC0106b.m(c0612e.f8443c0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.y(h.getColorStateList(c0612e.f8443c0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.z(c0612e.f8443c0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0612e c0612e = this.f5616e;
        if (c0612e == null || c0612e.f8464w == colorStateList) {
            return;
        }
        c0612e.f8464w = colorStateList;
        c0612e.onStateChange(c0612e.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateList;
        C0612e c0612e = this.f5616e;
        if (c0612e == null || c0612e.f8464w == (colorStateList = h.getColorStateList(c0612e.f8443c0, i))) {
            return;
        }
        c0612e.f8464w = colorStateList;
        c0612e.onStateChange(c0612e.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.A(c0612e.f8443c0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0612e c0612e) {
        C0612e c0612e2 = this.f5616e;
        if (c0612e2 != c0612e) {
            if (c0612e2 != null) {
                c0612e2.f8469y0 = new WeakReference(null);
            }
            this.f5616e = c0612e;
            c0612e.A0 = false;
            c0612e.f8469y0 = new WeakReference(this);
            b(this.p);
        }
    }

    public void setChipEndPadding(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e == null || c0612e.f8442b0 == f2) {
            return;
        }
        c0612e.f8442b0 = f2;
        c0612e.invalidateSelf();
        c0612e.u();
    }

    public void setChipEndPaddingResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            float dimension = c0612e.f8443c0.getResources().getDimension(i);
            if (c0612e.f8442b0 != dimension) {
                c0612e.f8442b0 = dimension;
                c0612e.invalidateSelf();
                c0612e.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.B(AbstractC0106b.m(c0612e.f8443c0, i));
        }
    }

    public void setChipIconSize(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.C(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.C(c0612e.f8443c0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.D(h.getColorStateList(c0612e.f8443c0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.E(c0612e.f8443c0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e == null || c0612e.f8466x == f2) {
            return;
        }
        c0612e.f8466x = f2;
        c0612e.invalidateSelf();
        c0612e.u();
    }

    public void setChipMinHeightResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            float dimension = c0612e.f8443c0.getResources().getDimension(i);
            if (c0612e.f8466x != dimension) {
                c0612e.f8466x = dimension;
                c0612e.invalidateSelf();
                c0612e.u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e == null || c0612e.f8436U == f2) {
            return;
        }
        c0612e.f8436U = f2;
        c0612e.invalidateSelf();
        c0612e.u();
    }

    public void setChipStartPaddingResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            float dimension = c0612e.f8443c0.getResources().getDimension(i);
            if (c0612e.f8436U != dimension) {
                c0612e.f8436U = dimension;
                c0612e.invalidateSelf();
                c0612e.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.F(h.getColorStateList(c0612e.f8443c0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.G(c0612e.f8443c0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.H(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0612e c0612e = this.f5616e;
        if (c0612e == null || c0612e.f8429N == charSequence) {
            return;
        }
        String str = M.b.f1065b;
        M.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? M.b.f1068e : M.b.f1067d;
        bVar.getClass();
        M.g gVar = M.h.f1077a;
        c0612e.f8429N = bVar.c(charSequence);
        c0612e.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.I(c0612e.f8443c0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.H(AbstractC0106b.m(c0612e.f8443c0, i));
        }
        d();
    }

    public void setCloseIconSize(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.J(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.J(c0612e.f8443c0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.K(c0612e.f8443c0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.L(h.getColorStateList(c0612e.f8443c0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // m.C0482q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // m.C0482q, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i4, int i5, int i6) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i4, i5, i6);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i4, int i5, int i6) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i4, i5, i6);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.i(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f5616e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.f8471z0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f5623n = z3;
        b(this.p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0397b c0397b) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.f8435T = c0397b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.f8435T = C0397b.a(c0612e.f8443c0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.N(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.N(c0612e.f8443c0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.O(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.O(c0612e.f8443c0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(e eVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f5616e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.f8417B0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.P(colorStateList);
        }
        this.f5616e.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.P(h.getColorStateList(c0612e.f8443c0, i));
            this.f5616e.getClass();
            e();
        }
    }

    @Override // E2.u
    public void setShapeAppearanceModel(k kVar) {
        this.f5616e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C0397b c0397b) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.f8434S = c0397b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.f8434S = C0397b.a(c0612e.f8443c0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z3) {
        if (!z3) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z3);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0612e c0612e = this.f5616e;
        if (c0612e == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0612e.A0 ? null : charSequence, bufferType);
        C0612e c0612e2 = this.f5616e;
        if (c0612e2 == null || TextUtils.equals(c0612e2.f8418C, charSequence)) {
            return;
        }
        c0612e2.f8418C = charSequence;
        c0612e2.f8449i0.f8962e = true;
        c0612e2.invalidateSelf();
        c0612e2.u();
    }

    public void setTextAppearance(d dVar) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.f8449i0.b(dVar, c0612e.f8443c0);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e == null || c0612e.f8440Y == f2) {
            return;
        }
        c0612e.f8440Y = f2;
        c0612e.invalidateSelf();
        c0612e.u();
    }

    public void setTextEndPaddingResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            float dimension = c0612e.f8443c0.getResources().getDimension(i);
            if (c0612e.f8440Y != dimension) {
                c0612e.f8440Y = dimension;
                c0612e.invalidateSelf();
                c0612e.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            j jVar = c0612e.f8449i0;
            d dVar = jVar.f8964g;
            if (dVar != null) {
                dVar.f227k = applyDimension;
                jVar.f8958a.setTextSize(applyDimension);
                c0612e.a();
            }
        }
        g();
    }

    public void setTextStartPadding(float f2) {
        C0612e c0612e = this.f5616e;
        if (c0612e == null || c0612e.f8439X == f2) {
            return;
        }
        c0612e.f8439X = f2;
        c0612e.invalidateSelf();
        c0612e.u();
    }

    public void setTextStartPaddingResource(int i) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            float dimension = c0612e.f8443c0.getResources().getDimension(i);
            if (c0612e.f8439X != dimension) {
                c0612e.f8439X = dimension;
                c0612e.invalidateSelf();
                c0612e.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z3) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.M(z3);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z3) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.z(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            c0612e.E(z3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            Context context2 = c0612e.f8443c0;
            c0612e.f8449i0.b(new d(context2, i), context2);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0612e c0612e = this.f5616e;
        if (c0612e != null) {
            Context context = c0612e.f8443c0;
            c0612e.f8449i0.b(new d(context, i), context);
        }
        g();
    }
}
