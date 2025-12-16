package androidx.recyclerview.widget;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class H0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f3544a;

    /* renamed from: b, reason: collision with root package name */
    public int f3545b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f3546c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f3547d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3548e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3549f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3550g;

    public H0(RecyclerView recyclerView) {
        this.f3550g = recyclerView;
        J j4 = RecyclerView.f3648I0;
        this.f3547d = j4;
        this.f3548e = false;
        this.f3549f = false;
        this.f3546c = new OverScroller(recyclerView.getContext(), j4);
    }

    public final void a(int i, int i4) {
        RecyclerView recyclerView = this.f3550g;
        recyclerView.setScrollState(2);
        this.f3545b = 0;
        this.f3544a = 0;
        Interpolator interpolator = this.f3547d;
        J j4 = RecyclerView.f3648I0;
        if (interpolator != j4) {
            this.f3547d = j4;
            this.f3546c = new OverScroller(recyclerView.getContext(), j4);
        }
        this.f3546c.fling(0, 0, i, i4, IntCompanionObject.MIN_VALUE, Integer.MAX_VALUE, IntCompanionObject.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f3548e) {
            this.f3549f = true;
            return;
        }
        RecyclerView recyclerView = this.f3550g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = O.X.f1226a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i4, int i5, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.f3550g;
        if (i5 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i4);
            boolean z3 = abs > abs2;
            int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z3) {
                abs = abs2;
            }
            i5 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i6 = i5;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f3648I0;
        }
        if (this.f3547d != interpolator) {
            this.f3547d = interpolator;
            this.f3546c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3545b = 0;
        this.f3544a = 0;
        recyclerView.setScrollState(2);
        this.f3546c.startScroll(0, 0, i, i4, i6);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f3550g;
        if (recyclerView.f3696n == null) {
            recyclerView.removeCallbacks(this);
            this.f3546c.abortAnimation();
            return;
        }
        this.f3549f = false;
        this.f3548e = true;
        recyclerView.q();
        OverScroller overScroller = this.f3546c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f3544a;
            int i6 = currY - this.f3545b;
            this.f3544a = currX;
            this.f3545b = currY;
            int p = RecyclerView.p(i5, recyclerView.f3658I, recyclerView.f3659K, recyclerView.getWidth());
            int p3 = RecyclerView.p(i6, recyclerView.J, recyclerView.f3660L, recyclerView.getHeight());
            int[] iArr = recyclerView.f3708t0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean w3 = recyclerView.w(iArr, null, p, p3, 1);
            int[] iArr2 = recyclerView.f3708t0;
            if (w3) {
                p -= iArr2[0];
                p3 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(p, p3);
            }
            if (recyclerView.f3694m != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.i0(iArr2, p, p3);
                i = iArr2[0];
                i4 = iArr2[1];
                p -= i;
                p3 -= i4;
                X x3 = recyclerView.f3696n.f3887e;
                if (x3 != null && !x3.f3771d && x3.f3772e) {
                    int b4 = recyclerView.f3686h0.b();
                    if (b4 == 0) {
                        x3.i();
                    } else if (x3.f3768a >= b4) {
                        x3.f3768a = b4 - 1;
                        x3.g(i, i4);
                    } else {
                        x3.g(i, i4);
                    }
                }
            } else {
                i = 0;
                i4 = 0;
            }
            if (!recyclerView.p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f3708t0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.x(i, i4, p, p3, null, 1, iArr3);
            int i7 = p - iArr2[0];
            int i8 = p3 - iArr2[1];
            if (i != 0 || i4 != 0) {
                recyclerView.y(i, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i7 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i8 != 0));
            X x4 = recyclerView.f3696n.f3887e;
            if ((x4 == null || !x4.f3771d) && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i9 = i7 < 0 ? -currVelocity : i7 > 0 ? currVelocity : 0;
                    if (i8 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i8 <= 0) {
                        currVelocity = 0;
                    }
                    if (i9 < 0) {
                        recyclerView.A();
                        if (recyclerView.f3658I.isFinished()) {
                            recyclerView.f3658I.onAbsorb(-i9);
                        }
                    } else if (i9 > 0) {
                        recyclerView.B();
                        if (recyclerView.f3659K.isFinished()) {
                            recyclerView.f3659K.onAbsorb(i9);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.C();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.z();
                        if (recyclerView.f3660L.isFinished()) {
                            recyclerView.f3660L.onAbsorb(currVelocity);
                        }
                    }
                    if (i9 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = O.X.f1226a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f3646G0) {
                    Z2.y yVar = recyclerView.f3685g0;
                    int[] iArr4 = (int[]) yVar.f2314d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    yVar.f2313c = 0;
                }
            } else {
                b();
                E e4 = recyclerView.f3683f0;
                if (e4 != null) {
                    e4.a(recyclerView, i, i4);
                }
            }
        }
        X x5 = recyclerView.f3696n.f3887e;
        if (x5 != null && x5.f3771d) {
            x5.g(0, 0);
        }
        this.f3548e = false;
        if (!this.f3549f) {
            recyclerView.setScrollState(0);
            recyclerView.p0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = O.X.f1226a;
            recyclerView.postOnAnimation(this);
        }
    }
}
