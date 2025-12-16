package com.google.android.material.bottomsheet;

import A.b;
import A.e;
import B0.q;
import C.w;
import E2.k;
import F2.g;
import L.h;
import O.C0054a;
import O.C0056b;
import O.C0060d;
import O.L;
import O.S;
import O.X;
import O.l0;
import O.m0;
import O.o0;
import X.d;
import a.AbstractC0105a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.I;
import b.C0253b;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.messaging.ServiceStarter;
import h2.AbstractC0379a;
import i2.AbstractC0396a;
import j0.C0399a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import x2.m;
import y2.InterfaceC0663b;
import y2.f;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends b implements InterfaceC0663b {

    /* renamed from: A, reason: collision with root package name */
    public final g f5537A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f5538B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5539C;

    /* renamed from: D, reason: collision with root package name */
    public int f5540D;

    /* renamed from: E, reason: collision with root package name */
    public int f5541E;

    /* renamed from: F, reason: collision with root package name */
    public final float f5542F;

    /* renamed from: G, reason: collision with root package name */
    public int f5543G;

    /* renamed from: H, reason: collision with root package name */
    public final float f5544H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5545I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f5546K;

    /* renamed from: L, reason: collision with root package name */
    public int f5547L;

    /* renamed from: M, reason: collision with root package name */
    public d f5548M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5549N;

    /* renamed from: O, reason: collision with root package name */
    public int f5550O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f5551P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f5552Q;

    /* renamed from: R, reason: collision with root package name */
    public int f5553R;

    /* renamed from: S, reason: collision with root package name */
    public int f5554S;

    /* renamed from: T, reason: collision with root package name */
    public int f5555T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f5556U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f5557V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f5558W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f5559X;

    /* renamed from: Y, reason: collision with root package name */
    public f f5560Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f5561a;

    /* renamed from: a0, reason: collision with root package name */
    public int f5562a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5563b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f5564b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f5565c;

    /* renamed from: c0, reason: collision with root package name */
    public HashMap f5566c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f5567d;

    /* renamed from: d0, reason: collision with root package name */
    public final SparseIntArray f5568d0;

    /* renamed from: e, reason: collision with root package name */
    public int f5569e;

    /* renamed from: e0, reason: collision with root package name */
    public final F2.d f5570e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5571f;

    /* renamed from: g, reason: collision with root package name */
    public int f5572g;
    public final int h;
    public final E2.g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f5573j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5574k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5575l;

    /* renamed from: m, reason: collision with root package name */
    public int f5576m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5577n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5578o;
    public final boolean p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5579q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5580r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5581s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5582t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f5583u;

    /* renamed from: v, reason: collision with root package name */
    public int f5584v;

    /* renamed from: w, reason: collision with root package name */
    public int f5585w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5586x;

    /* renamed from: y, reason: collision with root package name */
    public final k f5587y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5588z;

    public BottomSheetBehavior() {
        this.f5561a = 0;
        this.f5563b = true;
        this.f5574k = -1;
        this.f5575l = -1;
        this.f5537A = new g(this);
        this.f5542F = 0.5f;
        this.f5544H = -1.0f;
        this.f5546K = true;
        this.f5547L = 4;
        this.f5552Q = 0.1f;
        this.f5558W = new ArrayList();
        this.f5562a0 = -1;
        this.f5568d0 = new SparseIntArray();
        this.f5570e0 = new F2.d(this, 1);
    }

    public static BottomSheetBehavior A(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        b bVar = ((e) layoutParams).f9a;
        if (bVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) bVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int B(int i, int i4, int i5, int i6) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i4, i6);
        if (i5 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
        }
        if (size != 0) {
            i5 = Math.min(size, i5);
        }
        return View.MeasureSpec.makeMeasureSpec(i5, IntCompanionObject.MIN_VALUE);
    }

    public static View z(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = X.f1226a;
        if (L.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View z3 = z(viewGroup.getChildAt(i));
            if (z3 != null) {
                return z3;
            }
        }
        return null;
    }

    public final int C() {
        if (this.f5563b) {
            return this.f5540D;
        }
        return Math.max(this.f5539C, this.f5580r ? 0 : this.f5585w);
    }

    public final int D(int i) {
        if (i == 3) {
            return C();
        }
        if (i == 4) {
            return this.f5543G;
        }
        if (i == 5) {
            return this.f5555T;
        }
        if (i == 6) {
            return this.f5541E;
        }
        throw new IllegalArgumentException(a.l(i, "Invalid state to get top offset: "));
    }

    public final boolean E() {
        WeakReference weakReference = this.f5556U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f5556U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void F(boolean z3) {
        if (this.f5545I != z3) {
            this.f5545I = z3;
            if (!z3 && this.f5547L == 5) {
                H(4);
            }
            L();
        }
    }

    public final void G(int i) {
        if (i == -1) {
            if (this.f5571f) {
                return;
            } else {
                this.f5571f = true;
            }
        } else {
            if (!this.f5571f && this.f5569e == i) {
                return;
            }
            this.f5571f = false;
            this.f5569e = Math.max(0, i);
        }
        O();
    }

    public final void H(int i) {
        int i4 = 2;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(w.r(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f5545I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i5 = (i == 6 && this.f5563b && D(i) <= this.f5540D) ? 3 : i;
        WeakReference weakReference = this.f5556U;
        if (weakReference == null || weakReference.get() == null) {
            I(i);
            return;
        }
        View view = (View) this.f5556U.get();
        I i6 = new I(this, i5, i4, view);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = X.f1226a;
            if (view.isAttachedToWindow()) {
                view.post(i6);
                return;
            }
        }
        i6.run();
    }

    public final void I(int i) {
        View view;
        if (this.f5547L == i) {
            return;
        }
        this.f5547L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z3 = this.f5545I;
        }
        WeakReference weakReference = this.f5556U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i4 = 0;
        if (i == 3) {
            N(true);
        } else if (i == 6 || i == 5 || i == 4) {
            N(false);
        }
        M(i, true);
        while (true) {
            ArrayList arrayList = this.f5558W;
            if (i4 >= arrayList.size()) {
                L();
                return;
            } else {
                ((o2.a) arrayList.get(i4)).onStateChanged(view, i);
                i4++;
            }
        }
    }

    public final boolean J(View view, float f2) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.f5543G) {
            return false;
        }
        return Math.abs(((f2 * this.f5552Q) + ((float) view.getTop())) - ((float) this.f5543G)) / ((float) x()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        I(2);
        M(r4, true);
        r2.f5537A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.D(r4)
            X.d r1 = r2.f5548M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f2005r = r3
            r3 = -1
            r1.f1993c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f1991a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f2005r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f2005r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.I(r3)
            r3 = 1
            r2.M(r4, r3)
            F2.g r2 = r2.f5537A
            r2.a(r4)
            return
        L40:
            r2.I(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.K(android.view.View, int, boolean):void");
    }

    public final void L() {
        View view;
        int i;
        WeakReference weakReference = this.f5556U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X.h(view, 524288);
        X.e(view, 0);
        X.h(view, 262144);
        X.e(view, 0);
        X.h(view, 1048576);
        X.e(view, 0);
        SparseIntArray sparseIntArray = this.f5568d0;
        int i4 = sparseIntArray.get(0, -1);
        if (i4 != -1) {
            X.h(view, i4);
            X.e(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f5563b && this.f5547L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            h hVar = new h(this, 6);
            ArrayList c4 = X.c(view);
            int i5 = 0;
            while (true) {
                if (i5 >= c4.size()) {
                    int i6 = -1;
                    for (int i7 = 0; i7 < 32 && i6 == -1; i7++) {
                        int i8 = X.f1227b[i7];
                        boolean z3 = true;
                        for (int i9 = 0; i9 < c4.size(); i9++) {
                            z3 &= ((P.f) c4.get(i9)).a() != i8;
                        }
                        if (z3) {
                            i6 = i8;
                        }
                    }
                    i = i6;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((P.f) c4.get(i5)).f1336a).getLabel())) {
                        i = ((P.f) c4.get(i5)).a();
                        break;
                    }
                    i5++;
                }
            }
            if (i != -1) {
                P.f fVar = new P.f(null, i, string, hVar, null);
                View.AccessibilityDelegate a2 = S.a(view);
                C0056b c0056b = a2 == null ? null : a2 instanceof C0054a ? ((C0054a) a2).f1230a : new C0056b(a2);
                if (c0056b == null) {
                    c0056b = new C0056b();
                }
                X.j(view, c0056b);
                X.h(view, fVar.a());
                X.c(view).add(fVar);
                X.e(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f5545I && this.f5547L != 5) {
            X.i(view, P.f.f1333j, new h(this, 5));
        }
        int i10 = this.f5547L;
        if (i10 == 3) {
            X.i(view, P.f.i, new h(this, this.f5563b ? 4 : 6));
            return;
        }
        if (i10 == 4) {
            X.i(view, P.f.h, new h(this, this.f5563b ? 3 : 6));
        } else {
            if (i10 != 6) {
                return;
            }
            X.i(view, P.f.i, new h(this, 4));
            X.i(view, P.f.h, new h(this, 3));
        }
    }

    public final void M(int i, boolean z3) {
        E2.g gVar = this.i;
        ValueAnimator valueAnimator = this.f5538B;
        if (i == 2) {
            return;
        }
        boolean z4 = this.f5547L == 3 && (this.f5586x || E());
        if (this.f5588z == z4 || gVar == null) {
            return;
        }
        this.f5588z = z4;
        if (z3 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f400a.i, z4 ? w() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float w3 = this.f5588z ? w() : 1.0f;
        E2.f fVar = gVar.f400a;
        if (fVar.i != w3) {
            fVar.i = w3;
            gVar.f404e = true;
            gVar.invalidateSelf();
        }
    }

    public final void N(boolean z3) {
        WeakReference weakReference = this.f5556U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z3) {
                if (this.f5566c0 != null) {
                    return;
                } else {
                    this.f5566c0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f5556U.get() && z3) {
                    this.f5566c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z3) {
                return;
            }
            this.f5566c0 = null;
        }
    }

    public final void O() {
        View view;
        if (this.f5556U != null) {
            v();
            if (this.f5547L != 4 || (view = (View) this.f5556U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // y2.InterfaceC0663b
    public final void a() {
        f fVar = this.f5560Y;
        if (fVar == null) {
            return;
        }
        C0253b c0253b = fVar.f8988f;
        fVar.f8988f = null;
        if (c0253b == null || Build.VERSION.SDK_INT < 34) {
            H(this.f5545I ? 5 : 4);
            return;
        }
        boolean z3 = this.f5545I;
        int i = fVar.f8986d;
        int i4 = fVar.f8985c;
        float f2 = c0253b.f4108c;
        if (!z3) {
            AnimatorSet a2 = fVar.a();
            a2.setDuration(AbstractC0396a.c(f2, i4, i));
            a2.start();
            H(4);
            return;
        }
        q qVar = new q(this, 7);
        View view = fVar.f8984b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        ofFloat.setInterpolator(new C0399a(1));
        ofFloat.setDuration(AbstractC0396a.c(f2, i4, i));
        ofFloat.addListener(new q(fVar, 8));
        ofFloat.addListener(qVar);
        ofFloat.start();
    }

    @Override // y2.InterfaceC0663b
    public final void b(C0253b c0253b) {
        f fVar = this.f5560Y;
        if (fVar == null) {
            return;
        }
        fVar.f8988f = c0253b;
    }

    @Override // y2.InterfaceC0663b
    public final void c(C0253b c0253b) {
        f fVar = this.f5560Y;
        if (fVar == null) {
            return;
        }
        if (fVar.f8988f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0253b c0253b2 = fVar.f8988f;
        fVar.f8988f = c0253b;
        if (c0253b2 == null) {
            return;
        }
        fVar.b(c0253b.f4108c);
    }

    @Override // y2.InterfaceC0663b
    public final void d() {
        f fVar = this.f5560Y;
        if (fVar == null) {
            return;
        }
        if (fVar.f8988f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0253b c0253b = fVar.f8988f;
        fVar.f8988f = null;
        if (c0253b == null) {
            return;
        }
        AnimatorSet a2 = fVar.a();
        a2.setDuration(fVar.f8987e);
        a2.start();
    }

    @Override // A.b
    public final void g(e eVar) {
        this.f5556U = null;
        this.f5548M = null;
        this.f5560Y = null;
    }

    @Override // A.b
    public final void i() {
        this.f5556U = null;
        this.f5548M = null;
        this.f5560Y = null;
    }

    @Override // A.b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        d dVar;
        if (!view.isShown() || !this.f5546K) {
            this.f5549N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Z = -1;
            this.f5562a0 = -1;
            VelocityTracker velocityTracker = this.f5559X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5559X = null;
            }
        }
        if (this.f5559X == null) {
            this.f5559X = VelocityTracker.obtain();
        }
        this.f5559X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x3 = (int) motionEvent.getX();
            this.f5562a0 = (int) motionEvent.getY();
            if (this.f5547L != 2) {
                WeakReference weakReference = this.f5557V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x3, this.f5562a0)) {
                    this.Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f5564b0 = true;
                }
            }
            this.f5549N = this.Z == -1 && !coordinatorLayout.o(view, x3, this.f5562a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5564b0 = false;
            this.Z = -1;
            if (this.f5549N) {
                this.f5549N = false;
                return false;
            }
        }
        if (this.f5549N || (dVar = this.f5548M) == null || !dVar.p(motionEvent)) {
            WeakReference weakReference2 = this.f5557V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f5549N || this.f5547L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f5548M == null || (i = this.f5562a0) == -1 || Math.abs(i - motionEvent.getY()) <= this.f5548M.f1992b) {
                return false;
            }
        }
        return true;
    }

    @Override // A.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i4 = this.f5575l;
        E2.g gVar = this.i;
        WeakHashMap weakHashMap = X.f1226a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i5 = 0;
        if (this.f5556U == null) {
            this.f5572g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z3 = (this.f5577n || this.f5571f) ? false : true;
            if (this.f5578o || this.p || this.f5579q || this.f5581s || this.f5582t || this.f5583u || z3) {
                m.d(view, new M.g(this, z3));
            }
            C0060d c0060d = new C0060d(view);
            if (Build.VERSION.SDK_INT >= 30) {
                view.setWindowInsetsAnimationCallback(new o0(c0060d));
            } else {
                PathInterpolator pathInterpolator = m0.f1270e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener l0Var = new l0(view, c0060d);
                view.setTag(R.id.tag_window_insets_animation_callback, l0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(l0Var);
                }
            }
            this.f5556U = new WeakReference(view);
            this.f5560Y = new f(view);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f5544H;
                if (f2 == -1.0f) {
                    f2 = L.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f5573j;
                if (colorStateList != null) {
                    L.q(view, colorStateList);
                }
            }
            L();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f5548M == null) {
            this.f5548M = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f5570e0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f5554S = coordinatorLayout.getWidth();
        this.f5555T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f5553R = height;
        int i6 = this.f5555T;
        int i7 = i6 - height;
        int i8 = this.f5585w;
        if (i7 < i8) {
            if (this.f5580r) {
                if (i4 != -1) {
                    i6 = Math.min(i6, i4);
                }
                this.f5553R = i6;
            } else {
                int i9 = i6 - i8;
                if (i4 != -1) {
                    i9 = Math.min(i9, i4);
                }
                this.f5553R = i9;
            }
        }
        this.f5540D = Math.max(0, this.f5555T - this.f5553R);
        this.f5541E = (int) ((1.0f - this.f5542F) * this.f5555T);
        v();
        int i10 = this.f5547L;
        if (i10 == 3) {
            view.offsetTopAndBottom(C());
        } else if (i10 == 6) {
            view.offsetTopAndBottom(this.f5541E);
        } else if (this.f5545I && i10 == 5) {
            view.offsetTopAndBottom(this.f5555T);
        } else if (i10 == 4) {
            view.offsetTopAndBottom(this.f5543G);
        } else if (i10 == 1 || i10 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        M(this.f5547L, false);
        this.f5557V = new WeakReference(z(view));
        while (true) {
            ArrayList arrayList = this.f5558W;
            if (i5 >= arrayList.size()) {
                return true;
            }
            ((o2.a) arrayList.get(i5)).onLayout(view);
            i5++;
        }
    }

    @Override // A.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(B(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.f5574k, marginLayoutParams.width), B(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f5575l, marginLayoutParams.height));
        return true;
    }

    @Override // A.b
    public final boolean m(View view) {
        WeakReference weakReference = this.f5557V;
        return (weakReference == null || view != weakReference.get() || this.f5547L == 3) ? false : true;
    }

    @Override // A.b
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i5) {
        if (i5 == 1) {
            return;
        }
        WeakReference weakReference = this.f5557V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i6 = top - i4;
        if (i4 > 0) {
            if (i6 < C()) {
                int C3 = top - C();
                iArr[1] = C3;
                int i7 = -C3;
                WeakHashMap weakHashMap = X.f1226a;
                view.offsetTopAndBottom(i7);
                I(3);
            } else {
                if (!this.f5546K) {
                    return;
                }
                iArr[1] = i4;
                WeakHashMap weakHashMap2 = X.f1226a;
                view.offsetTopAndBottom(-i4);
                I(1);
            }
        } else if (i4 < 0 && !view2.canScrollVertically(-1)) {
            int i8 = this.f5543G;
            if (i6 > i8 && !this.f5545I) {
                int i9 = top - i8;
                iArr[1] = i9;
                int i10 = -i9;
                WeakHashMap weakHashMap3 = X.f1226a;
                view.offsetTopAndBottom(i10);
                I(4);
            } else {
                if (!this.f5546K) {
                    return;
                }
                iArr[1] = i4;
                WeakHashMap weakHashMap4 = X.f1226a;
                view.offsetTopAndBottom(-i4);
                I(1);
            }
        }
        y(view.getTop());
        this.f5550O = i4;
        this.f5551P = true;
    }

    @Override // A.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5, int[] iArr) {
    }

    @Override // A.b
    public final void q(View view, Parcelable parcelable) {
        o2.b bVar = (o2.b) parcelable;
        int i = this.f5561a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f5569e = bVar.f8083d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f5563b = bVar.f8084e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f5545I = bVar.f8085f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = bVar.f8086g;
            }
        }
        int i4 = bVar.f8082c;
        if (i4 == 1 || i4 == 2) {
            this.f5547L = 4;
        } else {
            this.f5547L = i4;
        }
    }

    @Override // A.b
    public final Parcelable r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new o2.b(this);
    }

    @Override // A.b
    public final boolean s(View view, int i, int i4) {
        this.f5550O = 0;
        this.f5551P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f5541E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f5540D) < java.lang.Math.abs(r5 - r3.f5543G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f5543G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f5543G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f5541E) < java.lang.Math.abs(r5 - r3.f5543G)) goto L50;
     */
    @Override // A.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.C()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.I(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f5557V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f5551P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f5550O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f5563b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f5541E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f5545I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f5559X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f5565c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f5559X
            int r0 = r3.Z
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.J(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f5550O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f5563b
            if (r2 == 0) goto L74
            int r6 = r3.f5540D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f5543G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f5541E
            if (r5 >= r2) goto L83
            int r0 = r3.f5543G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f5543G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f5563b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f5541E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f5543G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.K(r4, r1, r5)
            r3.f5551P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t(android.view.View, android.view.View, int):void");
    }

    @Override // A.b
    public final boolean u(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f5547L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.f5548M;
        if (dVar != null && (this.f5546K || i == 1)) {
            dVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.Z = -1;
            this.f5562a0 = -1;
            VelocityTracker velocityTracker = this.f5559X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5559X = null;
            }
        }
        if (this.f5559X == null) {
            this.f5559X = VelocityTracker.obtain();
        }
        this.f5559X.addMovement(motionEvent);
        if (this.f5548M != null && ((this.f5546K || this.f5547L == 1) && actionMasked == 2 && !this.f5549N)) {
            float abs = Math.abs(this.f5562a0 - motionEvent.getY());
            d dVar2 = this.f5548M;
            if (abs > dVar2.f1992b) {
                dVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f5549N;
    }

    public final void v() {
        int x3 = x();
        if (this.f5563b) {
            this.f5543G = Math.max(this.f5555T - x3, this.f5540D);
        } else {
            this.f5543G = this.f5555T - x3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float w() {
        /*
            r5 = this;
            E2.g r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f5556U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f5556U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.E()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            E2.g r2 = r5.i
            E2.f r3 = r2.f400a
            E2.k r3 = r3.f386a
            E2.c r3 = r3.f432e
            android.graphics.RectF r2 = r2.f()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = B2.e.i(r0)
            if (r3 == 0) goto L4e
            int r3 = B2.e.c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            E2.g r5 = r5.i
            E2.f r2 = r5.f400a
            E2.k r2 = r2.f386a
            E2.c r2 = r2.f433f
            android.graphics.RectF r5 = r5.f()
            float r5 = r2.a(r5)
            android.view.RoundedCorner r0 = B2.e.n(r0)
            if (r0 == 0) goto L74
            int r0 = B2.e.c(r0)
            float r0 = (float) r0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L74
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 <= 0) goto L74
            float r1 = r0 / r5
        L74:
            float r5 = java.lang.Math.max(r3, r1)
            return r5
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.w():float");
    }

    public final int x() {
        int i;
        int i4;
        int i5;
        if (this.f5571f) {
            i = Math.min(Math.max(this.f5572g, this.f5555T - ((this.f5554S * 9) / 16)), this.f5553R);
            i4 = this.f5584v;
        } else {
            if (!this.f5577n && !this.f5578o && (i5 = this.f5576m) > 0) {
                return Math.max(this.f5569e, i5 + this.h);
            }
            i = this.f5569e;
            i4 = this.f5584v;
        }
        return i + i4;
    }

    public final void y(int i) {
        float f2;
        float f4;
        View view = (View) this.f5556U.get();
        if (view != null) {
            ArrayList arrayList = this.f5558W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i4 = this.f5543G;
            if (i > i4 || i4 == C()) {
                int i5 = this.f5543G;
                f2 = i5 - i;
                f4 = this.f5555T - i5;
            } else {
                int i6 = this.f5543G;
                f2 = i6 - i;
                f4 = i6 - C();
            }
            float f5 = f2 / f4;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((o2.a) arrayList.get(i7)).onSlide(view, f5);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f5561a = 0;
        this.f5563b = true;
        this.f5574k = -1;
        this.f5575l = -1;
        this.f5537A = new g(this);
        this.f5542F = 0.5f;
        this.f5544H = -1.0f;
        this.f5546K = true;
        this.f5547L = 4;
        this.f5552Q = 0.1f;
        this.f5558W = new ArrayList();
        this.f5562a0 = -1;
        this.f5568d0 = new SparseIntArray();
        this.f5570e0 = new F2.d(this, 1);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0379a.f6757c);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f5573j = AbstractC0105a.w(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f5587y = k.b(context, attributeSet, R.attr.bottomSheetStyle, 2132018085).a();
        }
        k kVar = this.f5587y;
        if (kVar != null) {
            E2.g gVar = new E2.g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f5573j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(w(), 1.0f);
        this.f5538B = ofFloat;
        ofFloat.setDuration(500L);
        this.f5538B.addUpdateListener(new H2.b(this, 3));
        this.f5544H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f5574k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f5575l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            G(i);
        } else {
            G(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        F(obtainStyledAttributes.getBoolean(8, false));
        this.f5577n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f5563b != z3) {
            this.f5563b = z3;
            if (this.f5556U != null) {
                v();
            }
            I((this.f5563b && this.f5547L == 6) ? 3 : this.f5547L);
            M(this.f5547L, true);
            L();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.f5546K = obtainStyledAttributes.getBoolean(4, true);
        this.f5561a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > BitmapDescriptorFactory.HUE_RED && f2 < 1.0f) {
            this.f5542F = f2;
            if (this.f5556U != null) {
                this.f5541E = (int) ((1.0f - f2) * this.f5555T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i4 = peekValue2.data;
                if (i4 >= 0) {
                    this.f5539C = i4;
                    M(this.f5547L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f5539C = dimensionPixelOffset;
                    M(this.f5547L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f5567d = obtainStyledAttributes.getInt(11, ServiceStarter.ERROR_UNKNOWN);
            this.f5578o = obtainStyledAttributes.getBoolean(17, false);
            this.p = obtainStyledAttributes.getBoolean(18, false);
            this.f5579q = obtainStyledAttributes.getBoolean(19, false);
            this.f5580r = obtainStyledAttributes.getBoolean(20, true);
            this.f5581s = obtainStyledAttributes.getBoolean(14, false);
            this.f5582t = obtainStyledAttributes.getBoolean(15, false);
            this.f5583u = obtainStyledAttributes.getBoolean(16, false);
            this.f5586x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f5565c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
