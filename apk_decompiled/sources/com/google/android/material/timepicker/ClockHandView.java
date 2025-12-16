package com.google.android.material.timepicker;

import O.X;
import a.AbstractC0106b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.AbstractC0379a;
import i2.AbstractC0396a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import x2.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f5896a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5897b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5898c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5899d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5900e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f5901f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f5902g;
    public final int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5903j;

    /* renamed from: k, reason: collision with root package name */
    public double f5904k;

    /* renamed from: l, reason: collision with root package name */
    public int f5905l;

    /* renamed from: m, reason: collision with root package name */
    public int f5906m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f5896a = new ValueAnimator();
        this.f5898c = new ArrayList();
        Paint paint = new Paint();
        this.f5901f = paint;
        this.f5902g = new RectF();
        this.f5906m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0379a.f6761g, R.attr.materialClockStyle, 2132018378);
        AbstractC0106b.E(context, R.attr.motionDurationLong2, 200);
        AbstractC0106b.F(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0396a.f6816b);
        this.f5905l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f5899d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f5900e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(BitmapDescriptorFactory.HUE_RED);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = X.f1226a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        int i4 = this.f5905l;
        return i == 2 ? Math.round(i4 * 0.66f) : i4;
    }

    public final void b(float f2) {
        ValueAnimator valueAnimator = this.f5896a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f4 = f2 % 360.0f;
        this.i = f4;
        this.f5904k = Math.toRadians(f4 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a2 = a(this.f5906m);
        float cos = (((float) Math.cos(this.f5904k)) * a2) + width;
        float sin = (a2 * ((float) Math.sin(this.f5904k))) + height;
        float f5 = this.f5899d;
        this.f5902g.set(cos - f5, sin - f5, cos + f5, sin + f5);
        Iterator it = this.f5898c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f5894q - f4) > 0.001f) {
                clockFaceView.f5894q = f4;
                clockFaceView.j();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = width;
        float a2 = a(this.f5906m);
        float cos = (((float) Math.cos(this.f5904k)) * a2) + f2;
        float f4 = height;
        float sin = (a2 * ((float) Math.sin(this.f5904k))) + f4;
        Paint paint = this.f5901f;
        paint.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        canvas.drawCircle(cos, sin, this.f5899d, paint);
        double sin2 = Math.sin(this.f5904k);
        paint.setStrokeWidth(this.h);
        canvas.drawLine(f2, f4, width + ((int) (Math.cos(this.f5904k) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f2, f4, this.f5900e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        if (this.f5896a.isRunning()) {
            return;
        }
        b(this.i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        boolean z5 = false;
        if (actionMasked == 0) {
            this.f5903j = false;
            z3 = true;
            z4 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z4 = this.f5903j;
            if (this.f5897b) {
                this.f5906m = ((float) Math.hypot((double) (x3 - ((float) (getWidth() / 2))), (double) (y3 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + m.e(getContext(), 12) ? 2 : 1;
            }
            z3 = false;
        } else {
            z4 = false;
            z3 = false;
        }
        boolean z6 = this.f5903j;
        int degrees = (int) Math.toDegrees(Math.atan2(y3 - (getHeight() / 2), x3 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f2 = i;
        boolean z7 = this.i != f2;
        if (!z3 || !z7) {
            if (z7 || z4) {
                b(f2);
            }
            this.f5903j = z6 | z5;
            return true;
        }
        z5 = true;
        this.f5903j = z6 | z5;
        return true;
    }
}
