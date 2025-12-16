package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f.AbstractC0336a;
import java.util.WeakHashMap;

/* renamed from: m.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446E extends C0499z {

    /* renamed from: e, reason: collision with root package name */
    public final C0445D f7507e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f7508f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f7509g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7510j;

    public C0446E(C0445D c0445d) {
        super(c0445d);
        this.f7509g = null;
        this.h = null;
        this.i = false;
        this.f7510j = false;
        this.f7507e = c0445d;
    }

    @Override // m.C0499z
    public final void e(AttributeSet attributeSet, int i) {
        super.e(attributeSet, R.attr.seekBarStyle);
        C0445D c0445d = this.f7507e;
        Context context = c0445d.getContext();
        int[] iArr = AbstractC0336a.f6428g;
        R0.h l4 = R0.h.l(context, attributeSet, iArr, R.attr.seekBarStyle);
        Context context2 = c0445d.getContext();
        WeakHashMap weakHashMap = O.X.f1226a;
        O.S.d(c0445d, context2, iArr, attributeSet, (TypedArray) l4.f1414b, R.attr.seekBarStyle, 0);
        Drawable g4 = l4.g(0);
        if (g4 != null) {
            c0445d.setThumb(g4);
        }
        Drawable f2 = l4.f(1);
        Drawable drawable = this.f7508f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f7508f = f2;
        if (f2 != null) {
            f2.setCallback(c0445d);
            H.b.b(f2, c0445d.getLayoutDirection());
            if (f2.isStateful()) {
                f2.setState(c0445d.getDrawableState());
            }
            i();
        }
        c0445d.invalidate();
        TypedArray typedArray = (TypedArray) l4.f1414b;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0463g0.c(typedArray.getInt(3, -1), this.h);
            this.f7510j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f7509g = l4.e(2);
            this.i = true;
        }
        l4.n();
        i();
    }

    public final void i() {
        Drawable drawable = this.f7508f;
        if (drawable != null) {
            if (this.i || this.f7510j) {
                Drawable mutate = drawable.mutate();
                this.f7508f = mutate;
                if (this.i) {
                    H.a.h(mutate, this.f7509g);
                }
                if (this.f7510j) {
                    H.a.i(this.f7508f, this.h);
                }
                if (this.f7508f.isStateful()) {
                    this.f7508f.setState(this.f7507e.getDrawableState());
                }
            }
        }
    }

    public final void j(Canvas canvas) {
        if (this.f7508f != null) {
            int max = this.f7507e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f7508f.getIntrinsicWidth();
                int intrinsicHeight = this.f7508f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i4 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f7508f.setBounds(-i, -i4, i, i4);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i5 = 0; i5 <= max; i5++) {
                    this.f7508f.draw(canvas);
                    canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
