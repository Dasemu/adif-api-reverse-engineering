package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f3524E;

    /* renamed from: F, reason: collision with root package name */
    public int f3525F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f3526G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f3527H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f3528I;
    public final SparseIntArray J;

    /* renamed from: K, reason: collision with root package name */
    public final F.i f3529K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f3530L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f3524E = false;
        this.f3525F = -1;
        this.f3528I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.f3529K = new F.i(9);
        this.f3530L = new Rect();
        v1(AbstractC0238q0.M(context, attributeSet, i, i4).f3870b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    public final boolean H0() {
        return this.f3577z == null && !this.f3524E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void J0(E0 e02, U u3, Z2.y yVar) {
        int i;
        int i4 = this.f3525F;
        for (int i5 = 0; i5 < this.f3525F && (i = u3.f3757d) >= 0 && i < e02.b() && i4 > 0; i5++) {
            yVar.b(u3.f3757d, Math.max(0, u3.f3760g));
            this.f3529K.getClass();
            i4--;
            u3.f3757d += u3.f3758e;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int N(y0 y0Var, E0 e02) {
        if (this.p == 0) {
            return this.f3525F;
        }
        if (e02.b() < 1) {
            return 0;
        }
        return r1(e02.b() - 1, y0Var, e02) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View W0(y0 y0Var, E0 e02, boolean z3, boolean z4) {
        int i;
        int i4;
        int v3 = v();
        int i5 = 1;
        if (z4) {
            i4 = v() - 1;
            i = -1;
            i5 = -1;
        } else {
            i = v3;
            i4 = 0;
        }
        int b4 = e02.b();
        O0();
        int k4 = this.f3569r.k();
        int g4 = this.f3569r.g();
        View view = null;
        View view2 = null;
        while (i4 != i) {
            View u3 = u(i4);
            int L3 = AbstractC0238q0.L(u3);
            if (L3 >= 0 && L3 < b4 && s1(L3, y0Var, e02) == 0) {
                if (((C0239r0) u3.getLayoutParams()).f3897a.isRemoved()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f3569r.e(u3) < g4 && this.f3569r.b(u3) >= k4) {
                        return u3;
                    }
                    if (view == null) {
                        view = u3;
                    }
                }
            }
            i4 += i5;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0105, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x001f, code lost:
    
        if (r22.f3883a.f3828c.contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View X(android.view.View r23, int r24, androidx.recyclerview.widget.y0 r25, androidx.recyclerview.widget.E0 r26) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.X(android.view.View, int, androidx.recyclerview.widget.y0, androidx.recyclerview.widget.E0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void Z(y0 y0Var, E0 e02, P.k kVar) {
        super.Z(y0Var, e02, kVar);
        kVar.h(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void b0(y0 y0Var, E0 e02, View view, P.k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof F)) {
            a0(view, kVar);
            return;
        }
        F f2 = (F) layoutParams;
        int r12 = r1(f2.f3897a.getLayoutPosition(), y0Var, e02);
        if (this.p == 0) {
            kVar.i(P.j.a(false, f2.f3521e, f2.f3522f, r12, 1));
        } else {
            kVar.i(P.j.a(false, r12, 1, f2.f3521e, f2.f3522f));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void c0(int i, int i4) {
        F.i iVar = this.f3529K;
        iVar.v();
        ((SparseIntArray) iVar.f491c).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        r22.f3751b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(androidx.recyclerview.widget.y0 r19, androidx.recyclerview.widget.E0 r20, androidx.recyclerview.widget.U r21, androidx.recyclerview.widget.T r22) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c1(androidx.recyclerview.widget.y0, androidx.recyclerview.widget.E0, androidx.recyclerview.widget.U, androidx.recyclerview.widget.T):void");
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void d0() {
        F.i iVar = this.f3529K;
        iVar.v();
        ((SparseIntArray) iVar.f491c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(y0 y0Var, E0 e02, S s4, int i) {
        w1();
        if (e02.b() > 0 && !e02.f3515g) {
            boolean z3 = i == 1;
            int s12 = s1(s4.f3722b, y0Var, e02);
            if (z3) {
                while (s12 > 0) {
                    int i4 = s4.f3722b;
                    if (i4 <= 0) {
                        break;
                    }
                    int i5 = i4 - 1;
                    s4.f3722b = i5;
                    s12 = s1(i5, y0Var, e02);
                }
            } else {
                int b4 = e02.b() - 1;
                int i6 = s4.f3722b;
                while (i6 < b4) {
                    int i7 = i6 + 1;
                    int s13 = s1(i7, y0Var, e02);
                    if (s13 <= s12) {
                        break;
                    }
                    i6 = i7;
                    s12 = s13;
                }
                s4.f3722b = i6;
            }
        }
        p1();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void e0(int i, int i4) {
        F.i iVar = this.f3529K;
        iVar.v();
        ((SparseIntArray) iVar.f491c).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean f(C0239r0 c0239r0) {
        return c0239r0 instanceof F;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void f0(int i, int i4) {
        F.i iVar = this.f3529K;
        iVar.v();
        ((SparseIntArray) iVar.f491c).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void g0(int i, int i4) {
        F.i iVar = this.f3529K;
        iVar.v();
        ((SparseIntArray) iVar.f491c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    public final void h0(y0 y0Var, E0 e02) {
        boolean z3 = e02.f3515g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.f3528I;
        if (z3) {
            int v3 = v();
            for (int i = 0; i < v3; i++) {
                F f2 = (F) u(i).getLayoutParams();
                int layoutPosition = f2.f3897a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, f2.f3522f);
                sparseIntArray.put(layoutPosition, f2.f3521e);
            }
        }
        super.h0(y0Var, e02);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    public final void i0(E0 e02) {
        super.i0(e02);
        this.f3524E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    public final int k(E0 e02) {
        return L0(e02);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void k1(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.k1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    public final int l(E0 e02) {
        return M0(e02);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    public final int n(E0 e02) {
        return L0(e02);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    public final int o(E0 e02) {
        return M0(e02);
    }

    public final void o1(int i) {
        int i4;
        int[] iArr = this.f3526G;
        int i5 = this.f3525F;
        if (iArr == null || iArr.length != i5 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i5 + 1];
        }
        int i6 = 0;
        iArr[0] = 0;
        int i7 = i / i5;
        int i8 = i % i5;
        int i9 = 0;
        for (int i10 = 1; i10 <= i5; i10++) {
            i6 += i8;
            if (i6 <= 0 || i5 - i6 >= i8) {
                i4 = i7;
            } else {
                i4 = i7 + 1;
                i6 -= i5;
            }
            i9 += i4;
            iArr[i10] = i9;
        }
        this.f3526G = iArr;
    }

    public final void p1() {
        View[] viewArr = this.f3527H;
        if (viewArr == null || viewArr.length != this.f3525F) {
            this.f3527H = new View[this.f3525F];
        }
    }

    public final int q1(int i, int i4) {
        if (this.p != 1 || !b1()) {
            int[] iArr = this.f3526G;
            return iArr[i4 + i] - iArr[i];
        }
        int[] iArr2 = this.f3526G;
        int i5 = this.f3525F;
        return iArr2[i5 - i] - iArr2[(i5 - i) - i4];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    public final C0239r0 r() {
        return this.p == 0 ? new F(-2, -1) : new F(-1, -2);
    }

    public final int r1(int i, y0 y0Var, E0 e02) {
        boolean z3 = e02.f3515g;
        F.i iVar = this.f3529K;
        if (!z3) {
            int i4 = this.f3525F;
            iVar.getClass();
            return F.i.u(i, i4);
        }
        int b4 = y0Var.b(i);
        if (b4 != -1) {
            int i5 = this.f3525F;
            iVar.getClass();
            return F.i.u(b4, i5);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.F, androidx.recyclerview.widget.r0] */
    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final C0239r0 s(Context context, AttributeSet attributeSet) {
        ?? c0239r0 = new C0239r0(context, attributeSet);
        c0239r0.f3521e = -1;
        c0239r0.f3522f = 0;
        return c0239r0;
    }

    public final int s1(int i, y0 y0Var, E0 e02) {
        boolean z3 = e02.f3515g;
        F.i iVar = this.f3529K;
        if (!z3) {
            int i4 = this.f3525F;
            iVar.getClass();
            return i % i4;
        }
        int i5 = this.J.get(i, -1);
        if (i5 != -1) {
            return i5;
        }
        int b4 = y0Var.b(i);
        if (b4 != -1) {
            int i6 = this.f3525F;
            iVar.getClass();
            return b4 % i6;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.recyclerview.widget.F, androidx.recyclerview.widget.r0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.recyclerview.widget.F, androidx.recyclerview.widget.r0] */
    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final C0239r0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? c0239r0 = new C0239r0((ViewGroup.MarginLayoutParams) layoutParams);
            c0239r0.f3521e = -1;
            c0239r0.f3522f = 0;
            return c0239r0;
        }
        ?? c0239r02 = new C0239r0(layoutParams);
        c0239r02.f3521e = -1;
        c0239r02.f3522f = 0;
        return c0239r02;
    }

    public final int t1(int i, y0 y0Var, E0 e02) {
        boolean z3 = e02.f3515g;
        F.i iVar = this.f3529K;
        if (!z3) {
            iVar.getClass();
            return 1;
        }
        int i4 = this.f3528I.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        if (y0Var.b(i) != -1) {
            iVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    public final int u0(int i, y0 y0Var, E0 e02) {
        w1();
        p1();
        return super.u0(i, y0Var, e02);
    }

    public final void u1(View view, int i, boolean z3) {
        int i4;
        int i5;
        F f2 = (F) view.getLayoutParams();
        Rect rect = f2.f3898b;
        int i6 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) f2).topMargin + ((ViewGroup.MarginLayoutParams) f2).bottomMargin;
        int i7 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) f2).leftMargin + ((ViewGroup.MarginLayoutParams) f2).rightMargin;
        int q12 = q1(f2.f3521e, f2.f3522f);
        if (this.p == 1) {
            i5 = AbstractC0238q0.w(false, q12, i, i7, ((ViewGroup.MarginLayoutParams) f2).width);
            i4 = AbstractC0238q0.w(true, this.f3569r.l(), this.f3893m, i6, ((ViewGroup.MarginLayoutParams) f2).height);
        } else {
            int w3 = AbstractC0238q0.w(false, q12, i, i6, ((ViewGroup.MarginLayoutParams) f2).height);
            int w4 = AbstractC0238q0.w(true, this.f3569r.l(), this.f3892l, i7, ((ViewGroup.MarginLayoutParams) f2).width);
            i4 = w3;
            i5 = w4;
        }
        C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
        if (z3 ? E0(view, i5, i4, c0239r0) : C0(view, i5, i4, c0239r0)) {
            view.measure(i5, i4);
        }
    }

    public final void v1(int i) {
        if (i == this.f3525F) {
            return;
        }
        this.f3524E = true;
        if (i < 1) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "Span count should be at least 1. Provided "));
        }
        this.f3525F = i;
        this.f3529K.v();
        t0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    public final int w0(int i, y0 y0Var, E0 e02) {
        w1();
        p1();
        return super.w0(i, y0Var, e02);
    }

    public final void w1() {
        int H3;
        int K3;
        if (this.p == 1) {
            H3 = this.f3894n - J();
            K3 = I();
        } else {
            H3 = this.f3895o - H();
            K3 = K();
        }
        o1(H3 - K3);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int x(y0 y0Var, E0 e02) {
        if (this.p == 1) {
            return this.f3525F;
        }
        if (e02.b() < 1) {
            return 0;
        }
        return r1(e02.b() - 1, y0Var, e02) + 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void z0(Rect rect, int i, int i4) {
        int g4;
        int g5;
        if (this.f3526G == null) {
            super.z0(rect, i, i4);
        }
        int J = J() + I();
        int H3 = H() + K();
        if (this.p == 1) {
            int height = rect.height() + H3;
            RecyclerView recyclerView = this.f3884b;
            WeakHashMap weakHashMap = O.X.f1226a;
            g5 = AbstractC0238q0.g(i4, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f3526G;
            g4 = AbstractC0238q0.g(i, iArr[iArr.length - 1] + J, this.f3884b.getMinimumWidth());
        } else {
            int width = rect.width() + J;
            RecyclerView recyclerView2 = this.f3884b;
            WeakHashMap weakHashMap2 = O.X.f1226a;
            g4 = AbstractC0238q0.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f3526G;
            g5 = AbstractC0238q0.g(i4, iArr2[iArr2.length - 1] + H3, this.f3884b.getMinimumHeight());
        }
        this.f3884b.setMeasuredDimension(g4, g5);
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f3524E = false;
        this.f3525F = -1;
        this.f3528I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.f3529K = new F.i(9);
        this.f3530L = new Rect();
        v1(i);
    }
}
