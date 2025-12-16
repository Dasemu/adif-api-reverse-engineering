package r;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f8193a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f8194b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f8195c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f8196d;

    /* renamed from: e, reason: collision with root package name */
    public float f8197e;
    public ColorStateList h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f8200j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8198f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8199g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f8201k = PorterDuff.Mode.SRC_IN;

    public C0564a(ColorStateList colorStateList, float f2) {
        this.f8193a = f2;
        Paint paint = new Paint(5);
        this.f8194b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
        this.f8195c = new RectF();
        this.f8196d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f8195c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f8196d;
        rect2.set(rect);
        if (this.f8198f) {
            rect2.inset((int) Math.ceil(b.a(this.f8197e, this.f8193a, this.f8199g)), (int) Math.ceil(b.b(this.f8197e, this.f8193a, this.f8199g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z3;
        Paint paint = this.f8194b;
        if (this.i == null || paint.getColorFilter() != null) {
            z3 = false;
        } else {
            paint.setColorFilter(this.i);
            z3 = true;
        }
        RectF rectF = this.f8195c;
        float f2 = this.f8193a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z3) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f8196d, this.f8193a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f8200j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f8194b;
        boolean z3 = colorForState != paint.getColor();
        if (z3) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f8200j;
        if (colorStateList2 == null || (mode = this.f8201k) == null) {
            return z3;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f8194b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8194b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f8200j = colorStateList;
        this.i = a(colorStateList, this.f8201k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f8201k = mode;
        this.i = a(this.f8200j, mode);
        invalidateSelf();
    }
}
