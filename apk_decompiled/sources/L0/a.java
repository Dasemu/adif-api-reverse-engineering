package L0;

import T0.g;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt___RangesKt;
import m3.d;
import r2.C0567a;

/* loaded from: classes.dex */
public final class a extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final g f1048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1049b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1050c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1051d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final int f1052e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1053f;

    /* renamed from: g, reason: collision with root package name */
    public long f1054g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1055j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f1056k;

    public a(Drawable drawable, Drawable drawable2, g gVar, int i, boolean z3) {
        this.f1048a = gVar;
        this.f1049b = i;
        this.f1050c = z3;
        this.f1052e = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f1053f = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.h = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f1055j = drawable != null ? drawable.mutate() : null;
        Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.f1056k = mutate;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable3 = this.f1055j;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (mutate == null) {
            return;
        }
        mutate.setCallback(this);
    }

    public final int a(Integer num, Integer num2) {
        if (num != null && num.intValue() == -1) {
            return -1;
        }
        if (num2 != null && num2.intValue() == -1) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    public final void b() {
        this.i = 2;
        this.f1055j = null;
        ArrayList arrayList = this.f1051d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ColorStateList colorStateList = ((C0567a) arrayList.get(i)).f8213b.f8227o;
            if (colorStateList != null) {
                H.a.h(this, colorStateList);
            }
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double k4 = d.k(intrinsicWidth, intrinsicHeight, width, height, this.f1048a);
        double d4 = 2;
        int roundToInt = MathKt.roundToInt((width - (intrinsicWidth * k4)) / d4);
        int roundToInt2 = MathKt.roundToInt((height - (k4 * intrinsicHeight)) / d4);
        drawable.setBounds(rect.left + roundToInt, rect.top + roundToInt2, rect.right - roundToInt, rect.bottom - roundToInt2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        double coerceIn;
        int save;
        Drawable drawable;
        int i = this.i;
        if (i == 0) {
            Drawable drawable2 = this.f1055j;
            if (drawable2 != null) {
                drawable2.setAlpha(this.h);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f1056k;
        if (i == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.h);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double uptimeMillis = (SystemClock.uptimeMillis() - this.f1054g) / this.f1049b;
        coerceIn = RangesKt___RangesKt.coerceIn(uptimeMillis, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d);
        int i4 = this.h;
        int i5 = (int) (coerceIn * i4);
        if (this.f1050c) {
            i4 -= i5;
        }
        boolean z3 = uptimeMillis >= 1.0d;
        if (!z3 && (drawable = this.f1055j) != null) {
            drawable.setAlpha(i4);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i5);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z3) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i = this.i;
        if (i == 0) {
            Drawable drawable = this.f1055j;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f1056k;
        if (i != 1) {
            if (i == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f1055j;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f1053f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f1052e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1055j;
        int i = this.i;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f1056k;
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1055j;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f1056k;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f1055j;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.f1056k;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1055j;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f1056k;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "Invalid alpha: ").toString());
        }
        this.h = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1055j;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f1056k;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f1055j;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f1056k;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f1055j;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f1056k;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1055j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f1056k;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1055j;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f1056k;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f1055j;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f1056k;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.i != 0) {
            return;
        }
        this.i = 1;
        this.f1054g = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f1051d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0567a) arrayList.get(i)).a(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f1055j;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f1056k;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.i != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
