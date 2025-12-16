package B2;

import F.q;
import a.AbstractC0105a;
import a.AbstractC0106b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.AbstractC0379a;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f219a;

    /* renamed from: b, reason: collision with root package name */
    public final String f220b;

    /* renamed from: c, reason: collision with root package name */
    public final int f221c;

    /* renamed from: d, reason: collision with root package name */
    public final int f222d;

    /* renamed from: e, reason: collision with root package name */
    public final float f223e;

    /* renamed from: f, reason: collision with root package name */
    public final float f224f;

    /* renamed from: g, reason: collision with root package name */
    public final float f225g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f226j;

    /* renamed from: k, reason: collision with root package name */
    public float f227k;

    /* renamed from: l, reason: collision with root package name */
    public final int f228l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f229m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f230n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0379a.f6751E);
        this.f227k = obtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED);
        this.f226j = AbstractC0105a.w(context, obtainStyledAttributes, 3);
        AbstractC0105a.w(context, obtainStyledAttributes, 4);
        AbstractC0105a.w(context, obtainStyledAttributes, 5);
        this.f221c = obtainStyledAttributes.getInt(2, 0);
        this.f222d = obtainStyledAttributes.getInt(1, 1);
        int i4 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f228l = obtainStyledAttributes.getResourceId(i4, 0);
        this.f220b = obtainStyledAttributes.getString(i4);
        obtainStyledAttributes.getBoolean(14, false);
        this.f219a = AbstractC0105a.w(context, obtainStyledAttributes, 6);
        this.f223e = obtainStyledAttributes.getFloat(7, BitmapDescriptorFactory.HUE_RED);
        this.f224f = obtainStyledAttributes.getFloat(8, BitmapDescriptorFactory.HUE_RED);
        this.f225g = obtainStyledAttributes.getFloat(9, BitmapDescriptorFactory.HUE_RED);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0379a.f6770s);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, BitmapDescriptorFactory.HUE_RED);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f230n;
        int i = this.f221c;
        if (typeface == null && (str = this.f220b) != null) {
            this.f230n = Typeface.create(str, i);
        }
        if (this.f230n == null) {
            int i4 = this.f222d;
            if (i4 == 1) {
                this.f230n = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                this.f230n = Typeface.SERIF;
            } else if (i4 != 3) {
                this.f230n = Typeface.DEFAULT;
            } else {
                this.f230n = Typeface.MONOSPACE;
            }
            this.f230n = Typeface.create(this.f230n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f229m) {
            return this.f230n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = q.a(context, this.f228l);
                this.f230n = a2;
                if (a2 != null) {
                    this.f230n = Typeface.create(a2, this.f221c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e4) {
                Log.d("TextAppearance", "Error loading font " + this.f220b, e4);
            }
        }
        a();
        this.f229m = true;
        return this.f230n;
    }

    public final void c(Context context, AbstractC0106b abstractC0106b) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f228l;
        if (i == 0) {
            this.f229m = true;
        }
        if (this.f229m) {
            abstractC0106b.z(this.f230n, true);
            return;
        }
        try {
            b bVar = new b(this, abstractC0106b);
            ThreadLocal threadLocal = q.f503a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                q.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f229m = true;
            abstractC0106b.y(1);
        } catch (Exception e4) {
            Log.d("TextAppearance", "Error loading font " + this.f220b, e4);
            this.f229m = true;
            abstractC0106b.y(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f228l;
        if (i != 0) {
            ThreadLocal threadLocal = q.f503a;
            if (!context.isRestricted()) {
                typeface = q.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, AbstractC0106b abstractC0106b) {
        f(context, textPaint, abstractC0106b);
        ColorStateList colorStateList = this.f226j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f219a;
        textPaint.setShadowLayer(this.f225g, this.f223e, this.f224f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, AbstractC0106b abstractC0106b) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f230n);
        c(context, new c(this, context, textPaint, abstractC0106b));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface A3 = m3.d.A(context.getResources().getConfiguration(), typeface);
        if (A3 != null) {
            typeface = A3;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f221c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : BitmapDescriptorFactory.HUE_RED);
        textPaint.setTextSize(this.f227k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
