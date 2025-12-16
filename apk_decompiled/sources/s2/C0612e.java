package s2;

import E2.f;
import E2.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.chip.Chip;
import i2.C0397b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;
import x2.i;
import x2.j;
import x2.m;

/* renamed from: s2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0612e extends g implements Drawable.Callback, i {

    /* renamed from: D0, reason: collision with root package name */
    public static final int[] f8414D0 = {R.attr.state_enabled};
    public static final ShapeDrawable E0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f8415A;
    public boolean A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f8416B;

    /* renamed from: B0, reason: collision with root package name */
    public int f8417B0;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f8418C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f8419C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f8420D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f8421E;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f8422F;

    /* renamed from: G, reason: collision with root package name */
    public float f8423G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8424H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f8425I;
    public Drawable J;

    /* renamed from: K, reason: collision with root package name */
    public RippleDrawable f8426K;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f8427L;

    /* renamed from: M, reason: collision with root package name */
    public float f8428M;

    /* renamed from: N, reason: collision with root package name */
    public SpannableStringBuilder f8429N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f8430O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f8431P;

    /* renamed from: Q, reason: collision with root package name */
    public Drawable f8432Q;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f8433R;

    /* renamed from: S, reason: collision with root package name */
    public C0397b f8434S;

    /* renamed from: T, reason: collision with root package name */
    public C0397b f8435T;

    /* renamed from: U, reason: collision with root package name */
    public float f8436U;

    /* renamed from: V, reason: collision with root package name */
    public float f8437V;

    /* renamed from: W, reason: collision with root package name */
    public float f8438W;

    /* renamed from: X, reason: collision with root package name */
    public float f8439X;

    /* renamed from: Y, reason: collision with root package name */
    public float f8440Y;
    public float Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f8441a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f8442b0;

    /* renamed from: c0, reason: collision with root package name */
    public final Context f8443c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Paint f8444d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Paint.FontMetrics f8445e0;

    /* renamed from: f0, reason: collision with root package name */
    public final RectF f8446f0;

    /* renamed from: g0, reason: collision with root package name */
    public final PointF f8447g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Path f8448h0;

    /* renamed from: i0, reason: collision with root package name */
    public final j f8449i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f8450j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f8451k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f8452l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f8453m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f8454n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f8455o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f8456p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f8457q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f8458r0;

    /* renamed from: s0, reason: collision with root package name */
    public ColorFilter f8459s0;

    /* renamed from: t0, reason: collision with root package name */
    public PorterDuffColorFilter f8460t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorStateList f8461u0;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f8462v;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuff.Mode f8463v0;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f8464w;

    /* renamed from: w0, reason: collision with root package name */
    public int[] f8465w0;

    /* renamed from: x, reason: collision with root package name */
    public float f8466x;

    /* renamed from: x0, reason: collision with root package name */
    public ColorStateList f8467x0;

    /* renamed from: y, reason: collision with root package name */
    public float f8468y;

    /* renamed from: y0, reason: collision with root package name */
    public WeakReference f8469y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f8470z;

    /* renamed from: z0, reason: collision with root package name */
    public TextUtils.TruncateAt f8471z0;

    public C0612e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.adif.elcanomovil.R.attr.chipStyle, 2132018300);
        this.f8468y = -1.0f;
        this.f8444d0 = new Paint(1);
        this.f8445e0 = new Paint.FontMetrics();
        this.f8446f0 = new RectF();
        this.f8447g0 = new PointF();
        this.f8448h0 = new Path();
        this.f8458r0 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f8463v0 = PorterDuff.Mode.SRC_IN;
        this.f8469y0 = new WeakReference(null);
        h(context);
        this.f8443c0 = context;
        j jVar = new j(this);
        this.f8449i0 = jVar;
        this.f8418C = "";
        jVar.f8958a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f8414D0;
        setState(iArr);
        if (!Arrays.equals(this.f8465w0, iArr)) {
            this.f8465w0 = iArr;
            if (S()) {
                v(getState(), iArr);
            }
        }
        this.A0 = true;
        E0.setTint(-1);
    }

    public static void T(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f2) {
        if (this.f8468y != f2) {
            this.f8468y = f2;
            E2.j e4 = this.f400a.f386a.e();
            e4.f422e = new E2.a(f2);
            e4.f423f = new E2.a(f2);
            e4.f424g = new E2.a(f2);
            e4.h = new E2.a(f2);
            setShapeAppearanceModel(e4.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8421E;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof H.g;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p = p();
            this.f8421E = drawable != null ? drawable.mutate() : null;
            float p3 = p();
            T(drawable2);
            if (R()) {
                n(this.f8421E);
            }
            invalidateSelf();
            if (p != p3) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.f8423G != f2) {
            float p = p();
            this.f8423G = f2;
            float p3 = p();
            invalidateSelf();
            if (p != p3) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f8424H = true;
        if (this.f8422F != colorStateList) {
            this.f8422F = colorStateList;
            if (R()) {
                H.a.h(this.f8421E, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z3) {
        if (this.f8420D != z3) {
            boolean R3 = R();
            this.f8420D = z3;
            boolean R4 = R();
            if (R3 != R4) {
                if (R4) {
                    n(this.f8421E);
                } else {
                    T(this.f8421E);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f8470z != colorStateList) {
            this.f8470z = colorStateList;
            if (this.f8419C0) {
                f fVar = this.f400a;
                if (fVar.f389d != colorStateList) {
                    fVar.f389d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f8415A != f2) {
            this.f8415A = f2;
            this.f8444d0.setStrokeWidth(f2);
            if (this.f8419C0) {
                this.f400a.f393j = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.J;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof H.g;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q4 = q();
            this.J = drawable != null ? drawable.mutate() : null;
            this.f8426K = new RippleDrawable(C2.a.c(this.f8416B), this.J, E0);
            float q5 = q();
            T(drawable2);
            if (S()) {
                n(this.J);
            }
            invalidateSelf();
            if (q4 != q5) {
                u();
            }
        }
    }

    public final void I(float f2) {
        if (this.f8441a0 != f2) {
            this.f8441a0 = f2;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f8428M != f2) {
            this.f8428M = f2;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.Z != f2) {
            this.Z = f2;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f8427L != colorStateList) {
            this.f8427L = colorStateList;
            if (S()) {
                H.a.h(this.J, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z3) {
        if (this.f8425I != z3) {
            boolean S3 = S();
            this.f8425I = z3;
            boolean S4 = S();
            if (S3 != S4) {
                if (S4) {
                    n(this.J);
                } else {
                    T(this.J);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f8438W != f2) {
            float p = p();
            this.f8438W = f2;
            float p3 = p();
            invalidateSelf();
            if (p != p3) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f8437V != f2) {
            float p = p();
            this.f8437V = f2;
            float p3 = p();
            invalidateSelf();
            if (p != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f8416B != colorStateList) {
            this.f8416B = colorStateList;
            this.f8467x0 = null;
            onStateChange(getState());
        }
    }

    public final boolean Q() {
        return this.f8431P && this.f8432Q != null && this.f8456p0;
    }

    public final boolean R() {
        return this.f8420D && this.f8421E != null;
    }

    public final boolean S() {
        return this.f8425I && this.J != null;
    }

    @Override // x2.i
    public final void a() {
        u();
        invalidateSelf();
    }

    @Override // E2.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i4;
        float f2;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f8458r0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i4 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i4 = 0;
        }
        boolean z3 = this.f8419C0;
        Paint paint = this.f8444d0;
        RectF rectF = this.f8446f0;
        if (!z3) {
            paint.setColor(this.f8450j0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (!this.f8419C0) {
            paint.setColor(this.f8451k0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f8459s0;
            if (colorFilter == null) {
                colorFilter = this.f8460t0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (this.f8419C0) {
            super.draw(canvas);
        }
        if (this.f8415A > BitmapDescriptorFactory.HUE_RED && !this.f8419C0) {
            paint.setColor(this.f8453m0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f8419C0) {
                ColorFilter colorFilter2 = this.f8459s0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f8460t0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f4 = bounds.left;
            float f5 = this.f8415A / 2.0f;
            rectF.set(f4 + f5, bounds.top + f5, bounds.right - f5, bounds.bottom - f5);
            float f6 = this.f8468y - (this.f8415A / 2.0f);
            canvas2.drawRoundRect(rectF, f6, f6, paint);
        }
        paint.setColor(this.f8454n0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f8419C0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f8448h0;
            f fVar = this.f400a;
            this.f413q.a(fVar.f386a, fVar.i, rectF2, this.p, path);
            d(canvas2, paint, path, this.f400a.f386a, f());
        } else {
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (R()) {
            o(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.f8421E.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f8421E.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (Q()) {
            o(bounds, rectF);
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas2.translate(f9, f10);
            this.f8432Q.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f8432Q.draw(canvas2);
            canvas2.translate(-f9, -f10);
        }
        if (this.A0 && this.f8418C != null) {
            PointF pointF = this.f8447g0;
            pointF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f8418C;
            j jVar = this.f8449i0;
            if (charSequence != null) {
                float p = p() + this.f8436U + this.f8439X;
                if (H.b.a(this) == 0) {
                    pointF.x = bounds.left + p;
                } else {
                    pointF.x = bounds.right - p;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = jVar.f8958a;
                Paint.FontMetrics fontMetrics = this.f8445e0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f8418C != null) {
                float p3 = p() + this.f8436U + this.f8439X;
                float q4 = q() + this.f8442b0 + this.f8440Y;
                if (H.b.a(this) == 0) {
                    rectF.left = bounds.left + p3;
                    rectF.right = bounds.right - q4;
                } else {
                    rectF.left = bounds.left + q4;
                    rectF.right = bounds.right - p3;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            B2.d dVar = jVar.f8964g;
            TextPaint textPaint2 = jVar.f8958a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                jVar.f8964g.e(this.f8443c0, textPaint2, jVar.f8959b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.f8418C.toString();
            if (jVar.f8962e) {
                jVar.a(charSequence2);
                f2 = jVar.f8960c;
            } else {
                f2 = jVar.f8960c;
            }
            boolean z4 = Math.round(f2) > Math.round(rectF.width());
            if (z4) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i5 = save;
            } else {
                i5 = 0;
            }
            CharSequence charSequence3 = this.f8418C;
            if (z4 && this.f8471z0 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.f8471z0);
            }
            canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z4) {
                canvas2.restoreToCount(i5);
            }
        }
        if (S()) {
            rectF.setEmpty();
            if (S()) {
                float f11 = this.f8442b0 + this.f8441a0;
                if (H.b.a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF.right = f12;
                    rectF.left = f12 - this.f8428M;
                } else {
                    float f13 = bounds.left + f11;
                    rectF.left = f13;
                    rectF.right = f13 + this.f8428M;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.f8428M;
                float f15 = exactCenterY - (f14 / 2.0f);
                rectF.top = f15;
                rectF.bottom = f15 + f14;
            }
            float f16 = rectF.left;
            float f17 = rectF.top;
            canvas2.translate(f16, f17);
            this.J.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f8426K.setBounds(this.J.getBounds());
            this.f8426K.jumpToCurrentState();
            this.f8426K.draw(canvas2);
            canvas2.translate(-f16, -f17);
        }
        if (this.f8458r0 < 255) {
            canvas2.restoreToCount(i4);
        }
    }

    @Override // E2.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f8458r0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f8459s0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f8466x;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f2;
        float p = p() + this.f8436U + this.f8439X;
        String charSequence = this.f8418C.toString();
        j jVar = this.f8449i0;
        if (jVar.f8962e) {
            jVar.a(charSequence);
            f2 = jVar.f8960c;
        } else {
            f2 = jVar.f8960c;
        }
        return Math.min(Math.round(q() + f2 + p + this.f8440Y + this.f8442b0), this.f8417B0);
    }

    @Override // E2.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // E2.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f8419C0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f8466x, this.f8468y);
        } else {
            outline.setRoundRect(bounds, this.f8468y);
            outline2 = outline;
        }
        outline2.setAlpha(this.f8458r0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // E2.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (s(this.f8462v) || s(this.f8464w) || s(this.f8470z)) {
            return true;
        }
        B2.d dVar = this.f8449i0.f8964g;
        if (dVar == null || (colorStateList = dVar.f226j) == null || !colorStateList.isStateful()) {
            return (this.f8431P && this.f8432Q != null && this.f8430O) || t(this.f8421E) || t(this.f8432Q) || s(this.f8461u0);
        }
        return true;
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        H.b.b(drawable, H.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.J) {
            if (drawable.isStateful()) {
                drawable.setState(this.f8465w0);
            }
            H.a.h(drawable, this.f8427L);
            return;
        }
        Drawable drawable2 = this.f8421E;
        if (drawable == drawable2 && this.f8424H) {
            H.a.h(drawable2, this.f8422F);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (R() || Q()) {
            float f2 = this.f8436U + this.f8437V;
            Drawable drawable = this.f8456p0 ? this.f8432Q : this.f8421E;
            float f4 = this.f8423G;
            if (f4 <= BitmapDescriptorFactory.HUE_RED && drawable != null) {
                f4 = drawable.getIntrinsicWidth();
            }
            if (H.b.a(this) == 0) {
                float f5 = rect.left + f2;
                rectF.left = f5;
                rectF.right = f5 + f4;
            } else {
                float f6 = rect.right - f2;
                rectF.right = f6;
                rectF.left = f6 - f4;
            }
            Drawable drawable2 = this.f8456p0 ? this.f8432Q : this.f8421E;
            float f7 = this.f8423G;
            if (f7 <= BitmapDescriptorFactory.HUE_RED && drawable2 != null) {
                f7 = (float) Math.ceil(m.e(this.f8443c0, 24));
                if (drawable2.getIntrinsicHeight() <= f7) {
                    f7 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f7 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f7;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (R()) {
            onLayoutDirectionChanged |= H.b.b(this.f8421E, i);
        }
        if (Q()) {
            onLayoutDirectionChanged |= H.b.b(this.f8432Q, i);
        }
        if (S()) {
            onLayoutDirectionChanged |= H.b.b(this.J, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (R()) {
            onLevelChange |= this.f8421E.setLevel(i);
        }
        if (Q()) {
            onLevelChange |= this.f8432Q.setLevel(i);
        }
        if (S()) {
            onLevelChange |= this.J.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // E2.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f8419C0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f8465w0);
    }

    public final float p() {
        if (!R() && !Q()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f2 = this.f8437V;
        Drawable drawable = this.f8456p0 ? this.f8432Q : this.f8421E;
        float f4 = this.f8423G;
        if (f4 <= BitmapDescriptorFactory.HUE_RED && drawable != null) {
            f4 = drawable.getIntrinsicWidth();
        }
        return f4 + f2 + this.f8438W;
    }

    public final float q() {
        return S() ? this.Z + this.f8428M + this.f8441a0 : BitmapDescriptorFactory.HUE_RED;
    }

    public final float r() {
        return this.f8419C0 ? this.f400a.f386a.f432e.a(f()) : this.f8468y;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // E2.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f8458r0 != i) {
            this.f8458r0 = i;
            invalidateSelf();
        }
    }

    @Override // E2.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f8459s0 != colorFilter) {
            this.f8459s0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // E2.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f8461u0 != colorStateList) {
            this.f8461u0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // E2.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f8463v0 != mode) {
            this.f8463v0 = mode;
            ColorStateList colorStateList = this.f8461u0;
            this.f8460t0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        if (R()) {
            visible |= this.f8421E.setVisible(z3, z4);
        }
        if (Q()) {
            visible |= this.f8432Q.setVisible(z3, z4);
        }
        if (S()) {
            visible |= this.J.setVisible(z3, z4);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        InterfaceC0611d interfaceC0611d = (InterfaceC0611d) this.f8469y0.get();
        if (interfaceC0611d != null) {
            Chip chip = (Chip) interfaceC0611d;
            chip.b(chip.p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(int[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.C0612e.v(int[], int[]):boolean");
    }

    public final void w(boolean z3) {
        if (this.f8430O != z3) {
            this.f8430O = z3;
            float p = p();
            if (!z3 && this.f8456p0) {
                this.f8456p0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f8432Q != drawable) {
            float p = p();
            this.f8432Q = drawable;
            float p3 = p();
            T(this.f8432Q);
            n(this.f8432Q);
            invalidateSelf();
            if (p != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f8433R != colorStateList) {
            this.f8433R = colorStateList;
            if (this.f8431P && (drawable = this.f8432Q) != null && this.f8430O) {
                H.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z3) {
        if (this.f8431P != z3) {
            boolean Q3 = Q();
            this.f8431P = z3;
            boolean Q4 = Q();
            if (Q3 != Q4) {
                if (Q4) {
                    n(this.f8432Q);
                } else {
                    T(this.f8432Q);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
