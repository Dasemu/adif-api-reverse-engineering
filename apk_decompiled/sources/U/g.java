package U;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.messaging.ServiceStarter;
import m.C0475m0;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f1740r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f1741a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f1742b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f1743c;

    /* renamed from: d, reason: collision with root package name */
    public F0.c f1744d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f1745e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f1746f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1747g;
    public final int h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f1748j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f1749k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1750l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1751m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1752n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1753o;
    public boolean p;

    /* renamed from: q, reason: collision with root package name */
    public final C0475m0 f1754q;

    /* JADX WARN: Type inference failed for: r1v0, types: [U.a, java.lang.Object] */
    public g(C0475m0 c0475m0) {
        ?? obj = new Object();
        obj.f1737e = Long.MIN_VALUE;
        obj.f1739g = -1L;
        obj.f1738f = 0L;
        this.f1741a = obj;
        this.f1742b = new AccelerateInterpolator();
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.f1745e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1746f = fArr2;
        float[] fArr3 = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.i = fArr3;
        float[] fArr4 = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.f1748j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1749k = fArr5;
        this.f1743c = c0475m0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.f1747g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = f1740r;
        obj.f1733a = ServiceStarter.ERROR_UNKNOWN;
        obj.f1734b = ServiceStarter.ERROR_UNKNOWN;
        this.f1754q = c0475m0;
    }

    public static float b(float f2, float f4, float f5) {
        return f2 > f5 ? f5 : f2 < f4 ? f4 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1745e
            r0 = r0[r4]
            float[] r1 = r3.f1746f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f1742b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.i
            r0 = r0[r4]
            float[] r1 = r3.f1748j
            r1 = r1[r4]
            float[] r3 = r3.f1749k
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r3 = b(r5, r1, r3)
            return r3
        L51:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U.g.a(int, float, float, float):float");
    }

    public final float c(float f2, float f4) {
        if (f4 != BitmapDescriptorFactory.HUE_RED) {
            int i = this.f1747g;
            if (i == 0 || i == 1) {
                if (f2 < f4) {
                    if (f2 >= BitmapDescriptorFactory.HUE_RED) {
                        return 1.0f - (f2 / f4);
                    }
                    if (this.f1753o && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f2 < BitmapDescriptorFactory.HUE_RED) {
                return f2 / (-f4);
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final void d() {
        int i = 0;
        if (this.f1751m) {
            this.f1753o = false;
            return;
        }
        a aVar = this.f1741a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i4 = (int) (currentAnimationTimeMillis - aVar.f1737e);
        int i5 = aVar.f1734b;
        if (i4 > i5) {
            i = i5;
        } else if (i4 >= 0) {
            i = i4;
        }
        aVar.i = i;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f1739g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C0475m0 c0475m0;
        int count;
        a aVar = this.f1741a;
        float f2 = aVar.f1736d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f1735c);
        if (abs != 0 && (count = (c0475m0 = this.f1754q).getCount()) != 0) {
            int childCount = c0475m0.getChildCount();
            int firstVisiblePosition = c0475m0.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c0475m0.getChildAt(0).getTop() >= 0)) : !(i >= count && c0475m0.getChildAt(childCount - 1).getBottom() <= c0475m0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r1 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 2
            boolean r1 = r7.p
            r2 = 0
            if (r1 != 0) goto L8
            goto L7c
        L8:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r0) goto L1f
            r8 = 3
            if (r1 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r2
        L1b:
            r7.f1752n = r3
            r7.f1750l = r2
        L1f:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.widget.ListView r5 = r7.f1743c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r2, r1, r4, r6)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r3, r9, r8, r4)
            U.a r9 = r7.f1741a
            r9.f1735c = r1
            r9.f1736d = r8
            boolean r8 = r7.f1753o
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            F0.c r8 = r7.f1744d
            if (r8 != 0) goto L60
            F0.c r8 = new F0.c
            r8.<init>(r7, r0)
            r7.f1744d = r8
        L60:
            r7.f1753o = r3
            r7.f1751m = r3
            boolean r8 = r7.f1750l
            if (r8 != 0) goto L75
            int r8 = r7.h
            if (r8 <= 0) goto L75
            F0.c r9 = r7.f1744d
            long r0 = (long) r8
            java.util.WeakHashMap r8 = O.X.f1226a
            r5.postOnAnimationDelayed(r9, r0)
            goto L7a
        L75:
            F0.c r8 = r7.f1744d
            r8.run()
        L7a:
            r7.f1750l = r3
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
