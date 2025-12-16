package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0238q0 implements D0 {

    /* renamed from: B, reason: collision with root package name */
    public final F.i f3731B;

    /* renamed from: C, reason: collision with root package name */
    public final int f3732C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3733D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3734E;

    /* renamed from: F, reason: collision with root package name */
    public P0 f3735F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f3736G;

    /* renamed from: H, reason: collision with root package name */
    public final M0 f3737H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f3738I;
    public int[] J;

    /* renamed from: K, reason: collision with root package name */
    public final RunnableC0247y f3739K;
    public final int p;

    /* renamed from: q, reason: collision with root package name */
    public final Q0[] f3740q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0208b0 f3741r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC0208b0 f3742s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3743t;

    /* renamed from: u, reason: collision with root package name */
    public int f3744u;

    /* renamed from: v, reason: collision with root package name */
    public final Q f3745v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3746w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f3748y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3747x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f3749z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f3730A = IntCompanionObject.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, androidx.recyclerview.widget.Q] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.p = -1;
        this.f3746w = false;
        F.i iVar = new F.i(10);
        this.f3731B = iVar;
        this.f3732C = 2;
        this.f3736G = new Rect();
        this.f3737H = new M0(this);
        this.f3738I = true;
        this.f3739K = new RunnableC0247y(this, 2);
        C0236p0 M3 = AbstractC0238q0.M(context, attributeSet, i, i4);
        int i5 = M3.f3869a;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i5 != this.f3743t) {
            this.f3743t = i5;
            AbstractC0208b0 abstractC0208b0 = this.f3741r;
            this.f3741r = this.f3742s;
            this.f3742s = abstractC0208b0;
            t0();
        }
        int i6 = M3.f3870b;
        c(null);
        if (i6 != this.p) {
            iVar.n();
            t0();
            this.p = i6;
            this.f3748y = new BitSet(this.p);
            this.f3740q = new Q0[this.p];
            for (int i7 = 0; i7 < this.p; i7++) {
                this.f3740q[i7] = new Q0(this, i7);
            }
            t0();
        }
        boolean z3 = M3.f3871c;
        c(null);
        P0 p02 = this.f3735F;
        if (p02 != null && p02.h != z3) {
            p02.h = z3;
        }
        this.f3746w = z3;
        t0();
        ?? obj = new Object();
        obj.f3624a = true;
        obj.f3629f = 0;
        obj.f3630g = 0;
        this.f3745v = obj;
        this.f3741r = AbstractC0208b0.a(this, this.f3743t);
        this.f3742s = AbstractC0208b0.a(this, 1 - this.f3743t);
    }

    public static int k1(int i, int i4, int i5) {
        int mode;
        return (!(i4 == 0 && i5 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i4) - i5), mode) : i;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void F0(RecyclerView recyclerView, int i) {
        X x3 = new X(recyclerView.getContext());
        x3.f3768a = i;
        G0(x3);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean H0() {
        return this.f3735F == null;
    }

    public final boolean I0() {
        int R02;
        if (v() != 0 && this.f3732C != 0 && this.f3889g) {
            if (this.f3747x) {
                R02 = S0();
                R0();
            } else {
                R02 = R0();
                S0();
            }
            F.i iVar = this.f3731B;
            if (R02 == 0 && W0() != null) {
                iVar.n();
                this.f3888f = true;
                t0();
                return true;
            }
        }
        return false;
    }

    public final int J0(E0 e02) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0208b0 abstractC0208b0 = this.f3741r;
        boolean z3 = !this.f3738I;
        return AbstractC0211d.c(e02, abstractC0208b0, O0(z3), N0(z3), this, this.f3738I);
    }

    public final int K0(E0 e02) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0208b0 abstractC0208b0 = this.f3741r;
        boolean z3 = !this.f3738I;
        return AbstractC0211d.d(e02, abstractC0208b0, O0(z3), N0(z3), this, this.f3738I, this.f3747x);
    }

    public final int L0(E0 e02) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0208b0 abstractC0208b0 = this.f3741r;
        boolean z3 = !this.f3738I;
        return AbstractC0211d.e(e02, abstractC0208b0, O0(z3), N0(z3), this, this.f3738I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int, boolean] */
    public final int M0(y0 y0Var, Q q4, E0 e02) {
        Q0 q02;
        ?? r6;
        int i;
        int h;
        int c4;
        int k4;
        int c5;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 1;
        this.f3748y.set(0, this.p, true);
        Q q5 = this.f3745v;
        int i9 = q5.i ? q4.f3628e == 1 ? Integer.MAX_VALUE : IntCompanionObject.MIN_VALUE : q4.f3628e == 1 ? q4.f3630g + q4.f3625b : q4.f3629f - q4.f3625b;
        int i10 = q4.f3628e;
        for (int i11 = 0; i11 < this.p; i11++) {
            if (!this.f3740q[i11].f3631a.isEmpty()) {
                j1(this.f3740q[i11], i10, i9);
            }
        }
        int g4 = this.f3747x ? this.f3741r.g() : this.f3741r.k();
        boolean z3 = false;
        while (true) {
            int i12 = q4.f3626c;
            if (((i12 < 0 || i12 >= e02.b()) ? i7 : i8) == 0 || (!q5.i && this.f3748y.isEmpty())) {
                break;
            }
            View view = y0Var.k(q4.f3626c, LongCompanionObject.MAX_VALUE).itemView;
            q4.f3626c += q4.f3627d;
            N0 n02 = (N0) view.getLayoutParams();
            int layoutPosition = n02.f3897a.getLayoutPosition();
            F.i iVar = this.f3731B;
            int[] iArr = (int[]) iVar.f490b;
            int i13 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i13 == -1) {
                if (a1(q4.f3628e)) {
                    i6 = this.p - i8;
                    i5 = -1;
                    i4 = -1;
                } else {
                    i4 = i8;
                    i5 = this.p;
                    i6 = i7;
                }
                Q0 q03 = null;
                if (q4.f3628e == i8) {
                    int k5 = this.f3741r.k();
                    int i14 = Integer.MAX_VALUE;
                    while (i6 != i5) {
                        Q0 q04 = this.f3740q[i6];
                        int f2 = q04.f(k5);
                        if (f2 < i14) {
                            i14 = f2;
                            q03 = q04;
                        }
                        i6 += i4;
                    }
                } else {
                    int g5 = this.f3741r.g();
                    int i15 = IntCompanionObject.MIN_VALUE;
                    while (i6 != i5) {
                        Q0 q05 = this.f3740q[i6];
                        int h4 = q05.h(g5);
                        if (h4 > i15) {
                            q03 = q05;
                            i15 = h4;
                        }
                        i6 += i4;
                    }
                }
                q02 = q03;
                iVar.o(layoutPosition);
                ((int[]) iVar.f490b)[layoutPosition] = q02.f3635e;
            } else {
                q02 = this.f3740q[i13];
            }
            n02.f3610e = q02;
            if (q4.f3628e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f3743t == 1) {
                i = 1;
                Y0(view, AbstractC0238q0.w(r6, this.f3744u, this.f3892l, r6, ((ViewGroup.MarginLayoutParams) n02).width), AbstractC0238q0.w(true, this.f3895o, this.f3893m, H() + K(), ((ViewGroup.MarginLayoutParams) n02).height));
            } else {
                i = 1;
                Y0(view, AbstractC0238q0.w(true, this.f3894n, this.f3892l, J() + I(), ((ViewGroup.MarginLayoutParams) n02).width), AbstractC0238q0.w(false, this.f3744u, this.f3893m, 0, ((ViewGroup.MarginLayoutParams) n02).height));
            }
            if (q4.f3628e == i) {
                c4 = q02.f(g4);
                h = this.f3741r.c(view) + c4;
            } else {
                h = q02.h(g4);
                c4 = h - this.f3741r.c(view);
            }
            if (q4.f3628e == 1) {
                Q0 q06 = n02.f3610e;
                q06.getClass();
                N0 n03 = (N0) view.getLayoutParams();
                n03.f3610e = q06;
                ArrayList arrayList = q06.f3631a;
                arrayList.add(view);
                q06.f3633c = IntCompanionObject.MIN_VALUE;
                if (arrayList.size() == 1) {
                    q06.f3632b = IntCompanionObject.MIN_VALUE;
                }
                if (n03.f3897a.isRemoved() || n03.f3897a.isUpdated()) {
                    q06.f3634d = q06.f3636f.f3741r.c(view) + q06.f3634d;
                }
            } else {
                Q0 q07 = n02.f3610e;
                q07.getClass();
                N0 n04 = (N0) view.getLayoutParams();
                n04.f3610e = q07;
                ArrayList arrayList2 = q07.f3631a;
                arrayList2.add(0, view);
                q07.f3632b = IntCompanionObject.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    q07.f3633c = IntCompanionObject.MIN_VALUE;
                }
                if (n04.f3897a.isRemoved() || n04.f3897a.isUpdated()) {
                    q07.f3634d = q07.f3636f.f3741r.c(view) + q07.f3634d;
                }
            }
            if (X0() && this.f3743t == 1) {
                c5 = this.f3742s.g() - (((this.p - 1) - q02.f3635e) * this.f3744u);
                k4 = c5 - this.f3742s.c(view);
            } else {
                k4 = this.f3742s.k() + (q02.f3635e * this.f3744u);
                c5 = this.f3742s.c(view) + k4;
            }
            if (this.f3743t == 1) {
                AbstractC0238q0.R(view, k4, c4, c5, h);
            } else {
                AbstractC0238q0.R(view, c4, k4, h, c5);
            }
            j1(q02, q5.f3628e, i9);
            c1(y0Var, q5);
            if (q5.h && view.hasFocusable()) {
                this.f3748y.set(q02.f3635e, false);
            }
            i8 = 1;
            z3 = true;
            i7 = 0;
        }
        if (!z3) {
            c1(y0Var, q5);
        }
        int k6 = q5.f3628e == -1 ? this.f3741r.k() - U0(this.f3741r.k()) : T0(this.f3741r.g()) - this.f3741r.g();
        if (k6 > 0) {
            return Math.min(q4.f3625b, k6);
        }
        return 0;
    }

    public final View N0(boolean z3) {
        int k4 = this.f3741r.k();
        int g4 = this.f3741r.g();
        View view = null;
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            int e4 = this.f3741r.e(u3);
            int b4 = this.f3741r.b(u3);
            if (b4 > k4 && e4 < g4) {
                if (b4 <= g4 || !z3) {
                    return u3;
                }
                if (view == null) {
                    view = u3;
                }
            }
        }
        return view;
    }

    public final View O0(boolean z3) {
        int k4 = this.f3741r.k();
        int g4 = this.f3741r.g();
        int v3 = v();
        View view = null;
        for (int i = 0; i < v3; i++) {
            View u3 = u(i);
            int e4 = this.f3741r.e(u3);
            if (this.f3741r.b(u3) > k4 && e4 < g4) {
                if (e4 >= k4 || !z3) {
                    return u3;
                }
                if (view == null) {
                    view = u3;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean P() {
        return this.f3732C != 0;
    }

    public final void P0(y0 y0Var, E0 e02, boolean z3) {
        int g4;
        int T02 = T0(IntCompanionObject.MIN_VALUE);
        if (T02 != Integer.MIN_VALUE && (g4 = this.f3741r.g() - T02) > 0) {
            int i = g4 - (-g1(-g4, y0Var, e02));
            if (!z3 || i <= 0) {
                return;
            }
            this.f3741r.o(i);
        }
    }

    public final void Q0(y0 y0Var, E0 e02, boolean z3) {
        int k4;
        int U02 = U0(Integer.MAX_VALUE);
        if (U02 != Integer.MAX_VALUE && (k4 = U02 - this.f3741r.k()) > 0) {
            int g12 = k4 - g1(k4, y0Var, e02);
            if (!z3 || g12 <= 0) {
                return;
            }
            this.f3741r.o(-g12);
        }
    }

    public final int R0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC0238q0.L(u(0));
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void S(int i) {
        super.S(i);
        for (int i4 = 0; i4 < this.p; i4++) {
            Q0 q02 = this.f3740q[i4];
            int i5 = q02.f3632b;
            if (i5 != Integer.MIN_VALUE) {
                q02.f3632b = i5 + i;
            }
            int i6 = q02.f3633c;
            if (i6 != Integer.MIN_VALUE) {
                q02.f3633c = i6 + i;
            }
        }
    }

    public final int S0() {
        int v3 = v();
        if (v3 == 0) {
            return 0;
        }
        return AbstractC0238q0.L(u(v3 - 1));
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void T(int i) {
        super.T(i);
        for (int i4 = 0; i4 < this.p; i4++) {
            Q0 q02 = this.f3740q[i4];
            int i5 = q02.f3632b;
            if (i5 != Integer.MIN_VALUE) {
                q02.f3632b = i5 + i;
            }
            int i6 = q02.f3633c;
            if (i6 != Integer.MIN_VALUE) {
                q02.f3633c = i6 + i;
            }
        }
    }

    public final int T0(int i) {
        int f2 = this.f3740q[0].f(i);
        for (int i4 = 1; i4 < this.p; i4++) {
            int f4 = this.f3740q[i4].f(i);
            if (f4 > f2) {
                f2 = f4;
            }
        }
        return f2;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void U() {
        this.f3731B.n();
        for (int i = 0; i < this.p; i++) {
            this.f3740q[i].b();
        }
    }

    public final int U0(int i) {
        int h = this.f3740q[0].h(i);
        for (int i4 = 1; i4 < this.p; i4++) {
            int h4 = this.f3740q[i4].h(i);
            if (h4 < h) {
                h = h4;
            }
        }
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.V0(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void W(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3884b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f3739K);
        }
        for (int i = 0; i < this.p; i++) {
            this.f3740q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View W0() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.W0():android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x004f, code lost:
    
        if (r8.f3743t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0055, code lost:
    
        if (r8.f3743t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0061, code lost:
    
        if (X0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006d, code lost:
    
        if (X0() == false) goto L37;
     */
    @Override // androidx.recyclerview.widget.AbstractC0238q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View X(android.view.View r9, int r10, androidx.recyclerview.widget.y0 r11, androidx.recyclerview.widget.E0 r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X(android.view.View, int, androidx.recyclerview.widget.y0, androidx.recyclerview.widget.E0):android.view.View");
    }

    public final boolean X0() {
        return G() == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (v() > 0) {
            View O02 = O0(false);
            View N02 = N0(false);
            if (O02 == null || N02 == null) {
                return;
            }
            int L3 = AbstractC0238q0.L(O02);
            int L4 = AbstractC0238q0.L(N02);
            if (L3 < L4) {
                accessibilityEvent.setFromIndex(L3);
                accessibilityEvent.setToIndex(L4);
            } else {
                accessibilityEvent.setFromIndex(L4);
                accessibilityEvent.setToIndex(L3);
            }
        }
    }

    public final void Y0(View view, int i, int i4) {
        RecyclerView recyclerView = this.f3884b;
        Rect rect = this.f3736G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.P(view));
        }
        N0 n02 = (N0) view.getLayoutParams();
        int k12 = k1(i, ((ViewGroup.MarginLayoutParams) n02).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) n02).rightMargin + rect.right);
        int k13 = k1(i4, ((ViewGroup.MarginLayoutParams) n02).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) n02).bottomMargin + rect.bottom);
        if (C0(view, k12, k13, n02)) {
            view.measure(k12, k13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r11 < R0()) != r16.f3747x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0414, code lost:
    
        if (I0() != false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f3747x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z0(androidx.recyclerview.widget.y0 r17, androidx.recyclerview.widget.E0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Z0(androidx.recyclerview.widget.y0, androidx.recyclerview.widget.E0, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < R0()) != r3.f3747x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f3747x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // androidx.recyclerview.widget.D0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f3747x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.R0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f3747x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.f3743t
            r0 = 0
            if (r3 != 0) goto L2f
            float r3 = (float) r1
            r4.x = r3
            r4.y = r0
            return r4
        L2f:
            r4.x = r0
            float r3 = (float) r1
            r4.y = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    public final boolean a1(int i) {
        if (this.f3743t == 0) {
            return (i == -1) != this.f3747x;
        }
        return ((i == -1) == this.f3747x) == X0();
    }

    public final void b1(int i, E0 e02) {
        int R02;
        int i4;
        if (i > 0) {
            R02 = S0();
            i4 = 1;
        } else {
            R02 = R0();
            i4 = -1;
        }
        Q q4 = this.f3745v;
        q4.f3624a = true;
        i1(R02, e02);
        h1(i4);
        q4.f3626c = R02 + q4.f3627d;
        q4.f3625b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void c(String str) {
        if (this.f3735F == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void c0(int i, int i4) {
        V0(i, i4, 1);
    }

    public final void c1(y0 y0Var, Q q4) {
        if (!q4.f3624a || q4.i) {
            return;
        }
        if (q4.f3625b == 0) {
            if (q4.f3628e == -1) {
                d1(q4.f3630g, y0Var);
                return;
            } else {
                e1(q4.f3629f, y0Var);
                return;
            }
        }
        int i = 1;
        if (q4.f3628e == -1) {
            int i4 = q4.f3629f;
            int h = this.f3740q[0].h(i4);
            while (i < this.p) {
                int h4 = this.f3740q[i].h(i4);
                if (h4 > h) {
                    h = h4;
                }
                i++;
            }
            int i5 = i4 - h;
            d1(i5 < 0 ? q4.f3630g : q4.f3630g - Math.min(i5, q4.f3625b), y0Var);
            return;
        }
        int i6 = q4.f3630g;
        int f2 = this.f3740q[0].f(i6);
        while (i < this.p) {
            int f4 = this.f3740q[i].f(i6);
            if (f4 < f2) {
                f2 = f4;
            }
            i++;
        }
        int i7 = f2 - q4.f3630g;
        e1(i7 < 0 ? q4.f3629f : Math.min(i7, q4.f3625b) + q4.f3629f, y0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean d() {
        return this.f3743t == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void d0() {
        this.f3731B.n();
        t0();
    }

    public final void d1(int i, y0 y0Var) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            if (this.f3741r.e(u3) < i || this.f3741r.n(u3) < i) {
                return;
            }
            N0 n02 = (N0) u3.getLayoutParams();
            n02.getClass();
            if (n02.f3610e.f3631a.size() == 1) {
                return;
            }
            Q0 q02 = n02.f3610e;
            ArrayList arrayList = q02.f3631a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            N0 n03 = (N0) view.getLayoutParams();
            n03.f3610e = null;
            if (n03.f3897a.isRemoved() || n03.f3897a.isUpdated()) {
                q02.f3634d -= q02.f3636f.f3741r.c(view);
            }
            if (size == 1) {
                q02.f3632b = IntCompanionObject.MIN_VALUE;
            }
            q02.f3633c = IntCompanionObject.MIN_VALUE;
            p0(u3, y0Var);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean e() {
        return this.f3743t == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void e0(int i, int i4) {
        V0(i, i4, 8);
    }

    public final void e1(int i, y0 y0Var) {
        while (v() > 0) {
            View u3 = u(0);
            if (this.f3741r.b(u3) > i || this.f3741r.m(u3) > i) {
                return;
            }
            N0 n02 = (N0) u3.getLayoutParams();
            n02.getClass();
            if (n02.f3610e.f3631a.size() == 1) {
                return;
            }
            Q0 q02 = n02.f3610e;
            ArrayList arrayList = q02.f3631a;
            View view = (View) arrayList.remove(0);
            N0 n03 = (N0) view.getLayoutParams();
            n03.f3610e = null;
            if (arrayList.size() == 0) {
                q02.f3633c = IntCompanionObject.MIN_VALUE;
            }
            if (n03.f3897a.isRemoved() || n03.f3897a.isUpdated()) {
                q02.f3634d -= q02.f3636f.f3741r.c(view);
            }
            q02.f3632b = IntCompanionObject.MIN_VALUE;
            p0(u3, y0Var);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean f(C0239r0 c0239r0) {
        return c0239r0 instanceof N0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void f0(int i, int i4) {
        V0(i, i4, 2);
    }

    public final void f1() {
        if (this.f3743t == 1 || !X0()) {
            this.f3747x = this.f3746w;
        } else {
            this.f3747x = !this.f3746w;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void g0(int i, int i4) {
        V0(i, i4, 4);
    }

    public final int g1(int i, y0 y0Var, E0 e02) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        b1(i, e02);
        Q q4 = this.f3745v;
        int M02 = M0(y0Var, q4, e02);
        if (q4.f3625b >= M02) {
            i = i < 0 ? -M02 : M02;
        }
        this.f3741r.o(-i);
        this.f3733D = this.f3747x;
        q4.f3625b = 0;
        c1(y0Var, q4);
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void h(int i, int i4, E0 e02, Z2.y yVar) {
        Q q4;
        int f2;
        int i5;
        if (this.f3743t != 0) {
            i = i4;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        b1(i, e02);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = this.p;
            q4 = this.f3745v;
            if (i6 >= i8) {
                break;
            }
            if (q4.f3627d == -1) {
                f2 = q4.f3629f;
                i5 = this.f3740q[i6].h(f2);
            } else {
                f2 = this.f3740q[i6].f(q4.f3630g);
                i5 = q4.f3630g;
            }
            int i9 = f2 - i5;
            if (i9 >= 0) {
                this.J[i7] = i9;
                i7++;
            }
            i6++;
        }
        Arrays.sort(this.J, 0, i7);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = q4.f3626c;
            if (i11 < 0 || i11 >= e02.b()) {
                return;
            }
            yVar.b(q4.f3626c, this.J[i10]);
            q4.f3626c += q4.f3627d;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void h0(y0 y0Var, E0 e02) {
        Z0(y0Var, e02, true);
    }

    public final void h1(int i) {
        Q q4 = this.f3745v;
        q4.f3628e = i;
        q4.f3627d = this.f3747x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void i0(E0 e02) {
        this.f3749z = -1;
        this.f3730A = IntCompanionObject.MIN_VALUE;
        this.f3735F = null;
        this.f3737H.a();
    }

    public final void i1(int i, E0 e02) {
        int i4;
        int i5;
        int i6;
        Q q4 = this.f3745v;
        boolean z3 = false;
        q4.f3625b = 0;
        q4.f3626c = i;
        X x3 = this.f3887e;
        if (!(x3 != null && x3.f3772e) || (i6 = e02.f3509a) == -1) {
            i4 = 0;
            i5 = 0;
        } else {
            if (this.f3747x == (i6 < i)) {
                i4 = this.f3741r.l();
                i5 = 0;
            } else {
                i5 = this.f3741r.l();
                i4 = 0;
            }
        }
        RecyclerView recyclerView = this.f3884b;
        if (recyclerView == null || !recyclerView.h) {
            q4.f3630g = this.f3741r.f() + i4;
            q4.f3629f = -i5;
        } else {
            q4.f3629f = this.f3741r.k() - i5;
            q4.f3630g = this.f3741r.g() + i4;
        }
        q4.h = false;
        q4.f3624a = true;
        if (this.f3741r.i() == 0 && this.f3741r.f() == 0) {
            z3 = true;
        }
        q4.i = z3;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int j(E0 e02) {
        return J0(e02);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void j0(Parcelable parcelable) {
        if (parcelable instanceof P0) {
            P0 p02 = (P0) parcelable;
            this.f3735F = p02;
            if (this.f3749z != -1) {
                p02.f3619d = null;
                p02.f3618c = 0;
                p02.f3616a = -1;
                p02.f3617b = -1;
                p02.f3619d = null;
                p02.f3618c = 0;
                p02.f3620e = 0;
                p02.f3621f = null;
                p02.f3622g = null;
            }
            t0();
        }
    }

    public final void j1(Q0 q02, int i, int i4) {
        int i5 = q02.f3634d;
        int i6 = q02.f3635e;
        if (i != -1) {
            int i7 = q02.f3633c;
            if (i7 == Integer.MIN_VALUE) {
                q02.a();
                i7 = q02.f3633c;
            }
            if (i7 - i5 >= i4) {
                this.f3748y.set(i6, false);
                return;
            }
            return;
        }
        int i8 = q02.f3632b;
        if (i8 == Integer.MIN_VALUE) {
            View view = (View) q02.f3631a.get(0);
            N0 n02 = (N0) view.getLayoutParams();
            q02.f3632b = q02.f3636f.f3741r.e(view);
            n02.getClass();
            i8 = q02.f3632b;
        }
        if (i8 + i5 <= i4) {
            this.f3748y.set(i6, false);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int k(E0 e02) {
        return K0(e02);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, androidx.recyclerview.widget.P0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.os.Parcelable, java.lang.Object, androidx.recyclerview.widget.P0] */
    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final Parcelable k0() {
        int h;
        int k4;
        int[] iArr;
        P0 p02 = this.f3735F;
        if (p02 != null) {
            ?? obj = new Object();
            obj.f3618c = p02.f3618c;
            obj.f3616a = p02.f3616a;
            obj.f3617b = p02.f3617b;
            obj.f3619d = p02.f3619d;
            obj.f3620e = p02.f3620e;
            obj.f3621f = p02.f3621f;
            obj.h = p02.h;
            obj.i = p02.i;
            obj.f3623j = p02.f3623j;
            obj.f3622g = p02.f3622g;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.h = this.f3746w;
        obj2.i = this.f3733D;
        obj2.f3623j = this.f3734E;
        F.i iVar = this.f3731B;
        if (iVar == null || (iArr = (int[]) iVar.f490b) == null) {
            obj2.f3620e = 0;
        } else {
            obj2.f3621f = iArr;
            obj2.f3620e = iArr.length;
            obj2.f3622g = (ArrayList) iVar.f491c;
        }
        if (v() <= 0) {
            obj2.f3616a = -1;
            obj2.f3617b = -1;
            obj2.f3618c = 0;
            return obj2;
        }
        obj2.f3616a = this.f3733D ? S0() : R0();
        View N02 = this.f3747x ? N0(true) : O0(true);
        obj2.f3617b = N02 != null ? AbstractC0238q0.L(N02) : -1;
        int i = this.p;
        obj2.f3618c = i;
        obj2.f3619d = new int[i];
        for (int i4 = 0; i4 < this.p; i4++) {
            if (this.f3733D) {
                h = this.f3740q[i4].f(IntCompanionObject.MIN_VALUE);
                if (h != Integer.MIN_VALUE) {
                    k4 = this.f3741r.g();
                    h -= k4;
                    obj2.f3619d[i4] = h;
                } else {
                    obj2.f3619d[i4] = h;
                }
            } else {
                h = this.f3740q[i4].h(IntCompanionObject.MIN_VALUE);
                if (h != Integer.MIN_VALUE) {
                    k4 = this.f3741r.k();
                    h -= k4;
                    obj2.f3619d[i4] = h;
                } else {
                    obj2.f3619d[i4] = h;
                }
            }
        }
        return obj2;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int l(E0 e02) {
        return L0(e02);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void l0(int i) {
        if (i == 0) {
            I0();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int m(E0 e02) {
        return J0(e02);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int n(E0 e02) {
        return K0(e02);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int o(E0 e02) {
        return L0(e02);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final C0239r0 r() {
        return this.f3743t == 0 ? new C0239r0(-2, -1) : new C0239r0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final C0239r0 s(Context context, AttributeSet attributeSet) {
        return new C0239r0(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final C0239r0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0239r0((ViewGroup.MarginLayoutParams) layoutParams) : new C0239r0(layoutParams);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int u0(int i, y0 y0Var, E0 e02) {
        return g1(i, y0Var, e02);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void v0(int i) {
        P0 p02 = this.f3735F;
        if (p02 != null && p02.f3616a != i) {
            p02.f3619d = null;
            p02.f3618c = 0;
            p02.f3616a = -1;
            p02.f3617b = -1;
        }
        this.f3749z = i;
        this.f3730A = IntCompanionObject.MIN_VALUE;
        t0();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int w0(int i, y0 y0Var, E0 e02) {
        return g1(i, y0Var, e02);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void z0(Rect rect, int i, int i4) {
        int g4;
        int g5;
        int i5 = this.p;
        int J = J() + I();
        int H3 = H() + K();
        if (this.f3743t == 1) {
            int height = rect.height() + H3;
            RecyclerView recyclerView = this.f3884b;
            WeakHashMap weakHashMap = O.X.f1226a;
            g5 = AbstractC0238q0.g(i4, height, recyclerView.getMinimumHeight());
            g4 = AbstractC0238q0.g(i, (this.f3744u * i5) + J, this.f3884b.getMinimumWidth());
        } else {
            int width = rect.width() + J;
            RecyclerView recyclerView2 = this.f3884b;
            WeakHashMap weakHashMap2 = O.X.f1226a;
            g4 = AbstractC0238q0.g(i, width, recyclerView2.getMinimumWidth());
            g5 = AbstractC0238q0.g(i4, (this.f3744u * i5) + H3, this.f3884b.getMinimumHeight());
        }
        this.f3884b.setMeasuredDimension(g4, g5);
    }
}
