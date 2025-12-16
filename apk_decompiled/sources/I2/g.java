package I2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class g extends E2.g {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f815w = 0;

    /* renamed from: v, reason: collision with root package name */
    public f f816v;

    @Override // E2.g
    public final void e(Canvas canvas) {
        if (this.f816v.f814q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f816v.f814q);
        super.e(canvas);
        canvas.restore();
    }

    @Override // E2.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f816v = new f(this.f816v);
        return this;
    }

    public final void n(float f2, float f4, float f5, float f6) {
        RectF rectF = this.f816v.f814q;
        if (f2 == rectF.left && f4 == rectF.top && f5 == rectF.right && f6 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f4, f5, f6);
        invalidateSelf();
    }
}
