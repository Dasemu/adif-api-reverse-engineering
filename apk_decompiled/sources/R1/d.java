package R1;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final H2.b f1435a = new H2.b(this, 2);

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1436b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1437c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f1438d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f1439e;

    /* renamed from: f, reason: collision with root package name */
    public c f1440f;

    public d() {
        Paint paint = new Paint();
        this.f1436b = paint;
        this.f1437c = new Rect();
        this.f1438d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        c cVar;
        ValueAnimator valueAnimator = this.f1439e;
        if (valueAnimator == null || valueAnimator.isStarted() || (cVar = this.f1440f) == null || !cVar.f1430o || getCallback() == null) {
            return;
        }
        this.f1439e.start();
    }

    public final void b() {
        c cVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (cVar = this.f1440f) == null) {
            return;
        }
        int i = cVar.f1424g;
        if (i <= 0) {
            i = Math.round(cVar.i * width);
        }
        c cVar2 = this.f1440f;
        int i4 = cVar2.h;
        if (i4 <= 0) {
            i4 = Math.round(cVar2.f1425j * height);
        }
        c cVar3 = this.f1440f;
        boolean z3 = true;
        if (cVar3.f1423f != 1) {
            int i5 = cVar3.f1420c;
            if (i5 != 1 && i5 != 3) {
                z3 = false;
            }
            if (z3) {
                i = 0;
            }
            if (!z3) {
                i4 = 0;
            }
            c cVar4 = this.f1440f;
            radialGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i4, cVar4.f1419b, cVar4.f1418a, Shader.TileMode.CLAMP);
        } else {
            float max = (float) (Math.max(i, i4) / Math.sqrt(2.0d));
            c cVar5 = this.f1440f;
            radialGradient = new RadialGradient(i / 2.0f, i4 / 2.0f, max, cVar5.f1419b, cVar5.f1418a, Shader.TileMode.CLAMP);
        }
        this.f1436b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float a2;
        float a4;
        if (this.f1440f != null) {
            Paint paint = this.f1436b;
            if (paint.getShader() == null) {
                return;
            }
            float tan = (float) Math.tan(Math.toRadians(this.f1440f.f1428m));
            Rect rect = this.f1437c;
            float width = (rect.width() * tan) + rect.height();
            float height = (tan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.f1439e;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f1440f.f1420c;
            if (i != 1) {
                if (i == 2) {
                    a4 = com.google.android.gms.measurement.internal.a.a(-height, height, animatedFraction, height);
                } else if (i != 3) {
                    float f4 = -height;
                    a4 = com.google.android.gms.measurement.internal.a.a(height, f4, animatedFraction, f4);
                } else {
                    a2 = com.google.android.gms.measurement.internal.a.a(-width, width, animatedFraction, width);
                }
                f2 = a4;
                a2 = 0.0f;
            } else {
                float f5 = -width;
                a2 = com.google.android.gms.measurement.internal.a.a(width, f5, animatedFraction, f5);
            }
            Matrix matrix = this.f1438d;
            matrix.reset();
            matrix.setRotate(this.f1440f.f1428m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f2, a2);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        c cVar = this.f1440f;
        if (cVar != null) {
            return (cVar.f1429n || cVar.p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1437c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
