package S1;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class o implements View.OnTouchListener, View.OnLayoutChangeListener {
    public final PhotoView h;
    public final GestureDetector i;

    /* renamed from: j, reason: collision with root package name */
    public final b f1566j;
    public View.OnClickListener p;

    /* renamed from: q, reason: collision with root package name */
    public View.OnLongClickListener f1572q;

    /* renamed from: r, reason: collision with root package name */
    public n f1573r;

    /* renamed from: w, reason: collision with root package name */
    public final A.a f1578w;

    /* renamed from: a, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f1559a = new AccelerateDecelerateInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public int f1560b = 200;

    /* renamed from: c, reason: collision with root package name */
    public float f1561c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f1562d = 1.75f;

    /* renamed from: e, reason: collision with root package name */
    public float f1563e = 3.0f;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1564f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1565g = false;

    /* renamed from: k, reason: collision with root package name */
    public final Matrix f1567k = new Matrix();

    /* renamed from: l, reason: collision with root package name */
    public final Matrix f1568l = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f1569m = new Matrix();

    /* renamed from: n, reason: collision with root package name */
    public final RectF f1570n = new RectF();

    /* renamed from: o, reason: collision with root package name */
    public final float[] f1571o = new float[9];

    /* renamed from: s, reason: collision with root package name */
    public int f1574s = 2;

    /* renamed from: t, reason: collision with root package name */
    public int f1575t = 2;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1576u = true;

    /* renamed from: v, reason: collision with root package name */
    public ImageView.ScaleType f1577v = ImageView.ScaleType.FIT_CENTER;

    public o(PhotoView photoView) {
        A.a aVar = new A.a(this, 15);
        this.f1578w = aVar;
        this.h = photoView;
        photoView.setOnTouchListener(this);
        photoView.addOnLayoutChangeListener(this);
        if (photoView.isInEditMode()) {
            return;
        }
        this.f1566j = new b(photoView.getContext(), aVar);
        GestureDetector gestureDetector = new GestureDetector(photoView.getContext(), new j(this));
        this.i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new k(this));
    }

    public final void a() {
        if (b()) {
            this.h.setImageMatrix(c());
        }
    }

    public final boolean b() {
        RectF rectF;
        float f2;
        float f4;
        float f5;
        float f6;
        float f7;
        Matrix c4 = c();
        Drawable drawable = this.h.getDrawable();
        float f8 = BitmapDescriptorFactory.HUE_RED;
        if (drawable != null) {
            rectF = this.f1570n;
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            c4.mapRect(rectF);
        } else {
            rectF = null;
        }
        if (rectF == null) {
            return false;
        }
        float height = rectF.height();
        float width = rectF.width();
        PhotoView photoView = this.h;
        float height2 = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        if (height <= height2) {
            int i = l.f1548a[this.f1577v.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f6 = (height2 - height) / 2.0f;
                    f7 = rectF.top;
                } else {
                    f6 = height2 - height;
                    f7 = rectF.top;
                }
                f2 = f6 - f7;
            } else {
                f2 = -rectF.top;
            }
            this.f1575t = 2;
        } else {
            float f9 = rectF.top;
            if (f9 > BitmapDescriptorFactory.HUE_RED) {
                this.f1575t = 0;
                f2 = -f9;
            } else {
                float f10 = rectF.bottom;
                if (f10 < height2) {
                    this.f1575t = 1;
                    f2 = height2 - f10;
                } else {
                    this.f1575t = -1;
                    f2 = 0.0f;
                }
            }
        }
        float width2 = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        if (width <= width2) {
            int i4 = l.f1548a[this.f1577v.ordinal()];
            if (i4 != 2) {
                if (i4 != 3) {
                    f4 = (width2 - width) / 2.0f;
                    f5 = rectF.left;
                } else {
                    f4 = width2 - width;
                    f5 = rectF.left;
                }
                f8 = f4 - f5;
            } else {
                f8 = -rectF.left;
            }
            this.f1574s = 2;
        } else {
            float f11 = rectF.left;
            if (f11 > BitmapDescriptorFactory.HUE_RED) {
                this.f1574s = 0;
                f8 = -f11;
            } else {
                float f12 = rectF.right;
                if (f12 < width2) {
                    f8 = width2 - f12;
                    this.f1574s = 1;
                } else {
                    this.f1574s = -1;
                }
            }
        }
        this.f1569m.postTranslate(f8, f2);
        return true;
    }

    public final Matrix c() {
        Matrix matrix = this.f1568l;
        matrix.set(this.f1567k);
        matrix.postConcat(this.f1569m);
        return matrix;
    }

    public final float d() {
        Matrix matrix = this.f1569m;
        float[] fArr = this.f1571o;
        matrix.getValues(fArr);
        float pow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(pow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void e(float f2, float f4, float f5, boolean z3) {
        if (f2 < this.f1561c || f2 > this.f1563e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z3) {
            this.h.post(new m(this, d(), f2, f4, f5));
        } else {
            this.f1569m.setScale(f2, f2, f4, f5);
            a();
        }
    }

    public final void f() {
        if (this.f1576u) {
            g(this.h.getDrawable());
            return;
        }
        Matrix matrix = this.f1569m;
        matrix.reset();
        matrix.postRotate(BitmapDescriptorFactory.HUE_RED);
        a();
        this.h.setImageMatrix(c());
        b();
    }

    public final void g(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        PhotoView photoView = this.h;
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f1567k;
        matrix.reset();
        float f2 = intrinsicWidth;
        float f4 = width / f2;
        float f5 = intrinsicHeight;
        float f6 = height / f5;
        ImageView.ScaleType scaleType = this.f1577v;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f2) / 2.0f, (height - f5) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f4, f6);
            matrix.postScale(max, max);
            matrix.postTranslate((width - (f2 * max)) / 2.0f, (height - (f5 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f4, f6));
            matrix.postScale(min, min);
            matrix.postTranslate((width - (f2 * min)) / 2.0f, (height - (f5 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, f5);
            RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            if (((int) BitmapDescriptorFactory.HUE_RED) % 180 != 0) {
                rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, f2);
            }
            int i = l.f1548a[this.f1577v.ordinal()];
            if (i == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.f1569m;
        matrix2.reset();
        matrix2.postRotate(BitmapDescriptorFactory.HUE_RED);
        a();
        this.h.setImageMatrix(c());
        b();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (i == i7 && i4 == i8 && i5 == i9 && i6 == i10) {
            return;
        }
        g(this.h.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.o.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
