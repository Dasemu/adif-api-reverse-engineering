package l2;

import A.j;
import G2.f;
import G2.k;
import O.X;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import m3.l;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0437a extends l {

    /* renamed from: a, reason: collision with root package name */
    public int f7360a;

    /* renamed from: b, reason: collision with root package name */
    public int f7361b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f7362c;

    public C0437a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f7362c = swipeDismissBehavior;
    }

    @Override // m3.l
    public final int C(View view) {
        return view.getWidth();
    }

    @Override // m3.l
    public final void N(View view, int i) {
        this.f7361b = i;
        this.f7360a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f7362c;
            swipeDismissBehavior.f5533d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f5533d = false;
        }
    }

    @Override // m3.l
    public final void O(int i) {
        f fVar = this.f7362c.f5531b;
        if (fVar != null) {
            k kVar = fVar.f583a;
            if (i == 0) {
                j.h().n(kVar.f619u);
            } else if (i == 1 || i == 2) {
                j.h().m(kVar.f619u);
            }
        }
    }

    @Override // m3.l
    public final void P(View view, int i, int i4) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f7362c;
        float f2 = width * swipeDismissBehavior.f5535f;
        float width2 = view.getWidth() * swipeDismissBehavior.f5536g;
        float abs = Math.abs(i - this.f7360a);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        } else {
            view.setAlpha(Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f7360a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // m3.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f7361b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.f7362c
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = O.X.f1226a
            int r5 = r9.getLayoutDirection()
            if (r5 != r3) goto L1a
            r5 = r3
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r2.f5534e
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L2a:
            if (r1 <= 0) goto L66
            goto L52
        L2d:
            if (r6 != r3) goto L66
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L66
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f7360a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L66
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f7360a
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L69
        L61:
            int r8 = r8.f7360a
            int r0 = r8 - r11
            goto L69
        L66:
            int r0 = r8.f7360a
            r3 = r4
        L69:
            X.d r8 = r2.f5530a
            int r10 = r9.getTop()
            boolean r8 = r8.o(r0, r10)
            if (r8 == 0) goto L80
            l2.b r8 = new l2.b
            r8.<init>(r2, r9, r3)
            java.util.WeakHashMap r10 = O.X.f1226a
            r9.postOnAnimation(r8)
            return
        L80:
            if (r3 == 0) goto L89
            G2.f r8 = r2.f5531b
            if (r8 == 0) goto L89
            r8.a(r9)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.C0437a.Q(android.view.View, float, float):void");
    }

    @Override // m3.l
    public final boolean b0(View view, int i) {
        int i4 = this.f7361b;
        return (i4 == -1 || i4 == i) && this.f7362c.v(view);
    }

    @Override // m3.l
    public final int j(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = X.f1226a;
        boolean z3 = view.getLayoutDirection() == 1;
        int i4 = this.f7362c.f5534e;
        if (i4 == 0) {
            if (z3) {
                width = this.f7360a - view.getWidth();
                width2 = this.f7360a;
            } else {
                width = this.f7360a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i4 != 1) {
            width = this.f7360a - view.getWidth();
            width2 = this.f7360a + view.getWidth();
        } else if (z3) {
            width = this.f7360a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f7360a - view.getWidth();
            width2 = this.f7360a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // m3.l
    public final int k(View view, int i) {
        return view.getTop();
    }
}
