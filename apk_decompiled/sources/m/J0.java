package m;

import B0.C0024b;
import a.AbstractC0106b;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f.AbstractC0336a;
import f0.C0345i;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class J0 extends CompoundButton {

    /* renamed from: R, reason: collision with root package name */
    public static final C0024b f7535R = new C0024b(7, "thumbPos", Float.class);

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f7536S = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f7537A;

    /* renamed from: B, reason: collision with root package name */
    public int f7538B;

    /* renamed from: C, reason: collision with root package name */
    public int f7539C;

    /* renamed from: D, reason: collision with root package name */
    public int f7540D;

    /* renamed from: E, reason: collision with root package name */
    public int f7541E;

    /* renamed from: F, reason: collision with root package name */
    public int f7542F;

    /* renamed from: G, reason: collision with root package name */
    public int f7543G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7544H;

    /* renamed from: I, reason: collision with root package name */
    public final TextPaint f7545I;
    public final ColorStateList J;

    /* renamed from: K, reason: collision with root package name */
    public StaticLayout f7546K;

    /* renamed from: L, reason: collision with root package name */
    public StaticLayout f7547L;

    /* renamed from: M, reason: collision with root package name */
    public final j.a f7548M;

    /* renamed from: N, reason: collision with root package name */
    public ObjectAnimator f7549N;

    /* renamed from: O, reason: collision with root package name */
    public C0491v f7550O;

    /* renamed from: P, reason: collision with root package name */
    public C0345i f7551P;

    /* renamed from: Q, reason: collision with root package name */
    public final Rect f7552Q;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f7553a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f7554b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f7555c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7556d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7557e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f7558f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f7559g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7560j;

    /* renamed from: k, reason: collision with root package name */
    public int f7561k;

    /* renamed from: l, reason: collision with root package name */
    public int f7562l;

    /* renamed from: m, reason: collision with root package name */
    public int f7563m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7564n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f7565o;
    public CharSequence p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f7566q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f7567r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7568s;

    /* renamed from: t, reason: collision with root package name */
    public int f7569t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7570u;

    /* renamed from: v, reason: collision with root package name */
    public float f7571v;

    /* renamed from: w, reason: collision with root package name */
    public float f7572w;

    /* renamed from: x, reason: collision with root package name */
    public final VelocityTracker f7573x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7574y;

    /* renamed from: z, reason: collision with root package name */
    public float f7575z;

    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, j.a] */
    public J0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.adif.elcanomovil.R.attr.switchStyle);
        int resourceId;
        this.f7554b = null;
        this.f7555c = null;
        this.f7556d = false;
        this.f7557e = false;
        this.f7559g = null;
        this.h = null;
        this.i = false;
        this.f7560j = false;
        this.f7573x = VelocityTracker.obtain();
        this.f7544H = true;
        this.f7552Q = new Rect();
        K0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f7545I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0336a.f6440v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.adif.elcanomovil.R.attr.switchStyle, 0);
        R0.h hVar = new R0.h(context, obtainStyledAttributes);
        WeakHashMap weakHashMap = O.X.f1226a;
        O.S.d(this, context, iArr, attributeSet, obtainStyledAttributes, com.adif.elcanomovil.R.attr.switchStyle, 0);
        Drawable f2 = hVar.f(2);
        this.f7553a = f2;
        if (f2 != null) {
            f2.setCallback(this);
        }
        Drawable f4 = hVar.f(11);
        this.f7558f = f4;
        if (f4 != null) {
            f4.setCallback(this);
        }
        setTextOnInternal(obtainStyledAttributes.getText(0));
        setTextOffInternal(obtainStyledAttributes.getText(1));
        this.f7568s = obtainStyledAttributes.getBoolean(3, true);
        this.f7561k = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f7562l = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f7563m = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f7564n = obtainStyledAttributes.getBoolean(4, false);
        ColorStateList e4 = hVar.e(9);
        if (e4 != null) {
            this.f7554b = e4;
            this.f7556d = true;
        }
        PorterDuff.Mode c4 = AbstractC0463g0.c(obtainStyledAttributes.getInt(10, -1), null);
        if (this.f7555c != c4) {
            this.f7555c = c4;
            this.f7557e = true;
        }
        if (this.f7556d || this.f7557e) {
            a();
        }
        ColorStateList e5 = hVar.e(12);
        if (e5 != null) {
            this.f7559g = e5;
            this.i = true;
        }
        PorterDuff.Mode c5 = AbstractC0463g0.c(obtainStyledAttributes.getInt(13, -1), null);
        if (this.h != c5) {
            this.h = c5;
            this.f7560j = true;
        }
        if (this.i || this.f7560j) {
            b();
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId2, AbstractC0336a.f6441w);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = D.h.getColorStateList(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.J = colorStateList;
            } else {
                this.J = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f5 = dimensionPixelSize;
                if (f5 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f5);
                    requestLayout();
                }
            }
            int i = obtainStyledAttributes2.getInt(1, -1);
            int i4 = obtainStyledAttributes2.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            float f6 = BitmapDescriptorFactory.HUE_RED;
            if (i4 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
                setSwitchTypeface(defaultFromStyle);
                int i5 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i4;
                textPaint.setFakeBoldText((i5 & 1) != 0);
                textPaint.setTextSkewX((2 & i5) != 0 ? -0.25f : f6);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(BitmapDescriptorFactory.HUE_RED);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.f6899a = context2.getResources().getConfiguration().locale;
                this.f7548M = obj;
            } else {
                this.f7548M = null;
            }
            setTextOnInternal(this.f7565o);
            setTextOffInternal(this.f7566q);
            obtainStyledAttributes2.recycle();
        }
        new T(this).f(attributeSet, com.adif.elcanomovil.R.attr.switchStyle);
        hVar.n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7570u = viewConfiguration.getScaledTouchSlop();
        this.f7574y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.adif.elcanomovil.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0491v getEmojiTextViewHelper() {
        if (this.f7550O == null) {
            this.f7550O = new C0491v(this);
        }
        return this.f7550O;
    }

    private boolean getTargetCheckedState() {
        return this.f7575z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f7575z : this.f7575z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f7558f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f7552Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f7553a;
        Rect b4 = drawable2 != null ? AbstractC0463g0.b(drawable2) : AbstractC0463g0.f7664c;
        return ((((this.f7537A - this.f7539C) - rect.left) - rect.right) - b4.left) - b4.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f7566q = charSequence;
        C0491v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e02 = ((m3.l) emojiTextViewHelper.f7750b.f7b).e0(this.f7548M);
        if (e02 != null) {
            charSequence = e02.getTransformation(charSequence, this);
        }
        this.f7567r = charSequence;
        this.f7547L = null;
        if (this.f7568s) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f7565o = charSequence;
        C0491v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e02 = ((m3.l) emojiTextViewHelper.f7750b.f7b).e0(this.f7548M);
        if (e02 != null) {
            charSequence = e02.getTransformation(charSequence, this);
        }
        this.p = charSequence;
        this.f7546K = null;
        if (this.f7568s) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f7553a;
        if (drawable != null) {
            if (this.f7556d || this.f7557e) {
                Drawable mutate = drawable.mutate();
                this.f7553a = mutate;
                if (this.f7556d) {
                    H.a.h(mutate, this.f7554b);
                }
                if (this.f7557e) {
                    H.a.i(this.f7553a, this.f7555c);
                }
                if (this.f7553a.isStateful()) {
                    this.f7553a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f7558f;
        if (drawable != null) {
            if (this.i || this.f7560j) {
                Drawable mutate = drawable.mutate();
                this.f7558f = mutate;
                if (this.i) {
                    H.a.h(mutate, this.f7559g);
                }
                if (this.f7560j) {
                    H.a.i(this.f7558f, this.h);
                }
                if (this.f7558f.isStateful()) {
                    this.f7558f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f7565o);
        setTextOffInternal(this.f7566q);
        requestLayout();
    }

    public final void d() {
        if (this.f7551P == null && ((m3.l) this.f7550O.f7750b.f7b).F() && d0.h.f6123k != null) {
            d0.h a2 = d0.h.a();
            int b4 = a2.b();
            if (b4 == 3 || b4 == 0) {
                C0345i c0345i = new C0345i(this);
                this.f7551P = c0345i;
                a2.f(c0345i);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i4;
        int i5 = this.f7540D;
        int i6 = this.f7541E;
        int i7 = this.f7542F;
        int i8 = this.f7543G;
        int thumbOffset = getThumbOffset() + i5;
        Drawable drawable = this.f7553a;
        Rect b4 = drawable != null ? AbstractC0463g0.b(drawable) : AbstractC0463g0.f7664c;
        Drawable drawable2 = this.f7558f;
        Rect rect = this.f7552Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i9 = rect.left;
            thumbOffset += i9;
            if (b4 != null) {
                int i10 = b4.left;
                if (i10 > i9) {
                    i5 += i10 - i9;
                }
                int i11 = b4.top;
                int i12 = rect.top;
                i = i11 > i12 ? (i11 - i12) + i6 : i6;
                int i13 = b4.right;
                int i14 = rect.right;
                if (i13 > i14) {
                    i7 -= i13 - i14;
                }
                int i15 = b4.bottom;
                int i16 = rect.bottom;
                if (i15 > i16) {
                    i4 = i8 - (i15 - i16);
                    this.f7558f.setBounds(i5, i, i7, i4);
                }
            } else {
                i = i6;
            }
            i4 = i8;
            this.f7558f.setBounds(i5, i, i7, i4);
        }
        Drawable drawable3 = this.f7553a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i17 = thumbOffset - rect.left;
            int i18 = thumbOffset + this.f7539C + rect.right;
            this.f7553a.setBounds(i17, i6, i18, i8);
            Drawable background = getBackground();
            if (background != null) {
                H.a.f(background, i17, i6, i18, i8);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f4) {
        super.drawableHotspotChanged(f2, f4);
        Drawable drawable = this.f7553a;
        if (drawable != null) {
            H.a.e(drawable, f2, f4);
        }
        Drawable drawable2 = this.f7558f;
        if (drawable2 != null) {
            H.a.e(drawable2, f2, f4);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7553a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f7558f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f7537A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f7563m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f7537A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f7563m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public boolean getShowText() {
        return this.f7568s;
    }

    public boolean getSplitTrack() {
        return this.f7564n;
    }

    public int getSwitchMinWidth() {
        return this.f7562l;
    }

    public int getSwitchPadding() {
        return this.f7563m;
    }

    public CharSequence getTextOff() {
        return this.f7566q;
    }

    public CharSequence getTextOn() {
        return this.f7565o;
    }

    public Drawable getThumbDrawable() {
        return this.f7553a;
    }

    public final float getThumbPosition() {
        return this.f7575z;
    }

    public int getThumbTextPadding() {
        return this.f7561k;
    }

    public ColorStateList getThumbTintList() {
        return this.f7554b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f7555c;
    }

    public Drawable getTrackDrawable() {
        return this.f7558f;
    }

    public ColorStateList getTrackTintList() {
        return this.f7559g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7553a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f7558f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f7549N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f7549N.end();
        this.f7549N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7536S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f7558f;
        Rect rect = this.f7552Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f7541E;
        int i4 = this.f7543G;
        int i5 = i + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f7553a;
        if (drawable != null) {
            if (!this.f7564n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b4 = AbstractC0463g0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b4.left;
                rect.right -= b4.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f7546K : this.f7547L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            TextPaint textPaint = this.f7545I;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i5 + i6) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f7565o : this.f7566q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int i7;
        int width;
        int i8;
        int i9;
        int i10;
        super.onLayout(z3, i, i4, i5, i6);
        int i11 = 0;
        if (this.f7553a != null) {
            Drawable drawable = this.f7558f;
            Rect rect = this.f7552Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b4 = AbstractC0463g0.b(this.f7553a);
            i7 = Math.max(0, b4.left - rect.left);
            i11 = Math.max(0, b4.right - rect.right);
        } else {
            i7 = 0;
        }
        if (getLayoutDirection() == 1) {
            i8 = getPaddingLeft() + i7;
            width = ((this.f7537A + i8) - i7) - i11;
        } else {
            width = (getWidth() - getPaddingRight()) - i11;
            i8 = (width - this.f7537A) + i7 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i12 = this.f7538B;
            int i13 = height - (i12 / 2);
            i9 = i12 + i13;
            i10 = i13;
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i9 = this.f7538B + i10;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.f7538B;
        }
        this.f7540D = i8;
        this.f7541E = i10;
        this.f7543G = i9;
        this.f7542F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        int i6;
        int i7 = 0;
        if (this.f7568s) {
            StaticLayout staticLayout = this.f7546K;
            TextPaint textPaint = this.f7545I;
            if (staticLayout == null) {
                CharSequence charSequence = this.p;
                this.f7546K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
            }
            if (this.f7547L == null) {
                CharSequence charSequence2 = this.f7567r;
                this.f7547L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
            }
        }
        Drawable drawable = this.f7553a;
        Rect rect = this.f7552Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.f7553a.getIntrinsicWidth() - rect.left) - rect.right;
            i6 = this.f7553a.getIntrinsicHeight();
        } else {
            i5 = 0;
            i6 = 0;
        }
        this.f7539C = Math.max(this.f7568s ? (this.f7561k * 2) + Math.max(this.f7546K.getWidth(), this.f7547L.getWidth()) : 0, i5);
        Drawable drawable2 = this.f7558f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f7558f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f7553a;
        if (drawable3 != null) {
            Rect b4 = AbstractC0463g0.b(drawable3);
            i8 = Math.max(i8, b4.left);
            i9 = Math.max(i9, b4.right);
        }
        int max = this.f7544H ? Math.max(this.f7562l, (this.f7539C * 2) + i8 + i9) : this.f7562l;
        int max2 = Math.max(i7, i6);
        this.f7537A = max;
        this.f7538B = max2;
        super.onMeasure(i, i4);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f7565o : this.f7566q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.J0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        super.setChecked(z3);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f7565o;
                if (obj == null) {
                    obj = getResources().getString(com.adif.elcanomovil.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = O.X.f1226a;
                new O.G(com.adif.elcanomovil.R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f7566q;
            if (obj3 == null) {
                obj3 = getResources().getString(com.adif.elcanomovil.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = O.X.f1226a;
            new O.G(com.adif.elcanomovil.R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, obj4);
        }
        IBinder windowToken = getWindowToken();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (windowToken == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f7549N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (isChecked) {
                f2 = 1.0f;
            }
            setThumbPosition(f2);
            return;
        }
        if (isChecked) {
            f2 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f7535R, f2);
        this.f7549N = ofFloat;
        ofFloat.setDuration(250L);
        this.f7549N.setAutoCancel(true);
        this.f7549N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().d(z3);
        setTextOnInternal(this.f7565o);
        setTextOffInternal(this.f7566q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z3) {
        this.f7544H = z3;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z3) {
        if (this.f7568s != z3) {
            this.f7568s = z3;
            requestLayout();
            if (z3) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z3) {
        this.f7564n = z3;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f7562l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f7563m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f7545I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f7566q;
        if (obj == null) {
            obj = getResources().getString(com.adif.elcanomovil.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = O.X.f1226a;
        new O.G(com.adif.elcanomovil.R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, obj);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f7565o;
        if (obj == null) {
            obj = getResources().getString(com.adif.elcanomovil.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = O.X.f1226a;
        new O.G(com.adif.elcanomovil.R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, obj);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7553a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f7553a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f7575z = f2;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AbstractC0106b.m(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f7561k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f7554b = colorStateList;
        this.f7556d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f7555c = mode;
        this.f7557e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7558f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f7558f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AbstractC0106b.m(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f7559g = colorStateList;
        this.i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.f7560j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7553a || drawable == this.f7558f;
    }
}
