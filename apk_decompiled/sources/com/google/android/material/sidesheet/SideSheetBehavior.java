package com.google.android.material.sidesheet;

import A.b;
import A.e;
import B0.q;
import C.w;
import E2.g;
import E2.j;
import E2.k;
import F.o;
import F2.a;
import O.L;
import O.Q;
import O.X;
import P.f;
import P.t;
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
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.C0253b;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.sidesheet.SideSheetBehavior;
import h2.AbstractC0379a;
import i2.AbstractC0396a;
import j0.C0399a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m3.l;
import y2.InterfaceC0663b;
import y2.h;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends b implements InterfaceC0663b {

    /* renamed from: a, reason: collision with root package name */
    public l f5734a;

    /* renamed from: b, reason: collision with root package name */
    public final g f5735b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f5736c;

    /* renamed from: d, reason: collision with root package name */
    public final k f5737d;

    /* renamed from: e, reason: collision with root package name */
    public final F2.g f5738e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5739f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5740g;
    public int h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5741j;

    /* renamed from: k, reason: collision with root package name */
    public final float f5742k;

    /* renamed from: l, reason: collision with root package name */
    public int f5743l;

    /* renamed from: m, reason: collision with root package name */
    public int f5744m;

    /* renamed from: n, reason: collision with root package name */
    public int f5745n;

    /* renamed from: o, reason: collision with root package name */
    public int f5746o;
    public WeakReference p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f5747q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5748r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f5749s;

    /* renamed from: t, reason: collision with root package name */
    public h f5750t;

    /* renamed from: u, reason: collision with root package name */
    public int f5751u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f5752v;

    /* renamed from: w, reason: collision with root package name */
    public final F2.d f5753w;

    public SideSheetBehavior() {
        this.f5738e = new F2.g(this);
        this.f5740g = true;
        this.h = 5;
        this.f5742k = 0.1f;
        this.f5748r = -1;
        this.f5752v = new LinkedHashSet();
        this.f5753w = new F2.d(this, 0);
    }

    @Override // y2.InterfaceC0663b
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        h hVar = this.f5750t;
        if (hVar == null) {
            return;
        }
        C0253b c0253b = hVar.f8988f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        hVar.f8988f = null;
        int i4 = 5;
        if (c0253b == null || Build.VERSION.SDK_INT < 34) {
            v(5);
            return;
        }
        l lVar = this.f5734a;
        if (lVar != null && lVar.B() != 0) {
            i4 = 3;
        }
        q qVar = new q(this, 2);
        WeakReference weakReference = this.f5747q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int s4 = this.f5734a.s(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: F2.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.f5734a.c0(marginLayoutParams, AbstractC0396a.c(valueAnimator.getAnimatedFraction(), s4, 0));
                    view.requestLayout();
                }
            };
        }
        boolean z3 = c0253b.f4109d == 0;
        WeakHashMap weakHashMap = X.f1226a;
        View view2 = hVar.f8984b;
        boolean z4 = (Gravity.getAbsoluteGravity(i4, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z4 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f2 = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z4) {
            f2 = -f2;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f2);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new C0399a(1));
        ofFloat.setDuration(AbstractC0396a.c(c0253b.f4108c, hVar.f8985c, hVar.f8986d));
        ofFloat.addListener(new y2.g(hVar, z3, i4));
        ofFloat.addListener(qVar);
        ofFloat.start();
    }

    @Override // y2.InterfaceC0663b
    public final void b(C0253b c0253b) {
        h hVar = this.f5750t;
        if (hVar == null) {
            return;
        }
        hVar.f8988f = c0253b;
    }

    @Override // y2.InterfaceC0663b
    public final void c(C0253b c0253b) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        h hVar = this.f5750t;
        if (hVar == null) {
            return;
        }
        l lVar = this.f5734a;
        int i = (lVar == null || lVar.B() == 0) ? 5 : 3;
        if (hVar.f8988f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0253b c0253b2 = hVar.f8988f;
        hVar.f8988f = c0253b;
        if (c0253b2 != null) {
            hVar.a(c0253b.f4108c, c0253b.f4109d == 0, i);
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.p.get();
        WeakReference weakReference2 = this.f5747q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f5734a.c0(marginLayoutParams, (int) ((view.getScaleX() * this.f5743l) + this.f5746o));
        view2.requestLayout();
    }

    @Override // y2.InterfaceC0663b
    public final void d() {
        h hVar = this.f5750t;
        if (hVar == null) {
            return;
        }
        if (hVar.f8988f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0253b c0253b = hVar.f8988f;
        hVar.f8988f = null;
        if (c0253b == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = hVar.f8984b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(hVar.f8987e);
        animatorSet.start();
    }

    @Override // A.b
    public final void g(e eVar) {
        this.p = null;
        this.i = null;
        this.f5750t = null;
    }

    @Override // A.b
    public final void i() {
        this.p = null;
        this.i = null;
        this.f5750t = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (O.Q.b(r4) != null) goto L6;
     */
    @Override // A.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            r2 = this;
            boolean r3 = r4.isShown()
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L12
            java.util.WeakHashMap r3 = O.X.f1226a
            java.lang.CharSequence r3 = O.Q.b(r4)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L5b
        L12:
            boolean r3 = r2.f5740g
            if (r3 == 0) goto L5b
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L26
            android.view.VelocityTracker r4 = r2.f5749s
            if (r4 == 0) goto L26
            r4.recycle()
            r4 = 0
            r2.f5749s = r4
        L26:
            android.view.VelocityTracker r4 = r2.f5749s
            if (r4 != 0) goto L30
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.f5749s = r4
        L30:
            android.view.VelocityTracker r4 = r2.f5749s
            r4.addMovement(r5)
            if (r3 == 0) goto L44
            if (r3 == r0) goto L3d
            r4 = 3
            if (r3 == r4) goto L3d
            goto L4b
        L3d:
            boolean r3 = r2.f5741j
            if (r3 == 0) goto L4b
            r2.f5741j = r1
            return r1
        L44:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.f5751u = r3
        L4b:
            boolean r3 = r2.f5741j
            if (r3 != 0) goto L5a
            X.d r2 = r2.i
            if (r2 == 0) goto L5a
            boolean r2 = r2.p(r5)
            if (r2 == 0) goto L5a
            return r0
        L5a:
            return r1
        L5b:
            r2.f5741j = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.j(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // A.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i4;
        View findViewById;
        int i5 = 0;
        int i6 = 1;
        g gVar = this.f5735b;
        WeakHashMap weakHashMap = X.f1226a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.p == null) {
            this.p = new WeakReference(view);
            this.f5750t = new h(view);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f5739f;
                if (f2 == -1.0f) {
                    f2 = L.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f5736c;
                if (colorStateList != null) {
                    L.q(view, colorStateList);
                }
            }
            int i7 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i7) {
                view.setVisibility(i7);
            }
            z();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (Q.b(view) == null) {
                X.k(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i8 = Gravity.getAbsoluteGravity(((e) view.getLayoutParams()).f11c, i) == 3 ? 1 : 0;
        l lVar = this.f5734a;
        if (lVar == null || lVar.B() != i8) {
            k kVar = this.f5737d;
            e eVar = null;
            if (i8 == 0) {
                this.f5734a = new a(this, i6);
                if (kVar != null) {
                    WeakReference weakReference = this.p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof e)) {
                        eVar = (e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        j e4 = kVar.e();
                        e4.f423f = new E2.a(BitmapDescriptorFactory.HUE_RED);
                        e4.f424g = new E2.a(BitmapDescriptorFactory.HUE_RED);
                        k a2 = e4.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalArgumentException(w.i(i8, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f5734a = new a(this, i5);
                if (kVar != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof e)) {
                        eVar = (e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        j e5 = kVar.e();
                        e5.f422e = new E2.a(BitmapDescriptorFactory.HUE_RED);
                        e5.h = new E2.a(BitmapDescriptorFactory.HUE_RED);
                        k a4 = e5.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a4);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f5753w);
        }
        int z3 = this.f5734a.z(view);
        coordinatorLayout.q(view, i);
        this.f5744m = coordinatorLayout.getWidth();
        this.f5745n = this.f5734a.A(coordinatorLayout);
        this.f5743l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f5746o = marginLayoutParams != null ? this.f5734a.e(marginLayoutParams) : 0;
        int i9 = this.h;
        if (i9 == 1 || i9 == 2) {
            i5 = z3 - this.f5734a.z(view);
        } else if (i9 != 3) {
            if (i9 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i5 = this.f5734a.v();
        }
        view.offsetLeftAndRight(i5);
        if (this.f5747q == null && (i4 = this.f5748r) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.f5747q = new WeakReference(findViewById);
        }
        Iterator it = this.f5752v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // A.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // A.b
    public final void q(View view, Parcelable parcelable) {
        int i = ((F2.e) parcelable).f548c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // A.b
    public final Parcelable r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new F2.e(this);
    }

    @Override // A.b
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (x()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f5749s) != null) {
            velocityTracker.recycle();
            this.f5749s = null;
        }
        if (this.f5749s == null) {
            this.f5749s = VelocityTracker.obtain();
        }
        this.f5749s.addMovement(motionEvent);
        if (x() && actionMasked == 2 && !this.f5741j && x()) {
            float abs = Math.abs(this.f5751u - motionEvent.getX());
            d dVar = this.i;
            if (abs > dVar.f1992b) {
                dVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f5741j;
    }

    public final void v(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(w.r(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            w(i);
            return;
        }
        View view = (View) this.p.get();
        o oVar = new o(i, 1, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = X.f1226a;
            if (view.isAttachedToWindow()) {
                view.post(oVar);
                return;
            }
        }
        oVar.run();
    }

    public final void w(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i4 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i4) {
            view.setVisibility(i4);
        }
        Iterator it = this.f5752v.iterator();
        if (it.hasNext()) {
            throw w.g(it);
        }
        z();
    }

    public final boolean x() {
        if (this.i != null) {
            return this.f5740g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        w(2);
        r2.f5738e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            m3.l r0 = r2.f5734a
            int r0 = r0.v()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid state to get outer edge offset: "
            java.lang.String r3 = com.google.android.gms.measurement.internal.a.l(r4, r3)
            r2.<init>(r3)
            throw r2
        L19:
            m3.l r0 = r2.f5734a
            int r0 = r0.t()
        L1f:
            X.d r1 = r2.i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f2005r = r3
            r3 = -1
            r1.f1993c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f1991a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f2005r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f2005r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.w(r3)
            F2.g r2 = r2.f5738e
            r2.a(r4)
            return
        L57:
            r2.w(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.y(android.view.View, int, boolean):void");
    }

    public final void z() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X.h(view, 262144);
        X.e(view, 0);
        X.h(view, 1048576);
        X.e(view, 0);
        final int i = 5;
        if (this.h != 5) {
            X.i(view, f.f1333j, new t() { // from class: F2.b
                @Override // P.t
                public final boolean d(View view2) {
                    SideSheetBehavior.this.v(i);
                    return true;
                }
            });
        }
        final int i4 = 3;
        if (this.h != 3) {
            X.i(view, f.h, new t() { // from class: F2.b
                @Override // P.t
                public final boolean d(View view2) {
                    SideSheetBehavior.this.v(i4);
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f5738e = new F2.g(this);
        this.f5740g = true;
        this.h = 5;
        this.f5742k = 0.1f;
        this.f5748r = -1;
        this.f5752v = new LinkedHashSet();
        this.f5753w = new F2.d(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0379a.f6747A);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f5736c = AbstractC0105a.w(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f5737d = k.b(context, attributeSet, 0, 2132018235).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f5748r = resourceId;
            WeakReference weakReference = this.f5747q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f5747q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = X.f1226a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f5737d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f5735b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f5736c;
            if (colorStateList != null) {
                this.f5735b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f5735b.setTint(typedValue.data);
            }
        }
        this.f5739f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f5740g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
