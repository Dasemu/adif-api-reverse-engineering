package E2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.BitSet;
import java.util.Objects;
import v2.AbstractC0641a;
import v2.AbstractC0642b;
import w2.C0651a;

/* loaded from: classes3.dex */
public class g extends Drawable implements u {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f399u = 0;

    /* renamed from: a, reason: collision with root package name */
    public f f400a;

    /* renamed from: b, reason: collision with root package name */
    public final s[] f401b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f402c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f403d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f404e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f405f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f406g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f407j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f408k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f409l;

    /* renamed from: m, reason: collision with root package name */
    public k f410m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f411n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f412o;
    public final A.a p;

    /* renamed from: q, reason: collision with root package name */
    public final m f413q;

    /* renamed from: r, reason: collision with root package name */
    public PorterDuffColorFilter f414r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f415s;

    /* renamed from: t, reason: collision with root package name */
    public final RectF f416t;

    static {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void b(RectF rectF, Path path) {
        f fVar = this.f400a;
        this.f413q.a(fVar.f386a, fVar.i, rectF, this.p, path);
        if (this.f400a.h != 1.0f) {
            Matrix matrix = this.f405f;
            matrix.reset();
            float f2 = this.f400a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f416t, true);
    }

    public final int c(int i) {
        f fVar = this.f400a;
        float f2 = fVar.f396m + BitmapDescriptorFactory.HUE_RED + fVar.f395l;
        C0651a c0651a = fVar.f387b;
        return c0651a != null ? c0651a.a(i, f2) : i;
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f433f.a(rectF) * this.f400a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f411n;
        paint.setColorFilter(this.f414r);
        int alpha = paint.getAlpha();
        int i = this.f400a.f394k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f412o;
        paint2.setColorFilter(this.f415s);
        paint2.setStrokeWidth(this.f400a.f393j);
        int alpha2 = paint2.getAlpha();
        int i4 = this.f400a.f394k;
        paint2.setAlpha(((i4 + (i4 >>> 7)) * alpha2) >>> 8);
        boolean z3 = this.f404e;
        Path path = this.f406g;
        if (z3) {
            boolean g4 = g();
            float f2 = BitmapDescriptorFactory.HUE_RED;
            float f4 = -(g4 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f400a.f386a;
            j e4 = kVar.e();
            c cVar = kVar.f432e;
            if (!(cVar instanceof h)) {
                cVar = new b(f4, cVar);
            }
            e4.f422e = cVar;
            c cVar2 = kVar.f433f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f4, cVar2);
            }
            e4.f423f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f4, cVar3);
            }
            e4.h = cVar3;
            c cVar4 = kVar.f434g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f4, cVar4);
            }
            e4.f424g = cVar4;
            k a2 = e4.a();
            this.f410m = a2;
            float f5 = this.f400a.i;
            RectF rectF = this.f407j;
            rectF.set(f());
            if (g()) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f2, f2);
            this.f413q.a(a2, f5, rectF, null, this.h);
            b(f(), path);
            this.f404e = false;
        }
        f fVar = this.f400a;
        fVar.getClass();
        if (fVar.f397n > 0 && !this.f400a.f386a.d(f())) {
            path.isConvex();
        }
        f fVar2 = this.f400a;
        Paint.Style style = fVar2.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f386a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f412o;
        Path path = this.h;
        k kVar = this.f410m;
        RectF rectF = this.f407j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : BitmapDescriptorFactory.HUE_RED;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f400a.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f412o.getStrokeWidth() > BitmapDescriptorFactory.HUE_RED;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f400a.f394k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f400a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f400a.getClass();
        if (this.f400a.f386a.d(f())) {
            outline.setRoundRect(getBounds(), this.f400a.f386a.f432e.a(f()) * this.f400a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f406g;
        b(f2, path);
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0642b.a(outline, path);
        } else {
            try {
                AbstractC0641a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f400a.f392g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f408k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f406g;
        b(f2, path);
        Region region2 = this.f409l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f400a.f387b = new C0651a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f400a;
        if (fVar.f396m != f2) {
            fVar.f396m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f404e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f400a.f390e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f400a.getClass();
        ColorStateList colorStateList2 = this.f400a.f389d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f400a.f388c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f400a;
        if (fVar.f388c != colorStateList) {
            fVar.f388c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z3;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f400a.f388c == null || color2 == (colorForState2 = this.f400a.f388c.getColorForState(iArr, (color2 = (paint2 = this.f411n).getColor())))) {
            z3 = false;
        } else {
            paint2.setColor(colorForState2);
            z3 = true;
        }
        if (this.f400a.f389d == null || color == (colorForState = this.f400a.f389d.getColorForState(iArr, (color = (paint = this.f412o).getColor())))) {
            return z3;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f414r;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f415s;
        f fVar = this.f400a;
        ColorStateList colorStateList = fVar.f390e;
        PorterDuff.Mode mode = fVar.f391f;
        Paint paint = this.f411n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int c4 = c(color);
            porterDuffColorFilter = c4 != color ? new PorterDuffColorFilter(c4, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f414r = porterDuffColorFilter;
        this.f400a.getClass();
        this.f415s = null;
        this.f400a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f414r) && Objects.equals(porterDuffColorFilter3, this.f415s)) ? false : true;
    }

    public final void m() {
        f fVar = this.f400a;
        float f2 = fVar.f396m + BitmapDescriptorFactory.HUE_RED;
        fVar.f397n = (int) Math.ceil(0.75f * f2);
        this.f400a.f398o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f400a = new f(this.f400a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f404e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z3 = k(iArr) || l();
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f400a;
        if (fVar.f394k != i) {
            fVar.f394k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f400a.getClass();
        super.invalidateSelf();
    }

    @Override // E2.u
    public final void setShapeAppearanceModel(k kVar) {
        this.f400a.f386a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f400a.f390e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f400a;
        if (fVar.f391f != mode) {
            fVar.f391f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i4) {
        this(k.b(context, attributeSet, i, i4).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f401b = new s[4];
        this.f402c = new s[4];
        this.f403d = new BitSet(8);
        this.f405f = new Matrix();
        this.f406g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f407j = new RectF();
        this.f408k = new Region();
        this.f409l = new Region();
        Paint paint = new Paint(1);
        this.f411n = paint;
        Paint paint2 = new Paint(1);
        this.f412o = paint2;
        new D2.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f438a;
        } else {
            mVar = new m();
        }
        this.f413q = mVar;
        this.f416t = new RectF();
        this.f400a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.p = new A.a(this, 2);
    }
}
