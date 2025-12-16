package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: m.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471k0 extends Drawable implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f7674a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7675b;

    public final void a(Canvas canvas) {
        this.f7674a.draw(canvas);
    }

    public final void b(float f2, float f4) {
        H.a.e(this.f7674a, f2, f4);
    }

    public final void c(int i, int i4, int i5, int i6) {
        H.a.f(this.f7674a, i, i4, i5, i6);
    }

    public final boolean d(boolean z3, boolean z4) {
        return super.setVisible(z3, z4) || this.f7674a.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f7675b) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f7674a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f7674a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f7674a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f7674a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f7674a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f7674a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f7674a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f7674a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f7674a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f7674a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f7674a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f7674a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f7674a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f7674a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f7674a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f7674a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        this.f7674a.setAutoMirrored(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f7674a.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7674a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        this.f7674a.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z3) {
        this.f7674a.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f4) {
        if (this.f7675b) {
            b(f2, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i4, int i5, int i6) {
        if (this.f7675b) {
            c(i, i4, i5, i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f7675b) {
            return this.f7674a.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        H.a.g(this.f7674a, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        H.a.h(this.f7674a, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        H.a.i(this.f7674a, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        if (this.f7675b) {
            return d(z3, z4);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
