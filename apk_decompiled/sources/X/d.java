package X;

import O.X;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.WeakHashMap;
import m3.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: v, reason: collision with root package name */
    public static final F0.b f1990v = new F0.b(1);

    /* renamed from: a, reason: collision with root package name */
    public int f1991a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1992b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f1994d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1995e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1996f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f1997g;
    public int[] h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1998j;

    /* renamed from: k, reason: collision with root package name */
    public int f1999k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f2000l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2001m;

    /* renamed from: n, reason: collision with root package name */
    public final float f2002n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2003o;
    public final OverScroller p;

    /* renamed from: q, reason: collision with root package name */
    public final l f2004q;

    /* renamed from: r, reason: collision with root package name */
    public View f2005r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2006s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f2007t;

    /* renamed from: c, reason: collision with root package name */
    public int f1993c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final F0.c f2008u = new F0.c(this, 4);

    public d(Context context, CoordinatorLayout coordinatorLayout, l lVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2007t = coordinatorLayout;
        this.f2004q = lVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2003o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1992b = viewConfiguration.getScaledTouchSlop();
        this.f2001m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2002n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p = new OverScroller(context, f1990v);
    }

    public final void a() {
        this.f1993c = -1;
        float[] fArr = this.f1994d;
        if (fArr != null) {
            Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f1995e, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f1996f, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f1997g, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f1998j, 0);
            this.f1999k = 0;
        }
        VelocityTracker velocityTracker = this.f2000l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2000l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f2007t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f2005r = view;
        this.f1993c = i;
        this.f2004q.N(view, i);
        n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            m3.l r1 = r3.f2004q
            int r4 = r1.C(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.D()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r3 = r3.f1992b
            int r3 = r3 * r3
            float r3 = (float) r3
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r3 = r3.f1992b
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r3 = r3.f1992b
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.d.c(android.view.View, float, float):boolean");
    }

    public final void d(int i) {
        float[] fArr = this.f1994d;
        if (fArr != null) {
            int i4 = this.f1999k;
            int i5 = 1 << i;
            if ((i4 & i5) != 0) {
                fArr[i] = 0.0f;
                this.f1995e[i] = 0.0f;
                this.f1996f[i] = 0.0f;
                this.f1997g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.f1998j[i] = 0;
                this.f1999k = (~i5) & i4;
            }
        }
    }

    public final int e(int i, int i4, int i5) {
        if (i == 0) {
            return 0;
        }
        float width = this.f2007t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i4);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i5) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f1991a == 2) {
            OverScroller overScroller = this.p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f2005r.getLeft();
            int top = currY - this.f2005r.getTop();
            if (left != 0) {
                View view = this.f2005r;
                WeakHashMap weakHashMap = X.f1226a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f2005r;
                WeakHashMap weakHashMap2 = X.f1226a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f2004q.P(this.f2005r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f2007t.post(this.f2008u);
            }
        }
        return this.f1991a == 2;
    }

    public final View g(int i, int i4) {
        CoordinatorLayout coordinatorLayout = this.f2007t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f2004q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i4, int i5, int i6) {
        float f2;
        float f4;
        float f5;
        float f6;
        int left = this.f2005r.getLeft();
        int top = this.f2005r.getTop();
        int i7 = i - left;
        int i8 = i4 - top;
        OverScroller overScroller = this.p;
        if (i7 == 0 && i8 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f2005r;
        int i9 = (int) this.f2002n;
        int i10 = (int) this.f2001m;
        int abs = Math.abs(i5);
        if (abs < i9) {
            i5 = 0;
        } else if (abs > i10) {
            i5 = i5 > 0 ? i10 : -i10;
        }
        int abs2 = Math.abs(i6);
        if (abs2 < i9) {
            i6 = 0;
        } else if (abs2 > i10) {
            i6 = i6 > 0 ? i10 : -i10;
        }
        int abs3 = Math.abs(i7);
        int abs4 = Math.abs(i8);
        int abs5 = Math.abs(i5);
        int abs6 = Math.abs(i6);
        int i11 = abs5 + abs6;
        int i12 = abs3 + abs4;
        if (i5 != 0) {
            f2 = abs5;
            f4 = i11;
        } else {
            f2 = abs3;
            f4 = i12;
        }
        float f7 = f2 / f4;
        if (i6 != 0) {
            f5 = abs6;
            f6 = i11;
        } else {
            f5 = abs4;
            f6 = i12;
        }
        float f8 = f5 / f6;
        l lVar = this.f2004q;
        overScroller.startScroll(left, top, i7, i8, (int) ((e(i8, i6, lVar.D()) * f8) + (e(i7, i5, lVar.C(view)) * f7)));
        n(2);
        return true;
    }

    public final boolean i(int i) {
        if ((this.f1999k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2000l == null) {
            this.f2000l = VelocityTracker.obtain();
        }
        this.f2000l.addMovement(motionEvent);
        int i4 = 0;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g4 = g((int) x3, (int) y3);
            l(x3, y3, pointerId);
            q(g4, pointerId);
            int i5 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f1991a == 1) {
                k();
            }
            a();
            return;
        }
        l lVar = this.f2004q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f1991a == 1) {
                    this.f2006s = true;
                    lVar.Q(this.f2005r, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    this.f2006s = false;
                    if (this.f1991a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                l(x4, y4, pointerId2);
                if (this.f1991a == 0) {
                    q(g((int) x4, (int) y4), pointerId2);
                    int i6 = this.h[pointerId2];
                    return;
                }
                int i7 = (int) x4;
                int i8 = (int) y4;
                View view = this.f2005r;
                if (view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom()) {
                    q(this.f2005r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f1991a == 1 && pointerId3 == this.f1993c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i4 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i4);
                    if (pointerId4 != this.f1993c) {
                        View g5 = g((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                        View view2 = this.f2005r;
                        if (g5 == view2 && q(view2, pointerId4)) {
                            i = this.f1993c;
                            break;
                        }
                    }
                    i4++;
                }
                if (i == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f1991a == 1) {
            if (i(this.f1993c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1993c);
                float x5 = motionEvent.getX(findPointerIndex);
                float y5 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f1996f;
                int i9 = this.f1993c;
                int i10 = (int) (x5 - fArr[i9]);
                int i11 = (int) (y5 - this.f1997g[i9]);
                int left = this.f2005r.getLeft() + i10;
                int top = this.f2005r.getTop() + i11;
                int left2 = this.f2005r.getLeft();
                int top2 = this.f2005r.getTop();
                if (i10 != 0) {
                    left = lVar.j(this.f2005r, left);
                    WeakHashMap weakHashMap = X.f1226a;
                    this.f2005r.offsetLeftAndRight(left - left2);
                }
                if (i11 != 0) {
                    top = lVar.k(this.f2005r, top);
                    WeakHashMap weakHashMap2 = X.f1226a;
                    this.f2005r.offsetTopAndBottom(top - top2);
                }
                if (i10 != 0 || i11 != 0) {
                    lVar.P(this.f2005r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i4 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i4);
            if (i(pointerId5)) {
                float x6 = motionEvent.getX(i4);
                float y6 = motionEvent.getY(i4);
                float f2 = x6 - this.f1994d[pointerId5];
                float f4 = y6 - this.f1995e[pointerId5];
                Math.abs(f2);
                Math.abs(f4);
                int i12 = this.h[pointerId5];
                Math.abs(f4);
                Math.abs(f2);
                int i13 = this.h[pointerId5];
                Math.abs(f2);
                Math.abs(f4);
                int i14 = this.h[pointerId5];
                Math.abs(f4);
                Math.abs(f2);
                int i15 = this.h[pointerId5];
                if (this.f1991a != 1) {
                    View g6 = g((int) x6, (int) y6);
                    if (c(g6, f2, f4) && q(g6, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i4++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f2000l;
        float f2 = this.f2001m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f2000l.getXVelocity(this.f1993c);
        float f4 = this.f2002n;
        float abs = Math.abs(xVelocity);
        if (abs < f4) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > BitmapDescriptorFactory.HUE_RED ? f2 : -f2;
        }
        float yVelocity = this.f2000l.getYVelocity(this.f1993c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f4) {
            f2 = 0.0f;
        } else if (abs2 <= f2) {
            f2 = yVelocity;
        } else if (yVelocity <= BitmapDescriptorFactory.HUE_RED) {
            f2 = -f2;
        }
        this.f2006s = true;
        this.f2004q.Q(this.f2005r, xVelocity, f2);
        this.f2006s = false;
        if (this.f1991a == 1) {
            n(0);
        }
    }

    public final void l(float f2, float f4, int i) {
        float[] fArr = this.f1994d;
        if (fArr == null || fArr.length <= i) {
            int i4 = i + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1995e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1996f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1997g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1998j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1994d = fArr2;
            this.f1995e = fArr3;
            this.f1996f = fArr4;
            this.f1997g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.f1998j = iArr3;
        }
        float[] fArr9 = this.f1994d;
        this.f1996f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f1995e;
        this.f1997g[i] = f4;
        fArr10[i] = f4;
        int[] iArr7 = this.h;
        int i5 = (int) f2;
        int i6 = (int) f4;
        CoordinatorLayout coordinatorLayout = this.f2007t;
        int left = coordinatorLayout.getLeft();
        int i7 = this.f2003o;
        int i8 = i5 < left + i7 ? 1 : 0;
        if (i6 < coordinatorLayout.getTop() + i7) {
            i8 |= 4;
        }
        if (i5 > coordinatorLayout.getRight() - i7) {
            i8 |= 2;
        }
        if (i6 > coordinatorLayout.getBottom() - i7) {
            i8 |= 8;
        }
        iArr7[i] = i8;
        this.f1999k |= 1 << i;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x3 = motionEvent.getX(i);
                float y3 = motionEvent.getY(i);
                this.f1996f[pointerId] = x3;
                this.f1997g[pointerId] = y3;
            }
        }
    }

    public final void n(int i) {
        this.f2007t.removeCallbacks(this.f2008u);
        if (this.f1991a != i) {
            this.f1991a = i;
            this.f2004q.O(i);
            if (this.f1991a == 0) {
                this.f2005r = null;
            }
        }
    }

    public final boolean o(int i, int i4) {
        if (this.f2006s) {
            return h(i, i4, (int) this.f2000l.getXVelocity(this.f1993c), (int) this.f2000l.getYVelocity(this.f1993c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.d.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i) {
        if (view == this.f2005r && this.f1993c == i) {
            return true;
        }
        if (view == null || !this.f2004q.b0(view, i)) {
            return false;
        }
        this.f1993c = i;
        b(view, i);
        return true;
    }
}
