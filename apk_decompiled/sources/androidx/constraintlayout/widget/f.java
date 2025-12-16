package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import u.AbstractC0629f;
import x.C0653b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f2617a;

    /* renamed from: b, reason: collision with root package name */
    public int f2618b;

    /* renamed from: c, reason: collision with root package name */
    public int f2619c;

    /* renamed from: d, reason: collision with root package name */
    public int f2620d;

    /* renamed from: e, reason: collision with root package name */
    public int f2621e;

    /* renamed from: f, reason: collision with root package name */
    public int f2622f;

    /* renamed from: g, reason: collision with root package name */
    public int f2623g;
    public final /* synthetic */ ConstraintLayout h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f2617a = constraintLayout2;
    }

    public static boolean a(int i, int i4, int i5) {
        if (i == i4) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i5 == size;
        }
        return false;
    }

    public final void b(w.d dVar, C0653b c0653b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int max2;
        int i;
        boolean z3;
        int baseline;
        int i4;
        int i5;
        if (dVar == null) {
            return;
        }
        if (dVar.f8700g0 == 8) {
            c0653b.f8815e = 0;
            c0653b.f8816f = 0;
            c0653b.f8817g = 0;
            return;
        }
        if (dVar.f8681T == null) {
            return;
        }
        int i6 = c0653b.f8811a;
        int i7 = c0653b.f8812b;
        int i8 = c0653b.f8813c;
        int i9 = c0653b.f8814d;
        int i10 = this.f2618b + this.f2619c;
        int i11 = this.f2620d;
        View view = dVar.f8698f0;
        int b4 = AbstractC0629f.b(i6);
        w.c cVar = dVar.f8672K;
        w.c cVar2 = dVar.f8671I;
        if (b4 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else if (b4 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2622f, i11, -2);
        } else if (b4 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2622f, i11, -2);
            boolean z4 = dVar.f8717r == 1;
            int i12 = c0653b.f8818j;
            if (i12 == 1 || i12 == 2) {
                boolean z5 = view.getMeasuredHeight() == dVar.k();
                if (c0653b.f8818j == 2 || !z4 || ((z4 && z5) || dVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (b4 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i13 = this.f2622f;
            int i14 = cVar2 != null ? cVar2.f8662g : 0;
            if (cVar != null) {
                i14 += cVar.f8662g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i11 + i14, -1);
        }
        int b5 = AbstractC0629f.b(i7);
        if (b5 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else if (b5 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2623g, i10, -2);
        } else if (b5 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2623g, i10, -2);
            boolean z6 = dVar.f8718s == 1;
            int i15 = c0653b.f8818j;
            if (i15 == 1 || i15 == 2) {
                boolean z7 = view.getMeasuredWidth() == dVar.q();
                if (c0653b.f8818j == 2 || !z6 || ((z6 && z7) || dVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (b5 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i16 = this.f2623g;
            int i17 = cVar2 != null ? dVar.J.f8662g : 0;
            if (cVar != null) {
                i17 += dVar.f8673L.f8662g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i16, i10 + i17, -1);
        }
        w.e eVar = (w.e) dVar.f8681T;
        ConstraintLayout constraintLayout = this.h;
        if (eVar != null) {
            i5 = constraintLayout.mOptimizationLevel;
            if (w.j.c(i5, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f8688a0 && !dVar.z() && a(dVar.f8669G, makeMeasureSpec, dVar.q()) && a(dVar.f8670H, makeMeasureSpec2, dVar.k())) {
                c0653b.f8815e = dVar.q();
                c0653b.f8816f = dVar.k();
                c0653b.f8817g = dVar.f8688a0;
                return;
            }
        }
        boolean z8 = i6 == 3;
        boolean z9 = i7 == 3;
        boolean z10 = i7 == 4 || i7 == 1;
        boolean z11 = i6 == 4 || i6 == 1;
        boolean z12 = z8 && dVar.f8684W > BitmapDescriptorFactory.HUE_RED;
        boolean z13 = z9 && dVar.f8684W > BitmapDescriptorFactory.HUE_RED;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i18 = c0653b.f8818j;
        if (i18 != 1 && i18 != 2 && z8 && dVar.f8717r == 0 && z9 && dVar.f8718s == 0) {
            baseline = 0;
            z3 = false;
            i4 = -1;
            max2 = 0;
            max = 0;
        } else {
            if ((view instanceof u) && (dVar instanceof w.g)) {
                ((u) view).j((w.g) dVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            dVar.f8669G = makeMeasureSpec;
            dVar.f8670H = makeMeasureSpec2;
            dVar.f8699g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i19 = dVar.f8720u;
            max = i19 > 0 ? Math.max(i19, measuredWidth) : measuredWidth;
            int i20 = dVar.f8721v;
            if (i20 > 0) {
                max = Math.min(i20, max);
            }
            int i21 = dVar.f8723x;
            max2 = i21 > 0 ? Math.max(i21, measuredHeight) : measuredHeight;
            int i22 = dVar.f8724y;
            if (i22 > 0) {
                max2 = Math.min(i22, max2);
            }
            i = constraintLayout.mOptimizationLevel;
            boolean z14 = z11;
            if (!w.j.c(i, 1)) {
                if (z12 && z10) {
                    max = (int) ((max2 * dVar.f8684W) + 0.5f);
                } else if (z13 && z14) {
                    max2 = (int) ((max / dVar.f8684W) + 0.5f);
                }
            }
            if (measuredWidth == max && measuredHeight == max2) {
                baseline = baseline2;
                z3 = false;
            } else {
                if (measuredWidth != max) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                }
                if (measuredHeight != max2) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                }
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                dVar.f8669G = makeMeasureSpec;
                dVar.f8670H = makeMeasureSpec2;
                z3 = false;
                dVar.f8699g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredWidth2;
                max2 = measuredHeight2;
            }
            i4 = -1;
        }
        boolean z15 = baseline != i4 ? true : z3;
        if (max != c0653b.f8813c || max2 != c0653b.f8814d) {
            z3 = true;
        }
        c0653b.i = z3;
        boolean z16 = eVar2.f2583c0 ? true : z15;
        if (z16 && baseline != -1 && dVar.f8688a0 != baseline) {
            c0653b.i = true;
        }
        c0653b.f8815e = max;
        c0653b.f8816f = max2;
        c0653b.h = z16;
        c0653b.f8817g = baseline;
    }
}
