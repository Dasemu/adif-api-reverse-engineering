package S1;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f1538a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f1539b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ScaleGestureDetector f1540c;

    /* renamed from: d, reason: collision with root package name */
    public VelocityTracker f1541d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1542e;

    /* renamed from: f, reason: collision with root package name */
    public float f1543f;

    /* renamed from: g, reason: collision with root package name */
    public float f1544g;
    public final float h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final A.a f1545j;

    public b(Context context, A.a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h = viewConfiguration.getScaledTouchSlop();
        this.f1545j = aVar;
        this.f1540c = new ScaleGestureDetector(context, new a(this));
    }

    public final void a(MotionEvent motionEvent) {
        float x3;
        float y3;
        float x4;
        float y4;
        RectF rectF;
        int i;
        int i4;
        int i5;
        int i6;
        float x5;
        float y5;
        int i7;
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0) {
            A.a aVar = this.f1545j;
            if (action == 1) {
                this.f1538a = -1;
                if (this.f1542e && this.f1541d != null) {
                    try {
                        x4 = motionEvent.getX(this.f1539b);
                    } catch (Exception unused) {
                        x4 = motionEvent.getX();
                    }
                    this.f1543f = x4;
                    try {
                        y4 = motionEvent.getY(this.f1539b);
                    } catch (Exception unused2) {
                        y4 = motionEvent.getY();
                    }
                    this.f1544g = y4;
                    this.f1541d.addMovement(motionEvent);
                    this.f1541d.computeCurrentVelocity(1000);
                    float xVelocity = this.f1541d.getXVelocity();
                    float yVelocity = this.f1541d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.i) {
                        o oVar = (o) aVar.f7b;
                        n nVar = new n(oVar, oVar.h.getContext());
                        oVar.f1573r = nVar;
                        PhotoView photoView = oVar.h;
                        int width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
                        int height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
                        int i8 = (int) (-xVelocity);
                        int i9 = (int) (-yVelocity);
                        oVar.b();
                        Matrix c4 = oVar.c();
                        if (oVar.h.getDrawable() != null) {
                            rectF = oVar.f1570n;
                            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, r12.getIntrinsicWidth(), r12.getIntrinsicHeight());
                            c4.mapRect(rectF);
                        } else {
                            rectF = null;
                        }
                        if (rectF != null) {
                            int round = Math.round(-rectF.left);
                            float f2 = width;
                            if (f2 < rectF.width()) {
                                i = Math.round(rectF.width() - f2);
                                i4 = 0;
                            } else {
                                i = round;
                                i4 = i;
                            }
                            int round2 = Math.round(-rectF.top);
                            float f4 = height;
                            if (f4 < rectF.height()) {
                                i5 = Math.round(rectF.height() - f4);
                                i6 = 0;
                            } else {
                                i5 = round2;
                                i6 = i5;
                            }
                            nVar.f1556b = round;
                            nVar.f1557c = round2;
                            if (round != i || round2 != i5) {
                                nVar.f1555a.fling(round, round2, i8, i9, i4, i, i6, i5, 0, 0);
                            }
                        }
                        photoView.post(oVar.f1573r);
                    }
                }
                VelocityTracker velocityTracker = this.f1541d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f1541d = null;
                }
            } else if (action == 2) {
                try {
                    x5 = motionEvent.getX(this.f1539b);
                } catch (Exception unused3) {
                    x5 = motionEvent.getX();
                }
                try {
                    y5 = motionEvent.getY(this.f1539b);
                } catch (Exception unused4) {
                    y5 = motionEvent.getY();
                }
                float f5 = x5 - this.f1543f;
                float f6 = y5 - this.f1544g;
                if (!this.f1542e) {
                    this.f1542e = Math.sqrt((double) ((f6 * f6) + (f5 * f5))) >= ((double) this.h);
                }
                if (this.f1542e) {
                    o oVar2 = (o) aVar.f7b;
                    if (!oVar2.f1566j.f1540c.isInProgress()) {
                        oVar2.f1569m.postTranslate(f5, f6);
                        oVar2.a();
                        ViewParent parent = oVar2.h.getParent();
                        if (oVar2.f1564f && !oVar2.f1566j.f1540c.isInProgress() && !oVar2.f1565g) {
                            int i10 = oVar2.f1574s;
                            if ((i10 == 2 || ((i10 == 0 && f5 >= 1.0f) || ((i10 == 1 && f5 <= -1.0f) || (((i7 = oVar2.f1575t) == 0 && f6 >= 1.0f) || (i7 == 1 && f6 <= -1.0f))))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f1543f = x5;
                    this.f1544g = y5;
                    VelocityTracker velocityTracker2 = this.f1541d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f1538a = -1;
                VelocityTracker velocityTracker3 = this.f1541d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1541d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f1538a) {
                    int i11 = action2 != 0 ? 0 : 1;
                    this.f1538a = motionEvent.getPointerId(i11);
                    this.f1543f = motionEvent.getX(i11);
                    this.f1544g = motionEvent.getY(i11);
                }
            }
        } else {
            this.f1538a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f1541d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x3 = motionEvent.getX(this.f1539b);
            } catch (Exception unused5) {
                x3 = motionEvent.getX();
            }
            this.f1543f = x3;
            try {
                y3 = motionEvent.getY(this.f1539b);
            } catch (Exception unused6) {
                y3 = motionEvent.getY();
            }
            this.f1544g = y3;
            this.f1542e = false;
        }
        int i12 = this.f1538a;
        this.f1539b = motionEvent.findPointerIndex(i12 != -1 ? i12 : 0);
    }
}
