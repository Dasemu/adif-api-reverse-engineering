package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import t0.AbstractC0615a;

/* renamed from: androidx.recyclerview.widget.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0238q0 {

    /* renamed from: a, reason: collision with root package name */
    public C0223j f3883a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3884b;

    /* renamed from: c, reason: collision with root package name */
    public final F.i f3885c;

    /* renamed from: d, reason: collision with root package name */
    public final F.i f3886d;

    /* renamed from: e, reason: collision with root package name */
    public X f3887e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3888f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3889g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f3890j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3891k;

    /* renamed from: l, reason: collision with root package name */
    public int f3892l;

    /* renamed from: m, reason: collision with root package name */
    public int f3893m;

    /* renamed from: n, reason: collision with root package name */
    public int f3894n;

    /* renamed from: o, reason: collision with root package name */
    public int f3895o;

    public AbstractC0238q0() {
        C0234o0 c0234o0 = new C0234o0(this, 0);
        C0234o0 c0234o02 = new C0234o0(this, 1);
        this.f3885c = new F.i(c0234o0);
        this.f3886d = new F.i(c0234o02);
        this.f3888f = false;
        this.f3889g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        return view.getLeft() - ((C0239r0) view.getLayoutParams()).f3898b.left;
    }

    public static int B(View view) {
        Rect rect = ((C0239r0) view.getLayoutParams()).f3898b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int C(View view) {
        Rect rect = ((C0239r0) view.getLayoutParams()).f3898b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int D(View view) {
        return view.getRight() + ((C0239r0) view.getLayoutParams()).f3898b.right;
    }

    public static int E(View view) {
        return view.getTop() - ((C0239r0) view.getLayoutParams()).f3898b.top;
    }

    public static int L(View view) {
        return ((C0239r0) view.getLayoutParams()).f3897a.getLayoutPosition();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.recyclerview.widget.p0] */
    public static C0236p0 M(Context context, AttributeSet attributeSet, int i, int i4) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0615a.f8509a, i, i4);
        obj.f3869a = obtainStyledAttributes.getInt(0, 1);
        obj.f3870b = obtainStyledAttributes.getInt(10, 1);
        obj.f3871c = obtainStyledAttributes.getBoolean(9, false);
        obj.f3872d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean Q(int i, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (i5 > 0 && i != i5) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void R(View view, int i, int i4, int i5, int i6) {
        C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
        Rect rect = c0239r0.f3898b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0239r0).leftMargin, i4 + rect.top + ((ViewGroup.MarginLayoutParams) c0239r0).topMargin, (i5 - rect.right) - ((ViewGroup.MarginLayoutParams) c0239r0).rightMargin, (i6 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0239r0).bottomMargin);
    }

    public static int g(int i, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i4, i5) : size : Math.min(size, Math.max(i4, i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC0238q0.w(boolean, int, int, int, int):int");
    }

    public static int y(View view) {
        return view.getBottom() + ((C0239r0) view.getLayoutParams()).f3898b.bottom;
    }

    public final void A0(int i, int i4) {
        int v3 = v();
        if (v3 == 0) {
            this.f3884b.r(i, i4);
            return;
        }
        int i5 = IntCompanionObject.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < v3; i9++) {
            View u3 = u(i9);
            Rect rect = this.f3884b.f3688j;
            z(rect, u3);
            int i10 = rect.left;
            if (i10 < i8) {
                i8 = i10;
            }
            int i11 = rect.right;
            if (i11 > i5) {
                i5 = i11;
            }
            int i12 = rect.top;
            if (i12 < i6) {
                i6 = i12;
            }
            int i13 = rect.bottom;
            if (i13 > i7) {
                i7 = i13;
            }
        }
        this.f3884b.f3688j.set(i8, i6, i5, i7);
        z0(this.f3884b.f3688j, i, i4);
    }

    public final void B0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3884b = null;
            this.f3883a = null;
            this.f3894n = 0;
            this.f3895o = 0;
        } else {
            this.f3884b = recyclerView;
            this.f3883a = recyclerView.f3682f;
            this.f3894n = recyclerView.getWidth();
            this.f3895o = recyclerView.getHeight();
        }
        this.f3892l = 1073741824;
        this.f3893m = 1073741824;
    }

    public final boolean C0(View view, int i, int i4, C0239r0 c0239r0) {
        return (!view.isLayoutRequested() && this.h && Q(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0239r0).width) && Q(view.getHeight(), i4, ((ViewGroup.MarginLayoutParams) c0239r0).height)) ? false : true;
    }

    public boolean D0() {
        return false;
    }

    public final boolean E0(View view, int i, int i4, C0239r0 c0239r0) {
        return (this.h && Q(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0239r0).width) && Q(view.getMeasuredHeight(), i4, ((ViewGroup.MarginLayoutParams) c0239r0).height)) ? false : true;
    }

    public final int F() {
        RecyclerView recyclerView = this.f3884b;
        AbstractC0220h0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public abstract void F0(RecyclerView recyclerView, int i);

    public final int G() {
        RecyclerView recyclerView = this.f3884b;
        WeakHashMap weakHashMap = O.X.f1226a;
        return recyclerView.getLayoutDirection();
    }

    public final void G0(X x3) {
        X x4 = this.f3887e;
        if (x4 != null && x3 != x4 && x4.f3772e) {
            x4.i();
        }
        this.f3887e = x3;
        RecyclerView recyclerView = this.f3884b;
        H0 h02 = recyclerView.f3681e0;
        h02.f3550g.removeCallbacks(h02);
        h02.f3546c.abortAnimation();
        if (x3.h) {
            Log.w("RecyclerView", "An instance of " + x3.getClass().getSimpleName() + " was started more than once. Each instance of" + x3.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        x3.f3769b = recyclerView;
        x3.f3770c = this;
        int i = x3.f3768a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f3686h0.f3509a = i;
        x3.f3772e = true;
        x3.f3771d = true;
        x3.f3773f = recyclerView.f3696n.q(i);
        x3.f3769b.f3681e0.b();
        x3.h = true;
    }

    public final int H() {
        RecyclerView recyclerView = this.f3884b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean H0() {
        return false;
    }

    public final int I() {
        RecyclerView recyclerView = this.f3884b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int J() {
        RecyclerView recyclerView = this.f3884b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int K() {
        RecyclerView recyclerView = this.f3884b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int N(y0 y0Var, E0 e02) {
        return -1;
    }

    public final void O(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C0239r0) view.getLayoutParams()).f3898b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3884b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3884b.f3692l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean P();

    public void S(int i) {
        RecyclerView recyclerView = this.f3884b;
        if (recyclerView != null) {
            int e4 = recyclerView.f3682f.e();
            for (int i4 = 0; i4 < e4; i4++) {
                recyclerView.f3682f.d(i4).offsetLeftAndRight(i);
            }
        }
    }

    public void T(int i) {
        RecyclerView recyclerView = this.f3884b;
        if (recyclerView != null) {
            int e4 = recyclerView.f3682f.e();
            for (int i4 = 0; i4 < e4; i4++) {
                recyclerView.f3682f.d(i4).offsetTopAndBottom(i);
            }
        }
    }

    public void U() {
    }

    public void V(RecyclerView recyclerView) {
    }

    public abstract void W(RecyclerView recyclerView);

    public abstract View X(View view, int i, y0 y0Var, E0 e02);

    public void Y(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3884b;
        y0 y0Var = recyclerView.f3676c;
        E0 e02 = recyclerView.f3686h0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z3 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3884b.canScrollVertically(-1) && !this.f3884b.canScrollHorizontally(-1) && !this.f3884b.canScrollHorizontally(1)) {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        AbstractC0220h0 abstractC0220h0 = this.f3884b.f3694m;
        if (abstractC0220h0 != null) {
            accessibilityEvent.setItemCount(abstractC0220h0.getItemCount());
        }
    }

    public void Z(y0 y0Var, E0 e02, P.k kVar) {
        if (this.f3884b.canScrollVertically(-1) || this.f3884b.canScrollHorizontally(-1)) {
            kVar.a(8192);
            kVar.j(true);
        }
        if (this.f3884b.canScrollVertically(1) || this.f3884b.canScrollHorizontally(1)) {
            kVar.a(ConstantsKt.DEFAULT_BLOCK_SIZE);
            kVar.j(true);
        }
        kVar.f1341a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) A.a.s(N(y0Var, e02), x(y0Var, e02), 0).f7b);
    }

    public final void a0(View view, P.k kVar) {
        I0 N3 = RecyclerView.N(view);
        if (N3 == null || N3.isRemoved()) {
            return;
        }
        C0223j c0223j = this.f3883a;
        if (c0223j.f3828c.contains(N3.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.f3884b;
        b0(recyclerView.f3676c, recyclerView.f3686h0, view, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC0238q0.b(android.view.View, int, boolean):void");
    }

    public void b0(y0 y0Var, E0 e02, View view, P.k kVar) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f3884b;
        if (recyclerView != null) {
            recyclerView.l(str);
        }
    }

    public void c0(int i, int i4) {
    }

    public abstract boolean d();

    public void d0() {
    }

    public abstract boolean e();

    public void e0(int i, int i4) {
    }

    public boolean f(C0239r0 c0239r0) {
        return c0239r0 != null;
    }

    public void f0(int i, int i4) {
    }

    public void g0(int i, int i4) {
    }

    public void h(int i, int i4, E0 e02, Z2.y yVar) {
    }

    public abstract void h0(y0 y0Var, E0 e02);

    public void i(int i, Z2.y yVar) {
    }

    public abstract void i0(E0 e02);

    public abstract int j(E0 e02);

    public void j0(Parcelable parcelable) {
    }

    public abstract int k(E0 e02);

    public Parcelable k0() {
        return null;
    }

    public abstract int l(E0 e02);

    public void l0(int i) {
    }

    public abstract int m(E0 e02);

    /* JADX WARN: Removed duplicated region for block: B:14:0x008d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m0(androidx.recyclerview.widget.y0 r3, androidx.recyclerview.widget.E0 r4, int r5, android.os.Bundle r6) {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r2.f3884b
            r4 = 0
            if (r3 != 0) goto L7
            goto L8f
        L7:
            int r3 = r2.f3895o
            int r6 = r2.f3894n
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r2.f3884b
            android.graphics.Matrix r1 = r1.getMatrix()
            boolean r1 = r1.isIdentity()
            if (r1 == 0) goto L2c
            androidx.recyclerview.widget.RecyclerView r1 = r2.f3884b
            boolean r1 = r1.getGlobalVisibleRect(r0)
            if (r1 == 0) goto L2c
            int r3 = r0.height()
            int r6 = r0.width()
        L2c:
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 1
            if (r5 == r0) goto L64
            r0 = 8192(0x2000, float:1.148E-41)
            if (r5 == r0) goto L38
            r3 = r4
            r5 = r3
            goto L8b
        L38:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f3884b
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L4d
            int r5 = r2.K()
            int r3 = r3 - r5
            int r5 = r2.H()
            int r3 = r3 - r5
            int r3 = -r3
            goto L4e
        L4d:
            r3 = r4
        L4e:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f3884b
            boolean r5 = r5.canScrollHorizontally(r0)
            if (r5 == 0) goto L62
            int r5 = r2.I()
            int r6 = r6 - r5
            int r5 = r2.J()
            int r6 = r6 - r5
            int r5 = -r6
            goto L8b
        L62:
            r5 = r4
            goto L8b
        L64:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f3884b
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L77
            int r5 = r2.K()
            int r3 = r3 - r5
            int r5 = r2.H()
            int r3 = r3 - r5
            goto L78
        L77:
            r3 = r4
        L78:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f3884b
            boolean r5 = r5.canScrollHorizontally(r1)
            if (r5 == 0) goto L62
            int r5 = r2.I()
            int r6 = r6 - r5
            int r5 = r2.J()
            int r5 = r6 - r5
        L8b:
            if (r3 != 0) goto L90
            if (r5 != 0) goto L90
        L8f:
            return r4
        L90:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f3884b
            r2.l0(r5, r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC0238q0.m0(androidx.recyclerview.widget.y0, androidx.recyclerview.widget.E0, int, android.os.Bundle):boolean");
    }

    public abstract int n(E0 e02);

    public final void n0(y0 y0Var) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            if (!RecyclerView.N(u(v3)).shouldIgnore()) {
                q0(v3, y0Var);
            }
        }
    }

    public abstract int o(E0 e02);

    public final void o0(y0 y0Var) {
        ArrayList arrayList;
        int size = y0Var.f3936a.size();
        int i = size - 1;
        while (true) {
            arrayList = y0Var.f3936a;
            if (i < 0) {
                break;
            }
            View view = ((I0) arrayList.get(i)).itemView;
            I0 N3 = RecyclerView.N(view);
            if (!N3.shouldIgnore()) {
                N3.setIsRecyclable(false);
                if (N3.isTmpDetached()) {
                    this.f3884b.removeDetachedView(view, false);
                }
                AbstractC0230m0 abstractC0230m0 = this.f3884b.f3661M;
                if (abstractC0230m0 != null) {
                    abstractC0230m0.d(N3);
                }
                N3.setIsRecyclable(true);
                I0 N4 = RecyclerView.N(view);
                N4.mScrapContainer = null;
                N4.mInChangeScrap = false;
                N4.clearReturnedFromScrapFlag();
                y0Var.i(N4);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = y0Var.f3937b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3884b.invalidate();
        }
    }

    public final void p(y0 y0Var) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            I0 N3 = RecyclerView.N(u3);
            if (N3.shouldIgnore()) {
                if (RecyclerView.f3642B0) {
                    Log.d("RecyclerView", "ignoring view " + N3);
                }
            } else if (!N3.isInvalid() || N3.isRemoved() || this.f3884b.f3694m.hasStableIds()) {
                u(v3);
                this.f3883a.c(v3);
                y0Var.j(u3);
                this.f3884b.f3684g.E(N3);
            } else {
                r0(v3);
                y0Var.i(N3);
            }
        }
    }

    public final void p0(View view, y0 y0Var) {
        C0223j c0223j = this.f3883a;
        C0216f0 c0216f0 = c0223j.f3826a;
        int i = c0223j.f3829d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0223j.f3829d = 1;
            c0223j.f3830e = view;
            int indexOfChild = c0216f0.f3809a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (c0223j.f3827b.g(indexOfChild)) {
                    c0223j.j(view);
                }
                c0216f0.h(indexOfChild);
            }
            c0223j.f3829d = 0;
            c0223j.f3830e = null;
            y0Var.h(view);
        } catch (Throwable th) {
            c0223j.f3829d = 0;
            c0223j.f3830e = null;
            throw th;
        }
    }

    public View q(int i) {
        int v3 = v();
        for (int i4 = 0; i4 < v3; i4++) {
            View u3 = u(i4);
            I0 N3 = RecyclerView.N(u3);
            if (N3 != null && N3.getLayoutPosition() == i && !N3.shouldIgnore() && (this.f3884b.f3686h0.f3515g || !N3.isRemoved())) {
                return u3;
            }
        }
        return null;
    }

    public final void q0(int i, y0 y0Var) {
        View u3 = u(i);
        r0(i);
        y0Var.h(u3);
    }

    public abstract C0239r0 r();

    public final void r0(int i) {
        if (u(i) != null) {
            C0223j c0223j = this.f3883a;
            C0216f0 c0216f0 = c0223j.f3826a;
            int i4 = c0223j.f3829d;
            if (i4 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i4 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int f2 = c0223j.f(i);
                View childAt = c0216f0.f3809a.getChildAt(f2);
                if (childAt != null) {
                    c0223j.f3829d = 1;
                    c0223j.f3830e = childAt;
                    if (c0223j.f3827b.g(f2)) {
                        c0223j.j(childAt);
                    }
                    c0216f0.h(f2);
                }
                c0223j.f3829d = 0;
                c0223j.f3830e = null;
            } catch (Throwable th) {
                c0223j.f3829d = 0;
                c0223j.f3830e = null;
                throw th;
            }
        }
    }

    public C0239r0 s(Context context, AttributeSet attributeSet) {
        return new C0239r0(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.I()
            int r1 = r8.K()
            int r2 = r8.f3894n
            int r3 = r8.J()
            int r2 = r2 - r3
            int r3 = r8.f3895o
            int r4 = r8.H()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.G()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.I()
            int r2 = r8.K()
            int r3 = r8.f3894n
            int r4 = r8.J()
            int r3 = r3 - r4
            int r4 = r8.f3895o
            int r5 = r8.H()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3884b
            android.graphics.Rect r5 = r5.f3688j
            r8.z(r5, r13)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb3
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb3
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb3
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.l0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC0238q0.s0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public C0239r0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0239r0 ? new C0239r0((C0239r0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0239r0((ViewGroup.MarginLayoutParams) layoutParams) : new C0239r0(layoutParams);
    }

    public final void t0() {
        RecyclerView recyclerView = this.f3884b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final View u(int i) {
        C0223j c0223j = this.f3883a;
        if (c0223j != null) {
            return c0223j.d(i);
        }
        return null;
    }

    public abstract int u0(int i, y0 y0Var, E0 e02);

    public final int v() {
        C0223j c0223j = this.f3883a;
        if (c0223j != null) {
            return c0223j.e();
        }
        return 0;
    }

    public abstract void v0(int i);

    public abstract int w0(int i, y0 y0Var, E0 e02);

    public int x(y0 y0Var, E0 e02) {
        return -1;
    }

    public final void x0(RecyclerView recyclerView) {
        y0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void y0(int i, int i4) {
        this.f3894n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f3892l = mode;
        if (mode == 0 && !RecyclerView.E0) {
            this.f3894n = 0;
        }
        this.f3895o = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f3893m = mode2;
        if (mode2 != 0 || RecyclerView.E0) {
            return;
        }
        this.f3895o = 0;
    }

    public void z(Rect rect, View view) {
        RecyclerView.O(rect, view);
    }

    public void z0(Rect rect, int i, int i4) {
        int J = J() + I() + rect.width();
        int H3 = H() + K() + rect.height();
        RecyclerView recyclerView = this.f3884b;
        WeakHashMap weakHashMap = O.X.f1226a;
        RecyclerView.g(this.f3884b, g(i, J, recyclerView.getMinimumWidth()), g(i4, H3, this.f3884b.getMinimumHeight()));
    }
}
