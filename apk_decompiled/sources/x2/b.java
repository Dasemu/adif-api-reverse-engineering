package x2;

import O.X;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.textfield.TextInputLayout;
import i2.AbstractC0396a;
import j0.C0399a;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f8889A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f8890B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8891C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f8893E;

    /* renamed from: F, reason: collision with root package name */
    public float f8894F;

    /* renamed from: G, reason: collision with root package name */
    public float f8895G;

    /* renamed from: H, reason: collision with root package name */
    public float f8896H;

    /* renamed from: I, reason: collision with root package name */
    public float f8897I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public int f8898K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f8899L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f8900M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f8901N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f8902O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f8903P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f8904Q;

    /* renamed from: R, reason: collision with root package name */
    public float f8905R;

    /* renamed from: S, reason: collision with root package name */
    public float f8906S;

    /* renamed from: T, reason: collision with root package name */
    public float f8907T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f8908U;

    /* renamed from: V, reason: collision with root package name */
    public float f8909V;

    /* renamed from: W, reason: collision with root package name */
    public float f8910W;

    /* renamed from: X, reason: collision with root package name */
    public float f8911X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f8912Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f8913a;

    /* renamed from: a0, reason: collision with root package name */
    public float f8914a0;

    /* renamed from: b, reason: collision with root package name */
    public float f8915b;

    /* renamed from: b0, reason: collision with root package name */
    public float f8916b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f8917c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f8918c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f8919d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f8921e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f8926j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f8927k;

    /* renamed from: l, reason: collision with root package name */
    public float f8928l;

    /* renamed from: m, reason: collision with root package name */
    public float f8929m;

    /* renamed from: n, reason: collision with root package name */
    public float f8930n;

    /* renamed from: o, reason: collision with root package name */
    public float f8931o;
    public float p;

    /* renamed from: q, reason: collision with root package name */
    public float f8932q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f8933r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f8934s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f8935t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f8936u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f8937v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f8938w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f8939x;

    /* renamed from: y, reason: collision with root package name */
    public B2.a f8940y;

    /* renamed from: f, reason: collision with root package name */
    public int f8923f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f8925g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f8941z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f8892D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f8920d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f8922e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f8924f0 = 1;

    public b(TextInputLayout textInputLayout) {
        this.f8913a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f8901N = textPaint;
        this.f8902O = new TextPaint(textPaint);
        this.f8919d = new Rect();
        this.f8917c = new Rect();
        this.f8921e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f2, int i, int i4) {
        float f4 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i4) * f2) + (Color.alpha(i) * f4)), Math.round((Color.red(i4) * f2) + (Color.red(i) * f4)), Math.round((Color.green(i4) * f2) + (Color.green(i) * f4)), Math.round((Color.blue(i4) * f2) + (Color.blue(i) * f4)));
    }

    public static float f(float f2, float f4, float f5, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return AbstractC0396a.a(f2, f4, f5);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f1226a;
        boolean z3 = this.f8913a.getLayoutDirection() == 1;
        if (this.f8892D) {
            return (z3 ? M.h.f1080d : M.h.f1079c).d(charSequence, charSequence.length());
        }
        return z3;
    }

    public final void c(float f2, boolean z3) {
        float f4;
        float f5;
        Typeface typeface;
        boolean z4;
        Layout.Alignment alignment;
        if (this.f8889A == null) {
            return;
        }
        float width = this.f8919d.width();
        float width2 = this.f8917c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f4 = this.i;
            f5 = this.f8909V;
            this.f8894F = 1.0f;
            typeface = this.f8933r;
        } else {
            float f6 = this.h;
            float f7 = this.f8910W;
            Typeface typeface2 = this.f8936u;
            if (Math.abs(f2 - BitmapDescriptorFactory.HUE_RED) < 1.0E-5f) {
                this.f8894F = 1.0f;
            } else {
                this.f8894F = f(this.h, this.i, f2, this.f8904Q) / this.h;
            }
            float f8 = this.i / this.h;
            width = (z3 || width2 * f8 <= width) ? width2 : Math.min(width / f8, width2);
            f4 = f6;
            f5 = f7;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f8901N;
        if (width > BitmapDescriptorFactory.HUE_RED) {
            boolean z5 = this.f8895G != f4;
            boolean z6 = this.f8911X != f5;
            boolean z7 = this.f8939x != typeface;
            StaticLayout staticLayout = this.f8912Y;
            boolean z8 = z5 || z6 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z7 || this.f8900M;
            this.f8895G = f4;
            this.f8911X = f5;
            this.f8939x = typeface;
            this.f8900M = false;
            textPaint.setLinearText(this.f8894F != 1.0f);
            z4 = z8;
        } else {
            z4 = false;
        }
        if (this.f8890B == null || z4) {
            textPaint.setTextSize(this.f8895G);
            textPaint.setTypeface(this.f8939x);
            textPaint.setLetterSpacing(this.f8911X);
            boolean b4 = b(this.f8889A);
            this.f8891C = b4;
            int i = this.f8920d0;
            if (i <= 1 || b4) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f8923f, b4 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f8891C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f8891C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            h hVar = new h(this.f8889A, textPaint, (int) width);
            hVar.f8957k = this.f8941z;
            hVar.f8956j = b4;
            hVar.f8953e = alignment;
            hVar.i = false;
            hVar.f8954f = i;
            hVar.f8955g = this.f8922e0;
            hVar.h = this.f8924f0;
            StaticLayout a2 = hVar.a();
            a2.getClass();
            this.f8912Y = a2;
            this.f8890B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f8902O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f8933r);
        textPaint.setLetterSpacing(this.f8909V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f8899L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f8935t;
            if (typeface != null) {
                this.f8934s = m3.d.A(configuration, typeface);
            }
            Typeface typeface2 = this.f8938w;
            if (typeface2 != null) {
                this.f8937v = m3.d.A(configuration, typeface2);
            }
            Typeface typeface3 = this.f8934s;
            if (typeface3 == null) {
                typeface3 = this.f8935t;
            }
            this.f8933r = typeface3;
            Typeface typeface4 = this.f8937v;
            if (typeface4 == null) {
                typeface4 = this.f8938w;
            }
            this.f8936u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z3) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f8913a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z3) {
            return;
        }
        c(1.0f, z3);
        CharSequence charSequence = this.f8890B;
        TextPaint textPaint = this.f8901N;
        if (charSequence != null && (staticLayout = this.f8912Y) != null) {
            this.f8918c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f8941z);
        }
        CharSequence charSequence2 = this.f8918c0;
        if (charSequence2 != null) {
            this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.Z = BitmapDescriptorFactory.HUE_RED;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f8925g, this.f8891C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f8919d;
        if (i == 48) {
            this.f8929m = rect.top;
        } else if (i != 80) {
            this.f8929m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f8929m = textPaint.ascent() + rect.bottom;
        }
        int i4 = absoluteGravity & 8388615;
        if (i4 == 1) {
            this.f8931o = rect.centerX() - (this.Z / 2.0f);
        } else if (i4 != 5) {
            this.f8931o = rect.left;
        } else {
            this.f8931o = rect.right - this.Z;
        }
        c(BitmapDescriptorFactory.HUE_RED, z3);
        float height = this.f8912Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f8912Y;
        if (staticLayout2 == null || this.f8920d0 <= 1) {
            CharSequence charSequence3 = this.f8890B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f8912Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f8923f, this.f8891C ? 1 : 0);
        int i5 = absoluteGravity2 & 112;
        Rect rect2 = this.f8917c;
        if (i5 == 48) {
            this.f8928l = rect2.top;
        } else if (i5 != 80) {
            this.f8928l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f8928l = textPaint.descent() + (rect2.bottom - height);
        }
        int i6 = absoluteGravity2 & 8388615;
        if (i6 == 1) {
            this.f8930n = rect2.centerX() - (measureText / 2.0f);
        } else if (i6 != 5) {
            this.f8930n = rect2.left;
        } else {
            this.f8930n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f8893E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f8893E = null;
        }
        l(this.f8915b);
        float f2 = this.f8915b;
        float f4 = f(rect2.left, rect.left, f2, this.f8903P);
        RectF rectF = this.f8921e;
        rectF.left = f4;
        rectF.top = f(this.f8928l, this.f8929m, f2, this.f8903P);
        rectF.right = f(rect2.right, rect.right, f2, this.f8903P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f8903P);
        this.p = f(this.f8930n, this.f8931o, f2, this.f8903P);
        this.f8932q = f(this.f8928l, this.f8929m, f2, this.f8903P);
        l(f2);
        C0399a c0399a = AbstractC0396a.f6816b;
        this.f8914a0 = 1.0f - f(BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f - f2, c0399a);
        WeakHashMap weakHashMap = X.f1226a;
        textInputLayout.postInvalidateOnAnimation();
        this.f8916b0 = f(1.0f, BitmapDescriptorFactory.HUE_RED, f2, c0399a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f8927k;
        ColorStateList colorStateList2 = this.f8926j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f2, e(colorStateList2), e(this.f8927k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f5 = this.f8909V;
        float f6 = this.f8910W;
        if (f5 != f6) {
            textPaint.setLetterSpacing(f(f6, f5, f2, c0399a));
        } else {
            textPaint.setLetterSpacing(f5);
        }
        this.f8896H = AbstractC0396a.a(BitmapDescriptorFactory.HUE_RED, this.f8905R, f2);
        this.f8897I = AbstractC0396a.a(BitmapDescriptorFactory.HUE_RED, this.f8906S, f2);
        this.J = AbstractC0396a.a(BitmapDescriptorFactory.HUE_RED, this.f8907T, f2);
        int a2 = a(f2, 0, e(this.f8908U));
        this.f8898K = a2;
        textPaint.setShadowLayer(this.f8896H, this.f8897I, this.J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f8927k == colorStateList && this.f8926j == colorStateList) {
            return;
        }
        this.f8927k = colorStateList;
        this.f8926j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        B2.a aVar = this.f8940y;
        if (aVar != null) {
            aVar.f212c = true;
        }
        if (this.f8935t == typeface) {
            return false;
        }
        this.f8935t = typeface;
        Typeface A3 = m3.d.A(this.f8913a.getContext().getResources().getConfiguration(), typeface);
        this.f8934s = A3;
        if (A3 == null) {
            A3 = this.f8935t;
        }
        this.f8933r = A3;
        return true;
    }

    public final void k(float f2) {
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f8915b) {
            this.f8915b = f2;
            float f4 = this.f8917c.left;
            Rect rect = this.f8919d;
            float f5 = f(f4, rect.left, f2, this.f8903P);
            RectF rectF = this.f8921e;
            rectF.left = f5;
            rectF.top = f(this.f8928l, this.f8929m, f2, this.f8903P);
            rectF.right = f(r1.right, rect.right, f2, this.f8903P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f8903P);
            this.p = f(this.f8930n, this.f8931o, f2, this.f8903P);
            this.f8932q = f(this.f8928l, this.f8929m, f2, this.f8903P);
            l(f2);
            C0399a c0399a = AbstractC0396a.f6816b;
            this.f8914a0 = 1.0f - f(BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f - f2, c0399a);
            WeakHashMap weakHashMap = X.f1226a;
            TextInputLayout textInputLayout = this.f8913a;
            textInputLayout.postInvalidateOnAnimation();
            this.f8916b0 = f(1.0f, BitmapDescriptorFactory.HUE_RED, f2, c0399a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f8927k;
            ColorStateList colorStateList2 = this.f8926j;
            TextPaint textPaint = this.f8901N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f2, e(colorStateList2), e(this.f8927k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f6 = this.f8909V;
            float f7 = this.f8910W;
            if (f6 != f7) {
                textPaint.setLetterSpacing(f(f7, f6, f2, c0399a));
            } else {
                textPaint.setLetterSpacing(f6);
            }
            this.f8896H = AbstractC0396a.a(BitmapDescriptorFactory.HUE_RED, this.f8905R, f2);
            this.f8897I = AbstractC0396a.a(BitmapDescriptorFactory.HUE_RED, this.f8906S, f2);
            this.J = AbstractC0396a.a(BitmapDescriptorFactory.HUE_RED, this.f8907T, f2);
            int a2 = a(f2, 0, e(this.f8908U));
            this.f8898K = a2;
            textPaint.setShadowLayer(this.f8896H, this.f8897I, this.J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = X.f1226a;
        this.f8913a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z3;
        boolean j4 = j(typeface);
        if (this.f8938w != typeface) {
            this.f8938w = typeface;
            Typeface A3 = m3.d.A(this.f8913a.getContext().getResources().getConfiguration(), typeface);
            this.f8937v = A3;
            if (A3 == null) {
                A3 = this.f8938w;
            }
            this.f8936u = A3;
            z3 = true;
        } else {
            z3 = false;
        }
        if (j4 || z3) {
            h(false);
        }
    }
}
