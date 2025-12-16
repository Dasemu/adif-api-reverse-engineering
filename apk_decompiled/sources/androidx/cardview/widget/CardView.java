package androidx.cardview.widget;

import F.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f0.C0338b;
import q.AbstractC0553a;
import r.C0564a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: f */
    public static final int[] f2507f = {R.attr.colorBackground};

    /* renamed from: g */
    public static final C0338b f2508g = new C0338b(11);

    /* renamed from: a */
    public boolean f2509a;

    /* renamed from: b */
    public boolean f2510b;

    /* renamed from: c */
    public final Rect f2511c;

    /* renamed from: d */
    public final Rect f2512d;

    /* renamed from: e */
    public final i f2513e;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.adif.elcanomovil.R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f2511c = rect;
        this.f2512d = new Rect();
        i iVar = new i(this, 18);
        this.f2513e = iVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0553a.f8145a, com.adif.elcanomovil.R.attr.cardViewStyle, com.adif.elcanomovil.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2507f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.adif.elcanomovil.R.color.cardview_light_background) : getResources().getColor(com.adif.elcanomovil.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = obtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = obtainStyledAttributes.getDimension(5, BitmapDescriptorFactory.HUE_RED);
        this.f2509a = obtainStyledAttributes.getBoolean(7, false);
        this.f2510b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C0338b c0338b = f2508g;
        C0564a c0564a = new C0564a(valueOf, dimension);
        iVar.f490b = c0564a;
        setBackgroundDrawable(c0564a);
        setClipToOutline(true);
        setElevation(dimension2);
        c0338b.w(iVar, dimension3);
    }

    public static /* synthetic */ void a(CardView cardView, int i, int i4, int i5, int i6) {
        super.setPadding(i, i4, i5, i6);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C0564a) ((Drawable) this.f2513e.f490b)).h;
    }

    public float getCardElevation() {
        return ((CardView) this.f2513e.f491c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f2511c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2511c.left;
    }

    public int getContentPaddingRight() {
        return this.f2511c.right;
    }

    public int getContentPaddingTop() {
        return this.f2511c.top;
    }

    public float getMaxCardElevation() {
        return ((C0564a) ((Drawable) this.f2513e.f490b)).f8197e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2510b;
    }

    public float getRadius() {
        return ((C0564a) ((Drawable) this.f2513e.f490b)).f8193a;
    }

    public boolean getUseCompatPadding() {
        return this.f2509a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C0564a c0564a = (C0564a) ((Drawable) this.f2513e.f490b);
        if (valueOf == null) {
            c0564a.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c0564a.h = valueOf;
        c0564a.f8194b.setColor(valueOf.getColorForState(c0564a.getState(), c0564a.h.getDefaultColor()));
        c0564a.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((CardView) this.f2513e.f491c).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        f2508g.w(this.f2513e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i4, int i5, int i6) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i4, int i5, int i6) {
    }

    public void setPreventCornerOverlap(boolean z3) {
        if (z3 != this.f2510b) {
            this.f2510b = z3;
            C0338b c0338b = f2508g;
            i iVar = this.f2513e;
            c0338b.w(iVar, ((C0564a) ((Drawable) iVar.f490b)).f8197e);
        }
    }

    public void setRadius(float f2) {
        C0564a c0564a = (C0564a) ((Drawable) this.f2513e.f490b);
        if (f2 == c0564a.f8193a) {
            return;
        }
        c0564a.f8193a = f2;
        c0564a.b(null);
        c0564a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z3) {
        if (this.f2509a != z3) {
            this.f2509a = z3;
            C0338b c0338b = f2508g;
            i iVar = this.f2513e;
            c0338b.w(iVar, ((C0564a) ((Drawable) iVar.f490b)).f8197e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C0564a c0564a = (C0564a) ((Drawable) this.f2513e.f490b);
        if (colorStateList == null) {
            c0564a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c0564a.h = colorStateList;
        c0564a.f8194b.setColor(colorStateList.getColorForState(c0564a.getState(), c0564a.h.getDefaultColor()));
        c0564a.invalidateSelf();
    }
}
