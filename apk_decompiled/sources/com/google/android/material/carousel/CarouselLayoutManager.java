package com.google.android.material.carousel;

import F2.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.AbstractC0238q0;
import androidx.recyclerview.widget.C0210c0;
import androidx.recyclerview.widget.C0239r0;
import androidx.recyclerview.widget.D0;
import androidx.recyclerview.widget.E0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y0;
import c0.C0277c;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.internal.a;
import com.google.android.material.carousel.CarouselLayoutManager;
import h2.AbstractC0379a;
import kotlin.jvm.internal.LongCompanionObject;
import q2.AbstractC0562d;
import q2.C0560b;
import q2.C0561c;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends AbstractC0238q0 implements D0 {
    public final C0277c p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0562d f5611q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f5612r;

    public CarouselLayoutManager() {
        C0277c c0277c = new C0277c();
        new C0560b();
        this.f5612r = new View.OnLayoutChangeListener() { // from class: q2.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (i == i7 && i4 == i8 && i5 == i9 && i6 == i10) {
                    return;
                }
                view.post(new f(carouselLayoutManager, 11));
            }
        };
        this.p = c0277c;
        t0();
        K0(0);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void F0(RecyclerView recyclerView, int i) {
        C0210c0 c0210c0 = new C0210c0(this, recyclerView.getContext(), 1);
        c0210c0.f3768a = i;
        G0(c0210c0);
    }

    public final boolean I0() {
        return this.f5611q.f8189a == 0;
    }

    public final boolean J0() {
        return I0() && G() == 1;
    }

    public final void K0(int i) {
        C0561c c0561c;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.l(i, "invalid orientation:"));
        }
        c(null);
        AbstractC0562d abstractC0562d = this.f5611q;
        if (abstractC0562d == null || i != abstractC0562d.f8189a) {
            if (i == 0) {
                c0561c = new C0561c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0561c = new C0561c(this, 0);
            }
            this.f5611q = c0561c;
            t0();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean P() {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void V(RecyclerView recyclerView) {
        C0277c c0277c = this.p;
        Context context = recyclerView.getContext();
        float f2 = c0277c.f4206a;
        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0277c.f4206a = f2;
        float f4 = c0277c.f4207b;
        if (f4 <= BitmapDescriptorFactory.HUE_RED) {
            f4 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0277c.f4207b = f4;
        t0();
        recyclerView.addOnLayoutChangeListener(this.f5612r);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void W(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f5612r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (J0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (J0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.AbstractC0238q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View X(android.view.View r4, int r5, androidx.recyclerview.widget.y0 r6, androidx.recyclerview.widget.E0 r7) {
        /*
            r3 = this;
            int r6 = r3.v()
            if (r6 != 0) goto L8
            goto L96
        L8:
            q2.d r6 = r3.f5611q
            int r6 = r6.f8189a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.J0()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.J0()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = androidx.recyclerview.widget.AbstractC0238q0.L(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.u(r6)
            int r4 = androidx.recyclerview.widget.AbstractC0238q0.L(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.F()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            q2.d r3 = r3.f5611q
            r3.e()
            r3 = 0
            throw r3
        L7a:
            boolean r4 = r3.J0()
            if (r4 == 0) goto L86
            int r4 = r3.v()
            int r6 = r4 + (-1)
        L86:
            android.view.View r3 = r3.u(r6)
            return r3
        L8b:
            int r4 = androidx.recyclerview.widget.AbstractC0238q0.L(r4)
            int r5 = r3.F()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r3 = 0
            return r3
        L98:
            int r4 = r3.v()
            int r4 = r4 - r1
            android.view.View r4 = r3.u(r4)
            int r4 = androidx.recyclerview.widget.AbstractC0238q0.L(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.F()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            q2.d r3 = r3.f5611q
            r3.e()
            r3 = 0
            throw r3
        Lb6:
            boolean r4 = r3.J0()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.v()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r3 = r3.u(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.X(android.view.View, int, androidx.recyclerview.widget.y0, androidx.recyclerview.widget.E0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0238q0.L(u(0)));
            accessibilityEvent.setToIndex(AbstractC0238q0.L(u(v() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.D0
    public final PointF a(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void c0(int i, int i4) {
        F();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean d() {
        return I0();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean e() {
        return !I0();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void f0(int i, int i4) {
        F();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void h0(y0 y0Var, E0 e02) {
        if (e02.b() > 0) {
            if ((I0() ? this.f3894n : this.f3895o) > BitmapDescriptorFactory.HUE_RED) {
                J0();
                View view = y0Var.k(0, LongCompanionObject.MAX_VALUE).itemView;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        n0(y0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void i0(E0 e02) {
        if (v() == 0) {
            return;
        }
        AbstractC0238q0.L(u(0));
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int j(E0 e02) {
        v();
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int k(E0 e02) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int l(E0 e02) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int m(E0 e02) {
        v();
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int n(E0 e02) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int o(E0 e02) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final C0239r0 r() {
        return new C0239r0(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean s0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int u0(int i, y0 y0Var, E0 e02) {
        if (!I0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = y0Var.k(0, LongCompanionObject.MAX_VALUE).itemView;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void v0(int i) {
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final int w0(int i, y0 y0Var, E0 e02) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = y0Var.k(0, LongCompanionObject.MAX_VALUE).itemView;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void z(Rect rect, View view) {
        RecyclerView.O(rect, view);
        rect.centerY();
        if (I0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        new C0560b();
        this.f5612r = new View.OnLayoutChangeListener() { // from class: q2.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i42, int i52, int i6, int i7, int i8, int i9, int i10) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (i5 == i7 && i42 == i8 && i52 == i9 && i6 == i10) {
                    return;
                }
                view.post(new f(carouselLayoutManager, 11));
            }
        };
        this.p = new C0277c();
        t0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0379a.f6758d);
            obtainStyledAttributes.getInt(0, 0);
            t0();
            K0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
