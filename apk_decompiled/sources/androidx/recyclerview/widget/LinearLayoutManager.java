package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0238q0 implements D0 {

    /* renamed from: A, reason: collision with root package name */
    public final S f3564A;

    /* renamed from: B, reason: collision with root package name */
    public final T f3565B;

    /* renamed from: C, reason: collision with root package name */
    public final int f3566C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f3567D;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public U f3568q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC0208b0 f3569r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3570s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f3571t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3572u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3573v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f3574w;

    /* renamed from: x, reason: collision with root package name */
    public int f3575x;

    /* renamed from: y, reason: collision with root package name */
    public int f3576y;

    /* renamed from: z, reason: collision with root package name */
    public W f3577z;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, androidx.recyclerview.widget.T] */
    public LinearLayoutManager(int i) {
        this.p = 1;
        this.f3571t = false;
        this.f3572u = false;
        this.f3573v = false;
        this.f3574w = true;
        this.f3575x = -1;
        this.f3576y = IntCompanionObject.MIN_VALUE;
        this.f3577z = null;
        this.f3564A = new S();
        this.f3565B = new Object();
        this.f3566C = 2;
        this.f3567D = new int[2];
        j1(i);
        c(null);
        if (this.f3571t) {
            this.f3571t = false;
            t0();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean D0() {
        if (this.f3893m != 1073741824 && this.f3892l != 1073741824) {
            int v3 = v();
            for (int i = 0; i < v3; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public void F0(RecyclerView recyclerView, int i) {
        X x3 = new X(recyclerView.getContext());
        x3.f3768a = i;
        G0(x3);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public boolean H0() {
        return this.f3577z == null && this.f3570s == this.f3573v;
    }

    public void I0(E0 e02, int[] iArr) {
        int i;
        int l4 = e02.f3509a != -1 ? this.f3569r.l() : 0;
        if (this.f3568q.f3759f == -1) {
            i = 0;
        } else {
            i = l4;
            l4 = 0;
        }
        iArr[0] = l4;
        iArr[1] = i;
    }

    public void J0(E0 e02, U u3, Z2.y yVar) {
        int i = u3.f3757d;
        if (i < 0 || i >= e02.b()) {
            return;
        }
        yVar.b(i, Math.max(0, u3.f3760g));
    }

    public final int K0(E0 e02) {
        if (v() == 0) {
            return 0;
        }
        O0();
        AbstractC0208b0 abstractC0208b0 = this.f3569r;
        boolean z3 = !this.f3574w;
        return AbstractC0211d.c(e02, abstractC0208b0, R0(z3), Q0(z3), this, this.f3574w);
    }

    public final int L0(E0 e02) {
        if (v() == 0) {
            return 0;
        }
        O0();
        AbstractC0208b0 abstractC0208b0 = this.f3569r;
        boolean z3 = !this.f3574w;
        return AbstractC0211d.d(e02, abstractC0208b0, R0(z3), Q0(z3), this, this.f3574w, this.f3572u);
    }

    public final int M0(E0 e02) {
        if (v() == 0) {
            return 0;
        }
        O0();
        AbstractC0208b0 abstractC0208b0 = this.f3569r;
        boolean z3 = !this.f3574w;
        return AbstractC0211d.e(e02, abstractC0208b0, R0(z3), Q0(z3), this, this.f3574w);
    }

    public final int N0(int i) {
        if (i == 1) {
            return (this.p != 1 && b1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && b1()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.p == 0) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i == 33) {
            if (this.p == 1) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i == 66) {
            if (this.p == 0) {
                return 1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i == 130 && this.p == 1) {
            return 1;
        }
        return IntCompanionObject.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.U, java.lang.Object] */
    public final void O0() {
        if (this.f3568q == null) {
            ?? obj = new Object();
            obj.f3754a = true;
            obj.h = 0;
            obj.i = 0;
            obj.f3762k = null;
            this.f3568q = obj;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean P() {
        return true;
    }

    public final int P0(y0 y0Var, U u3, E0 e02, boolean z3) {
        int i;
        int i4 = u3.f3756c;
        int i5 = u3.f3760g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                u3.f3760g = i5 + i4;
            }
            e1(y0Var, u3);
        }
        int i6 = u3.f3756c + u3.h;
        while (true) {
            if ((!u3.f3763l && i6 <= 0) || (i = u3.f3757d) < 0 || i >= e02.b()) {
                break;
            }
            T t2 = this.f3565B;
            t2.f3750a = 0;
            t2.f3751b = false;
            t2.f3752c = false;
            t2.f3753d = false;
            c1(y0Var, e02, u3, t2);
            if (!t2.f3751b) {
                int i7 = u3.f3755b;
                int i8 = t2.f3750a;
                u3.f3755b = (u3.f3759f * i8) + i7;
                if (!t2.f3752c || u3.f3762k != null || !e02.f3515g) {
                    u3.f3756c -= i8;
                    i6 -= i8;
                }
                int i9 = u3.f3760g;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + i8;
                    u3.f3760g = i10;
                    int i11 = u3.f3756c;
                    if (i11 < 0) {
                        u3.f3760g = i10 + i11;
                    }
                    e1(y0Var, u3);
                }
                if (z3 && t2.f3753d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - u3.f3756c;
    }

    public final View Q0(boolean z3) {
        return this.f3572u ? V0(0, v(), z3, true) : V0(v() - 1, -1, z3, true);
    }

    public final View R0(boolean z3) {
        return this.f3572u ? V0(v() - 1, -1, z3, true) : V0(0, v(), z3, true);
    }

    public final int S0() {
        View V02 = V0(0, v(), false, true);
        if (V02 == null) {
            return -1;
        }
        return AbstractC0238q0.L(V02);
    }

    public final int T0() {
        View V02 = V0(v() - 1, -1, false, true);
        if (V02 == null) {
            return -1;
        }
        return AbstractC0238q0.L(V02);
    }

    public final View U0(int i, int i4) {
        int i5;
        int i6;
        O0();
        if (i4 <= i && i4 >= i) {
            return u(i);
        }
        if (this.f3569r.e(u(i)) < this.f3569r.k()) {
            i5 = 16644;
            i6 = 16388;
        } else {
            i5 = 4161;
            i6 = 4097;
        }
        return this.p == 0 ? this.f3885c.q(i, i4, i5, i6) : this.f3886d.q(i, i4, i5, i6);
    }

    public final View V0(int i, int i4, boolean z3, boolean z4) {
        O0();
        int i5 = z3 ? 24579 : 320;
        int i6 = z4 ? 320 : 0;
        return this.p == 0 ? this.f3885c.q(i, i4, i5, i6) : this.f3886d.q(i, i4, i5, i6);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void W(RecyclerView recyclerView) {
    }

    public View W0(y0 y0Var, E0 e02, boolean z3, boolean z4) {
        int i;
        int i4;
        int i5;
        O0();
        int v3 = v();
        if (z4) {
            i4 = v() - 1;
            i = -1;
            i5 = -1;
        } else {
            i = v3;
            i4 = 0;
            i5 = 1;
        }
        int b4 = e02.b();
        int k4 = this.f3569r.k();
        int g4 = this.f3569r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i4 != i) {
            View u3 = u(i4);
            int L3 = AbstractC0238q0.L(u3);
            int e4 = this.f3569r.e(u3);
            int b5 = this.f3569r.b(u3);
            if (L3 >= 0 && L3 < b4) {
                if (!((C0239r0) u3.getLayoutParams()).f3897a.isRemoved()) {
                    boolean z5 = b5 <= k4 && e4 < k4;
                    boolean z6 = e4 >= g4 && b5 > g4;
                    if (!z5 && !z6) {
                        return u3;
                    }
                    if (z3) {
                        if (!z6) {
                            if (view != null) {
                            }
                            view = u3;
                        }
                        view2 = u3;
                    } else {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = u3;
                        }
                        view2 = u3;
                    }
                } else if (view3 == null) {
                    view3 = u3;
                }
            }
            i4 += i5;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public View X(View view, int i, y0 y0Var, E0 e02) {
        int N02;
        g1();
        if (v() != 0 && (N02 = N0(i)) != Integer.MIN_VALUE) {
            O0();
            l1(N02, (int) (this.f3569r.l() * 0.33333334f), false, e02);
            U u3 = this.f3568q;
            u3.f3760g = IntCompanionObject.MIN_VALUE;
            u3.f3754a = false;
            P0(y0Var, u3, e02, true);
            View U02 = N02 == -1 ? this.f3572u ? U0(v() - 1, -1) : U0(0, v()) : this.f3572u ? U0(0, v()) : U0(v() - 1, -1);
            View a12 = N02 == -1 ? a1() : Z0();
            if (!a12.hasFocusable()) {
                return U02;
            }
            if (U02 != null) {
                return a12;
            }
        }
        return null;
    }

    public final int X0(int i, y0 y0Var, E0 e02, boolean z3) {
        int g4;
        int g5 = this.f3569r.g() - i;
        if (g5 <= 0) {
            return 0;
        }
        int i4 = -h1(-g5, y0Var, e02);
        int i5 = i + i4;
        if (!z3 || (g4 = this.f3569r.g() - i5) <= 0) {
            return i4;
        }
        this.f3569r.o(g4);
        return g4 + i4;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(S0());
            accessibilityEvent.setToIndex(T0());
        }
    }

    public final int Y0(int i, y0 y0Var, E0 e02, boolean z3) {
        int k4;
        int k5 = i - this.f3569r.k();
        if (k5 <= 0) {
            return 0;
        }
        int i4 = -h1(k5, y0Var, e02);
        int i5 = i + i4;
        if (!z3 || (k4 = i5 - this.f3569r.k()) <= 0) {
            return i4;
        }
        this.f3569r.o(-k4);
        return i4 - k4;
    }

    public final View Z0() {
        return u(this.f3572u ? 0 : v() - 1);
    }

    @Override // androidx.recyclerview.widget.D0
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i4 = (i < AbstractC0238q0.L(u(0))) != this.f3572u ? -1 : 1;
        return this.p == 0 ? new PointF(i4, BitmapDescriptorFactory.HUE_RED) : new PointF(BitmapDescriptorFactory.HUE_RED, i4);
    }

    public final View a1() {
        return u(this.f3572u ? v() - 1 : 0);
    }

    public final boolean b1() {
        return G() == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void c(String str) {
        if (this.f3577z == null) {
            super.c(str);
        }
    }

    public void c1(y0 y0Var, E0 e02, U u3, T t2) {
        int K3;
        int i;
        int i4;
        int i5;
        int i6;
        View b4 = u3.b(y0Var);
        if (b4 == null) {
            t2.f3751b = true;
            return;
        }
        C0239r0 c0239r0 = (C0239r0) b4.getLayoutParams();
        if (u3.f3762k == null) {
            if (this.f3572u == (u3.f3759f == -1)) {
                b(b4, -1, false);
            } else {
                b(b4, 0, false);
            }
        } else {
            if (this.f3572u == (u3.f3759f == -1)) {
                b(b4, -1, true);
            } else {
                b(b4, 0, true);
            }
        }
        C0239r0 c0239r02 = (C0239r0) b4.getLayoutParams();
        Rect P3 = this.f3884b.P(b4);
        int i7 = P3.left + P3.right;
        int i8 = P3.top + P3.bottom;
        int w3 = AbstractC0238q0.w(d(), this.f3894n, this.f3892l, J() + I() + ((ViewGroup.MarginLayoutParams) c0239r02).leftMargin + ((ViewGroup.MarginLayoutParams) c0239r02).rightMargin + i7, ((ViewGroup.MarginLayoutParams) c0239r02).width);
        int w4 = AbstractC0238q0.w(e(), this.f3895o, this.f3893m, H() + K() + ((ViewGroup.MarginLayoutParams) c0239r02).topMargin + ((ViewGroup.MarginLayoutParams) c0239r02).bottomMargin + i8, ((ViewGroup.MarginLayoutParams) c0239r02).height);
        if (C0(b4, w3, w4, c0239r02)) {
            b4.measure(w3, w4);
        }
        t2.f3750a = this.f3569r.c(b4);
        if (this.p == 1) {
            if (b1()) {
                i4 = this.f3894n - J();
                i6 = i4 - this.f3569r.d(b4);
            } else {
                int I3 = I();
                i4 = this.f3569r.d(b4) + I3;
                i6 = I3;
            }
            if (u3.f3759f == -1) {
                i5 = u3.f3755b;
                K3 = i5 - t2.f3750a;
            } else {
                K3 = u3.f3755b;
                i5 = t2.f3750a + K3;
            }
        } else {
            K3 = K();
            int d4 = this.f3569r.d(b4) + K3;
            if (u3.f3759f == -1) {
                i4 = u3.f3755b;
                i = i4 - t2.f3750a;
            } else {
                i = u3.f3755b;
                i4 = t2.f3750a + i;
            }
            int i9 = i;
            i5 = d4;
            i6 = i9;
        }
        AbstractC0238q0.R(b4, i6, K3, i4, i5);
        if (c0239r0.f3897a.isRemoved() || c0239r0.f3897a.isUpdated()) {
            t2.f3752c = true;
        }
        t2.f3753d = b4.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean d() {
        return this.p == 0;
    }

    public void d1(y0 y0Var, E0 e02, S s4, int i) {
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean e() {
        return this.p == 1;
    }

    public final void e1(y0 y0Var, U u3) {
        if (!u3.f3754a || u3.f3763l) {
            return;
        }
        int i = u3.f3760g;
        int i4 = u3.i;
        if (u3.f3759f == -1) {
            int v3 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f3569r.f() - i) + i4;
            if (this.f3572u) {
                for (int i5 = 0; i5 < v3; i5++) {
                    View u4 = u(i5);
                    if (this.f3569r.e(u4) < f2 || this.f3569r.n(u4) < f2) {
                        f1(y0Var, 0, i5);
                        return;
                    }
                }
                return;
            }
            int i6 = v3 - 1;
            for (int i7 = i6; i7 >= 0; i7--) {
                View u5 = u(i7);
                if (this.f3569r.e(u5) < f2 || this.f3569r.n(u5) < f2) {
                    f1(y0Var, i6, i7);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i8 = i - i4;
        int v4 = v();
        if (!this.f3572u) {
            for (int i9 = 0; i9 < v4; i9++) {
                View u6 = u(i9);
                if (this.f3569r.b(u6) > i8 || this.f3569r.m(u6) > i8) {
                    f1(y0Var, 0, i9);
                    return;
                }
            }
            return;
        }
        int i10 = v4 - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View u7 = u(i11);
            if (this.f3569r.b(u7) > i8 || this.f3569r.m(u7) > i8) {
                f1(y0Var, i10, i11);
                return;
            }
        }
    }

    public final void f1(y0 y0Var, int i, int i4) {
        if (i == i4) {
            return;
        }
        if (i4 <= i) {
            while (i > i4) {
                q0(i, y0Var);
                i--;
            }
        } else {
            for (int i5 = i4 - 1; i5 >= i; i5--) {
                q0(i5, y0Var);
            }
        }
    }

    public final void g1() {
        if (this.p == 1 || !b1()) {
            this.f3572u = this.f3571t;
        } else {
            this.f3572u = !this.f3571t;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void h(int i, int i4, E0 e02, Z2.y yVar) {
        if (this.p != 0) {
            i = i4;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        O0();
        l1(i > 0 ? 1 : -1, Math.abs(i), true, e02);
        J0(e02, this.f3568q, yVar);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public void h0(y0 y0Var, E0 e02) {
        View view;
        View view2;
        View W02;
        int i;
        int e4;
        int i4;
        int i5;
        List list;
        int i6;
        int i7;
        int X02;
        int i8;
        View q4;
        int e5;
        int i9;
        int i10;
        int i11 = -1;
        if (!(this.f3577z == null && this.f3575x == -1) && e02.b() == 0) {
            n0(y0Var);
            return;
        }
        W w3 = this.f3577z;
        if (w3 != null && (i10 = w3.f3765a) >= 0) {
            this.f3575x = i10;
        }
        O0();
        this.f3568q.f3754a = false;
        g1();
        RecyclerView recyclerView = this.f3884b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || this.f3883a.f3828c.contains(view)) {
            view = null;
        }
        S s4 = this.f3564A;
        if (!s4.f3725e || this.f3575x != -1 || this.f3577z != null) {
            s4.d();
            s4.f3724d = this.f3572u ^ this.f3573v;
            if (!e02.f3515g && (i = this.f3575x) != -1) {
                if (i < 0 || i >= e02.b()) {
                    this.f3575x = -1;
                    this.f3576y = IntCompanionObject.MIN_VALUE;
                } else {
                    int i12 = this.f3575x;
                    s4.f3722b = i12;
                    W w4 = this.f3577z;
                    if (w4 != null && w4.f3765a >= 0) {
                        boolean z3 = w4.f3767c;
                        s4.f3724d = z3;
                        if (z3) {
                            s4.f3723c = this.f3569r.g() - this.f3577z.f3766b;
                        } else {
                            s4.f3723c = this.f3569r.k() + this.f3577z.f3766b;
                        }
                    } else if (this.f3576y == Integer.MIN_VALUE) {
                        View q5 = q(i12);
                        if (q5 == null) {
                            if (v() > 0) {
                                s4.f3724d = (this.f3575x < AbstractC0238q0.L(u(0))) == this.f3572u;
                            }
                            s4.a();
                        } else if (this.f3569r.c(q5) > this.f3569r.l()) {
                            s4.a();
                        } else if (this.f3569r.e(q5) - this.f3569r.k() < 0) {
                            s4.f3723c = this.f3569r.k();
                            s4.f3724d = false;
                        } else if (this.f3569r.g() - this.f3569r.b(q5) < 0) {
                            s4.f3723c = this.f3569r.g();
                            s4.f3724d = true;
                        } else {
                            if (s4.f3724d) {
                                int b4 = this.f3569r.b(q5);
                                AbstractC0208b0 abstractC0208b0 = this.f3569r;
                                e4 = (Integer.MIN_VALUE == abstractC0208b0.f3793a ? 0 : abstractC0208b0.l() - abstractC0208b0.f3793a) + b4;
                            } else {
                                e4 = this.f3569r.e(q5);
                            }
                            s4.f3723c = e4;
                        }
                    } else {
                        boolean z4 = this.f3572u;
                        s4.f3724d = z4;
                        if (z4) {
                            s4.f3723c = this.f3569r.g() - this.f3576y;
                        } else {
                            s4.f3723c = this.f3569r.k() + this.f3576y;
                        }
                    }
                    s4.f3725e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f3884b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || this.f3883a.f3828c.contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    C0239r0 c0239r0 = (C0239r0) view2.getLayoutParams();
                    if (!c0239r0.f3897a.isRemoved() && c0239r0.f3897a.getLayoutPosition() >= 0 && c0239r0.f3897a.getLayoutPosition() < e02.b()) {
                        s4.c(view2, AbstractC0238q0.L(view2));
                        s4.f3725e = true;
                    }
                }
                boolean z5 = this.f3570s;
                boolean z6 = this.f3573v;
                if (z5 == z6 && (W02 = W0(y0Var, e02, s4.f3724d, z6)) != null) {
                    s4.b(W02, AbstractC0238q0.L(W02));
                    if (!e02.f3515g && H0()) {
                        int e6 = this.f3569r.e(W02);
                        int b5 = this.f3569r.b(W02);
                        int k4 = this.f3569r.k();
                        int g4 = this.f3569r.g();
                        boolean z7 = b5 <= k4 && e6 < k4;
                        boolean z8 = e6 >= g4 && b5 > g4;
                        if (z7 || z8) {
                            if (s4.f3724d) {
                                k4 = g4;
                            }
                            s4.f3723c = k4;
                        }
                    }
                    s4.f3725e = true;
                }
            }
            s4.a();
            s4.f3722b = this.f3573v ? e02.b() - 1 : 0;
            s4.f3725e = true;
        } else if (view != null && (this.f3569r.e(view) >= this.f3569r.g() || this.f3569r.b(view) <= this.f3569r.k())) {
            s4.c(view, AbstractC0238q0.L(view));
        }
        U u3 = this.f3568q;
        u3.f3759f = u3.f3761j >= 0 ? 1 : -1;
        int[] iArr = this.f3567D;
        iArr[0] = 0;
        iArr[1] = 0;
        I0(e02, iArr);
        int k5 = this.f3569r.k() + Math.max(0, iArr[0]);
        int h = this.f3569r.h() + Math.max(0, iArr[1]);
        if (e02.f3515g && (i8 = this.f3575x) != -1 && this.f3576y != Integer.MIN_VALUE && (q4 = q(i8)) != null) {
            if (this.f3572u) {
                i9 = this.f3569r.g() - this.f3569r.b(q4);
                e5 = this.f3576y;
            } else {
                e5 = this.f3569r.e(q4) - this.f3569r.k();
                i9 = this.f3576y;
            }
            int i13 = i9 - e5;
            if (i13 > 0) {
                k5 += i13;
            } else {
                h -= i13;
            }
        }
        if (!s4.f3724d ? !this.f3572u : this.f3572u) {
            i11 = 1;
        }
        d1(y0Var, e02, s4, i11);
        p(y0Var);
        this.f3568q.f3763l = this.f3569r.i() == 0 && this.f3569r.f() == 0;
        this.f3568q.getClass();
        this.f3568q.i = 0;
        if (s4.f3724d) {
            n1(s4.f3722b, s4.f3723c);
            U u4 = this.f3568q;
            u4.h = k5;
            P0(y0Var, u4, e02, false);
            U u5 = this.f3568q;
            i5 = u5.f3755b;
            int i14 = u5.f3757d;
            int i15 = u5.f3756c;
            if (i15 > 0) {
                h += i15;
            }
            m1(s4.f3722b, s4.f3723c);
            U u6 = this.f3568q;
            u6.h = h;
            u6.f3757d += u6.f3758e;
            P0(y0Var, u6, e02, false);
            U u7 = this.f3568q;
            i4 = u7.f3755b;
            int i16 = u7.f3756c;
            if (i16 > 0) {
                n1(i14, i5);
                U u8 = this.f3568q;
                u8.h = i16;
                P0(y0Var, u8, e02, false);
                i5 = this.f3568q.f3755b;
            }
        } else {
            m1(s4.f3722b, s4.f3723c);
            U u9 = this.f3568q;
            u9.h = h;
            P0(y0Var, u9, e02, false);
            U u10 = this.f3568q;
            i4 = u10.f3755b;
            int i17 = u10.f3757d;
            int i18 = u10.f3756c;
            if (i18 > 0) {
                k5 += i18;
            }
            n1(s4.f3722b, s4.f3723c);
            U u11 = this.f3568q;
            u11.h = k5;
            u11.f3757d += u11.f3758e;
            P0(y0Var, u11, e02, false);
            U u12 = this.f3568q;
            int i19 = u12.f3755b;
            int i20 = u12.f3756c;
            if (i20 > 0) {
                m1(i17, i4);
                U u13 = this.f3568q;
                u13.h = i20;
                P0(y0Var, u13, e02, false);
                i4 = this.f3568q.f3755b;
            }
            i5 = i19;
        }
        if (v() > 0) {
            if (this.f3572u ^ this.f3573v) {
                int X03 = X0(i4, y0Var, e02, true);
                i6 = i5 + X03;
                i7 = i4 + X03;
                X02 = Y0(i6, y0Var, e02, false);
            } else {
                int Y0 = Y0(i5, y0Var, e02, true);
                i6 = i5 + Y0;
                i7 = i4 + Y0;
                X02 = X0(i7, y0Var, e02, false);
            }
            i5 = i6 + X02;
            i4 = i7 + X02;
        }
        if (e02.f3517k && v() != 0 && !e02.f3515g && H0()) {
            List list2 = y0Var.f3939d;
            int size = list2.size();
            int L3 = AbstractC0238q0.L(u(0));
            int i21 = 0;
            int i22 = 0;
            for (int i23 = 0; i23 < size; i23++) {
                I0 i02 = (I0) list2.get(i23);
                if (!i02.isRemoved()) {
                    if ((i02.getLayoutPosition() < L3) != this.f3572u) {
                        i21 += this.f3569r.c(i02.itemView);
                    } else {
                        i22 += this.f3569r.c(i02.itemView);
                    }
                }
            }
            this.f3568q.f3762k = list2;
            if (i21 > 0) {
                n1(AbstractC0238q0.L(a1()), i5);
                U u14 = this.f3568q;
                u14.h = i21;
                u14.f3756c = 0;
                u14.a(null);
                P0(y0Var, this.f3568q, e02, false);
            }
            if (i22 > 0) {
                m1(AbstractC0238q0.L(Z0()), i4);
                U u15 = this.f3568q;
                u15.h = i22;
                u15.f3756c = 0;
                list = null;
                u15.a(null);
                P0(y0Var, this.f3568q, e02, false);
            } else {
                list = null;
            }
            this.f3568q.f3762k = list;
        }
        if (e02.f3515g) {
            s4.d();
        } else {
            AbstractC0208b0 abstractC0208b02 = this.f3569r;
            abstractC0208b02.f3793a = abstractC0208b02.l();
        }
        this.f3570s = this.f3573v;
    }

    public final int h1(int i, y0 y0Var, E0 e02) {
        if (v() != 0 && i != 0) {
            O0();
            this.f3568q.f3754a = true;
            int i4 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            l1(i4, abs, true, e02);
            U u3 = this.f3568q;
            int P02 = P0(y0Var, u3, e02, false) + u3.f3760g;
            if (P02 >= 0) {
                if (abs > P02) {
                    i = i4 * P02;
                }
                this.f3569r.o(-i);
                this.f3568q.f3761j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void i(int i, Z2.y yVar) {
        boolean z3;
        int i4;
        W w3 = this.f3577z;
        if (w3 == null || (i4 = w3.f3765a) < 0) {
            g1();
            z3 = this.f3572u;
            i4 = this.f3575x;
            if (i4 == -1) {
                i4 = z3 ? i - 1 : 0;
            }
        } else {
            z3 = w3.f3767c;
        }
        int i5 = z3 ? -1 : 1;
        for (int i6 = 0; i6 < this.f3566C && i4 >= 0 && i4 < i; i6++) {
            yVar.b(i4, 0);
            i4 += i5;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public void i0(E0 e02) {
        this.f3577z = null;
        this.f3575x = -1;
        this.f3576y = IntCompanionObject.MIN_VALUE;
        this.f3564A.d();
    }

    public final void i1(int i, int i4) {
        this.f3575x = i;
        this.f3576y = i4;
        W w3 = this.f3577z;
        if (w3 != null) {
            w3.f3765a = -1;
        }
        t0();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int j(E0 e02) {
        return K0(e02);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void j0(Parcelable parcelable) {
        if (parcelable instanceof W) {
            W w3 = (W) parcelable;
            this.f3577z = w3;
            if (this.f3575x != -1) {
                w3.f3765a = -1;
            }
            t0();
        }
    }

    public final void j1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.p || this.f3569r == null) {
            AbstractC0208b0 a2 = AbstractC0208b0.a(this, i);
            this.f3569r = a2;
            this.f3564A.f3721a = a2;
            this.p = i;
            t0();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public int k(E0 e02) {
        return L0(e02);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.W, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.recyclerview.widget.W, android.os.Parcelable, java.lang.Object] */
    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final Parcelable k0() {
        W w3 = this.f3577z;
        if (w3 != null) {
            ?? obj = new Object();
            obj.f3765a = w3.f3765a;
            obj.f3766b = w3.f3766b;
            obj.f3767c = w3.f3767c;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() <= 0) {
            obj2.f3765a = -1;
            return obj2;
        }
        O0();
        boolean z3 = this.f3570s ^ this.f3572u;
        obj2.f3767c = z3;
        if (z3) {
            View Z02 = Z0();
            obj2.f3766b = this.f3569r.g() - this.f3569r.b(Z02);
            obj2.f3765a = AbstractC0238q0.L(Z02);
            return obj2;
        }
        View a12 = a1();
        obj2.f3765a = AbstractC0238q0.L(a12);
        obj2.f3766b = this.f3569r.e(a12) - this.f3569r.k();
        return obj2;
    }

    public void k1(boolean z3) {
        c(null);
        if (this.f3573v == z3) {
            return;
        }
        this.f3573v = z3;
        t0();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public int l(E0 e02) {
        return M0(e02);
    }

    public final void l1(int i, int i4, boolean z3, E0 e02) {
        int k4;
        this.f3568q.f3763l = this.f3569r.i() == 0 && this.f3569r.f() == 0;
        this.f3568q.f3759f = i;
        int[] iArr = this.f3567D;
        iArr[0] = 0;
        iArr[1] = 0;
        I0(e02, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z4 = i == 1;
        U u3 = this.f3568q;
        int i5 = z4 ? max2 : max;
        u3.h = i5;
        if (!z4) {
            max = max2;
        }
        u3.i = max;
        if (z4) {
            u3.h = this.f3569r.h() + i5;
            View Z02 = Z0();
            U u4 = this.f3568q;
            u4.f3758e = this.f3572u ? -1 : 1;
            int L3 = AbstractC0238q0.L(Z02);
            U u5 = this.f3568q;
            u4.f3757d = L3 + u5.f3758e;
            u5.f3755b = this.f3569r.b(Z02);
            k4 = this.f3569r.b(Z02) - this.f3569r.g();
        } else {
            View a12 = a1();
            U u6 = this.f3568q;
            u6.h = this.f3569r.k() + u6.h;
            U u7 = this.f3568q;
            u7.f3758e = this.f3572u ? 1 : -1;
            int L4 = AbstractC0238q0.L(a12);
            U u8 = this.f3568q;
            u7.f3757d = L4 + u8.f3758e;
            u8.f3755b = this.f3569r.e(a12);
            k4 = (-this.f3569r.e(a12)) + this.f3569r.k();
        }
        U u9 = this.f3568q;
        u9.f3756c = i4;
        if (z3) {
            u9.f3756c = i4 - k4;
        }
        u9.f3760g = k4;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int m(E0 e02) {
        return K0(e02);
    }

    public final void m1(int i, int i4) {
        this.f3568q.f3756c = this.f3569r.g() - i4;
        U u3 = this.f3568q;
        u3.f3758e = this.f3572u ? -1 : 1;
        u3.f3757d = i;
        u3.f3759f = 1;
        u3.f3755b = i4;
        u3.f3760g = IntCompanionObject.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public int n(E0 e02) {
        return L0(e02);
    }

    public final void n1(int i, int i4) {
        this.f3568q.f3756c = i4 - this.f3569r.k();
        U u3 = this.f3568q;
        u3.f3757d = i;
        u3.f3758e = this.f3572u ? 1 : -1;
        u3.f3759f = -1;
        u3.f3755b = i4;
        u3.f3760g = IntCompanionObject.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public int o(E0 e02) {
        return M0(e02);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final View q(int i) {
        int v3 = v();
        if (v3 == 0) {
            return null;
        }
        int L3 = i - AbstractC0238q0.L(u(0));
        if (L3 >= 0 && L3 < v3) {
            View u3 = u(L3);
            if (AbstractC0238q0.L(u3) == i) {
                return u3;
            }
        }
        return super.q(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public C0239r0 r() {
        return new C0239r0(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public int u0(int i, y0 y0Var, E0 e02) {
        if (this.p == 1) {
            return 0;
        }
        return h1(i, y0Var, e02);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void v0(int i) {
        this.f3575x = i;
        this.f3576y = IntCompanionObject.MIN_VALUE;
        W w3 = this.f3577z;
        if (w3 != null) {
            w3.f3765a = -1;
        }
        t0();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public int w0(int i, y0 y0Var, E0 e02) {
        if (this.p == 0) {
            return 0;
        }
        return h1(i, y0Var, e02);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, androidx.recyclerview.widget.T] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.p = 1;
        this.f3571t = false;
        this.f3572u = false;
        this.f3573v = false;
        this.f3574w = true;
        this.f3575x = -1;
        this.f3576y = IntCompanionObject.MIN_VALUE;
        this.f3577z = null;
        this.f3564A = new S();
        this.f3565B = new Object();
        this.f3566C = 2;
        this.f3567D = new int[2];
        C0236p0 M3 = AbstractC0238q0.M(context, attributeSet, i, i4);
        j1(M3.f3869a);
        boolean z3 = M3.f3871c;
        c(null);
        if (z3 != this.f3571t) {
            this.f3571t = z3;
            t0();
        }
        k1(M3.f3872d);
    }
}
