package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    public int f3768a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3769b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0238q0 f3770c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3771d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3772e;

    /* renamed from: f, reason: collision with root package name */
    public View f3773f;

    /* renamed from: g, reason: collision with root package name */
    public final C0 f3774g;
    public boolean h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f3775j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f3776k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f3777l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3778m;

    /* renamed from: n, reason: collision with root package name */
    public float f3779n;

    /* renamed from: o, reason: collision with root package name */
    public int f3780o;
    public int p;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, androidx.recyclerview.widget.C0] */
    public X(Context context) {
        ?? obj = new Object();
        obj.f3494d = -1;
        obj.f3496f = false;
        obj.f3497g = 0;
        obj.f3491a = 0;
        obj.f3492b = 0;
        obj.f3493c = IntCompanionObject.MIN_VALUE;
        obj.f3495e = null;
        this.f3774g = obj;
        this.i = new LinearInterpolator();
        this.f3775j = new DecelerateInterpolator();
        this.f3778m = false;
        this.f3780o = 0;
        this.p = 0;
        this.f3777l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i4, int i5, int i6, int i7) {
        if (i7 == -1) {
            return i5 - i;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                return i6 - i4;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i8 = i5 - i;
        if (i8 > 0) {
            return i8;
        }
        int i9 = i6 - i4;
        if (i9 < 0) {
            return i9;
        }
        return 0;
    }

    public int b(View view, int i) {
        AbstractC0238q0 abstractC0238q0 = this.f3770c;
        if (abstractC0238q0 == null || !abstractC0238q0.d()) {
            return 0;
        }
        C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
        return a(AbstractC0238q0.A(view) - ((ViewGroup.MarginLayoutParams) c0239r0).leftMargin, AbstractC0238q0.D(view) + ((ViewGroup.MarginLayoutParams) c0239r0).rightMargin, abstractC0238q0.I(), abstractC0238q0.f3894n - abstractC0238q0.J(), i);
    }

    public int c(View view, int i) {
        AbstractC0238q0 abstractC0238q0 = this.f3770c;
        if (abstractC0238q0 == null || !abstractC0238q0.e()) {
            return 0;
        }
        C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
        return a(AbstractC0238q0.E(view) - ((ViewGroup.MarginLayoutParams) c0239r0).topMargin, AbstractC0238q0.y(view) + ((ViewGroup.MarginLayoutParams) c0239r0).bottomMargin, abstractC0238q0.K(), abstractC0238q0.f3895o - abstractC0238q0.H(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f3778m) {
            this.f3779n = d(this.f3777l);
            this.f3778m = true;
        }
        return (int) Math.ceil(abs * this.f3779n);
    }

    public PointF f(int i) {
        Object obj = this.f3770c;
        if (obj instanceof D0) {
            return ((D0) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + D0.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i4) {
        PointF f2;
        RecyclerView recyclerView = this.f3769b;
        if (this.f3768a == -1 || recyclerView == null) {
            i();
        }
        if (this.f3771d && this.f3773f == null && this.f3770c != null && (f2 = f(this.f3768a)) != null) {
            float f4 = f2.x;
            if (f4 != BitmapDescriptorFactory.HUE_RED || f2.y != BitmapDescriptorFactory.HUE_RED) {
                recyclerView.i0(null, (int) Math.signum(f4), (int) Math.signum(f2.y));
            }
        }
        this.f3771d = false;
        View view = this.f3773f;
        C0 c02 = this.f3774g;
        if (view != null) {
            this.f3769b.getClass();
            I0 N3 = RecyclerView.N(view);
            if ((N3 != null ? N3.getLayoutPosition() : -1) == this.f3768a) {
                View view2 = this.f3773f;
                E0 e02 = recyclerView.f3686h0;
                h(view2, c02);
                c02.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f3773f = null;
            }
        }
        if (this.f3772e) {
            E0 e03 = recyclerView.f3686h0;
            if (this.f3769b.f3696n.v() == 0) {
                i();
            } else {
                int i5 = this.f3780o;
                int i6 = i5 - i;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f3780o = i6;
                int i7 = this.p;
                int i8 = i7 - i4;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.p = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF f5 = f(this.f3768a);
                    if (f5 != null) {
                        if (f5.x != BitmapDescriptorFactory.HUE_RED || f5.y != BitmapDescriptorFactory.HUE_RED) {
                            float f6 = f5.y;
                            float sqrt = (float) Math.sqrt((f6 * f6) + (r10 * r10));
                            float f7 = f5.x / sqrt;
                            f5.x = f7;
                            float f8 = f5.y / sqrt;
                            f5.y = f8;
                            this.f3776k = f5;
                            this.f3780o = (int) (f7 * 10000.0f);
                            this.p = (int) (f8 * 10000.0f);
                            int e4 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            c02.f3491a = (int) (this.f3780o * 1.2f);
                            c02.f3492b = (int) (this.p * 1.2f);
                            c02.f3493c = (int) (e4 * 1.2f);
                            c02.f3495e = linearInterpolator;
                            c02.f3496f = true;
                        }
                    }
                    c02.f3494d = this.f3768a;
                    i();
                }
            }
            boolean z3 = c02.f3494d >= 0;
            c02.a(recyclerView);
            if (z3 && this.f3772e) {
                this.f3771d = true;
                recyclerView.f3681e0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.view.View r7, androidx.recyclerview.widget.C0 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f3776k
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.f3776k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            int r7 = r6.c(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r6 = r6.f3775j
            r8.f3491a = r0
            r8.f3492b = r7
            r8.f3493c = r2
            r8.f3495e = r6
            r8.f3496f = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.X.h(android.view.View, androidx.recyclerview.widget.C0):void");
    }

    public final void i() {
        if (this.f3772e) {
            this.f3772e = false;
            this.p = 0;
            this.f3780o = 0;
            this.f3776k = null;
            this.f3769b.f3686h0.f3509a = -1;
            this.f3773f = null;
            this.f3768a = -1;
            this.f3771d = false;
            AbstractC0238q0 abstractC0238q0 = this.f3770c;
            if (abstractC0238q0.f3887e == this) {
                abstractC0238q0.f3887e = null;
            }
            this.f3770c = null;
            this.f3769b = null;
        }
    }
}
