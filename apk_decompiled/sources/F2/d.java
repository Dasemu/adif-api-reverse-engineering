package F2;

import C.w;
import a.AbstractC0106b;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m3.l;

/* loaded from: classes3.dex */
public final class d extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A.b f547b;

    public /* synthetic */ d(A.b bVar, int i) {
        this.f546a = i;
        this.f547b = bVar;
    }

    @Override // m3.l
    public int C(View view) {
        switch (this.f546a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f547b;
                return sideSheetBehavior.f5743l + sideSheetBehavior.f5746o;
            default:
                return super.C(view);
        }
    }

    @Override // m3.l
    public int D() {
        switch (this.f546a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f547b;
                return bottomSheetBehavior.f5545I ? bottomSheetBehavior.f5555T : bottomSheetBehavior.f5543G;
            default:
                return super.D();
        }
    }

    @Override // m3.l
    public final void O(int i) {
        switch (this.f546a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f547b;
                    if (sideSheetBehavior.f5740g) {
                        sideSheetBehavior.w(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f547b;
                    if (bottomSheetBehavior.f5546K) {
                        bottomSheetBehavior.I(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // m3.l
    public final void P(View view, int i, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f546a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f547b;
                WeakReference weakReference = sideSheetBehavior.f5747q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f5734a.d0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f5752v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f5734a.f(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw w.g(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f547b).y(i4);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r6 > r4.f5541E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r5.getTop() - r4.C()) < java.lang.Math.abs(r5.getTop() - r4.f5541E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r6 - r4.f5540D) < java.lang.Math.abs(r6 - r4.f5543G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r4.f5734a.H(r5) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (java.lang.Math.abs(r6 - r4.f5734a.t()) < java.lang.Math.abs(r6 - r4.f5734a.v())) goto L73;
     */
    @Override // m3.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(android.view.View r5, float r6, float r7) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.d.Q(android.view.View, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r5.canScrollVertically(-1) != false) goto L27;
     */
    @Override // m3.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b0(android.view.View r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f546a
            switch(r0) {
                case 0: goto L41;
                default: goto L5;
            }
        L5:
            A.b r3 = r3.f547b
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            int r0 = r3.f5547L
            r1 = 1
            if (r0 != r1) goto Lf
            goto L3f
        Lf:
            boolean r2 = r3.f5564b0
            if (r2 == 0) goto L14
            goto L3f
        L14:
            r2 = 3
            if (r0 != r2) goto L31
            int r0 = r3.Z
            if (r0 != r5) goto L31
            java.lang.ref.WeakReference r5 = r3.f5557V
            if (r5 == 0) goto L26
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            goto L27
        L26:
            r5 = 0
        L27:
            if (r5 == 0) goto L31
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L31
            goto L3f
        L31:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r3 = r3.f5556U
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r3.get()
            if (r3 != r4) goto L3f
            goto L40
        L3f:
            r1 = 0
        L40:
            return r1
        L41:
            A.b r3 = r3.f547b
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            int r5 = r3.h
            r0 = 0
            r1 = 1
            if (r5 != r1) goto L4c
            goto L57
        L4c:
            java.lang.ref.WeakReference r3 = r3.p
            if (r3 == 0) goto L57
            java.lang.Object r3 = r3.get()
            if (r3 != r4) goto L57
            r0 = r1
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.d.b0(android.view.View, int):boolean");
    }

    @Override // m3.l
    public final int j(View view, int i) {
        switch (this.f546a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f547b;
                return AbstractC0106b.d(i, sideSheetBehavior.f5734a.y(), sideSheetBehavior.f5734a.x());
            default:
                return view.getLeft();
        }
    }

    @Override // m3.l
    public final int k(View view, int i) {
        switch (this.f546a) {
            case 0:
                return view.getTop();
            default:
                return AbstractC0106b.d(i, ((BottomSheetBehavior) this.f547b).C(), D());
        }
    }
}
